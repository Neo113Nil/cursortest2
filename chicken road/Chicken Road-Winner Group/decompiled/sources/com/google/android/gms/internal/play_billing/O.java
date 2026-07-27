package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class O extends P {

    /* renamed from: c, reason: collision with root package name */
    public static final O f2662c = new O(C0229u.f2829c, C0229u.f2828b);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0232v f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0232v f2664b;

    public O(AbstractC0232v abstractC0232v, AbstractC0232v abstractC0232v2) {
        this.f2663a = abstractC0232v;
        this.f2664b = abstractC0232v2;
        if (abstractC0232v.a(abstractC0232v2) > 0 || abstractC0232v == C0229u.f2828b || abstractC0232v2 == C0229u.f2829c) {
            StringBuilder sb = new StringBuilder(16);
            abstractC0232v.b(sb);
            sb.append("..");
            abstractC0232v2.c(sb);
            throw new IllegalArgumentException("Invalid range: ".concat(sb.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            O o3 = (O) obj;
            if (this.f2663a.equals(o3.f2663a) && this.f2664b.equals(o3.f2664b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2664b.hashCode() + (this.f2663a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f2663a.b(sb);
        sb.append("..");
        this.f2664b.c(sb);
        return sb.toString();
    }
}
