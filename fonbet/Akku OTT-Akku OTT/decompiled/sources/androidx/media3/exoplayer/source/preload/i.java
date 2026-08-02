package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements TrackSelector.Factory, C0715k.a, Bundleable.Creator {
    public static Object a(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m1805boximpl(UIntArray.m1871getpVg5ArA(iArr, i)));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.eventdeactivation.a aVar = com.facebook.appevents.eventdeactivation.a.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.eventdeactivation.a.class)) {
                return;
            }
            try {
                com.facebook.appevents.eventdeactivation.a.b = true;
                com.facebook.appevents.eventdeactivation.a.a.a();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.eventdeactivation.a.class);
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public TrackSelector createTrackSelector(Context context) {
        return new DefaultTrackSelector(context);
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.RequestMetadata lambda$static$0;
        lambda$static$0 = MediaItem.RequestMetadata.lambda$static$0(bundle);
        return lambda$static$0;
    }
}
