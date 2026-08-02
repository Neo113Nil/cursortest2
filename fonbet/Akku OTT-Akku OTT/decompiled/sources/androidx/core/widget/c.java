package androidx.core.widget;

import androidx.media3.exoplayer.MetadataRetriever;
import androidx.room.RoomTrackingLiveData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ContentLoadingProgressBar) this.b).showOnUiThread();
                break;
            case 1:
                ((MetadataRetriever) this.b).lambda$close$2();
                break;
            case 2:
                RoomTrackingLiveData.refreshRunnable$lambda$0((RoomTrackingLiveData) this.b);
                break;
            default:
                com.facebook.appevents.codeless.c this$0 = (com.facebook.appevents.codeless.c) this.b;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.b();
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.c.class);
                    }
                }
                break;
        }
    }
}
