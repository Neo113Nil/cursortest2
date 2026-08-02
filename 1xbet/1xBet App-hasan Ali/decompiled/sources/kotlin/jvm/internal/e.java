package kotlin.jvm.internal;

import i4.InterfaceC2015a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.AbstractC2036a;
import m4.InterfaceC2100c;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class e implements InterfaceC2100c, d {

    /* renamed from: l, reason: collision with root package name */
    public static final Map f17612l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f17613m;

    /* renamed from: n, reason: collision with root package name */
    public static final LinkedHashMap f17614n;

    /* renamed from: k, reason: collision with root package name */
    public final Class f17615k;

    static {
        int i = 0;
        List O5 = X3.n.O(InterfaceC2015a.class, i4.c.class, i4.e.class, i4.f.class, i4.g.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, i4.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, i4.d.class);
        ArrayList arrayList = new ArrayList(X3.o.S(O5, 10));
        int i5 = 0;
        for (Object obj : O5) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                X3.n.R();
                throw null;
            }
            arrayList.add(new W3.h((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        Map map = X3.w.f6091k;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(X3.z.R(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    W3.h hVar = (W3.h) obj2;
                    map.put(hVar.f6036k, hVar.f6037l);
                }
            } else {
                W3.h hVar2 = (W3.h) arrayList.get(0);
                l.f("pair", hVar2);
                map = Collections.singletonMap(hVar2.f6036k, hVar2.f6037l);
                l.e("singletonMap(...)", map);
            }
        }
        f17612l = map;
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
        l.e("<get-values>(...)", values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            l.c(str);
            sb.append(AbstractC2227e.N0(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f17612l.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f17613m = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X3.z.R(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            l.c(str2);
            linkedHashMap.put(key, AbstractC2227e.N0(str2, '.', str2));
        }
        f17614n = linkedHashMap;
    }

    public e(Class cls) {
        l.f("jClass", cls);
        this.f17615k = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f17615k;
    }

    public final String b() {
        String str;
        Class cls = this.f17615k;
        l.f("jClass", cls);
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f17614n;
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
            return AbstractC2227e.M0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC2227e.M0(simpleName, enclosingConstructor.getName() + '$');
        }
        int F02 = AbstractC2227e.F0(simpleName, '$', 0, 6);
        if (F02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(F02 + 1, simpleName.length());
        l.e("substring(...)", substring);
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && AbstractC2036a.A(this).equals(AbstractC2036a.A((InterfaceC2100c) obj));
    }

    public final int hashCode() {
        return AbstractC2036a.A(this).hashCode();
    }

    public final String toString() {
        return this.f17615k + " (Kotlin reflection is not available)";
    }
}
