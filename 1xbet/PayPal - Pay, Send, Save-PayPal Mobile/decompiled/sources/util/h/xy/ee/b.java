package util.h.xy.ee;

/* loaded from: classes5.dex */
public final class b implements java.io.Serializable {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static final long serialVersionUID = 20170722001L;
    private transient util.h.xy.ed.ra getHighResolutionOutputSizeshNQ4ISI;
    private transient util.h.xy.ed.mb getHighSpeedVideoSizes;

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 111) % 128;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m26531());
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 9) << 1) - (i ^ 9)) % 128;
        objectInputStream.defaultReadObject();
        getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ed.mb.m26510(objectInputStream.readObject()));
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 71) + ((i2 & 71) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26531() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 63) % 128;
        byte[] mo25969 = this.getHighSpeedVideoSizes.mo25969();
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return mo25969;
        }
        throw null;
    }

    public final int hashCode() {
        int i = getHighSpeedVideoFpsRanges + 35;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        if (i % 2 == 0) {
            return hashCode;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 23) << 1) - (i ^ 23)) % 128;
        if (obj == this) {
            getHighSpeedVideoFpsRangesFor = ((i & 27) + (i | 27)) % 128;
            getHighSpeedVideoFpsRangesFor = (((i | 35) << 1) - (i ^ 35)) % 128;
            return true;
        }
        if (obj instanceof util.h.xy.ee.b) {
            boolean equals = this.getHighSpeedVideoSizes.equals(((util.h.xy.ee.b) obj).getHighSpeedVideoSizes);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 3) % 128;
            return equals;
        }
        int i2 = i + 41;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        return i2 % 2 != 0;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ed.mb mbVar) {
        int i = getHighSpeedVideoFpsRangesFor + 93;
        getHighSpeedVideoFpsRanges = i % 128;
        this.getHighSpeedVideoSizes = mbVar;
        this.getHighResolutionOutputSizeshNQ4ISI = mbVar.m26511().m26503();
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 25) + ((i2 & 25) << 1)) % 128;
    }

    public b(util.h.xy.ed.mb mbVar) {
        getHighResolutionOutputSizeshNQ4ISI(mbVar);
    }
}
