package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements CmcdConfiguration.Factory {
    @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory
    public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        CmcdConfiguration lambda$static$0;
        lambda$static$0 = CmcdConfiguration.Factory.lambda$static$0(mediaItem);
        return lambda$static$0;
    }
}
