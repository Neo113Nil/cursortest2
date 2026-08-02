package androidx.media3.exoplayer.drm;

import android.os.Bundle;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Rating;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import java.lang.reflect.Constructor;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements DrmSessionManager.DrmSessionReference, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, Bundleable.Creator, CacheKeyFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    public static StringBuilder c(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        String lambda$static$0;
        lambda$static$0 = CacheKeyFactory.lambda$static$0(dataSpec);
        return lambda$static$0;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        Rating fromBundle;
        Tracks lambda$static$0;
        switch (this.a) {
            case 2:
                fromBundle = Rating.fromBundle(bundle);
                return fromBundle;
            default:
                lambda$static$0 = Tracks.lambda$static$0(bundle);
                return lambda$static$0;
        }
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        Constructor midiExtractorConstructor;
        midiExtractorConstructor = DefaultExtractorsFactory.getMidiExtractorConstructor();
        return midiExtractorConstructor;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        DrmSessionManager.DrmSessionReference.lambda$static$0();
    }
}
