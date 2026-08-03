package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zao implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    zao(com.google.android.gms.common.api.internal.zap zapVar, com.google.android.gms.common.api.internal.zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            com.google.android.gms.common.ConnectionResult zab = this.zab.zab();
            if (zab.hasResolution()) {
                com.google.android.gms.common.api.internal.zap zapVar = this.zaa;
                zapVar.mLifecycleFragment.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.zaa(zapVar.getActivity(), (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(zab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            com.google.android.gms.common.api.internal.zap zapVar2 = this.zaa;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), zab.getErrorCode(), null) != null) {
                com.google.android.gms.common.api.internal.zap zapVar3 = this.zaa;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, zab.getErrorCode(), 2, this.zaa);
                return;
            }
            if (zab.getErrorCode() != 18) {
                this.zaa.zaa(zab, this.zab.zaa());
                return;
            }
            com.google.android.gms.common.api.internal.zap zapVar4 = this.zaa;
            android.app.Dialog zab2 = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            com.google.android.gms.common.api.internal.zap zapVar5 = this.zaa;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new com.google.android.gms.common.api.internal.zan(this, zab2));
        }
    }
}
