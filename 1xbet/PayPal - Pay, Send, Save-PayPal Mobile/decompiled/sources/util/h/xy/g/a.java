package util.h.xy.g;

/* loaded from: classes5.dex */
public class a {
    private static final java.lang.String Camera2StreamConfigurationMap = "a";
    static int getHighSpeedVideoFpsRangesFor = 93;
    static int getHighSpeedVideoSizes;
    java.util.Map<java.lang.String, util.h.xy.g.ra> getHighResolutionOutputSizeshNQ4ISI;

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 109;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 103) % 128;
        return str;
    }

    static {
        int i = 93 % 2;
    }

    static util.h.xy.g.a.ma getHighSpeedVideoFpsRangesFor() {
        util.h.xy.g.a.ma maVar = new util.h.xy.g.a.ma();
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return maVar;
        }
        throw null;
    }

    a(util.h.xy.g.a.ma maVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableMap(util.h.xy.g.a.ma.getHighSpeedVideoFpsRangesFor(maVar));
    }

    final util.h.xy.g.ra getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i ^ 101) + ((i & 101) << 1)) % 128;
        java.util.Iterator<java.lang.String> it = this.getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
        int i2 = getHighSpeedVideoFpsRangesFor + 81;
        while (true) {
            getHighSpeedVideoSizes = i2 % 128;
            if (!it.hasNext()) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i3 & 3) + (i3 | 3)) % 128;
                return null;
            }
            int i4 = getHighSpeedVideoFpsRangesFor + 51;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.g.ra raVar = this.getHighResolutionOutputSizeshNQ4ISI.get(it.next());
                raVar.m26875();
                if (util.h.xy.g.ra.EnumC0269ra.f2220 == raVar.m26875()) {
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    int i6 = ((i5 | 73) << 1) - (i5 ^ 73);
                    getHighSpeedVideoSizes = i6 % 128;
                    if (i6 % 2 == 0) {
                        return raVar;
                    }
                    throw null;
                }
                i2 = getHighSpeedVideoFpsRangesFor + 117;
            } else {
                util.h.xy.g.ra raVar2 = this.getHighResolutionOutputSizeshNQ4ISI.get(it.next());
                raVar2.m26875();
                util.h.xy.g.ra.EnumC0269ra enumC0269ra = util.h.xy.g.ra.EnumC0269ra.f2220;
                raVar2.m26875();
                throw null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.g.ra m26863(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 105;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(str);
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.g.ra raVar = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    static final class ma {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private java.util.Map<java.lang.String, util.h.xy.g.ra> Camera2StreamConfigurationMap = new java.util.HashMap();

        static /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor(util.h.xy.g.a.ma maVar) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 65) << 1) - (i ^ 65);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            java.util.Map<java.lang.String, util.h.xy.g.ra> map = maVar.Camera2StreamConfigurationMap;
            if (i2 % 2 != 0) {
                return map;
            }
            throw null;
        }

        protected ma() {
        }

        public final util.h.xy.g.a.ma Camera2StreamConfigurationMap(util.h.xy.g.ra raVar) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 45) + (i | 45);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.g.a.Camera2StreamConfigurationMap();
                if (raVar != null) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
                    if (this.Camera2StreamConfigurationMap.containsKey(raVar.m26877())) {
                        util.h.xy.g.a.Camera2StreamConfigurationMap();
                        raVar.m26877();
                        int i3 = getHighSpeedVideoFpsRangesFor;
                        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 33) + (i3 | 33)) % 128;
                    } else {
                        int i4 = getHighResolutionOutputSizeshNQ4ISI + 37;
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 == 0) {
                            util.h.xy.g.a.Camera2StreamConfigurationMap();
                            raVar.m26877();
                            this.Camera2StreamConfigurationMap.put(raVar.m26877(), raVar);
                            return this;
                        }
                        util.h.xy.g.a.Camera2StreamConfigurationMap();
                        raVar.m26877();
                        this.Camera2StreamConfigurationMap.put(raVar.m26877(), raVar);
                        throw null;
                    }
                }
                return this;
            }
            util.h.xy.g.a.Camera2StreamConfigurationMap();
            throw null;
        }

        public final util.h.xy.g.a getHighSpeedVideoFpsRangesFor() {
            util.h.xy.g.a aVar = new util.h.xy.g.a(this);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 65) << 1) - (i ^ 65);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return aVar;
            }
            throw null;
        }
    }
}
