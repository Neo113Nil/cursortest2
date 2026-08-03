package com.moloco.sdk.internal.services.proto;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.moloco.sdk.internal.services.proto.a$a, reason: collision with other inner class name */
    public static final class C0206a {
        public static /* synthetic */ java.lang.String a(com.moloco.sdk.internal.services.proto.a aVar, com.moloco.sdk.UserIntent.UserAdInteractionExt userAdInteractionExt, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeUserAdInteractionExt");
            }
            if ((i2 & 2) != 0) {
                i = 10;
            }
            return aVar.a(userAdInteractionExt, i);
        }
    }

    java.lang.String a(com.moloco.sdk.UserIntent.UserAdInteractionExt userAdInteractionExt, int i);
}
