package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.7.2 */
/* loaded from: classes9.dex */
final class zaay extends zabr {
    private final WeakReference zaa;

    zaay(zaaz zaazVar) {
        this.zaa = new WeakReference(zaazVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zaa() {
        zaaz zaazVar = (zaaz) this.zaa.get();
        if (zaazVar == null) {
            return;
        }
        zaazVar.zai();
    }
}
