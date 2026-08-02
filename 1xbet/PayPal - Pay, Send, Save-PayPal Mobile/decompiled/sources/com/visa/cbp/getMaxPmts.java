package com.visa.cbp;

/* loaded from: classes5.dex */
public class getMaxPmts extends com.visa.cbp.getParamsStatus implements com.visa.cbp.DynParams {
    private final java.lang.String getHighSpeedVideoSizes;

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

    public getMaxPmts(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        super(context, setwidth);
        this.getHighSpeedVideoSizes = com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.valueOf;
    }

    @Override // com.visa.cbp.DynParams
    public long values(com.visa.cbp.setParamsStatus setparamsstatus) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("token_key", java.lang.Long.valueOf(setparamsstatus.BuildConfig().getTokenId()));
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.ConfirmReplenishRequest.ConfirmReplenishRequest, setparamsstatus.ReplenishAckRequest());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.ConfirmReplenishRequest.values, setparamsstatus.values());
        return this.ReplenishAckRequest.ReplenishAckRequest(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.valueOf, contentValues);
    }

    @Override // com.visa.cbp.DynParams
    public java.util.ArrayList<com.visa.cbp.setParamsStatus> ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        r8 = null;
        java.util.ArrayList<com.visa.cbp.setParamsStatus> arrayList = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.valueOf, new java.lang.String[0], "token_key = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.getCount() > 0) {
                        arrayList = new java.util.ArrayList<>();
                        BuildConfig.moveToFirst();
                        while (!BuildConfig.isAfterLast()) {
                            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(BuildConfig));
                            BuildConfig.moveToNext();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.DynParams
    public com.visa.cbp.setParamsStatus values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId()), str};
        android.database.Cursor cursor = null;
        r8 = null;
        com.visa.cbp.setParamsStatus highResolutionOutputSizeshNQ4ISI = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.valueOf, new java.lang.String[0], "token_key = ? AND dgi = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.getCount() > 0) {
                        BuildConfig.moveToFirst();
                        highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(BuildConfig);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return highResolutionOutputSizeshNQ4ISI;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private com.visa.cbp.setParamsStatus getHighResolutionOutputSizeshNQ4ISI(android.database.Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        com.visa.cbp.setParamsStatus setparamsstatus = new com.visa.cbp.setParamsStatus(new com.visa.cbp.sdk.facade.data.TokenKey(cursor.getLong(cursor.getColumnIndex("token_key"))), cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.ConfirmReplenishRequest.ConfirmReplenishRequest)), cursor.getBlob(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ConfirmReplenishRequest.ConfirmReplenishRequest.values)));
        setparamsstatus.valueOf(j);
        return setparamsstatus;
    }
}
