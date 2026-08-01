package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ґ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0531 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0337 f1198;

    public C0531(C0337 c0337) {
        this.f1198 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0337 c0337 = this.f1198;
        InneractiveContentController inneractiveContentController = (InneractiveContentController) arrayList.get(0);
        VideoContentListener videoContentListener = (VideoContentListener) arrayList.get(1);
        c0337.getClass();
        inneractiveContentController.setEventsListener(videoContentListener);
        return null;
    }
}
