package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.util.NetworkTypeObserver;
import com.facebook.appevents.C0692d;
import com.facebook.appevents.ondeviceprocessing.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ P(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((SimpleBasePlayer) obj2).lambda$updateStateForPendingOperation$62((com.google.common.util.concurrent.u) obj);
                break;
            case 1:
                ((NetworkTypeObserver) obj2).lambda$new$0((Context) obj);
                break;
            case 2:
                String applicationId = (String) obj2;
                C0692d event = (C0692d) obj;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                        Intrinsics.checkNotNullParameter(event, "$event");
                        List<C0692d> appEvents = CollectionsKt.listOf(event);
                        com.facebook.appevents.ondeviceprocessing.c cVar = com.facebook.appevents.ondeviceprocessing.c.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                                com.facebook.appevents.ondeviceprocessing.c.a.b(c.a.CUSTOM_APP_EVENTS, applicationId, appEvents);
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.ondeviceprocessing.c.class);
                            }
                        }
                        break;
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.ondeviceprocessing.a.class);
                        return;
                    }
                }
                break;
            case 3:
                String str = (String) obj;
                com.odehbros.flutter_file_downloader.downloader.g gVar = com.odehbros.flutter_file_downloader.downloader.g.this;
                gVar.f.a(str);
                gVar.h.d.success(str);
                break;
            default:
                ((FlutterFirebaseMessagingPlugin) obj2).lambda$getPermissions$13((TaskCompletionSource) obj);
                break;
        }
    }
}
