package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnSuccessListener, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ r(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.b.invoke(obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        switch (this.a) {
            case 1:
                PigeonApiWebChromeClient.onShowCustomView$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", obj);
                break;
            default:
                PigeonApiWebViewClient.requestLoading$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", obj);
                break;
        }
    }
}
