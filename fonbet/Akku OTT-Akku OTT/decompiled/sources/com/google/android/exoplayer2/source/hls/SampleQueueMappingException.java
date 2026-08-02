package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;

@Deprecated
/* loaded from: classes4.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(android.support.v4.media.b.b("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
