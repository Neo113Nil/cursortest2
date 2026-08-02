package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$enabled$0((DecoderCounters) this.c);
                break;
            case 1:
                ((NetworkTypeObserver) this.b).lambda$register$0((NetworkTypeObserver.Listener) this.c);
                break;
            default:
                ((CrashlyticsCore) this.b).lambda$setCustomKeys$6((Map) this.c);
                break;
        }
    }
}
