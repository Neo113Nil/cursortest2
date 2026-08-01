package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4939y extends AbstractC4933t {
    public boolean h;
    public Handler i;
    public RunnableC4937w j;

    @Override // com.unity3d.player.AbstractC4933t
    public final boolean c() {
        return false;
    }

    public C4939y(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void d() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new RunnableC4937w(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void b() {
        RunnableC4937w runnableC4937w;
        Handler handler = this.i;
        if (handler != null && (runnableC4937w = this.j) != null) {
            handler.removeCallbacks(runnableC4937w);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC4933t
    public EditText createEditText(AbstractC4933t abstractC4933t) {
        return new C4938x(this.f11809a, abstractC4933t);
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }
}
