package K0;

import java.util.ArrayList;
import java.util.List;
import r.AbstractC2332j;
import r.C2342u;
import s.AbstractC2351a;

/* renamed from: K0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203h implements CharSequence {

    /* renamed from: k, reason: collision with root package name */
    public final List f2828k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2829l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2830m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2831n;

    static {
        v3.g gVar = E.f2742a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r2.a(r4.f2825c);
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0203h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = 0;
        this.f2828k = list;
        this.f2829l = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i5 = 0; i5 < size; i5++) {
                C0201f c0201f = (C0201f) list.get(i5);
                Object obj = c0201f.f2823a;
                if (obj instanceof G) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0201f);
                } else if (obj instanceof w) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0201f);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f2830m = arrayList;
        this.f2831n = arrayList2;
        List k02 = arrayList2 != null ? X3.m.k0(arrayList2, new C0202g(i)) : null;
        if (k02 == null || k02.isEmpty()) {
            return;
        }
        int i6 = ((C0201f) X3.m.Y(k02)).f2825c;
        int i7 = AbstractC2332j.f19010a;
        C2342u c2342u = new C2342u(1);
        c2342u.a(i6);
        int size2 = k02.size();
        int i8 = 1;
        while (i8 < size2) {
            C0201f c0201f2 = (C0201f) k02.get(i8);
            while (true) {
                int i9 = c2342u.f19051b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    AbstractC2351a.e("IntList is empty.");
                    throw null;
                }
                int i10 = c2342u.f19050a[i9 - 1];
                if (c0201f2.f2824b >= i10) {
                    c2342u.d(i9 - 1);
                } else {
                    int i11 = c0201f2.f2825c;
                    if (i11 > i10) {
                        Q0.a.a("Paragraph overlap not allowed, end " + i11 + " should be less than or equal to " + i10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r4.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0203h subSequence(int i, int i5) {
        ArrayList arrayList;
        if (!(i <= i5)) {
            Q0.a.a("start (" + i + ") should be less or equal to end (" + i5 + ')');
        }
        String str = this.f2829l;
        if (i == 0 && i5 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i5);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        C0203h c0203h = AbstractC0205j.f2833a;
        if (i > i5) {
            Q0.a.a("start (" + i + ") should be less than or equal to end (" + i5 + ')');
        }
        List list = this.f2828k;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0201f c0201f = (C0201f) list.get(i6);
                int i7 = c0201f.f2824b;
                int i8 = c0201f.f2825c;
                if (AbstractC0205j.b(i, i5, i7, i8)) {
                    arrayList.add(new C0201f(c0201f.f2823a, Math.max(i, c0201f.f2824b) - i, Math.min(i5, i8) - i, c0201f.f2826d));
                }
            }
        }
        arrayList = null;
        return new C0203h(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f2829l.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0203h)) {
            return false;
        }
        C0203h c0203h = (C0203h) obj;
        return kotlin.jvm.internal.l.a(this.f2829l, c0203h.f2829l) && kotlin.jvm.internal.l.a(this.f2828k, c0203h.f2828k);
    }

    public final int hashCode() {
        int hashCode = this.f2829l.hashCode() * 31;
        List list = this.f2828k;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2829l.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2829l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X3.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0203h(String str, ArrayList arrayList, int i) {
        this(arrayList.isEmpty() ? null : arrayList, str);
        arrayList = (i & 2) != 0 ? X3.v.f6090k : arrayList;
        C0203h c0203h = AbstractC0205j.f2833a;
    }

    public /* synthetic */ C0203h(String str) {
        this(str, X3.v.f6090k);
    }

    public C0203h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
