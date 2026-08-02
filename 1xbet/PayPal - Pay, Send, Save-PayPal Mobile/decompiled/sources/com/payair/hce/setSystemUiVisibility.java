package com.payair.hce;

/* loaded from: classes4.dex */
final class setSystemUiVisibility {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private final com.payair.hce.setMinimumHeight valueOf = new com.payair.hce.setMinimumHeight();
    private final android.content.Context writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i2);
        int i6 = ~i;
        return ((((i * (-1939)) + (i2 * 971)) + (((~(i | i4)) | i5) * (-970))) + ((~(i2 | i6)) * 1940)) + (((~(i6 | i4)) | i5) * 970) != 1 ? writeReplace(objArr) : values(objArr);
    }

    setSystemUiVisibility(android.content.Context context) {
        this.writeReplace = context;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setSystemUiVisibility setsystemuivisibility = (com.payair.hce.setSystemUiVisibility) objArr[0];
        com.nimbusds.jose.jwk.ECKey eCKey = (com.nimbusds.jose.jwk.ECKey) valueOf(new java.lang.Object[]{setsystemuivisibility}, -1687444452, 1687444452, java.lang.System.identityHashCode(setsystemuivisibility));
        com.nimbusds.jose.JWSHeader build = new com.nimbusds.jose.JWSHeader.Builder(com.nimbusds.jose.JWSAlgorithm.ES256).type(com.nimbusds.jose.JOSEObjectType.JWT).keyID(eCKey.getKeyID()).build();
        com.payair.hce.setMinimumHeight setminimumheight = setsystemuivisibility.valueOf;
        com.nimbusds.jwt.SignedJWT signedJWT = new com.nimbusds.jwt.SignedJWT(build, new com.nimbusds.jwt.JWTClaimsSet.Builder().claim("cre_at", java.lang.String.valueOf(((java.lang.Long) com.payair.hce.setMinimumHeight.values(new java.lang.Object[0], 2003072114, -2003072114, (int) java.lang.System.currentTimeMillis())).longValue() / 1000)).claim("sdk_ver", "2.21.0").build());
        signedJWT.sign(new com.nimbusds.jose.crypto.ECDSASigner(eCKey.toECPrivateKey()));
        java.lang.String serialize = signedJWT.serialize();
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & 91) + (i | 91);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return serialize;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (((java.lang.Boolean) java.lang.String.class.getMethod("contains", java.lang.CharSequence.class).invoke(r1, "qa-")).booleanValue() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String str;
        com.payair.hce.setSystemUiVisibility setsystemuivisibility = (com.payair.hce.setSystemUiVisibility) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 89;
        int i3 = -(-((i & 89) << 1));
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        java.lang.String str2 = (java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 162450370, -162450360, (int) java.lang.System.currentTimeMillis());
        int i4 = (AlternateContactlessPaymentDataJson + 9) % 128;
        DigitizedCardProfile = i4;
        int i5 = i4 & 7;
        int i6 = ((i4 ^ 7) | i5) << 1;
        int i7 = -((i4 | 7) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        AlternateContactlessPaymentDataJson = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                java.lang.Object[] objArr2 = {"qa-"};
                java.lang.Class[] clsArr = new java.lang.Class[0];
                clsArr[1] = java.lang.CharSequence.class;
                if (((java.lang.Boolean) java.lang.String.class.getMethod("contains", clsArr).invoke(str2, objArr2)).booleanValue()) {
                    int i9 = DigitizedCardProfile;
                    int i10 = i9 & 61;
                    int i11 = (~i10) & (i9 | 61);
                    int i12 = i10 << 1;
                    AlternateContactlessPaymentDataJson = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                    AlternateContactlessPaymentDataJson = (((i9 ^ 84) + ((i9 & 84) << 1)) - 1) % 128;
                    str = "qa-base-secret.txt";
                }
                str = "secret.txt";
            }
            try {
                java.lang.Object[] objArr3 = {setsystemuivisibility.writeReplace.getAssets(), str};
                java.lang.Object obj = com.payair.hce.getTrack1ConstructionData.getAdditionalCheckTable.get(-1848909352);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.getTrack1ConstructionData.writeReplace(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 16697), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41)).getMethod("a_", android.content.res.AssetManager.class, java.lang.String.class);
                    com.payair.hce.getTrack1ConstructionData.getAdditionalCheckTable.put(-1848909352, obj);
                }
                java.io.InputStream inputStream = (java.io.InputStream) ((java.lang.reflect.Method) obj).invoke(null, objArr3);
                try {
                    java.lang.String str3 = (java.lang.String) new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8)).lines().collect(java.util.stream.Collectors.joining());
                    if (inputStream != null) {
                        int i13 = DigitizedCardProfile;
                        int i14 = i13 & 103;
                        AlternateContactlessPaymentDataJson = (i14 + ((i13 ^ 103) | i14)) % 128;
                        inputStream.close();
                        int i15 = DigitizedCardProfile;
                        int i16 = (i15 ^ 53) + ((i15 & 53) << 1);
                        AlternateContactlessPaymentDataJson = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        int i18 = AlternateContactlessPaymentDataJson + 59;
                        DigitizedCardProfile = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    com.nimbusds.jose.jwk.ECKey parse = com.nimbusds.jose.jwk.ECKey.parse(str3);
                    int i20 = DigitizedCardProfile + 1;
                    AlternateContactlessPaymentDataJson = i20 % 128;
                    if (i20 % 2 == 0) {
                        return parse;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            int i21 = DigitizedCardProfile;
                            AlternateContactlessPaymentDataJson = ((i21 ^ 111) + ((i21 & 111) << 1)) % 128;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause2 = th4.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th4;
        }
    }

    private com.nimbusds.jose.jwk.ECKey valueOf() throws java.lang.Exception {
        return (com.nimbusds.jose.jwk.ECKey) valueOf(new java.lang.Object[]{this}, -1687444452, 1687444452, java.lang.System.identityHashCode(this));
    }

    final java.lang.String AlternateContactlessPaymentDataJson() throws java.lang.Exception {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1915384022, 1915384023, java.lang.System.identityHashCode(this));
    }
}
