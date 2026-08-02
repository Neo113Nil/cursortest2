package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zan extends com.google.android.gms.common.api.internal.zabw {
    final /* synthetic */ android.app.Dialog zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zao zab;

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.zab.zaa.zad();
        if (this.zaa.isShowing()) {
            this.zaa.dismiss();
        }
    }

    zan(com.google.android.gms.common.api.internal.zao zaoVar, android.app.Dialog dialog) {
        this.zab = zaoVar;
        this.zaa = dialog;
    }
}
