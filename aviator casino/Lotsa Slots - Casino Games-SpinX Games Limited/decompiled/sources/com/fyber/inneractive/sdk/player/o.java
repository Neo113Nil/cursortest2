package com.fyber.inneractive.sdk.player;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4156a;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        f4156a = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f4156a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f4156a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f4156a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f4156a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
