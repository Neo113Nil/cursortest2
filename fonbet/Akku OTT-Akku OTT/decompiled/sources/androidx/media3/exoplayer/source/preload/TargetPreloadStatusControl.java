package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes3.dex */
public interface TargetPreloadStatusControl<T, PreloadStatusT> {
    @Nullable
    PreloadStatusT getTargetPreloadStatus(T t);
}
