package com.fyber.inneractive.sdk.network.timeouts.content;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.network.timeouts.a {
    public final int h;

    public a(java.lang.String str, java.lang.String str2, int i, boolean z, java.lang.String str3, com.fyber.inneractive.sdk.config.global.r rVar) {
        int intValue;
        com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
        this.h = 0;
        java.lang.Boolean c = kVar.c("reverse_retries");
        this.g = c != null ? c.booleanValue() : true;
        if (z) {
            intValue = kVar.b(str, str3);
        } else if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.String str4 = str + "_global_timeout";
            int i2 = com.fyber.inneractive.sdk.config.global.features.k.d(str) ? 30000 : 10000;
            java.lang.Integer a2 = kVar.a(str4);
            intValue = a2 != null ? a2.intValue() : i2;
        } else {
            intValue = kVar.c(str, str3);
        }
        if (intValue > i) {
            if (android.text.TextUtils.isEmpty(str3)) {
                java.lang.Integer a3 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a(str, str2, "retry_interval"));
                this.e = a3 != null ? a3.intValue() : 100;
                java.lang.Integer a4 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold"));
                this.f = a4 != null ? a4.intValue() : androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
                java.lang.String a5 = com.fyber.inneractive.sdk.config.global.features.k.a(str, str2, "ilat");
                int i3 = com.fyber.inneractive.sdk.config.global.features.k.d(str) ? androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : 10000;
                java.lang.Integer a6 = kVar.a(a5);
                this.d = a6 != null ? a6.intValue() : i3;
            } else {
                java.lang.String a7 = com.fyber.inneractive.sdk.config.global.features.k.a(str, str2, "retry_interval", com.fyber.inneractive.sdk.config.global.features.k.e(str3));
                java.lang.Integer a8 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("retry_interval", "all_mediators"));
                int intValue2 = a8 != null ? a8.intValue() : 100;
                java.lang.Integer a9 = kVar.a(a7);
                this.e = a9 != null ? a9.intValue() : intValue2;
                java.lang.String a10 = com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", com.fyber.inneractive.sdk.config.global.features.k.e(str3));
                java.lang.Integer a11 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", "all_mediators"));
                int intValue3 = a11 != null ? a11.intValue() : androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
                java.lang.Integer a12 = kVar.a(a10);
                this.f = a12 != null ? a12.intValue() : intValue3;
                java.lang.String a13 = com.fyber.inneractive.sdk.config.global.features.k.a(str, str2, "ilat", com.fyber.inneractive.sdk.config.global.features.k.e(str3));
                java.lang.String a14 = com.fyber.inneractive.sdk.config.global.features.k.a(str, str2, "ilat", "all_mediators");
                int i4 = com.fyber.inneractive.sdk.config.global.features.k.d(str) ? androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : 10000;
                java.lang.Integer a15 = kVar.a(a14);
                i4 = a15 != null ? a15.intValue() : i4;
                java.lang.Integer a16 = kVar.a(a13);
                this.d = a16 != null ? a16.intValue() : i4;
            }
        }
        int i5 = intValue - (this.f + i);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.network.timeouts.content.a.class), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i5));
        this.c = java.lang.Math.max(i5, 0);
        int a17 = a();
        this.f3858a = a17;
        if (a17 == 0) {
            this.d = this.c;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.f3858a), 0);
        int i6 = this.f3858a;
        if (i6 > 0) {
            int i7 = this.c;
            int i8 = this.f;
            int i9 = this.e;
            for (int i10 = 0; i10 <= i6; i10++) {
                i7 -= (this.b * i10) + this.d;
            }
            this.h = java.lang.Math.max(0, i7 - ((i9 * i6) + (i8 * i6)));
        }
    }
}
