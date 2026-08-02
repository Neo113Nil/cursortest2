package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import com.facebook.appevents.RunnableC0690b;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.w;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements LoudnessCodecController.LoudnessParameterUpdateListener, C0715k.a {
    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.ml.d dVar = com.facebook.appevents.ml.d.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ml.d.class)) {
                return;
            }
            try {
                RunnableC0690b runnableC0690b = new RunnableC0690b(1);
                E e = E.a;
                try {
                    w.c().execute(runnableC0690b);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.ml.d.class);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        Bundle lambda$static$0;
        lambda$static$0 = LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
        return lambda$static$0;
    }
}
