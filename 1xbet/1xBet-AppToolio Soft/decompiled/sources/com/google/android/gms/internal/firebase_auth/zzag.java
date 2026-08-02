package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzag implements com.google.firebase.auth.api.internal.zzdp<zzk> {
    private String zzaf;

    public zzag(String str) {
        this.zzaf = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.api.internal.zzdp
    public final /* synthetic */ zzk zzao() {
        zzk zzkVar = new zzk();
        zzkVar.zzaf = this.zzaf;
        return zzkVar;
    }
}
