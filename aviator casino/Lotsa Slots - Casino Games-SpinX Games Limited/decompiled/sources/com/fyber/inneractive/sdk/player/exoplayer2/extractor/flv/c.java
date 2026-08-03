package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.e {
    public long b;

    public c() {
        super(null);
        this.b = -9223372036854775807L;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j) {
        if (nVar.j() != 2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r();
        }
        int o = nVar.o();
        int i = nVar.b;
        nVar.e(i + o);
        if ("onMetaData".equals(new java.lang.String(nVar.f4112a, i, o)) && nVar.j() == 8) {
            java.util.HashMap a2 = a(nVar);
            if (a2.containsKey(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION)) {
                double doubleValue = ((java.lang.Double) a2.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    public static java.io.Serializable a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i == 8) {
            return a(nVar);
        }
        if (i == 10) {
            int m = nVar.m();
            java.util.ArrayList arrayList = new java.util.ArrayList(m);
            for (int i2 = 0; i2 < m; i2++) {
                arrayList.add(a(nVar.j(), nVar));
            }
            return arrayList;
        }
        if (i == 11) {
            java.util.Date date = new java.util.Date((long) java.lang.Double.longBitsToDouble(nVar.g()));
            nVar.e(nVar.b + 2);
            return date;
        }
        if (i == 0) {
            return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(nVar.g()));
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(nVar.j() == 1);
        }
        if (i == 2) {
            int o = nVar.o();
            int i3 = nVar.b;
            nVar.e(i3 + o);
            return new java.lang.String(nVar.f4112a, i3, o);
        }
        if (i != 3) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            int o2 = nVar.o();
            int i4 = nVar.b;
            nVar.e(i4 + o2);
            java.lang.String str = new java.lang.String(nVar.f4112a, i4, o2);
            int j = nVar.j();
            if (j == 9) {
                return hashMap;
            }
            hashMap.put(str, a(j, nVar));
        }
    }

    public static java.util.HashMap a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int m = nVar.m();
        java.util.HashMap hashMap = new java.util.HashMap(m);
        for (int i = 0; i < m; i++) {
            int o = nVar.o();
            int i2 = nVar.b;
            nVar.e(i2 + o);
            hashMap.put(new java.lang.String(nVar.f4112a, i2, o), a(nVar.j(), nVar));
        }
        return hashMap;
    }
}
