package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1185 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3371;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3372;

    public C1185(C1151 c1151, Activity activity) {
        this.f3371 = c1151;
        this.f3372 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3371, this.f3372)) {
            AbstractC1145.m5895(new C1195(this));
            C1151 c1151 = this.f3371;
            c1151.f3299 = false;
            c1151.f3300 = true;
            if ((!c1151.f3301 || c1151.f3298) && !this.f3372.isFinishing()) {
                C1151 c11512 = this.f3371;
                Activity activity = this.f3372;
                c11512.getClass();
                String hexString = Integer.toHexString(activity.hashCode());
                if (c11512.f3301) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(AbstractC0739.f2017, true);
                    } catch (JSONException e) {
                        AbstractC0544.m5502(C1151.f3296, StringFog.decrypt("obaR2lBeR/uArY3SAhpJ0YuwsNBMGgbri+SJxk0QHL8=\n", "5MTjtSJ+Jp8=\n") + e.getLocalizedMessage());
                    }
                    c11512.m5663(jSONObject, activity, hexString);
                } else {
                    c11512.f3301 = true;
                    c11512.m5663(new JSONObject(), activity, hexString);
                }
            }
            this.f3371.f3298 = false;
        }
    }
}
