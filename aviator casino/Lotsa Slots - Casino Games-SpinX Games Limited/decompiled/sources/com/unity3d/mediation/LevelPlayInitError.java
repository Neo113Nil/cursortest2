package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayInitError {

    /* renamed from: a, reason: collision with root package name */
    private final int f8038a;
    private final java.lang.String b;

    public LevelPlayInitError(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f8038a = i;
        this.b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f8038a;
    }

    public final java.lang.String getErrorMessage() {
        return this.b;
    }

    public java.lang.String toString() {
        return "LevelPlayError(errorCode=" + this.f8038a + ", errorMessage='" + this.b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(com.ironsource.C3226pe sdkError) {
        this(sdkError.c(), sdkError.d());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
