package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ProgressiveMediaExtractor.Factory, Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$static$0;
        lambda$static$0 = MediaParserExtractorAdapter.lambda$static$0(playerId);
        return lambda$static$0;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        DeviceInfo lambda$static$0;
        MediaItem.LiveConfiguration lambda$static$02;
        AdPlaybackState.AdGroup fromBundle;
        switch (this.a) {
            case 1:
                lambda$static$0 = DeviceInfo.lambda$static$0(bundle);
                return lambda$static$0;
            case 2:
                lambda$static$02 = MediaItem.LiveConfiguration.lambda$static$0(bundle);
                return lambda$static$02;
            default:
                fromBundle = AdPlaybackState.AdGroup.fromBundle(bundle);
                return fromBundle;
        }
    }
}
