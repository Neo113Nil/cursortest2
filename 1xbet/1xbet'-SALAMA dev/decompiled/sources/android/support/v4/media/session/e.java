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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends MediaController.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8043a;

    public e(p049g5.e eVar) {
        this.f8043a = new WeakReference(eVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((p049g5.e) this.f8043a.get()) != null) {
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
        if (((p049g5.e) this.f8043a.get()) != null) {
            p122r.b bVar = MediaMetadataCompat.f7987d;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f7992b = mediaMetadata;
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        p049g5.e eVar = (p049g5.e) this.f8043a.get();
        if (eVar == null || eVar.f13254c != null || playbackState == null) {
            return;
        }
        List<PlaybackState.CustomAction> listJ = u.j(playbackState);
        if (listJ != null) {
            ArrayList arrayList2 = new ArrayList(listJ.size());
            for (PlaybackState.CustomAction customAction2 : listJ) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle bundleL = u.l(customAction3);
                    t.Z(bundleL);
                    customAction = new PlaybackStateCompat.CustomAction(u.f(customAction3), u.o(customAction3), u.m(customAction3), bundleL);
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
        Bundle bundleA = v.a(playbackState);
        t.Z(bundleA);
        new PlaybackStateCompat(u.r(playbackState), u.q(playbackState), u.i(playbackState), u.p(playbackState), u.g(playbackState), 0, u.k(playbackState), u.n(playbackState), arrayList, u.h(playbackState), bundleA).f8026C = playbackState;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((p049g5.e) this.f8043a.get()) == null || list == null) {
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
