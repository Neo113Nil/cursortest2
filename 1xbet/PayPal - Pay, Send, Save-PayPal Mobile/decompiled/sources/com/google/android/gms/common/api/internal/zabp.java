package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zabp implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zaa;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.zaa.zaa.zar.post(new com.google.android.gms.common.api.internal.zabo(this));
    }

    zabp(com.google.android.gms.common.api.internal.zabq zabqVar) {
        this.zaa = zabqVar;
    }
}
