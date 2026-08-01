package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0736 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2008;

    public C0736(C0713 c0713) {
        this.f2008 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2008;
        LevelPlayImpressionData levelPlayImpressionData = (LevelPlayImpressionData) arrayList.get(0);
        c0713.getClass();
        return levelPlayImpressionData.getAllData();
    }
}
