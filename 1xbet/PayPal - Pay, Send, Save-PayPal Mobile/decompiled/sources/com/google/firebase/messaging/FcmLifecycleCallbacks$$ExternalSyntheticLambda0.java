package com.google.firebase.messaging;

/* loaded from: classes9.dex */
public final /* synthetic */ class FcmLifecycleCallbacks$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ com.google.firebase.messaging.FcmLifecycleCallbacks f$0;
    public final /* synthetic */ android.content.Intent f$1;

    public /* synthetic */ FcmLifecycleCallbacks$$ExternalSyntheticLambda0(com.google.firebase.messaging.FcmLifecycleCallbacks fcmLifecycleCallbacks, android.content.Intent intent) {
        this.f$0 = fcmLifecycleCallbacks;
        this.f$1 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m10446xd8132052(this.f$1);
    }
}
