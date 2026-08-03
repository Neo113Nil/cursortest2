package com.google.firebase.messaging;

/* loaded from: classes3.dex */
class RequestDeduplicator {
    private final java.util.concurrent.Executor executor;
    private final java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>> getTokenRequests = new androidx.collection.ArrayMap();

    interface GetTokenRequest {
        com.google.android.gms.tasks.Task<java.lang.String> start();
    }

    RequestDeduplicator(java.util.concurrent.Executor executor) {
        this.executor = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized com.google.android.gms.tasks.Task<java.lang.String> getOrStartGetTokenRequest(final java.lang.String str, com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest getTokenRequest) {
        com.google.android.gms.tasks.Task<java.lang.String> task = this.getTokenRequests.get(str);
        if (task != null) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Making new request for: " + str);
        }
        com.google.android.gms.tasks.Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.messaging.RequestDeduplicator$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return com.google.firebase.messaging.RequestDeduplicator.this.m5572x7161fc54(str, task2);
            }
        });
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: lambda$getOrStartGetTokenRequest$0$com-google-firebase-messaging-RequestDeduplicator, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5572x7161fc54(java.lang.String str, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }
}
