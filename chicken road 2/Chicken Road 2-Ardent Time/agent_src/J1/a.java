package J1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f931b;

    public /* synthetic */ a(java.lang.String str, boolean z2) {
        this.f930a = str;
        this.f931b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.String name = this.f930a;
        kotlin.jvm.internal.i.e(name, "$name");
        java.lang.Thread thread = new java.lang.Thread(runnable, name);
        thread.setDaemon(this.f931b);
        return thread;
    }
}
