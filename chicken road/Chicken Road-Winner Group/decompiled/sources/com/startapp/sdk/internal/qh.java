package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* loaded from: classes.dex */
public final class qh extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh f4277a;

    public qh(rh rhVar) {
        this.f4277a = rhVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f4277a.a(ServiceState.class, serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f4277a.f4305e.a(signalStrength);
        this.f4277a.a(SignalStrength.class, signalStrength);
    }
}
