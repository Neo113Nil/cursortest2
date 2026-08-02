package W1;

import ed.C6347c;
import ed.InterfaceC6346b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {
    @NotNull
    public static final Object[] a(int i11, Class cls) {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            int i12 = 0;
            boolean z11 = false;
            Constructor<?> constructor2 = null;
            while (true) {
                if (i12 < length) {
                    Constructor<?> constructor3 = constructors[i12];
                    if (constructor3.getParameterTypes().length == 0) {
                        if (z11) {
                            break;
                        }
                        z11 = true;
                        constructor2 = constructor3;
                    }
                    i12++;
                } else if (z11) {
                    constructor = constructor2;
                }
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            X1.a aVar = (X1.a) newInstance;
            if (i11 >= 0) {
                List a02 = C7714v.a0(l.f(aVar.a(), i11));
                ArrayList arrayList = new ArrayList(C7714v.z(a02, 10));
                Iterator it = a02.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(it.next()));
                }
                return arrayList.toArray(new Object[0]);
            }
            Sequence a11 = aVar.a();
            int count = aVar.getCount();
            Iterator it2 = a11.iterator();
            Object[] objArr = new Object[count];
            for (int i13 = 0; i13 < count; i13++) {
                objArr[i13] = it2.next();
            }
            return objArr;
        } catch (C6347c unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    private static final Object b(Object obj) {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof InterfaceC6346b) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
