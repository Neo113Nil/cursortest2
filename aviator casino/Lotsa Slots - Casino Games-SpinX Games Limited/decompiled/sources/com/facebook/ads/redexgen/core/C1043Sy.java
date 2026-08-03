package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1043Sy {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final java.lang.String A05;
    public static volatile com.facebook.ads.redexgen.core.C1043Sy A06;
    public final com.facebook.ads.redexgen.core.C1632ge A00;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1040Sv> A02 = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public final java.util.Map<java.lang.String, java.lang.Float> A01 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private android.graphics.Bitmap A02(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1040Sv c1040Sv, java.lang.String str) {
        android.graphics.Bitmap A01;
        java.lang.String str2 = c1040Sv.A08;
        int i = c1040Sv.A04;
        int i2 = c1040Sv.A05;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.IOException e = null;
        java.lang.String A08 = A08(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        java.lang.String A082 = A08(239, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            java.lang.String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0D(i, i2)) {
                        try {
                            A01 = com.facebook.ads.redexgen.core.T2.A01(inputStream, i, i2);
                        } catch (java.io.IOException e2) {
                            e = e2;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (java.lang.OutOfMemoryError e3) {
                            e = e3;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = android.graphics.BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e4) {
                e = e4;
            } catch (java.lang.OutOfMemoryError e5) {
                e = e5;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } else if (A0D(i, i2)) {
            try {
                A01 = A05(str2, i, i2);
            } catch (java.io.IOException e6) {
                e = e6;
                A0C(e);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        java.lang.String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            com.facebook.ads.redexgen.core.T0.A03(t8, c1040Sv, str, com.facebook.ads.redexgen.core.T0.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            com.facebook.ads.redexgen.core.T0.A03(t8, c1040Sv, str, com.facebook.ads.redexgen.core.T0.A02, th4, java.lang.Long.valueOf(A00), java.lang.Long.valueOf(currentTimeMillis2));
            return A01;
        }
        com.facebook.ads.redexgen.core.T0.A03(t8, c1040Sv, str, com.facebook.ads.redexgen.core.T0.A01, th4, null, null);
        if (com.facebook.ads.redexgen.core.C1086Up.A11(t8)) {
            return null;
        }
        return A01;
    }

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, 41, 55, 62, 58, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, 88, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 8, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 88, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 88, 80, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 69, 122, 81, 76, 85, 89, 72, com.google.common.base.Ascii.CAN, 75, 81, 66, 93, com.google.common.base.Ascii.CAN, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 91, 93, 93, 92, 75, com.google.common.base.Ascii.CAN, 85, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.CAN, 75, 81, 66, 93, com.google.common.base.Ascii.CAN, 94, 87, 74, com.google.common.base.Ascii.CAN, 75, 76, 87, 74, 89, 95, 93, 2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC2, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, 63, 36, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, com.google.common.base.Ascii.ESC, 79, 84, com.google.common.base.Ascii.ESC, 88, 84, 75, 66, com.google.common.base.Ascii.ESC, 87, 84, 88, 90, 87, com.google.common.base.Ascii.ESC, 82, 86, 90, 92, 94, com.google.common.base.Ascii.ESC, 82, 85, 79, 84, com.google.common.base.Ascii.ESC, 88, 90, 88, 83, 94, com.google.common.base.Ascii.ESC, 19, 78, 73, 87, 6, 38, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, 17, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 83, 7, com.google.common.base.Ascii.FS, 83, 4, 1, com.google.common.base.Ascii.SUB, 7, com.google.common.base.Ascii.SYN, 83, 17, com.google.common.base.Ascii.SUB, 7, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, 3, 83, 7, com.google.common.base.Ascii.FS, 83, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 83, 91, 6, 1, com.google.common.base.Ascii.US, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, kotlin.io.encoding.Base64.padSymbol, 40, 40, 40, 85, 90, 95, 86, 9, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, 82, 93, 88, 81, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ESC, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.ESC, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = com.facebook.ads.redexgen.core.C1043Sy.class.getSimpleName();
    }

    public C1043Sy(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    private int A00(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        java.io.ByteArrayOutputStream bOut = null;
        java.io.FileOutputStream fileOutputStream = null;
        try {
            bOut = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= com.facebook.ads.redexgen.core.C1086Up.A0H(this.A00)) {
                A0C(new java.lang.Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new java.io.FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (java.lang.OutOfMemoryError e) {
            A0C(e);
            android.util.Log.e(A05, A08(184, 39, 80), e);
            return 0;
        } catch (java.io.FileNotFoundException e2) {
            android.util.Log.e(A05, A08(6, 29, 59) + file.getPath() + A08, e2);
            A0C(e2);
            return 0;
        } catch (java.io.IOException e3) {
            A0C(e3);
            android.util.Log.e(A05, A08(148, 36, 48) + str + A08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1040Sv c1040Sv, int i, int i2, java.lang.String str) {
        android.graphics.Bitmap decodeFile;
        android.graphics.Bitmap A02;
        if (com.facebook.ads.redexgen.core.T0.A06(t8) && A08(266, 4, 37).equals(str)) {
            this.A02.put(c1040Sv.A08, c1040Sv);
        }
        java.lang.String str2 = c1040Sv.A08;
        com.facebook.ads.redexgen.core.C1044Sz c1044Sz = new com.facebook.ads.redexgen.core.C1044Sz(c1040Sv.A06, c1040Sv.A07, A08(261, 5, 89), str, str2);
        java.io.File A07 = A07(this.A00);
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str2.hashCode());
        java.lang.String url = A08(2, 4, 26);
        java.io.File file = new java.io.File(A07, append.append(url).toString());
        if (!file.exists()) {
            com.facebook.ads.redexgen.core.T0.A04(t8, c1044Sz, false);
            java.lang.String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A04[4].charAt(22) == 'U') {
                    throw new java.lang.RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                java.lang.String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    A02 = A04(str2, i2, i);
                    java.lang.String str3 = c1040Sv.A08;
                    if (A04[0].charAt(7) == 'l') {
                        A04[5] = "mvVz";
                        A0B(str3, A02);
                        return A02;
                    }
                    A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
                    A0B(str3, A02);
                    return A02;
                }
            }
            A02 = A02(t8, c1040Sv, str);
            java.lang.String str32 = c1040Sv.A08;
            if (A04[0].charAt(7) == 'l') {
            }
        } else {
            com.facebook.ads.redexgen.core.T0.A04(t8, c1044Sz, true);
            try {
                if (A0D(i2, i)) {
                    decodeFile = com.facebook.ads.redexgen.core.T2.A02(file.getCanonicalPath(), i2, i, this.A00);
                } else {
                    java.lang.String url4 = file.getCanonicalPath();
                    decodeFile = android.graphics.BitmapFactory.decodeFile(url4);
                }
                java.lang.String url5 = c1040Sv.A08;
                A0B(url5, decodeFile);
                return decodeFile;
            } catch (java.io.IOException e) {
                A0C(e);
                return null;
            }
        }
    }

    private android.graphics.Bitmap A03(java.lang.String str) {
        byte[] A72;
        com.facebook.ads.redexgen.core.InterfaceC1586fu AGw = com.facebook.ads.redexgen.core.C1605gD.A00(this.A00).AGw(str, new com.facebook.ads.redexgen.core.C1601g9());
        if (AGw == null || (A72 = AGw.A72()) == null) {
            return null;
        }
        int length = A72.length;
        if (A04[4].charAt(22) == 'U') {
            throw new java.lang.RuntimeException();
        }
        A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return android.graphics.BitmapFactory.decodeByteArray(A72, 0, length);
    }

    private android.graphics.Bitmap A04(java.lang.String str, int i, int i2) {
        android.graphics.Bitmap decodeStream;
        int A00;
        try {
            boolean A0D = A0D(i, i2);
            java.lang.String A08 = A08(232, 7, 112);
            if (A0D) {
                decodeStream = com.facebook.ads.redexgen.core.T2.A02(str.substring(A08.length()), i, i2, this.A00);
            } else {
                decodeStream = android.graphics.BitmapFactory.decodeStream(new java.io.FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (java.io.IOException e) {
            android.util.Log.e(A05, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A11(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private android.graphics.Bitmap A05(java.lang.String str, int i, int i2) throws java.io.IOException {
        java.net.URL urlObj = new java.net.URL(str);
        java.net.HttpURLConnection connection = (java.net.HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        java.io.InputStream inputStream = connection.getInputStream();
        android.graphics.Bitmap A01 = com.facebook.ads.redexgen.core.T2.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static com.facebook.ads.redexgen.core.C1043Sy A06(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (A06 == null) {
            synchronized (com.facebook.ads.redexgen.core.C1043Sy.class) {
                if (A06 == null) {
                    A06 = new com.facebook.ads.redexgen.core.C1043Sy(c1632ge);
                }
            }
        }
        return A06;
    }

    public static java.io.File A07(com.facebook.ads.redexgen.core.T8 t8) {
        return t8.getCacheDir();
    }

    public static void A0A(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    private void A0B(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, java.lang.Float.valueOf(width));
            }
        }
    }

    private void A0C(java.lang.Throwable th) {
        java.lang.String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().ABC(A08, com.facebook.ads.redexgen.core.AbstractC1048Td.A1f, new com.facebook.ads.redexgen.core.C1049Te(th));
        } else {
            this.A00.A08().ABC(A08, com.facebook.ads.redexgen.core.AbstractC1048Td.A1f, new com.facebook.ads.redexgen.core.C1049Te(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public final float A0E(java.lang.String str) {
        if (this.A01.containsKey(str) && this.A01.get(str) != null) {
            return this.A01.get(str).floatValue();
        }
        if (A04[6].length() == 28) {
            throw new java.lang.RuntimeException();
        }
        A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
        return -1.0f;
    }

    public final android.graphics.Bitmap A0F(com.facebook.ads.redexgen.core.C1040Sv c1040Sv) {
        return A01(this.A00, c1040Sv, c1040Sv.A05, c1040Sv.A04, c1040Sv.A02);
    }

    public final android.graphics.Bitmap A0G(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, int i, int i2, java.lang.String str2) {
        com.facebook.ads.redexgen.core.C1040Sv c1040Sv = this.A02.get(str);
        return (!com.facebook.ads.redexgen.core.T0.A06(t8) || c1040Sv == null) ? A01(t8, new com.facebook.ads.redexgen.core.C1040Sv(str, i, i2, A08(270, 7, 28), A08(270, 7, 28)), i2, i, str2) : A01(t8, c1040Sv, i2, i, str2);
    }

    public final java.io.File A0H(java.lang.String str) {
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final java.lang.String A0I(java.lang.String str) {
        java.io.File file = new java.io.File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
