package com.google.android.exoplayer2.video;

import android.content.Context;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.razorpay.RazorpayInitializer;

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
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$disabled$8((DecoderCounters) this.c);
                break;
            default:
                RazorpayInitializer.m1705create$lambda0((RazorpayInitializer) this.b, (Context) this.c);
                break;
        }
    }
}
