package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4303g implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4304h f157;

    public C4303g(C4304h c4304h) {
        this.f157 = c4304h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4304h c4304h = this.f157;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c4304h.getClass();
        return advertisement.getDownloadableUrls();
    }
}
