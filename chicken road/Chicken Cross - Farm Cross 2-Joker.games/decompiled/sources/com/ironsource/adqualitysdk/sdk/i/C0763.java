package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdInteractor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0763 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2198;

    public C0763(C0441 c0441) {
        this.f2198 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2198;
        AdInteractor adInteractor = (AdInteractor) arrayList.get(0);
        StateMachine.Listener listener = (StateMachine.Listener) arrayList.get(1);
        c0441.getClass();
        adInteractor.addStateListener(listener);
        return null;
    }
}
