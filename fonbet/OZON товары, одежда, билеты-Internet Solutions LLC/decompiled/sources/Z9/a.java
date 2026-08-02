package Z9;

import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.F;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.i;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import com.squareup.moshi.n;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.d;
import kotlin.reflect.f;
import kotlin.reflect.h;
import kotlin.reflect.k;
import kotlin.reflect.l;
import kotlin.reflect.o;
import kotlin.reflect.q;
import kotlin.reflect.r;
import ld.C7924e;
import md.C8128a;
import md.C8130c;
import nd.C8545j0;
import nd.X;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9844j;
import td.InterfaceC9857w;

/* loaded from: classes.dex */
public final class a implements JsonAdapter.a {
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0235, code lost:
    
        if (r7 == null) goto L115;
     */
    @Override // com.squareup.moshi.JsonAdapter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Object obj;
        Object obj2;
        String name;
        Type type2;
        Object obj3;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (annotations.isEmpty()) {
            Class<?> a11 = F.a(type);
            if (!a11.isInterface() && !a11.isEnum() && a11.isAnnotationPresent(Metadata.class) && !c.i(a11)) {
                try {
                    JsonAdapter<?> c11 = c.c(moshi, type, a11);
                    if (c11 != null) {
                        return c11;
                    }
                } catch (RuntimeException e11) {
                    if (!(e11.getCause() instanceof ClassNotFoundException)) {
                        throw e11;
                    }
                }
                if (a11.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class or object expression ".concat(a11.getName()).toString());
                }
                Intrinsics.checkNotNullParameter(a11, "<this>");
                d b11 = N.b(a11);
                if (b11.isAbstract()) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(a11.getName()).toString());
                }
                if (b11.g()) {
                    throw new IllegalArgumentException("Cannot serialize inner class ".concat(a11.getName()).toString());
                }
                if (b11.v() != null) {
                    throw new IllegalArgumentException("Cannot serialize object declaration ".concat(a11.getName()).toString());
                }
                if (b11.n()) {
                    throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + a11.getName() + ". Please register an adapter.").toString());
                }
                Intrinsics.checkNotNullParameter(b11, "<this>");
                Iterator it = ((X) b11).M().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    h hVar = (h) obj;
                    Intrinsics.g(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                    InterfaceC9857w t2 = ((C8545j0) hVar).t();
                    Intrinsics.g(t2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                    if (((InterfaceC9844j) t2).k0()) {
                        break;
                    }
                }
                h hVar2 = (h) obj;
                if (hVar2 != null) {
                    List<l> parameters = hVar2.getParameters();
                    int h11 = U.h(C7714v.z(parameters, 10));
                    if (h11 < 16) {
                        h11 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                    for (Object obj4 : parameters) {
                        linkedHashMap.put(((l) obj4).getName(), obj4);
                    }
                    boolean z11 = true;
                    C8128a.b(hVar2, true);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it2 = C7924e.a(b11).iterator();
                    while (it2.hasNext()) {
                        o oVar = (o) it2.next();
                        l lVar = (l) linkedHashMap.get(oVar.getName());
                        C8128a.b(oVar, z11);
                        Iterator<T> it3 = oVar.getAnnotations().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (((Annotation) obj2) instanceof i) {
                                break;
                            }
                        }
                        i iVar = (i) obj2;
                        ArrayList W02 = C7714v.W0(oVar.getAnnotations());
                        if (lVar != null) {
                            C7714v.p(lVar.getAnnotations(), W02);
                            if (iVar == null) {
                                Iterator<T> it4 = lVar.getAnnotations().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it4.next();
                                    if (((Annotation) obj3) instanceof i) {
                                        break;
                                    }
                                }
                                iVar = (i) obj3;
                            }
                        }
                        Field a12 = C8130c.a(oVar);
                        if (Modifier.isTransient(a12 != null ? a12.getModifiers() : 0)) {
                            if (lVar != null && !lVar.j()) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + lVar).toString());
                            }
                        } else if (iVar == null || iVar.ignore() != z11) {
                            if (lVar != null && !lVar.getType().equals(oVar.getReturnType())) {
                                throw new IllegalArgumentException(("'" + oVar.getName() + "' has a constructor parameter of type " + lVar.getType() + " but a property of type " + oVar.getReturnType() + '.').toString());
                            }
                            if ((oVar instanceof k) || lVar != null) {
                                if (iVar != null && (name = iVar.name()) != null) {
                                    if (name.equals("\u0000")) {
                                        name = null;
                                    }
                                }
                                name = oVar.getName();
                                String str = name;
                                f d11 = oVar.getReturnType().d();
                                if (d11 instanceof d) {
                                    d dVar = (d) d11;
                                    if (dVar.s()) {
                                        Class b12 = C6345a.b(dVar);
                                        type2 = b12;
                                        if (!oVar.getReturnType().e().isEmpty()) {
                                            List<KTypeProjection> e12 = oVar.getReturnType().e();
                                            ArrayList arrayList = new ArrayList();
                                            Iterator<T> it5 = e12.iterator();
                                            while (it5.hasNext()) {
                                                q c12 = ((KTypeProjection) it5.next()).c();
                                                Type c13 = c12 != null ? C8130c.c(c12) : null;
                                                if (c13 != null) {
                                                    arrayList.add(c13);
                                                }
                                            }
                                            Object[] array = arrayList.toArray(new Type[0]);
                                            Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                            Type[] typeArr = (Type[]) array;
                                            type2 = D.e(b12, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                        }
                                    } else {
                                        type2 = C8130c.c(oVar.getReturnType());
                                    }
                                } else {
                                    if (!(d11 instanceof r)) {
                                        throw new IllegalStateException("Not possible!");
                                    }
                                    type2 = C8130c.c(oVar.getReturnType());
                                }
                                Type l11 = c.l(type2, a11, type);
                                Object[] array2 = W02.toArray(new Annotation[0]);
                                Intrinsics.g(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                linkedHashMap2.put(oVar.getName(), new KotlinJsonAdapter.a(str, moshi.f(l11, c.g((Annotation[]) array2), oVar.getName()), oVar, lVar, lVar != null ? lVar.getIndex() : -1));
                                z11 = true;
                            }
                        } else if (lVar != null && !lVar.j()) {
                            throw new IllegalArgumentException(("No default value for ignored constructor " + lVar).toString());
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (l lVar2 : hVar2.getParameters()) {
                        KotlinJsonAdapter.a aVar = (KotlinJsonAdapter.a) kotlin.jvm.internal.U.d(linkedHashMap2).remove(lVar2.getName());
                        if (aVar == null && !lVar2.j()) {
                            throw new IllegalArgumentException(("No property for required constructor " + lVar2).toString());
                        }
                        arrayList2.add(aVar);
                    }
                    int size = arrayList2.size();
                    Iterator it6 = linkedHashMap2.entrySet().iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(KotlinJsonAdapter.a.a((KotlinJsonAdapter.a) ((Map.Entry) it6.next()).getValue(), size));
                        size++;
                    }
                    ArrayList I11 = C7714v.I(arrayList2);
                    ArrayList arrayList3 = new ArrayList(C7714v.z(I11, 10));
                    Iterator it7 = I11.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(((KotlinJsonAdapter.a) it7.next()).d());
                    }
                    Object[] array3 = arrayList3.toArray(new String[0]);
                    Intrinsics.g(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr = (String[]) array3;
                    return new KotlinJsonAdapter(hVar2, arrayList2, I11, n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length))).nullSafe();
                }
            }
        }
        return null;
    }
}
