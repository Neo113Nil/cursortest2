package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937qn {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0988sn f9119a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0988sn f9120b;

    public C0937qn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f9119a = new T2(new C0960rl(context));
            this.f9120b = new T2(new Sc(context));
        } else {
            this.f9119a = new C0611e8();
            this.f9120b = new C0611e8();
        }
    }
}
