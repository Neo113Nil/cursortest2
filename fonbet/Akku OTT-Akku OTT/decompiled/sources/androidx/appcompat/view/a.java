package androidx.appcompat.view;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements TrackSelector.InvalidationListener {
    public static StringBuilder a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$0();
    }
}
