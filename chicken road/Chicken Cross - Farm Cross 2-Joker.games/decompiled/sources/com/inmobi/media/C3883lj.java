package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3883lj extends C3798ij {
    public final /* synthetic */ Ej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3883lj(Ej ej) {
        super(ej);
        this.b = ej;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        Ej ej = this.b;
        if (ej.T == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = ej.U;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        Ej ej2 = this.b;
        ej2.U = null;
        View view = ej2.T;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.b.T;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.b.T);
            }
            this.b.T = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.b.u.get() != null) {
            Ej ej = this.b;
            ej.T = view;
            ej.U = callback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.lj$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return C3883lj.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.b.u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.b.T;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.b.T, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.b.T;
            if (view3 != null) {
                view3.requestFocus();
            }
            final Ej ej2 = this.b;
            View view4 = ej2.T;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: com.inmobi.media.lj$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i, KeyEvent keyEvent) {
                    return C3883lj.a(Ej.this, this, view5, i, keyEvent);
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

    public static final boolean a(Ej ej, C3883lj c3883lj, View view, int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        Y9 y9 = ej.i;
        if (y9 != null) {
            String str = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((Z9) y9).a(str, "Back pressed when HTML5 video is playing.");
        }
        c3883lj.a();
        return true;
    }
}
