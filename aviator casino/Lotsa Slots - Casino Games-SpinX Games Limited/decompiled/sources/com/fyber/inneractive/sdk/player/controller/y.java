package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3898a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.values().length];
        b = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.STORE_PROMO.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            b[com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.APP_INFO.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        f3898a = iArr2;
        try {
            iArr2[com.fyber.inneractive.sdk.player.enums.b.Start_in_progress.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Error.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Preparing.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f3898a[com.fyber.inneractive.sdk.player.enums.b.Seeking.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
