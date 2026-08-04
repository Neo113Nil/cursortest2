package com.google.android.recaptcha.internal;

import C6.o;
import t6.e;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzcy {
    private zzcy() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String strY0 = o.y0("18.5.1", ".", "");
        int iT0 = o.t0(0, 6, strY0, "-", false);
        if (iT0 != -1) {
            strY0 = strY0.substring(0, iT0);
            h.d(strY0, "substring(...)");
        }
        return Integer.parseInt(strY0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(o.C0("18.5.1", "-", ""));
    }

    public /* synthetic */ zzcy(e eVar) {
    }
}
