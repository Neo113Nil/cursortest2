package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class j implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.TreeSet f4082a = new java.util.TreeSet(this);
    public long b;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar, long j) {
        while (this.b + j > 10485760) {
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) this.f4082a.first();
                synchronized (lVar) {
                    lVar.a(gVar, true);
                }
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) obj;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) obj2;
        long j = gVar.f;
        long j2 = gVar2.f;
        if (j - j2 == 0) {
            if (!gVar.f4079a.equals(gVar2.f4079a)) {
                return gVar.f4079a.compareTo(gVar2.f4079a);
            }
            long j3 = gVar.b - gVar2.b;
            if (j3 == 0) {
                return 0;
            }
            return j3 < 0 ? -1 : 1;
        }
        if (j < j2) {
        }
    }
}
