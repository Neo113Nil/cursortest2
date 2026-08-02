package D4;

import B4.C2581j;

/* renamed from: D4.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2837l implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2581j f5914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2836k f5915b;

    public C2837l(C2581j c2581j, C2836k c2836k) {
        this.f5914a = c2581j;
        this.f5915b = c2836k;
    }

    @Override // S0.M
    public final void dispose() {
        this.f5914a.getLifecycle().e(this.f5915b);
    }
}
