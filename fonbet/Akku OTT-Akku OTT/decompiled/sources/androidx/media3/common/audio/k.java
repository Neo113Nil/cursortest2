package androidx.media3.common.audio;

import androidx.media3.common.audio.DefaultGainProvider;
import com.facebook.S;
import com.facebook.internal.C0715k;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements DefaultGainProvider.FadeProvider, C0715k.a {
    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z && S.c()) {
            C0715k.a(new com.facebook.internal.instrument.d(0), C0715k.b.CrashReport);
            C0715k.a(new com.facebook.internal.instrument.e(), C0715k.b.ErrorReport);
            C0715k.a(new com.facebook.internal.instrument.f(), C0715k.b.AnrReport);
        }
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        float lambda$static$0;
        lambda$static$0 = DefaultGainProvider.lambda$static$0(j, j2);
        return lambda$static$0;
    }
}
