package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ধ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0673 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f1838;

    public C0673(C0569 c0569) {
        this.f1838 = c0569;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r5.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("Bgfg4ZQgOj4OFfr9kjwrLxgW8emIKiwk\n", "R0O/osZle2o=\n")) == false) goto L18;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f1838;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0569.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -2102692847) {
            if (str.equals(StringFog.decrypt("Fr9SwPh01yMerUjc/mjGMgi/RND6fdcu\n", "V/sNg6oxlnc=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1357644918) {
            if (hashCode == 235669401) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("TAhTqecZrbNEGkm14QW8olIaRa7wEw==\n", "DUwM6rVc7Oc=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (c == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
    }
}
