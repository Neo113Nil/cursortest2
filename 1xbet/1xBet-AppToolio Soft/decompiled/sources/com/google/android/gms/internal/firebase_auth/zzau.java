package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzau implements com.google.firebase.auth.api.internal.zzdp<zzm> {

    @Nullable
    private final String zzba;
    private final String zzgu;

    public zzau(@NonNull String str, @Nullable String str2) {
        this.zzgu = Preconditions.checkNotEmpty(str);
        this.zzba = str2;
    }

    @Override // com.google.firebase.auth.api.internal.zzdp
    public final /* synthetic */ zzm zzao() {
        zzm zzmVar = new zzm();
        zzmVar.zzag = this.zzgu;
        zzmVar.zzba = this.zzba;
        return zzmVar;
    }
}
