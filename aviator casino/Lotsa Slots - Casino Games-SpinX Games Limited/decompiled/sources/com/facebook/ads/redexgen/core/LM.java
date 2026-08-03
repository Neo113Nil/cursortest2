package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class LM extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap[]> implements com.facebook.ads.redexgen.core.T4 {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"", "", "tk2ciTRcvMIsX7PNNAsbqXfz4cjsZNd3", "5z01THRYCfHu8Ay0wH5meUoLhFHMZyns", "VYXg8wObxMc7BeMRrzz5UEer", "1KBjMNFbEleLBxdQS2J3kw1LUfJ9GnIf", "PvEnCL5gthOso5MBRjJGXOGrZMhqPY73", "dw8jODS3DySi5ymezTFU6bMU1A3tjNXQ"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.InterfaceC1292b8 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1289b5> A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1636gi> A07;
    public final java.lang.ref.WeakReference<android.widget.ImageView> A08;
    public final java.lang.ref.WeakReference<android.view.ViewGroup> A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{45, 47, 36, 47, 56, 35, 41};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final android.graphics.Bitmap[] A03(java.lang.String... strArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        if (A0B[2].charAt(8) == 'z') {
            throw new java.lang.RuntimeException();
        }
        A0B[2] = "Jzd8uX0XYQJZtrGuhrAJ2cBOXObB1Sdn";
        try {
            java.lang.String str = strArr[0];
            android.graphics.Bitmap bitmap = null;
            android.graphics.Bitmap bitmap2 = null;
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A07.get();
            java.lang.String[] strArr2 = A0B;
            if (strArr2[6].charAt(7) == strArr2[5].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            A0B[2] = "bv0UYUwFwYp94NQ105UqaFrunwxSHAuK";
            if (c1636gi == null) {
                return new android.graphics.Bitmap[]{null, null};
            }
            try {
                bitmap = new com.facebook.ads.redexgen.core.C1042Sx(c1636gi).A0O(str, this.A00, this.A01);
                if (bitmap != null && !this.A03) {
                    bitmap2 = com.facebook.ads.redexgen.core.YL.A01(c1636gi, bitmap, this.A04, this.A05);
                }
            } catch (java.lang.Throwable th) {
                c1636gi.A08().ABC(A00(0, 7, 30), com.facebook.ads.redexgen.core.AbstractC1048Td.A1V, new com.facebook.ads.redexgen.core.C1049Te(th));
            }
            return new android.graphics.Bitmap[]{bitmap, bitmap2};
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.WU.A00(th2, this);
            java.lang.String[] strArr3 = A0B;
            if (strArr3[7].charAt(9) == strArr3[3].charAt(9)) {
                return null;
            }
            A0B[2] = "caPrFgLZt2WaPlUZLvOtKYt7S4BN2jGU";
            return null;
        }
    }

    static {
        A01();
    }

    public LM(android.view.ViewGroup viewGroup, int i, int i2, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1636gi);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new java.lang.ref.WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public LM(android.view.ViewGroup viewGroup, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(viewGroup, 12, 16, c1636gi);
    }

    public LM(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1636gi);
        this.A06 = null;
        this.A08 = new java.lang.ref.WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public LM(com.facebook.ads.redexgen.core.C1289b5 c1289b5, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1636gi);
        this.A06 = new java.lang.ref.WeakReference<>(c1289b5);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(android.graphics.Bitmap[] bitmapArr) {
        com.facebook.ads.redexgen.core.C1289b5 c1289b5;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                android.widget.ImageView imageView = this.A08.get();
                if (bitmapArr[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(bitmapArr[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(bitmapArr[0]);
                }
            }
            if (this.A06 != null && (c1289b5 = this.A06.get()) != null) {
                c1289b5.setImage(bitmapArr[0], bitmapArr[1]);
            }
            if (this.A09 != null && this.A09.get() != null && bitmapArr[1] != null) {
                com.facebook.ads.redexgen.core.YB.A0V(this.A09.get(), new android.graphics.drawable.BitmapDrawable(this.A07.get().getResources(), bitmapArr[1]));
            }
            if (this.A02 != null) {
                this.A02.AE7(new com.facebook.ads.redexgen.core.C1291b7(bitmapArr[0]));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    public final com.facebook.ads.redexgen.core.LM A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final com.facebook.ads.redexgen.core.LM A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final com.facebook.ads.redexgen.core.LM A06(com.facebook.ads.redexgen.core.InterfaceC1292b8 interfaceC1292b8) {
        this.A02 = interfaceC1292b8;
        return this;
    }

    public final void A07(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (this.A02 != null) {
                this.A02.AE7(new com.facebook.ads.redexgen.core.C1291b7(null));
                return;
            }
            return;
        }
        executeOnExecutor(com.facebook.ads.redexgen.core.YG.A06, str);
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final com.facebook.ads.redexgen.core.C1636gi A6m() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ android.graphics.Bitmap[] doInBackground(java.lang.String[] strArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(android.graphics.Bitmap[] bitmapArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
