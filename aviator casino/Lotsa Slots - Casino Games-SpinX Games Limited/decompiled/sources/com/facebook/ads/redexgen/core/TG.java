package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class TG<T> extends android.os.AsyncTask<java.lang.Void, java.lang.Void, T> {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.TJ A00;
    public final com.facebook.ads.redexgen.core.C1632ge A01;
    public final com.facebook.ads.redexgen.core.TK<T> A02;
    public final com.facebook.ads.redexgen.core.UO<T> A03;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, com.google.common.base.Ascii.NAK, 2, 3, 2, com.google.common.base.Ascii.DC4, 6};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TK != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public TG(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.TK<T> tk, com.facebook.ads.redexgen.core.UO<T> uo) {
        this.A02 = tk;
        this.A03 = uo;
        this.A01 = c1632ge;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    private final T A00(java.lang.Void... voidArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        T t = null;
        try {
            try {
                t = this.A02.A03();
                this.A00 = this.A02.A00();
                return t;
            } catch (java.lang.Exception e) {
                this.A01.A08().ABC(A01(0, 8, 89), com.facebook.ads.redexgen.core.AbstractC1048Td.A0w, new com.facebook.ads.redexgen.core.C1049Te(e));
                this.A00 = com.facebook.ads.redexgen.core.TJ.A08;
                return t;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Void[] voidArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final void onPostExecute(T result) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(result);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
