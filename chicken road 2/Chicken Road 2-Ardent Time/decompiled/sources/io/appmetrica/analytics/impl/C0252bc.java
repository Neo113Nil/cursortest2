package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252bc extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0278cc f5575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252bc(io.appmetrica.analytics.impl.C0278cc c0278cc) {
        super(0);
        this.f5575a = c0278cc;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        io.appmetrica.analytics.impl.InterfaceC0743uc ke;
        io.appmetrica.analytics.impl.C0278cc c0278cc = this.f5575a;
        io.appmetrica.analytics.impl.C0769vc c0769vc = c0278cc.f5650f;
        io.appmetrica.analytics.impl.InterfaceC0662r9 interfaceC0662r9 = c0278cc.f5646b;
        io.appmetrica.analytics.impl.Qg qg = c0278cc.f5645a;
        io.appmetrica.analytics.impl.C0580o4 c0580o4 = c0278cc.f5647c;
        io.appmetrica.analytics.impl.We we = c0278cc.f5648d;
        c0769vc.getClass();
        if (io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector.isNative()) {
            io.appmetrica.analytics.impl.M9 i2 = io.appmetrica.analytics.impl.C0560na.f6484I.i();
            android.os.Bundle applicationMetaData = i2.f4656d.getApplicationMetaData(i2.f4653a);
            if (android.text.TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ke = new io.appmetrica.analytics.impl.Qd();
                return ke.a();
            }
        }
        ke = new io.appmetrica.analytics.impl.Ke(interfaceC0662r9, qg, c0580o4, we);
        return ke.a();
    }
}
