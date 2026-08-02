package com.facebook.appevents;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Bundleable.Creator, com.google.android.datatransport.g {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    public static String a(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    @Override // com.google.android.datatransport.g
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.DrmConfiguration fromBundle;
        AdPlaybackState fromBundle2;
        switch (this.a) {
            case 1:
                fromBundle = MediaItem.DrmConfiguration.fromBundle(bundle);
                return fromBundle;
            default:
                fromBundle2 = AdPlaybackState.fromBundle(bundle);
                return fromBundle2;
        }
    }
}
