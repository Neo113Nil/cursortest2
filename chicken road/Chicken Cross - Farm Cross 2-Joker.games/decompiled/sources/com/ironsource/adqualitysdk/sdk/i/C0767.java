package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0767 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2204;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f2205 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f2206;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0516 f2207;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0482 f2208;

    static {
        StringFog.decrypt("zk8Y5ChsEjo=\n", "nCp1i1wJVng=\n");
        StringFog.decrypt("x+rWHyJZYU3YttwKaV9iAMH92hMzXmRM\n", "s5i3fEc7AC4=\n");
        StringFog.decrypt("hEv+Ohw2KFuSR+MyBHoxTJU=\n", "9ySRV3BXBSg=\n");
        f2204 = StringFog.decrypt("w2+aUhbLJ0qLELsGMcl5DaU64ggfjTNXhC2sTw7OMFfKD6cPDM5kXNIhoVcfnWVKkyHgWhmKclCz\nJrxxDrdlbogtuVtR0g==\n", "51/VP3r/ADk=\n");
    }

    public C0767(Context context, C0516 c0516, String str) {
        this.f2208 = new C0482(context, StringFog.decrypt("wqthqiWnkFvd92u/bqGTFsS8baY0oJVa\n", "ttkAyUDF8Tg=\n"), StringFog.decrypt("gsV4P/SxVPyUyWU37P1N65M=\n", "8aoXUpjQeY8=\n"));
        this.f2207 = c0516;
        this.f2206 = str;
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C0945 c0945 = new C0945(this);
        C0470 c0470 = (C0470) m5397;
        Handler handler = c0470.f890;
        if (handler != null) {
            handler.post(new C0506(c0470, c0945));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5655(AbstractC0597 abstractC0597, InterfaceC0823 interfaceC0823) {
        AbstractC0597 abstractC05972;
        JSONObject jSONObject;
        if (abstractC0597 instanceof C0652) {
            AbstractC0398 m5397 = AbstractC0398.m5397();
            C0470 c0470 = (C0470) m5397;
            synchronized (c0470) {
                jSONObject = c0470.f3224;
            }
            if (jSONObject.has(StringFog.decrypt("gsWu\n", "4aLYitD+6tQ=\n"))) {
                String mo5410 = m5397.mo5410();
                if (!mo5410.equals(abstractC0597.f1562)) {
                    abstractC05972 = ((C0652) abstractC0597).mo5597(mo5410);
                    String m5514 = AbstractC0548.m5514("OA==\n", "F216m3kak3I=\n", new StringBuilder().append(m5656()), abstractC05972.mo5550());
                    String replace = abstractC05972.mo5550().replace(StringFog.decrypt("ZQ==\n", "SiLaLQOwaGY=\n"), StringFog.decrypt("bA==\n", "Qh+sV5WatUk=\n"));
                    if (AbstractC0398.m5397().mo5402()) {
                        return;
                    }
                    if (AbstractC0398.m5397().mo5401() || this.f2208.m5468(replace) == null) {
                        C0808 c0808 = new C0808(this, m5514, abstractC0597, replace, interfaceC0823);
                        String str = AbstractC0494.f1141;
                        try {
                            Executors.newSingleThreadExecutor().execute(c0808);
                            return;
                        } catch (Throwable th) {
                            AbstractC0480.m5464(AbstractC0494.f1141, StringFog.decrypt("dEtqo30ULuFUWm24ZlosuVBKYaJsFD/4QlI=\n", "MTkYzA80S5k=\n"), th, false);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        abstractC05972 = abstractC0597;
        String m55142 = AbstractC0548.m5514("OA==\n", "F216m3kak3I=\n", new StringBuilder().append(m5656()), abstractC05972.mo5550());
        String replace2 = abstractC05972.mo5550().replace(StringFog.decrypt("ZQ==\n", "SiLaLQOwaGY=\n"), StringFog.decrypt("bA==\n", "Qh+sV5WatUk=\n"));
        if (AbstractC0398.m5397().mo5402()) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5657(AbstractC0597 abstractC0597, InterfaceC0823 interfaceC0823) {
        boolean z;
        if (TextUtils.isEmpty(abstractC0597.f1564) || TextUtils.isEmpty(abstractC0597.f1562)) {
            return null;
        }
        String replace = abstractC0597.mo5550().replace(StringFog.decrypt("ZQ==\n", "SiLaLQOwaGY=\n"), StringFog.decrypt("bA==\n", "Qh+sV5WatUk=\n"));
        synchronized (this) {
            if (AbstractC0398.m5397().mo5405()) {
                z = true;
            } else {
                this.f2205.add(new C0918(this, abstractC0597, interfaceC0823));
                z = false;
            }
        }
        if (z) {
            m5655(abstractC0597, interfaceC0823);
        }
        return this.f2208.m5468(replace);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m5656() {
        return this.f2206;
    }
}
