package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788qn {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0839sn f8176a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0839sn f8177b;

    public C0788qn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f8176a = new T2(new C0811rl(context));
            this.f8177b = new T2(new Sc(context));
        } else {
            this.f8176a = new C0462e8();
            this.f8177b = new C0462e8();
        }
    }
}
