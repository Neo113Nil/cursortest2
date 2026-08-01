package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import com.unity3d.player.a.C4877f;

/* loaded from: classes7.dex */
public final class P extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C4877f f11721a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.D c;

    public P(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.D(context);
        this.b = unityPlayerForActivityOrService;
        C4877f c4877f = new C4877f(unityPlayerForActivityOrService);
        this.f11721a = c4877f;
        c4877f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c4877f);
        c4877f.getHolder().addCallback(new O(this));
        c4877f.setFocusable(true);
        c4877f.setFocusableInTouchMode(true);
        c4877f.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(c4877f, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
