package com.fyber.inneractive.sdk.config;

import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public enum b1 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO(ExifInterface.GPS_MEASUREMENT_3D),
    APP_INFO("4"),
    STORE_PROMO(CampaignEx.CLICKMODE_ON);

    String value;

    b1(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
