package util.h.xy.ef;

/* loaded from: classes18.dex */
public final class d extends java.security.Permission {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    @Override // java.security.Permission
    public final java.lang.String getActions() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 109) + ((i & 109) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        java.lang.String obj = this.getHighSpeedVideoSizes.toString();
        if (i2 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int hashCode() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 31) << 1) - (i ^ 31)) % 128;
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        return hashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 101) + (i | 101)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (obj instanceof util.h.xy.ef.d) {
            getHighSpeedVideoFpsRangesFor = (i2 + 61) % 128;
            if (this.getHighSpeedVideoSizes.equals(((util.h.xy.ef.d) obj).getHighSpeedVideoSizes)) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = (i3 & 41) + (i3 | 41);
                getHighSpeedVideoFpsRanges = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        return false;
    }

    @Override // java.security.Permission
    public final boolean implies(java.security.Permission permission) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 57) + ((i & 57) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (permission instanceof util.h.xy.ef.d) {
            getHighSpeedVideoFpsRangesFor = (i2 + 67) % 128;
            util.h.xy.ef.d dVar = (util.h.xy.ef.d) permission;
            if (getName().equals(dVar.getName())) {
                int i3 = getHighSpeedVideoFpsRanges;
                int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                return i4 % 2 != 0;
            }
            if (this.getHighSpeedVideoSizes.containsAll(dVar.getHighSpeedVideoSizes)) {
                int i5 = getHighSpeedVideoFpsRanges + 11;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        return false;
    }

    public d(java.lang.String str) {
        super(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.getHighSpeedVideoSizes = hashSet;
        hashSet.add(str);
    }
}
