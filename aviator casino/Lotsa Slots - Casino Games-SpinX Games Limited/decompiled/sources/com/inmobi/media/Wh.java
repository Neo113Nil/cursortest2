package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wh extends com.inmobi.media.Th {
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        super(gestureDetectorOnGestureListenerC2675pi);
        this.b = gestureDetectorOnGestureListenerC2675pi;
    }

    public static final boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.b;
        if (gestureDetectorOnGestureListenerC2675pi.S == null) {
            return;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC2675pi.T;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.b;
        gestureDetectorOnGestureListenerC2675pi2.T = null;
        android.view.View view = gestureDetectorOnGestureListenerC2675pi2.S;
        if ((view != null ? view.getParent() : null) != null) {
            android.view.View view2 = this.b.S;
            android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.b.S);
            }
            this.b.S = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.b.u.get() != null) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.b;
            gestureDetectorOnGestureListenerC2675pi.S = view;
            gestureDetectorOnGestureListenerC2675pi.T = callback;
            if (view != null) {
                view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.Wh$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                        return com.inmobi.media.Wh.a(view2, motionEvent);
                    }
                });
            }
            android.app.Activity activity = (android.app.Activity) this.b.u.get();
            android.widget.FrameLayout frameLayout = activity != null ? (android.widget.FrameLayout) activity.findViewById(android.R.id.content) : null;
            android.view.View view2 = this.b.S;
            if (view2 != null) {
                view2.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.b.S, new android.widget.AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            android.view.View view3 = this.b.S;
            if (view3 != null) {
                view3.requestFocus();
            }
            final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.b;
            android.view.View view4 = gestureDetectorOnGestureListenerC2675pi2.S;
            android.view.View.OnKeyListener onKeyListener = new android.view.View.OnKeyListener() { // from class: com.inmobi.media.Wh$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(android.view.View view5, int i, android.view.KeyEvent keyEvent) {
                    return com.inmobi.media.Wh.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, this, view5, i, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final boolean a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.Wh wh, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "Back pressed when HTML5 video is playing.");
        }
        wh.a();
        return true;
    }
}
