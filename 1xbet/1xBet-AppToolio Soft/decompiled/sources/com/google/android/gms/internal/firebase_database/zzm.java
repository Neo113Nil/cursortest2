package com.google.android.gms.internal.firebase_database;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.GetTokenResult;

/* loaded from: classes.dex */
final class zzm implements OnSuccessListener<GetTokenResult> {
    private final /* synthetic */ zzbr zzbe;

    zzm(zzk zzkVar, zzbr zzbrVar) {
        this.zzbe = zzbrVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(GetTokenResult getTokenResult) {
        this.zzbe.zzf(getTokenResult.getToken());
    }
}
