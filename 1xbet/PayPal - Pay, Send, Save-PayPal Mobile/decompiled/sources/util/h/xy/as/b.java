package util.h.xy.as;

/* loaded from: classes18.dex */
public class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    static {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25114(java.net.URL url, java.io.File file, java.lang.String str) throws util.h.xy.as.ma {
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.util.zip.GZIPInputStream gZIPInputStream;
        ?? r7;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 19) + ((i & 19) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2 == 0 ? 5 : 3;
        boolean z = false;
        byte[] bArr = null;
        while (!z) {
            int i4 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i4 ^ 57) + ((i4 & 57) << 1)) % 128;
            if (i3 > 0) {
                try {
                    bArr = getHighSpeedVideoFpsRangesFor(url, str);
                    z = true;
                } catch (util.h.xy.as.ma e) {
                    if (e.m25115() == -7) {
                        throw e;
                    }
                    if (e.m25115() == -4) {
                        throw e;
                    }
                    i3--;
                    try {
                        java.lang.Thread.sleep(15000L);
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i5 = ~((~identityHashCode) | 1755882149);
                        int i6 = ((i5 ^ 1153134806) | (i5 & 1153134806)) * (-235);
                        int i7 = (i6 ^ (-110712654)) + ((i6 & (-110712654)) << 1);
                        int i8 = ~((identityHashCode ^ 1755882149) | (1755882149 & identityHashCode));
                        int i9 = -(-(((i8 ^ 1153134806) | (i8 & 1153134806)) * (-470)));
                        int i10 = (i7 ^ i9) + ((i9 & i7) << 1);
                        int i11 = ~(identityHashCode | 1824256759);
                        int i12 = -(-(((i11 ^ 1084760196) | (i11 & 1084760196)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i13 = (((identityHashCode2 ^ 497275231) | (identityHashCode2 & 497275231)) * 140) - 1909347885;
                        int i14 = ~identityHashCode2;
                        int i15 = ~((i14 & 497275231) | (497275231 ^ i14));
                        int i16 = ((i15 & 537659520) | (i15 ^ 537659520)) * (-280);
                        int i17 = ~(i14 | 604899532);
                        int i18 = (i17 & 430035219) | (i17 ^ 430035219);
                        int i19 = ~((identityHashCode2 & (-537659521)) | (identityHashCode2 ^ (-537659521)));
                        if (((i10 | i12) << 1) - (i12 ^ i10) > ((((i13 | i16) << 1) - (i16 ^ i13)) - (~(((i19 ^ i18) | (i19 & i18)) * 140))) - 1) {
                            int i20 = 2 / 4;
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                    if (i3 == 0) {
                        int i21 = getHighSpeedVideoSizes;
                        Camera2StreamConfigurationMap = (((i21 | 19) << 1) - (i21 ^ 19)) % 128;
                        e.getMessage();
                        throw e;
                    }
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 47) % 128;
                }
            }
        }
        try {
            byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            } catch (java.io.IOException e2) {
                e = e2;
                gZIPInputStream = null;
                r7 = gZIPInputStream;
                throw new util.h.xy.as.ma(-5, e.getMessage(), e);
            } catch (java.lang.Throwable th) {
                th = th;
                gZIPInputStream = null;
                r7 = gZIPInputStream;
                if (byteArrayInputStream != null) {
                }
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 57) % 128;
                if (gZIPInputStream != null) {
                }
                if (r7 != 0) {
                }
            }
        } catch (java.io.IOException e3) {
            e = e3;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            r7 = new java.io.FileOutputStream(file);
            while (true) {
                try {
                    try {
                        int read = gZIPInputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        int i22 = Camera2StreamConfigurationMap + 105;
                        getHighSpeedVideoSizes = i22 % 128;
                        if (i22 % 2 == 0) {
                            r7.write(bArr2, 1, read);
                        } else {
                            r7.write(bArr2, 0, read);
                        }
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 9) % 128;
                    } catch (java.io.IOException e4) {
                        e = e4;
                        throw new util.h.xy.as.ma(-5, e.getMessage(), e);
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (java.io.IOException unused2) {
                            if (gZIPInputStream != null) {
                                int i23 = getHighSpeedVideoSizes;
                                int i24 = ((i23 | 71) << 1) - (i23 ^ 71);
                                Camera2StreamConfigurationMap = i24 % 128;
                                try {
                                    if (i24 % 2 != 0) {
                                        gZIPInputStream.close();
                                        throw null;
                                    }
                                    gZIPInputStream.close();
                                    int i25 = getHighSpeedVideoSizes;
                                    Camera2StreamConfigurationMap = ((i25 & 53) + (i25 | 53)) % 128;
                                } catch (java.io.IOException unused3) {
                                }
                            }
                            if (r7 != 0) {
                                throw th;
                            }
                            int i26 = getHighSpeedVideoSizes;
                            Camera2StreamConfigurationMap = ((i26 ^ 17) + ((i26 & 17) << 1)) % 128;
                            try {
                                r7.close();
                                throw th;
                            } catch (java.io.IOException unused4) {
                                throw th;
                            }
                        }
                    }
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 57) % 128;
                    if (gZIPInputStream != null) {
                    }
                    if (r7 != 0) {
                    }
                }
            }
            r7.flush();
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 59) % 128;
            try {
                byteArrayInputStream.close();
            } catch (java.io.IOException unused5) {
            }
            int i27 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i27 ^ 25) + ((i27 & 25) << 1)) % 128;
            try {
                gZIPInputStream.close();
            } catch (java.io.IOException unused6) {
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 105) % 128;
            try {
                r7.close();
            } catch (java.io.IOException unused7) {
            }
        } catch (java.io.IOException e5) {
            e = e5;
            r7 = 0;
        } catch (java.lang.Throwable th4) {
            th = th4;
            r7 = 0;
            if (byteArrayInputStream != null) {
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 57) % 128;
            if (gZIPInputStream != null) {
            }
            if (r7 != 0) {
            }
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(java.net.URL url, java.lang.String str) throws util.h.xy.as.ma {
        java.util.zip.GZIPInputStream gZIPInputStream;
        byte[] highSpeedVideoFpsRanges;
        java.io.ByteArrayInputStream byteArrayInputStream;
        int i;
        java.io.ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(url);
                byteArrayInputStream = new java.io.ByteArrayInputStream(highSpeedVideoFpsRanges);
                try {
                    gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
                } catch (java.util.zip.ZipException e) {
                    e = e;
                } catch (java.io.IOException e2) {
                    e = e2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    gZIPInputStream = null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                if (!getHighSpeedVideoFpsRanges(gZIPInputStream, util.h.xy.bh.ma.m25468(str))) {
                    throw new util.h.xy.as.ma(-2, util.h.xy.al.ra.f713);
                }
                try {
                    byteArrayInputStream.close();
                    i = getHighSpeedVideoSizes + 105;
                    Camera2StreamConfigurationMap = i % 128;
                } catch (java.io.IOException unused) {
                }
                if (i % 2 == 0) {
                    gZIPInputStream.close();
                    int i2 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoSizes = ((i2 & 103) + (i2 | 103)) % 128;
                    int i3 = Camera2StreamConfigurationMap;
                    int i4 = ((i3 | 85) << 1) - (i3 ^ 85);
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 != 0) {
                        return highSpeedVideoFpsRanges;
                    }
                    throw new java.lang.ArithmeticException();
                }
                gZIPInputStream.close();
                throw new java.lang.NullPointerException();
            } catch (java.util.zip.ZipException e3) {
                e = e3;
                throw new util.h.xy.as.ma(-4, e.getMessage());
            } catch (java.io.IOException e4) {
                e = e4;
                throw new util.h.xy.as.ma(-8, e.getMessage());
            } catch (java.lang.Throwable th3) {
                th = th3;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                        int i5 = Camera2StreamConfigurationMap + 15;
                        getHighSpeedVideoSizes = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (java.io.IOException unused2) {
                        throw th;
                    }
                }
                if (gZIPInputStream != null) {
                    int i7 = getHighSpeedVideoSizes;
                    int i8 = (i7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i7 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    Camera2StreamConfigurationMap = i8 % 128;
                    if (i8 % 2 != 0) {
                        gZIPInputStream.close();
                        throw new java.lang.NullPointerException();
                    }
                    gZIPInputStream.close();
                }
                throw th;
            }
        } catch (java.util.zip.ZipException e5) {
            e = e5;
        } catch (java.io.IOException e6) {
            e = e6;
        } catch (java.lang.Throwable th4) {
            th = th4;
            gZIPInputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: IOException -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x00e8, blocks: (B:50:0x00cd, B:44:0x00da), top: B:49:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighSpeedVideoFpsRanges(java.net.URL url) throws util.h.xy.as.ma {
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection;
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        java.io.BufferedInputStream bufferedInputStream;
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 37) + (i | 37)) % 128;
        java.io.BufferedInputStream bufferedInputStream2 = null;
        try {
            httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setRequestProperty(util.h.xy.al.ra.f700, util.h.xy.al.ra.f743);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setRequestMethod(util.h.xy.al.ra.f752);
                bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getInputStream());
            } catch (java.io.FileNotFoundException e3) {
                e2 = e3;
            } catch (java.io.IOException e4) {
                e = e4;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (bufferedInputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
                int i2 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i2 & 87) + (i2 | 87)) % 128;
                throw th;
            }
        } catch (java.io.FileNotFoundException e5) {
            e2 = e5;
            httpURLConnection = null;
        } catch (java.io.IOException e6) {
            e = e6;
            httpURLConnection = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 47) % 128;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i3 = Camera2StreamConfigurationMap + 79;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                bufferedInputStream.close();
                throw null;
            }
            bufferedInputStream.close();
            if (httpURLConnection != null) {
                int i4 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i4 & 49) + (i4 | 49)) % 128;
                httpURLConnection.disconnect();
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 95) % 128;
            return byteArray;
        } catch (java.io.FileNotFoundException e7) {
            e2 = e7;
            bufferedInputStream2 = bufferedInputStream;
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(util.h.xy.al.ra.f723);
                sb.append(e2.getMessage());
                throw new util.h.xy.as.ma(-7, sb.toString());
            } catch (java.lang.Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream2;
                httpURLConnection = httpURLConnection;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
                int i22 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i22 & 87) + (i22 | 87)) % 128;
                throw th;
            }
        } catch (java.io.IOException e8) {
            e = e8;
            bufferedInputStream2 = bufferedInputStream;
            try {
                throw new util.h.xy.as.ma(-1, e.getMessage(), e);
            } catch (java.lang.Throwable th5) {
                th = th5;
                bufferedInputStream = bufferedInputStream2;
                httpURLConnection = httpURLConnection;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 93) % 128;
                    } catch (java.io.IOException unused) {
                        throw th;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                int i222 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i222 & 87) + (i222 | 87)) % 128;
                throw th;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            httpURLConnection = httpURLConnection;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
            }
            if (httpURLConnection != null) {
            }
            int i2222 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2222 & 87) + (i2222 | 87)) % 128;
            throw th;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, byte[] bArr) {
        java.security.MessageDigest messageDigest;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 15) % 128;
        try {
            messageDigest = java.security.MessageDigest.getInstance(util.h.xy.al.ra.f781);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read <= 0) {
                    break;
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 111) % 128;
                messageDigest.update(bArr2, 0, read);
            }
        } catch (java.io.IOException unused) {
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
        if (!java.util.Arrays.equals(bArr, messageDigest.digest())) {
            int i = Camera2StreamConfigurationMap + 87;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return false;
        }
        int i2 = Camera2StreamConfigurationMap + 101;
        getHighSpeedVideoSizes = i2 % 128;
        return i2 % 2 != 0;
    }
}
