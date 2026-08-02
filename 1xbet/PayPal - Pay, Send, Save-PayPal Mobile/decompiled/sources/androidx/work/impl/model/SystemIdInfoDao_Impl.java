package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao_Impl;", "Landroidx/work/impl/model/SystemIdInfoDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/SystemIdInfo;", "systemIdInfo", "", "insertSystemIdInfo", "(Landroidx/work/impl/model/SystemIdInfo;)V", "", "workSpecId", "", "generation", "getSystemIdInfo", "(Ljava/lang/String;I)Landroidx/work/impl/model/SystemIdInfo;", "", "getWorkSpecIds", "()Ljava/util/List;", "removeSystemIdInfo", "(Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoFpsRanges", "Landroidx/room/EntityInsertAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemIdInfoDao_Impl implements androidx.work.impl.model.SystemIdInfoDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.SystemIdInfoDao_Impl.Companion INSTANCE = new androidx.work.impl.model.SystemIdInfoDao_Impl.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.SystemIdInfo> getHighResolutionOutputSizeshNQ4ISI;

    public SystemIdInfoDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.SystemIdInfo>() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.SystemIdInfo entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.workSpecId);
                statement.mo9285bindLong(2, entity.getGeneration());
                statement.mo9285bindLong(3, entity.systemId);
            }
        };
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void insertSystemIdInfo(final androidx.work.impl.model.SystemIdInfo systemIdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemIdInfo, "");
        androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.SystemIdInfoDao_Impl.$r8$lambda$cNkqBNf5uI5fNlIEL4Q8wrQs27Q(androidx.work.impl.model.SystemIdInfoDao_Impl.this, systemIdInfo, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final androidx.work.impl.model.SystemIdInfo getSystemIdInfo(final java.lang.String workSpecId, final int generation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (androidx.work.impl.model.SystemIdInfo) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.work.impl.model.SystemIdInfo highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.work.impl.model.SystemIdInfoDao_Impl.getHighSpeedVideoFpsRanges(str, workSpecId, generation, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.work.impl.model.SystemIdInfo getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, int i, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            prepare.mo9285bindLong(2, i);
            return prepare.step() ? new androidx.work.impl.model.SystemIdInfo(prepare.getText(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "work_spec_id")), (int) prepare.getLong(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation")), (int) prepare.getLong(androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "system_id"))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final java.util.List<java.lang.String> getWorkSpecIds() {
        final java.lang.String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.work.impl.model.SystemIdInfoDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str, (androidx.database.SQLiteConnection) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void removeSystemIdInfo(final java.lang.String workSpecId, final int generation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.work.impl.model.SystemIdInfoDao_Impl.getHighSpeedVideoSizes(str, workSpecId, generation, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, int i, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            prepare.mo9285bindLong(2, i);
            prepare.step();
            prepare.close();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void removeSystemIdInfo(final java.lang.String workSpecId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.work.impl.model.SystemIdInfoDao_Impl.getHighSpeedVideoFpsRanges(str, workSpecId, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        });
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$cNkqBNf5uI5fNlIEL4Q8wrQs27Q(androidx.work.impl.model.SystemIdInfoDao_Impl systemIdInfoDao_Impl, androidx.work.impl.model.SystemIdInfo systemIdInfo, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        systemIdInfoDao_Impl.getHighResolutionOutputSizeshNQ4ISI.insert(sQLiteConnection, (androidx.database.SQLiteConnection) systemIdInfo);
        return kotlin.Unit.INSTANCE;
    }
}
