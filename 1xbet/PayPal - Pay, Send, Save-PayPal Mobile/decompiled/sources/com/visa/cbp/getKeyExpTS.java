package com.visa.cbp;

/* loaded from: classes5.dex */
public class getKeyExpTS extends com.visa.cbp.getParamsStatus implements com.visa.cbp.getApi {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "getKeyExpTS";
    private static final java.lang.String getHighSpeedVideoSizes = "tbl_tvl";

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

    public getKeyExpTS(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        super(context, setwidth);
    }

    @Override // com.visa.cbp.getApi
    public java.util.List<com.visa.cbp.sdk.facade.data.TvlEntry> valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (com.visa.cbp.getKeyExpTS.class) {
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(tokenKey);
            if (Camera2StreamConfigurationMap == null) {
                return arrayList;
            }
            java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId()), Camera2StreamConfigurationMap};
            android.database.Cursor cursor = null;
            try {
                cursor = this.ReplenishAckRequest.BuildConfig("tbl_tvl", null, "token_key = ? AND api = ?", strArr, null);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        long j = cursor.getLong(cursor.getColumnIndex("timestamp"));
                        java.lang.String string = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$values.values.values));
                        int i = cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$values.values.valueOf));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$values.values.setTokenInfo));
                        java.lang.String string3 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$values.values.setTvls));
                        com.visa.cbp.sdk.facade.data.TvlEntry tvlEntry = new com.visa.cbp.sdk.facade.data.TvlEntry();
                        tvlEntry.setTimeStamp(j);
                        tvlEntry.setUnpredictableNumber(string);
                        tvlEntry.setAtc(i);
                        tvlEntry.setTransactionType(string2);
                        tvlEntry.setCryptogram(string3);
                        arrayList.add(tvlEntry);
                        cursor.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                com.visa.cbp.getEncKeyInfo.valueOf(cursor);
            }
        }
    }

    @Override // com.visa.cbp.getApi
    public void values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.setTicketMetaData setticketmetadata, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("token_key", java.lang.Long.valueOf(setticketmetadata.ReplenishAckRequest().getTokenId()));
        contentValues.put("timestamp", java.lang.Long.valueOf(setticketmetadata.getTimeStamp()));
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$values.values.values, setticketmetadata.getUnpredictableNumber());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$values.values.valueOf, java.lang.Integer.valueOf(setticketmetadata.getAtc()));
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$values.values.setTokenInfo, setticketmetadata.getTransactionType());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, setticketmetadata.values());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$values.values.setTvls, setticketmetadata.getCryptogram());
        synchronized (com.visa.cbp.getKeyExpTS.class) {
            this.ReplenishAckRequest.ReplenishAckRequest("tbl_tvl", contentValues);
            getHighResolutionOutputSizeshNQ4ISI(tokenKey, i);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(tokenKey);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("_id = (SELECT min(_id) FROM tbl_tvl) AND token_key = ");
        sb.append(tokenKey.getTokenId());
        java.lang.String obj = sb.toString();
        if (highResolutionOutputSizeshNQ4ISI > i) {
            this.ReplenishAckRequest.ConfirmReplenishRequest("tbl_tvl", obj, null);
        }
    }

    @Override // com.visa.cbp.getApi
    public void ConfirmReplenishRequest(int i, java.util.List<com.visa.cbp.sdk.facade.data.TokenData> list) {
        if (list != null) {
            for (com.visa.cbp.sdk.facade.data.TokenData tokenData : list) {
                if (i < getHighResolutionOutputSizeshNQ4ISI(tokenData.getTokenKey())) {
                    getHighSpeedVideoFpsRangesFor(tokenData.getTokenKey(), i);
                }
            }
        }
    }

    private int getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {"_id"};
        java.lang.String[] strArr2 = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig("tbl_tvl", strArr, "token_key = ?", strArr2, null);
            return cursor != null ? cursor.getCount() : 0;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        int highResolutionOutputSizeshNQ4ISI;
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig("tbl_tvl", new java.lang.String[]{"_id"}, "token_key = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())}, "_id ASC");
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.getCount() > 0 && i < (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(tokenKey))) {
                        BuildConfig.moveToPosition((highResolutionOutputSizeshNQ4ISI - i) - 1);
                        long j = BuildConfig.getLong(BuildConfig.getColumnIndex("_id"));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("_id <= ");
                        sb.append(j);
                        sb.append(" AND token_key = ");
                        sb.append(tokenKey.getTokenId());
                        this.ReplenishAckRequest.ConfirmReplenishRequest("tbl_tvl", sb.toString(), null);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String Camera2StreamConfigurationMap(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.j.b.d.C0206 m23132;
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo}, "_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())}, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        m23132 = com.visa.cbp.sdk.j.b.d.C0206.m23132(this.ConfirmReplenishRequest.BuildConfig(this.BuildConfig, BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo)), com.visa.cbp.getLocale.ConfirmReplenishRequest), tokenKey);
                        com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
                        if (m23132 == null) {
                            return m23132.m23156();
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            m23132 = null;
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            if (m23132 == null) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
