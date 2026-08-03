package com.ironsource;

/* loaded from: classes5.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Y9 f6100a = new com.ironsource.Y9();

    private Y9() {
    }

    @kotlin.jvm.JvmStatic
    public static final <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean a(java.lang.Object obj) {
        return a(obj, null, false, 6, null);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean a(java.lang.Object obj, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(java.lang.Object obj, java.lang.String str, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean a(java.lang.Object obj, java.lang.String errorMessage, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new java.lang.NullPointerException(errorMessage);
        }
        if (!z) {
            com.ironsource.mediationsdk.logger.IronLog.API.error(errorMessage);
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
