package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    void F(boolean z4);

    void M(CharSequence charSequence);

    void P();

    void R(MediaMetadataCompat mediaMetadataCompat);

    void b(int i7);

    void b0(int i7);

    void p(Bundle bundle);

    void q0(PlaybackStateCompat playbackStateCompat);

    void r(List list);

    void s0(ParcelableVolumeInfo parcelableVolumeInfo);
}
