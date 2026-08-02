package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(String str, Bundle bundle);

    void B(int i7, int i8);

    void C();

    void D(Uri uri, Bundle bundle);

    void E(long j);

    void K(float f7);

    boolean L(KeyEvent keyEvent);

    void O(RatingCompat ratingCompat, Bundle bundle);

    void Q(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    String S();

    void T(boolean z4);

    PlaybackStateCompat W();

    int X();

    void Y(int i7);

    void a();

    boolean a0();

    long c();

    void d(String str, Bundle bundle);

    void e(b bVar);

    void e0();

    void f0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void g(RatingCompat ratingCompat);

    List g0();

    Bundle getExtras();

    void h(Uri uri, Bundle bundle);

    void h0(int i7);

    void i0();

    void j(MediaDescriptionCompat mediaDescriptionCompat);

    boolean k();

    int k0();

    void l(MediaDescriptionCompat mediaDescriptionCompat);

    void l0(long j);

    PendingIntent m();

    ParcelableVolumeInfo m0();

    void n();

    void next();

    void o(String str, Bundle bundle);

    void o0(int i7);

    String p0();

    void pause();

    void previous();

    void q(int i7, int i8);

    CharSequence s();

    void stop();

    MediaMetadataCompat t();

    void u(String str, Bundle bundle);

    Bundle v();

    void w(b bVar);

    void y(String str, Bundle bundle);
}
