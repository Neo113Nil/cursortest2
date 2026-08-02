package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;", "cardIdGroupEntity", "", "addCardIdGroupEntity", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getCardIdGroupEntityByPayPalCardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardIdGroupEntityByDigitizedCardId", "getCardIdGroupEntityByDeviceWalletServiceCardId", "", "getCardIdGroupsEntity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceWalletServiceCardId", "deleteCardIdGroupEntity", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/RoomDatabase;", "Camera2StreamConfigurationMap", "Landroidx/room/EntityUpsertAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardIdGroupDao_Impl implements com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.Companion(null);
    public static final int $stable = 8;

    public CardIdGroupDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.Camera2StreamConfigurationMap = roomDatabase;
        this.getHighSpeedVideoFpsRanges = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `CardIdGroupEntity` (`payPalCardId`,`digitizedCardId`,`deviceWalletServiceCardId`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                statement.mo9287bindText(2, entity.getDigitizedCardId());
                statement.mo9287bindText(3, entity.getDeviceWalletServiceCardId());
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `CardIdGroupEntity` SET `payPalCardId` = ?,`digitizedCardId` = ?,`deviceWalletServiceCardId` = ? WHERE `payPalCardId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                statement.mo9287bindText(2, entity.getDigitizedCardId());
                statement.mo9287bindText(3, entity.getDeviceWalletServiceCardId());
                statement.mo9287bindText(4, entity.getPayPalCardId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object addCardIdGroupEntity(final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.m20005$r8$lambda$OUBjRve3xucw7A8LUsW41cTXs(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.this, cardIdGroupEntity, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object getCardIdGroupEntityByPayPalCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation) {
        final java.lang.String str2 = "SELECT * FROM cardIdGroupEntity WHERE payPalCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.getHighSpeedVideoFpsRangesFor(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity(prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "digitizedCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "deviceWalletServiceCardId"))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object getCardIdGroupEntityByDigitizedCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation) {
        final java.lang.String str2 = "SELECT * FROM cardIdGroupEntity WHERE digitizedCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.getHighSpeedVideoSizes(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity(prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "digitizedCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "deviceWalletServiceCardId"))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object getCardIdGroupEntityByDeviceWalletServiceCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation) {
        final java.lang.String str2 = "SELECT * FROM cardIdGroupEntity WHERE deviceWalletServiceCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.Camera2StreamConfigurationMap(str2, str, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity(prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "digitizedCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "deviceWalletServiceCardId"))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object getCardIdGroupsEntity(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity>> continuation) {
        final java.lang.String str = "SELECT * FROM cardIdGroupEntity";
        return androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.getHighSpeedVideoFpsRanges(str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRanges(java.lang.String str, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId");
            int columnIndexOrThrow2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "digitizedCardId");
            int columnIndexOrThrow3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "deviceWalletServiceCardId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                arrayList.add(new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity(prepare.getText(columnIndexOrThrow), prepare.getText(columnIndexOrThrow2), prepare.getText(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao
    public final java.lang.Object deleteCardIdGroupEntity(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM cardIdGroupEntity WHERE deviceWalletServiceCardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str2, str, (androidx.database.SQLiteConnection) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    /* renamed from: $r8$lambda$OUBjRve3xucw7A8LUs-W41cT-Xs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20005$r8$lambda$OUBjRve3xucw7A8LUsW41cTXs(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao_Impl cardIdGroupDao_Impl, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        cardIdGroupDao_Impl.getHighSpeedVideoFpsRanges.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) cardIdGroupEntity);
        return kotlin.Unit.INSTANCE;
    }
}
