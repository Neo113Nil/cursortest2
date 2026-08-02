package com.payair.db.token;

/* loaded from: classes10.dex */
public final class c extends androidx.room.EntityInsertionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.token.TokenDetailsDao_Impl f4366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.payair.db.token.TokenDetailsDao_Impl tokenDetailsDao_Impl, androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
        this.f4366a = tokenDetailsDao_Impl;
    }

    @Override // androidx.room.EntityInsertionAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        java.lang.String str;
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
        if (tokenDetailsEntry.getNetworkTokenReference() == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, tokenDetailsEntry.getNetworkTokenReference());
        }
        com.payair.model.TokenStatus tokenStatus = tokenDetailsEntry.getTokenStatus();
        switch (com.payair.db.token.b.f4365a[tokenStatus.ordinal()]) {
            case 1:
                str = com.payair.model.TokenStatusKt.TOKEN_ACTIVE;
                break;
            case 2:
                str = com.payair.model.TokenStatusKt.TOKEN_INACTIVE;
                break;
            case 3:
                str = "SUSPENDED";
                break;
            case 4:
                str = com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED;
                break;
            case 5:
                str = "DECLINED";
                break;
            case 6:
                str = com.payair.model.TokenStatusKt.TOKEN_DELETED;
                break;
            case 7:
                str = "UNKNOWN";
                break;
            default:
                throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(tokenStatus)));
        }
        supportSQLiteStatement.bindString(2, str);
        java.lang.String str2 = this.f4366a.c.tokenInfoToJson(tokenDetailsEntry.getTokenInfo());
        if (str2 == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, str2);
        }
        java.lang.String productConfigToJson = this.f4366a.c.productConfigToJson(tokenDetailsEntry.getProductConfig());
        if (productConfigToJson == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, productConfigToJson);
        }
        java.lang.String fromCardScheme = this.f4366a.c.fromCardScheme(tokenDetailsEntry.getScheme());
        if (fromCardScheme == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, fromCardScheme);
        }
        java.lang.String assetToJson = this.f4366a.c.assetToJson(tokenDetailsEntry.getAsset());
        if (assetToJson == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, assetToJson);
        }
        if (tokenDetailsEntry.getAssetPath() == null) {
            supportSQLiteStatement.bindNull(7);
        } else {
            supportSQLiteStatement.bindString(7, tokenDetailsEntry.getAssetPath());
        }
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "INSERT OR REPLACE INTO `TokenDetails` (`networkTokenReference`,`tokenStatus`,`tokenInfo`,`productConfig`,`scheme`,`asset`,`assetPath`) VALUES (?,?,?,?,?,?,?)";
    }
}
