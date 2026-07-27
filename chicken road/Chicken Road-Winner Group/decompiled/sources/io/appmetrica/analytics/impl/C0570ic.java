package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570ic extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0595jc f7540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570ic(C0595jc c0595jc) {
        super(0);
        this.f7540a = c0595jc;
    }

    @Override // o2.a
    public final Object invoke() {
        Bc pe;
        C0595jc c0595jc = this.f7540a;
        Cc cc = c0595jc.f;
        InterfaceC0980y9 interfaceC0980y9 = c0595jc.f7615b;
        Vg vg = c0595jc.f7614a;
        C0898v4 c0898v4 = c0595jc.f7616c;
        C0392bf c0392bf = c0595jc.f7617d;
        cc.getClass();
        if (FrameworkDetector.isNative()) {
            T9 i3 = C0878ua.f8414H.i();
            Bundle applicationMetaData = i3.f6655d.getApplicationMetaData(i3.f6652a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                pe = new Xd();
                return pe.a();
            }
        }
        pe = new Pe(interfaceC0980y9, vg, c0898v4, c0392bf);
        return pe.a();
    }
}
