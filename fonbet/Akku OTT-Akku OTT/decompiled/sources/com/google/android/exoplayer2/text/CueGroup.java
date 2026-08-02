package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.facebook.internal.instrument.e;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public final class CueGroup implements Bundleable {
    public static final Bundleable.Creator<CueGroup> CREATOR;
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final G<Cue> cues;
    public final long presentationTimeUs;

    static {
        G.b bVar = G.b;
        EMPTY_TIME_ZERO = new CueGroup(i0.e, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
        CREATOR = new e();
    }

    public CueGroup(List<Cue> list, long j) {
        this.cues = G.j(list);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? i0.e : BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
