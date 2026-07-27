package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class G extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ H f111;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f112;

    public G(H h, WebView webView) {
        this.f111 = h;
        this.f112 = webView;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String str;
        JSONObject jSONObject;
        H h = this.f111;
        h.getClass();
        String str2 = H.f113.f108;
        try {
            String decrypt = StringFog.decrypt("M52injLcOOc3kKqCJ9c6/i2btg==\n", "aMbr0HiZe7M=\n");
            C0679 c0679 = ((C0470) AbstractC0398.m5397()).f887;
            synchronized (c0679) {
                jSONObject = c0679.f3224;
            }
            String replace = str2.replace(decrypt, jSONObject.optString(StringFog.decrypt("Ce+x\n", "Y4bf6btt+Ew=\n"), c0679.f1850)).replace(StringFog.decrypt("qFA2tM9p0ZusQSam3w==\n", "8wt1+4IkntU=\n"), H.f113.f107);
            str = (h.f115 ? replace.replace(StringFog.decrypt("2KezrxMxEgzJr6uq\n", "g/z290djU1M=\n"), H.f113.f106) : replace.replace(StringFog.decrypt("GZN2d4lBwu0Im25y\n", "QsgzL90Tg7I=\n"), "")).replace(StringFog.decrypt("4KK9/0HxzNTvtqzvRezUyg==\n", "u/n+sA+/iZc=\n"), h.f116);
        } catch (Throwable th) {
            AbstractC0544.m5502(H.f114, StringFog.decrypt("Cje72TY3RD5vIqzCDmR5PwYro9MnYxdw\n", "T0XJtkQXLVA=\n") + th.getLocalizedMessage());
            str = str2;
        }
        AbstractC1145.m5891(new F(this, AbstractC0852.m5682(str.getBytes())));
    }
}
