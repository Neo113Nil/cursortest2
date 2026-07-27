package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.request.WebRequestEvent;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˇ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0444 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f741;

    public C0444(C0449 c0449) {
        this.f741 = c0449;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("3cGak04orGc=\n", "no7XwwJt+CI=\n")) != false) goto L14;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f741;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0449.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 183181625) {
            if (hashCode == 2066319421 && str.equals(StringFog.decrypt("LP6k8i1V\n", "ar/tvmgRakU=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (c != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }
}
