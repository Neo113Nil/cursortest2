package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3878a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.model.vast.i.values().length];
        b = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.model.vast.i.Static.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[com.fyber.inneractive.sdk.model.vast.i.Html.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            b[com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            b[com.fyber.inneractive.sdk.model.vast.i.Iframe.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values().length];
        f3878a = iArr2;
        try {
            iArr2[com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f3878a[com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
