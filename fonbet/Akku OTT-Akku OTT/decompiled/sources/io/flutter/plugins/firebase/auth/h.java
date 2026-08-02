package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.ResultUtilsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements OnCompleteListener, BasicMessageChannel.MessageHandler, OnSuccessListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$reauthenticateWithProvider$5((GeneratedAndroidFirebaseAuth.Result) this.a, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.lambda$setUp$3((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.a, obj, reply);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ResultUtilsKt.completeWithUnitSuccess((Function1) this.a);
    }
}
