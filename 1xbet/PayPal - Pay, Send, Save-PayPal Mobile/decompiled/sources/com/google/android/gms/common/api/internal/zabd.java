package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zabd extends com.google.android.gms.common.api.internal.zabw {
    private final java.lang.ref.WeakReference zaa;

    zabd(com.google.android.gms.common.api.internal.zabe zabeVar) {
        this.zaa = new java.lang.ref.WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        com.google.android.gms.common.api.internal.zabe zabeVar = (com.google.android.gms.common.api.internal.zabe) this.zaa.get();
        if (zabeVar == null) {
            return;
        }
        com.google.android.gms.common.api.internal.zabe.zai(zabeVar);
    }
}
