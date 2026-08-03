package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class ListenerHolder<L> {
    private final java.util.concurrent.Executor zaa;
    private volatile java.lang.Object zab;
    private volatile com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static final class ListenerKey<L> {
        private final java.lang.Object zaa;
        private final java.lang.String zab;

        ListenerKey(L l, java.lang.String str) {
            this.zaa = l;
            this.zab = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey)) {
                return false;
            }
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        public java.lang.String toIdString() {
            return this.zab + "@" + java.lang.System.identityHashCode(this.zaa);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    ListenerHolder(android.os.Looper looper, L l, java.lang.String str) {
        this.zaa = new com.google.android.gms.common.util.concurrent.HandlerExecutor(looper);
        this.zab = com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey(l, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str));
    }

    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    public boolean hasListener() {
        return this.zab != null;
    }

    public void notifyListener(final com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> notifier) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.common.api.internal.ListenerHolder.this.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zaa(com.google.android.gms.common.api.internal.ListenerHolder.Notifier notifier) {
        java.lang.Object obj = this.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (java.lang.RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    ListenerHolder(java.util.concurrent.Executor executor, L l, java.lang.String str) {
        this.zaa = (java.util.concurrent.Executor) com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey(l, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str));
    }
}
