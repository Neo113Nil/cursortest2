package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardData;", "cardData", "", "addCardInfo", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getCardData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCardInfo", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase;", "Camera2StreamConfigurationMap", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoSizes", "Landroidx/room/EntityUpsertAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardDataTypeConverter;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardDataTypeConverter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardInfoDao_Impl implements com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardDataTypeConverter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.Companion(null);
    public static final int $stable = 8;

    public CardInfoDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardDataTypeConverter();
        this.Camera2StreamConfigurationMap = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `CardData` (`payPalCardId`,`type`,`brand`,`description`,`timeCardAdded`,`extras`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type = entity.getType();
                if (type == null) {
                    statement.mo9286bindNull(2);
                } else {
                    statement.mo9287bindText(2, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.access$__CardType_enumToString(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.this, type));
                }
                java.lang.String brand = entity.getBrand();
                if (brand == null) {
                    statement.mo9286bindNull(3);
                } else {
                    statement.mo9287bindText(3, brand);
                }
                java.lang.String description = entity.getDescription();
                if (description == null) {
                    statement.mo9286bindNull(4);
                } else {
                    statement.mo9287bindText(4, description);
                }
                java.lang.String timeCardAdded = entity.getTimeCardAdded();
                if (timeCardAdded == null) {
                    statement.mo9286bindNull(5);
                } else {
                    statement.mo9287bindText(5, timeCardAdded);
                }
                java.lang.String fromMap = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.this.getHighSpeedVideoFpsRangesFor.fromMap(entity.getExtras());
                if (fromMap == null) {
                    statement.mo9286bindNull(6);
                } else {
                    statement.mo9287bindText(6, fromMap);
                }
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `CardData` SET `payPalCardId` = ?,`type` = ?,`brand` = ?,`description` = ?,`timeCardAdded` = ?,`extras` = ? WHERE `payPalCardId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type = entity.getType();
                if (type == null) {
                    statement.mo9286bindNull(2);
                } else {
                    statement.mo9287bindText(2, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.access$__CardType_enumToString(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.this, type));
                }
                java.lang.String brand = entity.getBrand();
                if (brand == null) {
                    statement.mo9286bindNull(3);
                } else {
                    statement.mo9287bindText(3, brand);
                }
                java.lang.String description = entity.getDescription();
                if (description == null) {
                    statement.mo9286bindNull(4);
                } else {
                    statement.mo9287bindText(4, description);
                }
                java.lang.String timeCardAdded = entity.getTimeCardAdded();
                if (timeCardAdded == null) {
                    statement.mo9286bindNull(5);
                } else {
                    statement.mo9287bindText(5, timeCardAdded);
                }
                java.lang.String fromMap = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.this.getHighSpeedVideoFpsRangesFor.fromMap(entity.getExtras());
                if (fromMap == null) {
                    statement.mo9286bindNull(6);
                } else {
                    statement.mo9287bindText(6, fromMap);
                }
                statement.mo9287bindText(7, entity.getPayPalCardId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao
    public final java.lang.Object addCardInfo(final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.$r8$lambda$fh8PUWDCIKcI5cqVykypQ3HkHrE(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.this, cardData, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao
    public final java.lang.Object getCardData(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData> continuation) {
        final java.lang.String str2 = "SELECT * FROM carddata WHERE payPalCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.getHighSpeedVideoFpsRangesFor(str2, str, this, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl cardInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId");
            int columnIndexOrThrow2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "type");
            int columnIndexOrThrow3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "brand");
            int columnIndexOrThrow4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            int columnIndexOrThrow5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "timeCardAdded");
            int columnIndexOrThrow6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "extras");
            com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData = null;
            if (prepare.step()) {
                java.lang.String text = prepare.getText(columnIndexOrThrow);
                if (prepare.isNull(columnIndexOrThrow2)) {
                    cardType2 = null;
                } else {
                    java.lang.String text2 = prepare.getText(columnIndexOrThrow2);
                    switch (text2.hashCode()) {
                        case -786486685:
                            if (text2.equals("PayPalConsumerDebit")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        case 130202841:
                            if (text2.equals("PayPalBusinessDebit")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        case 169819576:
                            if (text2.equals("ThirdPartyCredit")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        case 975842893:
                            if (text2.equals("ThirdPartyDebit")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        case 1379812394:
                            if (text2.equals("Unknown")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        case 1419736519:
                            if (text2.equals("PayLaterToGo")) {
                                cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
                                break;
                            }
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                        default:
                            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(text2)));
                    }
                    cardType2 = cardType;
                }
                cardData = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData(text, cardType2, prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), cardInfoDao_Impl.getHighSpeedVideoFpsRangesFor.toMap(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6)));
            }
            return cardData;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao
    public final java.lang.Object deleteCardInfo(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM carddata WHERE payPalCardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.getHighSpeedVideoSizes(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$fh8PUWDCIKcI5cqVykypQ3HkHrE(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl cardInfoDao_Impl, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        cardInfoDao_Impl.getHighResolutionOutputSizeshNQ4ISI.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) cardData);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$__CardType_enumToString(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl cardInfoDao_Impl, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        switch (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao_Impl.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return "PayPalConsumerDebit";
            case 2:
                return "PayPalBusinessDebit";
            case 3:
                return "ThirdPartyCredit";
            case 4:
                return "ThirdPartyDebit";
            case 5:
                return "PayLaterToGo";
            case 6:
                return "Unknown";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
