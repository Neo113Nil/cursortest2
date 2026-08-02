package util.h.xy.bv;

/* loaded from: classes5.dex */
public class c extends util.h.xy.bv.rb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private java.lang.String getHighSpeedVideoFpsRanges;

    public c(int i) {
        super(i);
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25683(java.lang.String str) {
        int i = Camera2StreamConfigurationMap + 35;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = str;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public java.lang.String m25682() {
        int i = getHighSpeedVideoFpsRangesFor + 37;
        Camera2StreamConfigurationMap = i % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }
}
