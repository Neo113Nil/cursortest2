package v;

/* loaded from: classes.dex */
public final class i implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f8381a;

    /* renamed from: b, reason: collision with root package name */
    public int f8382b;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new v.h(runnable, this.f8381a, this.f8382b);
    }
}
