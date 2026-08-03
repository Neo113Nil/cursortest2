package com.inmobi.media;

/* loaded from: classes5.dex */
public final class V8 extends com.inmobi.media.Lo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f5010a;

    public V8(android.widget.RelativeLayout.LayoutParams layoutParams) {
        this.f5010a = layoutParams;
    }

    @Override // com.inmobi.media.Lo
    public final void a(com.inmobi.media.Lf orientation, com.inmobi.media.No finalInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        com.inmobi.media.J3.a(finalInsets, this.f5010a, orientation);
    }
}
