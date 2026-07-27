package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.‿, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1070 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1057 f3174;

    public C1070(C1057 c1057) {
        this.f3174 = c1057;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1057 c1057 = this.f3174;
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) arrayList.get(0);
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) arrayList.get(1);
        c1057.getClass();
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        return null;
    }
}
