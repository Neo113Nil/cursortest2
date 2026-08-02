package util.h.xy.aa;

/* loaded from: classes5.dex */
public class md {
    private static int Camera2StreamConfigurationMap = 0;
    private static final androidx.collection.SparseArrayCompat<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static util.h.xy.aa.md getHighSpeedVideoFpsRangesFor;
    private static final androidx.collection.SparseArrayCompat<java.lang.Integer> getHighSpeedVideoSizes;
    private static char[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean f71;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected android.content.Context f72;

    static /* synthetic */ androidx.collection.SparseArrayCompat getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    static /* synthetic */ androidx.collection.SparseArrayCompat getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 75) + (i | 75);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        androidx.collection.SparseArrayCompat<java.lang.Integer> sparseArrayCompat = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i ^ 85) + ((i & 85) << 1)) % 128;
        return sparseArrayCompat;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = Camera2StreamConfigurationMap + 121;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return getOutputFormats;
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        getOutputFormats = "md";
        getHighSpeedVideoFpsRangesFor = null;
        getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.SparseArrayCompat<>();
        getHighSpeedVideoSizes = new androidx.collection.SparseArrayCompat<>();
        m24525();
        f71 = false;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 47) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.aa.md m24524(android.content.Context context) {
        util.h.xy.aa.md mdVar;
        synchronized (util.h.xy.aa.md.class) {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i & 57) + (i | 57);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new util.h.xy.aa.md(context);
                int i3 = Camera2StreamConfigurationMap;
                int i4 = (i3 ^ 35) + ((i3 & 35) << 1);
                getHighSpeedVideoFpsRanges = i4 % 128;
                int i5 = i4 % 2;
            }
            mdVar = getHighSpeedVideoFpsRangesFor;
            int i6 = getHighSpeedVideoFpsRanges;
            int i7 = (i6 ^ 103) + ((i6 & 103) << 1);
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return mdVar;
    }

    private md(android.content.Context context) {
        this.f72 = context;
    }

    public md() {
        this.f72 = null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24528() {
        int i = getHighSpeedVideoFpsRanges + 51;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0 ? android.os.Build.VERSION.SDK_INT >= 29 : android.os.Build.VERSION.SDK_INT >= 39) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 119) % 128;
            com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24531 = m24531(false);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 5) % 128;
            return m24531;
        }
        int i2 = Camera2StreamConfigurationMap + 41;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return m24530();
        }
        m24530();
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24529() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 119) + (i | 119);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0 || android.os.Build.VERSION.SDK_INT >= 29) {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = ((i3 | 49) << 1) - (i3 ^ 49);
            getHighSpeedVideoFpsRanges = i4 % 128;
            com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24531 = i4 % 2 == 0 ? m24531(false) : m24531(true);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
            return m24531;
        }
        int i5 = Camera2StreamConfigurationMap + 25;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            return m24530();
        }
        m24530();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24530() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 85) % 128;
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) this.f72.getSystemService(util.h.xy.al.ra.f803);
        if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
            return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SECURE_LOCK_NOT_PRESENTED;
        }
        if (androidx.core.app.ActivityCompat.checkSelfPermission(this.f72, util.h.xy.al.ra.f799) != 0) {
            return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.PERMISSION_NOT_GRANTED;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 57) % 128;
        android.hardware.fingerprint.FingerprintManager fingerprintManager = (android.hardware.fingerprint.FingerprintManager) this.f72.getSystemService(util.h.xy.al.ra.f371);
        if (fingerprintManager == null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 59) % 128;
            return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_SENSOR;
        }
        if (!fingerprintManager.isHardwareDetected()) {
            int i = Camera2StreamConfigurationMap;
            int i2 = ((i | 77) << 1) - (i ^ 77);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_SENSOR;
            }
            com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport biometricsSupport = com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_SENSOR;
            throw null;
        }
        if (fingerprintManager.hasEnrolledFingerprints()) {
            return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED;
        }
        int i3 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i3 ^ 89) + ((i3 & 89) << 1)) % 128;
        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport biometricsSupport2 = com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_ENROLLED;
        int i4 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i4 & 87) + (i4 | 87)) % 128;
        return biometricsSupport2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24531(boolean z) {
        int i;
        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport biometricsSupport;
        int i2;
        int i3;
        android.hardware.biometrics.BiometricManager biometricManager = (android.hardware.biometrics.BiometricManager) this.f72.getSystemService(android.hardware.biometrics.BiometricManager.class);
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) this.f72.getSystemService(util.h.xy.al.ra.f803);
        if (keyguardManager != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
            if (keyguardManager.isKeyguardSecure()) {
                if (biometricManager == null) {
                    return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_SENSOR;
                }
                if (android.os.Build.VERSION.SDK_INT == 29) {
                    int i4 = getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = (((i4 | 93) << 1) - (i4 ^ 93)) % 128;
                    i = biometricManager.canAuthenticate();
                    int i5 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i5 ^ 103) + ((i5 & 103) << 1)) % 128;
                } else if (android.os.Build.VERSION.SDK_INT < 30) {
                    i = 1;
                } else if (z) {
                    int i6 = Camera2StreamConfigurationMap;
                    int i7 = ((i6 | 43) << 1) - (i6 ^ 43);
                    getHighSpeedVideoFpsRanges = i7 % 128;
                    if (i7 % 2 == 0) {
                        biometricManager.canAuthenticate(32783);
                        throw new java.lang.ArithmeticException();
                    }
                    i = biometricManager.canAuthenticate(32783);
                } else {
                    i = biometricManager.canAuthenticate(15);
                }
                if (i != 0) {
                    if (i == 11) {
                        return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_ENROLLED;
                    }
                    if (i != 15) {
                        return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.NO_FINGERPRINT_SENSOR;
                    }
                    biometricsSupport = com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SECURITY_UPDATE_REQUIRED;
                    int i8 = Camera2StreamConfigurationMap;
                    i2 = i8 ^ 111;
                    i3 = i8 & 111;
                } else {
                    if (!keyguardManager.isKeyguardSecure()) {
                        int i9 = Camera2StreamConfigurationMap;
                        int i10 = (i9 & 93) + (i9 | 93);
                        getHighSpeedVideoFpsRanges = i10 % 128;
                        if (i10 % 2 != 0) {
                            return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SECURE_LOCK_NOT_PRESENTED;
                        }
                        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport biometricsSupport2 = com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SECURE_LOCK_NOT_PRESENTED;
                        throw null;
                    }
                    biometricsSupport = com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED;
                    int i11 = Camera2StreamConfigurationMap;
                    i2 = i11 ^ 119;
                    i3 = i11 & 119;
                }
                getHighSpeedVideoFpsRanges = (i2 + (i3 << 1)) % 128;
                return biometricsSupport;
            }
        }
        return com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SECURE_LOCK_NOT_PRESENTED;
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        char[] cArr6 = new char[i2];
        maVar.f2631 = 0;
        while (maVar.f2631 < i2) {
            cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
            maVar.f2631++;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0186  */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m24526(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput, final util.h.xy.aa.ra raVar, final util.h.xy.aa.mb.ra raVar2) {
        android.hardware.biometrics.BiometricPrompt.Builder negativeButton;
        int i;
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) this.f72.getSystemService(util.h.xy.al.ra.f803);
        android.hardware.biometrics.BiometricPrompt.Builder description = new android.hardware.biometrics.BiometricPrompt.Builder(this.f72).setTitle(deviceCVMVerifierInput.getTitle()).setSubtitle(deviceCVMVerifierInput.getSubtitle()).setDescription(deviceCVMVerifierInput.getDescription());
        final boolean z = false;
        if (keyguardManager.isDeviceSecure()) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 71) % 128;
            if (!util.h.xy.al.c.m25003()) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 9) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{0, 16, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{16, 12, 0, 11}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr2);
                if (((java.lang.String) cls.getField((java.lang.String) objArr2[0]).get(null)).equalsIgnoreCase(util.h.xy.al.ra.f721)) {
                    int i2 = getHighSpeedVideoFpsRanges + 15;
                    Camera2StreamConfigurationMap = i2 % 128;
                    if (i2 % 2 == 0 ? android.os.Build.VERSION.SDK_INT == 29 : android.os.Build.VERSION.SDK_INT == 29) {
                        int i3 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = ((i3 ^ 45) + ((i3 & 45) << 1)) % 128;
                        if (m24528() != com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED) {
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 23) % 128;
                            negativeButton = description.setDeviceCredentialAllowed(true);
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
                        } else {
                            negativeButton = description.setDeviceCredentialAllowed(false).setNegativeButton(deviceCVMVerifierInput.getNegativeButtonText(), this.f72.getMainExecutor(), new android.content.DialogInterface.OnClickListener() { // from class: util.h.xy.aa.md.4
                                private static int getHighSpeedVideoFpsRanges = 1;
                                private static int getHighSpeedVideoSizes;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                                    int i5 = getHighSpeedVideoFpsRanges;
                                    int i6 = (i5 & 19) + (i5 | 19);
                                    getHighSpeedVideoSizes = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                                        raVar.getHighSpeedVideoFpsRangesFor().cancel();
                                        util.h.xy.aa.mb.ra raVar3 = raVar2;
                                        if (raVar3 != null) {
                                            raVar3.mo24519(10, util.h.xy.al.ra.f769);
                                            int i7 = getHighSpeedVideoSizes;
                                            getHighSpeedVideoFpsRanges = ((i7 & 39) + (i7 | 39)) % 128;
                                        }
                                        int i8 = getHighSpeedVideoFpsRanges + 75;
                                        getHighSpeedVideoSizes = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar.getHighSpeedVideoFpsRangesFor().cancel();
                                    throw null;
                                }
                            });
                        }
                        negativeButton.build().authenticate(raVar.getHighSpeedVideoFpsRangesFor(), this.f72.getMainExecutor(), new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: util.h.xy.aa.md.5
                            private static int getHighSpeedVideoFpsRangesFor = 1;
                            private static int getHighSpeedVideoSizes;

                            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                            public final void onAuthenticationError(int i4, java.lang.CharSequence charSequence) {
                                int i5 = getHighSpeedVideoSizes + 101;
                                getHighSpeedVideoFpsRangesFor = i5 % 128;
                                if (i5 % 2 != 0) {
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar2.mo24519(i4, charSequence);
                                    return;
                                }
                                util.h.xy.aa.md.getHighSpeedVideoSizes();
                                util.h.xy.aa.md.getHighSpeedVideoSizes();
                                util.h.xy.aa.md.getHighSpeedVideoSizes();
                                util.h.xy.aa.md.getHighSpeedVideoSizes();
                                raVar2.mo24519(i4, charSequence);
                                throw new java.lang.ArithmeticException();
                            }

                            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                            public final void onAuthenticationHelp(int i4, java.lang.CharSequence charSequence) {
                                int i5 = getHighSpeedVideoSizes;
                                int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
                                getHighSpeedVideoFpsRangesFor = i6 % 128;
                                if (i6 % 2 != 0) {
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar2.mo24521(i4, charSequence);
                                } else {
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar2.mo24521(i4, charSequence);
                                    throw null;
                                }
                            }

                            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                            public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                                int i4 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoSizes = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
                                util.h.xy.aa.md.getHighSpeedVideoSizes();
                                raVar2.mo24522(false, -1L);
                            }

                            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                            public final void onAuthenticationFailed() {
                                int i4 = getHighSpeedVideoSizes;
                                int i5 = (i4 & 65) + (i4 | 65);
                                getHighSpeedVideoFpsRangesFor = i5 % 128;
                                if (i5 % 2 != 0) {
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar2.mo24520();
                                } else {
                                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                                    raVar2.mo24520();
                                    throw new java.lang.ArithmeticException();
                                }
                            }
                        });
                        i = getHighSpeedVideoFpsRanges + 3;
                        Camera2StreamConfigurationMap = i % 128;
                        if (i % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        return;
                    }
                }
                z = true;
                negativeButton = description.setDeviceCredentialAllowed(true);
                negativeButton.build().authenticate(raVar.getHighSpeedVideoFpsRangesFor(), this.f72.getMainExecutor(), new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: util.h.xy.aa.md.5
                    private static int getHighSpeedVideoFpsRangesFor = 1;
                    private static int getHighSpeedVideoSizes;

                    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                    public final void onAuthenticationError(int i4, java.lang.CharSequence charSequence) {
                        int i5 = getHighSpeedVideoSizes + 101;
                        getHighSpeedVideoFpsRangesFor = i5 % 128;
                        if (i5 % 2 != 0) {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24519(i4, charSequence);
                            return;
                        }
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24519(i4, charSequence);
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                    public final void onAuthenticationHelp(int i4, java.lang.CharSequence charSequence) {
                        int i5 = getHighSpeedVideoSizes;
                        int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        if (i6 % 2 != 0) {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24521(i4, charSequence);
                        } else {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24521(i4, charSequence);
                            throw null;
                        }
                    }

                    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                    public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        getHighSpeedVideoSizes = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24522(false, -1L);
                    }

                    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                    public final void onAuthenticationFailed() {
                        int i4 = getHighSpeedVideoSizes;
                        int i5 = (i4 & 65) + (i4 | 65);
                        getHighSpeedVideoFpsRangesFor = i5 % 128;
                        if (i5 % 2 != 0) {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24520();
                        } else {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24520();
                            throw new java.lang.ArithmeticException();
                        }
                    }
                });
                i = getHighSpeedVideoFpsRanges + 3;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                }
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{0, 16, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr3);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{16, 12, 0, 11}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr4);
        boolean equalsIgnoreCase = ((java.lang.String) cls2.getField((java.lang.String) objArr4[0]).get(null)).equalsIgnoreCase(util.h.xy.al.ra.f343);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{0, 16, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr5);
        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{16, 12, 0, 11}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr6);
        if (((java.lang.String) cls3.getField((java.lang.String) objArr6[0]).get(null)).equalsIgnoreCase(util.h.xy.al.ra.f343)) {
            z = equalsIgnoreCase;
            negativeButton = description.setDeviceCredentialAllowed(true);
            negativeButton.build().authenticate(raVar.getHighSpeedVideoFpsRangesFor(), this.f72.getMainExecutor(), new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: util.h.xy.aa.md.5
                private static int getHighSpeedVideoFpsRangesFor = 1;
                private static int getHighSpeedVideoSizes;

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationError(int i4, java.lang.CharSequence charSequence) {
                    int i5 = getHighSpeedVideoSizes + 101;
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24519(i4, charSequence);
                        return;
                    }
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar2.mo24519(i4, charSequence);
                    throw new java.lang.ArithmeticException();
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationHelp(int i4, java.lang.CharSequence charSequence) {
                    int i5 = getHighSpeedVideoSizes;
                    int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24521(i4, charSequence);
                    } else {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24521(i4, charSequence);
                        throw null;
                    }
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar2.mo24522(false, -1L);
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationFailed() {
                    int i4 = getHighSpeedVideoSizes;
                    int i5 = (i4 & 65) + (i4 | 65);
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24520();
                    } else {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24520();
                        throw new java.lang.ArithmeticException();
                    }
                }
            });
            i = getHighSpeedVideoFpsRanges + 3;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
            }
        } else {
            negativeButton = description.setNegativeButton(deviceCVMVerifierInput.getNegativeButtonText(), this.f72.getMainExecutor(), new android.content.DialogInterface.OnClickListener() { // from class: util.h.xy.aa.md.2
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRangesFor = 1;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                    int i5 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRangesFor = ((i5 & 41) + (i5 | 41)) % 128;
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar.getHighSpeedVideoFpsRangesFor().cancel();
                    util.h.xy.aa.mb.ra raVar3 = raVar2;
                    if (raVar3 != null) {
                        int i6 = getHighSpeedVideoFpsRangesFor;
                        int i7 = ((i6 | 27) << 1) - (i6 ^ 27);
                        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                        raVar3.mo24519(i7 % 2 != 0 ? 58 : 10, util.h.xy.al.ra.f769);
                        int i8 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = ((i8 ^ 81) + ((i8 & 81) << 1)) % 128;
                    }
                }
            });
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i4 ^ 95) + ((i4 & 95) << 1)) % 128;
            z = equalsIgnoreCase;
            negativeButton.build().authenticate(raVar.getHighSpeedVideoFpsRangesFor(), this.f72.getMainExecutor(), new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: util.h.xy.aa.md.5
                private static int getHighSpeedVideoFpsRangesFor = 1;
                private static int getHighSpeedVideoSizes;

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationError(int i42, java.lang.CharSequence charSequence) {
                    int i5 = getHighSpeedVideoSizes + 101;
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24519(i42, charSequence);
                        return;
                    }
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar2.mo24519(i42, charSequence);
                    throw new java.lang.ArithmeticException();
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationHelp(int i42, java.lang.CharSequence charSequence) {
                    int i5 = getHighSpeedVideoSizes;
                    int i6 = ((i5 | 71) << 1) - (i5 ^ 71);
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24521(i42, charSequence);
                    } else {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24521(i42, charSequence);
                        throw null;
                    }
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                    int i42 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = (((i42 | 53) << 1) - (i42 ^ 53)) % 128;
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar2.mo24522(false, -1L);
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public final void onAuthenticationFailed() {
                    int i42 = getHighSpeedVideoSizes;
                    int i5 = (i42 & 65) + (i42 | 65);
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 != 0) {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24520();
                    } else {
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24520();
                        throw new java.lang.ArithmeticException();
                    }
                }
            });
            i = getHighSpeedVideoFpsRanges + 3;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m24532(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput, util.h.xy.aa.ra raVar, final util.h.xy.aa.mb.ra raVar2) {
        new android.hardware.biometrics.BiometricPrompt.Builder(this.f72).setTitle(deviceCVMVerifierInput.getTitle()).setSubtitle(deviceCVMVerifierInput.getSubtitle()).setDescription(deviceCVMVerifierInput.getDescription()).setAllowedAuthenticators(32783).build().authenticate(raVar.getHighSpeedVideoFpsRangesFor(), this.f72.getMainExecutor(), new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: util.h.xy.aa.md.3
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i2 | 35) << 1) - (i2 ^ 35)) % 128;
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                raVar2.mo24519(i, charSequence);
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 57;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationHelp(int i, java.lang.CharSequence charSequence) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i2 ^ 41) + ((i2 & 41) << 1)) % 128;
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                raVar2.mo24521(i, charSequence);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 103) % 128;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i | 75) << 1) - (i ^ 75)) % 128;
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                raVar2.mo24522(false, -1L);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationFailed() {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i & 69) + (i | 69);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.aa.md.getHighSpeedVideoSizes();
                    raVar2.mo24520();
                    int i3 = getHighSpeedVideoSizes;
                    int i4 = ((i3 | 111) << 1) - (i3 ^ 111);
                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                util.h.xy.aa.md.getHighSpeedVideoSizes();
                raVar2.mo24520();
                throw new java.lang.ArithmeticException();
            }
        });
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 57) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m24527(util.h.xy.aa.ra raVar, final util.h.xy.aa.mb.ra raVar2) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 43) % 128;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat from = androidx.core.hardware.fingerprint.FingerprintManagerCompat.from(this.f72);
            int i = util.h.xy.aa.ra.getHighResolutionOutputSizeshNQ4ISI + 31;
            int i2 = i % 128;
            util.h.xy.aa.ra.Camera2StreamConfigurationMap = i2;
            if (i % 2 != 0) {
                androidx.core.os.CancellationSignal cancellationSignal = raVar.getHighSpeedVideoSizes;
                util.h.xy.aa.ra.getHighResolutionOutputSizeshNQ4ISI = ((i2 & 87) + (i2 | 87)) % 128;
                from.authenticate((androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject) null, 0, cancellationSignal, new androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback() { // from class: util.h.xy.aa.md.1
                    private static int Camera2StreamConfigurationMap = 0;
                    private static int getHighSpeedVideoFpsRangesFor = 1;

                    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                    public final void onAuthenticationError(int i3, java.lang.CharSequence charSequence) {
                        int i4 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = ((i4 ^ 61) + ((i4 & 61) << 1)) % 128;
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24519(((java.lang.Integer) util.h.xy.aa.md.getHighSpeedVideoFpsRangesFor().get(i3, java.lang.Integer.valueOf(i3))).intValue(), charSequence);
                        int i5 = getHighSpeedVideoFpsRangesFor + 101;
                        Camera2StreamConfigurationMap = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                    }

                    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                    public final void onAuthenticationHelp(int i3, java.lang.CharSequence charSequence) {
                        int i4 = Camera2StreamConfigurationMap + 19;
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 != 0) {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24521(((java.lang.Integer) util.h.xy.aa.md.getHighResolutionOutputSizeshNQ4ISI().get(i3, java.lang.Integer.valueOf(i3))).intValue(), charSequence);
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
                            return;
                        }
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24521(((java.lang.Integer) util.h.xy.aa.md.getHighResolutionOutputSizeshNQ4ISI().get(i3, java.lang.Integer.valueOf(i3))).intValue(), charSequence);
                        throw null;
                    }

                    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                    public final void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 101) % 128;
                        util.h.xy.aa.md.getHighSpeedVideoSizes();
                        raVar2.mo24522(false, -1L);
                        int i3 = Camera2StreamConfigurationMap;
                        int i4 = ((i3 | 11) << 1) - (i3 ^ 11);
                        getHighSpeedVideoFpsRangesFor = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    }

                    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                    public final void onAuthenticationFailed() {
                        int i3 = getHighSpeedVideoFpsRangesFor;
                        int i4 = (i3 ^ 41) + ((i3 & 41) << 1);
                        Camera2StreamConfigurationMap = i4 % 128;
                        if (i4 % 2 == 0) {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24520();
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 15) % 128;
                        } else {
                            util.h.xy.aa.md.getHighSpeedVideoSizes();
                            raVar2.mo24520();
                            throw new java.lang.ArithmeticException();
                        }
                    }
                }, (android.os.Handler) null);
            } else {
                throw null;
            }
        }
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 & 79) + (i3 | 79);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m24525() {
        int i = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0 ? android.os.Build.VERSION.SDK_INT >= 28 : android.os.Build.VERSION.SDK_INT >= 109) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 89) % 128;
            androidx.collection.SparseArrayCompat<java.lang.Integer> sparseArrayCompat = getHighResolutionOutputSizeshNQ4ISI;
            sparseArrayCompat.put(3, 3);
            sparseArrayCompat.put(2, 2);
            sparseArrayCompat.put(1, 1);
            sparseArrayCompat.put(5, 5);
            sparseArrayCompat.put(4, 4);
            androidx.collection.SparseArrayCompat<java.lang.Integer> sparseArrayCompat2 = getHighSpeedVideoSizes;
            sparseArrayCompat2.put(5, 5);
            sparseArrayCompat2.put(12, 12);
            sparseArrayCompat2.put(1, 1);
            sparseArrayCompat2.put(7, 7);
            sparseArrayCompat2.put(9, 9);
            sparseArrayCompat2.put(11, 11);
            sparseArrayCompat2.put(4, 4);
            sparseArrayCompat2.put(3, 3);
            sparseArrayCompat2.put(2, 2);
            sparseArrayCompat2.put(10, 10);
            sparseArrayCompat2.put(8, 8);
        }
        int i2 = getHighSpeedVideoFpsRanges + 93;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = new char[]{42351, 42293, 42295, 42290, 42246, 42341, 42253, 42284, 42259, 42260, 42299, 42289, 42285, 42294, 42292, 42298, 42367, 42262, 42254, 42249, 42262, 42271, 42270, 42256, 42252, 42266, 42266, 42258};
    }
}
