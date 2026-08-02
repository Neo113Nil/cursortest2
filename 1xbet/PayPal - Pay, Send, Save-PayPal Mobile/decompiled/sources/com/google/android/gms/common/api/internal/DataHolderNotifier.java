package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(L l) {
        notifyListener(l, this.zaa);
    }

    protected abstract void notifyListener(L l, com.google.android.gms.common.data.DataHolder dataHolder);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void onNotifyListenerFailed() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    protected DataHolderNotifier(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zaa = dataHolder;
    }
}
