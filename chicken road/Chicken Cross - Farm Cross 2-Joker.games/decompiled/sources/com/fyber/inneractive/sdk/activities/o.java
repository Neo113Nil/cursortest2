package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes4.dex */
public final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f5181a;

    public o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f5181a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5181a.finish();
    }
}
