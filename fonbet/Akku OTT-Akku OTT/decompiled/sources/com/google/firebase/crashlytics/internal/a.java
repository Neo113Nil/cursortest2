package com.google.firebase.crashlytics.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Deferred.DeferredHandler, OnCompleteListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) this.a).lambda$new$0(provider);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseCorePlugin.lambda$listenToVoidResponse$2((GeneratedAndroidFirebaseCore.VoidResult) this.a, task);
    }
}
