package com.google.android.gms.internal.p000authapi;

import X2.b;
import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public final class zbl {
    public final q delete(o oVar, Credential credential) {
        D.j(oVar, "client must not be null");
        D.j(credential, "credential must not be null");
        return ((F) oVar).f11115b.doWrite((l) new zbi(this, oVar, credential));
    }

    public final q disableAutoSignIn(o oVar) {
        D.j(oVar, "client must not be null");
        return ((F) oVar).f11115b.doWrite((l) new zbj(this, oVar));
    }

    public final PendingIntent getHintPickerIntent(o oVar, HintRequest hintRequest) {
        D.j(oVar, "client must not be null");
        D.j(hintRequest, "request must not be null");
        i iVar = b.f7468a;
        throw new UnsupportedOperationException();
    }

    public final q request(o oVar, CredentialRequest credentialRequest) {
        D.j(oVar, "client must not be null");
        D.j(credentialRequest, "request must not be null");
        return ((F) oVar).f11115b.doRead((l) new zbg(this, oVar, credentialRequest));
    }

    public final q save(o oVar, Credential credential) {
        D.j(oVar, "client must not be null");
        D.j(credential, "credential must not be null");
        return ((F) oVar).f11115b.doWrite((l) new zbh(this, oVar, credential));
    }
}
