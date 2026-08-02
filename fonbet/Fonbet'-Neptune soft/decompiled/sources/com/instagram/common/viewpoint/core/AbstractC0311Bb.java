package com.instagram.common.viewpoint.core;

import android.util.Log;

/* renamed from: com.facebook.ads.redexgen.X.Bb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0311Bb implements InterfaceC1329gE {
    public int A00;

    @Override // com.instagram.common.viewpoint.core.InterfaceC1329gE
    public final void A9l(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1329gE
    public final void A9m(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1329gE
    public final boolean AAP(int i) {
        return this.A00 <= i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1329gE
    public final void AIo(int i) {
        this.A00 = i;
    }
}
