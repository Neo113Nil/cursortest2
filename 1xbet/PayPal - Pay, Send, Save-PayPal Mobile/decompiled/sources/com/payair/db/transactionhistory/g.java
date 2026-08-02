package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public final class g extends androidx.room.EntityInsertionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl f4384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.payair.db.transactionhistory.TransactionHistoryEntryDao_Impl transactionHistoryEntryDao_Impl, androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
        this.f4384a = transactionHistoryEntryDao_Impl;
    }

    @Override // androidx.room.EntityInsertionAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.payair.db.transactionhistory.TransactionHistoryEntry transactionHistoryEntry = (com.payair.db.transactionhistory.TransactionHistoryEntry) obj;
        supportSQLiteStatement.bindLong(1, transactionHistoryEntry.getId());
        if (transactionHistoryEntry.getRecordId() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, transactionHistoryEntry.getRecordId());
        }
        if (transactionHistoryEntry.getTransactionId() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, transactionHistoryEntry.getTransactionId());
        }
        if (transactionHistoryEntry.getMerchantName() == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, transactionHistoryEntry.getMerchantName());
        }
        supportSQLiteStatement.bindLong(5, this.f4384a.c.decimalToLong(transactionHistoryEntry.getAmount()));
        java.lang.Long dateToTimestamp = this.f4384a.c.dateToTimestamp(transactionHistoryEntry.getDate());
        if (dateToTimestamp == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindLong(6, dateToTimestamp.longValue());
        }
        if (transactionHistoryEntry.getCurrencyCode() == null) {
            supportSQLiteStatement.bindNull(7);
        } else {
            supportSQLiteStatement.bindString(7, transactionHistoryEntry.getCurrencyCode());
        }
        com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus authorizationStatus = transactionHistoryEntry.getAuthorizationStatus();
        int i = com.payair.db.transactionhistory.f.f4383a[authorizationStatus.ordinal()];
        if (i == 1) {
            str = "DECLINED";
        } else if (i == 2) {
            str = "AUTHORIZED";
        } else if (i == 3) {
            str = "CLEARED";
        } else {
            if (i != 4) {
                throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(authorizationStatus)));
            }
            str = "REVERSED";
        }
        supportSQLiteStatement.bindString(8, str);
        com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType transactionType = transactionHistoryEntry.getTransactionType();
        switch (com.payair.db.transactionhistory.f.b[transactionType.ordinal()]) {
            case 1:
                str2 = "PURCHASE";
                break;
            case 2:
                str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND;
                break;
            case 3:
                str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT;
                break;
            case 4:
                str2 = "ATM_WITHDRAWAL";
                break;
            case 5:
                str2 = "CASH_DISBURSEMENT";
                break;
            case 6:
                str2 = "ATM_DEPOSIT";
                break;
            case 7:
                str2 = "ATM_TRANSFER";
                break;
            default:
                throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(transactionType)));
        }
        supportSQLiteStatement.bindString(9, str2);
        if (transactionHistoryEntry.getNetworkTokenReference() == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, transactionHistoryEntry.getNetworkTokenReference());
        }
        if (transactionHistoryEntry.getMerchantType() == null) {
            supportSQLiteStatement.bindNull(11);
        } else {
            supportSQLiteStatement.bindString(11, transactionHistoryEntry.getMerchantType());
        }
        if (transactionHistoryEntry.getMerchantCity() == null) {
            supportSQLiteStatement.bindNull(12);
        } else {
            supportSQLiteStatement.bindString(12, transactionHistoryEntry.getMerchantCity());
        }
        if (transactionHistoryEntry.getTransactionCountryCode() == null) {
            supportSQLiteStatement.bindNull(13);
        } else {
            supportSQLiteStatement.bindString(13, transactionHistoryEntry.getTransactionCountryCode());
        }
        if (transactionHistoryEntry.getIndustryCatgCode() == null) {
            supportSQLiteStatement.bindNull(14);
        } else {
            supportSQLiteStatement.bindString(14, transactionHistoryEntry.getIndustryCatgCode());
        }
        if (transactionHistoryEntry.getIndustryCatgName() == null) {
            supportSQLiteStatement.bindNull(15);
        } else {
            supportSQLiteStatement.bindString(15, transactionHistoryEntry.getIndustryCatgName());
        }
        if (transactionHistoryEntry.getIndustryName() == null) {
            supportSQLiteStatement.bindNull(16);
        } else {
            supportSQLiteStatement.bindString(16, transactionHistoryEntry.getIndustryName());
        }
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "INSERT OR REPLACE INTO `transactionHistory` (`id`,`recordId`,`transactionId`,`merchantName`,`amount`,`date`,`currencyCode`,`authorizationStatus`,`transactionType`,`networkTokenReference`,`merchantType`,`merchantCity`,`transactionCountryCode`,`industryCatgCode`,`industryCatgName`,`industryName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
