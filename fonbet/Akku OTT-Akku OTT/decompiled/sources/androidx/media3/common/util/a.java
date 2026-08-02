package androidx.media3.common.util;

import com.facebook.D;
import com.facebook.M;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BackgroundThreadStateHandler) this.b).lambda$updateStateAsync$1((com.google.common.base.f) this.c);
                break;
            case 1:
                D.a callback = (D.a) this.b;
                M this$0 = (M) this.c;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((D.c) callback).b();
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleGetSessionId$lambda$0((TaskCompletionSource) this.b, (FlutterFirebaseAnalyticsPlugin) this.c);
                break;
        }
    }
}
