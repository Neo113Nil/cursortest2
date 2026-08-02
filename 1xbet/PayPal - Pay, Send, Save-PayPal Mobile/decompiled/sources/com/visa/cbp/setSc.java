package com.visa.cbp;

/* loaded from: classes5.dex */
public class setSc extends com.visa.cbp.getParamsStatus implements com.visa.cbp.getSc {
    private static final java.lang.String getHighSpeedVideoSizes = "setSc";
    protected static com.visa.cbp.setMaxPmts values;
    private final java.lang.String Camera2StreamConfigurationMap;

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

    public setSc(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        super(context, setwidth);
        this.Camera2StreamConfigurationMap = com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf;
        if (values == null) {
            values = new com.visa.cbp.setApi(context, setwidth);
        }
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.sdk.facade.data.TokenKey valueOf(com.visa.cbp.external.enp.ProvisionResponse provisionResponse, byte[] bArr, com.visa.cbp.Content content, java.lang.String str) {
        if (provisionResponse == null) {
            throw new java.lang.NullPointerException("EnrollAndProvisionResponse has some mandatory missing values");
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo, bArr);
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getSignature, content.valueOf());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData, content.ConfirmReplenishRequest());
        contentValues.put("vPanEnrollmentID", str);
        contentValues.put("vProvisionedTokenID", provisionResponse.getVProvisionedTokenID());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ConfirmReplenishRequest, provisionResponse.getTokenInfo().getTokenRequestorID());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.values, provisionResponse.getEncryptionMetaData());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, provisionResponse.getTokenInfo().getTokenStatus());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo, provisionResponse.getPaymentInstrument().getLast4());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTvls, provisionResponse.getPaymentInstrument().getExpirationDate().getMonth());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishRequest, provisionResponse.getPaymentInstrument().getExpirationDate().getYear());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setSignature, provisionResponse.getTokenInfo().getExpirationDate().getMonth());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishResponse, provisionResponse.getTokenInfo().getExpirationDate().getYear());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getEncryptionMetaData, provisionResponse.getTokenInfo().getAppPrgrmID());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData, provisionResponse.getTokenInfo().getHceData().getDynParams().getDki());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerDiscretionaryData, provisionResponse.getTokenInfo().getLast4());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerApplicationDiscretionaryData, provisionResponse.getTokenInfo().getPaymentAccountReference());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getApplicationLabel, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION.getValue()));
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.TokenType.HCE.getValue()));
        if (provisionResponse.getTokenInfo().getHceData().getStaticParams().getDigitalTicket() != null) {
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTvls, (java.lang.Integer) 1);
        } else {
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTvls, (java.lang.Integer) 0);
        }
        com.google.gson.Gson gson = new com.google.gson.Gson();
        if (provisionResponse.getODAData() != null) {
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel, gson.toJson(provisionResponse.getODAData()));
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.TokenType.ODA.getValue()));
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap, content.values());
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid, java.lang.Integer.valueOf(content.ReplenishAckRequest()));
            com.visa.cbp.external.common.ExpirationDate expirationDate = provisionResponse.getODAData().getIccPubKeyCert().getExpirationDate();
            if (expirationDate != null) {
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid, java.lang.Long.valueOf(com.visa.cbp.getEncKeyInfo.values(java.lang.Integer.parseInt(expirationDate.getMonth()), java.lang.Integer.parseInt(expirationDate.getYear()))));
            }
        }
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerDiscretionaryData, gson.toJson(provisionResponse.getTokenInfo().getHceData().getStaticParams()));
        return new com.visa.cbp.sdk.facade.data.TokenKey(this.ReplenishAckRequest.ReplenishAckRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues));
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.setDeviceId values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.util.List<com.visa.cbp.setDeviceId> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges("_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())});
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.get(0);
        }
        return null;
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.sdk.facade.data.TokenKey valueOf(java.lang.String str) {
        java.lang.String[] strArr = {str};
        android.database.Cursor cursor = null;
        r8 = null;
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id"}, "vProvisionedTokenID = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.getCount() > 0) {
                        BuildConfig.moveToFirst();
                        tokenKey = new com.visa.cbp.sdk.facade.data.TokenKey(BuildConfig.getInt(BuildConfig.getColumnIndex("_id")));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return tokenKey;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.getSc
    public java.util.List<com.visa.cbp.setDeviceId> ReplenishAckRequest() {
        return getHighSpeedVideoFpsRanges((java.lang.String) null, (java.lang.String[]) null);
    }

    @Override // com.visa.cbp.getSc
    public boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.Content content) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (content != null) {
            if (content.valueOf() != null) {
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setMac, content.valueOf());
            }
            if (content.values() != null) {
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setPriority, content.values());
            }
            if (content.BuildConfig() != null) {
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getPriority, content.BuildConfig());
            }
        } else {
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setMac, (byte[]) null);
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setPriority, (byte[]) null);
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getPriority, (byte[]) null);
        }
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, com.visa.cbp.Content content) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getSignature, content.valueOf());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData, str);
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean ReplenishAckRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, com.visa.cbp.Content content, byte[] bArr) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getSignature, content.valueOf());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData, str);
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData, content.ConfirmReplenishRequest());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo, bArr);
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206, com.visa.cbp.external.common.DynParams dynParams) {
        c0206.m23142(java.lang.Integer.valueOf(dynParams.getMaxPmts()));
        dynParams.setMaxPmts(com.visa.cbp.getEncKeyInfo.ReplenishAckRequest());
        c0206.m23154(java.lang.Long.valueOf(dynParams.getKeyExpTS()));
        dynParams.setKeyExpTS(com.visa.cbp.getEncKeyInfo.values());
        c0206.m23143(dynParams.getApi());
        dynParams.setApi(com.visa.cbp.getEncKeyInfo.valueOf());
        c0206.m23138();
        c0206.m23147(0);
        return BuildConfig(context, tokenKey, c0206);
    }

    @Override // com.visa.cbp.getSc
    public boolean values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206, com.visa.cbp.external.common.DynParams dynParams) {
        c0206.m23142(java.lang.Integer.valueOf(dynParams.getMaxPmts()));
        dynParams.setMaxPmts(com.visa.cbp.getEncKeyInfo.ReplenishAckRequest());
        c0206.m23154(java.lang.Long.valueOf(dynParams.getKeyExpTS()));
        dynParams.setKeyExpTS(com.visa.cbp.getEncKeyInfo.values());
        c0206.m23143(dynParams.getApi());
        dynParams.setApi(com.visa.cbp.getEncKeyInfo.valueOf());
        c0206.m23139(java.lang.Integer.valueOf(dynParams.getSc()));
        dynParams.setSc(com.visa.cbp.getEncKeyInfo.ReplenishAckRequest());
        return BuildConfig(context, tokenKey, c0206);
    }

    @Override // com.visa.cbp.getSc
    public boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, str);
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean valueOf(com.visa.cbp.external.common.CardMetadataUpdateResponse cardMetadataUpdateResponse) {
        if (cardMetadataUpdateResponse == null) {
            throw new java.lang.NullPointerException("CardMetadataUpdateResponse has some mandatory missing values");
        }
        java.lang.String[] strArr = {cardMetadataUpdateResponse.getVPanEnrollmentID()};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo, cardMetadataUpdateResponse.getPaymentInstrument().getLast4());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTvls, cardMetadataUpdateResponse.getPaymentInstrument().getExpirationDate().getMonth());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishRequest, cardMetadataUpdateResponse.getPaymentInstrument().getExpirationDate().getYear());
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "vPanEnrollmentID = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.j.b.d.C0206 c0206) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        byte[] m23137 = c0206.m23137();
        byte[] values2 = this.ConfirmReplenishRequest.values(context, m23137);
        com.visa.cbp.getEncKeyInfo.valueOf(m23137);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo, values2);
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public int values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.j.b.d.C0206 tvls = getTvls(context, tokenKey);
        tvls.m23138();
        BuildConfig(context, tokenKey, tvls);
        return tvls.m23135().intValue();
    }

    @Override // com.visa.cbp.getSc
    public int valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.j.b.d.C0206 tvls = getTvls(context, tokenKey);
        tvls.m23134();
        BuildConfig(context, tokenKey, tvls);
        return tvls.m23145().intValue();
    }

    @Override // com.visa.cbp.getSc
    public boolean ReplenishAckRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.j.b.d.C0206 tvls = getTvls(context, tokenKey);
        tvls.m23147(0);
        return BuildConfig(context, tokenKey, tvls);
    }

    @Override // com.visa.cbp.getSc
    public int BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return getTvls(context, tokenKey).m23151().intValue();
    }

    @Override // com.visa.cbp.getSc
    public int BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        com.visa.cbp.sdk.j.b.d.C0206 tvls = getTvls(context, tokenKey);
        tvls.m23153(java.lang.Integer.valueOf(i));
        BuildConfig(context, tokenKey, tvls);
        return tvls.m23151().intValue();
    }

    @Override // com.visa.cbp.getSc
    public boolean ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, "_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())}) > 0;
    }

    @Override // com.visa.cbp.getSc
    public int valueOf(android.content.Context context) {
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, null, null);
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.setDeviceId BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return values(tokenKey);
    }

    private com.visa.cbp.sdk.j.b.d.C0206 getHighSpeedVideoFpsRanges(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return com.visa.cbp.sdk.j.b.d.C0206.m23132(this.ConfirmReplenishRequest.BuildConfig(context, getHighSpeedVideoSizes(tokenKey), com.visa.cbp.getLocale.ConfirmReplenishRequest), tokenKey);
    }

    private byte[] getHighSpeedVideoSizes(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        r9 = null;
        byte[] blob = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo}, "_id = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.AidInfo));
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

    private com.visa.cbp.Content getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String[] strArr) {
        java.lang.Throwable th;
        android.database.Cursor cursor = null;
        r0 = null;
        com.visa.cbp.Content content = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setMac, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setPriority, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getPriority, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid}, str, strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        byte[] blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setMac));
                        byte[] blob2 = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData));
                        byte[] blob3 = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setPriority));
                        int i = BuildConfig.getInt(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid));
                        byte[] blob4 = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getPriority));
                        com.visa.cbp.Content content2 = new com.visa.cbp.Content();
                        content2.values(blob);
                        content2.ConfirmReplenishRequest(blob2);
                        content2.valueOf(blob3);
                        content2.values(i);
                        content2.BuildConfig(blob4);
                        content = content2;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return content;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private com.visa.cbp.Content getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String[] strArr) {
        java.lang.Throwable th;
        android.database.Cursor cursor = null;
        r0 = null;
        com.visa.cbp.Content content = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getSignature, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid}, str, strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        byte[] blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getSignature));
                        byte[] blob2 = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerApplicationDiscretionaryData));
                        byte[] blob3 = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap));
                        int i = BuildConfig.getInt(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid));
                        com.visa.cbp.Content content2 = new com.visa.cbp.Content();
                        content2.values(blob);
                        content2.ConfirmReplenishRequest(blob2);
                        content2.valueOf(blob3);
                        content2.values(i);
                        content = content2;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return content;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr) {
        java.lang.Throwable th;
        android.database.Cursor cursor = null;
        r0 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo}, str, strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private java.util.List<com.visa.cbp.setDeviceId> getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2 = null;
        r1 = null;
        java.util.ArrayList arrayList = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[0], str, strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.getCount() > 0) {
                        arrayList = new java.util.ArrayList();
                        BuildConfig.moveToFirst();
                        while (!BuildConfig.isAfterLast()) {
                            long j = BuildConfig.getLong(BuildConfig.getColumnIndex("_id"));
                            BuildConfig.getString(BuildConfig.getColumnIndex("vPanEnrollmentID"));
                            java.lang.String string = BuildConfig.getString(BuildConfig.getColumnIndex("vProvisionedTokenID"));
                            java.lang.String string2 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ConfirmReplenishRequest));
                            java.lang.String string3 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.values));
                            java.lang.String string4 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo));
                            java.lang.String string5 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo));
                            java.lang.String string6 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTvls));
                            java.lang.String string7 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishRequest));
                            java.lang.String string8 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setSignature));
                            java.lang.String string9 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishResponse));
                            java.lang.String string10 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getEncryptionMetaData));
                            java.lang.String string11 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData));
                            java.lang.String string12 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerDiscretionaryData));
                            java.util.ArrayList arrayList2 = arrayList;
                            java.lang.String string13 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerApplicationDiscretionaryData));
                            int i = BuildConfig.getInt(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getApplicationLabel));
                            java.lang.String string14 = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerDiscretionaryData));
                            cursor = BuildConfig;
                            try {
                                com.visa.cbp.setDeviceId setdeviceid = new com.visa.cbp.setDeviceId();
                                setdeviceid.ReplenishAckRequest(new com.visa.cbp.sdk.facade.data.TokenKey(j));
                                setdeviceid.BuildConfig(string);
                                setdeviceid.setTokenInfo(string2);
                                setdeviceid.getTokenInfo(string3);
                                setdeviceid.ReplenishAckRequest(string4);
                                setdeviceid.valueOf(string5);
                                setdeviceid.getTvls(string13);
                                setdeviceid.ReplenishAckRequest(com.visa.cbp.sdk.facade.TokenRepersoStatus.get(i));
                                com.visa.cbp.external.common.ExpirationDate expirationDate = new com.visa.cbp.external.common.ExpirationDate();
                                expirationDate.setMonth(string8);
                                expirationDate.setYear(string9);
                                com.visa.cbp.external.common.ExpirationDate expirationDate2 = new com.visa.cbp.external.common.ExpirationDate();
                                expirationDate2.setMonth(string6);
                                expirationDate2.setYear(string7);
                                setdeviceid.BuildConfig(expirationDate);
                                setdeviceid.values(expirationDate2);
                                setdeviceid.values(string10);
                                setdeviceid.ConfirmReplenishRequest(string11);
                                setdeviceid.ReplenishRequest(string12);
                                setdeviceid.BuildConfig((com.visa.cbp.external.common.StaticParams) new com.google.gson.Gson().fromJson(string14, com.visa.cbp.external.common.StaticParams.class));
                                arrayList2.add(setdeviceid);
                                cursor.moveToNext();
                                arrayList = arrayList2;
                                BuildConfig = cursor;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                com.visa.cbp.getEncKeyInfo.valueOf(cursor2);
                                throw th;
                            }
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = BuildConfig;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return arrayList;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.sdk.j.b.d.C0206 getTvls(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return getHighSpeedVideoFpsRanges(context, tokenKey);
    }

    @Override // com.visa.cbp.getSc
    public byte[] valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return getHighSpeedVideoSizes(tokenKey);
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.Content BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, boolean z) {
        return getHighSpeedVideoFpsRangesFor("_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())});
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.Content ReplenishAckRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        if (((android.net.ConnectivityManager) this.BuildConfig.getSystemService("connectivity")).getActiveNetworkInfo() == null && values.getMac()) {
            return getHighResolutionOutputSizeshNQ4ISI("_id = ?", strArr);
        }
        return getHighSpeedVideoFpsRangesFor("_id = ?", strArr);
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.Content valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        if ((((android.net.ConnectivityManager) this.BuildConfig.getSystemService("connectivity")).getActiveNetworkInfo() == null || i == 0) && values.getMac()) {
            return getHighResolutionOutputSizeshNQ4ISI("_id = ?", strArr);
        }
        return getHighSpeedVideoFpsRangesFor("_id = ?", strArr);
    }

    @Override // com.visa.cbp.getSc
    public java.lang.String ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return getHighSpeedVideoSizes("_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())});
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.sdk.facade.data.TokenData getTvls(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.util.List<com.visa.cbp.sdk.facade.data.TokenData> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())});
        if (com.visa.cbp.setEncKeyInfo.BuildConfig(Camera2StreamConfigurationMap)) {
            return Camera2StreamConfigurationMap.get(0);
        }
        return null;
    }

    @Override // com.visa.cbp.getSc
    public java.util.List<com.visa.cbp.sdk.facade.data.TokenData> values() {
        return Camera2StreamConfigurationMap(null, null);
    }

    private java.util.List<com.visa.cbp.sdk.facade.data.TokenData> Camera2StreamConfigurationMap(java.lang.String str, java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerDiscretionaryData, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, "vProvisionedTokenID", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTvls}, str, strArr, null);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    long j = cursor.getLong(cursor.getColumnIndex("_id"));
                    java.lang.String string = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo));
                    java.lang.String string2 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerDiscretionaryData));
                    java.lang.String string3 = cursor.getString(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo));
                    java.lang.String string4 = cursor.getString(cursor.getColumnIndex("vProvisionedTokenID"));
                    int i = cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTvls));
                    com.visa.cbp.sdk.facade.data.TokenData tokenData = new com.visa.cbp.sdk.facade.data.TokenData();
                    tokenData.setVProvisionedTokenID(string4);
                    tokenData.setTokenKey(new com.visa.cbp.sdk.facade.data.TokenKey(j));
                    tokenData.setPaymentInstrumentLast4(string);
                    tokenData.setTokenLast4(string2);
                    tokenData.setTokenStatus(string3);
                    if (i == 1) {
                        tokenData.setIsVdtToken(true);
                    } else {
                        tokenData.setIsVdtToken(false);
                    }
                    arrayList.add(tokenData);
                    cursor.moveToNext();
                }
            }
            return arrayList;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.external.common.DynParams ReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.external.common.DynParams dynParams = new com.visa.cbp.external.common.DynParams();
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        r1 = null;
        java.lang.String string = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData}, "_id = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setEncryptionMetaData));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            com.visa.cbp.sdk.j.b.d.C0206 tvls = getTvls(context, tokenKey);
            dynParams.setApi(tvls.m23156());
            dynParams.setDki(string);
            dynParams.setKeyExpTS(tvls.m23150().longValue());
            dynParams.setSc(tvls.m23135().intValue());
            dynParams.setMaxPmts(tvls.m23133().intValue());
            return dynParams;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.getSc
    public boolean ReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        if (tokenKey == null || tokenKey.getTokenId() <= 0) {
            return false;
        }
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id"}, "_id = ?", strArr, null);
            if (cursor != null) {
                if (cursor.getCount() == 1) {
                    return true;
                }
            }
            return false;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.getSc
    public boolean ReplenishRequest() {
        return getHighSpeedVideoSizes() > 0;
    }

    private int getHighSpeedVideoSizes() {
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"count(*)"}, null, null, null);
            int i = 0;
            if (cursor != null && cursor.moveToFirst()) {
                i = cursor.getInt(0);
            }
            return i;
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.external.common.ODAData getTokenInfo(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String string;
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel}, "_id = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        string = BuildConfig.getString(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel));
                        com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
                        if (string == null && !string.isEmpty()) {
                            return (com.visa.cbp.external.common.ODAData) new com.google.gson.Gson().fromJson(string, com.visa.cbp.external.common.ODAData.class);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = BuildConfig;
                    com.visa.cbp.getEncKeyInfo.valueOf(cursor);
                    throw th;
                }
            }
            string = null;
            com.visa.cbp.getEncKeyInfo.valueOf(BuildConfig);
            return string == null ? null : null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.visa.cbp.getSc
    public byte[] setTvls(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        r9 = null;
        byte[] blob = null;
        try {
            android.database.Cursor BuildConfig = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap}, "_id = ?", strArr, null);
            if (BuildConfig != null) {
                try {
                    if (BuildConfig.moveToFirst()) {
                        blob = BuildConfig.getBlob(BuildConfig.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap));
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

    @Override // com.visa.cbp.getSc
    public long setTokenInfo(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid}, "_id = ?", strArr, null);
            return (cursor == null || !cursor.moveToFirst()) ? 0L : cursor.getLong(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid));
        } finally {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
        }
    }

    @Override // com.visa.cbp.getSc
    public boolean BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.ReplenishODAData replenishODAData) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        com.visa.cbp.external.common.ODAData tokenInfo = getTokenInfo(tokenKey);
        if (tokenInfo == null) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        tokenInfo.setIccPubKeyCert(replenishODAData.getIccPubKeyCert());
        java.lang.String json = new com.google.gson.Gson().toJson(tokenInfo);
        com.visa.cbp.external.common.ExpirationDate expirationDate = replenishODAData.getIccPubKeyCert().getExpirationDate();
        if (expirationDate != null) {
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid, java.lang.Long.valueOf(com.visa.cbp.getEncKeyInfo.values(java.lang.Integer.parseInt(expirationDate.getMonth()), java.lang.Integer.parseInt(expirationDate.getYear()))));
        }
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel, json);
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean setEncryptionMetaData(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        long tokenInfo = setTokenInfo(tokenKey);
        return getTvls(this.BuildConfig, tokenKey).m23155(this, tokenKey) && tokenInfo != 0 && java.lang.System.currentTimeMillis() + com.visa.cbp.getVdtContainer.setTvls > tokenInfo;
    }

    @Override // com.visa.cbp.getSc
    public com.visa.cbp.sdk.facade.data.TokenType getEncryptionMetaData(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.database.Cursor cursor = null;
        try {
            cursor = this.ReplenishAckRequest.BuildConfig(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, new java.lang.String[]{"_id", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd}, "_id = ?", strArr, null);
            int i = 0;
            if (cursor != null && cursor.moveToFirst()) {
                i = cursor.getInt(cursor.getColumnIndex(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd));
            }
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
            return com.visa.cbp.sdk.facade.data.TokenType.getTokenType(i);
        } catch (java.lang.Throwable th) {
            com.visa.cbp.getEncKeyInfo.valueOf(cursor);
            throw th;
        }
    }

    @Override // com.visa.cbp.getSc
    public java.util.List<com.visa.cbp.sdk.facade.data.TokenData> getTvls() {
        return Camera2StreamConfigurationMap("token_type = ?", new java.lang.String[]{java.lang.Long.toString(com.visa.cbp.sdk.facade.data.TokenType.ODA.getValue())});
    }

    @Override // com.visa.cbp.getSc
    public boolean values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse, com.visa.cbp.Content content) {
        if (repersoTokenResponse == null) {
            throw new java.lang.NullPointerException("RepersoTokenResponse has some mandatory missing values");
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, repersoTokenResponse.getTokenInfo().getTokenStatus());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ConfirmReplenishRequest, repersoTokenResponse.getTokenInfo().getTokenRequestorID());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getIssuerDiscretionaryData, repersoTokenResponse.getTokenInfo().getLast4());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setSignature, repersoTokenResponse.getTokenInfo().getExpirationDate().getMonth());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishResponse, repersoTokenResponse.getTokenInfo().getExpirationDate().getYear());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTokenInfo, repersoTokenResponse.getPaymentInstrument().getLast4());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setTvls, repersoTokenResponse.getPaymentInstrument().getExpirationDate().getMonth());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.ReplenishRequest, repersoTokenResponse.getPaymentInstrument().getExpirationDate().getYear());
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerApplicationDiscretionaryData, repersoTokenResponse.getTokenInfo().getPaymentAccountReference());
        com.visa.cbp.external.common.StaticParams signature = BuildConfig(tokenKey).getSignature();
        com.visa.cbp.external.common.StaticParamsReperso staticParams = repersoTokenResponse.getTokenInfo().getHceData().getStaticParams();
        if (staticParams.getAidInfo() != null) {
            com.visa.cbp.external.common.ODAData oDAData = staticParams.getAidInfo().get(0).getODAData();
            com.google.gson.Gson gson = new com.google.gson.Gson();
            if (oDAData != null) {
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel, gson.toJson(oDAData));
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.TokenType.ODA.getValue()));
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap, content.values());
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid, java.lang.Integer.valueOf(content.ReplenishAckRequest()));
                com.visa.cbp.external.common.ExpirationDate expirationDate = oDAData.getIccPubKeyCert().getExpirationDate();
                if (expirationDate != null) {
                    contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid, java.lang.Long.valueOf(com.visa.cbp.getEncKeyInfo.values(java.lang.Integer.parseInt(expirationDate.getMonth()), java.lang.Integer.parseInt(expirationDate.getYear()))));
                } else {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.setSignature);
                }
            } else {
                contentValues.putNull(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setApplicationLabel);
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAsrpd, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.TokenType.HCE.getValue()));
                contentValues.putNull(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getCap);
                contentValues.putNull(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setAid);
                contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getAid, (java.lang.Integer) 0);
            }
            for (com.visa.cbp.external.common.AidInfo aidInfo : staticParams.getAidInfo()) {
                for (com.visa.cbp.external.common.AidInfo aidInfo2 : signature.getAidInfo()) {
                    if (aidInfo.getAid() != null && aidInfo2 != null && aidInfo.getAid().equalsIgnoreCase(aidInfo2.getAid())) {
                        aidInfo2.setApplicationLabel(aidInfo.getApplicationLabel());
                        aidInfo2.setAid(aidInfo.getAid());
                        aidInfo2.setPriority(aidInfo.getPriority());
                        aidInfo2.setCap(aidInfo.getCap());
                        aidInfo2.setCVMrequired(aidInfo.getCVMrequired());
                        aidInfo2.setAsrpd(aidInfo.getAsrpd());
                        aidInfo2.setAucAID(aidInfo.getAucAID());
                        aidInfo2.setAppPrgrmIDAID(aidInfo.getAppPrgrmIDAID());
                        aidInfo2.setODAData(aidInfo.getODAData());
                        aidInfo2.setAppPrgrmID(aidInfo.getAppPrgrmID());
                        aidInfo2.setKernelIdentifier(aidInfo.getKernelIdentifier());
                        aidInfo2.setCardHolderNameVCPCS(aidInfo.getCardHolderNameVCPCS());
                        aidInfo2.setPdol(aidInfo.getPdol());
                        aidInfo2.setCountrycode5F55(aidInfo.getCountrycode5F55());
                        aidInfo2.setIssuerIdentificationNumber(aidInfo.getIssuerIdentificationNumber());
                        aidInfo2.setMsdData(aidInfo.getMsdData());
                        aidInfo2.setTrack2DataDec(aidInfo.getTrack2DataDec());
                        aidInfo2.setTrack2DataNotDec(aidInfo.getTrack2DataNotDec());
                        aidInfo2.setQVSDCData(aidInfo.getQVSDCData());
                        aidInfo2.setReperso(true);
                        aidInfo2.setIssuerApplicationDiscretionaryData(aidInfo.getIssuerApplicationDiscretionaryData());
                        aidInfo2.setIssuerDiscretionaryData(aidInfo.getIssuerDiscretionaryData());
                    }
                }
            }
            contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.setIssuerDiscretionaryData, gson.toJson(signature));
        }
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", new java.lang.String[]{java.lang.Long.toString(tokenKey.getTokenId())}) > 0;
    }

    @Override // com.visa.cbp.getSc
    public boolean ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        java.lang.String[] strArr = {java.lang.Long.toString(tokenKey.getTokenId())};
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getApplicationLabel, java.lang.Integer.valueOf(i));
        return this.ReplenishAckRequest.ConfirmReplenishRequest(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.valueOf, contentValues, "_id = ?", strArr) > 0;
    }
}
