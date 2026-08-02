package com.facebook.appevents.codeless;

import com.facebook.appevents.codeless.g;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
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
                g this$0 = (g) this.b;
                g.c indexingTask = (g.c) this.c;
                if (!com.facebook.internal.instrument.crashshield.a.b(g.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
                        try {
                            Timer timer = this$0.c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            this$0.d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                            this$0.c = timer2;
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, g.class);
                        return;
                    }
                }
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$disabled$6((DecoderCounters) this.c);
                break;
            default:
                ((CrashlyticsCore) this.b).lambda$finishInitSynchronously$9((SettingsProvider) this.c);
                break;
        }
    }
}
