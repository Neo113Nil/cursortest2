package androidx.work.impl.model;

/* loaded from: classes2.dex */
public final class RawWorkInfoDao_Impl implements androidx.work.impl.model.RawWorkInfoDao {
    private final androidx.room.RoomDatabase __db;

    public RawWorkInfoDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0011, B:4:0x003a, B:6:0x0040, B:8:0x004c, B:9:0x0054, B:12:0x0060, B:17:0x0069, B:18:0x007c, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00c9, B:41:0x00be, B:42:0x00a6, B:45:0x00b2, B:46:0x00ae, B:47:0x0096, B:48:0x0086, B:51:0x008d), top: B:2:0x0011 }] */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkInfoPojos(final androidx.sqlite.db.SupportSQLiteQuery query) {
        java.lang.String string;
        androidx.work.WorkInfo.State intToState;
        androidx.work.Data fromByteArray;
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<androidx.work.Data> arrayList2;
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query2 = androidx.room.util.DBUtil.query(this.__db, query, true, null);
        try {
            int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query2, "id");
            int columnIndex2 = androidx.room.util.CursorUtil.getColumnIndex(query2, "state");
            int columnIndex3 = androidx.room.util.CursorUtil.getColumnIndex(query2, "output");
            int columnIndex4 = androidx.room.util.CursorUtil.getColumnIndex(query2, "run_attempt_count");
            int columnIndex5 = androidx.room.util.CursorUtil.getColumnIndex(query2, "generation");
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
            while (query2.moveToNext()) {
                java.lang.String string2 = query2.getString(columnIndex);
                if (arrayMap.get(string2) == null) {
                    arrayMap.put(string2, new java.util.ArrayList<>());
                }
                java.lang.String string3 = query2.getString(columnIndex);
                if (arrayMap2.get(string3) == null) {
                    arrayMap2.put(string3, new java.util.ArrayList<>());
                }
            }
            query2.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(query2.getCount());
            while (query2.moveToNext()) {
                if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                    string = query2.getString(columnIndex);
                    if (columnIndex2 != -1) {
                        intToState = null;
                    } else {
                        int i = query2.getInt(columnIndex2);
                        androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                        intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                    }
                    if (columnIndex3 != -1) {
                        fromByteArray = null;
                    } else {
                        fromByteArray = androidx.work.Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                    }
                    int i2 = columnIndex4 != -1 ? 0 : query2.getInt(columnIndex4);
                    int i3 = columnIndex5 != -1 ? 0 : query2.getInt(columnIndex5);
                    arrayList = arrayMap.get(query2.getString(columnIndex));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList<>();
                    }
                    java.util.ArrayList<java.lang.String> arrayList4 = arrayList;
                    arrayList2 = arrayMap2.get(query2.getString(columnIndex));
                    if (arrayList2 != null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    arrayList3.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i2, i3, arrayList4, arrayList2));
                }
                string = null;
                if (columnIndex2 != -1) {
                }
                if (columnIndex3 != -1) {
                }
                if (columnIndex4 != -1) {
                }
                if (columnIndex5 != -1) {
                }
                arrayList = arrayMap.get(query2.getString(columnIndex));
                if (arrayList == null) {
                }
                java.util.ArrayList<java.lang.String> arrayList42 = arrayList;
                arrayList2 = arrayMap2.get(query2.getString(columnIndex));
                if (arrayList2 != null) {
                }
                arrayList3.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i2, i3, arrayList42, arrayList2));
            }
            return arrayList3;
        } finally {
            query2.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final androidx.sqlite.db.SupportSQLiteQuery query) {
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new java.util.concurrent.Callable<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00de A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c1 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:3:0x0010, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0053, B:12:0x005f, B:17:0x0068, B:18:0x007f, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cc, B:41:0x00c1, B:42:0x00a9, B:45:0x00b5, B:46:0x00b1, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0010 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> call() throws java.lang.Exception {
                java.lang.String string;
                androidx.work.WorkInfo.State intToState;
                androidx.work.Data fromByteArray;
                java.util.ArrayList arrayList;
                java.util.ArrayList arrayList2;
                android.database.Cursor query2 = androidx.room.util.DBUtil.query(androidx.work.impl.model.RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = androidx.room.util.CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = androidx.room.util.CursorUtil.getColumnIndex(query2, "output");
                    int columnIndex4 = androidx.room.util.CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex5 = androidx.room.util.CursorUtil.getColumnIndex(query2, "generation");
                    androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                    androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
                    while (query2.moveToNext()) {
                        java.lang.String string2 = query2.getString(columnIndex);
                        if (((java.util.ArrayList) arrayMap.get(string2)) == null) {
                            arrayMap.put(string2, new java.util.ArrayList());
                        }
                        java.lang.String string3 = query2.getString(columnIndex);
                        if (((java.util.ArrayList) arrayMap2.get(string3)) == null) {
                            arrayMap2.put(string3, new java.util.ArrayList());
                        }
                    }
                    query2.moveToPosition(-1);
                    androidx.work.impl.model.RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    androidx.work.impl.model.RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                            string = query2.getString(columnIndex);
                            if (columnIndex2 != -1) {
                                intToState = null;
                            } else {
                                int i = query2.getInt(columnIndex2);
                                androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                                intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                            }
                            if (columnIndex3 != -1) {
                                fromByteArray = null;
                            } else {
                                fromByteArray = androidx.work.Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                            }
                            int i2 = columnIndex4 != -1 ? 0 : query2.getInt(columnIndex4);
                            int i3 = columnIndex5 != -1 ? 0 : query2.getInt(columnIndex5);
                            arrayList = (java.util.ArrayList) arrayMap.get(query2.getString(columnIndex));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                            }
                            java.util.ArrayList arrayList4 = arrayList;
                            arrayList2 = (java.util.ArrayList) arrayMap2.get(query2.getString(columnIndex));
                            if (arrayList2 != null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            arrayList3.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i2, i3, arrayList4, arrayList2));
                        }
                        string = null;
                        if (columnIndex2 != -1) {
                        }
                        if (columnIndex3 != -1) {
                        }
                        if (columnIndex4 != -1) {
                        }
                        if (columnIndex5 != -1) {
                        }
                        arrayList = (java.util.ArrayList) arrayMap.get(query2.getString(columnIndex));
                        if (arrayList == null) {
                        }
                        java.util.ArrayList arrayList42 = arrayList;
                        arrayList2 = (java.util.ArrayList) arrayMap2.get(query2.getString(columnIndex));
                        if (arrayList2 != null) {
                        }
                        arrayList3.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i2, i3, arrayList42, arrayList2));
                    }
                    return arrayList3;
                } finally {
                    query2.close();
                }
            }
        });
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> _map) {
        int i;
        java.util.Set<java.lang.String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>(999);
            int size = _map.getSize();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    arrayMap.put(_map.keyAt(i2), _map.valueAt(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                arrayMap = new androidx.collection.ArrayMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                return;
            }
            return;
        }
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (java.lang.String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                java.util.ArrayList<java.lang.String> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.isNull(0) ? null : query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> _map) {
        int i;
        java.util.Set<java.lang.String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap = new androidx.collection.ArrayMap<>(999);
            int size = _map.getSize();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    arrayMap.put(_map.keyAt(i2), _map.valueAt(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap);
                arrayMap = new androidx.collection.ArrayMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap);
                return;
            }
            return;
        }
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (java.lang.String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                java.util.ArrayList<androidx.work.Data> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(androidx.work.Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }
}
