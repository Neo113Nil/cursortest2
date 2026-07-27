package sg.bigo.ads.api;

import sg.bigo.ads.N.h;
import sg.bigo.ads.N.i;
import sg.bigo.ads.N.j;

/* loaded from: classes3.dex */
public interface VideoController {

    public interface VideoLifeCallback {
        void onMuteChange(boolean z);

        void onVideoEnd();

        void onVideoPause();

        void onVideoPlay();

        void onVideoStart();
    }

    h getBackupLoadCallback();

    i getLoadHTMLCallback();

    j getProgressChangeListener();

    VideoLifeCallback getVideoLifeCallback();

    boolean isMuted();

    boolean isPaused();

    boolean isPlaying();

    void mute(boolean z);

    void notifyBackupResourceReady();

    void notifyPlayViewRegister();

    void notifyResourceReady();

    void pause();

    void play();

    void setBackupLoadCallback(h hVar);

    void setLoadHTMLCallback(i iVar);

    void setNeedPauseWhenVisiblePercentEqual(boolean z);

    void setProgressChangeListener(j jVar);

    void setVideoLifeCallback(VideoLifeCallback videoLifeCallback);
}
