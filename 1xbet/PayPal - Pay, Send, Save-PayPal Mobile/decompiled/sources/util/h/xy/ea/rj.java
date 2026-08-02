package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class rj implements util.h.xy.fb.ra<util.h.xy.ea.mi> {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private final java.util.List getHighSpeedVideoFpsRanges;
    private final java.util.Map getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    @Override // java.lang.Iterable
    public final java.util.Iterator<util.h.xy.ea.mi> iterator() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 101) + ((i & 101) << 1)) % 128;
        java.util.Iterator<util.h.xy.ea.mi> it = m26488().iterator();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 89;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return it;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.util.Collection<util.h.xy.ea.mi> m26488() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
        int i = getHighSpeedVideoSizes + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    public rj(java.util.Collection<util.h.xy.ea.mi> collection) {
        for (util.h.xy.ea.mi miVar : collection) {
            util.h.xy.ea.ri m26485 = miVar.m26485();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.getHighSpeedVideoFpsRangesFor.get(m26485);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(1);
                this.getHighSpeedVideoFpsRangesFor.put(m26485, arrayList);
            }
            arrayList.add(miVar);
        }
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(collection);
    }
}
