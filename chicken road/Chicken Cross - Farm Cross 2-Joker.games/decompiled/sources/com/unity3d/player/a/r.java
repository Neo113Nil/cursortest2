package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* loaded from: classes7.dex */
public final class r extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f11774a;
    public final com.unity3d.player.P b;

    public r(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.f11774a = unityPlayerForActivityOrService;
        com.unity3d.player.P p = new com.unity3d.player.P(unityPlayerForActivityOrService);
        this.b = p;
        addView(p);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f11774a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f11774a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.f11774a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f11774a.injectEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4877f c4877f = this.b.f11721a;
        if (c4877f == null || c4877f.f11763a <= 0.0f) {
            return this.f11774a.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C4877f c4877f = this.b.f11721a;
        if (c4877f == null || c4877f.f11763a <= 0.0f) {
            return this.f11774a.injectEvent(motionEvent);
        }
        return false;
    }
}
