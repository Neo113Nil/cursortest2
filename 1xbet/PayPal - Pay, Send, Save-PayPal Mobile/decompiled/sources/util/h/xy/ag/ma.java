package util.h.xy.ag;

/* loaded from: classes5.dex */
public class ma extends java.util.Observable {
    private static int Camera2StreamConfigurationMap = 112;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.ag.ma.InterfaceC0255ma getHighSpeedVideoFpsRanges;

    /* renamed from: util.h.xy.ag.ma$ma, reason: collision with other inner class name */
    public interface InterfaceC0255ma {
        /* renamed from: ˊ, reason: contains not printable characters */
        void mo24564(util.h.xy.ag.ma maVar);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m24563(util.h.xy.ag.ma.InterfaceC0255ma interfaceC0255ma) {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 103;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = interfaceC0255ma;
            getHighSpeedVideoSizes = (((i | 105) << 1) - (i ^ 105)) % 128;
        } else {
            this.getHighSpeedVideoFpsRanges = interfaceC0255ma;
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m24561() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = null;
            int i3 = (i ^ 65) + ((i & 65) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges = null;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m24562() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 85) + (i | 85);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ag.ma.InterfaceC0255ma interfaceC0255ma = this.getHighSpeedVideoFpsRanges;
            if (interfaceC0255ma != null) {
                int i3 = i + 53;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 == 0) {
                    interfaceC0255ma.mo24564(this);
                } else {
                    interfaceC0255ma.mo24564(this);
                    throw new java.lang.ArithmeticException();
                }
            }
            setChanged();
            notifyObservers();
            int i4 = Camera2StreamConfigurationMap;
            int i5 = (i4 ^ 95) + ((i4 & 95) << 1);
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }
}
