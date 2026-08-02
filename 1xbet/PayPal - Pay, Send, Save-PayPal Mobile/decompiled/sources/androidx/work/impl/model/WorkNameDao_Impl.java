package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/model/WorkNameDao_Impl;", "Landroidx/work/impl/model/WorkNameDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/WorkName;", "workName", "", "insert", "(Landroidx/work/impl/model/WorkName;)V", "", "name", "", "getWorkSpecIdsWithName", "(Ljava/lang/String;)Ljava/util/List;", "workSpecId", "getNamesForWorkSpecId", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoSizes", "Landroidx/room/EntityInsertAdapter;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkNameDao_Impl implements androidx.work.impl.model.WorkNameDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.WorkNameDao_Impl.Companion INSTANCE = new androidx.work.impl.model.WorkNameDao_Impl.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkName> Camera2StreamConfigurationMap;

    public WorkNameDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.Camera2StreamConfigurationMap = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkName>() { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.WorkName entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getName());
                statement.mo9287bindText(2, entity.getWorkSpecId());
            }
        };
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final void insert(final androidx.work.impl.model.WorkName workName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workName, "");
        androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.WorkNameDao_Impl.$r8$lambda$dEb2KnOmeWOQKPp7ENoTNKTrqo0(androidx.work.impl.model.WorkNameDao_Impl.this, workName, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final java.util.List<java.lang.String> getWorkSpecIdsWithName(final java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        final java.lang.String str = "SELECT work_spec_id FROM workname WHERE name=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.work.impl.model.WorkNameDao_Impl.getHighSpeedVideoFpsRangesFor(str, name2, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final java.util.List<java.lang.String> getNamesForWorkSpecId(final java.lang.String workSpecId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "SELECT name FROM workname WHERE work_spec_id=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.work.impl.model.WorkNameDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str, workSpecId, (androidx.database.SQLiteConnection) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/WorkNameDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$dEb2KnOmeWOQKPp7ENoTNKTrqo0(androidx.work.impl.model.WorkNameDao_Impl workNameDao_Impl, androidx.work.impl.model.WorkName workName, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        workNameDao_Impl.Camera2StreamConfigurationMap.insert(sQLiteConnection, (androidx.database.SQLiteConnection) workName);
        return kotlin.Unit.INSTANCE;
    }
}
