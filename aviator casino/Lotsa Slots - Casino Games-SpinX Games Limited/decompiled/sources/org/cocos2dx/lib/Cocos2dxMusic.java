package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxMusic {
    private static final java.lang.String TAG = "Cocos2dxMusic";
    private android.media.MediaPlayer mBackgroundMediaPlayer;
    private final android.content.Context mContext;
    private java.lang.String mCurrentPath;
    private float mLeftVolume;
    private boolean mPaused;
    private float mRightVolume;
    private boolean mIsLoop = false;
    private boolean mManualPaused = false;

    public Cocos2dxMusic(android.content.Context context) {
        this.mContext = context;
        initData();
    }

    public void preloadBackgroundMusic(java.lang.String str) {
        java.lang.String str2 = this.mCurrentPath;
        if (str2 == null || !str2.equals(str)) {
            try {
                android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            } catch (java.lang.Exception unused) {
            }
            this.mBackgroundMediaPlayer = createMediaplayer(str);
            this.mCurrentPath = str;
        }
    }

    public void playBackgroundMusic(java.lang.String str, boolean z) {
        java.lang.String str2 = this.mCurrentPath;
        if (str2 == null) {
            this.mBackgroundMediaPlayer = createMediaplayer(str);
            this.mCurrentPath = str;
        } else if (!str2.equals(str)) {
            android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.release();
                } catch (java.lang.Exception unused) {
                }
            }
            this.mBackgroundMediaPlayer = createMediaplayer(str);
            this.mCurrentPath = str;
        }
        android.media.MediaPlayer mediaPlayer2 = this.mBackgroundMediaPlayer;
        if (mediaPlayer2 == null) {
            android.util.Log.e(TAG, "playBackgroundMusic: background media player is null");
            return;
        }
        try {
            if (this.mPaused) {
                mediaPlayer2.seekTo(0);
                this.mBackgroundMediaPlayer.start();
            } else if (mediaPlayer2.isPlaying()) {
                this.mBackgroundMediaPlayer.seekTo(0);
            } else {
                this.mBackgroundMediaPlayer.start();
            }
            this.mBackgroundMediaPlayer.setLooping(z);
            this.mPaused = false;
            this.mIsLoop = z;
        } catch (java.lang.Exception unused2) {
            android.util.Log.e(TAG, "playBackgroundMusic: error state");
        }
    }

    public void stopBackgroundMusic() {
        android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
            this.mBackgroundMediaPlayer = createMediaplayer(this.mCurrentPath);
            this.mPaused = false;
        }
    }

    public void pauseBackgroundMusic() {
        try {
            android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            this.mBackgroundMediaPlayer.pause();
            this.mPaused = true;
            this.mManualPaused = true;
        } catch (java.lang.Exception unused) {
        }
    }

    public void resumeBackgroundMusic() {
        try {
            android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
            if (mediaPlayer == null || !this.mPaused) {
                return;
            }
            mediaPlayer.start();
            this.mPaused = false;
            this.mManualPaused = false;
        } catch (java.lang.Exception unused) {
        }
    }

    public void rewindBackgroundMusic() {
        if (this.mBackgroundMediaPlayer != null) {
            playBackgroundMusic(this.mCurrentPath, this.mIsLoop);
        }
    }

    public boolean isBackgroundMusicPlaying() {
        android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
        if (mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public void end() {
        android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
        }
        initData();
    }

    public float getBackgroundVolume() {
        if (this.mBackgroundMediaPlayer != null) {
            return (this.mLeftVolume + this.mRightVolume) / 2.0f;
        }
        return 0.0f;
    }

    public void setBackgroundVolume(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        try {
            this.mRightVolume = f;
            this.mLeftVolume = f;
            android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f, f);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void onEnterBackground() {
        try {
            android.media.MediaPlayer mediaPlayer = this.mBackgroundMediaPlayer;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            this.mBackgroundMediaPlayer.pause();
            this.mPaused = true;
        } catch (java.lang.Exception unused) {
        }
    }

    public void onEnterForeground() {
        android.media.MediaPlayer mediaPlayer;
        if (this.mManualPaused || (mediaPlayer = this.mBackgroundMediaPlayer) == null || !this.mPaused) {
            return;
        }
        mediaPlayer.start();
        this.mPaused = false;
    }

    private void initData() {
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        this.mBackgroundMediaPlayer = null;
        this.mPaused = false;
        this.mCurrentPath = null;
    }

    private android.media.MediaPlayer createMediaplayer(java.lang.String str) {
        android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        try {
            if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
                mediaPlayer.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
            } else {
                android.content.res.AssetFileDescriptor openFd = this.mContext.getAssets().openFd(str);
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
            }
            mediaPlayer.prepare();
            mediaPlayer.setVolume(this.mLeftVolume, this.mRightVolume);
            return mediaPlayer;
        } catch (java.lang.Exception unused) {
            android.util.Log.e(TAG, "this is error log:" + str);
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused2) {
            }
            return null;
        }
    }
}
