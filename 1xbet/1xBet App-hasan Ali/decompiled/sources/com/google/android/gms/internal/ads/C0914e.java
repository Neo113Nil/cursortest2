package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914e {

    /* renamed from: a, reason: collision with root package name */
    public final C0870d f13214a;

    public C0914e(C0870d c0870d) {
        this.f13214a = c0870d;
    }

    public final void a() {
        try {
            ((C0914e) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC0627Kd.class).newInstance(this.f13214a)).a();
        } catch (Exception e3) {
            if (!(e3 instanceof C1788xd)) {
                throw new C1788xd(e3);
            }
        }
    }
}
