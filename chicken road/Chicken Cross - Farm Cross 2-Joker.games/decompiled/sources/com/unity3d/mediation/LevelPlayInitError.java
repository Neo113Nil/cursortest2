package com.unity3d.mediation;

import com.ironsource.C4555ne;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayInitError {

    /* renamed from: a, reason: collision with root package name */
    private final int f11681a;
    private final String b;

    public LevelPlayInitError(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f11681a = i;
        this.b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f11681a;
    }

    public final String getErrorMessage() {
        return this.b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f11681a + ", errorMessage='" + this.b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C4555ne sdkError) {
        this(sdkError.c(), sdkError.d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
