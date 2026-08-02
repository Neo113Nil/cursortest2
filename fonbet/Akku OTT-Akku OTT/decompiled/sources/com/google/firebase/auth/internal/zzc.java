package com.google.firebase.auth.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzc implements OnFailureListener {
    private final /* synthetic */ FirebaseAuth zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzcg zzf;
    private final /* synthetic */ TaskCompletionSource zzg;
    private final /* synthetic */ zzb zzh;

    public zzc(zzb zzbVar, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z, boolean z2, zzcg zzcgVar, TaskCompletionSource taskCompletionSource) {
        this.zza = firebaseAuth;
        this.zzb = str;
        this.zzc = activity;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzcgVar;
        this.zzg = taskCompletionSource;
        Objects.requireNonNull(zzbVar);
        this.zzh = zzbVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        String unused;
        unused = zzb.zza;
        exc.getMessage();
        if (this.zza.zzb().zza("PHONE_PROVIDER")) {
            this.zzh.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (TaskCompletionSource<zzj>) this.zzg);
        } else {
            this.zzg.setResult(new zzm().zza());
        }
    }
}
