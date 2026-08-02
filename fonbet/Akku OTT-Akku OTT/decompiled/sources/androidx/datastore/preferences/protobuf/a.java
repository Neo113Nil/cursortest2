package androidx.datastore.preferences.protobuf;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.PercentageRating;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Bundleable.Creator {
    public static int a(List list, int i, int i2) {
        return (list.size() * i) + i2;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        PercentageRating fromBundle;
        fromBundle = PercentageRating.fromBundle(bundle);
        return fromBundle;
    }
}
