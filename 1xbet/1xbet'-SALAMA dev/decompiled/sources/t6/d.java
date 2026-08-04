package t6;

import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s6.t;
import s6.u;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements A6.b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f16467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f16468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f16469d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16470a;

    static {
        List listM0 = p050g6.i.M0(s6.a.class, Function1.class, Function2.class, s6.o.class, s6.p.class, s6.q.class, s6.r.class, s6.s.class, t.class, u.class, s6.b.class, s6.c.class, s6.d.class, s6.e.class, s6.f.class, s6.g.class, s6.h.class, s6.i.class, s6.j.class, s6.k.class, s6.l.class, s6.m.class, s6.n.class);
        ArrayList arrayList = new ArrayList(p050g6.j.N0(listM0));
        int i7 = 0;
        for (Object obj : listM0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new p044f6.d((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f16467b = p050g6.s.P0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put(ProfileMeasurement.UNIT_BYTES, "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        h.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(C6.o.D0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f16467b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f16468c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p050g6.s.K0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, C6.o.D0(str2, str2));
        }
        f16469d = linkedHashMap;
    }

    public d(Class cls) {
        h.e(cls, "jClass");
        this.f16470a = cls;
    }

    @Override // t6.c
    public final Class a() {
        return this.f16470a;
    }

    public final String b() {
        String str;
        Class cls = this.f16470a;
        h.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f16469d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C6.o.C0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return C6.o.C0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iIndexOf = simpleName.indexOf(36, 0);
        if (iIndexOf == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iIndexOf + 1, simpleName.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && r6.a.c(this).equals(r6.a.c((A6.b) obj));
    }

    public final int hashCode() {
        return r6.a.c(this).hashCode();
    }

    public final String toString() {
        return this.f16470a + " (Kotlin reflection is not available)";
    }
}
