package com.moloco.sdk.internal.services.proto;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.services.proto.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7309a = 0;

    @Override // com.moloco.sdk.internal.services.proto.a
    public java.lang.String a(com.moloco.sdk.UserIntent.UserAdInteractionExt input, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        java.lang.String encodeToString = android.util.Base64.encodeToString(input.toByteArray(), i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
