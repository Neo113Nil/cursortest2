package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class b0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f148;

    public b0(o0 o0Var) {
        this.f148 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f148;
        MediaFile mediaFile = (MediaFile) arrayList.get(0);
        o0Var.getClass();
        return mediaFile.getUrl();
    }
}
