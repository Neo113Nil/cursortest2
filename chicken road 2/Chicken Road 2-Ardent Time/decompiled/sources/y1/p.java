package y1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements s1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8506c;

    public /* synthetic */ p(java.lang.Object obj, boolean z2, int i2) {
        this.f8504a = i2;
        this.f8506c = obj;
        this.f8505b = z2;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        h1.C0172d c0172d;
        java.lang.Object obj4;
        int i2 = this.f8504a;
        java.lang.CharSequence DelimitedRangesSequence = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        switch (i2) {
            case 0:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int S2 = y1.g.S(DelimitedRangesSequence, (char[]) this.f8506c, intValue, this.f8505b);
                if (S2 < 0) {
                    return null;
                }
                return new h1.C0172d(java.lang.Integer.valueOf(S2), 1);
            default:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                java.util.List list = (java.util.List) this.f8506c;
                boolean z2 = this.f8505b;
                if (z2 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    v1.C1002c c1002c = new v1.C1002c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z3 = DelimitedRangesSequence instanceof java.lang.String;
                    int i3 = c1002c.f8389c;
                    int i4 = c1002c.f8388b;
                    if (z3) {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            while (true) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        java.lang.String str = (java.lang.String) obj4;
                                        if (y1.o.H(0, intValue, str.length(), str, (java.lang.String) DelimitedRangesSequence, z2)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                java.lang.String str2 = (java.lang.String) obj4;
                                if (str2 != null) {
                                    c0172d = new h1.C0172d(java.lang.Integer.valueOf(intValue), str2);
                                } else if (intValue != i4) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0172d = null;
                    } else {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            while (true) {
                                java.util.Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        java.lang.String str3 = (java.lang.String) obj3;
                                        if (y1.g.V(str3, 0, DelimitedRangesSequence, intValue, str3.length(), z2)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                java.lang.String str4 = (java.lang.String) obj3;
                                if (str4 != null) {
                                    c0172d = new h1.C0172d(java.lang.Integer.valueOf(intValue), str4);
                                } else if (intValue != i4) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0172d = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new java.util.NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new java.lang.IllegalArgumentException("List has more than one element.");
                    }
                    java.lang.String str5 = (java.lang.String) list.get(0);
                    int R2 = y1.g.R(DelimitedRangesSequence, str5, intValue, false, 4);
                    if (R2 >= 0) {
                        c0172d = new h1.C0172d(java.lang.Integer.valueOf(R2), str5);
                    }
                    c0172d = null;
                }
                if (c0172d == null) {
                    return null;
                }
                return new h1.C0172d(c0172d.f3295a, java.lang.Integer.valueOf(((java.lang.String) c0172d.f3296b).length()));
        }
    }
}
