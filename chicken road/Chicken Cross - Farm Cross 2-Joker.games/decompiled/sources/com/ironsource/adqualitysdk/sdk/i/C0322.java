package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ć, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0322 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1312 f306;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f307;

    public C0322(C1312 c1312, MotionEvent motionEvent) {
        this.f306 = c1312;
        this.f307 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        try {
            int round = Math.round(this.f307.getRawX());
            int round2 = Math.round(this.f307.getRawY());
            String str = AbstractC0540.f1235;
            if (round < 0 || round2 < 0 || round > AbstractC0647.m5606(AbstractC0540.m5496(), false).optInt(AbstractC0540.f1228) || round2 > AbstractC0647.m5606(AbstractC0540.m5496(), false).optInt(AbstractC0540.f1227)) {
                AbstractC0544.m5502(StringFog.decrypt("Bw+sr8mWVeg1AKuBwYl14i4GsZ7NiHfuIwY=\n", "QGPDzaj6AYc=\n"), StringFog.decrypt("EzW87ID+U+8iNL2vmrtV/C4srOvIsUPtZzWvr4qxQ/cjKensh7FE/S40qPuNrQy5PA==\n", "R1rJj+jeNpk=\n") + round + StringFog.decrypt("gxE=\n", "rzHQ5pe28Ns=\n") + round2 + StringFog.decrypt("Yw==\n", "Hkw7V4G3tFo=\n"));
                return;
            }
            String str2 = AbstractC0494.f1141;
            C0744 c0744 = new C0744(round, round2, Calendar.getInstance().getTimeInMillis(), SystemClock.elapsedRealtime());
            C1312 c1312 = this.f306;
            synchronized (c1312) {
                c1312.f3784 = c0744;
            }
        } catch (Throwable th) {
            AbstractC0480.m5464(StringFog.decrypt("yTMrNFx41d77PCwaVGf11OA6NgVYZvfY7To=\n", "jl9EVj0UgbE=\n"), StringFog.decrypt("wVeBClXdibKkSp0xSIiDtA==\n", "hCXzZSf94Nw=\n"), th, false);
        }
    }
}
