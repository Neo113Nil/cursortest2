package com.ironsource;

/* loaded from: classes5.dex */
class X5 implements java.util.concurrent.Callable<com.ironsource.C2984c5> {
    private static final java.lang.String d = "FileWorkerThread";
    private static final java.lang.String e = "X-Android-Protocols";
    private static final java.lang.String f = "http/1.1,h2";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C2966b5 f6071a;
    private final java.lang.String b;
    private long c;

    X5(com.ironsource.C2966b5 c2966b5, java.lang.String str, long j) {
        this.f6071a = c2966b5;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(bArr, str);
    }

    boolean a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.ironsource.C2984c5 call() {
        if (this.c == 0) {
            this.c = 1L;
        }
        com.ironsource.C2984c5 c2984c5 = null;
        for (int i = 0; i < this.c; i++) {
            c2984c5 = a(this.f6071a.e(), i, this.f6071a.a(), this.f6071a.c(), this.f6071a.f());
            int b = c2984c5.b();
            if (b != 1008 && b != 1009) {
                break;
            }
        }
        if (c2984c5 != null && c2984c5.a() != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.b);
            java.lang.String str = java.io.File.separator;
            sb.append(str);
            sb.append(this.f6071a.b().getName());
            java.lang.String sb2 = sb.toString();
            java.lang.String str2 = this.f6071a.d() + str + com.ironsource.Z3.E + this.f6071a.b().getName();
            try {
                if (a(c2984c5.a(), str2) == 0) {
                    c2984c5.a(1006);
                } else if (!a(str2, sb2)) {
                    c2984c5.a(1014);
                }
            } catch (java.io.FileNotFoundException e2) {
                com.ironsource.C3180n4.d().a(e2);
                c2984c5.a(1018);
            } catch (java.lang.Error e3) {
                com.ironsource.C3180n4.d().a(e3);
                if (!android.text.TextUtils.isEmpty(e3.getMessage())) {
                    com.ironsource.sdk.utils.Logger.i(d, e3.getMessage());
                }
                c2984c5.a(1019);
            } catch (java.lang.Exception e4) {
                com.ironsource.C3180n4.d().a(e4);
                if (!android.text.TextUtils.isEmpty(e4.getMessage())) {
                    com.ironsource.sdk.utils.Logger.i(d, e4.getMessage());
                }
                c2984c5.a(1009);
            }
        }
        return c2984c5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #6 {all -> 0x008b, blocks: (B:20:0x0084, B:21:0x0087, B:44:0x00bf, B:46:0x00c4), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #0 {all -> 0x0181, blocks: (B:92:0x017d, B:84:0x0185), top: B:91:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    com.ironsource.C2984c5 a(java.lang.String str, int i, int i2, int i3, boolean z) {
        java.net.HttpURLConnection httpURLConnection;
        com.ironsource.C2984c5 c2984c5 = new com.ironsource.C2984c5();
        if (android.text.TextUtils.isEmpty(str)) {
            c2984c5.a(str);
            c2984c5.a(1007);
            return c2984c5;
        }
        java.io.InputStream inputStream = null;
        java.lang.Object[] objArr = 0;
        java.io.InputStream inputStream2 = null;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        int i4 = 0;
        try {
            try {
                try {
                    try {
                        java.net.URL url = new java.net.URL(str);
                        url.toURI();
                        httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                    } catch (java.lang.Throwable th) {
                        com.ironsource.C3180n4.d().a(th);
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    }
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        if (z) {
                            try {
                                httpURLConnection.setRequestProperty(e, f);
                            } catch (java.lang.IllegalStateException e2) {
                                com.ironsource.C3180n4.d().a(e2);
                            }
                        }
                        httpURLConnection.setConnectTimeout(i2);
                        httpURLConnection.setReadTimeout(i3);
                        httpURLConnection.connect();
                        i4 = httpURLConnection.getResponseCode();
                    } catch (java.io.FileNotFoundException e3) {
                        e = e3;
                        com.ironsource.C3180n4.d().a(e);
                        i = 1018;
                        if (0 != 0) {
                            (objArr2 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    } catch (java.lang.Error e4) {
                        e = e4;
                        com.ironsource.C3180n4.d().a(e);
                        i4 = 1019;
                        if (!android.text.TextUtils.isEmpty(e.getMessage())) {
                            com.ironsource.sdk.utils.Logger.i(d, e.getMessage());
                        }
                        if (0 != 0) {
                            (objArr3 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i4);
                        return c2984c5;
                    } catch (java.net.MalformedURLException e5) {
                        e = e5;
                        com.ironsource.C3180n4.d().a(e);
                        i = 1004;
                        if (0 != 0) {
                            (objArr4 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    } catch (java.net.SocketTimeoutException e6) {
                        e = e6;
                        com.ironsource.C3180n4.d().a(e);
                        i = 1008;
                        if (0 != 0) {
                            (objArr5 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    } catch (java.net.URISyntaxException e7) {
                        e = e7;
                        com.ironsource.C3180n4.d().a(e);
                        i = 1010;
                        if (0 != 0) {
                            (objArr6 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        com.ironsource.C3180n4.d().a(e);
                        if (!android.text.TextUtils.isEmpty(e.getMessage())) {
                            com.ironsource.sdk.utils.Logger.i(d, e.getMessage());
                        }
                        i = 1009;
                        if (0 != 0) {
                            (objArr7 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c2984c5.a(str);
                        c2984c5.a(i);
                        return c2984c5;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Throwable th3) {
                            com.ironsource.C3180n4.d().a(th3);
                            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th3.toString());
                            c2984c5.a(str);
                            c2984c5.a(0);
                            throw th;
                        }
                    }
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                    c2984c5.a(str);
                    c2984c5.a(0);
                    throw th;
                }
            } catch (java.io.FileNotFoundException e9) {
                e = e9;
                httpURLConnection = null;
            } catch (java.lang.Error e10) {
                e = e10;
                httpURLConnection = null;
            } catch (java.net.MalformedURLException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (java.net.SocketTimeoutException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (java.net.URISyntaxException e13) {
                e = e13;
                httpURLConnection = null;
            } catch (java.lang.Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                if (0 != 0) {
                }
                if (0 != 0) {
                }
                c2984c5.a(str);
                c2984c5.a(0);
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            com.ironsource.C3180n4.d().a(th5);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th5.toString());
        }
        if (i4 >= 200 && i4 < 400) {
            inputStream2 = httpURLConnection.getInputStream();
            c2984c5.a(a(inputStream2));
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpURLConnection.disconnect();
            c2984c5.a(str);
            c2984c5.a(i4);
            return c2984c5;
        }
        com.ironsource.sdk.utils.Logger.i(d, " RESPONSE CODE: " + i4 + " URL: " + str + " ATTEMPT: " + i);
        i4 = 1011;
        if (inputStream2 != null) {
        }
        httpURLConnection.disconnect();
        c2984c5.a(str);
        c2984c5.a(i4);
        return c2984c5;
    }
}
