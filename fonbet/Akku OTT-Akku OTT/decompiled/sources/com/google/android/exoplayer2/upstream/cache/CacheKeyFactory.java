package com.google.android.exoplayer2.upstream.cache;

import androidx.media3.exoplayer.drm.l;
import com.google.android.exoplayer2.upstream.DataSpec;

@Deprecated
/* loaded from: classes4.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new l(4);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
