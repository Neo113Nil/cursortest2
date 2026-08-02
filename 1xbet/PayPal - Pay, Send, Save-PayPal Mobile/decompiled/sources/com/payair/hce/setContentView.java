package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentView extends com.payair.hce.onOptionsItemSelected {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public setContentView(java.net.URL url, com.payair.hce.component6 component6Var, int i, java.util.List<java.lang.String> list, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws com.payair.hce.component5 {
        super(url, component6Var, i, list, hashMap);
        this.writeReplace = (java.net.HttpURLConnection) valueOf(new java.lang.Object[]{this, url}, 356019906, -356019906, java.lang.System.identityHashCode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.net.HttpURLConnection httpURLConnection;
        int i;
        com.payair.hce.setContentView setcontentview = (com.payair.hce.setContentView) objArr[0];
        java.net.URL url = (java.net.URL) objArr[1];
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = ((i2 | 59) << 1) - ((i2 & (-60)) | ((~i2) & 59));
        valueOf = i3 % 128;
        try {
            try {
            } catch (java.io.IOException e) {
                e = e;
                url = 0;
                e.printStackTrace();
                httpURLConnection = url;
                i = AlternateContactlessPaymentDataJson + 113;
                valueOf = i % 128;
                if (i % 2 == 0) {
                }
            }
        } catch (java.io.IOException e2) {
            e = e2;
            e.printStackTrace();
            httpURLConnection = url;
            i = AlternateContactlessPaymentDataJson + 113;
            valueOf = i % 128;
            if (i % 2 == 0) {
            }
        }
        if (i3 % 2 != 0) {
            setcontentview.AlternateContactlessPaymentDataJson((java.net.HttpURLConnection) url.openConnection());
            throw new java.lang.ArithmeticException();
        }
        java.net.HttpURLConnection AlternateContactlessPaymentDataJson2 = setcontentview.AlternateContactlessPaymentDataJson((java.net.HttpURLConnection) url.openConnection());
        AlternateContactlessPaymentDataJson = (valueOf + 99) % 128;
        httpURLConnection = AlternateContactlessPaymentDataJson2;
        i = AlternateContactlessPaymentDataJson + 113;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    @Override // com.payair.hce.onOptionsItemSelected
    final java.net.HttpURLConnection DigitizedCardProfile(java.net.URL url) {
        return (java.net.HttpURLConnection) valueOf(new java.lang.Object[]{this, url}, 356019906, -356019906, java.lang.System.identityHashCode(this));
    }
}
