package androidx.media3.common;

import android.os.Bundle;
import android.view.SurfaceView;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;

/* renamed from: androidx.media3.common.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0319d implements DebugViewProvider, Bundleable.Creator {
    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        Tracks.Group lambda$static$0;
        lambda$static$0 = Tracks.Group.lambda$static$0(bundle);
        return lambda$static$0;
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        SurfaceView lambda$static$0;
        lambda$static$0 = DebugViewProvider.lambda$static$0(i, i2);
        return lambda$static$0;
    }
}
