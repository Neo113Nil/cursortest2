package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ț, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0383 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0357 f492;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1239 f493;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f494;

    public C0383(C0357 c0357, int i, C1239 c1239) {
        this.f492 = c0357;
        this.f494 = i;
        this.f493 = c1239;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        HashMap hashMap;
        ArrayList arrayList = new ArrayList();
        C0357 c0357 = this.f492;
        C0482 c0482 = c0357.f454;
        String str = c0357.f455 + StringFog.decrypt("uQ==\n", "k/jdGQcDprQ=\n");
        int i = this.f494;
        C0839 c0839 = c0482.f930;
        c0839.getClass();
        try {
            HashMap m5679 = c0839.f2447.m5679(str, i);
            hashMap = new HashMap();
            for (String str2 : m5679.keySet()) {
                String str3 = (String) m5679.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        hashMap.put(str2, c0839.f2448.m5684(str3));
                    } catch (C0879 unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
            hashMap = null;
        }
        for (String str4 : hashMap.values()) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                arrayList.add(new C0414(jSONObject.optString(StringFog.decrypt("dTuFWw==\n", "AE7sP2XluuU=\n")), jSONObject.getJSONObject(StringFog.decrypt("EHHGFC9dzRE=\n", "YB61YGs8uXA=\n"))));
            } catch (Exception unused3) {
                AbstractC0544.m5511(C0357.m5388(this.f492), StringFog.decrypt("8loJ/HHA5B3DWg3x\n", "sTtqlBSTkHI=\n"), AbstractC0548.m5514("uLW/u9wN0Sjbubiy2ReTfJi7qb/dB9Y5jb+ko5ZDhSiJs6SwmBWXMI6/8Pc=\n", "+9rK17hj9lw=\n", new StringBuilder(), str4), null, null, true);
            }
        }
        AbstractC1145.m5891(new C0392(this, arrayList));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5391(Throwable th) {
        super.mo5391(th);
        AbstractC1145.m5891(new C0386(this));
    }
}
