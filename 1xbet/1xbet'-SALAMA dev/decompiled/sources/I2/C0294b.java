package I2;

/* JADX INFO: renamed from: I2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0294b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3592b;

    public final synchronized float a() {
        synchronized (this) {
            float f7 = this.f3592b;
            if (f7 >= 0.0f) {
                return f7;
            }
            return 1.0f;
        }
    }
}
