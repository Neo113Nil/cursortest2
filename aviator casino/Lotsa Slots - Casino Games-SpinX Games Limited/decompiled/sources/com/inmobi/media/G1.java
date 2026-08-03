package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G1 extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f4716a;
    public int b;
    public int c;
    public int d;
    public int e;
    public com.inmobi.media.If f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i == this.b && i2 == this.c && i5 == this.d && i6 == this.e) {
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i5;
        this.e = i6;
        com.inmobi.media.If r2 = this.f;
        if (r2 != null) {
            com.inmobi.media.R7 r7 = ((com.inmobi.media.F7) r2).f4699a;
            com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition = new com.inmobi.media.videoPlayer.model.VideoViewPosition();
            videoViewPosition.setX(com.inmobi.media.J3.a(i));
            videoViewPosition.setY(com.inmobi.media.J3.a(i2));
            videoViewPosition.setWidth(com.inmobi.media.J3.a(i5));
            videoViewPosition.setHeight(com.inmobi.media.J3.a(i6));
            r7.a(new com.inmobi.media.C2638o8(videoViewPosition));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        float f = this.f4716a;
        if (f > 0.0f) {
            float f2 = size;
            float f3 = size2;
            if (f2 / f3 > f) {
                size = (int) (f3 * f);
            } else {
                size2 = (int) (f2 / f);
            }
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setOnPositionChangeListener(com.inmobi.media.If r1) {
        this.f = r1;
    }
}
