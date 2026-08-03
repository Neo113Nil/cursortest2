package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.ads.InMobiAudio f5061a;

    public Y8(com.inmobi.ads.InMobiAudio inMobiAudio) {
        this.f5061a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.f5061a.f = com.inmobi.media.J3.b(r0.getMeasuredWidth() / com.inmobi.media.N5.b());
            this.f5061a.g = com.inmobi.media.J3.b(r0.getMeasuredHeight() / com.inmobi.media.N5.b());
            if (com.inmobi.ads.InMobiAudio.access$hasValidSize(this.f5061a)) {
                this.f5061a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.Sb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e.getMessage();
        }
    }
}
