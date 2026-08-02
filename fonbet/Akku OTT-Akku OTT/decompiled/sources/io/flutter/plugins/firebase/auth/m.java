package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 0:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.b, obj, reply);
                break;
            default:
                GoogleSignInApi.Companion.setUp$lambda$4$0((GoogleSignInApi) this.b, obj, reply);
                break;
        }
    }
}
