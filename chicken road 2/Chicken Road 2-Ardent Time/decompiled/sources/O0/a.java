package O0;

/* loaded from: classes.dex */
public final class a implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f1164a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("flutter-worker-");
        int i2 = this.f1164a;
        this.f1164a = i2 + 1;
        sb.append(i2);
        thread.setName(sb.toString());
        return thread;
    }
}
