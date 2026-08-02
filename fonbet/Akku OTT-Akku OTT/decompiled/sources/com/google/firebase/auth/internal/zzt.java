package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.auth.ActionCodeEmailInfo;

/* loaded from: classes4.dex */
public final class zzt extends ActionCodeEmailInfo {
    private final String zza;

    public zzt(String str, String str2) {
        C0875q.d(str);
        this.email = str;
        C0875q.d(str2);
        this.zza = str2;
    }

    @Override // com.google.firebase.auth.ActionCodeEmailInfo
    public final String getPreviousEmail() {
        return this.zza;
    }
}
