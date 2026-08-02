package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.google.android.exoplayer2.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0755b0 implements Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0755b0(int i) {
        this.a = i;
    }

    public static ArrayList a(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.AdsConfiguration fromBundle;
        TrackGroup lambda$static$0;
        switch (this.a) {
            case 0:
                fromBundle = MediaItem.AdsConfiguration.fromBundle(bundle);
                return fromBundle;
            default:
                lambda$static$0 = TrackGroup.lambda$static$0(bundle);
                return lambda$static$0;
        }
    }
}
