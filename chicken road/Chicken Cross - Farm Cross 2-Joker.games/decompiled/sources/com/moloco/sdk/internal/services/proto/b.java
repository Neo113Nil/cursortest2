package com.moloco.sdk.internal.services.proto;

import android.util.Base64;
import com.moloco.sdk.UserIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10830a = 0;

    @Override // com.moloco.sdk.internal.services.proto.a
    public String a(UserIntent.UserAdInteractionExt input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        String encodeToString = Base64.encodeToString(input.toByteArray(), i);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
