package K1;

import K1.C3422b;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3428h {

    /* renamed from: K1.h$a */
    static final class a extends AbstractC7737t implements Function1<List<? extends Integer>, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<String> f15049b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<String, Integer, Integer, String> f15050c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3422b f15051d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f15052e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.M m11, InterfaceC6511n interfaceC6511n, C3422b c3422b, LinkedHashMap linkedHashMap) {
            super(1);
            this.f15049b = m11;
            this.f15050c = interfaceC6511n;
            this.f15051d = c3422b;
            this.f15052e = linkedHashMap;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            int intValue = list2.get(0).intValue();
            int intValue2 = list2.get(1).intValue();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.M<String> m11 = this.f15049b;
            sb2.append(m11.f71787a);
            sb2.append((String) ((C3423c) this.f15050c).invoke(this.f15051d.h(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
            m11.f71787a = sb2.toString();
            return (Integer) this.f15052e.put(Integer.valueOf(intValue2), Integer.valueOf(m11.f71787a.length()));
        }
    }

    private static final void a(List list, TreeSet treeSet) {
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C3422b.C0288b c0288b = (C3422b.C0288b) list.get(i11);
                treeSet.add(Integer.valueOf(c0288b.g()));
                treeSet.add(Integer.valueOf(c0288b.e()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final C3422b b(@NotNull C3422b c3422b, @NotNull InterfaceC6511n<? super String, ? super Integer, ? super Integer, String> interfaceC6511n) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeSet j11 = e0.j(0, Integer.valueOf(c3422b.h().length()));
        a(c3422b.f(), j11);
        a(c3422b.d(), j11);
        a(c3422b.a(), j11);
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        m11.f71787a = "";
        LinkedHashMap l11 = kotlin.collections.U.l(new Pair(0, 0));
        a transform = new a(m11, interfaceC6511n, c3422b, l11);
        Intrinsics.checkNotNullParameter(j11, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        i0.a(2, 1);
        if ((j11 instanceof RandomAccess) && (j11 instanceof List)) {
            List list = (List) j11;
            int size = list.size();
            ArrayList arrayList3 = new ArrayList((size % 1 == 0 ? 0 : 1) + size);
            a0 a0Var = new a0(list);
            for (int i11 = 0; i11 >= 0 && i11 < size; i11++) {
                int i12 = size - i11;
                if (2 <= i12) {
                    i12 = 2;
                }
                if (i12 < 2) {
                    break;
                }
                a0Var.b(i11, i12 + i11);
                arrayList3.add(transform.invoke(a0Var));
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator b11 = i0.b(j11.iterator(), 2, 1, false, true);
            while (b11.hasNext()) {
                arrayList4.add(transform.invoke((List) b11.next()));
            }
        }
        List<C3422b.C0288b<D>> f7 = c3422b.f();
        ArrayList arrayList5 = null;
        if (f7 != null) {
            arrayList = new ArrayList(f7.size());
            int size2 = f7.size();
            for (int i13 = 0; i13 < size2; i13++) {
                C3422b.C0288b<D> c0288b = f7.get(i13);
                D f11 = c0288b.f();
                Object obj = l11.get(Integer.valueOf(c0288b.g()));
                Intrinsics.f(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = l11.get(Integer.valueOf(c0288b.e()));
                Intrinsics.f(obj2);
                arrayList.add(new C3422b.C0288b(intValue, ((Number) obj2).intValue(), f11));
            }
        } else {
            arrayList = null;
        }
        List<C3422b.C0288b<C3440u>> d11 = c3422b.d();
        if (d11 != null) {
            arrayList2 = new ArrayList(d11.size());
            int size3 = d11.size();
            for (int i14 = 0; i14 < size3; i14++) {
                C3422b.C0288b<C3440u> c0288b2 = d11.get(i14);
                C3440u f12 = c0288b2.f();
                Object obj3 = l11.get(Integer.valueOf(c0288b2.g()));
                Intrinsics.f(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = l11.get(Integer.valueOf(c0288b2.e()));
                Intrinsics.f(obj4);
                arrayList2.add(new C3422b.C0288b(intValue2, ((Number) obj4).intValue(), f12));
            }
        } else {
            arrayList2 = null;
        }
        List<C3422b.C0288b<? extends Object>> a11 = c3422b.a();
        if (a11 != null) {
            arrayList5 = new ArrayList(a11.size());
            int size4 = a11.size();
            for (int i15 = 0; i15 < size4; i15++) {
                C3422b.C0288b<? extends Object> c0288b3 = a11.get(i15);
                Object f13 = c0288b3.f();
                Object obj5 = l11.get(Integer.valueOf(c0288b3.g()));
                Intrinsics.f(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = l11.get(Integer.valueOf(c0288b3.e()));
                Intrinsics.f(obj6);
                arrayList5.add(new C3422b.C0288b(intValue3, ((Number) obj6).intValue(), f13));
            }
        }
        return new C3422b((String) m11.f71787a, arrayList, arrayList2, arrayList5);
    }
}
