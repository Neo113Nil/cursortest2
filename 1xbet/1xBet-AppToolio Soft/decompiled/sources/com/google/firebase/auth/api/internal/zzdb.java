package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
final class zzdb extends zzci {
    final /* synthetic */ zzcy zziw;

    private zzdb(zzcy zzcyVar) {
        this.zziw = zzcyVar;
    }

    private final void zza(zzdh zzdhVar) {
        this.zziw.zzij.execute(new zzdg(this, zzdhVar));
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void onFailure(@NonNull Status status) throws RemoteException {
        if (this.zziw.zzia != 8) {
            this.zziw.zzd(status);
            this.zziw.zzc(status);
        } else {
            zzcy.zza(this.zziw, true);
            this.zziw.zzis = false;
            zza(new zzdf(this, status));
        }
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        boolean z = this.zziw.zzia == 8;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy.zza(this.zziw, true);
        this.zziw.zzis = true;
        zza(new zzdd(this, phoneAuthCredential));
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(@NonNull Status status, @NonNull PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        if (this.zziw.zzik == null) {
            onFailure(status);
        } else {
            zzcy.zza(this.zziw, true);
            this.zziw.zzik.zza(status, phoneAuthCredential);
        }
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(@NonNull com.google.android.gms.internal.firebase_auth.zzao zzaoVar, @NonNull com.google.android.gms.internal.firebase_auth.zzaj zzajVar) throws RemoteException {
        boolean z = this.zziw.zzia == 2;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzil = zzaoVar;
        zzcyVar.zzim = zzajVar;
        zzcyVar.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(@Nullable com.google.android.gms.internal.firebase_auth.zzav zzavVar) throws RemoteException {
        boolean z = this.zziw.zzia == 4;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzio = zzavVar;
        zzcyVar.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(@NonNull com.google.android.gms.internal.firebase_auth.zzx zzxVar) throws RemoteException {
        boolean z = this.zziw.zzia == 3;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzin = zzxVar;
        zzcyVar.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzac() throws RemoteException {
        boolean z = this.zziw.zzia == 5;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        this.zziw.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzad() throws RemoteException {
        boolean z = this.zziw.zzia == 6;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        this.zziw.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzae() throws RemoteException {
        boolean z = this.zziw.zzia == 9;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        this.zziw.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzb(@NonNull com.google.android.gms.internal.firebase_auth.zzao zzaoVar) throws RemoteException {
        boolean z = this.zziw.zzia == 1;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzil = zzaoVar;
        zzcyVar.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzd(@NonNull String str) throws RemoteException {
        boolean z = this.zziw.zzia == 7;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzip = str;
        zzcyVar.zzam();
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zze(@NonNull String str) throws RemoteException {
        boolean z = this.zziw.zzia == 8;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        this.zziw.zzey = str;
        zza(new zzdc(this, str));
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzf(@NonNull String str) throws RemoteException {
        boolean z = this.zziw.zzia == 8;
        int i = this.zziw.zzia;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zzcy zzcyVar = this.zziw;
        zzcyVar.zzey = str;
        zzcy.zza(zzcyVar, true);
        this.zziw.zzis = true;
        zza(new zzde(this, str));
    }
}
