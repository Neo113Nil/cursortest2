package com.android.billingclient.api;

import android.content.Context;
import androidx.collection.i;
import com.google.android.datatransport.c;
import com.google.android.datatransport.e;
import com.google.android.datatransport.g;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.p;
import com.google.android.datatransport.runtime.q;
import com.google.android.gms.internal.play_billing.zzlk;

/* loaded from: classes3.dex */
final class zzcn {
    private boolean zza;
    private h zzb;

    public zzcn(Context context) {
        try {
            q.b(context);
            this.zzb = q.a().c(com.google.android.datatransport.cct.a.e).a("PLAY_BILLING_LIBRARY", new c("proto"), new g() { // from class: com.android.billingclient.api.zzcm
                @Override // com.google.android.datatransport.g
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(zzlk zzlkVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((p) this.zzb).a(new com.google.android.datatransport.a(zzlkVar, e.a, null), new i());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "logging failed.");
        }
    }
}
