package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rh extends sh {

    /* renamed from: d, reason: collision with root package name */
    public final qh f4304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f4305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f4305e = vhVar;
        this.f4304d = new qh(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f4340a.registerTelephonyCallback((Executor) this.f4305e.f4527b.a(), this.f4304d);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f4340a.unregisterTelephonyCallback(this.f4304d);
    }
}
