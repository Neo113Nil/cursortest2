package com.google.android.exoplayer2.util;

import android.view.SurfaceView;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes4.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new androidx.media3.extractor.metadata.id3.a();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
