package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4005a;
    public final int b;
    public final int c;
    public int d;
    public java.lang.String e;

    public e0(int i, int i2, int i3) {
        java.lang.String str;
        if (i != Integer.MIN_VALUE) {
            str = i + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
        } else {
            str = "";
        }
        this.f4005a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.f4005a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
