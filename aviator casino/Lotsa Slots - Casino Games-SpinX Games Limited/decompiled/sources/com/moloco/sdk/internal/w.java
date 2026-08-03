package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public interface w {

    public static final class a {
        public static /* synthetic */ boolean a(com.moloco.sdk.internal.w wVar, java.lang.String str, long j, com.moloco.sdk.internal.s sVar, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                sVar = null;
            }
            return wVar.a(str, j, sVar);
        }
    }

    boolean a(java.lang.String str, long j, com.moloco.sdk.internal.s sVar);
}
