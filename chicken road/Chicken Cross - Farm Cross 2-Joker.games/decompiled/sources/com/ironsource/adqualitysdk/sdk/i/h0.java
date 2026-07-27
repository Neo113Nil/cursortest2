package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class h0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f198;

    public h0(o0 o0Var) {
        this.f198 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f198;
        VideoController videoController = (VideoController) arrayList.get(0);
        VideoEventListener videoEventListener = (VideoEventListener) arrayList.get(1);
        o0Var.getClass();
        videoController.setVideoEventListener(videoEventListener);
        return null;
    }
}
