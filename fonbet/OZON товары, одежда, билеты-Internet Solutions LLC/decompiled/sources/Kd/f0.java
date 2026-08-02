package Kd;

import ae.EnumC5003e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f15890a = new LinkedHashMap();

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f15891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f15892b;

        /* renamed from: Kd.f0$a$a, reason: collision with other inner class name */
        public final class C0302a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f15893a;

            /* renamed from: b, reason: collision with root package name */
            private final String f15894b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final ArrayList f15895c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private Pair<String, j0> f15896d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f15897e;

            public C0302a(@NotNull a aVar, String functionName, String str) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f15897e = aVar;
                this.f15893a = functionName;
                this.f15894b = str;
                this.f15895c = new ArrayList();
                this.f15896d = new Pair<>("V", null);
            }

            @NotNull
            public final Pair<String, Y> a() {
                String b11 = this.f15897e.b();
                ArrayList arrayList = this.f15895c;
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) ((Pair) it.next()).e());
                }
                String i11 = Ld.G.i(b11, Ld.G.h(this.f15893a, this.f15896d.e(), arrayList2));
                j0 f7 = this.f15896d.f();
                ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((j0) ((Pair) it2.next()).f());
                }
                return new Pair<>(i11, new Y(f7, arrayList3, this.f15894b));
            }

            public final void b(@NotNull String type, @NotNull C3511h... qualifiers) {
                j0 j0Var;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                ArrayList arrayList = this.f15895c;
                if (qualifiers.length == 0) {
                    j0Var = null;
                } else {
                    kotlin.collections.O k02 = C7705l.k0(qualifiers);
                    int h11 = kotlin.collections.U.h(C7714v.z(k02, 10));
                    if (h11 < 16) {
                        h11 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                    Iterator it = k02.iterator();
                    while (true) {
                        kotlin.collections.P p11 = (kotlin.collections.P) it;
                        if (!p11.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) p11.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C3511h) indexedValue.d());
                    }
                    j0Var = new j0(linkedHashMap);
                }
                arrayList.add(new Pair(type, j0Var));
            }

            public final void c(@NotNull EnumC5003e type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String e11 = type.e();
                Intrinsics.checkNotNullExpressionValue(e11, "getDesc(...)");
                this.f15896d = new Pair<>(e11, null);
            }

            public final void d(@NotNull String type, @NotNull C3511h... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                kotlin.collections.O k02 = C7705l.k0(qualifiers);
                int h11 = kotlin.collections.U.h(C7714v.z(k02, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                Iterator it = k02.iterator();
                while (true) {
                    kotlin.collections.P p11 = (kotlin.collections.P) it;
                    if (!p11.hasNext()) {
                        this.f15896d = new Pair<>(type, new j0(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) p11.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C3511h) indexedValue.d());
                    }
                }
            }
        }

        public a(@NotNull f0 f0Var, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f15892b = f0Var;
            this.f15891a = className;
        }

        public final void a(@NotNull String name, String str, @NotNull Function1<? super C0302a, Unit> block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            LinkedHashMap linkedHashMap = this.f15892b.f15890a;
            C0302a c0302a = new C0302a(this, name, str);
            block.invoke(c0302a);
            Pair<String, Y> a11 = c0302a.a();
            linkedHashMap.put(a11.e(), a11.f());
        }

        @NotNull
        public final String b() {
            return this.f15891a;
        }
    }

    @NotNull
    public final LinkedHashMap b() {
        return this.f15890a;
    }
}
