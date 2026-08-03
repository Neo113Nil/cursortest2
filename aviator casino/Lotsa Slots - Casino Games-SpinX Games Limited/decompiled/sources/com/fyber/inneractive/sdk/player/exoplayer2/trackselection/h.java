package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4071a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] b;
    public int c;

    public h(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b... bVarArr) {
        this.b = bVarArr;
        this.f4071a = bVarArr.length;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.b, ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h) obj).b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }
}
