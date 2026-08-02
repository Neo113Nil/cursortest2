package Cd;

import ae.EnumC5003e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ArrayList f4733a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ArrayList f4734b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f4735c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4736d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.f> f4737e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Set<String> f4738f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a.C0116a f4739g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f4740h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4741i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final HashSet f4742j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4743k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4744l = 0;

    public static final class a {

        /* renamed from: Cd.Q$a$a, reason: collision with other inner class name */
        public static final class C0116a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f4745a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final Sd.f f4746b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f4747c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final String f4748d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f4749e;

            public C0116a(@NotNull String internalName, @NotNull Sd.f name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(internalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.f4745a = internalName;
                this.f4746b = name;
                this.f4747c = parameters;
                this.f4748d = returnType;
                String jvmDescriptor = name + '(' + parameters + ')' + returnType;
                Intrinsics.checkNotNullParameter(internalName, "internalName");
                Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
                this.f4749e = internalName + '.' + jvmDescriptor;
            }

            public static C0116a a(C0116a c0116a, Sd.f name) {
                String classInternalName = c0116a.f4745a;
                String parameters = c0116a.f4747c;
                String returnType = c0116a.f4748d;
                c0116a.getClass();
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new C0116a(classInternalName, name, parameters, returnType);
            }

            @NotNull
            public final Sd.f b() {
                return this.f4746b;
            }

            @NotNull
            public final String c() {
                return this.f4749e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0116a)) {
                    return false;
                }
                C0116a c0116a = (C0116a) obj;
                return Intrinsics.d(this.f4745a, c0116a.f4745a) && Intrinsics.d(this.f4746b, c0116a.f4746b) && Intrinsics.d(this.f4747c, c0116a.f4747c) && Intrinsics.d(this.f4748d, c0116a.f4748d);
            }

            public final int hashCode() {
                return this.f4748d.hashCode() + G.g.a((this.f4746b.hashCode() + (this.f4745a.hashCode() * 31)) * 31, 31, this.f4747c);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
                sb2.append(this.f4745a);
                sb2.append(", name=");
                sb2.append(this.f4746b);
                sb2.append(", parameters=");
                sb2.append(this.f4747c);
                sb2.append(", returnType=");
                return B3.D.c(sb2, this.f4748d, ')');
            }
        }

        public static final C0116a a(String str, String str2, String str3, String str4) {
            int i11 = Q.f4744l;
            Sd.f f7 = Sd.f.f(str2);
            Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
            return new C0116a(str, f7, str3, str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b OBJECT_PARAMETER_GENERIC;
        public static final b OBJECT_PARAMETER_NON_GENERIC;
        public static final b ONE_COLLECTION_PARAMETER;
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        static {
            b bVar = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
            ONE_COLLECTION_PARAMETER = bVar;
            b bVar2 = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
            OBJECT_PARAMETER_NON_GENERIC = bVar2;
            b bVar3 = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
            OBJECT_PARAMETER_GENERIC = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, String str2, boolean z11) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c FALSE;
        public static final c INDEX;
        public static final c MAP_GET_OR_DEFAULT;
        public static final c NULL;
        private final Object defaultValue;

        static final class a extends c {
        }

        static {
            c cVar = new c("NULL", 0, null);
            NULL = cVar;
            c cVar2 = new c("INDEX", 1, -1);
            INDEX = cVar2;
            c cVar3 = new c("FALSE", 2, Boolean.FALSE);
            FALSE = cVar3;
            a aVar = new a();
            MAP_GET_OR_DEFAULT = aVar;
            c[] cVarArr = {cVar, cVar2, cVar3, aVar};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        public /* synthetic */ c() {
            this("MAP_GET_OR_DEFAULT", 3, null);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i11, Object obj) {
            this.defaultValue = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Map] */
    static {
        String[] elements = {"containsAll", "removeAll", "retainAll"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> j02 = C7705l.j0(elements);
        ArrayList arrayList = new ArrayList(C7714v.z(j02, 10));
        for (String str : j02) {
            String e11 = EnumC5003e.BOOLEAN.e();
            Intrinsics.checkNotNullExpressionValue(e11, "getDesc(...)");
            arrayList.add(a.a("java/util/Collection", str, "Ljava/util/Collection;", e11));
        }
        f4733a = arrayList;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0116a) it.next()).c());
        }
        f4734b = arrayList2;
        ArrayList arrayList3 = f4733a;
        ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0116a) it2.next()).b().b());
        }
        String g10 = Ld.G.g("Collection");
        EnumC5003e enumC5003e = EnumC5003e.BOOLEAN;
        String e12 = enumC5003e.e();
        Intrinsics.checkNotNullExpressionValue(e12, "getDesc(...)");
        a.C0116a a11 = a.a(g10, "contains", "Ljava/lang/Object;", e12);
        c cVar = c.FALSE;
        Pair pair = new Pair(a11, cVar);
        String g11 = Ld.G.g("Collection");
        String e13 = enumC5003e.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getDesc(...)");
        Pair pair2 = new Pair(a.a(g11, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", e13), cVar);
        String g12 = Ld.G.g("Map");
        String e14 = enumC5003e.e();
        Intrinsics.checkNotNullExpressionValue(e14, "getDesc(...)");
        Pair pair3 = new Pair(a.a(g12, "containsKey", "Ljava/lang/Object;", e14), cVar);
        String g13 = Ld.G.g("Map");
        String e15 = enumC5003e.e();
        Intrinsics.checkNotNullExpressionValue(e15, "getDesc(...)");
        Pair pair4 = new Pair(a.a(g13, "containsValue", "Ljava/lang/Object;", e15), cVar);
        String g14 = Ld.G.g("Map");
        String e16 = enumC5003e.e();
        Intrinsics.checkNotNullExpressionValue(e16, "getDesc(...)");
        Pair pair5 = new Pair(a.a(g14, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;Ljava/lang/Object;", e16), cVar);
        Pair pair6 = new Pair(a.a(Ld.G.g("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C0116a a12 = a.a(Ld.G.g("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        Pair pair7 = new Pair(a12, cVar2);
        Pair pair8 = new Pair(a.a(Ld.G.g("Map"), ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String g15 = Ld.G.g("List");
        EnumC5003e enumC5003e2 = EnumC5003e.INT;
        String e17 = enumC5003e2.e();
        Intrinsics.checkNotNullExpressionValue(e17, "getDesc(...)");
        a.C0116a a13 = a.a(g15, "indexOf", "Ljava/lang/Object;", e17);
        c cVar3 = c.INDEX;
        Pair pair9 = new Pair(a13, cVar3);
        String g16 = Ld.G.g("List");
        String e18 = enumC5003e2.e();
        Intrinsics.checkNotNullExpressionValue(e18, "getDesc(...)");
        Map j11 = U.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(a.a(g16, "lastIndexOf", "Ljava/lang/Object;", e18), cVar3));
        f4735c = j11;
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(j11.size()));
        for (Map.Entry entry : j11.entrySet()) {
            linkedHashMap.put(((a.C0116a) entry.getKey()).c(), entry.getValue());
        }
        f4736d = linkedHashMap;
        LinkedHashSet f7 = e0.f(f4735c.keySet(), f4733a);
        ArrayList arrayList5 = new ArrayList(C7714v.z(f7, 10));
        Iterator it3 = f7.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a.C0116a) it3.next()).b());
        }
        f4737e = C7714v.Y0(arrayList5);
        ArrayList arrayList6 = new ArrayList(C7714v.z(f7, 10));
        Iterator it4 = f7.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a.C0116a) it4.next()).c());
        }
        f4738f = C7714v.Y0(arrayList6);
        EnumC5003e enumC5003e3 = EnumC5003e.INT;
        String e19 = enumC5003e3.e();
        Intrinsics.checkNotNullExpressionValue(e19, "getDesc(...)");
        a.C0116a a14 = a.a("java/util/List", "removeAt", e19, "Ljava/lang/Object;");
        f4739g = a14;
        String f11 = Ld.G.f("Number");
        String e21 = EnumC5003e.BYTE.e();
        Intrinsics.checkNotNullExpressionValue(e21, "getDesc(...)");
        Pair pair10 = new Pair(a.a(f11, "toByte", "", e21), Sd.f.f("byteValue"));
        String f12 = Ld.G.f("Number");
        String e22 = EnumC5003e.SHORT.e();
        Intrinsics.checkNotNullExpressionValue(e22, "getDesc(...)");
        Pair pair11 = new Pair(a.a(f12, "toShort", "", e22), Sd.f.f("shortValue"));
        String f13 = Ld.G.f("Number");
        String e23 = enumC5003e3.e();
        Intrinsics.checkNotNullExpressionValue(e23, "getDesc(...)");
        Pair pair12 = new Pair(a.a(f13, "toInt", "", e23), Sd.f.f("intValue"));
        String f14 = Ld.G.f("Number");
        String e24 = EnumC5003e.LONG.e();
        Intrinsics.checkNotNullExpressionValue(e24, "getDesc(...)");
        Pair pair13 = new Pair(a.a(f14, "toLong", "", e24), Sd.f.f("longValue"));
        String f15 = Ld.G.f("Number");
        String e25 = EnumC5003e.FLOAT.e();
        Intrinsics.checkNotNullExpressionValue(e25, "getDesc(...)");
        Pair pair14 = new Pair(a.a(f15, "toFloat", "", e25), Sd.f.f("floatValue"));
        String f16 = Ld.G.f("Number");
        String e26 = EnumC5003e.DOUBLE.e();
        Intrinsics.checkNotNullExpressionValue(e26, "getDesc(...)");
        Pair pair15 = new Pair(a.a(f16, "toDouble", "", e26), Sd.f.f("doubleValue"));
        Pair pair16 = new Pair(a14, Sd.f.f(ProductAction.ACTION_REMOVE));
        String f17 = Ld.G.f("CharSequence");
        String e27 = enumC5003e3.e();
        Intrinsics.checkNotNullExpressionValue(e27, "getDesc(...)");
        String e28 = EnumC5003e.CHAR.e();
        Intrinsics.checkNotNullExpressionValue(e28, "getDesc(...)");
        Map j12 = U.j(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(a.a(f17, "get", e27, e28), Sd.f.f("charAt")));
        f4740h = j12;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(j12.size()));
        for (Map.Entry entry2 : j12.entrySet()) {
            linkedHashMap2.put(((a.C0116a) entry2.getKey()).c(), entry2.getValue());
        }
        f4741i = linkedHashMap2;
        ?? r02 = f4740h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            linkedHashSet.add(a.C0116a.a((a.C0116a) entry3.getKey(), (Sd.f) entry3.getValue()).c());
        }
        Set keySet = f4740h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0116a) it5.next()).b());
        }
        f4742j = hashSet;
        Set<Map.Entry> entrySet = f4740h.entrySet();
        ArrayList arrayList7 = new ArrayList(C7714v.z(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new Pair(((a.C0116a) entry4.getKey()).b(), entry4.getValue()));
        }
        int h11 = U.h(C7714v.z(arrayList7, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(h11);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((Sd.f) pair17.f(), (Sd.f) pair17.e());
        }
        f4743k = linkedHashMap3;
    }
}
