package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
final class zae extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ androidx.fragment.app.Fragment zab;
    final /* synthetic */ int zac;

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }

    zae(android.content.Intent intent, androidx.fragment.app.Fragment fragment, int i) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i;
    }
}
