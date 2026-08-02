package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/work/impl/model/DependencyDao_Impl;", "Landroidx/work/impl/model/DependencyDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/Dependency;", "dependency", "", "insertDependency", "(Landroidx/work/impl/model/Dependency;)V", "", "id", "", "hasCompletedAllPrerequisites", "(Ljava/lang/String;)Z", "", "getPrerequisites", "(Ljava/lang/String;)Ljava/util/List;", "getDependentWorkIds", "hasDependents", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoSizes", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DependencyDao_Impl implements androidx.work.impl.model.DependencyDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.DependencyDao_Impl.Companion INSTANCE = new androidx.work.impl.model.DependencyDao_Impl.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.Dependency> getHighSpeedVideoFpsRangesFor;

    public DependencyDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        this.getHighSpeedVideoFpsRangesFor = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.Dependency>() { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.Dependency entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getWorkSpecId());
                statement.mo9287bindText(2, entity.getPrerequisiteId());
            }
        };
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final void insertDependency(final androidx.work.impl.model.Dependency dependency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dependency, "");
        androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.DependencyDao_Impl.$r8$lambda$bODlJfJugFiPnEHw_lj7V3cbm8M(androidx.work.impl.model.DependencyDao_Impl.this, dependency, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean hasCompletedAllPrerequisites(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((java.lang.Boolean) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.work.impl.model.DependencyDao_Impl.getHighSpeedVideoSizes(str, id, (androidx.database.SQLiteConnection) obj);
                return java.lang.Boolean.valueOf(highSpeedVideoSizes);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (((int) r3.getLong(0)) != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        boolean z = true;
        try {
            prepare.mo9287bindText(1, str2);
            if (prepare.step()) {
            }
            z = false;
            return z;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final java.util.List<java.lang.String> getPrerequisites(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT prerequisite_id FROM dependency WHERE work_spec_id=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.work.impl.model.DependencyDao_Impl.Camera2StreamConfigurationMap(str, id, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @Override // androidx.work.impl.model.DependencyDao
    public final java.util.List<java.lang.String> getDependentWorkIds(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.work.impl.model.DependencyDao_Impl.getHighSpeedVideoFpsRangesFor(str, id, (androidx.database.SQLiteConnection) obj);
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

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean hasDependents(final java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        final java.lang.String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((java.lang.Boolean) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.work.impl.model.DependencyDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str, id, (androidx.database.SQLiteConnection) obj);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (((int) r3.getLong(0)) != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        boolean z = true;
        try {
            prepare.mo9287bindText(1, str2);
            if (prepare.step()) {
            }
            z = false;
            return z;
        } finally {
            prepare.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/DependencyDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$bODlJfJugFiPnEHw_lj7V3cbm8M(androidx.work.impl.model.DependencyDao_Impl dependencyDao_Impl, androidx.work.impl.model.Dependency dependency, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        dependencyDao_Impl.getHighSpeedVideoFpsRangesFor.insert(sQLiteConnection, (androidx.database.SQLiteConnection) dependency);
        return kotlin.Unit.INSTANCE;
    }
}
