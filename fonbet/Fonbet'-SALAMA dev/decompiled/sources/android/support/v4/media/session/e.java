package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import g5.C1150e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends MediaController.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8043a;

    public e(C1150e c1150e) {
        this.f8043a = new WeakReference(c1150e);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((C1150e) this.f8043a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        t.Z(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((C1150e) this.f8043a.get()) != null) {
            r.b bVar = MediaMetadataCompat.f7987d;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                createFromParcel.f7992b = mediaMetadata;
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        C1150e c1150e = (C1150e) this.f8043a.get();
        if (c1150e == null || c1150e.f13248c != null || playbackState == null) {
            return;
        }
        List<PlaybackState.CustomAction> j = u.j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            for (PlaybackState.CustomAction customAction2 : j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l7 = u.l(customAction3);
                    t.Z(l7);
                    customAction = new PlaybackStateCompat.CustomAction(u.f(customAction3), u.o(customAction3), u.m(customAction3), l7);
                    customAction.f8040e = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a2 = v.a(playbackState);
        t.Z(a2);
        new PlaybackStateCompat(u.r(playbackState), u.q(playbackState), u.i(playbackState), u.p(playbackState), u.g(playbackState), 0, u.k(playbackState), u.n(playbackState), arrayList, u.h(playbackState), a2).f8026C = playbackState;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((C1150e) this.f8043a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(r.b(queueItem)), r.c(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        t.Z(bundle);
    }
}
