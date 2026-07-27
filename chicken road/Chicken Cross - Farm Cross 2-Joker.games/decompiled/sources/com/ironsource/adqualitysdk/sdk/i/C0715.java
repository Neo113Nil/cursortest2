package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ใ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0715 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f1983;

    public C0715(C0569 c0569) {
        this.f1983 = c0569;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r5.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("HjZ0e9Qc8tEPLX9vxQvmzRE/dH7BA/U=\n", "X3IrNpVOuYQ=\n")) != false) goto L19;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f1983;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0569.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 556003820) {
            if (hashCode != 556062505) {
                if (hashCode == 1382961856 && str.equals(StringFog.decrypt("Fu6UNz+V59kH9Z8jLoLz2RnhhTUpiQ==\n", "V6rLen7HrIw=\n"))) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("8bS7dOxJ71Lgr7Bg/V77Tv69u3P+VOo=\n", "sPDkOa0bpAc=\n"))) {
                    c = 1;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (c == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }
}
