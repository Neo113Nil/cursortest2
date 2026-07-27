package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.comm.managers.status.APPStatus;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴸ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0946 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0804 f2649;

    public C0946(C0804 c0804) {
        this.f2649 = c0804;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0804 c0804 = this.f2649;
        APPStatus aPPStatus = (APPStatus) arrayList.get(0);
        c0804.getClass();
        return aPPStatus.getAPPID();
    }
}
