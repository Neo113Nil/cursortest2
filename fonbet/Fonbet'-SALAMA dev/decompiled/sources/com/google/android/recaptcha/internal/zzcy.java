package com.google.android.recaptcha.internal;

import C6.o;
import t6.e;
import t6.h;

/* loaded from: classes.dex */
public final class zzcy {
    private zzcy() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String y02 = o.y0("18.5.1", ".", "");
        int t02 = o.t0(0, 6, y02, "-", false);
        if (t02 != -1) {
            y02 = y02.substring(0, t02);
            h.d(y02, "substring(...)");
        }
        return Integer.parseInt(y02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(o.C0("18.5.1", "-", ""));
    }

    public /* synthetic */ zzcy(e eVar) {
    }
}
