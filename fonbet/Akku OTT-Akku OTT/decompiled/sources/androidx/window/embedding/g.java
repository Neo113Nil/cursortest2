package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExtensionEmbeddingBackend.SplitListenerWrapper.accept$lambda$1((ExtensionEmbeddingBackend.SplitListenerWrapper) this.b, (ArrayList) this.c);
                break;
            default:
                ((FlutterFirebaseMessagingPlugin) this.b).lambda$getInitialMessage$9((TaskCompletionSource) this.c);
                break;
        }
    }
}
