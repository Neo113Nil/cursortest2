package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class O {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4750a;

    static {
        int[] iArr = new int[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.values().length];
        f4750a = iArr;
        try {
            iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f4750a[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FEATURE_DISABLED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f4750a[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f4750a[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.INVALID_ADV_ID.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f4750a[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
