package com.facebook.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0728q;
import com.facebook.internal.J;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler;
import io.flutter.plugins.webviewflutter.PigeonApiWebStorage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0710f implements J.d, OnCompleteListener, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0710f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.facebook.internal.J.d
    public void a(Bundle bundle, C0728q c0728q) {
        C0711g this$0 = (C0711g) this.b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$signInWithCustomToken$6((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$2((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            default:
                PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers$lambda$2$0((PigeonApiHttpAuthHandler) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebStorage.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", obj);
    }
}
