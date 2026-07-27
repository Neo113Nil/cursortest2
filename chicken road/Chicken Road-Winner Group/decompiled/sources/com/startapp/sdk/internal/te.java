package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class te extends ka {
    public te(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        setErrorMessage("Disabled");
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        setErrorMessage("Disabled");
        if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }
}
