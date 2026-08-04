package p155w1;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: loaded from: classes.dex */
public final class X extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static X f17578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Y f17579c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17580a;

    public static TelephonyCallback a(Y y4) {
        if (f17578b == null) {
            f17578b = new X();
        }
        f17579c = y4;
        return f17578b;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.f17580a;
        int i7 = Y.f17604O;
        if (j > 3600000) {
            this.f17580a = jCurrentTimeMillis;
            Y y4 = f17579c;
            if (y4 != null) {
                y4.d(new b(6, y4, signalStrength));
            }
        }
    }
}
