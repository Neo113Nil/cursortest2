package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/payair/hce/setAnimationCacheEnabled;", "", "<init>", "()V", "", "AlternateContactlessPaymentDataJson", "Lcom/payair/hce/setWebViewRenderProcessClient;", "writeReplace", "()Lcom/payair/hce/setWebViewRenderProcessClient;", "p0", "", "(Lcom/payair/hce/setWebViewRenderProcessClient;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setAnimationCacheEnabled {
    public static final com.payair.hce.setAnimationCacheEnabled INSTANCE = new com.payair.hce.setAnimationCacheEnabled();
    private static int values = 0;
    private static int writeReplace = 1;

    private setAnimationCacheEnabled() {
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        boolean z = false;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = (com.payair.hce.setWebViewRenderProcessClient) objArr[0];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setwebviewrenderprocessclient, "");
        try {
            java.io.FileOutputStream openFileOutput = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).openFileOutput("deviceKeys", 0);
            try {
                java.lang.String values2 = new com.payair.hce.IccPrivateKeyCrtComponentsJson().values(setwebviewrenderprocessclient);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values2, "");
                byte[] bytes = values2.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                openFileOutput.write(bytes);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(openFileOutput, null);
                int i = values;
                int i2 = i & 11;
                int i3 = i | 11;
                writeReplace = ((i2 & i3) + (i2 | i3)) % 128;
                int i4 = ((i & 76) + (i | 76)) - 1;
                writeReplace = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } finally {
            }
        } catch (java.lang.Exception unused) {
        }
        int i6 = writeReplace;
        int i7 = i6 & 39;
        int i8 = (i6 | 39) & (~i7);
        int i9 = i7 << 1;
        values = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.io.BufferedReader openFileInput;
        java.lang.Object values2;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = null;
        try {
            openFileInput = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).openFileInput("deviceKeys");
        } catch (java.lang.Exception unused) {
        }
        try {
            java.io.FileInputStream fileInputStream = openFileInput;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileInputStream, "");
            openFileInput = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream, kotlin.text.Charsets.UTF_8), 8192);
            try {
                java.lang.reflect.Type type = new com.payair.hce.setAnimationCacheEnabled.values().AlternateContactlessPaymentDataJson;
                com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = new com.payair.hce.IccPrivateKeyCrtComponentsJson();
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(openFileInput);
                if (readText == null) {
                    int i = values;
                    int i2 = i & 49;
                    int i3 = -(-((i ^ 49) | i2));
                    int i4 = ((i2 & i3) + (i3 | i2)) % 128;
                    writeReplace = i4;
                    int i5 = i4 | 87;
                    int i6 = i5 << 1;
                    int i7 = -(i5 & (~(i4 & 87)));
                    values = ((i6 & i7) + (i7 | i6)) % 128;
                    values2 = null;
                } else {
                    values2 = iccPrivateKeyCrtComponentsJson.values(new java.io.StringReader(readText), type);
                    int i8 = writeReplace;
                    int i9 = i8 & 29;
                    int i10 = (i8 ^ 29) | i9;
                    values = ((i9 & i10) + (i10 | i9)) % 128;
                }
                com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient2 = (com.payair.hce.setWebViewRenderProcessClient) values2;
                kotlin.io.CloseableKt.closeFinally(openFileInput, null);
                int i11 = writeReplace;
                int i12 = i11 & 105;
                int i13 = (i11 ^ 105) | i12;
                values = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                kotlin.io.CloseableKt.closeFinally(openFileInput, null);
                int i14 = values;
                int i15 = i14 ^ 11;
                int i16 = -(-((i14 & 11) << 1));
                int i17 = ((i15 & i16) + (i16 | i15)) % 128;
                writeReplace = i17;
                values = (i17 + 5) % 128;
                int i18 = i17 & 51;
                int i19 = (i17 | 51) & (~i18);
                int i20 = i18 << 1;
                values = ((i19 ^ i20) + ((i20 & i19) << 1)) % 128;
                setwebviewrenderprocessclient = setwebviewrenderprocessclient2;
                writeReplace = (values + 97) % 128;
                return setwebviewrenderprocessclient;
            } finally {
            }
        } finally {
        }
    }

    public static final class values extends com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<com.payair.hce.setWebViewRenderProcessClient> {
        values() {
        }
    }

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 46) + (i2 * 46) + (((~(i4 | i5)) | i) * (-90)) + (((~(i2 | i)) | (~(i4 | i3))) * (-45)) + (((~((~i) | i3)) | i4 | (~(i | i5))) * 45);
        if (i6 == 1) {
            return valueOf(objArr);
        }
        if (i6 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int i7 = values;
        int i8 = i7 & 83;
        writeReplace = (((i7 | 83) & (~i8)) + (i8 << 1)) % 128;
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).deleteFile("deviceKeys");
        int i9 = writeReplace;
        values = ((i9 & 13) + (i9 | 13)) % 128;
        return null;
    }

    static {
        int i = values;
        int i2 = ((i ^ 56) + ((i & 56) << 1)) - 1;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile(new java.lang.Object[0], -2131569121, 2131569121, (int) java.lang.System.currentTimeMillis());
    }

    public static com.payair.hce.setWebViewRenderProcessClient writeReplace() {
        return (com.payair.hce.setWebViewRenderProcessClient) DigitizedCardProfile(new java.lang.Object[0], 1296974089, -1296974087, (int) java.lang.System.currentTimeMillis());
    }

    public static boolean AlternateContactlessPaymentDataJson(com.payair.hce.setWebViewRenderProcessClient p0) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{p0}, -466192293, 466192294, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }
}
