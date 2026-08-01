package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵍ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0967 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = AbstractC0540.f1235;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                jSONObject.put(AbstractC0540.f1212, intent.hasExtra(StringFog.decrypt("vT1k1fqNJg==\n", "zVERsp3oQg4=\n")) ? intent.getIntExtra(StringFog.decrypt("m+punlkNng==\n", "64Yb+T5o+lI=\n"), -1) : -1);
                jSONObject.put(AbstractC0540.f1211, Math.round(((intent.hasExtra(StringFog.decrypt("ZflUsPc=\n", "CZwi1Zs+d6c=\n")) ? intent.getIntExtra(StringFog.decrypt("8RZNx8g=\n", "nXM7oqRPOjc=\n"), -1) : -1) * 100.0f) / (intent.hasExtra(StringFog.decrypt("hWombt4=\n", "9glHArsIWbo=\n")) ? intent.getIntExtra(StringFog.decrypt("GYLF2qc=\n", "auGktsLPzY0=\n"), -1) : -1)));
            } catch (Throwable th) {
                AbstractC0544.m5502(AbstractC0540.f1235, StringFog.decrypt("nl6SWxyA34m/RY5TTsLfma9Jkk1OzNubvkCTFBrPnoeoQ44OTg==\n", "2yzgNG6gvu0=\n") + th.getLocalizedMessage());
            }
        }
        synchronized (AbstractC0540.class) {
            AbstractC0540.f1209 = jSONObject;
        }
    }
}
