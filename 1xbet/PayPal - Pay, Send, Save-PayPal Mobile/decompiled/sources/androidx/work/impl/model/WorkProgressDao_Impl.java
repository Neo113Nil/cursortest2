package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao_Impl;", "Landroidx/work/impl/model/WorkProgressDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/WorkProgress;", "progress", "", "insert", "(Landroidx/work/impl/model/WorkProgress;)V", "", "workSpecId", "Landroidx/work/Data;", "getProgressForWorkSpecId", "(Ljava/lang/String;)Landroidx/work/Data;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "deleteAll", "()V", "getHighSpeedVideoSizes", "Landroidx/room/RoomDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/EntityInsertAdapter;", "Landroidx/room/EntityInsertAdapter;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkProgressDao_Impl implements androidx.work.impl.model.WorkProgressDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.WorkProgressDao_Impl.Companion INSTANCE = new androidx.work.impl.model.WorkProgressDao_Impl.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkProgress> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;

    public WorkProgressDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        this.Camera2StreamConfigurationMap = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.WorkProgress>() { // from class: androidx.work.impl.model.WorkProgressDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.WorkProgress entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getWorkSpecId());
                statement.mo9283bindBlob(2, androidx.work.Data.INSTANCE.toByteArrayInternalV1(entity.getProgress()));
            }
        };
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void insert(final androidx.work.impl.model.WorkProgress progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
        androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.WorkProgressDao_Impl.m9489$r8$lambda$PINVEeB__LLptuNxhS4Ei1b1_s(androidx.work.impl.model.WorkProgressDao_Impl.this, progress, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final androidx.work.Data getProgressForWorkSpecId(final java.lang.String workSpecId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "SELECT progress FROM WorkProgress WHERE work_spec_id=?";
        return (androidx.work.Data) androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.work.Data highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.work.impl.model.WorkProgressDao_Impl.getHighResolutionOutputSizeshNQ4ISI(str, workSpecId, (androidx.database.SQLiteConnection) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.work.Data getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            androidx.work.Data data = null;
            if (prepare.step()) {
                byte[] blob = prepare.isNull(0) ? null : prepare.getBlob(0);
                if (blob != null) {
                    data = androidx.work.Data.INSTANCE.fromByteArray(blob);
                }
            }
            return data;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void delete(final java.lang.String workSpecId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "");
        final java.lang.String str = "DELETE from WorkProgress where work_spec_id=?";
        androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.work.impl.model.WorkProgressDao_Impl.Camera2StreamConfigurationMap(str, workSpecId, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void deleteAll() {
        final java.lang.String str = "DELETE FROM WorkProgress";
        androidx.room.util.DBUtil.performBlocking(this.getHighResolutionOutputSizeshNQ4ISI, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.work.impl.model.WorkProgressDao_Impl.Camera2StreamConfigurationMap(str, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.step();
            prepare.close();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* renamed from: $r8$lambda$PINVEeB__LLptu-NxhS4Ei1b1_s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9489$r8$lambda$PINVEeB__LLptuNxhS4Ei1b1_s(androidx.work.impl.model.WorkProgressDao_Impl workProgressDao_Impl, androidx.work.impl.model.WorkProgress workProgress, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        workProgressDao_Impl.Camera2StreamConfigurationMap.insert(sQLiteConnection, (androidx.database.SQLiteConnection) workProgress);
        return kotlin.Unit.INSTANCE;
    }
}
