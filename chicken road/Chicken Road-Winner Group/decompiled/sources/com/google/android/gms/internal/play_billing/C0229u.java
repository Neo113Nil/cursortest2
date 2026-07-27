package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229u extends AbstractC0232v {

    /* renamed from: b, reason: collision with root package name */
    public static final C0229u f2828b = new C0229u(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0229u f2829c = new C0229u(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    public /* synthetic */ C0229u(int i3) {
        this.f2830a = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0232v
    public final int a(AbstractC0232v abstractC0232v) {
        switch (this.f2830a) {
            case 0:
                return abstractC0232v == this ? 0 : 1;
            default:
                return abstractC0232v == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0232v
    public final void b(StringBuilder sb) {
        switch (this.f2830a) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0232v
    public final void c(StringBuilder sb) {
        switch (this.f2830a) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f2830a) {
            case 0:
                return ((AbstractC0232v) obj) == this ? 0 : 1;
            default:
                return ((AbstractC0232v) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0232v
    public final int hashCode() {
        switch (this.f2830a) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f2830a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
