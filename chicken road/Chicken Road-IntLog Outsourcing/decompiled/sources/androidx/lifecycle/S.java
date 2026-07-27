package androidx.lifecycle;

/* loaded from: classes.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0252w f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0243m f4556b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4557c;

    public S(C0252w registry, EnumC0243m event) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(event, "event");
        this.f4555a = registry;
        this.f4556b = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4557c) {
            return;
        }
        this.f4555a.e(this.f4556b);
        this.f4557c = true;
    }
}
