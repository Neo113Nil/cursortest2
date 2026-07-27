package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3600bi;
import com.inmobi.media.C3818jb;
import com.inmobi.media.C3846kb;
import com.inmobi.media.Kc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final C3818jb f6442a;
    public final /* synthetic */ InMobiInterstitial b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.b = inMobiInterstitial;
        this.f6442a = new C3818jb(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.b.getMAdManager$media_release().i();
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            Kc.a((byte) 1, access$getTAG$cp, e.getMessage());
            this.b.getMPubListener$media_release().a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        C3600bi c3600bi;
        C3600bi c3600bi2;
        Context context;
        this.b.b = true;
        c3600bi = this.b.d;
        c3600bi.getClass();
        Intrinsics.checkNotNullParameter("Preload", "<set-?>");
        c3600bi.h = "Preload";
        C3846kb mAdManager$media_release = this.b.getMAdManager$media_release();
        c3600bi2 = this.b.d;
        context = this.b.f6436a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(c3600bi2, context, true, "intHtml");
        this.b.getMAdManager$media_release().b(this.f6442a);
    }
}
