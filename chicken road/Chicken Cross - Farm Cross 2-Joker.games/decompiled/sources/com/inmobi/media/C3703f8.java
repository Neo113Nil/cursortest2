package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;

/* renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3703f8 implements Cg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7102a;

    public C3703f8(C4043r8 c4043r8) {
        this.f7102a = c4043r8;
    }

    @Override // com.inmobi.media.Cg
    public final void a(int i, int i2, int i3, int i4) {
        C4043r8 c4043r8 = this.f7102a;
        c4043r8.u = new Mo(i, i2, i3, i4);
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        videoViewPosition.setX(AbstractC3727g4.a(c4043r8.u.f6726a));
        videoViewPosition.setY(AbstractC3727g4.a(c4043r8.u.b));
        videoViewPosition.setWidth(AbstractC3727g4.a(c4043r8.u.c));
        videoViewPosition.setHeight(AbstractC3727g4.a(c4043r8.u.d));
        c4043r8.a(new D8(videoViewPosition));
        c4043r8.a();
    }
}
