package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.D;
import p090m3.c;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
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
            byte[] bArrG = c.g(context, str);
            if (bArrG != null) {
                this.zzb = c.c(bArrG);
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
