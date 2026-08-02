package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((PlayerView) this.b).lambda$onImageAvailable$1((Bitmap) this.c);
                break;
            case 1:
                String eventName = (String) this.b;
                Bundle parameters = (Bundle) this.c;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(eventName, "$eventName");
                        Intrinsics.checkNotNullParameter(parameters, "$parameters");
                        Context context = com.facebook.w.a();
                        com.facebook.appevents.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        new com.facebook.appevents.p(context, (String) null).e(eventName, parameters);
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.a.class);
                        return;
                    }
                }
                break;
            default:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0((FirebaseApp) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
