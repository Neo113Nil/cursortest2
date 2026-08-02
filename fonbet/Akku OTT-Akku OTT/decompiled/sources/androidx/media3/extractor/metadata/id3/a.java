package androidx.media3.extractor.metadata.id3;

import android.view.SurfaceView;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.DebugViewProvider;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Id3Decoder.FramePredicate, TrackSelector.InvalidationListener, DebugViewProvider, ObjectConstructor {
    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Map lambda$newMapConstructor$14;
        lambda$newMapConstructor$14 = ConstructorConstructor.lambda$newMapConstructor$14();
        return lambda$newMapConstructor$14;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$0;
        lambda$static$0 = Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        return lambda$static$0;
    }

    @Override // com.google.android.exoplayer2.util.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        SurfaceView lambda$static$0;
        lambda$static$0 = DebugViewProvider.lambda$static$0(i, i2);
        return lambda$static$0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$2();
    }
}
