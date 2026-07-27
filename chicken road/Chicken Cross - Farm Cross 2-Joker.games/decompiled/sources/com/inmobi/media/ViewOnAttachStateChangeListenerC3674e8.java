package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.e8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC3674e8 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7082a;
    public final /* synthetic */ C4043r8 b;

    public ViewOnAttachStateChangeListenerC3674e8(View view, C4043r8 c4043r8) {
        this.f7082a = view;
        this.b = c4043r8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f7082a.removeOnAttachStateChangeListener(this);
        Y9 y9 = this.b.b;
        if (y9 != null) {
            ((Z9) y9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.b.a(W8.f6927a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
