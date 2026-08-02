package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/model/PreferenceDao_Impl;", "Landroidx/work/impl/model/PreferenceDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/work/impl/model/Preference;", "preference", "", "insertPreference", "(Landroidx/work/impl/model/Preference;)V", "", "key", "", "getLongValue", "(Ljava/lang/String;)Ljava/lang/Long;", "Landroidx/lifecycle/LiveData;", "getObservableLongValue", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "Camera2StreamConfigurationMap", "Landroidx/room/RoomDatabase;", "getHighSpeedVideoFpsRanges", "Landroidx/room/EntityInsertAdapter;", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/EntityInsertAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreferenceDao_Impl implements androidx.work.impl.model.PreferenceDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.PreferenceDao_Impl.Companion INSTANCE = new androidx.work.impl.model.PreferenceDao_Impl.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.room.EntityInsertAdapter<androidx.work.impl.model.Preference> getHighResolutionOutputSizeshNQ4ISI;

    public PreferenceDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRanges = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.room.EntityInsertAdapter<androidx.work.impl.model.Preference>() { // from class: androidx.work.impl.model.PreferenceDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public final java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public final void bind(androidx.database.SQLiteStatement statement, androidx.work.impl.model.Preference entity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
                statement.mo9287bindText(1, entity.getKey());
                java.lang.Long value = entity.getValue();
                if (value == null) {
                    statement.mo9286bindNull(2);
                } else {
                    statement.mo9285bindLong(2, value.longValue());
                }
            }
        };
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final void insertPreference(final androidx.work.impl.model.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRanges, false, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.PreferenceDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.impl.model.PreferenceDao_Impl.$r8$lambda$pV7ZAv1ABN_GLbYRS_jnXDCXzyk(androidx.work.impl.model.PreferenceDao_Impl.this, preference, (androidx.database.SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final java.lang.Long getLongValue(final java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.String str = "SELECT long_value FROM Preference where `key`=?";
        return (java.lang.Long) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRanges, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.PreferenceDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Long highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.work.impl.model.PreferenceDao_Impl.getHighSpeedVideoFpsRangesFor(str, key, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Long getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            java.lang.Long l = null;
            if (prepare.step() && !prepare.isNull(0)) {
                l = java.lang.Long.valueOf(prepare.getLong(0));
            }
            return l;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final androidx.view.LiveData<java.lang.Long> getObservableLongValue(final java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.String str = "SELECT long_value FROM Preference where `key`=?";
        return this.getHighSpeedVideoFpsRanges.getInvalidationTracker().createLiveData(new java.lang.String[]{"Preference"}, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.PreferenceDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Long Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.work.impl.model.PreferenceDao_Impl.Camera2StreamConfigurationMap(str, key, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Long Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo9287bindText(1, str2);
            java.lang.Long l = null;
            if (prepare.step() && !prepare.isNull(0)) {
                l = java.lang.Long.valueOf(prepare.getLong(0));
            }
            return l;
        } finally {
            prepare.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/PreferenceDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$pV7ZAv1ABN_GLbYRS_jnXDCXzyk(androidx.work.impl.model.PreferenceDao_Impl preferenceDao_Impl, androidx.work.impl.model.Preference preference, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        preferenceDao_Impl.getHighResolutionOutputSizeshNQ4ISI.insert(sQLiteConnection, (androidx.database.SQLiteConnection) preference);
        return kotlin.Unit.INSTANCE;
    }
}
