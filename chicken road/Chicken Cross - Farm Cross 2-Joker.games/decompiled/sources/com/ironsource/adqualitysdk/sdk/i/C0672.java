package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.Any;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.দ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0672 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1837;

    public C0672(C0582 c0582) {
        this.f1837 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1837;
        Any any = (Any) arrayList.get(0);
        c0582.getClass();
        return any.getValue();
    }
}
