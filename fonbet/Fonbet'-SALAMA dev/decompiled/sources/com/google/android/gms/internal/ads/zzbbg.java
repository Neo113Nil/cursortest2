package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.D;
import java.util.concurrent.Callable;
import n3.AbstractC1464a;
import n3.c;

/* loaded from: classes.dex */
public final class zzbbg {
    private final Context zza;

    public zzbbg(Context context) {
        D.j(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(Intent intent) {
        D.j(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean) AbstractC1464a.e0(this.zza, new Callable() { // from class: com.google.android.gms.internal.ads.zzbbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && ((Context) c.a(this.zza).f15308b).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
