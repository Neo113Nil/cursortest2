package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum eh {
    Unknown,
    InvalidMrzKey,
    ResponseError,
    ConnectionError,
    UnknownRetry,
    IncompatibleDoc;

    /* renamed from: com.facetec.sdk.eh$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.eh.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.eh.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.eh.InvalidMrzKey.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.eh.ResponseError.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.eh.ConnectionError.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                d[com.facetec.sdk.eh.UnknownRetry.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                d[com.facetec.sdk.eh.IncompatibleDoc.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
