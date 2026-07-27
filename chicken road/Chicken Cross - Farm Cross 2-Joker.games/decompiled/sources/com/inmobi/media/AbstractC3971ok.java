package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3971ok {
    public static boolean a(Pa initRequest) {
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        if (initRequest.c != 2) {
            return false;
        }
        String str = AbstractC3914mk.c;
        if (str == null) {
            str = AbstractC4027qk.c == 1 ? AbstractC4027qk.g.f7184a : null;
        }
        if (str == null) {
            return false;
        }
        String str2 = initRequest.b;
        if (str2 == null) {
            throw new IllegalArgumentException("Account ID must be resolved before account policy evaluation.");
        }
        if (Intrinsics.areEqual(str, str2)) {
            return false;
        }
        Kc.a((byte) 1, "InMobiSdk", "The InMobi SDK is already initialized or is initializing with a different account ID. Initialization with a different account ID is not allowed in the current app session. The SDK will continue using the existing account ID. To use a different account ID, please contact InMobi Customer Support.");
        return true;
    }

    public static EnumC3779i b(Pa initRequest) {
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        if (initRequest.c != 2) {
            return EnumC3779i.f7154a;
        }
        String str = AbstractC4027qk.g.f7184a;
        if (str == null) {
            return EnumC3779i.f7154a;
        }
        String str2 = initRequest.b;
        if (str2 != null) {
            return Intrinsics.areEqual(str, str2) ? EnumC3779i.f7154a : AbstractC4027qk.g.b ? EnumC3779i.c : EnumC3779i.b;
        }
        throw new IllegalArgumentException("Account ID must be resolved before account policy evaluation.");
    }
}
