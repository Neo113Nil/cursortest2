package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnFailureListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements BasicMessageChannel.MessageHandler, OnFailureListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ n(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleSignInPlugin.Delegate.lambda$clearAuthorizationToken$1((Function1) this.a, exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.lambda$setUp$2((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.a, obj, reply);
    }
}
