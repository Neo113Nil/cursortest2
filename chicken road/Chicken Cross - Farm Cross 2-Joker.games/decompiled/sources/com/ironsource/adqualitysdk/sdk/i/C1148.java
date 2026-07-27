package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.לּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1148 implements InterfaceC0942 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3293;

    public C1148(C1022 c1022) {
        this.f3293 = c1022;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0942
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5664() {
        String m5657;
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C0767 c0767 = this.f3293.f3039.f2608;
        C1161 c1161 = ((C0470) m5397).f3223;
        c1161.getClass();
        String decrypt = StringFog.decrypt("31RFtXy5e+/A\n", "qyYk1hnbGow=\n");
        String decrypt2 = StringFog.decrypt("e2d9\n", "TElN/z4/X8I=\n");
        C1219 c1219 = new C1219(c1161);
        c0767.getClass();
        C0749 c0749 = new C0749(decrypt, decrypt2);
        if (((C0470) AbstractC0398.m5397()).f887.m5616()) {
            String m5617 = ((C0470) AbstractC0398.m5397()).f887.m5617(decrypt);
            if (TextUtils.isEmpty(m5617)) {
                m5657 = null;
                if (TextUtils.isEmpty(m5657)) {
                    try {
                        c1161.f3327 = new JSONObject(m5657);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                return;
            }
            c0749 = new C0711(decrypt, decrypt2, m5617);
        }
        m5657 = c0767.m5657(c0749, c1219);
        if (TextUtils.isEmpty(m5657)) {
        }
    }
}
