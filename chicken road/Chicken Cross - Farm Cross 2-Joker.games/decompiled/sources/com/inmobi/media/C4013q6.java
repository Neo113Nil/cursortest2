package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4013q6 extends Iq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f7319a;

    public C4013q6(RelativeLayout.LayoutParams layoutParams) {
        this.f7319a = layoutParams;
    }

    @Override // com.inmobi.media.Iq
    public final void a(Hg orientation, Kq finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        AbstractC3727g4.a(finalInsets, this.f7319a, orientation);
    }
}
