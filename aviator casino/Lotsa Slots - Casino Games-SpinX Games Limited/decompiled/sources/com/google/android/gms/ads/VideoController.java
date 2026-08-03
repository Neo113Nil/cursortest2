package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final java.lang.Object zza = new java.lang.Object();
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        synchronized (this.zza) {
            this.zzb = zzeaVar;
            com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzea zzb() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        synchronized (this.zza) {
            zzeaVar = this.zzb;
        }
        return zzeaVar;
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.zzi();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzp();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzn();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.zzh();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzg(z);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call mute on video controller.", e);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzf();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call pause on video controller.", e);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call play on video controller.", e);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzq();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call stop on video controller.", e);
            }
        }
    }

    public void setVideoLifecycleCallbacks(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        com.google.android.gms.ads.internal.client.zzfv zzfvVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new com.google.android.gms.ads.internal.client.zzfv(videoLifecycleCallbacks);
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzeaVar.zzl(zzfvVar);
        }
    }
}
