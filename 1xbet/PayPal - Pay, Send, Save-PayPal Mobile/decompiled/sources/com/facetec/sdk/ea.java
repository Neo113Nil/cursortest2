package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ea {
    private static /* synthetic */ boolean l = true;
    private static int m = 10000;

    /* renamed from: a, reason: collision with root package name */
    public final android.nfc.NfcAdapter f3539a;
    private android.nfc.tech.IsoDep c;
    public java.lang.String d;
    public final java.lang.ref.WeakReference<android.app.Activity> e;
    private com.facetec.sdk.ea.e f;
    private java.lang.String g;
    private final boolean j;
    private java.lang.Exception b = null;
    private com.facetec.sdk.eh h = null;
    private java.lang.String i = "";

    public interface d {
        void b(com.facetec.sdk.eh ehVar, java.lang.String str);

        void d(com.facetec.sdk.ea.b bVar);
    }

    final native java.lang.String nativeStartReading(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z);

    final native java.lang.String nativeStartReadingWithKey(java.lang.String str, java.lang.String str2, boolean z);

    final native void nativeUpdateErrorHistory(java.lang.String str, java.lang.String str2);

    public static com.facetec.sdk.ea b(android.app.Activity activity, boolean z, boolean z2) {
        android.nfc.NfcAdapter c = c(activity);
        if (c == null) {
            return null;
        }
        if (z2) {
            m = 60000;
        }
        return new com.facetec.sdk.ea(c, activity, z);
    }

    public static boolean e(android.app.Activity activity) {
        return androidx.core.content.ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && c(activity) != null;
    }

    public static boolean b(android.app.Activity activity) {
        android.nfc.NfcAdapter c;
        return androidx.core.content.ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && (c = c(activity)) != null && c.isEnabled();
    }

    private static android.nfc.NfcAdapter c(android.app.Activity activity) {
        android.nfc.NfcManager nfcManager = (android.nfc.NfcManager) activity.getSystemService("nfc");
        if (nfcManager == null) {
            return null;
        }
        return nfcManager.getDefaultAdapter();
    }

    private ea(android.nfc.NfcAdapter nfcAdapter, android.app.Activity activity, boolean z) {
        this.f3539a = nfcAdapter;
        this.e = new java.lang.ref.WeakReference<>(activity);
        this.j = z;
    }

    public static int e() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return 167772160;
        }
        return androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.facetec.sdk.ea.d dVar, com.facetec.sdk.eh ehVar) {
        dVar.b(ehVar, this.i);
    }

    public final boolean a(android.content.Intent intent, final com.facetec.sdk.ea.d dVar) {
        if (!"android.nfc.action.TECH_DISCOVERED".equals(intent.getAction())) {
            return false;
        }
        this.c = android.nfc.tech.IsoDep.get((android.nfc.Tag) intent.getExtras().getParcelable("android.nfc.extra.TAG"));
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.facetec.sdk.ea$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ea.this.b(dVar);
            }
        }).start();
        return true;
    }

    public final void c() {
        android.app.Activity activity = this.e.get();
        if (activity != null) {
            this.f3539a.disableForegroundDispatch(activity);
        }
    }

    final byte[] sendCommand(byte[] bArr) throws java.io.IOException {
        this.b = null;
        try {
            if (!this.c.isConnected()) {
                this.c.connect();
            }
            return this.c.transceive(bArr);
        } catch (java.io.IOException e2) {
            if (m <= 10000) {
                m = 20000;
            }
            this.b = e2;
            throw e2;
        }
    }

    final void setNativeError(int i, java.lang.String str) {
        this.i = str;
        switch (i) {
            case 1:
                this.h = com.facetec.sdk.eh.Unknown;
                return;
            case 2:
                this.h = com.facetec.sdk.eh.InvalidMrzKey;
                return;
            case 3:
                this.h = com.facetec.sdk.eh.ResponseError;
                return;
            case 4:
                this.h = com.facetec.sdk.eh.UnknownRetry;
                return;
            case 5:
                this.h = com.facetec.sdk.eh.IncompatibleDoc;
                return;
            case 6:
                this.h = com.facetec.sdk.eh.ConnectionError;
                return;
            default:
                if (!l) {
                    throw new java.lang.AssertionError();
                }
                this.h = com.facetec.sdk.eh.Unknown;
                return;
        }
    }

    public static final class b {
        public final org.json.JSONObject c;

        public b(org.json.JSONObject jSONObject) {
            this.c = jSONObject;
        }
    }

    public static class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* renamed from: a, reason: collision with root package name */
        private static int f3540a;
        private static int c;
        public final java.lang.String b;
        public final java.lang.String d;
        public final java.lang.String e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void f(byte b, short s, byte b2, java.lang.Object[] objArr) {
            int i;
            byte[] bArr = $$a;
            int i2 = 101 - (b * 2);
            int i3 = 20 - (b2 * 17);
            int i4 = 18 - (s * 17);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i5 = i2;
                i2 = i4;
                i = 0;
                i2 = i2 + (-i5) + 3;
                i3++;
                bArr2[i] = (byte) i2;
                i++;
                if (i == i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i5 = bArr[i3];
                i2 = i2 + (-i5) + 3;
                i3++;
                bArr2[i] = (byte) i2;
                i++;
                if (i == i4) {
                }
            } else {
                i = 0;
                i3++;
                bArr2[i] = (byte) i2;
                i++;
                if (i == i4) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{57, -76, -24, 116, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
        }

        public static void a(long j, long j2) {
            int i = c;
            f3540a = ((i ^ 99) + ((i & 99) << 1)) % 128;
            java.lang.Object obj = com.facetec.sdk.by.e.class.getField("c").get(null);
            int i2 = f3540a;
            int i3 = i2 & 23;
            int i4 = -(-((i2 ^ 23) | i3));
            int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            c = i5;
            int i6 = ((i5 ^ 61) | (i5 & 61)) << 1;
            int i7 = -(((~i5) & 61) | (i5 & (-62)));
            f3540a = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            try {
                byte[] bArr = $$a;
                byte b = bArr[9];
                java.lang.Object[] objArr = new java.lang.Object[1];
                f(b, (byte) (b - 1), b, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b2 = bArr[9];
                byte b3 = (byte) (b2 - 1);
                byte b4 = b2;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                f(b3, b4, (byte) (b4 - 1), objArr2);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, null, obj);
                int i8 = c;
                int i9 = i8 & 65;
                f3540a = (i9 + ((i8 ^ 65) | i9)) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static {
            init$0();
            f3540a = 0;
            c = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final com.facetec.sdk.ea.d dVar) {
        final com.facetec.sdk.eh ehVar;
        java.lang.String str;
        java.lang.String nativeStartReading;
        android.app.Activity activity = this.e.get();
        if (activity != null) {
            this.b = null;
            this.h = null;
            this.i = "";
            this.c.setTimeout(m);
            try {
                java.lang.String str2 = this.d;
                if (str2 != null && !str2.isEmpty()) {
                    nativeStartReading = nativeStartReadingWithKey(this.d, this.g, this.j);
                } else {
                    nativeStartReading = nativeStartReading(this.f.d, this.f.e, this.f.b, this.g, this.j);
                }
            } catch (java.lang.Throwable unused) {
                ehVar = com.facetec.sdk.eh.Unknown;
            }
            if (nativeStartReading != null) {
                final com.facetec.sdk.ea.b bVar = new com.facetec.sdk.ea.b(new org.json.JSONObject(nativeStartReading));
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.ea$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.ea.d.this.d(bVar);
                    }
                });
                return;
            }
            if (this.b != null) {
                ehVar = com.facetec.sdk.eh.ConnectionError;
            } else {
                ehVar = this.h;
                if (ehVar == null) {
                    ehVar = com.facetec.sdk.eh.Unknown;
                }
            }
            int i = com.facetec.sdk.eh.AnonymousClass3.d[ehVar.ordinal()];
            if (i == 2) {
                str = "InvalidMrzKey";
            } else if (i == 3) {
                str = "ResponseError";
            } else if (i == 4) {
                str = "ConnectionError";
            } else if (i == 5) {
                str = "UnknownRetry";
            } else if (i != 6) {
                str = "Unknown";
            } else {
                str = "IncompatibleDoc";
            }
            nativeUpdateErrorHistory(str, this.i);
            activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.ea$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ea.this.c(dVar, ehVar);
                }
            });
        }
    }
}
