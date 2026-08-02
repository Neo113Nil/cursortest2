package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;

/* loaded from: classes4.dex */
public final class zzv extends ActionCodeMultiFactorInfo {
    private final MultiFactorInfo zza;

    public zzv(String str, MultiFactorInfo multiFactorInfo) {
        C0875q.d(str);
        this.email = str;
        C0875q.g(multiFactorInfo);
        this.zza = multiFactorInfo;
    }

    @Override // com.google.firebase.auth.ActionCodeMultiFactorInfo
    public final MultiFactorInfo getMultiFactorInfo() {
        return this.zza;
    }
}
