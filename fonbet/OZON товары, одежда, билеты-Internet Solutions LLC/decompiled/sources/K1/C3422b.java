package K1;

import B0.C2454a;
import K1.AbstractC3429i;
import Sc.InterfaceC3999a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3422b implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15027a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C0288b<D>> f15028b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C0288b<C3440u>> f15029c;

    /* renamed from: d, reason: collision with root package name */
    private final List<C0288b<? extends Object>> f15030d;

    /* renamed from: K1.b$c */
    /* loaded from: classes8.dex */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Integer.valueOf(((C0288b) t2).g()), Integer.valueOf(((C0288b) t11).g()));
        }
    }

    static {
        B.g();
    }

    public C3422b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3422b(@NotNull String str, List<C0288b<D>> list, List<C0288b<C3440u>> list2, List<? extends C0288b<? extends Object>> list3) {
        this.f15027a = str;
        this.f15028b = list;
        this.f15029c = list2;
        this.f15030d = list3;
        if (list2 != null) {
            List I02 = C7714v.I0(new c(), list2);
            if (I02 != null) {
                int size = I02.size();
                int i11 = -1;
                for (int i12 = 0; i12 < size; i12++) {
                    C0288b c0288b = (C0288b) I02.get(i12);
                    if (c0288b.g() < i11) {
                        throw new IllegalArgumentException("ParagraphStyle should not overlap");
                    }
                    if (c0288b.e() > this.f15027a.length()) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + c0288b.g() + ", " + c0288b.e() + ") is out of boundary").toString());
                    }
                    i11 = c0288b.e();
                }
            }
        }
    }

    public final List<C0288b<? extends Object>> a() {
        return this.f15030d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public final List b(int i11) {
        ?? r12;
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            r12 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                C0288b<? extends Object> c0288b2 = c0288b;
                if ((c0288b2.f() instanceof AbstractC3429i) && C3424d.f(0, i11, c0288b2.g(), c0288b2.e())) {
                    r12.add(c0288b);
                }
            }
        } else {
            r12 = kotlin.collections.K.f71697a;
        }
        Intrinsics.g(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return r12;
    }

    @NotNull
    public final List<C0288b<C3440u>> c() {
        List<C0288b<C3440u>> list = this.f15029c;
        return list == null ? kotlin.collections.K.f71697a : list;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f15027a.charAt(i11);
    }

    public final List<C0288b<C3440u>> d() {
        return this.f15029c;
    }

    @NotNull
    public final List<C0288b<D>> e() {
        List<C0288b<D>> list = this.f15028b;
        return list == null ? kotlin.collections.K.f71697a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3422b)) {
            return false;
        }
        C3422b c3422b = (C3422b) obj;
        return Intrinsics.d(this.f15027a, c3422b.f15027a) && Intrinsics.d(this.f15028b, c3422b.f15028b) && Intrinsics.d(this.f15029c, c3422b.f15029c) && Intrinsics.d(this.f15030d, c3422b.f15030d);
    }

    public final List<C0288b<D>> f() {
        return this.f15028b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public final List g(int i11) {
        ?? r12;
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            r12 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                C0288b<? extends Object> c0288b2 = c0288b;
                if ((c0288b2.f() instanceof String) && "androidx.compose.foundation.text.inlineContent".equals(c0288b2.h()) && C3424d.f(0, i11, c0288b2.g(), c0288b2.e())) {
                    r12.add(c0288b);
                }
            }
        } else {
            r12 = kotlin.collections.K.f71697a;
        }
        Intrinsics.g(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return r12;
    }

    @NotNull
    public final String h() {
        return this.f15027a;
    }

    public final int hashCode() {
        int hashCode = this.f15027a.hashCode() * 31;
        List<C0288b<D>> list = this.f15028b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<C0288b<C3440u>> list2 = this.f15029c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C0288b<? extends Object>> list3 = this.f15030d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public final List i(int i11) {
        ?? r12;
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            r12 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                C0288b<? extends Object> c0288b2 = c0288b;
                if ((c0288b2.f() instanceof V) && C3424d.f(0, i11, c0288b2.g(), c0288b2.e())) {
                    r12.add(c0288b);
                }
            }
        } else {
            r12 = kotlin.collections.K.f71697a;
        }
        Intrinsics.g(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return r12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @InterfaceC3999a
    @NotNull
    public final List j(int i11) {
        ?? r12;
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            r12 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                C0288b<? extends Object> c0288b2 = c0288b;
                if ((c0288b2.f() instanceof W) && C3424d.f(0, i11, c0288b2.g(), c0288b2.e())) {
                    r12.add(c0288b);
                }
            }
        } else {
            r12 = kotlin.collections.K.f71697a;
        }
        Intrinsics.g(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return r12;
    }

    public final boolean k(@NotNull C3422b c3422b) {
        return Intrinsics.d(this.f15030d, c3422b.f15030d);
    }

    public final boolean l(int i11) {
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                if ((c0288b.f() instanceof AbstractC3429i) && C3424d.f(0, i11, c0288b.g(), c0288b.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15027a.length();
    }

    public final boolean m(int i11) {
        List<C0288b<? extends Object>> list = this.f15030d;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0288b<? extends Object> c0288b = list.get(i12);
                if ((c0288b.f() instanceof String) && "androidx.compose.foundation.text.inlineContent".equals(c0288b.h()) && C3424d.f(0, i11, c0288b.g(), c0288b.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    @NotNull
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C3422b subSequence(int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("start (" + i11 + ") should be less or equal to end (" + i12 + ')').toString());
        }
        String str = this.f15027a;
        if (i11 == 0 && i12 == str.length()) {
            return this;
        }
        String substring = str.substring(i11, i12);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C3422b(substring, C3424d.a(i11, i12, this.f15028b), C3424d.a(i11, i12, this.f15029c), C3424d.a(i11, i12, this.f15030d));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final String toString() {
        return this.f15027a;
    }

    /* renamed from: K1.b$a */
    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final StringBuilder f15031a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f15032b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f15033c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f15034d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ArrayList f15035e;

        /* renamed from: K1.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        private static final class C0287a<T> {

            /* renamed from: a, reason: collision with root package name */
            private final T f15036a;

            /* renamed from: b, reason: collision with root package name */
            private final int f15037b;

            /* renamed from: c, reason: collision with root package name */
            private int f15038c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final String f15039d;

            public /* synthetic */ C0287a(Object obj, int i11, int i12, int i13) {
                this(obj, i11, (i13 & 4) != 0 ? LinearLayoutManager.INVALID_OFFSET : i12, "");
            }

            public final void a(int i11) {
                this.f15038c = i11;
            }

            @NotNull
            public final C0288b<T> b(int i11) {
                int i12 = this.f15038c;
                if (i12 != Integer.MIN_VALUE) {
                    i11 = i12;
                }
                if (i11 == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first");
                }
                return new C0288b<>(this.f15036a, this.f15037b, i11, this.f15039d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0287a)) {
                    return false;
                }
                C0287a c0287a = (C0287a) obj;
                return Intrinsics.d(this.f15036a, c0287a.f15036a) && this.f15037b == c0287a.f15037b && this.f15038c == c0287a.f15038c && Intrinsics.d(this.f15039d, c0287a.f15039d);
            }

            public final int hashCode() {
                T t2 = this.f15036a;
                return this.f15039d.hashCode() + C2454a.a(this.f15038c, C2454a.a(this.f15037b, (t2 == null ? 0 : t2.hashCode()) * 31, 31), 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f15036a);
                sb2.append(", start=");
                sb2.append(this.f15037b);
                sb2.append(", end=");
                sb2.append(this.f15038c);
                sb2.append(", tag=");
                return B3.D.c(sb2, this.f15039d, ')');
            }

            public C0287a(T t2, int i11, int i12, @NotNull String str) {
                this.f15036a = t2;
                this.f15037b = i11;
                this.f15038c = i12;
                this.f15039d = str;
            }
        }

        public a() {
            this.f15031a = new StringBuilder(16);
            this.f15032b = new ArrayList();
            this.f15033c = new ArrayList();
            this.f15034d = new ArrayList();
            this.f15035e = new ArrayList();
        }

        public final void a(@NotNull AbstractC3429i.b bVar, int i11, int i12) {
            this.f15034d.add(new C0287a(bVar, i11, i12, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof C3422b) {
                d((C3422b) charSequence);
                return this;
            }
            this.f15031a.append(charSequence);
            return this;
        }

        public final void b(@NotNull D d11, int i11, int i12) {
            this.f15032b.add(new C0287a(d11, i11, i12, 8));
        }

        @NotNull
        public final void c(char c11) {
            this.f15031a.append(c11);
        }

        public final void d(@NotNull C3422b c3422b) {
            StringBuilder sb2 = this.f15031a;
            int length = sb2.length();
            sb2.append(c3422b.h());
            List<C0288b<D>> f7 = c3422b.f();
            if (f7 != null) {
                int size = f7.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C0288b<D> c0288b = f7.get(i11);
                    b(c0288b.f(), c0288b.g() + length, c0288b.e() + length);
                }
            }
            List<C0288b<C3440u>> d11 = c3422b.d();
            if (d11 != null) {
                int size2 = d11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C0288b<C3440u> c0288b2 = d11.get(i12);
                    this.f15033c.add(new C0287a(c0288b2.f(), c0288b2.g() + length, c0288b2.e() + length, 8));
                }
            }
            List<C0288b<? extends Object>> a11 = c3422b.a();
            if (a11 != null) {
                int size3 = a11.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    C0288b<? extends Object> c0288b3 = a11.get(i13);
                    this.f15034d.add(new C0287a(c0288b3.f(), c0288b3.g() + length, c0288b3.e() + length, c0288b3.h()));
                }
            }
        }

        public final void e(@NotNull String str) {
            this.f15031a.append(str);
        }

        public final void f(int i11) {
            ArrayList arrayList = this.f15035e;
            if (i11 < arrayList.size()) {
                while (arrayList.size() - 1 >= i11) {
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Nothing to pop.");
                    }
                    ((C0287a) arrayList.remove(arrayList.size() - 1)).a(this.f15031a.length());
                }
                return;
            }
            throw new IllegalStateException((i11 + " should be less than " + arrayList.size()).toString());
        }

        public final int g(@NotNull C3440u c3440u) {
            C0287a c0287a = new C0287a(c3440u, this.f15031a.length(), 0, 12);
            this.f15035e.add(c0287a);
            this.f15033c.add(c0287a);
            return r5.size() - 1;
        }

        public final int h(@NotNull D d11) {
            C0287a c0287a = new C0287a(d11, this.f15031a.length(), 0, 12);
            this.f15035e.add(c0287a);
            this.f15032b.add(c0287a);
            return r5.size() - 1;
        }

        @NotNull
        public final C3422b i() {
            StringBuilder sb2 = this.f15031a;
            String sb3 = sb2.toString();
            ArrayList arrayList = this.f15032b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(((C0287a) arrayList.get(i11)).b(sb2.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = this.f15033c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList4.add(((C0287a) arrayList3.get(i12)).b(sb2.length()));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.f15034d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList6.add(((C0287a) arrayList5.get(i13)).b(sb2.length()));
            }
            return new C3422b(sb3, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i11, int i12) {
            List e11;
            ?? r32;
            List<C0288b<? extends Object>> a11;
            boolean z11 = charSequence instanceof C3422b;
            StringBuilder sb2 = this.f15031a;
            if (z11) {
                C3422b c3422b = (C3422b) charSequence;
                int length = sb2.length();
                sb2.append((CharSequence) c3422b.h(), i11, i12);
                e11 = C3424d.e(c3422b, i11, i12);
                if (e11 != null) {
                    int size = e11.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        C0288b c0288b = (C0288b) e11.get(i13);
                        b((D) c0288b.f(), c0288b.g() + length, c0288b.e() + length);
                    }
                }
                ?? r12 = 0;
                r12 = 0;
                if (i11 == i12 || (r32 = c3422b.d()) == 0) {
                    r32 = 0;
                } else if (i11 != 0 || i12 < c3422b.h().length()) {
                    ArrayList arrayList = new ArrayList(r32.size());
                    int size2 = r32.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        Object obj = r32.get(i14);
                        C0288b c0288b2 = (C0288b) obj;
                        if (C3424d.f(i11, i12, c0288b2.g(), c0288b2.e())) {
                            arrayList.add(obj);
                        }
                    }
                    r32 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        C0288b c0288b3 = (C0288b) arrayList.get(i15);
                        r32.add(new C0288b(kotlin.ranges.h.e(c0288b3.g(), i11, i12) - i11, kotlin.ranges.h.e(c0288b3.e(), i11, i12) - i11, c0288b3.f()));
                    }
                }
                if (r32 != 0) {
                    int size4 = r32.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        C0288b c0288b4 = (C0288b) r32.get(i16);
                        this.f15033c.add(new C0287a((C3440u) c0288b4.f(), c0288b4.g() + length, c0288b4.e() + length, 8));
                    }
                }
                if (i11 != i12 && (a11 = c3422b.a()) != null) {
                    if (i11 != 0 || i12 < c3422b.h().length()) {
                        ArrayList arrayList2 = new ArrayList(a11.size());
                        int size5 = a11.size();
                        for (int i17 = 0; i17 < size5; i17++) {
                            C0288b<? extends Object> c0288b5 = a11.get(i17);
                            C0288b<? extends Object> c0288b6 = c0288b5;
                            if (C3424d.f(i11, i12, c0288b6.g(), c0288b6.e())) {
                                arrayList2.add(c0288b5);
                            }
                        }
                        r12 = new ArrayList(arrayList2.size());
                        int size6 = arrayList2.size();
                        for (int i18 = 0; i18 < size6; i18++) {
                            C0288b c0288b7 = (C0288b) arrayList2.get(i18);
                            r12.add(new C0288b(c0288b7.f(), kotlin.ranges.h.e(c0288b7.g(), i11, i12) - i11, kotlin.ranges.h.e(c0288b7.e(), i11, i12) - i11, c0288b7.h()));
                        }
                    } else {
                        r12 = a11;
                    }
                }
                if (r12 != 0) {
                    int size7 = r12.size();
                    for (int i19 = 0; i19 < size7; i19++) {
                        C0288b c0288b8 = (C0288b) r12.get(i19);
                        this.f15034d.add(new C0287a(c0288b8.f(), c0288b8.g() + length, c0288b8.e() + length, c0288b8.h()));
                    }
                }
                return this;
            }
            sb2.append(charSequence, i11, i12);
            return this;
        }

        public a(@NotNull C3422b c3422b) {
            this();
            d(c3422b);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c11) {
            this.f15031a.append(c11);
            return this;
        }
    }

    /* renamed from: K1.b$b, reason: collision with other inner class name */
    public static final class C0288b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f15040a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15041b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15042c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f15043d;

        public C0288b(T t2, int i11, int i12, @NotNull String str) {
            this.f15040a = t2;
            this.f15041b = i11;
            this.f15042c = i12;
            this.f15043d = str;
            if (i11 > i12) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static C0288b d(C0288b c0288b, int i11) {
            return new C0288b(c0288b.f15040a, c0288b.f15041b, i11, c0288b.f15043d);
        }

        public final T a() {
            return this.f15040a;
        }

        public final int b() {
            return this.f15041b;
        }

        public final int c() {
            return this.f15042c;
        }

        public final int e() {
            return this.f15042c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0288b)) {
                return false;
            }
            C0288b c0288b = (C0288b) obj;
            return Intrinsics.d(this.f15040a, c0288b.f15040a) && this.f15041b == c0288b.f15041b && this.f15042c == c0288b.f15042c && Intrinsics.d(this.f15043d, c0288b.f15043d);
        }

        public final T f() {
            return this.f15040a;
        }

        public final int g() {
            return this.f15041b;
        }

        @NotNull
        public final String h() {
            return this.f15043d;
        }

        public final int hashCode() {
            T t2 = this.f15040a;
            return this.f15043d.hashCode() + C2454a.a(this.f15042c, C2454a.a(this.f15041b, (t2 == null ? 0 : t2.hashCode()) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f15040a);
            sb2.append(", start=");
            sb2.append(this.f15041b);
            sb2.append(", end=");
            sb2.append(this.f15042c);
            sb2.append(", tag=");
            return B3.D.c(sb2, this.f15043d, ')');
        }

        public C0288b(int i11, int i12, Object obj) {
            this(obj, i11, i12, "");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3422b(int i11, String str, ArrayList arrayList) {
        this(str, r5, null, null);
        RandomAccess randomAccess = (i11 & 2) != 0 ? kotlin.collections.K.f71697a : arrayList;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        ArrayList arrayList2 = (Collection) randomAccess;
        arrayList2 = arrayList2.isEmpty() ? null : arrayList2;
        k11.isEmpty();
    }
}
