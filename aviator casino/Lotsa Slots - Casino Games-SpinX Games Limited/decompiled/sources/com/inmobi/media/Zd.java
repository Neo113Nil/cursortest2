package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Zd implements com.inmobi.media.Zj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2275ae f5084a;

    public Zd(com.inmobi.media.C2275ae c2275ae) {
        this.f5084a = c2275ae;
    }

    @Override // com.inmobi.media.Zj
    public final void a() {
        com.inmobi.media.C2275ae c2275ae = this.f5084a;
        com.inmobi.media.Bg bg = c2275ae.e;
        if (bg == com.inmobi.media.Bg.e || bg == com.inmobi.media.Bg.c) {
            android.content.Context context = c2275ae.g.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (com.inmobi.media.AbstractC2494in.a(context, c2275ae.b.f5247a)) {
                com.inmobi.media.C2486ie c2486ie = c2275ae.i;
                com.inmobi.media.T4.a(c2486ie.b, new com.inmobi.media.C2434ge(c2486ie, null));
                c2275ae.j.b();
                android.media.MediaPlayer mediaPlayer = c2275ae.h;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                try {
                    mediaPlayer.start();
                } catch (java.lang.IllegalStateException unused) {
                }
                com.inmobi.media.T4.a(c2275ae.f, c2275ae.f5102a, new com.inmobi.media.C2916yn(c2275ae.h.getCurrentPosition()));
                c2275ae.e = com.inmobi.media.Bg.d;
            }
        }
    }

    @Override // com.inmobi.media.Zj
    public final void b() {
        com.inmobi.media.C2275ae c2275ae = this.f5084a;
        if (c2275ae.e != com.inmobi.media.Bg.d) {
            return;
        }
        android.media.MediaPlayer mediaPlayer = c2275ae.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (java.lang.IllegalStateException unused) {
        }
        c2275ae.j.c();
        com.inmobi.media.C2486ie c2486ie = c2275ae.i;
        com.inmobi.media.T4.a(c2486ie.b, new com.inmobi.media.C2407fe(c2486ie, null));
        com.inmobi.media.T4.a(c2275ae.f, c2275ae.f5102a, new com.inmobi.media.C2417fn(c2275ae.h.getCurrentPosition()));
        c2275ae.e = com.inmobi.media.Bg.e;
    }

    @Override // com.inmobi.media.Zj
    public final void c() {
        com.inmobi.media.C2275ae c2275ae = this.f5084a;
        if (c2275ae.e != com.inmobi.media.Bg.f) {
            return;
        }
        android.media.MediaPlayer mediaPlayer = c2275ae.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
