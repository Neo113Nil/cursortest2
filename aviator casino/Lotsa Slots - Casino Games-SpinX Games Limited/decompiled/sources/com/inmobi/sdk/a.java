package com.inmobi.sdk;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5600a;

    static {
        int[] iArr = new int[com.inmobi.sdk.InMobiSdk.LogLevel.values().length];
        try {
            iArr[com.inmobi.sdk.InMobiSdk.LogLevel.NONE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.inmobi.sdk.InMobiSdk.LogLevel.ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.inmobi.sdk.InMobiSdk.LogLevel.DEBUG.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        f5600a = iArr;
    }
}
