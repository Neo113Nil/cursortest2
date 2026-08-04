package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* JADX INFO: loaded from: classes.dex */
public final class zbe implements s {
    private final Status zba;
    private final Credential zbb;

    public zbe(Status status, Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    public final Credential getCredential() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zba;
    }
}
