package com.startapp.sdk.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public final class th extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh f4393a;

    public th(uh uhVar) {
        this.f4393a = uhVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f4393a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f4393a.f4476e.a(signalStrength);
        this.f4393a.a(SignalStrength.class, signalStrength);
    }
}
