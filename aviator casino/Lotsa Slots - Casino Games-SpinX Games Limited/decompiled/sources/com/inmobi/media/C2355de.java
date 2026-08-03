package com.inmobi.media;

/* renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2355de implements com.inmobi.media.P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2486ie f5160a;

    public C2355de(com.inmobi.media.C2486ie c2486ie) {
        this.f5160a = c2486ie;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f5160a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        com.inmobi.media.C2486ie c2486ie = this.f5160a;
        android.media.MediaPlayer mediaPlayer = c2486ie.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (java.lang.IllegalStateException unused) {
        }
        c2486ie.a(c2486ie.k, c2486ie.j);
        com.inmobi.media.T4.a(c2486ie.e, c2486ie.b, new com.inmobi.media.S1(1.0f, false));
        c2486ie.i = false;
    }
}
