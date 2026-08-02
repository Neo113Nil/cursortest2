package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/work/impl/model/WorkTagDao_Impl;", "Landroidx/work/impl/model/WorkTagDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/WorkTag;", "workTag", "", "insert", "(Landroidx/work/impl/model/WorkTag;)V", "", "tag", "", "getWorkSpecIdsWithTag", "(Ljava/lang/String;)Ljava/util/List;", "id", "getTagsForWorkSpecId", "deleteByWorkSpecId", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/RoomDatabase;", "Camera2StreamConfigurationMap", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoSizes", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkTagDao_Impl implements androidx.work.impl.model.WorkTagDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.WorkTagDao_Impl.Companion INSTANCE = new androidx.work.impl.model.WorkTagDao_Impl.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkTag> getHighSpeedVideoFpsRanges;

    public WorkTagDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.Camera2StreamConfigurationMap = roomDatabase;
        this.getHighSpeedVideoFpsRanges = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkTag>() { // from class: androidx.work.impl.model.WorkTagDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.WorkTag entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getTag());
                statement.mo9287bindText(2, entity.getWorkSpecId());
            }
        };
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final void insert(final androidx.work.impl.model.WorkTag workTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workTag, "");
        androidx.room.util.DBUtil.performBlocking(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkTagDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.WorkTagDao_Impl.m9501$r8$lambda$3mSVYlBFYAbyMDyxoNuxxzbzUM(androidx.work.impl.model.WorkTagDao_Impl.this, workTag, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final java.util.List<java.lang.String> getWorkSpecIdsWithTag(final java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        final java.lang.String str = "SELECT work_spec_id FROM worktag WHERE tag=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkTagDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.work.impl.model.WorkTagDao_Impl.getHighSpeedVideoFpsRangesFor(str, tag, (androidx.database.SQLiteConnection) obj);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public final java.util.List<java.lang.String> getTagsForWorkSpecId(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.Camera2StreamConfigurationMap, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkTagDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.work.impl.model.WorkTagDao_Impl.getHighSpeedVideoFpsRanges(str, id, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @Override // androidx.work.impl.model.WorkTagDao
    public final void deleteByWorkSpecId(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "DELETE FROM worktag WHERE work_spec_id=?";
        androidx.room.util.DBUtil.performBlocking(this.Camera2StreamConfigurationMap, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkTagDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.work.impl.model.WorkTagDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str, id, (androidx.database.SQLiteConnection) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
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

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/WorkTagDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* renamed from: $r8$lambda$3mSVYlBFYAbyMDyxo-NuxxzbzUM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9501$r8$lambda$3mSVYlBFYAbyMDyxoNuxxzbzUM(androidx.work.impl.model.WorkTagDao_Impl workTagDao_Impl, androidx.work.impl.model.WorkTag workTag, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        workTagDao_Impl.getHighSpeedVideoFpsRanges.insert(sQLiteConnection, (androidx.database.SQLiteConnection) workTag);
        return kotlin.Unit.INSTANCE;
    }
}
