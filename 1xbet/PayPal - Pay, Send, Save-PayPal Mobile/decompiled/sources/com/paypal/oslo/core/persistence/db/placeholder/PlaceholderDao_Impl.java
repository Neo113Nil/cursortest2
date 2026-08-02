package com.paypal.oslo.core.persistence.db.placeholder;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao_Impl;", "Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "", "id", "Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderEntity;", "get", "(Ljava/lang/String;)Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderEntity;", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlaceholderDao_Impl implements com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl.Companion INSTANCE = new com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl.Companion(null);
    public static final int $stable = 8;

    public PlaceholderDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
    }

    @Override // com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao
    public final com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity get(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT * FROM core_persistence_db_placeholder WHERE id = ?";
        return (com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao_Impl.getHighSpeedVideoFpsRanges(str, id, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            int columnIndexOrThrow = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            if (prepare.step()) {
                return new com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity(prepare.getText(columnIndexOrThrow));
            }
            throw new java.lang.IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'com.paypal.oslo.core.persistence.db.placeholder.PlaceholderEntity'.".toString());
        } finally {
            prepare.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
}
