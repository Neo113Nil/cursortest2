package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zabp implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zaa;

    zabp(com.google.android.gms.common.api.internal.zabq zabqVar) {
        this.zaa = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.zaa.zaa.zar.post(new com.google.android.gms.common.api.internal.zabo(this));
    }
}
