package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0729 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f2001;

    public C0729(C0569 c0569) {
        this.f2001 = c0569;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("GG498ZH5LwEcfSjrhPE1BgZuNfyR\n", "SCJ8stS0ak8=\n")) == false) goto L13;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f2001;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0569.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1097819034) {
            if (hashCode == 1554700484) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("FhtjppMzdSsSCHa8hjtvIxMbbraVLHUgCA==\n", "Rlci5dZ+MGU=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (c != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }
}
