package com.moloco.sdk.internal;

/* loaded from: classes7.dex */
public interface y {

    public static final class a {
        public static /* synthetic */ boolean a(y yVar, String str, long j, t tVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                tVar = null;
            }
            return yVar.a(str, j, tVar);
        }
    }

    boolean a(String str, long j, t tVar);
}
