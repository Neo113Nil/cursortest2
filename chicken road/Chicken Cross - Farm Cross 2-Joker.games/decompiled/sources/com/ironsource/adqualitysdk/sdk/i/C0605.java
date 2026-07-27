package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0605 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0594 f1578;

    public C0605(C0594 c0594) {
        this.f1578 = c0594;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0594 c0594 = this.f1578;
        if (!c0594.f1553) {
            c0594.f1550 = null;
            return;
        }
        HashMap hashMap = new HashMap(c0594.f1552);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f1578.f1551.post((Runnable) hashMap.get((InterfaceC0810) it.next()));
        }
        C0594 c05942 = this.f1578;
        if (c05942.f1550 == null) {
            c05942.f1550 = new ChoreographerFrameCallbackC0606(this);
        }
        Choreographer.getInstance().postFrameCallback(this.f1578.f1550);
    }
}
