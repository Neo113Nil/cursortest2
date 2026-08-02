package com.visa.cbp;

/* loaded from: classes5.dex */
public class setApi extends com.visa.cbp.getParamsStatus implements com.visa.cbp.setMaxPmts {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // com.visa.cbp.getParamsStatus, com.visa.cbp.setDki
    public /* bridge */ /* synthetic */ void BuildConfig() {
        super.BuildConfig();
    }

    @Override // com.visa.cbp.getParamsStatus, com.visa.cbp.setDki
    public /* bridge */ /* synthetic */ void ConfirmReplenishRequest() {
        super.ConfirmReplenishRequest();
    }

    @Override // com.visa.cbp.getParamsStatus, com.visa.cbp.setDki
    public /* bridge */ /* synthetic */ void valueOf() {
        super.valueOf();
    }

    public setApi(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        super(context, setwidth);
        this.getHighSpeedVideoFpsRangesFor = "setApi";
        this.getHighResolutionOutputSizeshNQ4ISI = com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest;
        this.Camera2StreamConfigurationMap = "_id";
        this.getHighSpeedVideoFpsRanges = "_id = 1";
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean getIssuerApplicationDiscretionaryData() {
        return com.visa.cbp.DigitalTicket.BuildConfig(this.BuildConfig, this.ConfirmReplenishRequest) == null || !new java.io.File(this.BuildConfig.getDatabasePath(com.visa.cbp.setEncryptionScheme.setIssuerApplicationDiscretionaryData.BuildConfig()).getAbsolutePath()).exists();
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        if (tokenKey == null) {
            return false;
        }
        long tokenId = tokenKey.getTokenId();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ConfirmReplenishRequest, java.lang.Long.valueOf(tokenId));
        return getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public com.visa.cbp.sdk.facade.data.TokenKey values() {
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = new com.visa.cbp.sdk.facade.data.TokenKey(-1L);
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ConfirmReplenishRequest}, "_id = 1", null, null);
            if (cursor != null && cursor.moveToFirst()) {
                tokenKey.setTokenId(cursor.getLong(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ConfirmReplenishRequest)));
            }
            return tokenKey;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public long ReplenishAckRequest() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.BuildConfig}, "_id = 1", null, null);
            return (cursor == null || !cursor.moveToFirst()) ? -1L : cursor.getLong(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.BuildConfig));
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void ConfirmReplenishRequest(long j) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.BuildConfig, java.lang.Long.valueOf(j));
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public void valueOf(byte[] bArr) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("device_id", bArr);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public byte[] setTvls() {
        android.database.Cursor cursor = null;
        r7 = null;
        byte[] blob = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{"device_id"}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        blob = BuildConfig.getBlob(BuildConfig.getColumnIndex("device_id"));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return blob;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean setTokenInfo() {
        android.database.Cursor cursor = null;
        r7 = null;
        byte[] blob = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{"device_id"}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        blob = BuildConfig.getBlob(BuildConfig.getColumnIndex("device_id"));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return blob != null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void ReplenishAckRequest(boolean z) {
        if (getIssuerApplicationDiscretionaryData()) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerDiscretionaryData, java.lang.Integer.valueOf(z ? 1 : 0));
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean ReplenishResponse() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerDiscretionaryData}, "_id = 1", null, null);
            return ((cursor == null || !cursor.moveToFirst()) ? 0 : cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerDiscretionaryData))) != 0;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void values(java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerDiscretionaryData, str);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.lang.String setEncryptionMetaData() {
        android.database.Cursor cursor = null;
        r7 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerDiscretionaryData}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerDiscretionaryData));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void ReplenishAckRequest(java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getAid, str);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.lang.String getEncryptionMetaData() {
        android.database.Cursor cursor = null;
        r7 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getAid}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getAid));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void BuildConfig(java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("deviceId", str);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.lang.String getSignature() {
        android.database.Cursor cursor = null;
        r7 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{"deviceId"}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex("deviceId"));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void ConfirmReplenishRequest(java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getApplicationLabel, str);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.lang.String AidInfo() {
        android.database.Cursor cursor = null;
        r7 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getApplicationLabel}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getApplicationLabel));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void ConfirmReplenishRequest(boolean z) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setPriority, java.lang.Integer.valueOf(z ? 1 : 0));
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean setMac() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setPriority}, "_id = 1", null, null);
            return ((cursor == null || !cursor.moveToFirst()) ? 0 : cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setPriority))) != 0;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean ReplenishAckRequest(com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerApplicationDiscretionaryData, cVMPriority.getValue());
        return getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public com.visa.cbp.sdk.facade.data.CVMPriority setSignature() {
        java.lang.String value = com.visa.cbp.sdk.facade.data.CVMPriority.OCS.getValue();
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerApplicationDiscretionaryData}, "_id = 1", null, null);
            if (cursor != null && cursor.moveToFirst()) {
                value = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setIssuerApplicationDiscretionaryData));
            }
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
            return com.visa.cbp.sdk.facade.data.CVMPriority.valueOf(value);
        } catch (java.lang.Throwable th) {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
            throw th;
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.content.ContentValues contentValues) {
        long ConfirmReplenishRequest;
        contentValues.put("_id", (java.lang.Integer) 1);
        synchronized (com.visa.cbp.DigitalTicket.class) {
            ConfirmReplenishRequest = this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, contentValues, "_id = 1", null);
            if (ConfirmReplenishRequest <= 0) {
                ConfirmReplenishRequest = this.ReplenishAckRequest.ReplenishAckRequest(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, contentValues);
            }
        }
        return ConfirmReplenishRequest > 0;
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean valueOf(android.content.Context context, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setTokenInfo, java.lang.Integer.valueOf(i));
        return getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public int ReplenishRequest() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setTokenInfo}, "_id = 1", null, null);
            return (cursor == null || !cursor.moveToFirst()) ? -1 : cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setTokenInfo));
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.lang.String getTokenInfo() {
        android.database.Cursor cursor = null;
        r7 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{"environment"}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex("environment"));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void values(android.content.Context context, java.lang.String str) {
        if (com.visa.cbp.sdk.facade.util.UtilityFunctions.retrieveBooleanFromPreference(context, com.visa.cbp.setEncryptionScheme.getSignature.BuildConfig()) && com.visa.cbp.sdk.facade.util.UtilityFunctions.retrieveBooleanFromPreference(context, com.visa.cbp.setEncryptionScheme.setMac.BuildConfig())) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("environment", str);
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public com.visa.cbp.getDeviceId ReplenishAckRequest(android.content.Context context) {
        byte[] blob;
        android.database.Cursor cursor = null;
        r7 = null;
        r7 = null;
        com.visa.cbp.getDeviceId valueOf = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ReplenishResponse}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst() && (blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ReplenishResponse))) != null) {
                        valueOf = com.visa.cbp.getDeviceId.valueOf(this.ConfirmReplenishRequest.BuildConfig(context, blob, com.visa.cbp.getLocale.ConfirmReplenishRequest));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return valueOf != null ? valueOf : new com.visa.cbp.getDeviceId();
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private android.content.ContentValues getHighSpeedVideoFpsRanges(android.content.Context context, com.visa.cbp.getDeviceId getdeviceid) {
        byte[] values = this.ConfirmReplenishRequest.values(context, getdeviceid.setTokenInfo());
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.ReplenishResponse, values);
        return contentValues;
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean valueOf(byte[] bArr, com.visa.cbp.setKeyExpTS setkeyexpts) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(setkeyexpts.ConfirmReplenishRequest(), bArr);
        return getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public byte[] ReplenishAckRequest(com.visa.cbp.setKeyExpTS setkeyexpts) {
        java.lang.String ConfirmReplenishRequest = setkeyexpts.ConfirmReplenishRequest();
        android.database.Cursor cursor = null;
        r6 = null;
        byte[] blob = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{ConfirmReplenishRequest}, "_id = 1", null, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(ConfirmReplenishRequest));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return blob;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean ConfirmReplenishRequest(java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> hashMap) {
        java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> tvls = getTvls();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        boolean z = false;
        for (com.visa.cbp.sdk.facade.data.IdStore idStore : hashMap.keySet()) {
            boolean containsKey = tvls.containsKey(idStore);
            java.lang.String str = tvls.get(idStore);
            if (idStore.canOverride() || tvls.size() == 0 || (containsKey && str == null)) {
                contentValues.put(idStore.name(), hashMap.get(idStore));
                z = true;
            }
        }
        if (z) {
            return getHighResolutionOutputSizeshNQ4ISI(contentValues);
        }
        return false;
    }

    @Override // com.visa.cbp.setMaxPmts
    public java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> getTvls() {
        java.util.HashMap<com.visa.cbp.sdk.facade.data.IdStore, java.lang.String> hashMap = new java.util.HashMap<>();
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.Signature, com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerApplicationDiscretionaryData, com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.AidInfo, com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setMac}, "_id = 1", null, null);
            if (cursor != null && cursor.moveToFirst()) {
                java.lang.String string = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.Signature));
                java.lang.String string2 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getIssuerApplicationDiscretionaryData));
                java.lang.String string3 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.AidInfo));
                java.lang.String string4 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setMac));
                hashMap.put(com.visa.cbp.sdk.facade.data.IdStore.API_KEY, string);
                hashMap.put(com.visa.cbp.sdk.facade.data.IdStore.CLIENT_WALLET_ACCOUNT_ID, string2);
                hashMap.put(com.visa.cbp.sdk.facade.data.IdStore.V_CLIENT_APP_ID, string3);
                hashMap.put(com.visa.cbp.sdk.facade.data.IdStore.V_CLIENT_ID, string4);
            }
            return hashMap;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void valueOf(boolean z) {
        if (getIssuerApplicationDiscretionaryData()) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getCap, java.lang.Integer.valueOf(z ? 1 : 0));
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean Signature() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getCap}, "_id = 1", null, null);
            return ((cursor == null || !cursor.moveToFirst()) ? 0 : cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.getCap))) != 0;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.setMaxPmts
    public void values(boolean z) {
        if (getIssuerApplicationDiscretionaryData()) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setAid, java.lang.Integer.valueOf(z ? 1 : 0));
        getHighResolutionOutputSizeshNQ4ISI(contentValues);
    }

    @Override // com.visa.cbp.setMaxPmts
    public boolean getMac() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$BuildConfig.ReplenishAckRequest, new java.lang.String[]{com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setAid}, "_id = 1", null, null);
            return ((cursor == null || !cursor.moveToFirst()) ? 0 : cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$BuildConfig.valueOf.setAid))) != 0;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }
}
