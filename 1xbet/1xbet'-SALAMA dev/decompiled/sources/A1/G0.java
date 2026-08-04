package A1;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G0 f96b = new G0(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97a;

    public G0(boolean z4) {
        this.f97a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && G0.class == obj.getClass() && this.f97a == ((G0) obj).f97a;
    }

    public final int hashCode() {
        return !this.f97a ? 1 : 0;
    }
}
