package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮁ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0734 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2006;

    public C0734(C0713 c0713) {
        this.f2006 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2006;
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = (LevelPlayImpressionDataListener) arrayList.get(0);
        c0713.getClass();
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        return null;
    }
}
