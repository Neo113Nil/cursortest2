package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
final class SQLiteDataQueue implements com.adobe.marketing.mobile.services.DataQueue {
    private final java.lang.String Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final java.lang.String getHighSpeedVideoSizes;

    SQLiteDataQueue(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = "SQLiteDataQueue-".concat(java.lang.String.valueOf(str));
        this.Camera2StreamConfigurationMap = str2;
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean add(final com.adobe.marketing.mobile.services.DataEntity dataEntity) {
        if (dataEntity == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "add - Returning false, DataEntity is null.", new java.lang.Object[0]);
            return false;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "add - Returning false, DataQueue is closed.", new java.lang.Object[0]);
                return false;
            }
            boolean process = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.process(this.Camera2StreamConfigurationMap, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE, new com.adobe.marketing.mobile.internal.util.DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.SQLiteDataQueue$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                public final boolean execute(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    return com.adobe.marketing.mobile.services.SQLiteDataQueue.this.getHighResolutionOutputSizeshNQ4ISI(dataEntity, sQLiteDatabase);
                }
            });
            if (!process) {
                getHighSpeedVideoSizes();
                process = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.process(this.Camera2StreamConfigurationMap, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE, new com.adobe.marketing.mobile.internal.util.DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.SQLiteDataQueue$$ExternalSyntheticLambda0
                    @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                    public final boolean execute(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                        return com.adobe.marketing.mobile.services.SQLiteDataQueue.this.getHighResolutionOutputSizeshNQ4ISI(dataEntity, sQLiteDatabase);
                    }
                });
            }
            return process;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final java.util.List<com.adobe.marketing.mobile.services.DataEntity> peek(final int i) {
        if (i <= 0) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "peek n - Returning null, n <= 0.", new java.lang.Object[0]);
            return null;
        }
        final java.util.ArrayList<android.content.ContentValues> arrayList = new java.util.ArrayList();
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "peek n - Returning null, DataQueue is closed.", new java.lang.Object[0]);
                return null;
            }
            com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.process(this.Camera2StreamConfigurationMap, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_ONLY, new com.adobe.marketing.mobile.internal.util.DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.SQLiteDataQueue$$ExternalSyntheticLambda1
                @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                public final boolean execute(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    return com.adobe.marketing.mobile.services.SQLiteDataQueue.this.getHighSpeedVideoSizes(i, arrayList, sQLiteDatabase);
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            for (android.content.ContentValues contentValues : arrayList) {
                arrayList2.add(new com.adobe.marketing.mobile.services.DataEntity(contentValues.getAsString("uniqueIdentifier"), new java.util.Date(contentValues.getAsLong("timestamp").longValue()), contentValues.getAsString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)));
            }
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("peek n - Successfully returned %d DataEntities", java.lang.Integer.valueOf(arrayList2.size())), new java.lang.Object[0]);
            return arrayList2;
        }
    }

    final /* synthetic */ boolean getHighSpeedVideoSizes(int i, java.util.List list, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            android.database.Cursor query = sQLiteDatabase.query("TB_AEP_DATA_ENTITY", new java.lang.String[]{"timestamp", "uniqueIdentifier", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, null, null, null, null, "id ASC", java.lang.String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        android.database.DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        list.add(contentValues);
                    } while (query.moveToNext());
                }
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("query - Successfully read %d rows from table.", java.lang.Integer.valueOf(list.size())), new java.lang.Object[0]);
                if (query != null) {
                    query.close();
                }
                return true;
            } finally {
            }
        } catch (android.database.sqlite.SQLiteException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("query - Error in querying database table. Error: (%s)", e.getLocalizedMessage()), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final com.adobe.marketing.mobile.services.DataEntity peek() {
        java.util.List<com.adobe.marketing.mobile.services.DataEntity> peek = peek(1);
        if (peek == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "peek - Unable to fetch DataEntity, returning null", new java.lang.Object[0]);
            return null;
        }
        if (peek.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "peek - 0 DataEntities fetch, returning null", new java.lang.Object[0]);
            return null;
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("peek - Successfully returned DataEntity (%s)", peek.get(0).toString()), new java.lang.Object[0]);
        return peek.get(0);
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean remove(final int i) {
        if (i <= 0) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "remove n - Returning false, n <= 0", new java.lang.Object[0]);
            return false;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "remove n - Returning false, DataQueue is closed", new java.lang.Object[0]);
                return false;
            }
            boolean process = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.process(this.Camera2StreamConfigurationMap, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE, new com.adobe.marketing.mobile.internal.util.DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.SQLiteDataQueue$$ExternalSyntheticLambda2
                @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                public final boolean execute(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    return com.adobe.marketing.mobile.services.SQLiteDataQueue.this.getHighSpeedVideoSizes(i, sQLiteDatabase);
                }
            });
            if (!process) {
                getHighSpeedVideoSizes();
            }
            return process;
        }
    }

    final /* synthetic */ boolean getHighSpeedVideoSizes(int i, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM TB_AEP_DATA_ENTITY WHERE id in (SELECT id from TB_AEP_DATA_ENTITY order by id ASC limit ");
        sb.append(i);
        sb.append(')');
        try {
            android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
            try {
                int executeUpdateDelete = compileStatement.executeUpdateDelete();
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("remove n - Removed %d DataEntities", java.lang.Integer.valueOf(executeUpdateDelete)), new java.lang.Object[0]);
                boolean z = executeUpdateDelete >= 0;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                return z;
            } finally {
            }
        } catch (android.database.sqlite.SQLiteException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("removeRows - Error in deleting rows from table. Returning 0. Error: (%s)", e.getMessage()), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean remove() {
        return remove(1);
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean clear() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "clear - Returning false, DataQueue is closed", new java.lang.Object[0]);
                return false;
            }
            boolean clearTable = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.clearTable(this.Camera2StreamConfigurationMap, "TB_AEP_DATA_ENTITY");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, java.lang.String.format("clear - %s in clearing table", clearTable ? "Successful" : "Failed"), new java.lang.Object[0]);
            if (!clearTable) {
                getHighSpeedVideoSizes();
            }
            return true;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final int count() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "count - Returning 0, DataQueue is closed", new java.lang.Object[0]);
                return 0;
            }
            return com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.getTableSize(this.Camera2StreamConfigurationMap, "TB_AEP_DATA_ENTITY");
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final void close() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.createTableIfNotExist(this.Camera2StreamConfigurationMap, "CREATE TABLE IF NOT EXISTS TB_AEP_DATA_ENTITY (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, uniqueIdentifier TEXT NOT NULL UNIQUE, timestamp INTEGER NOT NULL, data TEXT);")) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "createTableIfNotExists - Successfully created/already existed table.", new java.lang.Object[0]);
            } else {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "createTableIfNotExists - Error creating/accessing table.", new java.lang.Object[0]);
            }
        }
    }

    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.services.DataEntity dataEntity, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("INSERT INTO TB_AEP_DATA_ENTITY (uniqueIdentifier, timestamp, data) VALUES (?, ?, ?)");
            try {
                compileStatement.bindString(1, dataEntity.getUniqueIdentifier());
                compileStatement.bindLong(2, dataEntity.getTimestamp().getTime());
                compileStatement.bindString(3, dataEntity.getData() != null ? dataEntity.getData() : "");
                boolean z = compileStatement.executeInsert() >= 0;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                return z;
            } finally {
            }
        } catch (java.lang.Exception e) {
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("add - Returning false: ");
            sb.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, sb.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    private void getHighSpeedVideoSizes() {
        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "resetDatabase - Resetting database (%s) as it is corrupted", this.Camera2StreamConfigurationMap);
        try {
            com.adobe.marketing.mobile.internal.util.FileUtils.deleteFile(new java.io.File(this.Camera2StreamConfigurationMap), false);
            getHighSpeedVideoFpsRangesFor();
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, this.getHighSpeedVideoSizes, "resetDatabase - Error resetting database (%s)  ", this.Camera2StreamConfigurationMap);
        }
    }
}
