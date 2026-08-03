package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class z {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4065a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.y[] b;
    public int c;

    static {
        new com.fyber.inneractive.sdk.player.exoplayer2.source.z(new com.fyber.inneractive.sdk.player.exoplayer2.source.y[0]);
    }

    public z(com.fyber.inneractive.sdk.player.exoplayer2.source.y... yVarArr) {
        this.b = yVarArr;
        this.f4065a = yVarArr.length;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.source.z.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.z) obj;
        return this.f4065a == zVar.f4065a && java.util.Arrays.equals(this.b, zVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
