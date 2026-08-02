package util.h.xy.dz;

/* loaded from: classes5.dex */
public abstract class ra implements util.h.xy.dw.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputMinFrameDuration;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {36969, 56300, 1898, 29368, 48738, 59785, 21842, 32990, 52305, 14298, 25384, 44706, 6782, 17831, 45321, 64655, 10255, 37784, 57172, 2921, 30441, 41579, 60848, 22852, 33995, 61505, 15260};
    private static long getHighSpeedVideoFpsRangesFor = 7419927763752507270L;

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 97) % 128;
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRangesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 27) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 77) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected boolean m26460(util.h.xy.dw.ra raVar, util.h.xy.dw.ra raVar2) {
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 77) % 128;
        boolean m26454 = util.h.xy.dz.ma.m26454(raVar, raVar2);
        int i = getOutputMinFrameDuration + 67;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return m26454;
        }
        throw null;
    }

    private boolean getHighSpeedVideoFpsRangesFor(boolean z, util.h.xy.dw.ra raVar, util.h.xy.dw.ra[] raVarArr) {
        int i = getOutputMinFrameDuration + 65;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (z) {
            for (int length = raVarArr.length - 1; length >= 0; length--) {
                int i2 = Camera2StreamConfigurationMap;
                getOutputMinFrameDuration = (i2 + 111) % 128;
                util.h.xy.dw.ra raVar2 = raVarArr[length];
                if (raVar2 != null) {
                    getOutputMinFrameDuration = (i2 + 47) % 128;
                    if (m26460(raVar, raVar2)) {
                        raVarArr[length] = null;
                        return true;
                    }
                }
            }
        } else {
            for (int i3 = 0; i3 != raVarArr.length; i3++) {
                util.h.xy.dw.ra raVar3 = raVarArr[i3];
                if (raVar3 != null) {
                    int i4 = getOutputMinFrameDuration + 111;
                    Camera2StreamConfigurationMap = i4 % 128;
                    if (i4 % 2 == 0) {
                        m26460(raVar, raVar3);
                        throw null;
                    }
                    if (m26460(raVar, raVar3)) {
                        raVarArr[i3] = null;
                        return true;
                    }
                }
            }
        }
        int i5 = Camera2StreamConfigurationMap + 83;
        getOutputMinFrameDuration = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // util.h.xy.dw.mb
    /* renamed from: ᐝ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo26439(util.h.xy.dw.b bVar, util.h.xy.dw.b bVar2) {
        boolean z;
        int i;
        util.h.xy.dw.ra[] m26431 = bVar.m26431();
        util.h.xy.dw.ra[] m264312 = bVar2.m26431();
        if (m26431.length != m264312.length) {
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 61) % 128;
            return false;
        }
        if (m26431[0].m26442() != null) {
            int i2 = Camera2StreamConfigurationMap + 81;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0 ? m264312[0].m26442() != null : m264312[0].m26442() != null) {
                if (!m26431[0].m26442().m26434().m26325(m264312[0].m26442().m26434())) {
                    getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 53) % 128;
                    z = true;
                    for (i = 0; i != m26431.length; i++) {
                        int i3 = getOutputMinFrameDuration + 115;
                        Camera2StreamConfigurationMap = i3 % 128;
                        if (i3 % 2 == 0) {
                            getHighSpeedVideoFpsRangesFor(z, m26431[i], m264312);
                            throw null;
                        }
                        if (!getHighSpeedVideoFpsRangesFor(z, m26431[i], m264312)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        z = false;
        while (i != m26431.length) {
        }
        return true;
    }

    /* renamed from: ˋ */
    protected util.h.xy.dh.c mo26458(util.h.xy.dh.i iVar, java.lang.String str) {
        util.h.xy.dh.af afVar = new util.h.xy.dh.af(str);
        int i = Camera2StreamConfigurationMap + 55;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return afVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dw.mb
    /* renamed from: ᐝ */
    public util.h.xy.dh.c mo26438(util.h.xy.dh.i iVar, java.lang.String str) {
        int i = getOutputMinFrameDuration + 119;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0) {
                int i2 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 == 0 ? str.charAt(0) == '\\' : str.charAt(0) == '6') {
                    str = str.substring(1);
                }
            }
            util.h.xy.dh.c mo26458 = mo26458(iVar, str);
            int i3 = Camera2StreamConfigurationMap + 67;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 == 0) {
                return mo26458;
            }
            throw null;
        }
        try {
            util.h.xy.dh.c m26453 = util.h.xy.dz.ma.m26453(str, 1);
            getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 45) % 128;
            return m26453;
        } catch (java.io.IOException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(deadChar + 27, android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (3083 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(iVar.m26298());
            throw new util.h.xy.dh.ri(sb.toString());
        }
    }

    @Override // util.h.xy.dw.mb
    /* renamed from: ˊ */
    public int mo26435(util.h.xy.dw.b bVar) {
        int i;
        int i2;
        int i3 = Camera2StreamConfigurationMap + 53;
        getOutputMinFrameDuration = i3 % 128;
        util.h.xy.dw.ra[] m26431 = bVar.m26431();
        if (i3 % 2 != 0) {
            i = 1;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        while (i != m26431.length) {
            int i4 = getOutputMinFrameDuration + 85;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                m26431[i].m26443();
                throw null;
            }
            if (m26431[i].m26443()) {
                int i5 = getOutputMinFrameDuration + 109;
                Camera2StreamConfigurationMap = i5 % 128;
                int i6 = i5 % 2;
                util.h.xy.dw.ma[] m26444 = m26431[i].m26444();
                for (int i7 = 0; i7 != m26444.length; i7++) {
                    i2 = (i2 ^ m26444[i7].m26434().hashCode()) ^ getHighSpeedVideoSizes(m26444[i7].m26433());
                }
                Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 59) % 128;
            } else {
                i2 = (i2 ^ m26431[i].m26442().m26434().hashCode()) ^ getHighSpeedVideoSizes(m26431[i].m26442().m26433());
            }
            i++;
        }
        return i2;
    }

    private static int getHighSpeedVideoSizes(util.h.xy.dh.c cVar) {
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 71) % 128;
        int hashCode = util.h.xy.dz.ma.m26448(cVar).hashCode();
        getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 29) % 128;
        return hashCode;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.util.Hashtable m26459(java.util.Hashtable hashtable) {
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 21) % 128;
            java.lang.Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        int i = getOutputMinFrameDuration + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return hashtable2;
        }
        throw null;
    }
}
