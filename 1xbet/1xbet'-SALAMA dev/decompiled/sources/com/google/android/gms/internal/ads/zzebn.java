package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import w0.d;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzebn {
    private e zza;
    private final Context zzb;

    public zzebn(Context context) {
        this.zzb = context;
    }

    public final I3.b zza() {
        try {
            d dVarA = e.a(this.zzb);
            this.zza = dVarA;
            return dVarA == null ? zzgbc.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : dVarA.d();
        } catch (Exception e7) {
            return zzgbc.zzg(e7);
        }
    }

    public final I3.b zzb(Uri uri, InputEvent inputEvent) {
        try {
            e eVar = this.zza;
            Objects.requireNonNull(eVar);
            return eVar.b(uri, inputEvent);
        } catch (Exception e7) {
            return zzgbc.zzg(e7);
        }
    }
}
