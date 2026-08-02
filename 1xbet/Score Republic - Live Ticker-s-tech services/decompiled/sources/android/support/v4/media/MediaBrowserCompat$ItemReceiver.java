package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import p000.hn0;
import p000.r21;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends r21 {
    @Override // p000.r21
    /* JADX INFO: renamed from: a */
    public final void mo327a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(hn0.class.getClassLoader());
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
