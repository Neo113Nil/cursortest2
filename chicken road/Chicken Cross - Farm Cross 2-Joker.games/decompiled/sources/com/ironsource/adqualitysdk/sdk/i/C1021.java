package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1021 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0991 f3037;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3038;

    public C1021(C0991 c0991, boolean z) {
        this.f3037 = c0991;
        this.f3038 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String str;
        HashMap hashMap;
        C1050 c1050 = this.f3037.f2914.f2898.f2895.f2813.f2610;
        String decrypt = StringFog.decrypt("5TJyCzrOMQ==\n", "kUItYlSnRd4=\n");
        C0970 c0970 = this.f3037.f2914.f2898.f2895;
        if (c0970.f2816) {
            str = c0970.f2815;
            if (str == null) {
                str = StringFog.decrypt("U1/W1g==\n", "PSq6umVeZp0=\n");
            }
        } else {
            str = null;
        }
        C0682 c0682 = this.f3037.f2914.f2898.f2895.f2813.f2613;
        new C0806(this.f3037.f2914.f2898.f2895.f2813.f2615);
        C0932 c0932 = this.f3037.f2914.f2898.f2895.f2813;
        Context context = c0932.f2615;
        boolean z = this.f3038;
        C0439 m5754 = C0932.m5754(c0932);
        String str2 = AbstractC0533.f1201;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(StringFog.decrypt("QqU=\n", "JNYX4Ii9kZk=\n"), true);
            } catch (JSONException e) {
                String str3 = AbstractC0533.f1201;
                AbstractC0544.m5511(str3, str3, StringFog.decrypt("f5nYVhtfDlhfit5QBxhNXl+Hz0kGDRkKU4XDTUk1PmV0\n", "OuuqOWl/bSo=\n"), e, null, false);
            }
        }
        if (m5754.f596) {
            jSONObject.put(StringFog.decrypt("tLCfLAs=\n", "1cXrRW9+1nU=\n"), true);
        }
        jSONObject.put(StringFog.decrypt("xyucug==\n", "t1713va/OhI=\n"), str);
        long j = ((C0470) AbstractC0398.m5397()).f875;
        if (j > 0) {
            String decrypt2 = StringFog.decrypt("vZ4T\n", "1Ox3uEm8//g=\n");
            String str4 = AbstractC0494.f1141;
            jSONObject.put(decrypt2, SystemClock.elapsedRealtime() - j);
        }
        AbstractC0647.m5608(jSONObject, c0682.m5629(), false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            synchronized (c0682) {
                hashMap = c0682.f1864;
            }
            Iterator it = new HashSet(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                jSONObject3.put(str5, (String) c0682.m5630().get(str5));
            }
            jSONObject2.put(StringFog.decrypt("bgcLhg==\n", "C3V59XFDGT8=\n"), jSONObject3);
        } catch (JSONException e2) {
            String str6 = C0682.f1855;
            AbstractC0544.m5511(str6, str6, StringFog.decrypt("09E2dhQwdCXyyip+RnN6L/jGJ20JYjUk5NEraxU=\n", "lqNEGWYQFUE=\n"), e2, null, false);
        }
        AbstractC0647.m5608(jSONObject, jSONObject2, false);
        c1050.m5831(decrypt, jSONObject);
        C0970 c09702 = this.f3037.f2914.f2898.f2895;
        if (c09702.f2814) {
            C1050 c10502 = c09702.f2813.f2610;
            c10502.getClass();
            AbstractC1145.m5892(new C1121(c10502));
        }
    }
}
