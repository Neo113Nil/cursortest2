package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
final class zad extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ android.app.Activity zab;
    final /* synthetic */ int zac;

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }

    zad(android.content.Intent intent, android.app.Activity activity, int i) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = i;
    }
}
