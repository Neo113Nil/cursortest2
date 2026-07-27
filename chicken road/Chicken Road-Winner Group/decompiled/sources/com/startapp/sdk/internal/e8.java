package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class e8 extends s1 {
    public e8(Context context, xd xdVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5) {
        super(context, xdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, true);
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z3) {
        super.b(z3);
        e(z3);
    }
}
