package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.C0964l;
import com.google.common.collect.G;
import com.google.common.collect.b0;
import com.google.common.collect.d0;
import com.google.common.collect.i0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class CueGroup {
    private static final d0<Cue> CUES_PRIORITY_COMPARATOR;

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final G<Cue> cues;

    @UnstableApi
    public final long presentationTimeUs;

    static {
        b0 b0Var = b0.a;
        a aVar = new a();
        b0Var.getClass();
        CUES_PRIORITY_COMPARATOR = new C0964l(aVar, b0Var);
        G.b bVar = G.b;
        EMPTY_TIME_ZERO = new CueGroup(i0.e, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    }

    @UnstableApi
    public CueGroup(List<Cue> list, long j) {
        this.cues = G.r(list, CUES_PRIORITY_COMPARATOR);
        this.presentationTimeUs = j;
    }

    private static G<Cue> filterOutBitmapCues(List<Cue> list) {
        G.b bVar = G.b;
        G.a aVar = new G.a();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                aVar.c(list.get(i));
            }
        }
        return aVar.g();
    }

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? i0.e : BundleCollectionUtil.fromBundleList(new b(), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(Cue cue) {
        return Integer.valueOf(cue.zIndex);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new c()));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
