package androidx.lifecycle;

import android.app.Activity;
import android.view.View;
import androidx.webkit.WebViewCompat;
import com.facebook.appevents.suggestedevents.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.b);
                break;
            case 1:
                WebViewCompat.lambda$startUpWebView$2((WebViewCompat.WebViewStartUpCallback) this.b);
                break;
            default:
                com.facebook.appevents.suggestedevents.f this$0 = (com.facebook.appevents.suggestedevents.f) this.b;
                WeakReference<Activity> weakReference = this$0.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.suggestedevents.f.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        try {
                            View a = com.facebook.appevents.internal.g.a(weakReference.get());
                            Activity activity = weakReference.get();
                            if (a != null && activity != null) {
                                Iterator it = com.facebook.appevents.suggestedevents.c.a(a).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (!com.facebook.appevents.codeless.internal.d.a(view)) {
                                        String d = com.facebook.appevents.suggestedevents.c.d(view);
                                        if (d.length() > 0 && d.length() <= 300) {
                                            i.a aVar = com.facebook.appevents.suggestedevents.i.Companion;
                                            String localClassName = activity.getLocalClassName();
                                            Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                            aVar.getClass();
                                            i.a.b(view, a, localClassName);
                                        }
                                    }
                                }
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.suggestedevents.f.class);
                    }
                }
                break;
        }
    }
}
