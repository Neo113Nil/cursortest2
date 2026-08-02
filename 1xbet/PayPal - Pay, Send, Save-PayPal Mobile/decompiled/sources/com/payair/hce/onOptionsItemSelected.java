package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class onOptionsItemSelected {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static long getGpoResponse;
    private final int AlternateContactlessPaymentDataJson = 1106;
    protected final java.util.List<java.lang.String> DigitizedCardProfile;
    private com.payair.hce.component6 IccPrivateKeyCrtComponentsJson;
    private java.util.HashMap<java.lang.String, java.lang.String> RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private int getAid;
    private java.lang.String getCvrMaskAnd;
    private java.lang.String getPaymentFci;
    private java.net.URL getProfileVersion;
    private final java.lang.String valueOf;
    private com.payair.hce.setStatusCodeFromServer values;
    protected java.net.HttpURLConnection writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = b2 + 4;
        int i3 = s * 3;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = i2;
            int i6 = i4;
            i2 += i6;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i];
            i2 += i6;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
            }
        } else {
            i2 = 119 - (b * 2);
            i = i2;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
            }
        }
    }

    abstract java.net.HttpURLConnection DigitizedCardProfile(java.net.URL url) throws com.payair.hce.component5;

    private static void e(java.lang.String str, int i, java.lang.Object[] objArr) {
        $10 = ($11 + 21) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getGpoResponse ^ (-3824242241614154557L), charArray, i);
        int i2 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $10 = ($11 + 7) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i2;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % i2]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getGpoResponse)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((byte) 1, (byte) -1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 27, 429 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31609));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((byte) 0, (byte) -1, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i2 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    public onOptionsItemSelected(java.net.URL url, com.payair.hce.component6 component6Var, int i, java.util.List<java.lang.String> list, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws com.payair.hce.component5 {
        java.lang.Object[] objArr = new java.lang.Object[1];
        e("읡윳崒꺆צ㒠ꕜῐ뼞\u0cf7困㵡Νᢚ樈", 1 - android.graphics.Color.green(0), objArr);
        this.valueOf = ((java.lang.String) objArr[0]).intern();
        this.values = (com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        e("썉쌊㴳ம旍每ꅨ뫢\udf76꧰\u09d2戈ޕ碭켸걖", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
        this.getPaymentFci = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        e("ኌው\uf5e3\ue3fa광杛炸劻ឰ溍", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr3);
        this.getCvrMaskAnd = ((java.lang.String) objArr3[0]).intern();
        this.getProfileVersion = url;
        this.IccPrivateKeyCrtComponentsJson = component6Var;
        this.getAid = i;
        this.DigitizedCardProfile = list;
        this.RecordsJson = hashMap;
    }

    public final com.payair.hce.onOptionsItemSelected valueOf(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 71;
        int i2 = i % 128;
        getCiacDecline = i2;
        if (i % 2 != 0) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = str;
            int i3 = i2 + 53;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = str;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.equals values() throws com.payair.hce.component5 {
        java.io.InputStream inputStream;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        java.io.OutputStream outputStream;
        int responseCode;
        int valueOf;
        byte[] bArr = null;
        try {
            try {
                this.writeReplace.getRequestMethod();
                if (this.SdkCoreAlternateContactlessPaymentDataImpl != null) {
                    try {
                        outputStream = this.writeReplace.getOutputStream();
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                        outputStream = null;
                    }
                    try {
                        outputStream.write(this.SdkCoreAlternateContactlessPaymentDataImpl.getBytes());
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th2 = th4;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                }
                this.writeReplace.connect();
                responseCode = this.writeReplace.getResponseCode();
                valueOf = valueOf(this.writeReplace);
                if (responseCode == 200) {
                    java.io.InputStream inputStream2 = this.writeReplace.getInputStream();
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byte[] bArr2 = new byte[2048];
                    while (true) {
                        int read = inputStream2.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        int i = SdkCoreBusinessLogicModuleImpl + 107;
                        getCiacDecline = i % 128;
                        if (i % 2 == 0) {
                            if (read == 17196) {
                                byteArrayOutputStream.write(bArr2);
                            } else {
                                byte[] bArr3 = new byte[read];
                                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, read);
                                byteArrayOutputStream.write(bArr3);
                            }
                        } else if (read == 2048) {
                            byteArrayOutputStream.write(bArr2);
                        } else {
                            byte[] bArr32 = new byte[read];
                            java.lang.System.arraycopy(bArr2, 0, bArr32, 0, read);
                            byteArrayOutputStream.write(bArr32);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream = inputStream2;
                    bArr = byteArray;
                } else {
                    inputStream = null;
                }
            } catch (java.lang.Throwable th5) {
                inputStream = null;
                th = th5;
            }
        } catch (java.net.SocketTimeoutException e) {
            e = e;
        } catch (javax.net.ssl.SSLException e2) {
            e = e2;
        } catch (java.lang.Exception e3) {
            e = e3;
        }
        try {
            com.payair.hce.onOptionsItemSelected.DigitizedCardProfile digitizedCardProfile = new com.payair.hce.onOptionsItemSelected.DigitizedCardProfile(responseCode, bArr, valueOf);
            if (inputStream != null) {
                int i2 = getCiacDecline + 25;
                SdkCoreBusinessLogicModuleImpl = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        inputStream.close();
                        throw new java.lang.ArithmeticException();
                    }
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            java.net.HttpURLConnection httpURLConnection = this.writeReplace;
            if (httpURLConnection != null) {
                getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 13) % 128;
                httpURLConnection.disconnect();
            }
            return digitizedCardProfile;
        } catch (java.net.SocketTimeoutException e4) {
            e = e4;
            throw new com.payair.hce.component5(408, e.getMessage());
        } catch (javax.net.ssl.SSLException e5) {
            e = e5;
            throw new com.payair.hce.component5(1106, e.getMessage());
        } catch (java.lang.Exception e6) {
            e = e6;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.getMessage());
            sb.append(e);
            throw new com.payair.hce.component5(sb.toString());
        } catch (java.lang.Throwable th6) {
            th = th6;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            java.net.HttpURLConnection httpURLConnection2 = this.writeReplace;
            if (httpURLConnection2 == null) {
                throw th;
            }
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 11) % 128;
            httpURLConnection2.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r0.containsKey(((java.lang.String) r5[0]).intern()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int valueOf(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException, com.payair.hce.component5 {
        if (httpURLConnection.getHeaderFields() != null) {
            int i = getCiacDecline + 89;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            if (i % 2 != 0) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                android.graphics.Color.red(0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                e("읡윳崒꺆צ㒠ꕜῐ뼞\u0cf7困㵡Νᢚ樈", 0, objArr);
                if (!headerFields.containsKey(((java.lang.String) objArr[0]).intern())) {
                    return 0;
                }
            } else {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields2 = httpURLConnection.getHeaderFields();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                e("읡윳崒꺆צ㒠ꕜῐ뼞\u0cf7困㵡Νᢚ樈", android.graphics.Color.red(0) + 1, objArr2);
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields3 = httpURLConnection.getHeaderFields();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e("읡윳崒꺆צ㒠ꕜῐ뼞\u0cf7困㵡Νᢚ樈", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
            java.util.List<java.lang.String> list = headerFields3.get(((java.lang.String) objArr3[0]).intern());
            try {
                try {
                    int parseInt = java.lang.Integer.parseInt(list.get(0));
                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 103) % 128;
                    return parseInt;
                } catch (java.lang.Exception e) {
                    throw new com.payair.hce.component5(httpURLConnection.getResponseCode(), android.util.Log.getStackTraceString(e));
                }
            } catch (java.lang.NumberFormatException unused) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                e("蚇蛂渂鳜㛖檻\ue4e3ⶻ豧㺹ࣳ挤䉂⮂報굦ꀲ䧲館卻\u0fdf휿ឳ\uf18a涾甉놾限쬿邅퍻㐕", 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                return java.lang.Long.valueOf((new java.text.SimpleDateFormat(((java.lang.String) objArr4[0]).intern(), java.util.Locale.ENGLISH).parse(list.get(0)).getTime() - java.lang.System.currentTimeMillis()) / 1000).intValue();
            }
        }
        return 0;
    }

    protected final java.net.HttpURLConnection AlternateContactlessPaymentDataJson(java.net.HttpURLConnection httpURLConnection) throws java.net.ProtocolException {
        httpURLConnection.setRequestMethod(this.IccPrivateKeyCrtComponentsJson.name());
        httpURLConnection.setDoInput(true);
        if (this.IccPrivateKeyCrtComponentsJson == com.payair.hce.component6.DigitizedCardProfile) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 53) % 128;
            httpURLConnection.setDoOutput(true);
            java.lang.Object[] objArr = new java.lang.Object[1];
            e("썉쌊㴳ம旍每ꅨ뫢\udf76꧰\u09d2戈ޕ碭켸걖", 1 - android.graphics.Color.green(0), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.RecordsJson;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            e("썉쌊㴳ம旍每ꅨ뫢\udf76꧰\u09d2戈ޕ碭켸걖", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            httpURLConnection.setRequestProperty(intern, hashMap.get(((java.lang.String) objArr2[0]).intern()));
            int i = getCiacDecline + 17;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            int i2 = i % 2;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        e("ኌው\uf5e3\ue3fa광杛炸劻ឰ溍", 1 - android.view.View.resolveSize(0, 0), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = this.RecordsJson;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        e("ኌው\uf5e3\ue3fa광杛炸劻ឰ溍", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        httpURLConnection.setRequestProperty(intern2, hashMap2.get(((java.lang.String) objArr4[0]).intern()));
        httpURLConnection.setConnectTimeout(this.getAid);
        httpURLConnection.setReadTimeout(this.getAid);
        return httpURLConnection;
    }

    final class DigitizedCardProfile implements com.payair.hce.equals {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int getAid = 1;
        private int DigitizedCardProfile;
        private byte[] valueOf;
        private int values;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~i3;
            int i6 = ~(i5 | i2);
            int i7 = ~i;
            int i8 = (i * (-515)) + (i2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE) + (((~(i | i5)) | (~(i4 | i3)) | i6) * (-516)) + (((~(i4 | i7 | i3)) | (~(i7 | i5 | i2))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(i7 | i2)) | i6) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
            return i8 != 1 ? i8 != 2 ? writeReplace(objArr) : values(objArr) : DigitizedCardProfile(objArr);
        }

        DigitizedCardProfile(int i, byte[] bArr, int i2) {
            this.values = i;
            this.valueOf = bArr;
            this.DigitizedCardProfile = i2;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.onOptionsItemSelected.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.onOptionsItemSelected.DigitizedCardProfile) objArr[0];
            int i = AlternateContactlessPaymentDataJson;
            int i2 = i + 4;
            int i3 = (~i2) + (i2 << 1);
            getAid = i3 % 128;
            int i4 = digitizedCardProfile.values;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i5 = (i | 105) << 1;
            int i6 = -((i & (-106)) | ((~i) & 105));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            getAid = i7 % 128;
            if (i7 % 2 != 0) {
                return java.lang.Integer.valueOf(i4);
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.onOptionsItemSelected.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.onOptionsItemSelected.DigitizedCardProfile) objArr[0];
            int i = getAid;
            AlternateContactlessPaymentDataJson = (i + 3) % 128;
            byte[] bArr = digitizedCardProfile.valueOf;
            int i2 = i & 89;
            int i3 = ((i | 89) & (~i2)) + (i2 << 1);
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.onOptionsItemSelected.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.onOptionsItemSelected.DigitizedCardProfile) objArr[0];
            int i = getAid;
            int i2 = ((i & (-12)) | ((~i) & 11)) + ((i & 11) << 1);
            int i3 = i2 % 128;
            AlternateContactlessPaymentDataJson = i3;
            int i4 = digitizedCardProfile.DigitizedCardProfile;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i5 = ((i3 ^ 74) + ((i3 & 74) << 1)) - 1;
            getAid = i5 % 128;
            if (i5 % 2 != 0) {
                return java.lang.Integer.valueOf(i4);
            }
            throw null;
        }

        @Override // com.payair.hce.equals
        public final int valueOf() {
            return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 911291735, -911291735, java.lang.System.identityHashCode(this))).intValue();
        }

        @Override // com.payair.hce.equals
        public final byte[] writeReplace() {
            return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1825850668, 1825850669, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.equals
        public final int DigitizedCardProfile() {
            return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -645835372, 645835374, java.lang.System.identityHashCode(this))).intValue();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getCiacDecline = 1;
        getGpoResponse = 2449243614809173074L;
    }

    static void init$0() {
        $$d = new byte[]{13, com.visa.cbp.getEncExpo.kernelVersion, 116, -36};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }
}
