package com.payair.db.token;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4365a;

    static {
        int[] iArr = new int[com.payair.model.TokenStatus.values().length];
        f4365a = iArr;
        try {
            iArr[com.payair.model.TokenStatus.ACTIVE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.INACTIVE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.SUSPENDED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.DEACTIVATED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.DECLINED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.DELETED.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f4365a[com.payair.model.TokenStatus.UNKNOWN.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
