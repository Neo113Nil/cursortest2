package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖬ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0887 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2512;

    public C0887(C0759 c0759) {
        this.f2512 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2512;
        Context context = (Context) arrayList.get(0);
        String str = (String) arrayList.get(1);
        String str2 = (String) arrayList.get(2);
        c0759.getClass();
        AppLovinCommunicator.getInstance(context).subscribe(new C0814(str), str2);
        return null;
    }
}
