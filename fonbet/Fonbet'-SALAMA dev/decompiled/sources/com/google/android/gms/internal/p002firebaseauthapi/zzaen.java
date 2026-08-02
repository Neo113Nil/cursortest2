package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.D;
import m3.c;
import w1.L;

/* loaded from: classes.dex */
public final class zzaen {
    private final String zza;
    private final String zzb;

    public zzaen(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzaen(Context context, String str) {
        D.i(context);
        D.e(str);
        this.zza = str;
        try {
            byte[] g3 = c.g(context, str);
            if (g3 != null) {
                this.zzb = c.c(g3);
            } else {
                L.n("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            L.n("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
