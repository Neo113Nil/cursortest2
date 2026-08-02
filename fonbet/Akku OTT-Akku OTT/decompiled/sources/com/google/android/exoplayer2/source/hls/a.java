package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HlsSampleStreamWrapper.Callback) this.b).onPrepared();
                break;
            default:
                BackgroundWorker backgroundWorker = (BackgroundWorker) this.b;
                FlutterEngine flutterEngine = backgroundWorker.d;
                if (flutterEngine != null) {
                    flutterEngine.destroy();
                }
                backgroundWorker.d = null;
                break;
        }
    }
}
