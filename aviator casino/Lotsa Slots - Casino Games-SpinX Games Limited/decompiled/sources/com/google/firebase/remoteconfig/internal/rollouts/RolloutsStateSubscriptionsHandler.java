package com.google.firebase.remoteconfig.internal.rollouts;

/* loaded from: classes3.dex */
public class RolloutsStateSubscriptionsHandler {
    private com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedConfigsCache;
    private java.util.concurrent.Executor executor;
    private com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory rolloutsStateFactory;
    private java.util.Set<com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber> subscribers = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory rolloutsStateFactory, java.util.concurrent.Executor executor) {
        this.activatedConfigsCache = configCacheClient;
        this.rolloutsStateFactory = rolloutsStateFactory;
        this.executor = executor;
    }

    public void registerRolloutsStateSubscriber(final com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.subscribers.add(rolloutsStateSubscriber);
        final com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task = this.activatedConfigsCache.get();
        task.addOnSuccessListener(this.executor, new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler.this.m5589x4e3578e1(task, rolloutsStateSubscriber, (com.google.firebase.remoteconfig.internal.ConfigContainer) obj);
            }
        });
    }

    /* renamed from: lambda$registerRolloutsStateSubscriber$1$com-google-firebase-remoteconfig-internal-rollouts-RolloutsStateSubscriptionsHandler, reason: not valid java name */
    /* synthetic */ void m5589x4e3578e1(com.google.android.gms.tasks.Task task, final com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber rolloutsStateSubscriber, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        try {
            com.google.firebase.remoteconfig.internal.ConfigContainer configContainer2 = (com.google.firebase.remoteconfig.internal.ConfigContainer) task.getResult();
            if (configContainer2 != null) {
                final com.google.firebase.remoteconfig.interop.rollouts.RolloutsState activeRolloutsState = this.rolloutsStateFactory.getActiveRolloutsState(configContainer2);
                this.executor.execute(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber.this.onRolloutsStateChanged(activeRolloutsState);
                    }
                });
            }
        } catch (com.google.firebase.remoteconfig.FirebaseRemoteConfigException e) {
            android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void publishActiveRolloutsState(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        try {
            final com.google.firebase.remoteconfig.interop.rollouts.RolloutsState activeRolloutsState = this.rolloutsStateFactory.getActiveRolloutsState(configContainer);
            for (final com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber rolloutsStateSubscriber : this.subscribers) {
                this.executor.execute(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber.this.onRolloutsStateChanged(activeRolloutsState);
                    }
                });
            }
        } catch (com.google.firebase.remoteconfig.FirebaseRemoteConfigException e) {
            android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }
}
