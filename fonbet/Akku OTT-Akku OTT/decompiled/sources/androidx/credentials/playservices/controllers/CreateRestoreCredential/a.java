package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, BasicMessageChannel.Reply {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ a(Function1 function1) {
        this.a = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.a.invoke(obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiCustomViewCallback.pigeon_newInstance$lambda$0(this.a, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", obj);
    }
}
