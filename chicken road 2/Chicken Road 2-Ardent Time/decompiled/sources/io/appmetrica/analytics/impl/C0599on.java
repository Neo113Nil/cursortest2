package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599on {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0651qn f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0651qn f6606b;

    public C0599on(android.content.Context context) {
        if (new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f6605a = new io.appmetrica.analytics.impl.L2(new io.appmetrica.analytics.impl.C0571nl(context));
            this.f6606b = new io.appmetrica.analytics.impl.L2(new io.appmetrica.analytics.impl.Lc(context));
        } else {
            this.f6605a = new io.appmetrica.analytics.impl.Y7();
            this.f6606b = new io.appmetrica.analytics.impl.Y7();
        }
    }
}
