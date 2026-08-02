package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void a(int i7, Bundle bundle) {
        if (bundle != null) {
            bundle = t.B0(bundle);
        }
        if (i7 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
