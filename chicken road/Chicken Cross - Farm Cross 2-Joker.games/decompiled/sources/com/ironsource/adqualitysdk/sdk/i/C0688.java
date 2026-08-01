package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ก, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0688 extends AbstractRunnableC0730 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f1875;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0773 f1876;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f1877;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f1878;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f1879;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f1880;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1881;

    public C0688(C0682 c0682, String str, Context context, String str2, List list, LinkedHashMap linkedHashMap, C0773 c0773) {
        this.f1875 = c0682;
        this.f1881 = str;
        this.f1880 = context;
        this.f1879 = str2;
        this.f1878 = list;
        this.f1877 = linkedHashMap;
        this.f1876 = c0773;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        AbstractC0398 m5397 = AbstractC0398.m5397();
        String str = this.f1881;
        String str2 = this.f1875.f1859;
        C1033 c1033 = (C1033) ((C0470) m5397).mo5407().get(str);
        if (c1033 != null && c1033.m5807(str2)) {
            JSONObject jSONObject = new JSONObject();
            this.f1875.m5635(this.f1881, jSONObject);
            C0682.m5621(this.f1875).put(this.f1881, jSONObject);
            AbstractC1145.m5894(new C0726(this), AbstractC0398.m5397().mo5408());
            return;
        }
        C0682 c0682 = this.f1875;
        Context context = this.f1880;
        String str3 = this.f1879;
        String str4 = this.f1881;
        List list = this.f1878;
        C0755 c0755 = new C0755(this);
        c0682.getClass();
        AbstractC1145.m5895(new C0922(c0682, str4, context, str3, list, c0755));
    }
}
