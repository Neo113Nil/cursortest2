package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxVideoHelper {
    static final int KeyEventBack = 1000;
    private static final int VideoTaskCreate = 0;
    private static final int VideoTaskFullScreen = 12;
    private static final int VideoTaskKeepRatio = 11;
    private static final int VideoTaskPause = 5;
    private static final int VideoTaskRemove = 1;
    private static final int VideoTaskRestart = 10;
    private static final int VideoTaskResume = 6;
    private static final int VideoTaskSeek = 8;
    private static final int VideoTaskSetRect = 3;
    private static final int VideoTaskSetSource = 2;
    private static final int VideoTaskSetVisible = 9;
    private static final int VideoTaskStart = 4;
    private static final int VideoTaskStop = 7;
    static org.cocos2dx.lib.Cocos2dxVideoHelper.VideoHandler mVideoHandler = null;
    public static boolean tryFixAnr = true;
    private static int videoTag;
    private org.cocos2dx.lib.Cocos2dxActivity mActivity;
    private android.widget.FrameLayout mLayout;
    private android.util.SparseArray<org.cocos2dx.lib.Cocos2dxVideoView> sVideoViews;
    org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener videoEventListener = new org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener() { // from class: org.cocos2dx.lib.Cocos2dxVideoHelper.1
        @Override // org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener
        public void onVideoEvent(int i, int i2) {
            org.cocos2dx.lib.Cocos2dxVideoHelper.this.mActivity.runOnGLThread(org.cocos2dx.lib.Cocos2dxVideoHelper.this.new VideoEventRunnable(i, i2));
        }
    };

    public static native void nativeExecuteVideoCallback(int i, int i2);

    Cocos2dxVideoHelper(org.cocos2dx.lib.Cocos2dxActivity cocos2dxActivity, android.widget.FrameLayout frameLayout) {
        this.mLayout = null;
        this.mActivity = null;
        this.sVideoViews = null;
        this.mActivity = cocos2dxActivity;
        this.mLayout = frameLayout;
        mVideoHandler = new org.cocos2dx.lib.Cocos2dxVideoHelper.VideoHandler(this);
        this.sVideoViews = new android.util.SparseArray<>();
    }

    static class VideoHandler extends android.os.Handler {
        java.lang.ref.WeakReference<org.cocos2dx.lib.Cocos2dxVideoHelper> mReference;

        VideoHandler(org.cocos2dx.lib.Cocos2dxVideoHelper cocos2dxVideoHelper) {
            this.mReference = new java.lang.ref.WeakReference<>(cocos2dxVideoHelper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i != 1000) {
                switch (i) {
                    case 0:
                        this.mReference.get()._createVideoView(message.arg1);
                        break;
                    case 1:
                        this.mReference.get()._removeVideoView(message.arg1);
                        break;
                    case 2:
                        this.mReference.get()._setVideoURL(message.arg1, message.arg2, (java.lang.String) message.obj);
                        break;
                    case 3:
                        org.cocos2dx.lib.Cocos2dxVideoHelper cocos2dxVideoHelper = this.mReference.get();
                        android.graphics.Rect rect = (android.graphics.Rect) message.obj;
                        cocos2dxVideoHelper._setVideoRect(message.arg1, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 4:
                        this.mReference.get()._startVideo(message.arg1);
                        break;
                    case 5:
                        this.mReference.get()._pauseVideo(message.arg1);
                        break;
                    case 6:
                        this.mReference.get()._resumeVideo(message.arg1);
                        break;
                    case 7:
                        this.mReference.get()._stopVideo(message.arg1);
                        break;
                    case 8:
                        this.mReference.get()._seekVideoTo(message.arg1, message.arg2);
                        break;
                    case 9:
                        org.cocos2dx.lib.Cocos2dxVideoHelper cocos2dxVideoHelper2 = this.mReference.get();
                        if (message.arg2 == 1) {
                            cocos2dxVideoHelper2._setVideoVisible(message.arg1, true);
                            break;
                        } else {
                            cocos2dxVideoHelper2._setVideoVisible(message.arg1, false);
                            break;
                        }
                    case 10:
                        this.mReference.get()._restartVideo(message.arg1);
                        break;
                    case 11:
                        org.cocos2dx.lib.Cocos2dxVideoHelper cocos2dxVideoHelper3 = this.mReference.get();
                        if (message.arg2 == 1) {
                            cocos2dxVideoHelper3._setVideoKeepRatio(message.arg1, true);
                            break;
                        } else {
                            cocos2dxVideoHelper3._setVideoKeepRatio(message.arg1, false);
                            break;
                        }
                    case 12:
                        org.cocos2dx.lib.Cocos2dxVideoHelper cocos2dxVideoHelper4 = this.mReference.get();
                        android.graphics.Rect rect2 = (android.graphics.Rect) message.obj;
                        if (message.arg2 == 1) {
                            cocos2dxVideoHelper4._setFullScreenEnabled(message.arg1, true, rect2.right, rect2.bottom);
                            break;
                        } else {
                            cocos2dxVideoHelper4._setFullScreenEnabled(message.arg1, false, rect2.right, rect2.bottom);
                            break;
                        }
                }
            } else {
                this.mReference.get().onBackKeyEvent();
            }
            super.handleMessage(message);
        }
    }

    private class VideoEventRunnable implements java.lang.Runnable {
        private int mVideoEvent;
        private int mVideoTag;

        public VideoEventRunnable(int i, int i2) {
            this.mVideoTag = i;
            this.mVideoEvent = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.cocos2dx.lib.Cocos2dxVideoHelper.nativeExecuteVideoCallback(this.mVideoTag, this.mVideoEvent);
        }
    }

    public static int createVideoWidget() {
        android.os.Message message = new android.os.Message();
        message.what = 0;
        message.arg1 = videoTag;
        mVideoHandler.sendMessage(message);
        int i = videoTag;
        videoTag = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _createVideoView(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = new org.cocos2dx.lib.Cocos2dxVideoView(this.mActivity, i);
        this.sVideoViews.put(i, cocos2dxVideoView);
        this.mLayout.addView(cocos2dxVideoView, new android.widget.FrameLayout.LayoutParams(-2, -2));
        cocos2dxVideoView.setZOrderOnTop(true);
        cocos2dxVideoView.setOnCompletionListener(this.videoEventListener);
    }

    public static void removeVideoWidget(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 1;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _removeVideoView(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.stopPlayback();
            this.sVideoViews.remove(i);
            this.mLayout.removeView(cocos2dxVideoView);
        }
    }

    public static void setVideoUrl(int i, int i2, java.lang.String str) {
        android.os.Message message = new android.os.Message();
        message.what = 2;
        message.arg1 = i;
        message.arg2 = i2;
        message.obj = str;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _setVideoURL(int i, int i2, java.lang.String str) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            if (i2 == 0) {
                cocos2dxVideoView.setVideoFileName(str);
            } else {
                if (i2 != 1) {
                    return;
                }
                cocos2dxVideoView.setVideoURL(str);
            }
        }
    }

    public static void setVideoRect(int i, int i2, int i3, int i4, int i5) {
        android.os.Message message = new android.os.Message();
        message.what = 3;
        message.arg1 = i;
        message.obj = new android.graphics.Rect(i2, i3, i4, i5);
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _setVideoRect(int i, int i2, int i3, int i4, int i5) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setVideoRect(i2, i3, i4, i5);
        }
    }

    public static void setFullScreenEnabled(int i, boolean z, int i2, int i3) {
        android.os.Message message = new android.os.Message();
        message.what = 12;
        message.arg1 = i;
        if (z) {
            message.arg2 = 1;
        } else {
            message.arg2 = 0;
        }
        message.obj = new android.graphics.Rect(0, 0, i2, i3);
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _setFullScreenEnabled(int i, boolean z, int i2, int i3) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setFullScreenEnabled(z, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBackKeyEvent() {
        int size = this.sVideoViews.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.sVideoViews.keyAt(i);
            org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(keyAt);
            if (cocos2dxVideoView != null) {
                cocos2dxVideoView.setFullScreenEnabled(false, 0, 0);
                this.mActivity.runOnGLThread(new org.cocos2dx.lib.Cocos2dxVideoHelper.VideoEventRunnable(keyAt, 1000));
            }
        }
    }

    public static void startVideo(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 4;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _startVideo(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.start();
        }
    }

    private static void setVolume(float f) {
        org.cocos2dx.lib.Cocos2dxVideoView.setVolume(f);
    }

    public static void pauseVideo(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 5;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _pauseVideo(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.pause();
        }
    }

    public static void resumeVideo(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 6;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _resumeVideo(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.resume();
        }
    }

    public static void stopVideo(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 7;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _stopVideo(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.stop();
        }
    }

    public static void restartVideo(int i) {
        android.os.Message message = new android.os.Message();
        message.what = 10;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _restartVideo(int i) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.restart();
        }
    }

    public static void seekVideoTo(int i, int i2) {
        android.os.Message message = new android.os.Message();
        message.what = 8;
        message.arg1 = i;
        message.arg2 = i2;
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _seekVideoTo(int i, int i2) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.seekTo(i2);
        }
    }

    public static void setVideoVisible(int i, boolean z) {
        android.os.Message message = new android.os.Message();
        message.what = 9;
        message.arg1 = i;
        if (z) {
            message.arg2 = 1;
        } else {
            message.arg2 = 0;
        }
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _setVideoVisible(int i, boolean z) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            if (z) {
                cocos2dxVideoView.fixSize();
                cocos2dxVideoView.setVisibility(0);
            } else {
                cocos2dxVideoView.setVisibility(4);
            }
        }
    }

    public static void setVideoKeepRatioEnabled(int i, boolean z) {
        android.os.Message message = new android.os.Message();
        message.what = 11;
        message.arg1 = i;
        if (z) {
            message.arg2 = 1;
        } else {
            message.arg2 = 0;
        }
        mVideoHandler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _setVideoKeepRatio(int i, boolean z) {
        org.cocos2dx.lib.Cocos2dxVideoView cocos2dxVideoView = this.sVideoViews.get(i);
        if (cocos2dxVideoView != null) {
            cocos2dxVideoView.setKeepRatio(z);
        }
    }

    public static void setTryFixAnr(boolean z) {
        tryFixAnr = z;
    }
}
