package androidx.datastore.preferences.protobuf;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public static String a(Class cls, String str) {
        return str + cls;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        PlaybackParameters lambda$static$0;
        Timeline fromBundle;
        switch (this.a) {
            case 1:
                lambda$static$0 = PlaybackParameters.lambda$static$0(bundle);
                return lambda$static$0;
            default:
                fromBundle = Timeline.fromBundle(bundle);
                return fromBundle;
        }
    }
}
