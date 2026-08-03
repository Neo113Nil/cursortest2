package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxGLSurfaceView extends android.opengl.GLSurfaceView {
    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private static final java.lang.String TAG = "Cocos2dxGLSurfaceView";
    private static org.cocos2dx.lib.Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private static org.cocos2dx.lib.Cocos2dxTextInputWraper sCocos2dxTextInputWraper;
    private static android.os.Handler sHandler;
    private org.cocos2dx.lib.Cocos2dxEditText mCocos2dxEditText;
    private org.cocos2dx.lib.Cocos2dxRenderer mCocos2dxRenderer;

    public Cocos2dxGLSurfaceView(android.content.Context context) {
        super(context);
        initView();
    }

    public Cocos2dxGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    protected void initView() {
        setEGLContextClientVersion(2);
        setFocusableInTouchMode(true);
        mCocos2dxGLSurfaceView = this;
        sCocos2dxTextInputWraper = new org.cocos2dx.lib.Cocos2dxTextInputWraper(this);
        sHandler = new android.os.Handler() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                int i = message.what;
                if (i != 2) {
                    if (i == 3 && org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText != null) {
                        org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.removeTextChangedListener(org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                        ((android.view.inputmethod.InputMethodManager) org.cocos2dx.lib.Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.getWindowToken(), 0);
                        org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.requestFocus();
                        org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.hideSystemUI();
                        android.util.Log.d("GLSurfaceView", "HideSoftInput");
                        return;
                    }
                    return;
                }
                if (org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText == null || !org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.requestFocus()) {
                    return;
                }
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.removeTextChangedListener(org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.setText("");
                java.lang.String str = (java.lang.String) message.obj;
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.append(str);
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper.setOriginText(str);
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText.addTextChangedListener(org.cocos2dx.lib.Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                ((android.view.inputmethod.InputMethodManager) org.cocos2dx.lib.Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).showSoftInput(org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxEditText, 0);
                android.util.Log.d("GLSurfaceView", "showSoftInput");
            }
        };
    }

    public static org.cocos2dx.lib.Cocos2dxGLSurfaceView getInstance() {
        return mCocos2dxGLSurfaceView;
    }

    public static void queueAccelerometer(final float f, final float f2, final float f3, final long j) {
        mCocos2dxGLSurfaceView.queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxAccelerometer.onSensorChanged(f, f2, f3, j);
            }
        });
    }

    public void setCocos2dxRenderer(org.cocos2dx.lib.Cocos2dxRenderer cocos2dxRenderer) {
        this.mCocos2dxRenderer = cocos2dxRenderer;
        setRenderer(cocos2dxRenderer);
    }

    private java.lang.String getContentText() {
        return this.mCocos2dxRenderer.getContentText();
    }

    public org.cocos2dx.lib.Cocos2dxEditText getCocos2dxEditText() {
        return this.mCocos2dxEditText;
    }

    public void setCocos2dxEditText(org.cocos2dx.lib.Cocos2dxEditText cocos2dxEditText) {
        org.cocos2dx.lib.Cocos2dxTextInputWraper cocos2dxTextInputWraper;
        this.mCocos2dxEditText = cocos2dxEditText;
        if (cocos2dxEditText == null || (cocos2dxTextInputWraper = sCocos2dxTextInputWraper) == null) {
            return;
        }
        cocos2dxEditText.setOnEditorActionListener(cocos2dxTextInputWraper);
        this.mCocos2dxEditText.setCocos2dxGLSurfaceView(this);
        requestFocus();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        this.mCocos2dxRenderer.handleOnMainThreadResume();
        super.onResume();
        setRenderMode(1);
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnResume();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.mCocos2dxRenderer.handleOnMainThreadPause();
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.4
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnPause();
            }
        });
        setRenderMode(0);
    }

    public void onLowMemory() {
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.5
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnLowMemory();
            }
        });
    }

    public void onNavigationBarChanged(final int i, final int i2, final int i3, final int i4) {
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.6
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.onNavigationBarChanged(i, i2, i3, i4);
            }
        });
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        final int[] iArr = new int[pointerCount];
        final float[] fArr = new float[pointerCount];
        final float[] fArr2 = new float[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i);
            fArr2[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            final int pointerId = motionEvent.getPointerId(0);
            final float f = fArr[0];
            final float f2 = fArr2[0];
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.8
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId, f, f2);
                }
            });
        } else if (action == 1) {
            final int pointerId2 = motionEvent.getPointerId(0);
            final float f3 = fArr[0];
            final float f4 = fArr2[0];
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.11
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId2, f3, f4);
                }
            });
        } else if (action == 2) {
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.9
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionMove(iArr, fArr, fArr2);
                }
            });
        } else if (action == 3) {
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.12
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionCancel(iArr, fArr, fArr2);
                }
            });
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            final int pointerId3 = motionEvent.getPointerId(action2);
            final float x = motionEvent.getX(action2);
            final float y = motionEvent.getY(action2);
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.7
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId3, x, y);
                }
            });
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            final int pointerId4 = motionEvent.getPointerId(action3);
            final float x2 = motionEvent.getX(action3);
            final float y2 = motionEvent.getY(action3);
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.10
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId4, x2, y2);
                }
            });
        }
        return true;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (isInEditMode()) {
            return;
        }
        this.mCocos2dxRenderer.setScreenWidthAndHeight(i, i2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            org.cocos2dx.lib.Cocos2dxVideoHelper.mVideoHandler.sendEmptyMessage(1000);
        } else if (i != 62 && i != 66 && i != 82 && i != 85 && i != 111) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
        }
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.13
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyEvent(i, 0);
            }
        });
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(final int i, android.view.KeyEvent keyEvent) {
        if (i == 62) {
            queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.14
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyEvent(i, 1);
                }
            });
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static void openIMEKeyboard() {
        android.os.Message message = new android.os.Message();
        message.what = 2;
        message.obj = mCocos2dxGLSurfaceView.getContentText();
        sHandler.sendMessage(message);
    }

    public static void closeIMEKeyboard() {
        android.os.Message message = new android.os.Message();
        message.what = 3;
        sHandler.sendMessage(message);
    }

    public void insertText(final java.lang.String str) {
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.15
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleInsertText(str);
            }
        });
    }

    public void deleteBackward() {
        queueEvent(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.16
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleDeleteBackward();
            }
        });
    }

    private static void dumpMotionEvent(android.view.MotionEvent motionEvent) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("event ACTION_");
        int action = motionEvent.getAction();
        int i = action & 255;
        sb.append(new java.lang.String[]{"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"}[i]);
        if (i == 5 || i == 6) {
            sb.append("(pid ");
            sb.append(action >> 8);
            sb.append(")");
        }
        sb.append(com.ironsource.X3.j.d);
        int i2 = 0;
        while (i2 < motionEvent.getPointerCount()) {
            sb.append("#");
            sb.append(i2);
            sb.append("(pid ");
            sb.append(motionEvent.getPointerId(i2));
            sb.append(")=");
            sb.append((int) motionEvent.getX(i2));
            sb.append(",");
            sb.append((int) motionEvent.getY(i2));
            i2++;
            if (i2 < motionEvent.getPointerCount()) {
                sb.append(";");
            }
        }
        sb.append(com.ironsource.X3.j.e);
        android.util.Log.d(TAG, sb.toString());
    }

    public void hideSystemUI() {
        setSystemUiVisibility(5894);
    }
}
