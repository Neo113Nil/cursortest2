package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0950 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0932 f2655;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualitySegment f2656;

    public C0950(C0932 c0932, ISAdQualitySegment iSAdQualitySegment) {
        this.f2655 = c0932;
        this.f2656 = iSAdQualitySegment;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        C0932 c0932 = this.f2655;
        synchronized (c0932) {
            z = c0932.f2621;
        }
        if (!z) {
            AbstractC0544.m5504(StringFog.decrypt("7b/rSiCMZqvViP50\n", "rNu6P0HgD98=\n"), StringFog.decrypt("jBvcustzaVq7WsH42D5/Ubtan732AFtbng/T8dYnYx+cPvm91iA6UaAOkvTROm5Wrhbb59o3NA==\n", "z3qynb9TGj8=\n"));
            return;
        }
        C0872 c0872 = this.f2655.f2605;
        if (c0872 != null) {
            ISAdQualitySegment iSAdQualitySegment = this.f2656;
            C1050 c1050 = c0872.f2492;
            String decrypt = StringFog.decrypt("3kRmcFwlNcHIT2Y=\n", "rSESLy9AUqw=\n");
            JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
            try {
                if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                    jSONObject.put(StringFog.decrypt("PWhAtw==\n", "Tg8u2u5dBR0=\n"), iSAdQualitySegment.getName());
                }
                if (iSAdQualitySegment.getAge() != -1) {
                    jSONObject.put(StringFog.decrypt("+3QDEA==\n", "iBVkdaaV2Bk=\n"), iSAdQualitySegment.getAge());
                }
                if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                    jSONObject.put(StringFog.decrypt("SnLZLg==\n", "ORW8QGakm8I=\n"), iSAdQualitySegment.getGender());
                }
                if (iSAdQualitySegment.getLevel() != -1) {
                    jSONObject.put(StringFog.decrypt("Dd99kw==\n", "frML/9CFrLY=\n"), iSAdQualitySegment.getLevel());
                }
                if (iSAdQualitySegment.getIsPaying() != null) {
                    jSONObject.put(StringFog.decrypt("GpS3MA==\n", "aeTWSc8XTy8=\n"), iSAdQualitySegment.getIsPaying().get());
                }
                if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                    jSONObject.put(StringFog.decrypt("KeJXe5Q=\n", "Wos2C+De7pw=\n"), iSAdQualitySegment.getInAppPurchasesTotal());
                }
                if (iSAdQualitySegment.getUserCreationDate() != 0) {
                    jSONObject.put(StringFog.decrypt("61Tyeg==\n", "mCGRHsHZYiU=\n"), iSAdQualitySegment.getUserCreationDate());
                }
            } catch (JSONException unused) {
            }
            c1050.m5831(decrypt, jSONObject);
        }
    }
}
