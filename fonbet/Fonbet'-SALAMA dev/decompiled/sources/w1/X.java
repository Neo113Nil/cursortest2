package w1;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* loaded from: classes.dex */
public final class X extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {

    /* renamed from: b, reason: collision with root package name */
    public static X f17572b;

    /* renamed from: c, reason: collision with root package name */
    public static Y f17573c;

    /* renamed from: a, reason: collision with root package name */
    public long f17574a;

    public static TelephonyCallback a(Y y4) {
        if (f17572b == null) {
            f17572b = new X();
        }
        f17573c = y4;
        return f17572b;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f17574a;
        int i7 = Y.f17598O;
        if (j > 3600000) {
            this.f17574a = currentTimeMillis;
            Y y4 = f17573c;
            if (y4 != null) {
                y4.d(new com.flurry.android.marketing.messaging.notification.b(6, y4, signalStrength));
            }
        }
    }
}
