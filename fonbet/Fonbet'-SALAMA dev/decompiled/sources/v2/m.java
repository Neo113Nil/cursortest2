package v2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class m extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final n f17132a;

    public m(n nVar) {
        this.f17132a = nVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        n.a(this.f17132a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
