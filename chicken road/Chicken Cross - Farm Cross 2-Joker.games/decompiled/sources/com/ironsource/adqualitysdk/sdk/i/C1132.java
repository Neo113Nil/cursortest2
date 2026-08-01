package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.יִ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1132 implements InterfaceC0942 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0988 f3268;

    public C1132(C0988 c0988) {
        this.f3268 = c0988;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0942
    /* renamed from: ﾒ */
    public final void mo5664() {
        JSONObject jSONObject;
        C0936 c0936 = ((C0470) AbstractC0398.m5397()).f888;
        synchronized (c0936) {
            jSONObject = c0936.f3224;
        }
        long optLong = jSONObject.optLong(C0936.f2630, 0L);
        if (optLong == 0) {
            this.f3268.f2913 = Boolean.FALSE;
            optLong = c0936.m5772();
            AbstractC0480.m5464(StringFog.decrypt("qUtQgzeGlfGNcUSIJ5qG85NLR4M2\n", "/SI95kTy9Jw=\n"), StringFog.decrypt("l1jA+0Fy48XyTdfgRzvkzPJZ1+ZFN/iLpkPf8UAm68ai\n", "0iqylDNSiqs=\n"), (Throwable) null, false);
        } else {
            this.f3268.f2913 = Boolean.TRUE;
        }
        this.f3268.f2912 = c0936.m5771();
        this.f3268.f2911 = c0936.m5772();
        C0988 c0988 = this.f3268;
        c0988.f2910 = optLong - c0988.f2912;
        c0988.f2909 = optLong - c0988.f2911;
    }
}
