package com.ironsource;

/* loaded from: classes5.dex */
public interface W7<T> {
    T a(java.lang.String str);

    void a(T t);

    void a(java.lang.String str, T t);

    public static final class a implements com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> {

        /* renamed from: a, reason: collision with root package name */
        private com.ironsource.V7 f6041a = new com.ironsource.V7();
        private final java.util.Map<java.lang.String, com.ironsource.V7> b = new java.util.HashMap();

        @Override // com.ironsource.W7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            com.ironsource.V7 v7 = this.b.get(instanceId);
            return v7 != null ? v7 : this.f6041a;
        }

        @Override // com.ironsource.W7
        public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.f6041a.a(listener);
            java.util.Iterator<java.lang.String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                com.ironsource.V7 v7 = this.b.get(it.next());
                if (v7 != null) {
                    v7.a(listener);
                }
            }
        }

        @Override // com.ironsource.W7
        public void a(java.lang.String instanceId, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                com.ironsource.V7 v7 = this.b.get(instanceId);
                if (v7 != null) {
                    v7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new com.ironsource.V7(listener));
        }
    }

    public static final class b implements com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a, reason: collision with root package name */
        private com.ironsource.Y7 f6042a = new com.ironsource.Y7();
        private final java.util.Map<java.lang.String, com.ironsource.Y7> b = new java.util.HashMap();

        @Override // com.ironsource.W7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            com.ironsource.Y7 y7 = this.b.get(instanceId);
            return y7 != null ? y7 : this.f6042a;
        }

        @Override // com.ironsource.W7
        public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.f6042a.a(listener);
            java.util.Iterator<java.lang.String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                com.ironsource.Y7 y7 = this.b.get(it.next());
                if (y7 != null) {
                    y7.a(listener);
                }
            }
        }

        @Override // com.ironsource.W7
        public void a(java.lang.String instanceId, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                com.ironsource.Y7 y7 = this.b.get(instanceId);
                if (y7 != null) {
                    y7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new com.ironsource.Y7(listener));
        }
    }
}
