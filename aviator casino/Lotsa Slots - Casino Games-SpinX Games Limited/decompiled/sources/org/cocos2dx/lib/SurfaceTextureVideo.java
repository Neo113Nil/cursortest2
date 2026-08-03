package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class SurfaceTextureVideo {
    private static org.cocos2dx.lib.Cocos2dxActivity mCocos2dxActivity;
    private static android.util.SparseArray<java.lang.Object> sSessions;

    private static void ensureSessions() {
        if (sSessions == null) {
            sSessions = new android.util.SparseArray<>();
        }
    }

    public SurfaceTextureVideo(org.cocos2dx.lib.Cocos2dxActivity cocos2dxActivity) {
        ensureSessions();
        mCocos2dxActivity = cocos2dxActivity;
    }

    public static int createVideo(int i, int i2, java.lang.String str) {
        ensureSessions();
        org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer videoPlayer = new org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer(i, i2, str);
        int textureID = videoPlayer.getTextureID();
        if (!videoPlayer.isError() && textureID > 0) {
            sSessions.put(i, videoPlayer);
        }
        return textureID;
    }

    public static int createVideoDual(int i, int i2, java.lang.String str, java.lang.String str2) {
        ensureSessions();
        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer dualVideoPlayer = new org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer(i, i2, str, str2);
        int textureID = dualVideoPlayer.getTextureID();
        if (!dualVideoPlayer.isError() && textureID > 0) {
            sSessions.put(i, dualVideoPlayer);
        }
        return textureID;
    }

    public static int getAlphaTextureId(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).getAlphaTextureId();
        }
        return 0;
    }

    public static int onDraw(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).onDraw();
        }
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).onDraw();
        }
        return 0;
    }

    public static void play(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).play();
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).play();
        }
    }

    public static void setVolume(int i, float f) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).setVolume(f);
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).setVolume(f);
        }
    }

    public static void pause(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).pause();
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).pause();
        }
    }

    public static void resume(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).resume();
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).resume();
        }
    }

    public static void stop(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).stop();
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).stop();
        }
    }

    public static void seekTo(int i, float f) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).seekTo(f);
        } else if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).seekTo(f);
        }
    }

    public static void release(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (!(obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer)) {
            if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
                ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).release();
                sSessions.remove(i);
                return;
            }
            return;
        }
        ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).release();
        sSessions.remove(i);
    }

    public static int getVideoSize(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).getVideoSize();
        }
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).getVideoSize();
        }
        return 0;
    }

    public static int getDuration(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).getDuration();
        }
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).getDuration();
        }
        return 0;
    }

    public static int getCurrentTime(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).getCurrentTime();
        }
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).getCurrentTime();
        }
        return 0;
    }

    public static int hasFirstFrame(int i) {
        android.util.SparseArray<java.lang.Object> sparseArray = sSessions;
        if (sparseArray == null) {
            return 0;
        }
        java.lang.Object obj = sparseArray.get(i);
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer) obj).hasFirstFrameLatched() ? 1 : 0;
        }
        if (obj instanceof org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) {
            return ((org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer) obj).hasFirstFrameLatched() ? 1 : 0;
        }
        return 0;
    }

    private static class VideoPlayer implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
        private static final int STATE_ERROR = -1;
        private static final int STATE_IDLE = 0;
        private static final int STATE_PAUSED = 4;
        private static final int STATE_PLAYBACK_COMPLETED = 5;
        private static final int STATE_PLAYING = 3;
        private static final int STATE_PREPARED = 2;
        private static final int STATE_PREPARING = 1;
        int id;
        android.media.MediaPlayer mMediaPlayer;
        int mSeekWhenPrepared;
        android.graphics.SurfaceTexture mSurface;
        private android.net.Uri mUri;
        private volatile boolean updateSurface;
        private java.lang.String TAG = "SurfaceTextureVideo";
        private java.lang.String assetResourceRoot = "assets/";
        private boolean isAssetRouse = false;
        private java.lang.String fileName = null;
        int mTextureID = 0;
        private boolean mFirstFrameLatched = false;
        private int mVideoWidth = 0;
        private int mVideoHeight = 0;
        boolean isLoad = false;
        boolean isPlay = false;
        private int mCurrentState = 0;
        private int mTargetState = 0;
        private boolean mInitialSeekPending = false;
        android.media.MediaPlayer.OnPreparedListener mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mCurrentState = 2;
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mVideoWidth = mediaPlayer.getVideoWidth();
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mVideoHeight = mediaPlayer.getVideoHeight();
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mInitialSeekPending = true;
                org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mSeekWhenPrepared != 0) {
                            org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.seekTo(org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mSeekWhenPrepared / 1000.0f);
                        } else {
                            org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.seekTo(0.001f);
                        }
                    }
                });
            }
        };
        private android.media.MediaPlayer.OnCompletionListener mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                android.util.Log.d(org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.TAG, "mCompletionListener: ");
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mCurrentState = 5;
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mTargetState = 5;
            }
        };
        private android.media.MediaPlayer.OnErrorListener mErrorListener = new android.media.MediaPlayer.OnErrorListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                android.util.Log.d(org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.TAG, "Error: " + i + "," + i2);
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mCurrentState = -1;
                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mTargetState = -1;
                return true;
            }
        };

        public VideoPlayer(int i, int i2, java.lang.String str) {
            this.id = i;
            if (i2 == 0) {
                setVideoFileName(str);
            } else {
                setVideoURL(str);
            }
        }

        public int getTextureID() {
            return this.mTextureID;
        }

        boolean hasFirstFrameLatched() {
            return this.mFirstFrameLatched;
        }

        public void setVideoFileName(java.lang.String str) {
            if (str.startsWith(this.assetResourceRoot)) {
                str = str.substring(this.assetResourceRoot.length());
            }
            if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                this.isAssetRouse = false;
                setVideoURI(android.net.Uri.parse(str), null);
            } else {
                this.fileName = str;
                this.isAssetRouse = true;
                setVideoURI(android.net.Uri.parse(str), null);
            }
        }

        public void setVideoURL(java.lang.String str) {
            this.isAssetRouse = false;
            setVideoURI(android.net.Uri.parse(str), null);
        }

        private void setVideoURI(android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) {
            this.mUri = uri;
            this.mVideoWidth = 0;
            this.mVideoHeight = 0;
            openVideo();
        }

        private void openVideo() {
            if (this.isAssetRouse) {
                if (this.fileName == null) {
                    return;
                }
            } else if (this.mUri == null) {
                return;
            }
            try {
                this.mCurrentState = 0;
                this.mTargetState = 0;
                this.mFirstFrameLatched = false;
                this.updateSurface = false;
                android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
                this.mMediaPlayer = mediaPlayer;
                mediaPlayer.setOnPreparedListener(this.mPreparedListener);
                this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
                this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
                this.mMediaPlayer.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.4
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(android.media.MediaPlayer mediaPlayer2) {
                        if (org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mInitialSeekPending) {
                            org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mInitialSeekPending = false;
                            if (org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mTargetState == 3) {
                                try {
                                    mediaPlayer2.start();
                                    org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mCurrentState = 3;
                                } catch (java.lang.IllegalStateException unused) {
                                }
                            }
                        }
                    }
                });
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(36197, iArr[0]);
                android.opengl.GLES20.glTexParameterf(36197, 10241, 9728.0f);
                android.opengl.GLES20.glTexParameterf(36197, androidx.work.Data.MAX_DATA_BYTES, 9729.0f);
                android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iArr[0]);
                this.mSurface = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                android.view.Surface surface = new android.view.Surface(this.mSurface);
                this.mMediaPlayer.setSurface(surface);
                surface.release();
                this.mMediaPlayer.setAudioStreamType(3);
                if (this.isAssetRouse) {
                    android.content.res.AssetFileDescriptor openFd = org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.getAssets().openFd(this.fileName);
                    this.mMediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                } else {
                    this.mMediaPlayer.setDataSource(org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity, this.mUri);
                }
                this.updateSurface = false;
                this.mMediaPlayer.prepareAsync();
                android.util.Log.d(this.TAG, "prepareAsync: ");
                this.mTextureID = iArr[0];
            } catch (java.io.IOException e) {
                android.util.Log.w(this.TAG, "Unable to open content: " + this.mUri, e);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            } catch (java.lang.IllegalArgumentException e2) {
                android.util.Log.w(this.TAG, "Unable to open content: " + this.mUri, e2);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            } catch (java.lang.Exception e3) {
                android.util.Log.w(this.TAG, "Unable to open content: " + this.mUri, e3);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            }
        }

        public int onDraw() {
            android.graphics.SurfaceTexture surfaceTexture;
            int i = this.mCurrentState;
            if ((i == 3 || i == 4 || i == 2 || i == 5) && (surfaceTexture = this.mSurface) != null) {
                try {
                    if (this.mFirstFrameLatched) {
                        if (i == 3) {
                            surfaceTexture.updateTexImage();
                        } else if (this.updateSurface) {
                            this.mSurface.updateTexImage();
                            this.updateSurface = false;
                        }
                    } else if (this.updateSurface) {
                        this.mSurface.updateTexImage();
                        this.updateSurface = false;
                        this.mFirstFrameLatched = true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            return this.mCurrentState;
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
            this.updateSurface = true;
        }

        public void play() {
            this.mTargetState = 3;
            if (this.mCurrentState == 5) {
                replay();
            } else {
                if (!isInPlaybackState() || this.mInitialSeekPending) {
                    return;
                }
                this.mMediaPlayer.start();
                this.mCurrentState = 3;
            }
        }

        public void replay() {
            if (isInPlaybackState()) {
                this.mFirstFrameLatched = false;
                this.updateSurface = false;
                this.mMediaPlayer.seekTo(0);
                this.mMediaPlayer.start();
                this.mCurrentState = 3;
                this.mTargetState = 3;
            }
        }

        public void setVolume(float f) {
            this.mMediaPlayer.setVolume(f, f);
        }

        public void pause() {
            if (this.mCurrentState == 5) {
                return;
            }
            if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
                this.mMediaPlayer.pause();
                this.mCurrentState = 4;
            }
            this.mTargetState = 4;
        }

        public void resume() {
            if (isInPlaybackState()) {
                int i = this.mCurrentState;
                if ((i == 4 || i == 2) && !this.mInitialSeekPending) {
                    this.mMediaPlayer.start();
                    this.mCurrentState = 3;
                }
            }
        }

        public void stop() {
            if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
                this.mMediaPlayer.stop();
            }
        }

        public void seekTo(float f) {
            if (!isInPlaybackState()) {
                this.mSeekWhenPrepared = (int) (f * 1000.0f);
                return;
            }
            final int i = (int) (f * 1000.0f);
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mMediaPlayer != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mMediaPlayer.seekTo(i, 3);
                            } else {
                                org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mMediaPlayer.seekTo(i);
                            }
                        }
                        org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.this.mSeekWhenPrepared = 0;
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
            };
            if (org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity != null) {
                org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnUiThread(runnable);
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                if (org.cocos2dx.lib.Cocos2dxVideoHelper.tryFixAnr) {
                    final android.media.MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                    new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.VideoPlayer.6
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                android.media.MediaPlayer mediaPlayer3 = mediaPlayer2;
                                if (mediaPlayer3 != null) {
                                    mediaPlayer3.reset();
                                    mediaPlayer2.release();
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }).start();
                } else {
                    this.mMediaPlayer.reset();
                    this.mMediaPlayer.release();
                }
                this.mSurface.release();
                this.mMediaPlayer = null;
                this.mCurrentState = 0;
                this.mTargetState = 0;
                this.mInitialSeekPending = false;
                this.mFirstFrameLatched = false;
                this.updateSurface = false;
            }
        }

        public boolean isInPlaybackState() {
            int i;
            return (this.mMediaPlayer == null || (i = this.mCurrentState) == -1 || i == 0 || i == 1) ? false : true;
        }

        public boolean isError() {
            return this.mCurrentState == -1;
        }

        public int getVideoSize() {
            return (this.mVideoWidth * 10000) + this.mVideoHeight;
        }

        public int getDuration() {
            return this.mMediaPlayer.getDuration();
        }

        public int getCurrentTime() {
            return this.mMediaPlayer.getCurrentPosition();
        }
    }

    private static final class DualVideoPlayer {
        private static final int STATE_ERROR = -1;
        private static final int STATE_IDLE = 0;
        private static final int STATE_PAUSED = 4;
        private static final int STATE_PLAYBACK_COMPLETED = 5;
        private static final int STATE_PLAYING = 3;
        private static final int STATE_PREPARED = 2;
        private static final int STATE_PREPARING = 1;
        private android.media.MediaPlayer mAlphaMP;
        private org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.PathSpec mAlphaPath;
        private android.graphics.SurfaceTexture mAlphaST;
        private int mAlphaTex;
        private android.media.MediaPlayer mColorMP;
        private org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.PathSpec mColorPath;
        private android.graphics.SurfaceTexture mColorST;
        private int mColorTex;
        private int mCurrentState;
        private int mSeekWhenPrepared;
        private int mTargetState;
        private int mVideoHeight;
        private int mVideoWidth;
        private volatile boolean updateAlphaSurface;
        private volatile boolean updateColorSurface;
        private boolean mInitialDualPrimePending = false;
        private int mDualPrimeSeekAck = 0;
        private boolean mColorFrameLatched = false;
        private boolean mAlphaFrameLatched = false;

        private static final class PathSpec {
            final java.lang.String assetFileName;
            final boolean isAsset;
            final android.net.Uri uri;

            PathSpec(int i, java.lang.String str) {
                if (i == 1) {
                    this.isAsset = false;
                    this.assetFileName = null;
                    this.uri = android.net.Uri.parse(str);
                    return;
                }
                str = str.startsWith("assets/") ? str.substring(7) : str;
                if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                    this.isAsset = false;
                    this.assetFileName = null;
                    this.uri = android.net.Uri.parse(str);
                } else {
                    this.isAsset = true;
                    this.assetFileName = str;
                    this.uri = android.net.Uri.parse(str);
                }
            }

            void setDataSource(android.media.MediaPlayer mediaPlayer) throws java.io.IOException {
                java.lang.String scheme;
                java.lang.String path;
                if (this.isAsset) {
                    android.content.res.AssetFileDescriptor openFd = org.cocos2dx.lib.Cocos2dxActivity.getContext().getAssets().openFd(this.assetFileName);
                    mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                } else if (android.os.Build.VERSION.SDK_INT < 23 && (((scheme = this.uri.getScheme()) == null || scheme.isEmpty() || "file".equalsIgnoreCase(scheme)) && (path = this.uri.getPath()) != null && path.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) && new java.io.File(path).isFile())) {
                    mediaPlayer.setDataSource(path);
                } else {
                    mediaPlayer.setDataSource(org.cocos2dx.lib.Cocos2dxActivity.getContext(), this.uri);
                }
            }
        }

        DualVideoPlayer(int i, int i2, java.lang.String str, java.lang.String str2) {
            this.mCurrentState = 0;
            this.mTargetState = 0;
            if (org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity == null) {
                android.util.Log.e("SurfaceTextureVideo", "mCocos2dxActivity is null (dual)");
                this.mCurrentState = -1;
                this.mTargetState = -1;
                return;
            }
            this.mColorPath = new org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.PathSpec(i2, str);
            this.mAlphaPath = new org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.PathSpec(i2, str2);
            try {
                this.mColorTex = allocExternalOesTexture();
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.mColorTex);
                this.mColorST = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.1
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.updateColorSurface = true;
                    }
                });
                scheduleOpenColor();
            } catch (java.lang.Exception e) {
                android.util.Log.w("SurfaceTextureVideo", "dual alloc OES failed", e);
                this.mCurrentState = -1;
                this.mTargetState = -1;
            }
        }

        private static boolean needsLollipopMediaWorkarounds() {
            return android.os.Build.VERSION.SDK_INT < 23;
        }

        private static void applyAudioOutput(android.media.MediaPlayer mediaPlayer) {
            mediaPlayer.setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        }

        private void scheduleOpenColor() {
            if (needsLollipopMediaWorkarounds()) {
                org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.openColor();
                    }
                });
            } else {
                openColor();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int allocExternalOesTexture() {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr[0]);
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(36197, androidx.work.Data.MAX_DATA_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            return iArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void openColor() {
            try {
                this.mCurrentState = 0;
                this.mTargetState = 0;
                android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
                this.mColorMP = mediaPlayer;
                mediaPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.3
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(android.media.MediaPlayer mediaPlayer2) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.onColorPrepared();
                    }
                });
                this.mColorMP.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.4
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(android.media.MediaPlayer mediaPlayer2) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mCurrentState = 5;
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mTargetState = 5;
                    }
                });
                this.mColorMP.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.5
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(android.media.MediaPlayer mediaPlayer2, int i, int i2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("dual color onError ");
                        sb.append(i);
                        sb.append(",");
                        sb.append(i2);
                        sb.append(i2 == -1010 ? " (MEDIA_ERROR_UNSUPPORTED)" : "");
                        android.util.Log.d("SurfaceTextureVideo", sb.toString());
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mCurrentState = -1;
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mTargetState = -1;
                        return true;
                    }
                });
                applyAudioOutput(this.mColorMP);
                if (needsLollipopMediaWorkarounds()) {
                    this.mColorPath.setDataSource(this.mColorMP);
                    android.view.Surface surface = new android.view.Surface(this.mColorST);
                    this.mColorMP.setSurface(surface);
                    surface.release();
                } else {
                    android.view.Surface surface2 = new android.view.Surface(this.mColorST);
                    this.mColorMP.setSurface(surface2);
                    surface2.release();
                    this.mColorPath.setDataSource(this.mColorMP);
                }
                this.mCurrentState = 1;
                this.mColorMP.prepareAsync();
            } catch (java.lang.Exception e) {
                android.util.Log.w("SurfaceTextureVideo", "dual openColor failed", e);
                this.mCurrentState = -1;
                this.mTargetState = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onColorPrepared() {
            this.mVideoWidth = this.mColorMP.getVideoWidth();
            this.mVideoHeight = this.mColorMP.getVideoHeight();
            org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.6
                @Override // java.lang.Runnable
                public void run() {
                    if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaMP != null) {
                        return;
                    }
                    try {
                        if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaST == null) {
                            org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaTex = org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.allocExternalOesTexture();
                            org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaST = new android.graphics.SurfaceTexture(org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaTex);
                            org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaST.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.6.1
                                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
                                    org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.updateAlphaSurface = true;
                                }
                            });
                        }
                        org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.6.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaMP != null) {
                                    return;
                                }
                                org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.openAlpha();
                            }
                        });
                    } catch (java.lang.Exception e) {
                        android.util.Log.w("SurfaceTextureVideo", "dual alpha OES on GL thread failed", e);
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mCurrentState = -1;
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mTargetState = -1;
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void openAlpha() {
            if (this.mAlphaST == null) {
                android.util.Log.e("SurfaceTextureVideo", "dual openAlpha: mAlphaST is null");
                this.mCurrentState = -1;
                this.mTargetState = -1;
                return;
            }
            try {
                android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
                this.mAlphaMP = mediaPlayer;
                mediaPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.7
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(android.media.MediaPlayer mediaPlayer2) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.onAlphaPrepared();
                    }
                });
                this.mAlphaMP.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.8
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(android.media.MediaPlayer mediaPlayer2, int i, int i2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("dual alpha onError ");
                        sb.append(i);
                        sb.append(",");
                        sb.append(i2);
                        sb.append(i2 == -1010 ? " (MEDIA_ERROR_UNSUPPORTED)" : "");
                        android.util.Log.d("SurfaceTextureVideo", sb.toString());
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mCurrentState = -1;
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mTargetState = -1;
                        return true;
                    }
                });
                this.mAlphaMP.setVolume(0.0f, 0.0f);
                applyAudioOutput(this.mAlphaMP);
                if (needsLollipopMediaWorkarounds()) {
                    this.mAlphaPath.setDataSource(this.mAlphaMP);
                    android.view.Surface surface = new android.view.Surface(this.mAlphaST);
                    this.mAlphaMP.setSurface(surface);
                    surface.release();
                } else {
                    android.view.Surface surface2 = new android.view.Surface(this.mAlphaST);
                    this.mAlphaMP.setSurface(surface2);
                    surface2.release();
                    this.mAlphaPath.setDataSource(this.mAlphaMP);
                }
                this.mAlphaMP.prepareAsync();
            } catch (java.lang.Exception e) {
                android.util.Log.w("SurfaceTextureVideo", "dual openAlpha failed", e);
                this.mCurrentState = -1;
                this.mTargetState = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifyDualPrimeSeekComplete() {
            if (this.mInitialDualPrimePending) {
                int i = this.mDualPrimeSeekAck + 1;
                this.mDualPrimeSeekAck = i;
                if (i < 2) {
                    return;
                }
                this.mInitialDualPrimePending = false;
                this.mDualPrimeSeekAck = 0;
                if (this.mTargetState == 3) {
                    try {
                        android.media.MediaPlayer mediaPlayer = this.mColorMP;
                        if (mediaPlayer != null) {
                            mediaPlayer.start();
                        }
                        android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.start();
                        }
                        this.mCurrentState = 3;
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onAlphaPrepared() {
            this.mCurrentState = 2;
            this.mInitialDualPrimePending = true;
            this.mDualPrimeSeekAck = 0;
            android.media.MediaPlayer mediaPlayer = this.mColorMP;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.9
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(android.media.MediaPlayer mediaPlayer2) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.notifyDualPrimeSeekComplete();
                    }
                });
            }
            android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.10
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(android.media.MediaPlayer mediaPlayer3) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.notifyDualPrimeSeekComplete();
                    }
                });
            }
            org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.11
                @Override // java.lang.Runnable
                public void run() {
                    if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mSeekWhenPrepared != 0) {
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer dualVideoPlayer = org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this;
                        dualVideoPlayer.seekToInternalMs(dualVideoPlayer.mSeekWhenPrepared);
                        org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mSeekWhenPrepared = 0;
                        return;
                    }
                    org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.seekTo(0.001f);
                }
            });
        }

        int getTextureID() {
            return this.mColorTex;
        }

        int getAlphaTextureId() {
            return this.mAlphaTex;
        }

        boolean hasFirstFrameLatched() {
            return this.mColorFrameLatched && this.mAlphaFrameLatched;
        }

        boolean isError() {
            return this.mCurrentState == -1;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0037
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        int onDraw() {
            /*
                r6 = this;
                int r0 = r6.mCurrentState
                r1 = 3
                if (r0 == r1) goto Le
                r2 = 4
                if (r0 == r2) goto Le
                r2 = 2
                if (r0 == r2) goto Le
                r2 = 5
                if (r0 != r2) goto L60
            Le:
                r2 = 1
                r3 = 0
                android.graphics.SurfaceTexture r4 = r6.mColorST     // Catch: java.lang.Exception -> L37
                if (r4 == 0) goto L37
                boolean r5 = r6.mColorFrameLatched     // Catch: java.lang.Exception -> L37
                if (r5 != 0) goto L26
                boolean r0 = r6.updateColorSurface     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L37
                android.graphics.SurfaceTexture r0 = r6.mColorST     // Catch: java.lang.Exception -> L37
                r0.updateTexImage()     // Catch: java.lang.Exception -> L37
                r6.updateColorSurface = r3     // Catch: java.lang.Exception -> L37
                r6.mColorFrameLatched = r2     // Catch: java.lang.Exception -> L37
                goto L37
            L26:
                if (r0 != r1) goto L2c
                r4.updateTexImage()     // Catch: java.lang.Exception -> L37
                goto L37
            L2c:
                boolean r0 = r6.updateColorSurface     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L37
                android.graphics.SurfaceTexture r0 = r6.mColorST     // Catch: java.lang.Exception -> L37
                r0.updateTexImage()     // Catch: java.lang.Exception -> L37
                r6.updateColorSurface = r3     // Catch: java.lang.Exception -> L37
            L37:
                android.graphics.SurfaceTexture r0 = r6.mAlphaST     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L60
                boolean r4 = r6.mAlphaFrameLatched     // Catch: java.lang.Exception -> L60
                if (r4 != 0) goto L4d
                boolean r0 = r6.updateAlphaSurface     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L60
                android.graphics.SurfaceTexture r0 = r6.mAlphaST     // Catch: java.lang.Exception -> L60
                r0.updateTexImage()     // Catch: java.lang.Exception -> L60
                r6.updateAlphaSurface = r3     // Catch: java.lang.Exception -> L60
                r6.mAlphaFrameLatched = r2     // Catch: java.lang.Exception -> L60
                goto L60
            L4d:
                int r2 = r6.mCurrentState     // Catch: java.lang.Exception -> L60
                if (r2 != r1) goto L55
                r0.updateTexImage()     // Catch: java.lang.Exception -> L60
                goto L60
            L55:
                boolean r0 = r6.updateAlphaSurface     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L60
                android.graphics.SurfaceTexture r0 = r6.mAlphaST     // Catch: java.lang.Exception -> L60
                r0.updateTexImage()     // Catch: java.lang.Exception -> L60
                r6.updateAlphaSurface = r3     // Catch: java.lang.Exception -> L60
            L60:
                int r0 = r6.mCurrentState
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.onDraw():int");
        }

        void play() {
            this.mTargetState = 3;
            if (this.mCurrentState == 5) {
                replay();
                return;
            }
            if (!isInPlaybackState() || this.mInitialDualPrimePending) {
                return;
            }
            android.media.MediaPlayer mediaPlayer = this.mColorMP;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
            this.mCurrentState = 3;
        }

        private void replay() {
            if (isInPlaybackState()) {
                this.mColorFrameLatched = false;
                this.mAlphaFrameLatched = false;
                this.updateColorSurface = false;
                this.updateAlphaSurface = false;
                this.mColorMP.seekTo(0);
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    this.mColorMP.seekTo(0L, 3);
                } else {
                    this.mColorMP.seekTo(0);
                }
                if (this.mAlphaMP != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        this.mAlphaMP.seekTo(0L, 3);
                    } else {
                        this.mAlphaMP.seekTo(0);
                    }
                    this.mAlphaMP.seekTo(0);
                }
                this.mColorMP.start();
                android.media.MediaPlayer mediaPlayer = this.mAlphaMP;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
                this.mCurrentState = 3;
                this.mTargetState = 3;
            }
        }

        void setVolume(float f) {
            android.media.MediaPlayer mediaPlayer = this.mColorMP;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f, f);
            }
        }

        void pause() {
            if (this.mCurrentState == 5) {
                return;
            }
            if (isInPlaybackState()) {
                android.media.MediaPlayer mediaPlayer = this.mColorMP;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.mColorMP.pause();
                }
                android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
                if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                    this.mAlphaMP.pause();
                }
                this.mCurrentState = 4;
            }
            this.mTargetState = 4;
        }

        void resume() {
            if (isInPlaybackState()) {
                int i = this.mCurrentState;
                if ((i == 4 || i == 2) && !this.mInitialDualPrimePending) {
                    android.media.MediaPlayer mediaPlayer = this.mColorMP;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                    android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                    }
                    this.mCurrentState = 3;
                }
            }
        }

        void stop() {
            if (isInPlaybackState()) {
                android.media.MediaPlayer mediaPlayer = this.mColorMP;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.mColorMP.stop();
                }
                android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
                if (mediaPlayer2 == null || !mediaPlayer2.isPlaying()) {
                    return;
                }
                this.mAlphaMP.stop();
            }
        }

        void seekTo(float f) {
            seekToInternalMs((int) (f * 1000.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void seekToInternalMs(final int i) {
            if (!isInPlaybackState()) {
                this.mSeekWhenPrepared = i;
                return;
            }
            this.mSeekWhenPrepared = 0;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mColorMP != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mColorMP.seekTo(i, 3);
                            } else {
                                org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mColorMP.seekTo(i);
                            }
                        }
                        if (org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaMP != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaMP.seekTo(i, 3);
                            } else {
                                org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.this.mAlphaMP.seekTo(i);
                            }
                        }
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
            };
            if (org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity != null) {
                org.cocos2dx.lib.SurfaceTextureVideo.mCocos2dxActivity.runOnUiThread(runnable);
            } else {
                runnable.run();
            }
        }

        private void releaseMediaPlayerAsync(final android.media.MediaPlayer mediaPlayer) {
            if (mediaPlayer == null) {
                return;
            }
            if (org.cocos2dx.lib.Cocos2dxVideoHelper.tryFixAnr) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.SurfaceTextureVideo.DualVideoPlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            mediaPlayer.reset();
                            mediaPlayer.release();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }).start();
                return;
            }
            try {
                mediaPlayer.reset();
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            try {
                android.media.MediaPlayer mediaPlayer = this.mColorMP;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (java.lang.Exception unused) {
            }
            try {
                android.media.MediaPlayer mediaPlayer2 = this.mAlphaMP;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.stop();
                }
            } catch (java.lang.Exception unused2) {
            }
            releaseMediaPlayerAsync(this.mColorMP);
            releaseMediaPlayerAsync(this.mAlphaMP);
            this.mColorMP = null;
            this.mAlphaMP = null;
            android.graphics.SurfaceTexture surfaceTexture = this.mColorST;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mColorST = null;
            }
            android.graphics.SurfaceTexture surfaceTexture2 = this.mAlphaST;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
                this.mAlphaST = null;
            }
            this.mCurrentState = 0;
            this.mTargetState = 0;
            this.mInitialDualPrimePending = false;
            this.mDualPrimeSeekAck = 0;
            this.mColorFrameLatched = false;
            this.mAlphaFrameLatched = false;
            this.updateColorSurface = false;
            this.updateAlphaSurface = false;
        }

        private boolean isInPlaybackState() {
            int i;
            return (this.mColorMP == null || (i = this.mCurrentState) == -1 || i == 0 || i == 1) ? false : true;
        }

        int getVideoSize() {
            return (this.mVideoWidth * 10000) + this.mVideoHeight;
        }

        int getDuration() {
            android.media.MediaPlayer mediaPlayer = this.mColorMP;
            if (mediaPlayer == null) {
                return 0;
            }
            try {
                return mediaPlayer.getDuration();
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }

        int getCurrentTime() {
            android.media.MediaPlayer mediaPlayer = this.mColorMP;
            if (mediaPlayer == null) {
                return 0;
            }
            try {
                return mediaPlayer.getCurrentPosition();
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }
    }
}
