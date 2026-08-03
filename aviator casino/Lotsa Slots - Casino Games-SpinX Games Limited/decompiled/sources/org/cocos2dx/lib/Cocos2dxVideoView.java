package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxVideoView extends android.view.SurfaceView implements android.widget.MediaController.MediaPlayerControl, android.view.SurfaceHolder.Callback {
    private static final int EVENT_COMPLETED = 3;
    private static final int EVENT_PAUSED = 1;
    private static final int EVENT_PLAYING = 0;
    private static final int EVENT_STOPPED = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    public static float volume = -1.0f;
    private java.lang.String TAG;
    private java.lang.String assetResourceRoot;
    private java.lang.String fileName;
    private boolean isAssetRouse;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    protected org.cocos2dx.lib.Cocos2dxActivity mCocos2dxActivity;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private android.media.MediaPlayer.OnErrorListener mErrorListener;
    protected boolean mFullScreenEnabled;
    protected int mFullScreenHeight;
    protected int mFullScreenWidth;
    private boolean mKeepRatio;
    private android.media.MediaPlayer mMediaPlayer;
    private boolean mNeedResume;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    private org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener mOnVideoEventListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener;
    private int mSeekWhenPrepared;
    protected android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private android.view.SurfaceHolder mSurfaceHolder;
    private int mTargetState;
    private android.net.Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;
    protected int mViewHeight;
    protected int mViewLeft;
    private int mViewTag;
    protected int mViewTop;
    protected int mViewWidth;
    protected int mVisibleHeight;
    protected int mVisibleLeft;
    protected int mVisibleTop;
    protected int mVisibleWidth;

    public interface OnVideoEventListener {
        void onVideoEvent(int i, int i2);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public Cocos2dxVideoView(org.cocos2dx.lib.Cocos2dxActivity cocos2dxActivity, int i) {
        super(cocos2dxActivity);
        this.TAG = "VideoView";
        this.mCurrentState = 0;
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.mMediaPlayer = null;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mCocos2dxActivity = null;
        this.mViewLeft = 0;
        this.mViewTop = 0;
        this.mViewWidth = 0;
        this.mViewHeight = 0;
        this.mVisibleLeft = 0;
        this.mVisibleTop = 0;
        this.mVisibleWidth = 0;
        this.mVisibleHeight = 0;
        this.mFullScreenEnabled = false;
        this.mFullScreenWidth = 0;
        this.mFullScreenHeight = 0;
        this.mViewTag = 0;
        this.mNeedResume = false;
        this.isAssetRouse = false;
        this.fileName = null;
        this.assetResourceRoot = "assets/";
        this.mKeepRatio = false;
        this.mSizeChangedListener = new android.media.MediaPlayer.OnVideoSizeChangedListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.2
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i2, int i3) {
                org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoWidth = mediaPlayer.getVideoWidth();
                org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoHeight = mediaPlayer.getVideoHeight();
                if (org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoWidth == 0 || org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoHeight == 0) {
                    return;
                }
                org.cocos2dx.lib.Cocos2dxVideoView.this.getHolder().setFixedSize(org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoWidth, org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoHeight);
            }
        };
        this.mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                org.cocos2dx.lib.Cocos2dxVideoView.this.mCurrentState = 2;
                if (org.cocos2dx.lib.Cocos2dxVideoView.this.mOnPreparedListener != null) {
                    org.cocos2dx.lib.Cocos2dxVideoView.this.mOnPreparedListener.onPrepared(org.cocos2dx.lib.Cocos2dxVideoView.this.mMediaPlayer);
                }
                org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoWidth = mediaPlayer.getVideoWidth();
                org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoHeight = mediaPlayer.getVideoHeight();
                int i2 = org.cocos2dx.lib.Cocos2dxVideoView.this.mSeekWhenPrepared;
                if (i2 != 0) {
                    org.cocos2dx.lib.Cocos2dxVideoView.this.seekTo(i2);
                }
                if (org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoWidth != 0 && org.cocos2dx.lib.Cocos2dxVideoView.this.mVideoHeight != 0) {
                    org.cocos2dx.lib.Cocos2dxVideoView.this.fixSize();
                }
                if (org.cocos2dx.lib.Cocos2dxVideoView.this.mTargetState == 3) {
                    org.cocos2dx.lib.Cocos2dxVideoView.this.start();
                }
                android.util.Log.d(org.cocos2dx.lib.Cocos2dxVideoView.this.TAG, "onPrepared: ");
            }
        };
        this.mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                android.util.Log.d(org.cocos2dx.lib.Cocos2dxVideoView.this.TAG, "mCompletionListener: ");
                org.cocos2dx.lib.Cocos2dxVideoView.this.mCurrentState = 5;
                org.cocos2dx.lib.Cocos2dxVideoView.this.mTargetState = 5;
                if (org.cocos2dx.lib.Cocos2dxVideoView.this.mOnVideoEventListener != null) {
                    org.cocos2dx.lib.Cocos2dxVideoView.this.mOnVideoEventListener.onVideoEvent(org.cocos2dx.lib.Cocos2dxVideoView.this.mViewTag, 3);
                }
            }
        };
        this.mErrorListener = new android.media.MediaPlayer.OnErrorListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.5
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(android.media.MediaPlayer mediaPlayer, int i2, int i3) {
                android.util.Log.d(org.cocos2dx.lib.Cocos2dxVideoView.this.TAG, "Error: " + i2 + "," + i3);
                org.cocos2dx.lib.Cocos2dxVideoView.this.mCurrentState = -1;
                org.cocos2dx.lib.Cocos2dxVideoView.this.mTargetState = -1;
                if ((org.cocos2dx.lib.Cocos2dxVideoView.this.mOnErrorListener == null || !org.cocos2dx.lib.Cocos2dxVideoView.this.mOnErrorListener.onError(org.cocos2dx.lib.Cocos2dxVideoView.this.mMediaPlayer, i2, i3)) && org.cocos2dx.lib.Cocos2dxVideoView.this.getWindowToken() != null) {
                    android.content.res.Resources resources = org.cocos2dx.lib.Cocos2dxVideoView.this.mCocos2dxActivity.getResources();
                    new android.app.AlertDialog.Builder(org.cocos2dx.lib.Cocos2dxVideoView.this.mCocos2dxActivity).setTitle(resources.getString(resources.getIdentifier("VideoView_error_title", "string", "android"))).setMessage(i2 == 200 ? resources.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android") : resources.getIdentifier("VideoView_error_text_unknown", "string", "android")).setPositiveButton(resources.getString(resources.getIdentifier("VideoView_error_button", "string", "android")), new android.content.DialogInterface.OnClickListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.5.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i4) {
                            if (org.cocos2dx.lib.Cocos2dxVideoView.this.mOnVideoEventListener != null) {
                                org.cocos2dx.lib.Cocos2dxVideoView.this.mOnVideoEventListener.onVideoEvent(org.cocos2dx.lib.Cocos2dxVideoView.this.mViewTag, 3);
                            }
                        }
                    }).setCancelable(false).show();
                }
                return true;
            }
        };
        this.mBufferingUpdateListener = new android.media.MediaPlayer.OnBufferingUpdateListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.6
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i2) {
                org.cocos2dx.lib.Cocos2dxVideoView.this.mCurrentBufferPercentage = i2;
                android.util.Log.d(org.cocos2dx.lib.Cocos2dxVideoView.this.TAG, "updata: " + org.cocos2dx.lib.Cocos2dxVideoView.this.mCurrentBufferPercentage + "%");
            }
        };
        this.mViewTag = i;
        this.mCocos2dxActivity = cocos2dxActivity;
        initVideoView();
    }

    public static void setVolume(float f) {
        volume = f;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.mVisibleWidth;
        if (i4 != 0 && i4 != 0) {
            setMeasuredDimension(i4, this.mVisibleHeight);
            android.util.Log.d(this.TAG, "onMeasure1, " + this.mVisibleWidth + ":" + this.mVisibleHeight);
            return;
        }
        int i5 = this.mViewWidth;
        if (i5 != 0 && (i3 = this.mViewHeight) != 0) {
            setMeasuredDimension(i5, i3);
            android.util.Log.d(this.TAG, "onMeasure2, " + this.mViewWidth + ":" + this.mViewHeight);
            return;
        }
        setMeasuredDimension(1, 1);
        android.util.Log.d(this.TAG, "onMeasure3, " + this.mViewWidth + ":" + this.mViewHeight);
    }

    public void setVideoRect(int i, int i2, int i3, int i4) {
        this.mViewLeft = i;
        this.mViewTop = i2;
        this.mViewWidth = i3;
        this.mViewHeight = i4;
        if (this.mVideoWidth == 0 || this.mVideoHeight == 0) {
            return;
        }
        fixSize(i, i2, i3, i4);
    }

    public void setFullScreenEnabled(boolean z, int i, int i2) {
        if (this.mFullScreenEnabled != z) {
            this.mFullScreenEnabled = z;
            if (i != 0 && i2 != 0) {
                this.mFullScreenWidth = i;
                this.mFullScreenHeight = i2;
            }
            fixSize();
        }
    }

    public int resolveAdjustedSize(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return java.lang.Math.min(i, size);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        if (i == 4) {
            boolean isPlaying = isPlaying();
            this.mNeedResume = isPlaying;
            if (isPlaying) {
                this.mSeekWhenPrepared = getCurrentPosition();
            }
        } else if (this.mNeedResume) {
            start();
            this.mNeedResume = false;
        }
        super.setVisibility(i);
    }

    private void initVideoView() {
        android.util.Log.d(this.TAG, "initVideoView");
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        getHolder().addCallback(this);
        getHolder().setType(0);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mCurrentState = 0;
        this.mTargetState = 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 1 && !isPlaying() && this.mCurrentState == 4) {
            resume();
        }
        return true;
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
        this.mSeekWhenPrepared = 0;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        openVideo();
        requestLayout();
        invalidate();
    }

    public void stopPlayback() {
        android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            if (org.cocos2dx.lib.Cocos2dxVideoHelper.tryFixAnr) {
                final android.media.MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            android.media.MediaPlayer mediaPlayer3 = mediaPlayer2;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.release();
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }).start();
            } else {
                this.mMediaPlayer.release();
            }
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            this.mTargetState = 0;
        }
    }

    private void openVideo() {
        if (this.mSurfaceHolder == null) {
            android.util.Log.d(this.TAG, "openVideo mSurfaceHolder == null");
            return;
        }
        if (this.isAssetRouse) {
            if (this.fileName == null) {
                return;
            }
        } else if (this.mUri == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.android.music.musicservicecommand");
        intent.putExtra(com.ironsource.sdk.controller.f.b.g, "pause");
        this.mCocos2dxActivity.sendBroadcast(intent);
        release(false);
        try {
            android.util.Log.d(this.TAG, "init: ");
            android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
            this.mMediaPlayer = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this.mPreparedListener);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
            this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
            this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
            this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
            this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            float f = volume;
            if (f >= 0.0f) {
                this.mMediaPlayer.setVolume(f, f);
                volume = -1.0f;
            }
            this.mDuration = -1;
            this.mCurrentBufferPercentage = 0;
            if (this.isAssetRouse) {
                android.content.res.AssetFileDescriptor openFd = this.mCocos2dxActivity.getAssets().openFd(this.fileName);
                this.mMediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            } else {
                this.mMediaPlayer.setDataSource(this.mCocos2dxActivity, this.mUri);
            }
            this.mMediaPlayer.prepareAsync();
            android.util.Log.d(this.TAG, "prepareAsync: ");
            this.mCurrentState = 1;
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
        }
    }

    public void setKeepRatio(boolean z) {
        this.mKeepRatio = z;
        fixSize();
    }

    public void fixSize() {
        if (this.mFullScreenEnabled) {
            fixSize(0, 0, this.mFullScreenWidth, this.mFullScreenHeight);
        } else {
            fixSize(this.mViewLeft, this.mViewTop, this.mViewWidth, this.mViewHeight);
        }
    }

    public void fixSize(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            if (this.mKeepRatio) {
                int i5 = this.mVideoWidth;
                int i6 = i5 * i4;
                int i7 = this.mVideoHeight;
                if (i6 > i3 * i7) {
                    this.mVisibleWidth = i3;
                    this.mVisibleHeight = (i7 * i3) / i5;
                } else if (i5 * i4 < i3 * i7) {
                    this.mVisibleWidth = (i5 * i4) / i7;
                    this.mVisibleHeight = i4;
                }
                this.mVisibleLeft = i + ((i3 - this.mVisibleWidth) / 2);
                this.mVisibleTop = i2 + ((i4 - this.mVisibleHeight) / 2);
            } else {
                this.mVisibleLeft = i;
                this.mVisibleTop = i2;
                this.mVisibleWidth = i3;
                this.mVisibleHeight = i4;
            }
        } else {
            this.mVisibleLeft = i;
            this.mVisibleTop = i2;
            this.mVisibleWidth = this.mVideoWidth;
            this.mVisibleHeight = this.mVideoHeight;
        }
        getHolder().setFixedSize(this.mVisibleWidth, this.mVisibleHeight);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.mVisibleLeft;
        layoutParams.topMargin = this.mVisibleTop;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setOnCompletionListener(org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener) {
        this.mOnVideoEventListener = onVideoEventListener;
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        boolean z = this.mTargetState == 3;
        boolean z2 = this.mVideoWidth == i2 && this.mVideoHeight == i3;
        if (this.mMediaPlayer != null && z && z2) {
            int i4 = this.mSeekWhenPrepared;
            if (i4 != 0) {
                seekTo(i4);
            }
            if (this.mCurrentState != 5) {
                start();
            }
        }
        android.util.Log.d(this.TAG, "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(surfaceHolder);
            int i = this.mCurrentState;
            if (i == 2) {
                start();
            } else if (i == 5) {
                this.mMediaPlayer.seekTo(Integer.MAX_VALUE);
                this.mMediaPlayer.start();
            } else {
                resume();
            }
        } else {
            openVideo();
        }
        android.util.Log.d(this.TAG, "surfaceCreated");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = null;
        if (this.mMediaPlayer != null) {
            pause();
        }
        android.util.Log.d(this.TAG, "surfaceDestroyed");
    }

    private void release(boolean z) {
        android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            if (org.cocos2dx.lib.Cocos2dxVideoHelper.tryFixAnr) {
                final android.media.MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxVideoView.7
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
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            if (z) {
                this.mTargetState = 0;
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (isInPlaybackState()) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener = this.mOnVideoEventListener;
            if (onVideoEventListener != null) {
                onVideoEventListener.onVideoEvent(this.mViewTag, 0);
            }
        }
        if (this.mCurrentState == 5) {
            restart();
        }
        this.mTargetState = 3;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (this.mCurrentState == 5) {
            return;
        }
        if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            this.mCurrentState = 4;
            org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener = this.mOnVideoEventListener;
            if (onVideoEventListener != null) {
                onVideoEventListener.onVideoEvent(this.mViewTag, 1);
            }
        }
        this.mTargetState = 4;
    }

    public void stop() {
        if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            stopPlayback();
            org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener = this.mOnVideoEventListener;
            if (onVideoEventListener != null) {
                onVideoEventListener.onVideoEvent(this.mViewTag, 2);
            }
        }
    }

    public void suspend() {
        release(false);
    }

    public void resume() {
        if (isInPlaybackState() && this.mCurrentState == 4) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener = this.mOnVideoEventListener;
            if (onVideoEventListener != null) {
                onVideoEventListener.onVideoEvent(this.mViewTag, 0);
            }
        }
    }

    public void restart() {
        if (isInPlaybackState()) {
            this.mMediaPlayer.seekTo(0);
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener onVideoEventListener = this.mOnVideoEventListener;
            if (onVideoEventListener != null) {
                onVideoEventListener.onVideoEvent(this.mViewTag, 0);
            }
            this.mTargetState = 3;
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (isInPlaybackState()) {
            int i = this.mDuration;
            if (i > 0) {
                return i;
            }
            int duration = this.mMediaPlayer.getDuration();
            this.mDuration = duration;
            return duration;
        }
        this.mDuration = -1;
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (isInPlaybackState()) {
            return this.mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (isInPlaybackState()) {
            this.mMediaPlayer.seekTo(i);
            this.mSeekWhenPrepared = 0;
        } else {
            this.mSeekWhenPrepared = i;
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return isInPlaybackState() && this.mMediaPlayer.isPlaying();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.mMediaPlayer != null) {
            return this.mCurrentBufferPercentage;
        }
        return 0;
    }

    public boolean isInPlaybackState() {
        int i;
        return (this.mMediaPlayer == null || (i = this.mCurrentState) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return this.mMediaPlayer.getAudioSessionId();
    }
}
