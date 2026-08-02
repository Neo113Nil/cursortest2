package com.google.android.gms.internal.auth;

import W2.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final q addWorkAccount(o oVar, String str) {
        return ((F) oVar).f11115b.doWrite((l) new zzae(this, a.f6692a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return ((F) oVar).f11115b.doWrite((l) new zzag(this, a.f6692a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z4) {
        setWorkAuthenticatorEnabledWithResult(oVar, z4);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z4) {
        return ((F) oVar).f11115b.doWrite((l) new zzac(this, a.f6692a, oVar, z4));
    }
}
