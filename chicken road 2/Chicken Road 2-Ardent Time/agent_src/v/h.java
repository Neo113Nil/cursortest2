package v;

/* loaded from: classes.dex */
public final class h extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f8380a;

    public h(java.lang.Runnable runnable, java.lang.String str, int i2) {
        super(runnable, str);
        this.f8380a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.f8380a);
        super.run();
    }
}
