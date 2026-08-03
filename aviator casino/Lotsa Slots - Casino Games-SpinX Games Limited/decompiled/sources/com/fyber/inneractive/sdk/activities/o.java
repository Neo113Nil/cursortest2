package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore f3532a;

    public o(com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f3532a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3532a.finish();
    }
}
