package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl;", "Landroidx/work/impl/model/RawWorkInfoDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Landroidx/sqlite/db/SupportSQLiteQuery;", "query", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkInfoPojos", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "getWorkInfoPojosLiveData", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/Flow;", "getWorkInfoPojosFlow", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/sqlite/SQLiteConnection;", "p0", "Landroidx/collection/ArrayMap;", "", "", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)V", "Landroidx/work/Data;", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawWorkInfoDao_Impl implements androidx.work.impl.model.RawWorkInfoDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.model.RawWorkInfoDao_Impl.Companion INSTANCE = new androidx.work.impl.model.RawWorkInfoDao_Impl.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;

    public RawWorkInfoDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkInfoPojos(androidx.database.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        final androidx.room.RoomRawQuery roomRawQuery = androidx.room.RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final java.lang.String sql = roomRawQuery.getSql();
        return (java.util.List) androidx.room.util.DBUtil.performBlocking(this.getHighSpeedVideoFpsRangesFor, true, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.work.impl.model.RawWorkInfoDao_Impl.getHighSpeedVideoFpsRanges(sql, roomRawQuery, this, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281 A[Catch: all -> 0x033e, LOOP:1: B:20:0x0116->B:71:0x0281, LOOP_END, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List getHighSpeedVideoFpsRanges(java.lang.String str, androidx.room.RoomRawQuery roomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl rawWorkInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        long j;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        boolean z4;
        long j4;
        int i24;
        long j5;
        int i25;
        int i26;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            java.lang.String str2 = "getValue(...)";
            int columnIndex13 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            androidx.collection.ArrayMap<java.lang.String, java.util.List<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
            int i27 = columnIndex12;
            androidx.collection.ArrayMap<java.lang.String, java.util.List<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
            while (prepare.step()) {
                int i28 = columnIndex11;
                java.lang.String text = prepare.getText(columnIndex);
                if (arrayMap.containsKey(text)) {
                    i26 = columnIndex10;
                } else {
                    i26 = columnIndex10;
                    arrayMap.put(text, new java.util.ArrayList());
                }
                java.lang.String text2 = prepare.getText(columnIndex);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new java.util.ArrayList());
                }
                columnIndex11 = i28;
                columnIndex10 = i26;
            }
            int i29 = columnIndex10;
            int i30 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRangesFor(sQLiteConnection, arrayMap);
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRanges(sQLiteConnection, arrayMap2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                java.lang.String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                androidx.work.Data fromByteArray = androidx.work.Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j6 = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j7 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j8 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                int i31 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                if (columnIndex9 == -1) {
                    i = i29;
                    j = 0;
                } else {
                    j = prepare.getLong(columnIndex9);
                    i = i29;
                }
                if (i == -1) {
                    i2 = i30;
                    j2 = 0;
                } else {
                    i2 = i30;
                    j2 = prepare.getLong(i);
                }
                if (i2 == -1) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i6 = i27;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i2);
                    i6 = i27;
                }
                if (i6 == -1) {
                    i9 = columnIndex13;
                    i7 = columnIndex4;
                    i8 = 0;
                } else {
                    i7 = columnIndex4;
                    i8 = (int) prepare.getLong(i6);
                    i9 = columnIndex13;
                }
                if (i9 == -1) {
                    i10 = columnIndex14;
                    j3 = 0;
                } else {
                    j3 = prepare.getLong(i9);
                    i10 = columnIndex14;
                }
                if (i10 == -1) {
                    i11 = i6;
                    columnIndex13 = i9;
                    i13 = columnIndex15;
                    i12 = 0;
                } else {
                    i11 = i6;
                    columnIndex13 = i9;
                    i12 = (int) prepare.getLong(i10);
                    i13 = columnIndex15;
                }
                if (i13 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                int i32 = i10;
                androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType((int) prepare.getLong(i13));
                int i33 = columnIndex16;
                if (i33 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                androidx.work.impl.utils.NetworkRequestCompat networkRequest$work_runtime_release = androidx.work.impl.model.WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i33));
                int i34 = columnIndex17;
                if (i34 == -1) {
                    i14 = i13;
                    i15 = i33;
                    i16 = columnIndex18;
                    z = false;
                } else {
                    i14 = i13;
                    i15 = i33;
                    z = ((int) prepare.getLong(i34)) != 0;
                    i16 = columnIndex18;
                }
                if (i16 == -1) {
                    i17 = i34;
                    i18 = columnIndex19;
                    z2 = false;
                } else {
                    i17 = i34;
                    z2 = ((int) prepare.getLong(i16)) != 0;
                    i18 = columnIndex19;
                }
                if (i18 == -1) {
                    i19 = columnIndex5;
                } else {
                    i19 = columnIndex5;
                    if (((int) prepare.getLong(i18)) != 0) {
                        i20 = columnIndex20;
                        z3 = true;
                        if (i20 != -1) {
                            i21 = i16;
                            i22 = i18;
                        } else {
                            i21 = i16;
                            i22 = i18;
                            if (((int) prepare.getLong(i20)) != 0) {
                                i23 = columnIndex21;
                                z4 = true;
                                if (i23 == -1) {
                                    i24 = columnIndex22;
                                    j4 = 0;
                                } else {
                                    j4 = prepare.getLong(i23);
                                    i24 = columnIndex22;
                                }
                                if (i24 == -1) {
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                    j5 = 0;
                                } else {
                                    j5 = prepare.getLong(i24);
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                }
                                if (i25 == -1) {
                                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                                }
                                androidx.work.Constraints constraints = new androidx.work.Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j4, j5, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i25)));
                                columnIndex23 = i25;
                                java.lang.Object value = kotlin.collections.MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                                java.lang.String str3 = str2;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, str3);
                                java.util.List list = (java.util.List) value;
                                java.lang.Object value2 = kotlin.collections.MapsKt.getValue(arrayMap2, prepare.getText(columnIndex));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, str3);
                                arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j6, j7, j8, constraints, i31, intToBackoffPolicy, j, j2, i5, i8, j3, i12, list, (java.util.List) value2));
                                columnIndex = columnIndex;
                                str2 = str3;
                                columnIndex22 = i24;
                                columnIndex2 = i3;
                                columnIndex3 = i4;
                                columnIndex16 = i15;
                                i29 = i;
                                i30 = i2;
                                int i35 = i22;
                                columnIndex20 = i20;
                                columnIndex4 = i7;
                                i27 = i11;
                                columnIndex14 = i32;
                                columnIndex15 = i14;
                                columnIndex17 = i17;
                                columnIndex18 = i21;
                                columnIndex5 = i19;
                                columnIndex19 = i35;
                            }
                        }
                        i23 = columnIndex21;
                        z4 = false;
                        if (i23 == -1) {
                        }
                        if (i24 == -1) {
                        }
                        if (i25 == -1) {
                        }
                    }
                }
                i20 = columnIndex20;
                z3 = false;
                if (i20 != -1) {
                }
                i23 = columnIndex21;
                z4 = false;
                if (i23 == -1) {
                }
                if (i24 == -1) {
                }
                if (i25 == -1) {
                }
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final androidx.view.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(androidx.database.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        final androidx.room.RoomRawQuery roomRawQuery = androidx.room.RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final java.lang.String sql = roomRawQuery.getSql();
        return this.getHighSpeedVideoFpsRangesFor.getInvalidationTracker().createLiveData(new java.lang.String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.work.impl.model.RawWorkInfoDao_Impl.getHighSpeedVideoSizes(sql, roomRawQuery, this, (androidx.database.SQLiteConnection) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281 A[Catch: all -> 0x033e, LOOP:1: B:20:0x0116->B:71:0x0281, LOOP_END, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List getHighSpeedVideoSizes(java.lang.String str, androidx.room.RoomRawQuery roomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl rawWorkInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        long j;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        boolean z4;
        long j4;
        int i24;
        long j5;
        int i25;
        int i26;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            java.lang.String str2 = "getValue(...)";
            int columnIndex13 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            androidx.collection.ArrayMap<java.lang.String, java.util.List<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
            int i27 = columnIndex12;
            androidx.collection.ArrayMap<java.lang.String, java.util.List<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
            while (prepare.step()) {
                int i28 = columnIndex11;
                java.lang.String text = prepare.getText(columnIndex);
                if (arrayMap.containsKey(text)) {
                    i26 = columnIndex10;
                } else {
                    i26 = columnIndex10;
                    arrayMap.put(text, new java.util.ArrayList());
                }
                java.lang.String text2 = prepare.getText(columnIndex);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new java.util.ArrayList());
                }
                columnIndex11 = i28;
                columnIndex10 = i26;
            }
            int i29 = columnIndex10;
            int i30 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRangesFor(sQLiteConnection, arrayMap);
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRanges(sQLiteConnection, arrayMap2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                java.lang.String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                androidx.work.Data fromByteArray = androidx.work.Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j6 = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j7 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j8 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                int i31 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                if (columnIndex9 == -1) {
                    i = i29;
                    j = 0;
                } else {
                    j = prepare.getLong(columnIndex9);
                    i = i29;
                }
                if (i == -1) {
                    i2 = i30;
                    j2 = 0;
                } else {
                    i2 = i30;
                    j2 = prepare.getLong(i);
                }
                if (i2 == -1) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i6 = i27;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i2);
                    i6 = i27;
                }
                if (i6 == -1) {
                    i9 = columnIndex13;
                    i7 = columnIndex4;
                    i8 = 0;
                } else {
                    i7 = columnIndex4;
                    i8 = (int) prepare.getLong(i6);
                    i9 = columnIndex13;
                }
                if (i9 == -1) {
                    i10 = columnIndex14;
                    j3 = 0;
                } else {
                    j3 = prepare.getLong(i9);
                    i10 = columnIndex14;
                }
                if (i10 == -1) {
                    i11 = i6;
                    columnIndex13 = i9;
                    i13 = columnIndex15;
                    i12 = 0;
                } else {
                    i11 = i6;
                    columnIndex13 = i9;
                    i12 = (int) prepare.getLong(i10);
                    i13 = columnIndex15;
                }
                if (i13 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                int i32 = i10;
                androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType((int) prepare.getLong(i13));
                int i33 = columnIndex16;
                if (i33 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                androidx.work.impl.utils.NetworkRequestCompat networkRequest$work_runtime_release = androidx.work.impl.model.WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i33));
                int i34 = columnIndex17;
                if (i34 == -1) {
                    i14 = i13;
                    i15 = i33;
                    i16 = columnIndex18;
                    z = false;
                } else {
                    i14 = i13;
                    i15 = i33;
                    z = ((int) prepare.getLong(i34)) != 0;
                    i16 = columnIndex18;
                }
                if (i16 == -1) {
                    i17 = i34;
                    i18 = columnIndex19;
                    z2 = false;
                } else {
                    i17 = i34;
                    z2 = ((int) prepare.getLong(i16)) != 0;
                    i18 = columnIndex19;
                }
                if (i18 == -1) {
                    i19 = columnIndex5;
                } else {
                    i19 = columnIndex5;
                    if (((int) prepare.getLong(i18)) != 0) {
                        i20 = columnIndex20;
                        z3 = true;
                        if (i20 != -1) {
                            i21 = i16;
                            i22 = i18;
                        } else {
                            i21 = i16;
                            i22 = i18;
                            if (((int) prepare.getLong(i20)) != 0) {
                                i23 = columnIndex21;
                                z4 = true;
                                if (i23 == -1) {
                                    i24 = columnIndex22;
                                    j4 = 0;
                                } else {
                                    j4 = prepare.getLong(i23);
                                    i24 = columnIndex22;
                                }
                                if (i24 == -1) {
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                    j5 = 0;
                                } else {
                                    j5 = prepare.getLong(i24);
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                }
                                if (i25 == -1) {
                                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                                }
                                androidx.work.Constraints constraints = new androidx.work.Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j4, j5, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i25)));
                                columnIndex23 = i25;
                                java.lang.Object value = kotlin.collections.MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                                java.lang.String str3 = str2;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, str3);
                                java.util.List list = (java.util.List) value;
                                java.lang.Object value2 = kotlin.collections.MapsKt.getValue(arrayMap2, prepare.getText(columnIndex));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, str3);
                                arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j6, j7, j8, constraints, i31, intToBackoffPolicy, j, j2, i5, i8, j3, i12, list, (java.util.List) value2));
                                columnIndex = columnIndex;
                                str2 = str3;
                                columnIndex22 = i24;
                                columnIndex2 = i3;
                                columnIndex3 = i4;
                                columnIndex16 = i15;
                                i29 = i;
                                i30 = i2;
                                int i35 = i22;
                                columnIndex20 = i20;
                                columnIndex4 = i7;
                                i27 = i11;
                                columnIndex14 = i32;
                                columnIndex15 = i14;
                                columnIndex17 = i17;
                                columnIndex18 = i21;
                                columnIndex5 = i19;
                                columnIndex19 = i35;
                            }
                        }
                        i23 = columnIndex21;
                        z4 = false;
                        if (i23 == -1) {
                        }
                        if (i24 == -1) {
                        }
                        if (i25 == -1) {
                        }
                    }
                }
                i20 = columnIndex20;
                z3 = false;
                if (i20 != -1) {
                }
                i23 = columnIndex21;
                z4 = false;
                if (i23 == -1) {
                }
                if (i24 == -1) {
                }
                if (i25 == -1) {
                }
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(androidx.database.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        final androidx.room.RoomRawQuery roomRawQuery = androidx.room.RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final java.lang.String sql = roomRawQuery.getSql();
        return androidx.room.coroutines.FlowUtil.createFlow(this.getHighSpeedVideoFpsRangesFor, false, new java.lang.String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.work.impl.model.RawWorkInfoDao_Impl.Camera2StreamConfigurationMap(sql, roomRawQuery, this, (androidx.database.SQLiteConnection) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281 A[Catch: all -> 0x033e, LOOP:1: B:20:0x0116->B:71:0x0281, LOOP_END, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:3:0x000f, B:5:0x0062, B:6:0x00c6, B:8:0x00cc, B:10:0x00d8, B:11:0x00e9, B:13:0x00f3, B:19:0x0102, B:20:0x0116, B:24:0x011f, B:26:0x0125, B:28:0x0130, B:39:0x0165, B:53:0x01df, B:55:0x01ee, B:71:0x0281, B:73:0x02ea, B:74:0x02f5, B:76:0x0275, B:77:0x0266, B:78:0x024c, B:81:0x0239, B:84:0x021f, B:89:0x0203, B:95:0x02f6, B:96:0x0301, B:98:0x0302, B:99:0x030d, B:100:0x01d0, B:101:0x01bf, B:102:0x01ad, B:103:0x0197, B:104:0x0184, B:105:0x0175, B:107:0x030e, B:108:0x0319, B:109:0x015c, B:110:0x0151, B:111:0x0148, B:112:0x013f, B:114:0x031a, B:115:0x0325, B:117:0x0326, B:118:0x0331, B:120:0x0332, B:121:0x033d), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List Camera2StreamConfigurationMap(java.lang.String str, androidx.room.RoomRawQuery roomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl rawWorkInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection) {
        long j;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        int i23;
        boolean z4;
        long j4;
        int i24;
        long j5;
        int i25;
        int i26;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            java.lang.String str2 = "getValue(...)";
            int columnIndex13 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            androidx.collection.ArrayMap<java.lang.String, java.util.List<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
            int i27 = columnIndex12;
            androidx.collection.ArrayMap<java.lang.String, java.util.List<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
            while (prepare.step()) {
                int i28 = columnIndex11;
                java.lang.String text = prepare.getText(columnIndex);
                if (arrayMap.containsKey(text)) {
                    i26 = columnIndex10;
                } else {
                    i26 = columnIndex10;
                    arrayMap.put(text, new java.util.ArrayList());
                }
                java.lang.String text2 = prepare.getText(columnIndex);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new java.util.ArrayList());
                }
                columnIndex11 = i28;
                columnIndex10 = i26;
            }
            int i29 = columnIndex10;
            int i30 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRangesFor(sQLiteConnection, arrayMap);
            rawWorkInfoDao_Impl.getHighSpeedVideoFpsRanges(sQLiteConnection, arrayMap2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                java.lang.String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                androidx.work.Data fromByteArray = androidx.work.Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j6 = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j7 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j8 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                int i31 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                if (columnIndex9 == -1) {
                    i = i29;
                    j = 0;
                } else {
                    j = prepare.getLong(columnIndex9);
                    i = i29;
                }
                if (i == -1) {
                    i2 = i30;
                    j2 = 0;
                } else {
                    i2 = i30;
                    j2 = prepare.getLong(i);
                }
                if (i2 == -1) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i6 = i27;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i2);
                    i6 = i27;
                }
                if (i6 == -1) {
                    i9 = columnIndex13;
                    i7 = columnIndex4;
                    i8 = 0;
                } else {
                    i7 = columnIndex4;
                    i8 = (int) prepare.getLong(i6);
                    i9 = columnIndex13;
                }
                if (i9 == -1) {
                    i10 = columnIndex14;
                    j3 = 0;
                } else {
                    j3 = prepare.getLong(i9);
                    i10 = columnIndex14;
                }
                if (i10 == -1) {
                    i11 = i6;
                    columnIndex13 = i9;
                    i13 = columnIndex15;
                    i12 = 0;
                } else {
                    i11 = i6;
                    columnIndex13 = i9;
                    i12 = (int) prepare.getLong(i10);
                    i13 = columnIndex15;
                }
                if (i13 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                int i32 = i10;
                androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType((int) prepare.getLong(i13));
                int i33 = columnIndex16;
                if (i33 == -1) {
                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                androidx.work.impl.utils.NetworkRequestCompat networkRequest$work_runtime_release = androidx.work.impl.model.WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i33));
                int i34 = columnIndex17;
                if (i34 == -1) {
                    i14 = i13;
                    i15 = i33;
                    i16 = columnIndex18;
                    z = false;
                } else {
                    i14 = i13;
                    i15 = i33;
                    z = ((int) prepare.getLong(i34)) != 0;
                    i16 = columnIndex18;
                }
                if (i16 == -1) {
                    i17 = i34;
                    i18 = columnIndex19;
                    z2 = false;
                } else {
                    i17 = i34;
                    z2 = ((int) prepare.getLong(i16)) != 0;
                    i18 = columnIndex19;
                }
                if (i18 == -1) {
                    i19 = columnIndex5;
                } else {
                    i19 = columnIndex5;
                    if (((int) prepare.getLong(i18)) != 0) {
                        i20 = columnIndex20;
                        z3 = true;
                        if (i20 != -1) {
                            i21 = i16;
                            i22 = i18;
                        } else {
                            i21 = i16;
                            i22 = i18;
                            if (((int) prepare.getLong(i20)) != 0) {
                                i23 = columnIndex21;
                                z4 = true;
                                if (i23 == -1) {
                                    i24 = columnIndex22;
                                    j4 = 0;
                                } else {
                                    j4 = prepare.getLong(i23);
                                    i24 = columnIndex22;
                                }
                                if (i24 == -1) {
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                    j5 = 0;
                                } else {
                                    j5 = prepare.getLong(i24);
                                    columnIndex21 = i23;
                                    i25 = columnIndex23;
                                }
                                if (i25 == -1) {
                                    throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                                }
                                androidx.work.Constraints constraints = new androidx.work.Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j4, j5, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i25)));
                                columnIndex23 = i25;
                                java.lang.Object value = kotlin.collections.MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                                java.lang.String str3 = str2;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, str3);
                                java.util.List list = (java.util.List) value;
                                java.lang.Object value2 = kotlin.collections.MapsKt.getValue(arrayMap2, prepare.getText(columnIndex));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, str3);
                                arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j6, j7, j8, constraints, i31, intToBackoffPolicy, j, j2, i5, i8, j3, i12, list, (java.util.List) value2));
                                columnIndex = columnIndex;
                                str2 = str3;
                                columnIndex22 = i24;
                                columnIndex2 = i3;
                                columnIndex3 = i4;
                                columnIndex16 = i15;
                                i29 = i;
                                i30 = i2;
                                int i35 = i22;
                                columnIndex20 = i20;
                                columnIndex4 = i7;
                                i27 = i11;
                                columnIndex14 = i32;
                                columnIndex15 = i14;
                                columnIndex17 = i17;
                                columnIndex18 = i21;
                                columnIndex5 = i19;
                                columnIndex19 = i35;
                            }
                        }
                        i23 = columnIndex21;
                        z4 = false;
                        if (i23 == -1) {
                        }
                        if (i24 == -1) {
                        }
                        if (i25 == -1) {
                        }
                    }
                }
                i20 = columnIndex20;
                z3 = false;
                if (i20 != -1) {
                }
                i23 = columnIndex21;
                z4 = false;
                if (i23 == -1) {
                }
                if (i24 == -1) {
                }
                if (i25 == -1) {
                }
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(final androidx.database.SQLiteConnection p0, androidx.collection.ArrayMap<java.lang.String, java.util.List<java.lang.String>> p1) {
        java.util.Set<java.lang.String> keySet = p1.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (p1.getCamera2StreamConfigurationMap() > 999) {
            androidx.room.util.RelationUtil.recursiveFetchArrayMap(p1, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.work.impl.model.RawWorkInfoDao_Impl.$r8$lambda$4EzUPbvEU8_RbXz83U5zmk60Osk(androidx.work.impl.model.RawWorkInfoDao_Impl.this, p0, (androidx.collection.ArrayMap) obj);
                }
            });
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        androidx.room.util.StringUtil.appendPlaceholders(sb, keySet.size());
        sb.append(")");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        androidx.database.SQLiteStatement prepare = p0.prepare(obj);
        java.util.Iterator<java.lang.String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            prepare.mo9287bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (prepare.step()) {
                java.util.List<java.lang.String> list = p1.get(prepare.getText(columnIndex));
                if (list != null) {
                    list.add(prepare.getText(0));
                }
            }
        } finally {
            prepare.close();
        }
    }

    private final void getHighSpeedVideoFpsRanges(final androidx.database.SQLiteConnection p0, androidx.collection.ArrayMap<java.lang.String, java.util.List<androidx.work.Data>> p1) {
        java.util.Set<java.lang.String> keySet = p1.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (p1.getCamera2StreamConfigurationMap() > 999) {
            androidx.room.util.RelationUtil.recursiveFetchArrayMap(p1, true, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.work.impl.model.RawWorkInfoDao_Impl.$r8$lambda$jWm1yPOzEKWYaUDalvu7WkMtyKQ(androidx.work.impl.model.RawWorkInfoDao_Impl.this, p0, (androidx.collection.ArrayMap) obj);
                }
            });
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        androidx.room.util.StringUtil.appendPlaceholders(sb, keySet.size());
        sb.append(")");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        androidx.database.SQLiteStatement prepare = p0.prepare(obj);
        java.util.Iterator<java.lang.String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            prepare.mo9287bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = androidx.room.util.SQLiteStatementUtil.getColumnIndex(prepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (prepare.step()) {
                java.util.List<androidx.work.Data> list = p1.get(prepare.getText(columnIndex));
                if (list != null) {
                    list.add(androidx.work.Data.INSTANCE.fromByteArray(prepare.getBlob(0)));
                }
            }
        } finally {
            prepare.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "getRequiredConverters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$4EzUPbvEU8_RbXz83U5zmk60Osk(androidx.work.impl.model.RawWorkInfoDao_Impl rawWorkInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection, androidx.collection.ArrayMap arrayMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        rawWorkInfoDao_Impl.getHighSpeedVideoFpsRangesFor(sQLiteConnection, arrayMap);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jWm1yPOzEKWYaUDalvu7WkMtyKQ(androidx.work.impl.model.RawWorkInfoDao_Impl rawWorkInfoDao_Impl, androidx.database.SQLiteConnection sQLiteConnection, androidx.collection.ArrayMap arrayMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        rawWorkInfoDao_Impl.getHighSpeedVideoFpsRanges(sQLiteConnection, arrayMap);
        return kotlin.Unit.INSTANCE;
    }
}
