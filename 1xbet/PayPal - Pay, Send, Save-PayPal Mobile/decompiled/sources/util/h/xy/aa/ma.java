package util.h.xy.aa;

/* loaded from: classes18.dex */
final class ma {
    final java.util.HashMap<java.lang.Integer, util.h.xy.aa.ma.C0254ma> Camera2StreamConfigurationMap = new java.util.HashMap<>();
    static final util.h.xy.aa.ma getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.aa.ma();
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 5) % 128;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {
        public static final util.h.xy.aa.ma.b Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        public static final util.h.xy.aa.ma.b getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes = 1;
        private static char[] getHighSpeedVideoSizesFor;
        private static boolean getInputFormats;
        private static int getInputSizeshNQ4ISI;
        private static int getOutputFormats;
        private static final /* synthetic */ util.h.xy.aa.ma.b[] getOutputMinFrameDuration;
        private static boolean getOutputStallDurationlomOqCM;

        private b(java.lang.String str, int i) {
        }

        public static util.h.xy.aa.ma.b valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 19) % 128;
            util.h.xy.aa.ma.b bVar = (util.h.xy.aa.ma.b) java.lang.Enum.valueOf(util.h.xy.aa.ma.b.class, str);
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 55) % 128;
            return bVar;
        }

        public static util.h.xy.aa.ma.b[] values() {
            int i = getInputSizeshNQ4ISI + 37;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            util.h.xy.aa.ma.b[] bVarArr = (util.h.xy.aa.ma.b[]) getOutputMinFrameDuration.clone();
            int i2 = getInputSizeshNQ4ISI + 15;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            util.h.xy.aa.ma.b[] bVarArr;
            getHighResolutionOutputSizeshNQ4ISI();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u008a\u0082\u0089\u0086\u0086\u0088\u0087\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            util.h.xy.aa.ma.b bVar = new util.h.xy.aa.ma.b(((java.lang.String) objArr[0]).intern(), 0);
            Camera2StreamConfigurationMap = bVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(127 - android.view.View.getDefaultSize(0, 0), "\u008c\u0088\u008a\u008b\u0081\u0089\u0085\u0084\u0083\u0082\u0081", objArr2);
            util.h.xy.aa.ma.b bVar2 = new util.h.xy.aa.ma.b(((java.lang.String) objArr2[0]).intern(), 1);
            getHighSpeedVideoFpsRangesFor = bVar2;
            int i = getInputSizeshNQ4ISI + 47;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            if (i % 2 == 0) {
                bVarArr = new util.h.xy.aa.ma.b[3];
                bVarArr[1] = bVar;
                bVarArr[1] = bVar2;
            } else {
                bVarArr = new util.h.xy.aa.ma.b[]{bVar, bVar2};
            }
            getOutputMinFrameDuration = bVarArr;
            int i3 = i2 + 63;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.md mdVar = new util.h.xz.b.md();
            char[] cArr = getHighSpeedVideoSizesFor;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
                for (int i2 = 0; i2 < length; i2++) {
                    cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
                }
                cArr = cArr2;
            }
            int i3 = (int) ((-3299939579226817547L) ^ getOutputFormats);
            if (!getOutputStallDurationlomOqCM) {
                if (!getInputFormats) {
                    throw null;
                }
                throw null;
            }
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getHighSpeedVideoSizesFor = new char[]{64248, 64212, 64213, 64225, 64222, 64234, 64250, 64228, 64231, 64237, 64224, 64229};
            getOutputFormats = -1074857159;
            getInputFormats = true;
            getOutputStallDurationlomOqCM = true;
        }
    }

    /* renamed from: util.h.xy.aa.ma$ma, reason: collision with other inner class name */
    static class C0254ma extends androidx.view.MutableLiveData<util.h.xy.aa.ma.b> {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
        final java.util.ArrayList<androidx.view.Observer<? super util.h.xy.aa.ma.b>> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();

        C0254ma() {
        }

        @Override // androidx.view.LiveData
        public void observeForever(androidx.view.Observer<? super util.h.xy.aa.ma.b> observer) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 91) << 1) - (i ^ 91);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                super.observeForever(observer);
                Camera2StreamConfigurationMap(observer);
            } else {
                super.observeForever(observer);
                Camera2StreamConfigurationMap(observer);
                throw null;
            }
        }

        @Override // androidx.view.LiveData
        public void observe(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.Observer<? super util.h.xy.aa.ma.b> observer) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 55) << 1) - (i ^ 55);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                super.observe(lifecycleOwner, observer);
                Camera2StreamConfigurationMap(observer);
            } else {
                super.observe(lifecycleOwner, observer);
                Camera2StreamConfigurationMap(observer);
                throw null;
            }
        }

        private void Camera2StreamConfigurationMap(androidx.view.Observer<? super util.h.xy.aa.ma.b> observer) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (!this.getHighSpeedVideoFpsRanges.contains(observer)) {
                    this.getHighSpeedVideoFpsRanges.add(observer);
                }
            }
        }
    }

    private ma() {
    }

    final int getHighSpeedVideoFpsRangesFor() {
        util.h.xy.aa.ma.C0254ma c0254ma = new util.h.xy.aa.ma.C0254ma();
        int hashCode = c0254ma.hashCode();
        synchronized (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap.put(java.lang.Integer.valueOf(hashCode), c0254ma);
        }
        return hashCode;
    }

    final androidx.view.LiveData<util.h.xy.aa.ma.b> getHighSpeedVideoFpsRangesFor(int i) throws java.lang.IllegalArgumentException {
        util.h.xy.aa.ma.C0254ma c0254ma;
        synchronized (this.Camera2StreamConfigurationMap) {
            c0254ma = this.Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(i));
        }
        if (c0254ma != null) {
            return c0254ma;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f750);
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final void getHighResolutionOutputSizeshNQ4ISI(int i, util.h.xy.aa.ma.b bVar) throws java.lang.IllegalArgumentException {
        util.h.xy.aa.ma.C0254ma c0254ma;
        synchronized (this.Camera2StreamConfigurationMap) {
            c0254ma = this.Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(i));
        }
        if (c0254ma == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f750);
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        c0254ma.postValue(bVar);
    }
}
