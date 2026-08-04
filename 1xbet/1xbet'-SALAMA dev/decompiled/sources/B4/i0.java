package B4;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1166a;

    public i0(int i7) {
        this.f1166a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i0.class == obj.getClass() && this.f1166a == ((i0) obj).f1166a;
    }

    public final int hashCode() {
        return this.f1166a;
    }

    public final String toString() {
        return "TransactionOptions{maxAttempts=" + this.f1166a + '}';
    }
}
