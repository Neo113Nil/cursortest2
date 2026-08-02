package W1;

import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import U7.d;
import android.util.Log;
import ed.C6345a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kd.C7665d;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    private static Method a(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        boolean z11 = false;
        int i11 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                method = null;
                break;
            }
            method = methodArr[i11];
            if (!Intrinsics.d(str, method.getName())) {
                if (!h.e0(method.getName(), str + '-', z11)) {
                    continue;
                    i11++;
                    z11 = false;
                }
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            if (parameterTypes.length == clsArr2.length) {
                ArrayList arrayList = new ArrayList(parameterTypes.length);
                int length2 = parameterTypes.length;
                boolean z12 = z11;
                ?? r12 = z12;
                for (?? r11 = z12; r11 < length2; r11++) {
                    Class<?> cls = parameterTypes[r11];
                    int i12 = r12 + 1;
                    Class<?> cls2 = clsArr2[r12];
                    arrayList.add(Boolean.valueOf(C6345a.e(cls).equals(C6345a.e(cls2)) || cls.isAssignableFrom(cls2)));
                    r12 = i12;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            continue;
            i11++;
            z11 = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(d.e(str, " not found"));
    }

    private static Method b(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i11++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange o11 = kotlin.ranges.h.o(0, ceil);
                ArrayList arrayList2 = new ArrayList(C7714v.z(o11, 10));
                C7665d it = o11.iterator();
                while (it.hasNext()) {
                    it.b();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                S s11 = new S(3);
                s11.b(clsArr);
                s11.a(InterfaceC3967k.class);
                s11.b(clsArr2);
                return a(declaredMethods, str, (Class[]) s11.d(new Class[s11.c()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!Intrinsics.d(method.getName(), str)) {
                        if (!h.e0(method.getName(), str + '-', false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    public static void c(@NotNull String str, @NotNull String str2, @NotNull InterfaceC3967k interfaceC3967k, @NotNull Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method b11 = b(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (b11 != null) {
                b11.setAccessible(true);
                if (Modifier.isStatic(b11.getModifiers())) {
                    d(b11, null, interfaceC3967k, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    d(b11, cls.getConstructor(new Class[0]).newInstance(new Object[0]), interfaceC3967k, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e11) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e11;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void d(Method method, Object obj, InterfaceC3967k interfaceC3967k, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i11 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (Intrinsics.d(parameterTypes[length], InterfaceC3967k.class)) {
                    i11 = length;
                    break;
                } else if (i12 < 0) {
                    break;
                } else {
                    length = i12;
                }
            }
        }
        int i13 = i11 + 1;
        int ceil = (i11 == 0 ? 1 : (int) Math.ceil(((obj != null ? 1 : 0) + i11) / 10.0d)) + i13;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) Math.ceil(i11 / 31.0d) : 0) + ceil != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            if (i14 < 0 || i14 >= i11) {
                if (i14 == i11) {
                    obj2 = interfaceC3967k;
                } else if (i13 <= i14 && i14 < ceil) {
                    obj2 = 0;
                } else {
                    if (ceil > i14 || i14 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    obj2 = 2097151;
                }
            } else if (i14 < 0 || i14 > C7705l.I(objArr)) {
                String name = method.getParameterTypes()[i14].getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = Double.valueOf(0.0d);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            obj2 = 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = (char) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            obj2 = 0L;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            obj2 = Float.valueOf(0.0f);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                obj2 = objArr[i14];
            }
            objArr2[i14] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }
}
