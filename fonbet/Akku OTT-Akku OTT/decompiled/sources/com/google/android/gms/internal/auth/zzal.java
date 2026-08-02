package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;

/* loaded from: classes4.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final i<Object> addWorkAccount(h hVar, String str) {
        return hVar.b(new zzae(this, a.a, hVar, str));
    }

    public final i<l> removeWorkAccount(h hVar, Account account) {
        return hVar.b(new zzag(this, a.a, hVar, account));
    }

    public final void setWorkAuthenticatorEnabled(h hVar, boolean z) {
        setWorkAuthenticatorEnabledWithResult(hVar, z);
    }

    public final i<l> setWorkAuthenticatorEnabledWithResult(h hVar, boolean z) {
        return hVar.b(new zzac(this, a.a, hVar, z));
    }
}
