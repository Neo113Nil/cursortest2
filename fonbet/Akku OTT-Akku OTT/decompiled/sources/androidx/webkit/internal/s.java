package androidx.webkit.internal;

import android.webkit.ValueCallback;
import androidx.webkit.PrerenderOperationCallback;
import io.flutter.plugins.webviewflutter.ResultCompat;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                ((PrerenderOperationCallback) this.b).onPrerenderActivated();
                break;
            default:
                ResultCompat.success((Boolean) obj, (Function1) this.b);
                break;
        }
    }
}
