package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCData;", "tnCData", "", "storeTermsAndConditions", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getTermsAndConditions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTermsAndConditions", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoFpsRanges", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TnCDao_Impl implements com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData> getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.Companion(null);
    public static final int $stable = 8;

    public TnCDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.getHighSpeedVideoSizes = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `TnCData` (`deviceWalletServiceCardId`,`tncText`,`acceptedTime`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getDeviceWalletServiceCardId());
                statement.mo9287bindText(2, entity.getTncText());
                statement.mo9287bindText(3, entity.getAcceptedTime());
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `TnCData` SET `deviceWalletServiceCardId` = ?,`tncText` = ?,`acceptedTime` = ? WHERE `deviceWalletServiceCardId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getDeviceWalletServiceCardId());
                statement.mo9287bindText(2, entity.getTncText());
                statement.mo9287bindText(3, entity.getAcceptedTime());
                statement.mo9287bindText(4, entity.getDeviceWalletServiceCardId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao
    public final java.lang.Object storeTermsAndConditions(final com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData tnCData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.$r8$lambda$Thjy0xyzdfpXqJ21_FHqzpB3kzg(com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.this, tnCData, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao
    public final java.lang.Object getTermsAndConditions(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData> continuation) {
        final java.lang.String str2 = "SELECT * FROM tncdata WHERE deviceWalletServiceCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.getHighSpeedVideoSizes(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData(prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "deviceWalletServiceCardId")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "tncText")), prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "acceptedTime"))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao
    public final java.lang.Object deleteTermsAndConditions(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM tncdata WHERE deviceWalletServiceCardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl.getHighSpeedVideoFpsRanges(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$Thjy0xyzdfpXqJ21_FHqzpB3kzg(com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao_Impl tnCDao_Impl, com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData tnCData, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        tnCDao_Impl.getHighSpeedVideoSizes.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) tnCData);
        return kotlin.Unit.INSTANCE;
    }
}
