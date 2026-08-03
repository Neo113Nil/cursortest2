package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Ul {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5093a;

    static {
        int[] iArr = new int[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.values().length];
        iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK.ordinal()] = 1;
        iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 2;
        iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.INVALID_ADV_ID.ordinal()] = 3;
        iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FEATURE_DISABLED.ordinal()] = 4;
        iArr[io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 5;
        f5093a = iArr;
    }
}
