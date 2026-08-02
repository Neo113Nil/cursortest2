package com.google.firebase.messaging;

/* loaded from: classes4.dex */
class WithinAppServiceBinder extends android.os.Binder {
    private final com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler intentHandler;

    interface IntentHandler {
        com.google.android.gms.tasks.Task<java.lang.Void> handle(android.content.Intent intent);
    }

    WithinAppServiceBinder(com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    void send(final com.google.firebase.messaging.WithinAppServiceConnection.BindRequest bindRequest) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.firebase.messaging.WithinAppServiceBinder$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.firebase.messaging.WithinAppServiceConnection.BindRequest.this.finish();
            }
        });
    }
}
