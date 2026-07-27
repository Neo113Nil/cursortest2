package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1087 implements InterfaceC1002 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1050 f3201;

    public C1087(C1050 c1050) {
        this.f3201 = c1050;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5876(C1087 c1087, Activity activity) {
        c1087.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringFog.decrypt("IGz2EBFMSQ==\n", "QQ+CXnAhLH8=\n"), activity.getClass().getName());
        } catch (JSONException unused) {
            AbstractC0544.m5502(StringFog.decrypt("17z6nyA16Obl\n", "ltKb81lBgYU=\n"), StringFog.decrypt("6tEW0cLHQXnLygrZkIZDacbVDcrJx058wsY=\n", "r6NkvrDnIB0=\n"));
        }
        return jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1002
    /* renamed from: ﾇ */
    public final void mo5725(Activity activity) {
        AbstractC1145.m5892(new C1093(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1002
    /* renamed from: ﾒ */
    public final void mo5726(Activity activity) {
        AbstractC1145.m5892(new C1097(this, activity));
    }
}
