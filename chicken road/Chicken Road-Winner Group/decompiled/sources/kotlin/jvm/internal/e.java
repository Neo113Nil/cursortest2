package kotlin.jvm.internal;

import d2.C0274d;
import e2.AbstractC0293h;
import e2.AbstractC0294i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o2.u;
import o2.v;
import o2.w;

/* loaded from: classes.dex */
public final class e implements t2.c, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9663b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9664c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f9665d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f9666a;

    static {
        List S2 = AbstractC0293h.S(o2.a.class, o2.l.class, o2.p.class, o2.q.class, o2.r.class, o2.s.class, o2.t.class, u.class, v.class, w.class, o2.b.class, o2.c.class, o2.d.class, o2.e.class, o2.f.class, o2.g.class, o2.h.class, o2.i.class, o2.j.class, o2.k.class, o2.m.class, o2.n.class, o2.o.class);
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(S2));
        int i3 = 0;
        for (Object obj : S2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0293h.T();
                throw null;
            }
            arrayList.add(new C0274d((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f9663b = e2.r.p0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
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
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(v2.m.s0(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f9663b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f9664c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2.s.j0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            j.b(str2);
            linkedHashMap.put(key, v2.m.s0(str2, str2));
        }
        f9665d = linkedHashMap;
    }

    public e(Class jClass) {
        j.e(jClass, "jClass");
        this.f9666a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f9666a;
    }

    public final String b() {
        String str;
        Class jClass = this.f9666a;
        j.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f9665d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return v2.m.r0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return v2.m.r0(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && F2.b.x(this).equals(F2.b.x((t2.c) obj));
    }

    public final int hashCode() {
        return F2.b.x(this).hashCode();
    }

    public final String toString() {
        return this.f9666a + " (Kotlin reflection is not available)";
    }
}
