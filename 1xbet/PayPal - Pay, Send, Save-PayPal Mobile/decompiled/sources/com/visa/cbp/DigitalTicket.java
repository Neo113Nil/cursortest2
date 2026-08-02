package com.visa.cbp;

/* loaded from: classes5.dex */
public class DigitalTicket {
    private static final int Camera2StreamConfigurationMap = -1;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "DigitalTicket";
    private static final int getHighSpeedVideoFpsRanges = 11;
    private static com.visa.cbp.DigitalTicket getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private android.database.sqlite.SQLiteDatabase getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats = "CREATE TABLE tbl_enhanced_token_info (_id INTEGER PRIMARY KEY AUTOINCREMENT, vPanEnrollmentID TEXT, vProvisionedTokenID TEXT, token_requester_id TEXT, encryption_metadata TEXT, tokenStatus TEXT, payment_instrument_last4 TEXT, payment_instrument_expiration_month TEXT, payment_instrument_expiration_year TEXT, token_expirationDate_month TEXT, token_expirationDate_year TEXT, appPrgrmID TEXT, static_params TEXT, dynamic_key BLOB, mac_left_key BLOB, mac_right_key BLOB, enc_token_info BLOB, dynamic_dki TEXT, token_last4 TEXT, token_par TEXT, token_reperso_status INTEGER DEFAULT 6, dynamic_key_offline BLOB, icc_priv_key_offline BLOB, icc_aes_key_offline BLOB, isVdtToken INTEGER DEFAULT 0, oda_data TEXT, icc_priv_key BLOB, icc_priv_key_size INTEGER, pub_key_expiry INTEGER, token_type INTEGER, nic INTEGER, locate_sad_offset INTEGER, sdad_sfi INTEGER, sdad_rec INTEGER, sdad_offset INTEGER, sdad_length INTEGER, car_data_offset INTEGER, decimalized_crypto_data BLOB, bouncy_submarine BLOB, UNIQUE (vProvisionedTokenID) ON CONFLICT REPLACE);";
    private final java.lang.String getOutputMinFrameDuration;
    private final java.lang.String getOutputStallDurationlomOqCM;

    public static com.visa.cbp.DigitalTicket BuildConfig(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        com.visa.cbp.DigitalTicket valueOf;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            valueOf = valueOf(context, setwidth, 11);
        }
        return valueOf;
    }

    public static com.visa.cbp.DigitalTicket valueOf(android.content.Context context, com.visa.cbp.setWidth setwidth, int i) {
        com.visa.cbp.DigitalTicket digitalTicket;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                try {
                    getHighSpeedVideoFpsRangesFor = new com.visa.cbp.DigitalTicket(context, setwidth, i);
                } catch (java.lang.Exception unused) {
                    getHighSpeedVideoFpsRangesFor = null;
                }
            }
            digitalTicket = getHighSpeedVideoFpsRangesFor;
        }
        return digitalTicket;
    }

    private DigitalTicket(android.content.Context context, com.visa.cbp.setWidth setwidth, int i) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CREATE TABLE tbl_settings (_id INTEGER PRIMARY KEY, access_token_adv_warning_percent INTEGER, access_token_adv_warning_time INTEGER, check_status_period INTEGER DEFAULT 86400000, select_card INTEGER DEFAULT -1, cvm_entity TEXT, cvm_type TEXT, cvm_verified INTEGER, end_point TEXT, environment TEXT, thm_enabled INTEGER, bouncy_airplane BLOB, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setEncryptionMetaData);
        sb.append(" BLOB, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setSignature);
        sb.append(" BLOB, device_id BLOB, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.Signature);
        sb.append(" TEXT, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerApplicationDiscretionaryData);
        sb.append(" TEXT, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.AidInfo);
        sb.append(" TEXT, ");
        sb.append(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setMac);
        sb.append(" TEXT, max_tvl INTEGER DEFAULT 100, CVMPriorityList TEXT DEFAULT 'OCS', sdk_enable_payment INTEGER DEFAULT 0, deviceKeyID TEXT, deviceId TEXT, deviceIDType TEXT, dasEnrollDevice INTEGER DEFAULT 0, x_via_hint_header TEXT, customTransit INTEGER DEFAULT 0, offlinePayment INTEGER DEFAULT 0);");
        this.getHighSpeedVideoSizes = sb.toString();
        this.getOutputStallDurationlomOqCM = "CREATE TABLE tbl_data_group(_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, token_key INTEGER, dgi TEXT NOT NULL, dgi_data BLOB NOT NULL, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE, UNIQUE (token_key,dgi) ON CONFLICT REPLACE);";
        this.getInputFormats = "CREATE TABLE tbl_tvl (_id INTEGER PRIMARY KEY AUTOINCREMENT, token_key INTEGER, timestamp NUMERIC, unpredictable_number TEXT, atc INTEGER, transaction_type TEXT, api TEXT, cryptogram TEXT, UNIQUE (atc,token_key) ON CONFLICT REPLACE, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE );";
        this.getOutputMinFrameDuration = "PRAGMA foreign_keys=ON;";
        this.getInputSizeshNQ4ISI = "cbp_april.db";
        this.getHighSpeedVideoSizesFor = new com.visa.cbp.DigitalTicket.ReplenishAckRequest(context, setwidth, "cbp_april.db", null, i).getWritableDatabase();
    }

    public void values() {
        try {
            this.getHighSpeedVideoSizesFor.close();
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizesFor = null;
            getHighSpeedVideoFpsRangesFor = null;
            throw th;
        }
        this.getHighSpeedVideoSizesFor = null;
        getHighSpeedVideoFpsRangesFor = null;
    }

    public android.database.Cursor BuildConfig(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3) {
        android.database.Cursor query;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            query = this.getHighSpeedVideoSizesFor.query(str, strArr, str2, strArr2, null, null, str3);
        }
        return query;
    }

    public int ConfirmReplenishRequest(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        int delete;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            delete = this.getHighSpeedVideoSizesFor.delete(str, str2, strArr);
        }
        return delete;
    }

    public long ReplenishAckRequest(java.lang.String str, android.content.ContentValues contentValues) {
        long insertOrThrow;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            insertOrThrow = this.getHighSpeedVideoSizesFor.insertOrThrow(str, null, contentValues);
        }
        return insertOrThrow;
    }

    public int ConfirmReplenishRequest(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        int update;
        synchronized (com.visa.cbp.DigitalTicket.class) {
            update = this.getHighSpeedVideoSizesFor.update(str, contentValues, str2, strArr);
        }
        return update;
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (com.visa.cbp.DigitalTicket.class) {
            this.getHighSpeedVideoSizesFor.beginTransaction();
        }
    }

    void Camera2StreamConfigurationMap() {
        synchronized (com.visa.cbp.DigitalTicket.class) {
            this.getHighSpeedVideoSizesFor.endTransaction();
        }
    }

    void getHighSpeedVideoSizes() {
        synchronized (com.visa.cbp.DigitalTicket.class) {
            this.getHighSpeedVideoSizesFor.setTransactionSuccessful();
        }
    }

    public void valueOf() {
        synchronized (com.visa.cbp.DigitalTicket.class) {
            this.getHighSpeedVideoSizesFor.execSQL("DROP TABLE IF EXISTS tbl_enhanced_token_info");
            this.getHighSpeedVideoSizesFor.execSQL("DROP TABLE IF EXISTS tbl_settings");
            this.getHighSpeedVideoSizesFor.execSQL("DROP TABLE IF EXISTS tbl_data_group");
            this.getHighSpeedVideoSizesFor.execSQL("DROP TABLE IF EXISTS tbl_tvl");
            this.getHighSpeedVideoSizesFor.execSQL("DROP TRIGGER IF EXISTS update_selected_card_on_delete");
            this.getHighSpeedVideoSizesFor.execSQL("CREATE TABLE tbl_enhanced_token_info (_id INTEGER PRIMARY KEY AUTOINCREMENT, vPanEnrollmentID TEXT, vProvisionedTokenID TEXT, token_requester_id TEXT, encryption_metadata TEXT, tokenStatus TEXT, payment_instrument_last4 TEXT, payment_instrument_expiration_month TEXT, payment_instrument_expiration_year TEXT, token_expirationDate_month TEXT, token_expirationDate_year TEXT, appPrgrmID TEXT, static_params TEXT, dynamic_key BLOB, mac_left_key BLOB, mac_right_key BLOB, enc_token_info BLOB, dynamic_dki TEXT, token_last4 TEXT, token_par TEXT, token_reperso_status INTEGER DEFAULT 6, dynamic_key_offline BLOB, icc_priv_key_offline BLOB, icc_aes_key_offline BLOB, isVdtToken INTEGER DEFAULT 0, oda_data TEXT, icc_priv_key BLOB, icc_priv_key_size INTEGER, pub_key_expiry INTEGER, token_type INTEGER, nic INTEGER, locate_sad_offset INTEGER, sdad_sfi INTEGER, sdad_rec INTEGER, sdad_offset INTEGER, sdad_length INTEGER, car_data_offset INTEGER, decimalized_crypto_data BLOB, bouncy_submarine BLOB, UNIQUE (vProvisionedTokenID) ON CONFLICT REPLACE);");
            this.getHighSpeedVideoSizesFor.execSQL("CREATE TABLE tbl_data_group(_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, token_key INTEGER, dgi TEXT NOT NULL, dgi_data BLOB NOT NULL, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE, UNIQUE (token_key,dgi) ON CONFLICT REPLACE);");
            this.getHighSpeedVideoSizesFor.execSQL(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizesFor.execSQL("CREATE TABLE tbl_tvl (_id INTEGER PRIMARY KEY AUTOINCREMENT, token_key INTEGER, timestamp NUMERIC, unpredictable_number TEXT, atc INTEGER, transaction_type TEXT, api TEXT, cryptogram TEXT, UNIQUE (atc,token_key) ON CONFLICT REPLACE, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE );");
        }
    }

    class ReplenishAckRequest extends android.database.sqlite.SQLiteOpenHelper {
        private android.database.sqlite.SQLiteDatabase Camera2StreamConfigurationMap;
        private com.visa.cbp.setWidth getHighResolutionOutputSizeshNQ4ISI;
        private android.content.Context getHighSpeedVideoFpsRangesFor;

        ReplenishAckRequest(android.content.Context context, com.visa.cbp.setWidth setwidth, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getHighResolutionOutputSizeshNQ4ISI = setwidth;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            if (!sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            }
            java.lang.String unused = com.visa.cbp.DigitalTicket.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE tbl_enhanced_token_info (_id INTEGER PRIMARY KEY AUTOINCREMENT, vPanEnrollmentID TEXT, vProvisionedTokenID TEXT, token_requester_id TEXT, encryption_metadata TEXT, tokenStatus TEXT, payment_instrument_last4 TEXT, payment_instrument_expiration_month TEXT, payment_instrument_expiration_year TEXT, token_expirationDate_month TEXT, token_expirationDate_year TEXT, appPrgrmID TEXT, static_params TEXT, dynamic_key BLOB, mac_left_key BLOB, mac_right_key BLOB, enc_token_info BLOB, dynamic_dki TEXT, token_last4 TEXT, token_par TEXT, token_reperso_status INTEGER DEFAULT 6, dynamic_key_offline BLOB, icc_priv_key_offline BLOB, icc_aes_key_offline BLOB, isVdtToken INTEGER DEFAULT 0, oda_data TEXT, icc_priv_key BLOB, icc_priv_key_size INTEGER, pub_key_expiry INTEGER, token_type INTEGER, nic INTEGER, locate_sad_offset INTEGER, sdad_sfi INTEGER, sdad_rec INTEGER, sdad_offset INTEGER, sdad_length INTEGER, car_data_offset INTEGER, decimalized_crypto_data BLOB, bouncy_submarine BLOB, UNIQUE (vProvisionedTokenID) ON CONFLICT REPLACE);");
            sQLiteDatabase.execSQL("CREATE TABLE tbl_data_group(_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, token_key INTEGER, dgi TEXT NOT NULL, dgi_data BLOB NOT NULL, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE, UNIQUE (token_key,dgi) ON CONFLICT REPLACE);");
            sQLiteDatabase.execSQL(com.visa.cbp.DigitalTicket.this.getHighSpeedVideoSizes);
            sQLiteDatabase.execSQL("CREATE TABLE tbl_tvl (_id INTEGER PRIMARY KEY AUTOINCREMENT, token_key INTEGER, timestamp NUMERIC, unpredictable_number TEXT, atc INTEGER, transaction_type TEXT, api TEXT, cryptogram TEXT, UNIQUE (atc,token_key) ON CONFLICT REPLACE, FOREIGN KEY(token_key) REFERENCES tbl_enhanced_token_info (_id) ON DELETE CASCADE );");
            java.lang.String unused = com.visa.cbp.DigitalTicket.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.visa.cbp.DeviceInfo.DeviceType.valueOf(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, sQLiteDatabase, i, i2);
            java.lang.String unused = com.visa.cbp.DigitalTicket.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.visa.cbp.DeviceInfo.DeviceType.ReplenishAckRequest(sQLiteDatabase, this.getHighResolutionOutputSizeshNQ4ISI, i, i2);
            java.lang.String unused = com.visa.cbp.DigitalTicket.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.Camera2StreamConfigurationMap;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.Camera2StreamConfigurationMap = super.getWritableDatabase();
            }
            return this.Camera2StreamConfigurationMap;
        }
    }
}
