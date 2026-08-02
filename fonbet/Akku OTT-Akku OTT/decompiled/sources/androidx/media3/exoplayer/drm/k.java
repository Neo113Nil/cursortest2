package androidx.media3.exoplayer.drm;

import android.view.View;
import android.widget.EditText;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmSessionReleased$5((DrmSessionEventListener) this.c);
                break;
            case 1:
                View view = (View) this.b;
                com.facebook.appevents.aam.e this$0 = (com.facebook.appevents.aam.e) this.c;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.aam.e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(view, "$view");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!(view instanceof EditText)) {
                            break;
                        } else {
                            this$0.b(view);
                            break;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.aam.e.class);
                        return;
                    }
                }
                break;
            default:
                ((FlutterFirebaseCorePlugin) this.b).lambda$optionsFromResource$5((TaskCompletionSource) this.c);
                break;
        }
    }
}
