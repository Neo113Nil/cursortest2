package util.h.xy.bv;

/* loaded from: classes5.dex */
public class mh extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {64446, 12987, 27010, 41163, 57322, 5848, 19772, 33833, 45860, 60031, 40012, 21886, 3678, 50992, 47152, 28929, 10978, 58299, 54514, 36247, 18062, 16339, 61821, 43632, 25438, 21550, 3343, 50775, 49124, 28871, 10649, 58022, 56203, 36059, 18019, 16194, 61518, 43299, 25094, 23313, 3302, 50638, 49527, 2165, 21314, 39447, 58686, 11275, 30662, 48867, 35277, 53429, 7076, 25261, 44154};
    private static long getHighSpeedVideoFpsRanges = -6778250790286568169L;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputMinFrameDuration = 1;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final java.lang.String getOutputFormats;

    public mh(byte[] bArr, byte[] bArr2) {
        super(util.h.xy.al.ra.f572);
        this.getOutputFormats = util.h.xy.bv.mh.class.getName();
        this.getInputFormats = util.h.xy.ar.b.m25103(bArr);
        if (bArr2 == null || bArr2.length == 0) {
            this.getHighSpeedVideoSizesFor = null;
        } else {
            this.getHighSpeedVideoSizesFor = util.h.xy.ar.b.m25103(bArr2);
        }
    }

    @Override // util.h.xy.bv.mb
    @util.h.xy.a.a
    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        java.util.Map<java.lang.String, java.lang.String> m25762 = util.h.xy.bv.rh.m25762(this, this.getInputFormats, this.getHighSpeedVideoSizesFor, super.mo25690());
        int i = getHighSpeedVideoFpsRangesFor + 37;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return m25762;
        }
        throw null;
    }

    @Override // util.h.xy.bv.mb
    @util.h.xy.a.a
    /* renamed from: ˏ */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.bv.h hVar = new util.h.xy.bv.h(rbVar.m25751());
        rbVar.m25751();
        rbVar.m25742();
        rbVar.m25745();
        hVar.m25744(rbVar.m25745());
        hVar.m25743(rbVar.m25749());
        hVar.m25748(rbVar.m25742());
        hVar.m25746(rbVar.m25750());
        if (rbVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 85) % 128;
            java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
            if (m25747 != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(10 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.KeyEvent.getDeadChar(0, 0), (char) (26588 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr);
                m25747.containsKey(((java.lang.String) objArr[0]).intern());
                int i = getOutputMinFrameDuration + 73;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 2;
                }
            }
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(10 - packedPositionGroup, android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (26588 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr2);
            if (!m25747.containsKey(((java.lang.String) objArr2[0]).intern())) {
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(33 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 10 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), objArr3);
                util.h.xy.an.ra<util.h.xy.bv.rb> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(hVar, false, ((java.lang.String) objArr3[0]).intern());
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                return highResolutionOutputSizeshNQ4ISI;
            }
            int resolveSize = android.view.View.resolveSize(0, 0);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(10 - resolveSize, android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (26589 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr4);
            hVar.m25697(m25747.get(((java.lang.String) objArr4[0]).intern()));
            int indexOf = android.text.TextUtils.indexOf("", "", 0);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(13 - indexOf, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) (23830 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr5);
            if (m25747.containsKey(((java.lang.String) objArr5[0]).intern())) {
                int packedPositionType = 13 - android.widget.ExpandableListView.getPackedPositionType(0L);
                int defaultSize = android.view.View.getDefaultSize(0, 0) + 42;
                int i3 = getOutputMinFrameDuration + 77;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(packedPositionType, defaultSize, (char) (23830 >>> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr6);
                        hVar.m25698(m25747.get(((java.lang.String) objArr6[0]).intern()));
                    } else {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(packedPositionType, defaultSize, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 23830), objArr7);
                        hVar.m25698(m25747.get(((java.lang.String) objArr7[0]).intern()));
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return getHighResolutionOutputSizeshNQ4ISI(hVar, true, null);
        }
        return new util.h.xy.an.ra(rbVar, true, null);
    }

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i3 = Camera2StreamConfigurationMap + 95;
            getHighSpeedVideoSizes = i3 % 128;
            int i4 = i3 % 2;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            int i5 = getHighSpeedVideoSizes + 69;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static util.h.xy.an.ra<util.h.xy.bv.rb> getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.h hVar, boolean z, java.lang.String str) {
        util.h.xy.an.ra<util.h.xy.bv.rb> raVar = new util.h.xy.an.ra<>(hVar, z, str);
        int i = getHighSpeedVideoFpsRangesFor + 125;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return raVar;
        }
        throw null;
    }
}
