package com.paypal.oslo.feature.taptopay.data.db.transaction.paypal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;", "transactionEntities", "", "replaceAllTransactions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactionEntity", "addTransaction", "(Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransactions", "getTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "wipeTransactions", "p0", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase;", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoSizes", "Landroidx/room/EntityUpsertAdapter;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/DateConverter;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/DateConverter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransactionDao_Impl implements com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.DateConverter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.Companion(null);
    public static final int $stable = 8;

    public TransactionDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.DateConverter();
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.Camera2StreamConfigurationMap = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `TransactionEntity` (`id`,`cardId`,`status`,`type`,`amount`,`currencyCode`,`displayAmount`,`transactionDate`,`merchantName`,`merchantPostalCode`,`merchantCategoryCode`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getId());
                statement.mo9287bindText(2, entity.getCardId());
                statement.mo9287bindText(3, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.access$__TransactionStatus_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, entity.getStatus()));
                statement.mo9287bindText(4, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.access$__TransactionType_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, entity.getType()));
                statement.mo9284bindDouble(5, entity.getAmount());
                statement.mo9287bindText(6, entity.getCurrencyCode());
                java.lang.String displayAmount = entity.getDisplayAmount();
                if (displayAmount == null) {
                    statement.mo9286bindNull(7);
                } else {
                    statement.mo9287bindText(7, displayAmount);
                }
                java.lang.Long fromDate = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this.getHighSpeedVideoSizes.fromDate(entity.getTransactionDate());
                if (fromDate == null) {
                    statement.mo9286bindNull(8);
                } else {
                    statement.mo9285bindLong(8, fromDate.longValue());
                }
                java.lang.String merchantName = entity.getMerchantName();
                if (merchantName == null) {
                    statement.mo9286bindNull(9);
                } else {
                    statement.mo9287bindText(9, merchantName);
                }
                java.lang.String merchantPostalCode = entity.getMerchantPostalCode();
                if (merchantPostalCode == null) {
                    statement.mo9286bindNull(10);
                } else {
                    statement.mo9287bindText(10, merchantPostalCode);
                }
                java.lang.String merchantCategoryCode = entity.getMerchantCategoryCode();
                if (merchantCategoryCode == null) {
                    statement.mo9286bindNull(11);
                } else {
                    statement.mo9287bindText(11, merchantCategoryCode);
                }
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `TransactionEntity` SET `id` = ?,`cardId` = ?,`status` = ?,`type` = ?,`amount` = ?,`currencyCode` = ?,`displayAmount` = ?,`transactionDate` = ?,`merchantName` = ?,`merchantPostalCode` = ?,`merchantCategoryCode` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getId());
                statement.mo9287bindText(2, entity.getCardId());
                statement.mo9287bindText(3, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.access$__TransactionStatus_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, entity.getStatus()));
                statement.mo9287bindText(4, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.access$__TransactionType_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, entity.getType()));
                statement.mo9284bindDouble(5, entity.getAmount());
                statement.mo9287bindText(6, entity.getCurrencyCode());
                java.lang.String displayAmount = entity.getDisplayAmount();
                if (displayAmount == null) {
                    statement.mo9286bindNull(7);
                } else {
                    statement.mo9287bindText(7, displayAmount);
                }
                java.lang.Long fromDate = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this.getHighSpeedVideoSizes.fromDate(entity.getTransactionDate());
                if (fromDate == null) {
                    statement.mo9286bindNull(8);
                } else {
                    statement.mo9285bindLong(8, fromDate.longValue());
                }
                java.lang.String merchantName = entity.getMerchantName();
                if (merchantName == null) {
                    statement.mo9286bindNull(9);
                } else {
                    statement.mo9287bindText(9, merchantName);
                }
                java.lang.String merchantPostalCode = entity.getMerchantPostalCode();
                if (merchantPostalCode == null) {
                    statement.mo9286bindNull(10);
                } else {
                    statement.mo9287bindText(10, merchantPostalCode);
                }
                java.lang.String merchantCategoryCode = entity.getMerchantCategoryCode();
                if (merchantCategoryCode == null) {
                    statement.mo9286bindNull(11);
                } else {
                    statement.mo9287bindText(11, merchantCategoryCode);
                }
                statement.mo9287bindText(12, entity.getId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object replaceAllTransactions(java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performInTransactionSuspending = androidx.room.util.DBUtil.performInTransactionSuspending(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$replaceAllTransactions$2(this, list, null), continuation);
        return performInTransactionSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInTransactionSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object addTransaction(final com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity transactionEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.m20009$r8$lambda$cuT3BO6Mte43TxD2qUorcxddCc(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, transactionEntity, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object addTransactions(final java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.m20011$r8$lambda$oieMf1PSZW7pUg8axKwIy9jNE(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.this, list, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object getTransactions(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>> continuation) {
        final java.lang.String str = "SELECT * FROM transactionEntity";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.Camera2StreamConfigurationMap(str, this, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        java.lang.Long valueOf;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cardId");
            int columnIndexOrThrow3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "status");
            int columnIndexOrThrow4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "type");
            int columnIndexOrThrow5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "amount");
            int columnIndexOrThrow6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "currencyCode");
            int columnIndexOrThrow7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "displayAmount");
            int columnIndexOrThrow8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "transactionDate");
            int columnIndexOrThrow9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantName");
            int columnIndexOrThrow10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantPostalCode");
            int columnIndexOrThrow11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantCategoryCode");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                java.lang.String text = prepare.getText(columnIndexOrThrow);
                java.lang.String text2 = prepare.getText(columnIndexOrThrow2);
                com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(prepare.getText(columnIndexOrThrow3));
                com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(prepare.getText(columnIndexOrThrow4));
                double d = prepare.getDouble(columnIndexOrThrow5);
                java.lang.String text3 = prepare.getText(columnIndexOrThrow6);
                java.lang.String text4 = prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7);
                if (prepare.isNull(columnIndexOrThrow8)) {
                    i = columnIndexOrThrow;
                    valueOf = null;
                } else {
                    valueOf = java.lang.Long.valueOf(prepare.getLong(columnIndexOrThrow8));
                    i = columnIndexOrThrow;
                }
                arrayList.add(new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity(text, text2, highSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, d, text3, text4, transactionDao_Impl.getHighSpeedVideoSizes.toDate(valueOf), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9), prepare.isNull(columnIndexOrThrow10) ? null : prepare.getText(columnIndexOrThrow10), prepare.isNull(columnIndexOrThrow11) ? null : prepare.getText(columnIndexOrThrow11)));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object getTransactions(final java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>> continuation) {
        final java.lang.String str2 = "SELECT * FROM transactionEntity WHERE cardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.getHighSpeedVideoFpsRanges(str2, str, this, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        java.lang.Long valueOf;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cardId");
            int columnIndexOrThrow3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "status");
            int columnIndexOrThrow4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "type");
            int columnIndexOrThrow5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "amount");
            int columnIndexOrThrow6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "currencyCode");
            int columnIndexOrThrow7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "displayAmount");
            int columnIndexOrThrow8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "transactionDate");
            int columnIndexOrThrow9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantName");
            int columnIndexOrThrow10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantPostalCode");
            int columnIndexOrThrow11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "merchantCategoryCode");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                java.lang.String text = prepare.getText(columnIndexOrThrow);
                java.lang.String text2 = prepare.getText(columnIndexOrThrow2);
                com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(prepare.getText(columnIndexOrThrow3));
                com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(prepare.getText(columnIndexOrThrow4));
                double d = prepare.getDouble(columnIndexOrThrow5);
                java.lang.String text3 = prepare.getText(columnIndexOrThrow6);
                java.lang.String text4 = prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7);
                if (prepare.isNull(columnIndexOrThrow8)) {
                    i = columnIndexOrThrow;
                    valueOf = null;
                } else {
                    valueOf = java.lang.Long.valueOf(prepare.getLong(columnIndexOrThrow8));
                    i = columnIndexOrThrow;
                }
                arrayList.add(new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity(text, text2, highSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, d, text3, text4, transactionDao_Impl.getHighSpeedVideoSizes.toDate(valueOf), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9), prepare.isNull(columnIndexOrThrow10) ? null : prepare.getText(columnIndexOrThrow10), prepare.isNull(columnIndexOrThrow11) ? null : prepare.getText(columnIndexOrThrow11)));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object deleteTransaction(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM transactionEntity WHERE cardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.getHighSpeedVideoFpsRangesFor(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            prepare.step();
            prepare.close();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao
    public final java.lang.Object wipeTransactions(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str = "DELETE FROM transactionEntity";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.getHighSpeedVideoFpsRanges(str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.step();
            prepare.close();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            prepare.close();
            throw th;
        }
    }

    private static com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        switch (p0.hashCode()) {
            case 74702359:
                if (p0.equals("REFUNDED")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.REFUNDED;
                }
                break;
            case 1350822958:
                if (p0.equals("DECLINED")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.DECLINED;
                }
                break;
            case 1574760332:
                if (p0.equals("CLEARED")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED;
                }
                break;
            case 1967871671:
                if (p0.equals("APPROVED")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(p0)));
    }

    private static com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType Camera2StreamConfigurationMap(java.lang.String p0) {
        switch (p0.hashCode()) {
            case -1881484424:
                if (p0.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND)) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.REFUND;
                }
                break;
            case -1769016063:
                if (p0.equals("PURCHASE")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE;
                }
                break;
            case -1144493899:
                if (p0.equals("WITHDRAWAL")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.WITHDRAWAL;
                }
                break;
            case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                if (p0.equals("UNKNOWN")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
                }
                break;
            case 807116442:
                if (p0.equals("CASHBACK")) {
                    return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.CASHBACK;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(p0)));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<kotlin.reflect.KClass<?>> getRequiredConverters() {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$cuT3BO6Mte43TxD2qUorcxd-dCc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20009$r8$lambda$cuT3BO6Mte43TxD2qUorcxddCc(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity transactionEntity, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        transactionDao_Impl.Camera2StreamConfigurationMap.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) transactionEntity);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oi--eMf1PSZW7pUg8axKwIy9jNE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20011$r8$lambda$oieMf1PSZW7pUg8axKwIy9jNE(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, java.util.List list, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        transactionDao_Impl.Camera2StreamConfigurationMap.upsert(sQLiteConnection, list);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$__TransactionStatus_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus) {
        int i = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.WhenMappings.$EnumSwitchMapping$0[transactionStatus.ordinal()];
        if (i == 1) {
            return "APPROVED";
        }
        if (i == 2) {
            return "CLEARED";
        }
        if (i == 3) {
            return "DECLINED";
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "REFUNDED";
    }

    public static final /* synthetic */ java.lang.String access$__TransactionType_enumToString(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl transactionDao_Impl, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType) {
        int i = com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao_Impl.WhenMappings.$EnumSwitchMapping$1[transactionType.ordinal()];
        if (i == 1) {
            return "PURCHASE";
        }
        if (i == 2) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND;
        }
        if (i == 3) {
            return "WITHDRAWAL";
        }
        if (i == 4) {
            return "CASHBACK";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "UNKNOWN";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.DECLINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.WITHDRAWAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.CASHBACK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
