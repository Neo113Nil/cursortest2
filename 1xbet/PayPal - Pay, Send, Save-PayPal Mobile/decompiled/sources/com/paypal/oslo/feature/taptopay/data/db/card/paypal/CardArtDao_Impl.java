package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao_Impl;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtCollectionEntity;", "entity", "", "addCardArtCollectionEntity", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtCollectionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paypalCardId", "getCardArtCollectionEntity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCardArtCollectionEntity", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRanges", "Landroidx/room/EntityUpsertAdapter;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityUpsertAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardArtDao_Impl implements com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.room.EntityUpsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.Companion(null);
    public static final int $stable = 8;

    public CardArtDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRanges = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.room.EntityUpsertAdapter<>(new androidx.room.EntityInsertAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT INTO `CardArtCollectionEntity` (`payPalCardId`,`primary_sourceUrl`,`primary_mimeType`,`primary_width`,`primary_height`,`primary_backgroundColor`,`primary_foregroundColor`,`primary_labelColor`,`thumbnail_sourceUrl`,`thumbnail_mimeType`,`thumbnail_width`,`thumbnail_height`,`thumbnail_backgroundColor`,`thumbnail_foregroundColor`,`thumbnail_labelColor`,`stack_view_sourceUrl`,`stack_view_mimeType`,`stack_view_width`,`stack_view_height`,`stack_view_backgroundColor`,`stack_view_foregroundColor`,`stack_view_labelColor`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary = entity.getPrimary();
                if (primary != null) {
                    java.lang.String sourceUrl = primary.getSourceUrl();
                    if (sourceUrl == null) {
                        statement.mo9286bindNull(2);
                    } else {
                        statement.mo9287bindText(2, sourceUrl);
                    }
                    java.lang.String mimeType = primary.getMimeType();
                    if (mimeType == null) {
                        statement.mo9286bindNull(3);
                    } else {
                        statement.mo9287bindText(3, mimeType);
                    }
                    if (primary.getWidth() == null) {
                        statement.mo9286bindNull(4);
                    } else {
                        statement.mo9285bindLong(4, r3.intValue());
                    }
                    if (primary.getHeight() == null) {
                        statement.mo9286bindNull(5);
                    } else {
                        statement.mo9285bindLong(5, r2.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata = primary.getMetadata();
                    if (metadata != null) {
                        if (metadata.getBackgroundColor() == null) {
                            statement.mo9286bindNull(6);
                        } else {
                            statement.mo9285bindLong(6, r1.intValue());
                        }
                        if (metadata.getForegroundColor() == null) {
                            statement.mo9286bindNull(7);
                        } else {
                            statement.mo9285bindLong(7, r1.intValue());
                        }
                        if (metadata.getLabelColor() == null) {
                            statement.mo9286bindNull(8);
                        } else {
                            statement.mo9285bindLong(8, r0.intValue());
                        }
                    } else {
                        statement.mo9286bindNull(6);
                        statement.mo9286bindNull(7);
                        statement.mo9286bindNull(8);
                    }
                } else {
                    statement.mo9286bindNull(2);
                    statement.mo9286bindNull(3);
                    statement.mo9286bindNull(4);
                    statement.mo9286bindNull(5);
                    statement.mo9286bindNull(6);
                    statement.mo9286bindNull(7);
                    statement.mo9286bindNull(8);
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail = entity.getThumbnail();
                if (thumbnail != null) {
                    java.lang.String sourceUrl2 = thumbnail.getSourceUrl();
                    if (sourceUrl2 == null) {
                        statement.mo9286bindNull(9);
                    } else {
                        statement.mo9287bindText(9, sourceUrl2);
                    }
                    java.lang.String mimeType2 = thumbnail.getMimeType();
                    if (mimeType2 == null) {
                        statement.mo9286bindNull(10);
                    } else {
                        statement.mo9287bindText(10, mimeType2);
                    }
                    if (thumbnail.getWidth() == null) {
                        statement.mo9286bindNull(11);
                    } else {
                        statement.mo9285bindLong(11, r3.intValue());
                    }
                    if (thumbnail.getHeight() == null) {
                        statement.mo9286bindNull(12);
                    } else {
                        statement.mo9285bindLong(12, r2.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata2 = thumbnail.getMetadata();
                    if (metadata2 != null) {
                        if (metadata2.getBackgroundColor() == null) {
                            statement.mo9286bindNull(13);
                        } else {
                            statement.mo9285bindLong(13, r1.intValue());
                        }
                        if (metadata2.getForegroundColor() == null) {
                            statement.mo9286bindNull(14);
                        } else {
                            statement.mo9285bindLong(14, r1.intValue());
                        }
                        if (metadata2.getLabelColor() == null) {
                            statement.mo9286bindNull(15);
                        } else {
                            statement.mo9285bindLong(15, r0.intValue());
                        }
                    } else {
                        statement.mo9286bindNull(13);
                        statement.mo9286bindNull(14);
                        statement.mo9286bindNull(15);
                    }
                } else {
                    statement.mo9286bindNull(9);
                    statement.mo9286bindNull(10);
                    statement.mo9286bindNull(11);
                    statement.mo9286bindNull(12);
                    statement.mo9286bindNull(13);
                    statement.mo9286bindNull(14);
                    statement.mo9286bindNull(15);
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView = entity.getStackView();
                if (stackView != null) {
                    java.lang.String sourceUrl3 = stackView.getSourceUrl();
                    if (sourceUrl3 == null) {
                        statement.mo9286bindNull(16);
                    } else {
                        statement.mo9287bindText(16, sourceUrl3);
                    }
                    java.lang.String mimeType3 = stackView.getMimeType();
                    if (mimeType3 == null) {
                        statement.mo9286bindNull(17);
                    } else {
                        statement.mo9287bindText(17, mimeType3);
                    }
                    if (stackView.getWidth() == null) {
                        statement.mo9286bindNull(18);
                    } else {
                        statement.mo9285bindLong(18, r2.intValue());
                    }
                    if (stackView.getHeight() == null) {
                        statement.mo9286bindNull(19);
                    } else {
                        statement.mo9285bindLong(19, r1.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata3 = stackView.getMetadata();
                    if (metadata3 != null) {
                        if (metadata3.getBackgroundColor() == null) {
                            statement.mo9286bindNull(20);
                        } else {
                            statement.mo9285bindLong(20, r0.intValue());
                        }
                        if (metadata3.getForegroundColor() == null) {
                            statement.mo9286bindNull(21);
                        } else {
                            statement.mo9285bindLong(21, r0.intValue());
                        }
                        if (metadata3.getLabelColor() == null) {
                            statement.mo9286bindNull(22);
                            return;
                        } else {
                            statement.mo9285bindLong(22, r11.intValue());
                            return;
                        }
                    }
                    statement.mo9286bindNull(20);
                    statement.mo9286bindNull(21);
                    statement.mo9286bindNull(22);
                    return;
                }
                statement.mo9286bindNull(16);
                statement.mo9286bindNull(17);
                statement.mo9286bindNull(18);
                statement.mo9286bindNull(19);
                statement.mo9286bindNull(20);
                statement.mo9286bindNull(21);
                statement.mo9286bindNull(22);
            }
        }, new androidx.room.EntityDeleteOrUpdateAdapter<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity>() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final java.lang.String createQuery() {
                return "UPDATE `CardArtCollectionEntity` SET `payPalCardId` = ?,`primary_sourceUrl` = ?,`primary_mimeType` = ?,`primary_width` = ?,`primary_height` = ?,`primary_backgroundColor` = ?,`primary_foregroundColor` = ?,`primary_labelColor` = ?,`thumbnail_sourceUrl` = ?,`thumbnail_mimeType` = ?,`thumbnail_width` = ?,`thumbnail_height` = ?,`thumbnail_backgroundColor` = ?,`thumbnail_foregroundColor` = ?,`thumbnail_labelColor` = ?,`stack_view_sourceUrl` = ?,`stack_view_mimeType` = ?,`stack_view_width` = ?,`stack_view_height` = ?,`stack_view_backgroundColor` = ?,`stack_view_foregroundColor` = ?,`stack_view_labelColor` = ? WHERE `payPalCardId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public final void bind(androidx.database.SQLiteStatement statement, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getPayPalCardId());
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary = entity.getPrimary();
                if (primary != null) {
                    java.lang.String sourceUrl = primary.getSourceUrl();
                    if (sourceUrl == null) {
                        statement.mo9286bindNull(2);
                    } else {
                        statement.mo9287bindText(2, sourceUrl);
                    }
                    java.lang.String mimeType = primary.getMimeType();
                    if (mimeType == null) {
                        statement.mo9286bindNull(3);
                    } else {
                        statement.mo9287bindText(3, mimeType);
                    }
                    if (primary.getWidth() == null) {
                        statement.mo9286bindNull(4);
                    } else {
                        statement.mo9285bindLong(4, r3.intValue());
                    }
                    if (primary.getHeight() == null) {
                        statement.mo9286bindNull(5);
                    } else {
                        statement.mo9285bindLong(5, r2.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata = primary.getMetadata();
                    if (metadata != null) {
                        if (metadata.getBackgroundColor() == null) {
                            statement.mo9286bindNull(6);
                        } else {
                            statement.mo9285bindLong(6, r1.intValue());
                        }
                        if (metadata.getForegroundColor() == null) {
                            statement.mo9286bindNull(7);
                        } else {
                            statement.mo9285bindLong(7, r1.intValue());
                        }
                        if (metadata.getLabelColor() == null) {
                            statement.mo9286bindNull(8);
                        } else {
                            statement.mo9285bindLong(8, r0.intValue());
                        }
                    } else {
                        statement.mo9286bindNull(6);
                        statement.mo9286bindNull(7);
                        statement.mo9286bindNull(8);
                    }
                } else {
                    statement.mo9286bindNull(2);
                    statement.mo9286bindNull(3);
                    statement.mo9286bindNull(4);
                    statement.mo9286bindNull(5);
                    statement.mo9286bindNull(6);
                    statement.mo9286bindNull(7);
                    statement.mo9286bindNull(8);
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail = entity.getThumbnail();
                if (thumbnail != null) {
                    java.lang.String sourceUrl2 = thumbnail.getSourceUrl();
                    if (sourceUrl2 == null) {
                        statement.mo9286bindNull(9);
                    } else {
                        statement.mo9287bindText(9, sourceUrl2);
                    }
                    java.lang.String mimeType2 = thumbnail.getMimeType();
                    if (mimeType2 == null) {
                        statement.mo9286bindNull(10);
                    } else {
                        statement.mo9287bindText(10, mimeType2);
                    }
                    if (thumbnail.getWidth() == null) {
                        statement.mo9286bindNull(11);
                    } else {
                        statement.mo9285bindLong(11, r3.intValue());
                    }
                    if (thumbnail.getHeight() == null) {
                        statement.mo9286bindNull(12);
                    } else {
                        statement.mo9285bindLong(12, r2.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata2 = thumbnail.getMetadata();
                    if (metadata2 != null) {
                        if (metadata2.getBackgroundColor() == null) {
                            statement.mo9286bindNull(13);
                        } else {
                            statement.mo9285bindLong(13, r1.intValue());
                        }
                        if (metadata2.getForegroundColor() == null) {
                            statement.mo9286bindNull(14);
                        } else {
                            statement.mo9285bindLong(14, r1.intValue());
                        }
                        if (metadata2.getLabelColor() == null) {
                            statement.mo9286bindNull(15);
                        } else {
                            statement.mo9285bindLong(15, r0.intValue());
                        }
                    } else {
                        statement.mo9286bindNull(13);
                        statement.mo9286bindNull(14);
                        statement.mo9286bindNull(15);
                    }
                } else {
                    statement.mo9286bindNull(9);
                    statement.mo9286bindNull(10);
                    statement.mo9286bindNull(11);
                    statement.mo9286bindNull(12);
                    statement.mo9286bindNull(13);
                    statement.mo9286bindNull(14);
                    statement.mo9286bindNull(15);
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView = entity.getStackView();
                if (stackView != null) {
                    java.lang.String sourceUrl3 = stackView.getSourceUrl();
                    if (sourceUrl3 == null) {
                        statement.mo9286bindNull(16);
                    } else {
                        statement.mo9287bindText(16, sourceUrl3);
                    }
                    java.lang.String mimeType3 = stackView.getMimeType();
                    if (mimeType3 == null) {
                        statement.mo9286bindNull(17);
                    } else {
                        statement.mo9287bindText(17, mimeType3);
                    }
                    if (stackView.getWidth() == null) {
                        statement.mo9286bindNull(18);
                    } else {
                        statement.mo9285bindLong(18, r3.intValue());
                    }
                    if (stackView.getHeight() == null) {
                        statement.mo9286bindNull(19);
                    } else {
                        statement.mo9285bindLong(19, r2.intValue());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata3 = stackView.getMetadata();
                    if (metadata3 != null) {
                        if (metadata3.getBackgroundColor() == null) {
                            statement.mo9286bindNull(20);
                        } else {
                            statement.mo9285bindLong(20, r1.intValue());
                        }
                        if (metadata3.getForegroundColor() == null) {
                            statement.mo9286bindNull(21);
                        } else {
                            statement.mo9285bindLong(21, r1.intValue());
                        }
                        if (metadata3.getLabelColor() == null) {
                            statement.mo9286bindNull(22);
                        } else {
                            statement.mo9285bindLong(22, r0.intValue());
                        }
                    } else {
                        statement.mo9286bindNull(20);
                        statement.mo9286bindNull(21);
                        statement.mo9286bindNull(22);
                    }
                } else {
                    statement.mo9286bindNull(16);
                    statement.mo9286bindNull(17);
                    statement.mo9286bindNull(18);
                    statement.mo9286bindNull(19);
                    statement.mo9286bindNull(20);
                    statement.mo9286bindNull(21);
                    statement.mo9286bindNull(22);
                }
                statement.mo9287bindText(23, entity.getPayPalCardId());
            }
        });
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao
    public final java.lang.Object addCardArtCollectionEntity(final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRanges, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.$r8$lambda$rAvHghSEONv8qSV6ld07W4zvt5U(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.this, cardArtCollectionEntity, (androidx.database.SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao
    public final java.lang.Object getCardArtCollectionEntity(final java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity> continuation) {
        final java.lang.String str2 = "SELECT * FROM cardArtCollectionEntity WHERE payPalCardId = ?";
        return androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRanges, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.getHighSpeedVideoFpsRanges(str2, str, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0331 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031f A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030d A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e3 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cf A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c0 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024c A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023a A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fe A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ea A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cc A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0194 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020f A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026b A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f4 A[Catch: all -> 0x0356, TryCatch #0 {all -> 0x0356, blocks: (B:3:0x0010, B:5:0x00bb, B:7:0x00c5, B:9:0x00cb, B:11:0x00d1, B:13:0x00d7, B:15:0x00dd, B:17:0x00e3, B:21:0x018e, B:23:0x0194, B:25:0x019a, B:27:0x01a0, B:29:0x01a6, B:31:0x01ac, B:33:0x01b2, B:36:0x01c3, B:39:0x01d2, B:42:0x01e1, B:45:0x01f5, B:48:0x0209, B:50:0x020f, B:52:0x0215, B:56:0x025c, B:57:0x0265, B:59:0x026b, B:61:0x0273, B:63:0x027b, B:65:0x0283, B:67:0x028b, B:69:0x0293, B:73:0x034b, B:76:0x02a8, B:79:0x02b7, B:82:0x02c6, B:85:0x02da, B:88:0x02ee, B:90:0x02f4, B:92:0x02fa, B:96:0x0342, B:97:0x0304, B:100:0x0316, B:103:0x0328, B:106:0x033b, B:107:0x0331, B:108:0x031f, B:109:0x030d, B:110:0x02e3, B:111:0x02cf, B:112:0x02c0, B:113:0x02b1, B:119:0x021f, B:122:0x0231, B:125:0x0243, B:128:0x0255, B:129:0x024c, B:130:0x023a, B:131:0x0228, B:132:0x01fe, B:133:0x01ea, B:134:0x01db, B:135:0x01cc, B:138:0x00ee, B:141:0x00fd, B:144:0x010c, B:147:0x0120, B:150:0x0134, B:152:0x013a, B:154:0x0140, B:158:0x0187, B:159:0x014a, B:162:0x015c, B:165:0x016e, B:168:0x0180, B:169:0x0177, B:170:0x0165, B:171:0x0153, B:172:0x0129, B:173:0x0115, B:174:0x0106, B:175:0x00f7), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata cardArtMetadata;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt;
        int i;
        int i2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata cardArtMetadata2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata cardArtMetadata3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "payPalCardId");
            int columnIndexOrThrow2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_sourceUrl");
            int columnIndexOrThrow3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_mimeType");
            int columnIndexOrThrow4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_width");
            int columnIndexOrThrow5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_height");
            int columnIndexOrThrow6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_backgroundColor");
            int columnIndexOrThrow7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_foregroundColor");
            int columnIndexOrThrow8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "primary_labelColor");
            int columnIndexOrThrow9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_sourceUrl");
            int columnIndexOrThrow10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_mimeType");
            int columnIndexOrThrow11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_width");
            int columnIndexOrThrow12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_height");
            int columnIndexOrThrow13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_backgroundColor");
            int columnIndexOrThrow14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_foregroundColor");
            int columnIndexOrThrow15 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "thumbnail_labelColor");
            int columnIndexOrThrow16 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_sourceUrl");
            int columnIndexOrThrow17 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_mimeType");
            int columnIndexOrThrow18 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_width");
            int columnIndexOrThrow19 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_height");
            int columnIndexOrThrow20 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_backgroundColor");
            int columnIndexOrThrow21 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_foregroundColor");
            int columnIndexOrThrow22 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stack_view_labelColor");
            com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity = null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3 = null;
            if (prepare.step()) {
                java.lang.String text = prepare.getText(columnIndexOrThrow);
                if (prepare.isNull(columnIndexOrThrow2) && prepare.isNull(columnIndexOrThrow3) && prepare.isNull(columnIndexOrThrow4) && prepare.isNull(columnIndexOrThrow5) && prepare.isNull(columnIndexOrThrow6) && prepare.isNull(columnIndexOrThrow7) && prepare.isNull(columnIndexOrThrow8)) {
                    cardArt = null;
                    if (!prepare.isNull(columnIndexOrThrow9) && prepare.isNull(columnIndexOrThrow10) && prepare.isNull(columnIndexOrThrow11) && prepare.isNull(columnIndexOrThrow12) && prepare.isNull(columnIndexOrThrow13) && prepare.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow15;
                        if (prepare.isNull(i)) {
                            i2 = columnIndexOrThrow16;
                            cardArt2 = null;
                            if (prepare.isNull(i2)) {
                                i3 = columnIndexOrThrow17;
                            } else {
                                i3 = columnIndexOrThrow17;
                                if (prepare.isNull(i3)) {
                                    i4 = columnIndexOrThrow18;
                                    if (prepare.isNull(i4)) {
                                        i5 = columnIndexOrThrow19;
                                        if (prepare.isNull(i5)) {
                                            i6 = columnIndexOrThrow20;
                                            if (prepare.isNull(i6)) {
                                                i7 = columnIndexOrThrow21;
                                                if (prepare.isNull(i7)) {
                                                    if (!prepare.isNull(columnIndexOrThrow22)) {
                                                    }
                                                    cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                                }
                                                java.lang.String text2 = !prepare.isNull(i2) ? null : prepare.getText(i2);
                                                java.lang.String text3 = !prepare.isNull(i3) ? null : prepare.getText(i3);
                                                java.lang.Integer valueOf = !prepare.isNull(i4) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i4));
                                                java.lang.Integer valueOf2 = !prepare.isNull(i5) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i5));
                                                if (prepare.isNull(i6) && prepare.isNull(i7) && prepare.isNull(columnIndexOrThrow22)) {
                                                    cardArtMetadata2 = null;
                                                    cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                                    cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                                }
                                                cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                                                cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                                cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                            }
                                            i7 = columnIndexOrThrow21;
                                            if (!prepare.isNull(i2)) {
                                            }
                                            if (!prepare.isNull(i3)) {
                                            }
                                            if (!prepare.isNull(i4)) {
                                            }
                                            if (!prepare.isNull(i5)) {
                                            }
                                            if (prepare.isNull(i6)) {
                                                cardArtMetadata2 = null;
                                                cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                                cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                            }
                                            cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                                            cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                            cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                        }
                                        i6 = columnIndexOrThrow20;
                                        i7 = columnIndexOrThrow21;
                                        if (!prepare.isNull(i2)) {
                                        }
                                        if (!prepare.isNull(i3)) {
                                        }
                                        if (!prepare.isNull(i4)) {
                                        }
                                        if (!prepare.isNull(i5)) {
                                        }
                                        if (prepare.isNull(i6)) {
                                        }
                                        cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                                        cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                        cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                    }
                                    i5 = columnIndexOrThrow19;
                                    i6 = columnIndexOrThrow20;
                                    i7 = columnIndexOrThrow21;
                                    if (!prepare.isNull(i2)) {
                                    }
                                    if (!prepare.isNull(i3)) {
                                    }
                                    if (!prepare.isNull(i4)) {
                                    }
                                    if (!prepare.isNull(i5)) {
                                    }
                                    if (prepare.isNull(i6)) {
                                    }
                                    cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                                    cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                                    cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                                }
                            }
                            i4 = columnIndexOrThrow18;
                            i5 = columnIndexOrThrow19;
                            i6 = columnIndexOrThrow20;
                            i7 = columnIndexOrThrow21;
                            if (!prepare.isNull(i2)) {
                            }
                            if (!prepare.isNull(i3)) {
                            }
                            if (!prepare.isNull(i4)) {
                            }
                            if (!prepare.isNull(i5)) {
                            }
                            if (prepare.isNull(i6)) {
                            }
                            cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                            cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                            cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                        }
                    } else {
                        i = columnIndexOrThrow15;
                    }
                    java.lang.String text4 = prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9);
                    java.lang.String text5 = prepare.isNull(columnIndexOrThrow10) ? null : prepare.getText(columnIndexOrThrow10);
                    java.lang.Integer valueOf3 = prepare.isNull(columnIndexOrThrow11) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow11));
                    java.lang.Integer valueOf4 = prepare.isNull(columnIndexOrThrow12) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow12));
                    if (prepare.isNull(columnIndexOrThrow13) && prepare.isNull(columnIndexOrThrow14) && prepare.isNull(i)) {
                        cardArtMetadata3 = null;
                        cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text4, text5, valueOf3, valueOf4, cardArtMetadata3);
                        i2 = columnIndexOrThrow16;
                        if (prepare.isNull(i2)) {
                        }
                        i4 = columnIndexOrThrow18;
                        i5 = columnIndexOrThrow19;
                        i6 = columnIndexOrThrow20;
                        i7 = columnIndexOrThrow21;
                        if (!prepare.isNull(i2)) {
                        }
                        if (!prepare.isNull(i3)) {
                        }
                        if (!prepare.isNull(i4)) {
                        }
                        if (!prepare.isNull(i5)) {
                        }
                        if (prepare.isNull(i6)) {
                        }
                        cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                        cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                        cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                    }
                    cardArtMetadata3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(prepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow13)), prepare.isNull(columnIndexOrThrow14) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow14)), prepare.isNull(i) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i)));
                    cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text4, text5, valueOf3, valueOf4, cardArtMetadata3);
                    i2 = columnIndexOrThrow16;
                    if (prepare.isNull(i2)) {
                    }
                    i4 = columnIndexOrThrow18;
                    i5 = columnIndexOrThrow19;
                    i6 = columnIndexOrThrow20;
                    i7 = columnIndexOrThrow21;
                    if (!prepare.isNull(i2)) {
                    }
                    if (!prepare.isNull(i3)) {
                    }
                    if (!prepare.isNull(i4)) {
                    }
                    if (!prepare.isNull(i5)) {
                    }
                    if (prepare.isNull(i6)) {
                    }
                    cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                    cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                    cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                }
                java.lang.String text6 = prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2);
                java.lang.String text7 = prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3);
                java.lang.Integer valueOf5 = prepare.isNull(columnIndexOrThrow4) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow4));
                java.lang.Integer valueOf6 = prepare.isNull(columnIndexOrThrow5) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow5));
                if (prepare.isNull(columnIndexOrThrow6) && prepare.isNull(columnIndexOrThrow7) && prepare.isNull(columnIndexOrThrow8)) {
                    cardArtMetadata = null;
                    cardArt = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text6, text7, valueOf5, valueOf6, cardArtMetadata);
                    if (!prepare.isNull(columnIndexOrThrow9)) {
                    }
                    i = columnIndexOrThrow15;
                    if (prepare.isNull(columnIndexOrThrow9)) {
                    }
                    if (prepare.isNull(columnIndexOrThrow10)) {
                    }
                    if (prepare.isNull(columnIndexOrThrow11)) {
                    }
                    if (prepare.isNull(columnIndexOrThrow12)) {
                    }
                    if (prepare.isNull(columnIndexOrThrow13)) {
                        cardArtMetadata3 = null;
                        cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text4, text5, valueOf3, valueOf4, cardArtMetadata3);
                        i2 = columnIndexOrThrow16;
                        if (prepare.isNull(i2)) {
                        }
                        i4 = columnIndexOrThrow18;
                        i5 = columnIndexOrThrow19;
                        i6 = columnIndexOrThrow20;
                        i7 = columnIndexOrThrow21;
                        if (!prepare.isNull(i2)) {
                        }
                        if (!prepare.isNull(i3)) {
                        }
                        if (!prepare.isNull(i4)) {
                        }
                        if (!prepare.isNull(i5)) {
                        }
                        if (prepare.isNull(i6)) {
                        }
                        cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                        cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                        cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                    }
                    cardArtMetadata3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(prepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow13)), prepare.isNull(columnIndexOrThrow14) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow14)), prepare.isNull(i) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i)));
                    cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text4, text5, valueOf3, valueOf4, cardArtMetadata3);
                    i2 = columnIndexOrThrow16;
                    if (prepare.isNull(i2)) {
                    }
                    i4 = columnIndexOrThrow18;
                    i5 = columnIndexOrThrow19;
                    i6 = columnIndexOrThrow20;
                    i7 = columnIndexOrThrow21;
                    if (!prepare.isNull(i2)) {
                    }
                    if (!prepare.isNull(i3)) {
                    }
                    if (!prepare.isNull(i4)) {
                    }
                    if (!prepare.isNull(i5)) {
                    }
                    if (prepare.isNull(i6)) {
                    }
                    cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                    cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                    cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
                }
                cardArtMetadata = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(prepare.isNull(columnIndexOrThrow6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow6)), prepare.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow7)), prepare.isNull(columnIndexOrThrow8) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow8)));
                cardArt = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text6, text7, valueOf5, valueOf6, cardArtMetadata);
                if (!prepare.isNull(columnIndexOrThrow9)) {
                }
                i = columnIndexOrThrow15;
                if (prepare.isNull(columnIndexOrThrow9)) {
                }
                if (prepare.isNull(columnIndexOrThrow10)) {
                }
                if (prepare.isNull(columnIndexOrThrow11)) {
                }
                if (prepare.isNull(columnIndexOrThrow12)) {
                }
                if (prepare.isNull(columnIndexOrThrow13)) {
                }
                cardArtMetadata3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(prepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow13)), prepare.isNull(columnIndexOrThrow14) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow14)), prepare.isNull(i) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i)));
                cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text4, text5, valueOf3, valueOf4, cardArtMetadata3);
                i2 = columnIndexOrThrow16;
                if (prepare.isNull(i2)) {
                }
                i4 = columnIndexOrThrow18;
                i5 = columnIndexOrThrow19;
                i6 = columnIndexOrThrow20;
                i7 = columnIndexOrThrow21;
                if (!prepare.isNull(i2)) {
                }
                if (!prepare.isNull(i3)) {
                }
                if (!prepare.isNull(i4)) {
                }
                if (!prepare.isNull(i5)) {
                }
                if (prepare.isNull(i6)) {
                }
                cardArtMetadata2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(!prepare.isNull(i6) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i6)), !prepare.isNull(i7) ? null : java.lang.Integer.valueOf((int) prepare.getLong(i7)), prepare.isNull(columnIndexOrThrow22) ? null : java.lang.Integer.valueOf((int) prepare.getLong(columnIndexOrThrow22)));
                cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(text2, text3, valueOf, valueOf2, cardArtMetadata2);
                cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(text, cardArt, cardArt2, cardArt3);
            }
            return cardArtCollectionEntity;
        } finally {
            prepare.close();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao
    public final java.lang.Object deleteCardArtCollectionEntity(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final java.lang.String str2 = "DELETE FROM cardArtCollectionEntity WHERE payPalCardId = ?";
        java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(this.getHighSpeedVideoFpsRanges, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl.getHighSpeedVideoSizes(str2, str, (androidx.database.SQLiteConnection) obj);
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$rAvHghSEONv8qSV6ld07W4zvt5U(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao_Impl cardArtDao_Impl, com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        cardArtDao_Impl.getHighResolutionOutputSizeshNQ4ISI.upsert(sQLiteConnection, (androidx.database.SQLiteConnection) cardArtCollectionEntity);
        return kotlin.Unit.INSTANCE;
    }
}
