package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class P extends Q {

    /* renamed from: c, reason: collision with root package name */
    public static final P f5088c = new P(C0373u.f5265c, C0373u.f5264b);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0376v f5089a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0376v f5090b;

    public P(AbstractC0376v abstractC0376v, AbstractC0376v abstractC0376v2) {
        this.f5089a = abstractC0376v;
        this.f5090b = abstractC0376v2;
        if (abstractC0376v.a(abstractC0376v2) > 0 || abstractC0376v == C0373u.f5264b || abstractC0376v2 == C0373u.f5265c) {
            StringBuilder sb = new StringBuilder(16);
            abstractC0376v.b(sb);
            sb.append("..");
            abstractC0376v2.c(sb);
            throw new IllegalArgumentException("Invalid range: ".concat(sb.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P) {
            P p5 = (P) obj;
            if (this.f5089a.equals(p5.f5089a) && this.f5090b.equals(p5.f5090b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5090b.hashCode() + (this.f5089a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f5089a.b(sb);
        sb.append("..");
        this.f5090b.c(sb);
        return sb.toString();
    }
}
