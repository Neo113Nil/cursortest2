package util.h.xy.ea;

/* loaded from: classes18.dex */
public class c {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    final java.util.List getHighSpeedVideoSizes = new java.util.ArrayList();

    /* renamed from: י, reason: contains not printable characters */
    protected util.h.xy.ea.ra f1904 = null;

    /* renamed from: ﹳ, reason: contains not printable characters */
    protected util.h.xy.dj.me f1905;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.lang.String f1892 = util.h.xy.du.ra.f1735.m26298();

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final java.lang.String f1893 = util.h.xy.du.ra.f1726.m26298();

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f1901 = util.h.xy.dq.mb.f1479.m26298();

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final java.lang.String f1896 = util.h.xy.dq.mb.f1516.m26298();

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.lang.String f1897 = util.h.xy.dq.mb.f1492.m26298();

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final java.lang.String f1887 = util.h.xy.ds.b.f1534.m26298();

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final java.lang.String f1886 = util.h.xy.ds.b.f1535.m26298();

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final java.lang.String f1899 = util.h.xy.ds.b.f1532.m26298();

    /* renamed from: ι, reason: contains not printable characters */
    public static final java.lang.String f1903 = util.h.xy.dn.mb.f1386.m26298();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final java.lang.String f1885 = util.h.xy.du.ra.f1733.m26298();

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final java.lang.String f1890 = util.h.xy.dq.mb.f1504.m26298();

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final java.lang.String f1888 = util.h.xy.dq.mb.f1465.m26298();

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final java.lang.String f1889 = util.h.xy.dq.mb.f1482.m26298();

    /* renamed from: ˌ, reason: contains not printable characters */
    public static final java.lang.String f1894 = util.h.xy.ds.b.f1536.m26298();

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final java.lang.String f1891 = util.h.xy.ds.b.f1533.m26298();

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final java.lang.String f1898 = util.h.xy.ds.b.f1531.m26298();

    /* renamed from: ـ, reason: contains not printable characters */
    public static final java.lang.String f1900 = util.h.xy.dn.mb.f1382.m26298();

    /* renamed from: ˍ, reason: contains not printable characters */
    public static final java.lang.String f1895 = util.h.xy.eb.c.f2030.m26298();

    /* renamed from: ᐨ, reason: contains not printable characters */
    public static final java.lang.String f1902 = util.h.xy.eb.c.f2016.m26298();

    static {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m26481(util.h.xy.ea.j jVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        this.getHighSpeedVideoSizes.add(jVar);
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected c() {
    }
}
