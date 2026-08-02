package P;

import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.media.AudioProfile;
import android.view.ContentInfo;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0348d {
    public static /* bridge */ /* synthetic */ ApkChecksum f(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile h(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i7) {
        return new ContentInfo.Builder(clipData, i7);
    }
}
