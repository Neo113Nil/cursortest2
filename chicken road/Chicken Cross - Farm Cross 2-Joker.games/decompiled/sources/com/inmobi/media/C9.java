package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* loaded from: classes6.dex */
public final class C9 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f6492a;

    public C9(InMobiAudio inMobiAudio) {
        this.f6492a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.f6492a.f = AbstractC3727g4.b(r0.getMeasuredWidth() / AbstractC3841k6.b());
            this.f6492a.g = AbstractC3727g4.b(r0.getMeasuredHeight() / AbstractC3841k6.b());
            if (InMobiAudio.access$hasValidSize(this.f6492a)) {
                this.f6492a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            String str = "InMobiAudio$1.onGlobalLayout() handler threw unexpected error: " + e.getMessage();
        }
    }
}
