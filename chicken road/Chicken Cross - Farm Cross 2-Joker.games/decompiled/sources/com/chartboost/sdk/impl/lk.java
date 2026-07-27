package com.chartboost.sdk.impl;

import android.content.Context;

/* loaded from: classes4.dex */
public interface lk {

    public static final class a {
        public static /* synthetic */ void a(lk lkVar, String str, int i, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            lkVar.a(str, i, z);
        }
    }

    int a(wj wjVar);

    wj a(String str);

    void a(Context context);

    void a(String str, int i, boolean z);

    void a(String str, String str2, boolean z, t0 t0Var);

    boolean b(String str);
}
