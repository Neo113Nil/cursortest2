package com.ironsource;

/* loaded from: classes6.dex */
public interface Jg {
    static /* synthetic */ Hg a(Jg jg, Pg pg, F f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWaterfall");
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return jg.a(pg, f);
    }

    Hg a(Pg pg, F f);
}
