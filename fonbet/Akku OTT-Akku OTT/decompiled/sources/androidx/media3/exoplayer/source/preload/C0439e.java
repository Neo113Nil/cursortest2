package androidx.media3.exoplayer.source.preload;

import android.os.Bundle;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Log;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.exoplayer.source.preload.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0439e implements TrackSelector.InvalidationListener, Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0439e(int i) {
        this.a = i;
    }

    public static Iterator a(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static void b(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void c(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.ClippingProperties lambda$static$0;
        TrackGroupArray lambda$static$02;
        switch (this.a) {
            case 2:
                lambda$static$0 = MediaItem.ClippingConfiguration.lambda$static$0(bundle);
                return lambda$static$0;
            default:
                lambda$static$02 = TrackGroupArray.lambda$static$0(bundle);
                return lambda$static$02;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DefaultPreloadManager.lambda$new$0();
    }
}
