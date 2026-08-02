package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;", "payPalMockDeviceWallet", "", "notifyCardAdded", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardIdGroup;", "getCardGroupByDigitizedCardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardGroupByPayPalCardId", "getCardGroupByDeviceWalletServiceCardId", "", "getCardIdGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceWalletServiceCardId", "notifyCardDeleted", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityUpsertAdapter;", "Camera2StreamConfigurationMap", "Landroidx/room/EntityUpsertAdapter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalMockCardDao_Impl implements com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao {
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.Companion(null);
    public static final int $stable = 8;

    public PayPalMockCardDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.Camera2StreamConfigurationMap = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `PayPalMockDeviceWallet` (`payPalCardId`,`digitizedCardId`,`deviceWalletServiceCardId`,`status`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                statement.mo9287bindText(2, entity.getDigitizedCardId());
                statement.mo9287bindText(3, entity.getDeviceWalletServiceCardId());
                statement.mo9287bindText(4, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.access$__Status_enumToString(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.this, entity.getStatus()));
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `PayPalMockDeviceWallet` SET `payPalCardId` = ?,`digitizedCardId` = ?,`deviceWalletServiceCardId` = ?,`status` = ? WHERE `payPalCardId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                statement.mo9287bindText(2, entity.getDigitizedCardId());
                statement.mo9287bindText(3, entity.getDeviceWalletServiceCardId());
                statement.mo9287bindText(4, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.access$__Status_enumToString(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.this, entity.getStatus()));
                statement.mo9287bindText(5, entity.getPayPalCardId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object notifyCardAdded(final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet payPalMockDeviceWallet, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.m20019$r8$lambda$OQyfrpI7DzHqRAHjicZQV_4Pkc(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.this, payPalMockDeviceWallet, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object getCardGroupByDigitizedCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation) {
        final java.lang.String str2 = "SELECT digitizedCardId, payPalCardId, deviceWalletServiceCardId FROM PayPalMockDeviceWallet WHERE digitizedCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.getHighSpeedVideoFpsRanges(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup(prepare.getText(0), prepare.getText(1), prepare.getText(2)) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object getCardGroupByPayPalCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation) {
        final java.lang.String str2 = "SELECT digitizedCardId, payPalCardId, deviceWalletServiceCardId FROM PayPalMockDeviceWallet WHERE payPalCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.Camera2StreamConfigurationMap(str2, str, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup(prepare.getText(0), prepare.getText(1), prepare.getText(2)) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object getCardGroupByDeviceWalletServiceCardId(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation) {
        final java.lang.String str2 = "SELECT digitizedCardId, payPalCardId, deviceWalletServiceCardId FROM PayPalMockDeviceWallet WHERE deviceWalletServiceCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.getHighSpeedVideoSizes(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            return prepare.step() ? new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup(prepare.getText(0), prepare.getText(1), prepare.getText(2)) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object getCardIdGroups(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup>> continuation) {
        final java.lang.String str = "SELECT digitizedCardId, payPalCardId, deviceWalletServiceCardId FROM PayPalMockDeviceWallet";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.Camera2StreamConfigurationMap(str, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List Camera2StreamConfigurationMap(java.lang.String str, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                arrayList.add(new com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup(prepare.getText(0), prepare.getText(1), prepare.getText(2)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao
    public final java.lang.Object notifyCardDeleted(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM paypalmockdevicewallet WHERE deviceWalletServiceCardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.getHighSpeedVideoFpsRangesFor(str2, str, (androidx.database.SQLiteConnection) obj);
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    /* renamed from: $r8$lambda$OQyfrpI7DzHqRAHjicZQV_-4Pkc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20019$r8$lambda$OQyfrpI7DzHqRAHjicZQV_4Pkc(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl payPalMockCardDao_Impl, com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet payPalMockDeviceWallet, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        payPalMockCardDao_Impl.Camera2StreamConfigurationMap.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) payPalMockDeviceWallet);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$__Status_enumToString(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl payPalMockCardDao_Impl, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status) {
        int i = com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardDao_Impl.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return "PendingActivation";
        }
        if (i == 2) {
            return "Active";
        }
        if (i == 3) {
            return "Suspended";
        }
        if (i == 4) {
            return "Expired";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Unknown";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Expired.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
