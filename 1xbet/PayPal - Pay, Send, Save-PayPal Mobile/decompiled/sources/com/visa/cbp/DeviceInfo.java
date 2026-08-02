package com.visa.cbp;

/* loaded from: classes16.dex */
public final class DeviceInfo {
    public static final boolean BuildConfig = false;
    public static final java.lang.String ConfirmReplenishRequest = "SBX";
    public static final java.lang.String ReplenishAckRequest = "release";
    public static final java.lang.String getTokenInfo = "6.4.0";
    public static final java.lang.String setTokenInfo = "HCE_SDK";
    public static final java.lang.String valueOf = "original";
    public static final java.lang.String values = "com.visa.cbp.sdk.dasservice";

    class DeviceIDType {
        static com.visa.cbp.DeviceInfo.DeviceIDType getHighSpeedVideoSizes;

        DeviceIDType() {
        }

        public static com.visa.cbp.DeviceInfo.DeviceIDType getHighSpeedVideoFpsRanges() {
            if (getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes = new com.visa.cbp.DeviceInfo.DeviceIDType();
            }
            return getHighSpeedVideoSizes;
        }

        public void getHighSpeedVideoFpsRangesFor(boolean z, android.nfc.NfcAdapter nfcAdapter, android.app.Activity activity) throws java.lang.IllegalArgumentException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
            final android.nfc.Tag[] tagArr = new android.nfc.Tag[1];
            if (z) {
                nfcAdapter.enableReaderMode(activity, new android.nfc.NfcAdapter.ReaderCallback() { // from class: com.visa.cbp.DeviceInfo.DeviceIDType.3
                    @Override // android.nfc.NfcAdapter.ReaderCallback
                    public void onTagDiscovered(android.nfc.Tag tag) {
                        try {
                            tagArr[0] = tag;
                            com.visa.cbp.getName.ReplenishAckRequest().BuildConfig(tag);
                        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException | java.lang.IllegalArgumentException unused) {
                            com.visa.cbp.getName.ReplenishAckRequest().stopReader();
                        }
                    }
                }, 3, null);
            } else {
                nfcAdapter.disableReaderMode(activity);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class DeviceType {
        public static com.visa.cbp.DeviceInfo.DeviceType.ConfirmReplenishRequest BuildConfig = new com.visa.cbp.DeviceInfo.DeviceType.ConfirmReplenishRequest();
        private static boolean getHighResolutionOutputSizeshNQ4ISI = false;

        public static class ConfirmReplenishRequest {
            com.visa.cbp.setWidth Camera2StreamConfigurationMap;
            public boolean values = false;
            public boolean ReplenishAckRequest = false;
            public int BuildConfig = 1;
            public int valueOf = 1;
        }

        public static void valueOf(android.content.Context context, com.visa.cbp.setWidth setwidth, android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            BuildConfig.Camera2StreamConfigurationMap = setwidth;
            for (int i3 = i + 1; i3 <= i2; i3++) {
                getHighSpeedVideoFpsRangesFor(context, sQLiteDatabase, i3);
            }
            BuildConfig.values = true;
            BuildConfig.valueOf = i2;
            BuildConfig.BuildConfig = i;
        }

        public static void ReplenishAckRequest(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.visa.cbp.setWidth setwidth, int i, int i2) {
            for (int i3 = i; i3 < i2; i3--) {
                getHighSpeedVideoFpsRanges(sQLiteDatabase, i3);
            }
            BuildConfig.Camera2StreamConfigurationMap = setwidth;
            BuildConfig.ReplenishAckRequest = true;
            BuildConfig.valueOf = i2;
            BuildConfig.BuildConfig = i;
        }

        private static void getHighSpeedVideoFpsRangesFor(android.content.Context context, android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
            switch (i) {
                case 6:
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN token_par TEXT ");
                    break;
                case 7:
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN CVMPriorityList TEXT DEFAULT 'OCS'");
                    break;
                case 8:
                    getHighResolutionOutputSizeshNQ4ISI = true;
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN token_reperso_status INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN sdk_enable_payment INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN deviceKeyID TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN deviceId TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN deviceIDType TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN dasEnrollDevice INTEGER DEFAULT 0");
                    break;
                case 9:
                    if (!getHighResolutionOutputSizeshNQ4ISI) {
                        sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN token_reperso_status INTEGER DEFAULT 6");
                        break;
                    }
                    break;
                case 10:
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN x_via_hint_header TEXT");
                    break;
                case 11:
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN customTransit INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_settings ADD COLUMN offlinePayment INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN dynamic_key_offline BLOB");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN icc_priv_key_offline BLOB");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN icc_aes_key_offline BLOB");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN isVdtToken INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE tbl_enhanced_token_info ADD COLUMN icc_priv_key_size INTEGER DEFAULT 128");
                    break;
            }
        }

        private static void getHighSpeedVideoFpsRanges(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
            throw new java.lang.UnsupportedOperationException(" SDK downgrade is not supported");
        }
    }
}
