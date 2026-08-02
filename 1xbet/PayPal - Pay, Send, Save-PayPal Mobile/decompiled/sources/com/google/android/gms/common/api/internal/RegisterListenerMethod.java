package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    protected RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    public void clearListener() {
        this.zaa.clear();
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    protected abstract void registerListener(A a2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException;

    protected RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z) {
        this(listenerHolder, featureArr, z, 0);
    }

    public final boolean zab() {
        return this.zac;
    }

    public final int zaa() {
        return this.zad;
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return this.zab;
    }

    protected RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z, int i) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z;
        this.zad = i;
    }
}
