package androidx.media3.common.audio;

import android.os.Bundle;
import androidx.media3.common.audio.DefaultGainProvider;
import com.facebook.internal.C0715k;
import com.facebook.w;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.tasks.OnFailureListener;
import com.razorpay.PhoneNumberHintHelper;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements DefaultGainProvider.FadeProvider, C0715k.a, Bundleable.Creator, OnFailureListener {
    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            w.n = true;
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        VideoSize lambda$static$0;
        lambda$static$0 = VideoSize.lambda$static$0(bundle);
        return lambda$static$0;
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        float lambda$static$2;
        lambda$static$2 = DefaultGainProvider.lambda$static$2(j, j2);
        return lambda$static$2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        PhoneNumberHintHelper.m1710triggerPhoneNumberHintApi$lambda1(exc);
    }
}
