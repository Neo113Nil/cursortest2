package util.h.xy.a;

/* loaded from: classes5.dex */
public final class ra<E> {
    private static char[] Camera2StreamConfigurationMap = {40008, 55443, 5521, 21150, 36766, 50326, 409, 32467, 48050, 61582, 11677, 27274, 42890, 7310, 22929, 38554, 54235, 2303, 40008, 55441, 5529, 21150, 36737, 50381, 469, 55261, 37679, 24158, 6498, 50291, 36706, 19007, 13603};
    private static long getHighResolutionOutputSizeshNQ4ISI = -1173979298724456193L;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private int getOutputFormats;
    private java.lang.Object[] getOutputMinFrameDuration;

    public ra() {
        this(10);
    }

    public ra(int i) {
        this.getOutputMinFrameDuration = new java.lang.Object[getHighSpeedVideoFpsRanges(i)];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m24514(E e) {
        boolean z;
        synchronized (this) {
            z = true;
            int i = getHighSpeedVideoSizes + 1;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                getHighSpeedVideoSizes(this.getOutputFormats);
                java.lang.Object[] objArr = this.getOutputMinFrameDuration;
                int i2 = this.getOutputFormats;
                this.getOutputFormats = i2;
                objArr[i2] = e;
                z = false;
            } else {
                getHighSpeedVideoSizes(this.getOutputFormats + 1);
                java.lang.Object[] objArr2 = this.getOutputMinFrameDuration;
                int i3 = this.getOutputFormats;
                this.getOutputFormats = i3 + 1;
                objArr2[i3] = e;
            }
            int i4 = getHighSpeedVideoSizes + 21;
            getInputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return z;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 111) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24513() {
        synchronized (this) {
            int i = getInputSizeshNQ4ISI + 113;
            getHighSpeedVideoSizes = i % 128;
            int i2 = i % 2 != 0 ? 1 : 0;
            while (i2 < this.getOutputFormats) {
                this.getOutputMinFrameDuration[i2] = null;
                i2++;
                int i3 = getHighSpeedVideoSizes + 117;
                getInputSizeshNQ4ISI = i3 % 128;
                int i4 = i3 % 2;
            }
            this.getOutputFormats = 0;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final E m24511(int i) {
        E e;
        synchronized (this) {
            int i2 = (getInputSizeshNQ4ISI + 117) % 128;
            getHighSpeedVideoSizes = i2;
            int i3 = i2 + 13;
            int i4 = i3 % 128;
            getInputSizeshNQ4ISI = i4;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (i >= this.getOutputFormats) {
                throw new java.lang.IndexOutOfBoundsException(getHighSpeedVideoFpsRangesFor(i));
            }
            getHighSpeedVideoSizes = (i4 + 19) % 128;
            getHighSpeedVideoSizes = (i4 + 7) % 128;
            e = (E) this.getOutputMinFrameDuration[i];
            int i5 = (i4 + 93) % 128;
            getHighSpeedVideoSizes = i5;
            int i6 = i5 + 37;
            getInputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return e;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m24515() {
        int i;
        synchronized (this) {
            int i2 = getHighSpeedVideoSizes + 77;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
            i = this.getOutputFormats;
        }
        return i;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m24512() {
        boolean z;
        synchronized (this) {
            int i = getInputSizeshNQ4ISI;
            int i2 = i + 109;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getOutputFormats == 0) {
                int i3 = i + 103;
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final E[] m24516(E[] eArr) {
        synchronized (this) {
            try {
                if (eArr != null) {
                    if (eArr.length != this.getOutputFormats) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration, eArr, eArr.length);
                    return eArr;
                }
                int i = getHighSpeedVideoSizes + 21;
                int i2 = i % 128;
                getInputSizeshNQ4ISI = i2;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                getHighSpeedVideoSizes = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2, int i) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i2;
        int i3 = getHighSpeedVideoSizes + 103;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            objArr = (java.lang.Object[]) obj;
            objArr2 = (java.lang.Object[]) obj2;
            i2 = 1;
        } else {
            objArr = (java.lang.Object[]) obj;
            objArr2 = (java.lang.Object[]) obj2;
            i2 = 0;
        }
        while (i2 < i) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 13) % 128;
            objArr2[i2] = objArr[i2];
            i2++;
        }
    }

    private void getHighSpeedVideoSizes(int i) {
        int i2 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 11) % 128;
        if (i - this.getOutputMinFrameDuration.length > 0) {
            getHighSpeedVideoSizes = (i2 + 15) % 128;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i);
            java.lang.Object[] objArr = this.getOutputMinFrameDuration;
            int length = objArr.length;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[highSpeedVideoFpsRanges];
            getHighResolutionOutputSizeshNQ4ISI(objArr, objArr2, length);
            this.getOutputMinFrameDuration = objArr2;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 31) % 128;
        }
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        if (i >= 0) {
            int i2 = 10;
            while (i2 < i) {
                i2 += 10;
            }
            return i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(19 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetAfter("", 0) + 7, 18 - android.view.View.MeasureSpec.getSize(0), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 17) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 8, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 26, (char) (19440 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.getOutputFormats);
            java.lang.String obj = sb.toString();
            int i2 = getInputSizeshNQ4ISI + 35;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                return obj;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
