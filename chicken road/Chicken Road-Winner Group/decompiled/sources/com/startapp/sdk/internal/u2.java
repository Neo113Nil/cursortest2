package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4408a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f4408a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4408a[AdPreferences.Placement.INAPP_OFFER_WALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4408a[AdPreferences.Placement.INAPP_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4408a[AdPreferences.Placement.INAPP_SPLASH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
