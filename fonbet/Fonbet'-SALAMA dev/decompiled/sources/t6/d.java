package t6;

import f6.C1111d;
import g6.AbstractC1160i;
import g6.AbstractC1161j;
import g6.AbstractC1170s;
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

/* loaded from: classes2.dex */
public final class d implements A6.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f16461b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f16462c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f16463d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f16464a;

    static {
        List M02 = AbstractC1160i.M0(s6.a.class, Function1.class, Function2.class, s6.o.class, s6.p.class, s6.q.class, s6.r.class, s6.s.class, t.class, u.class, s6.b.class, s6.c.class, s6.d.class, s6.e.class, s6.f.class, s6.g.class, s6.h.class, s6.i.class, s6.j.class, s6.k.class, s6.l.class, s6.m.class, s6.n.class);
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(M02));
        int i7 = 0;
        for (Object obj : M02) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C1111d((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f16461b = AbstractC1170s.P0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put(ProfileMeasurement.UNIT_BYTES, "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(C6.o.D0(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f16461b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f16462c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1170s.K0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, C6.o.D0(str2, str2));
        }
        f16463d = linkedHashMap;
    }

    public d(Class cls) {
        h.e(cls, "jClass");
        this.f16464a = cls;
    }

    @Override // t6.c
    public final Class a() {
        return this.f16464a;
    }

    public final String b() {
        String str;
        Class cls = this.f16464a;
        h.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f16463d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
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
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && r6.a.c(this).equals(r6.a.c((A6.b) obj));
    }

    public final int hashCode() {
        return r6.a.c(this).hashCode();
    }

    public final String toString() {
        return this.f16464a + " (Kotlin reflection is not available)";
    }
}
