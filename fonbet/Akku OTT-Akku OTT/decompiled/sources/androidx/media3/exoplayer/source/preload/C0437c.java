package androidx.media3.exoplayer.source.preload;

import android.os.Bundle;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import java.lang.reflect.Constructor;
import kotlin.ranges.IntRange;

/* renamed from: androidx.media3.exoplayer.source.preload.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0437c implements ListenerSet.IterationFinishedEvent, Bundleable.Creator, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier {
    public static int a(IntRange intRange, int i) {
        return intRange.getEndInclusive().intValue() + i;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem fromBundle;
        fromBundle = MediaItem.fromBundle(bundle);
        return fromBundle;
    }

    @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        Constructor midiExtractorConstructor;
        midiExtractorConstructor = DefaultExtractorsFactory.getMidiExtractorConstructor();
        return midiExtractorConstructor;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        BasePreloadManager.lambda$new$0((PreloadManagerListener) obj, flagSet);
    }
}
