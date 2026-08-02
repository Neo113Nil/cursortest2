package w1;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public final class V extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public long f17557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f17558b;

    public V(Y y4) {
        this.f17558b = y4;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f17557a;
        int i7 = Y.f17598O;
        if (j > 3600000) {
            this.f17557a = currentTimeMillis;
            r0.d(new com.flurry.android.marketing.messaging.notification.b(6, this.f17558b, signalStrength));
        }
    }
}
