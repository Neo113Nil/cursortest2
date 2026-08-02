package com.facebook.appevents.cloudbridge;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Integer num = (Integer) this.b;
                List processedEvents = (List) this.c;
                Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
                if (!CollectionsKt.contains(h.a, num)) {
                    Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
                    if (CollectionsKt.contains(h.b, num)) {
                        if (h.e < 5) {
                            h.b().addAll(0, processedEvents);
                            h.e++;
                            break;
                        } else {
                            h.b().clear();
                            h.e = 0;
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$decoderReleased$5((String) this.c);
                break;
            default:
                ((FlutterFirebaseCorePlugin) this.b).lambda$initializeCore$4((TaskCompletionSource) this.c);
                break;
        }
    }
}
