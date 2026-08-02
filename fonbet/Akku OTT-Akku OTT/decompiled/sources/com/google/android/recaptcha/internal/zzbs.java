package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.C0856f;

/* loaded from: classes4.dex */
public final class zzbs {
    private final C0856f zza;

    public zzbs() {
        this.zza = C0856f.b;
    }

    public final int zza(Context context) {
        int b = this.zza.b(context);
        return (b == 1 || b == 3 || b == 9) ? 4 : 3;
    }

    public zzbs(C0856f c0856f) {
        this.zza = c0856f;
    }
}
