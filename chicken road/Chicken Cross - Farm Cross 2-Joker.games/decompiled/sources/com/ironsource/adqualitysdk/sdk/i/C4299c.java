package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4299c implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4304h f149;

    public C4299c(C4304h c4304h) {
        this.f149 = c4304h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4304h c4304h = this.f149;
        Repository repository = (Repository) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c4304h.getClass();
        return (Placement) repository.load(str, Placement.class).get();
    }
}
