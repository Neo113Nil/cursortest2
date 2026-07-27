package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾘ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1314 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f3788;

    public C1314(C1305 c1305) {
        this.f3788 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f3788;
        WeakHashMap weakHashMap = (WeakHashMap) arrayList.get(0);
        c1305.getClass();
        return new C1309(c1305, weakHashMap, c0807);
    }
}
