package androidx.media3.common.audio;

import android.graphics.Color;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import com.facebook.appevents.u;
import com.facebook.appevents.v;
import com.facebook.internal.C0715k;
import com.facebook.internal.p;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements DefaultGainProvider.FadeProvider, CacheKeyFactory, C0715k.a {
    public static void c(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            int i = v.a;
            if (com.facebook.internal.instrument.crashshield.a.b(v.class)) {
                return;
            }
            try {
                u callback = new u();
                p pVar = p.a;
                Intrinsics.checkNotNullParameter(callback, "callback");
                p.e.add(callback);
                p.d();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, v.class);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        String lambda$static$0;
        lambda$static$0 = CacheKeyFactory.lambda$static$0(dataSpec);
        return lambda$static$0;
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        float lambda$static$1;
        lambda$static$1 = DefaultGainProvider.lambda$static$1(j, j2);
        return lambda$static$1;
    }
}
