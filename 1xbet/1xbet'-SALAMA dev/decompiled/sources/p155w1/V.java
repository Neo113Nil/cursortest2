package p155w1;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: loaded from: classes.dex */
public final class V extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f17564b;

    public V(Y y4) {
        this.f17564b = y4;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.f17563a;
        int i7 = Y.f17604O;
        if (j > 3600000) {
            this.f17563a = jCurrentTimeMillis;
            Y y4 = this.f17564b;
            y4.d(new b(6, y4, signalStrength));
        }
    }
}
