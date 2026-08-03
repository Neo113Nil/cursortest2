package com.google.firebase.remoteconfig;

/* compiled from: RemoteConfig.kt */
@kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onError", "", "error", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "onUpdate", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "com.google.firebase-firebase-config"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements com.google.firebase.remoteconfig.ConfigUpdateListener {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.google.firebase.remoteconfig.ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ com.google.firebase.remoteconfig.FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    RemoteConfigKt$configUpdates$1$registration$1(com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig, kotlinx.coroutines.channels.ProducerScope<? super com.google.firebase.remoteconfig.ConfigUpdate> producerScope) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = producerScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$0(kotlinx.coroutines.channels.ProducerScope $this$callbackFlow, com.google.firebase.remoteconfig.ConfigUpdate configUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter($this$callbackFlow, "$$this$callbackFlow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking($this$callbackFlow, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(final com.google.firebase.remoteconfig.ConfigUpdate configUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        final kotlinx.coroutines.channels.ProducerScope<com.google.firebase.remoteconfig.ConfigUpdate> producerScope = this.$$this$callbackFlow;
        firebaseRemoteConfig.schedule(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1.onUpdate$lambda$0(kotlinx.coroutines.channels.ProducerScope.this, configUpdate);
            }
        });
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(com.google.firebase.remoteconfig.FirebaseRemoteConfigException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlinx.coroutines.CoroutineScopeKt.cancel(this.$$this$callbackFlow, "Error listening for config updates.", error);
    }
}
