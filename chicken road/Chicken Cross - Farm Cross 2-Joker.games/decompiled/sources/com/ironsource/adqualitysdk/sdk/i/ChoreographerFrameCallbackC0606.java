package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC0606 implements Choreographer.FrameCallback {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0605 f1579;

    public ChoreographerFrameCallbackC0606(C0605 c0605) {
        this.f1579 = c0605;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        try {
            AbstractC1145.m5895(this.f1579);
        } catch (Throwable th) {
            String decrypt = StringFog.decrypt("1QZ0YcWbgt7tMWFf\n", "lGIlFKT366o=\n");
            AbstractC0544.m5511(decrypt, decrypt, StringFog.decrypt("2HO61Ef4DGjRVKHZTPk=\n", "vhLTuCKcLAw=\n"), th, null, false);
        }
    }
}
