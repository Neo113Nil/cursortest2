package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G9 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f6578a;

    public G9(InMobiBanner inMobiBanner) {
        this.f6578a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Z9 z9;
        boolean c;
        boolean c2;
        try {
            c = this.f6578a.c();
            if (!c) {
                InMobiBanner.access$captureStandardBannerSize(this.f6578a, AbstractC3727g4.b(r0.getMeasuredWidth() / AbstractC3841k6.b()), AbstractC3727g4.b(this.f6578a.getMeasuredHeight() / AbstractC3841k6.b()));
            }
            c2 = this.f6578a.c();
            if (c2) {
                this.f6578a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e) {
            A2 mAdManager = this.f6578a.getMAdManager();
            if (mAdManager == null || (z9 = mAdManager.f) == null) {
                return;
            }
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            z9.a(access$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e);
        }
    }
}
