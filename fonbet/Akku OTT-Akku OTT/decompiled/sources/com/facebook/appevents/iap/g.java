package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.u;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Ref.ObjectRef billingClientWrapper = (Ref.ObjectRef) this.b;
                u.a billingClientVersion = (u.a) this.c;
                Context context = (Context) this.d;
                if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(billingClientWrapper, "$billingClientWrapper");
                        Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
                        Intrinsics.checkNotNullParameter(context, "$context");
                        ((j) billingClientWrapper.element).a(u.b.SUBS, new h(0, billingClientVersion, context));
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, i.class);
                        return;
                    }
                }
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$inputFormatChanged$2((Format) this.c, (DecoderReuseEvaluation) this.d);
                break;
        }
    }
}
