package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f4064a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] b;
    public int c;

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length <= 0) {
            throw new java.lang.IllegalStateException();
        }
        this.b = oVarArr;
        this.f4064a = oVarArr.length;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.b;
            if (i >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.player.exoplayer2.source.y.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.y) obj;
        return this.f4064a == yVar.f4064a && java.util.Arrays.equals(this.b, yVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }
}
