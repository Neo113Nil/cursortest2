package com.moloco.sdk.internal.error;

/* loaded from: classes5.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void a(com.moloco.sdk.internal.error.b bVar, java.lang.String str, com.moloco.sdk.internal.error.a aVar, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i & 2) != 0) {
                aVar = new com.moloco.sdk.internal.error.a(null, 1, null);
            }
            bVar.a(str, aVar);
        }
    }

    void a(java.lang.String str, com.moloco.sdk.internal.error.a aVar);
}
