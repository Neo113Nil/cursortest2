package androidx.media3.exoplayer.offline;

/* loaded from: classes2.dex */
public final class DefaultDownloadIndex implements androidx.media3.exoplayer.offline.WritableDownloadIndex {
    private static final java.lang.String COLUMN_DATA = "data";
    private static final java.lang.String COLUMN_ID = "id";
    private static final int COLUMN_INDEX_BYTES_DOWNLOADED = 13;
    private static final int COLUMN_INDEX_CONTENT_LENGTH = 9;
    private static final int COLUMN_INDEX_CUSTOM_CACHE_KEY = 4;
    private static final int COLUMN_INDEX_DATA = 5;
    private static final int COLUMN_INDEX_FAILURE_REASON = 11;
    private static final int COLUMN_INDEX_ID = 0;
    private static final int COLUMN_INDEX_KEY_SET_ID = 14;
    private static final int COLUMN_INDEX_MIME_TYPE = 1;
    private static final int COLUMN_INDEX_PERCENT_DOWNLOADED = 12;
    private static final int COLUMN_INDEX_START_TIME_MS = 7;
    private static final int COLUMN_INDEX_STATE = 6;
    private static final int COLUMN_INDEX_STOP_REASON = 10;
    private static final int COLUMN_INDEX_STREAM_KEYS = 3;
    private static final int COLUMN_INDEX_UPDATE_TIME_MS = 8;
    private static final int COLUMN_INDEX_URI = 2;
    private static final java.lang.String COLUMN_STATE = "state";
    private static final java.lang.String COLUMN_STOP_REASON = "stop_reason";
    private static final java.lang.String COLUMN_URI = "uri";
    private static final java.lang.String TABLE_PREFIX = "ExoPlayerDownloads";
    private static final java.lang.String TABLE_SCHEMA = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    static final int TABLE_VERSION = 3;
    private static final java.lang.String TRUE = "1";
    private static final java.lang.String WHERE_ID_EQUALS = "id = ?";
    private static final java.lang.String WHERE_STATE_IS_DOWNLOADING = "state = 2";
    private final androidx.media3.database.DatabaseProvider databaseProvider;
    private final java.lang.Object initializationLock;
    private boolean initialized;
    private final java.lang.String name;
    private final java.lang.String tableName;
    private static final java.lang.String WHERE_STATE_IS_TERMINAL = getStateQuery(3, 4);
    private static final java.lang.String COLUMN_MIME_TYPE = "mime_type";
    private static final java.lang.String COLUMN_STREAM_KEYS = "stream_keys";
    private static final java.lang.String COLUMN_CUSTOM_CACHE_KEY = "custom_cache_key";
    private static final java.lang.String COLUMN_START_TIME_MS = "start_time_ms";
    private static final java.lang.String COLUMN_UPDATE_TIME_MS = "update_time_ms";
    private static final java.lang.String COLUMN_CONTENT_LENGTH = "content_length";
    private static final java.lang.String COLUMN_FAILURE_REASON = "failure_reason";
    private static final java.lang.String COLUMN_PERCENT_DOWNLOADED = "percent_downloaded";
    private static final java.lang.String COLUMN_BYTES_DOWNLOADED = "bytes_downloaded";
    private static final java.lang.String COLUMN_KEY_SET_ID = "key_set_id";
    private static final java.lang.String[] COLUMNS = {"id", COLUMN_MIME_TYPE, "uri", COLUMN_STREAM_KEYS, COLUMN_CUSTOM_CACHE_KEY, "data", "state", COLUMN_START_TIME_MS, COLUMN_UPDATE_TIME_MS, COLUMN_CONTENT_LENGTH, "stop_reason", COLUMN_FAILURE_REASON, COLUMN_PERCENT_DOWNLOADED, COLUMN_BYTES_DOWNLOADED, COLUMN_KEY_SET_ID};

    public DefaultDownloadIndex(androidx.media3.database.DatabaseProvider databaseProvider) {
        this(databaseProvider, "");
    }

    public DefaultDownloadIndex(androidx.media3.database.DatabaseProvider databaseProvider, java.lang.String str) {
        this.name = str;
        this.databaseProvider = databaseProvider;
        this.tableName = TABLE_PREFIX + str;
        this.initializationLock = new java.lang.Object();
    }

    @Override // androidx.media3.exoplayer.offline.DownloadIndex
    public androidx.media3.exoplayer.offline.Download getDownload(java.lang.String str) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            android.database.Cursor cursor = getCursor(WHERE_ID_EQUALS, new java.lang.String[]{str});
            try {
                if (cursor.getCount() == 0) {
                    if (cursor == null) {
                        return null;
                    }
                    cursor.close();
                    return null;
                }
                cursor.moveToNext();
                androidx.media3.exoplayer.offline.Download downloadForCurrentRow = getDownloadForCurrentRow(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return downloadForCurrentRow;
            } finally {
            }
        } catch (android.database.sqlite.SQLiteException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.DownloadIndex
    public androidx.media3.exoplayer.offline.DownloadCursor getDownloads(int... iArr) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        return new androidx.media3.exoplayer.offline.DefaultDownloadIndex.DownloadCursorImpl(getCursor(getStateQuery(iArr), null));
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void putDownload(androidx.media3.exoplayer.offline.Download download) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            putDownloadInternal(download, this.databaseProvider.getWritableDatabase());
        } catch (android.database.sqlite.SQLiteException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void removeDownload(java.lang.String str) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            this.databaseProvider.getWritableDatabase().delete(this.tableName, WHERE_ID_EQUALS, new java.lang.String[]{str});
        } catch (android.database.sqlite.SQLiteException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void setDownloadingStatesToQueued() throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("state", (java.lang.Integer) 0);
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, WHERE_STATE_IS_DOWNLOADING, null);
        } catch (android.database.SQLException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void setStatesToRemoving() throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("state", (java.lang.Integer) 5);
            contentValues.put(COLUMN_FAILURE_REASON, (java.lang.Integer) 0);
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, null, null);
        } catch (android.database.SQLException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void setStopReason(int i) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("stop_reason", java.lang.Integer.valueOf(i));
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, WHERE_STATE_IS_TERMINAL, null);
        } catch (android.database.SQLException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    @Override // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void setStopReason(java.lang.String str, int i) throws androidx.media3.database.DatabaseIOException {
        ensureInitialized();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("stop_reason", java.lang.Integer.valueOf(i));
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, WHERE_STATE_IS_TERMINAL + " AND id = ?", new java.lang.String[]{str});
        } catch (android.database.SQLException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    private void ensureInitialized() throws androidx.media3.database.DatabaseIOException {
        synchronized (this.initializationLock) {
            if (this.initialized) {
                return;
            }
            try {
                int version = androidx.media3.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 0, this.name);
                if (version != 3) {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        androidx.media3.database.VersionTable.setVersion(writableDatabase, 0, this.name, 3);
                        java.util.List<androidx.media3.exoplayer.offline.Download> loadDownloadsFromVersion2 = version == 2 ? loadDownloadsFromVersion2(writableDatabase) : new java.util.ArrayList<>();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.tableName);
                        writableDatabase.execSQL("CREATE TABLE " + this.tableName + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        java.util.Iterator<androidx.media3.exoplayer.offline.Download> it = loadDownloadsFromVersion2.iterator();
                        while (it.hasNext()) {
                            putDownloadInternal(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (java.lang.Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.initialized = true;
            } catch (android.database.SQLException e) {
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }
    }

    private void putDownloadInternal(androidx.media3.exoplayer.offline.Download download, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = download.request.keySetId == null ? androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY : download.request.keySetId;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("id", download.request.id);
        contentValues.put(COLUMN_MIME_TYPE, download.request.mimeType);
        contentValues.put("uri", download.request.uri.toString());
        contentValues.put(COLUMN_STREAM_KEYS, encodeStreamKeys(download.request.streamKeys));
        contentValues.put(COLUMN_CUSTOM_CACHE_KEY, download.request.customCacheKey);
        contentValues.put("data", download.request.data);
        contentValues.put("state", java.lang.Integer.valueOf(download.state));
        contentValues.put(COLUMN_START_TIME_MS, java.lang.Long.valueOf(download.startTimeMs));
        contentValues.put(COLUMN_UPDATE_TIME_MS, java.lang.Long.valueOf(download.updateTimeMs));
        contentValues.put(COLUMN_CONTENT_LENGTH, java.lang.Long.valueOf(download.contentLength));
        contentValues.put("stop_reason", java.lang.Integer.valueOf(download.stopReason));
        contentValues.put(COLUMN_FAILURE_REASON, java.lang.Integer.valueOf(download.failureReason));
        contentValues.put(COLUMN_PERCENT_DOWNLOADED, java.lang.Float.valueOf(download.getPercentDownloaded()));
        contentValues.put(COLUMN_BYTES_DOWNLOADED, java.lang.Long.valueOf(download.getBytesDownloaded()));
        contentValues.put(COLUMN_KEY_SET_ID, bArr);
        sQLiteDatabase.replaceOrThrow(this.tableName, null, contentValues);
    }

    private java.util.List<androidx.media3.exoplayer.offline.Download> loadDownloadsFromVersion2(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!androidx.media3.common.util.Util.tableExists(sQLiteDatabase, this.tableName)) {
            return arrayList;
        }
        android.database.Cursor query = sQLiteDatabase.query(this.tableName, new java.lang.String[]{"id", "title", "uri", COLUMN_STREAM_KEYS, COLUMN_CUSTOM_CACHE_KEY, "data", "state", COLUMN_START_TIME_MS, COLUMN_UPDATE_TIME_MS, COLUMN_CONTENT_LENGTH, "stop_reason", COLUMN_FAILURE_REASON, COLUMN_PERCENT_DOWNLOADED, COLUMN_BYTES_DOWNLOADED}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(getDownloadForCurrentRowV2(query));
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    private static java.lang.String inferMimeType(java.lang.String str) {
        if ("dash".equals(str)) {
            return "application/dash+xml";
        }
        if ("hls".equals(str)) {
            return "application/x-mpegURL";
        }
        if ("ss".equals(str)) {
            return "application/vnd.ms-sstr+xml";
        }
        return "video/x-unknown";
    }

    private android.database.Cursor getCursor(java.lang.String str, java.lang.String[] strArr) throws androidx.media3.database.DatabaseIOException {
        try {
            return this.databaseProvider.getReadableDatabase().query(this.tableName, COLUMNS, str, strArr, null, null, "start_time_ms ASC");
        } catch (android.database.sqlite.SQLiteException e) {
            throw new androidx.media3.database.DatabaseIOException(e);
        }
    }

    static java.lang.String encodeStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.StreamKey streamKey = list.get(i);
            sb.append(streamKey.periodIndex);
            sb.append('.');
            sb.append(streamKey.groupIndex);
            sb.append('.');
            sb.append(streamKey.streamIndex);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static java.lang.String getStateQuery(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.offline.Download getDownloadForCurrentRow(android.database.Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        androidx.media3.exoplayer.offline.DownloadRequest.Builder streamKeys = new androidx.media3.exoplayer.offline.DownloadRequest.Builder((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(cursor.getString(0)), android.net.Uri.parse((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(cursor.getString(2)))).setMimeType(cursor.getString(1)).setStreamKeys(decodeStreamKeys(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        androidx.media3.exoplayer.offline.DownloadRequest build = streamKeys.setKeySetId(blob).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        androidx.media3.exoplayer.offline.DownloadProgress downloadProgress = new androidx.media3.exoplayer.offline.DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new androidx.media3.exoplayer.offline.Download(build, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static androidx.media3.exoplayer.offline.Download getDownloadForCurrentRowV2(android.database.Cursor cursor) {
        androidx.media3.exoplayer.offline.DownloadRequest build = new androidx.media3.exoplayer.offline.DownloadRequest.Builder((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(cursor.getString(0)), android.net.Uri.parse((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(cursor.getString(2)))).setMimeType(inferMimeType(cursor.getString(1))).setStreamKeys(decodeStreamKeys(cursor.getString(3))).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        androidx.media3.exoplayer.offline.DownloadProgress downloadProgress = new androidx.media3.exoplayer.offline.DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new androidx.media3.exoplayer.offline.Download(build, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static java.util.List<androidx.media3.common.StreamKey> decodeStreamKeys(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (java.lang.String str2 : androidx.media3.common.util.Util.split(str, ",")) {
            java.lang.String[] split = androidx.media3.common.util.Util.split(str2, "\\.");
            androidx.media3.common.util.Assertions.checkState(split.length == 3);
            arrayList.add(new androidx.media3.common.StreamKey(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2])));
        }
        return arrayList;
    }

    private static final class DownloadCursorImpl implements androidx.media3.exoplayer.offline.DownloadCursor {
        private final android.database.Cursor cursor;

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean isAfterLast() {
            return androidx.media3.exoplayer.offline.DownloadCursor.CC.$default$isAfterLast(this);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean isBeforeFirst() {
            return androidx.media3.exoplayer.offline.DownloadCursor.CC.$default$isBeforeFirst(this);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean isFirst() {
            return androidx.media3.exoplayer.offline.DownloadCursor.CC.$default$isFirst(this);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean isLast() {
            return androidx.media3.exoplayer.offline.DownloadCursor.CC.$default$isLast(this);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean moveToFirst() {
            boolean moveToPosition;
            moveToPosition = moveToPosition(0);
            return moveToPosition;
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean moveToLast() {
            boolean moveToPosition;
            moveToPosition = moveToPosition(getCount() - 1);
            return moveToPosition;
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean moveToNext() {
            boolean moveToPosition;
            moveToPosition = moveToPosition(getPosition() + 1);
            return moveToPosition;
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public /* synthetic */ boolean moveToPrevious() {
            boolean moveToPosition;
            moveToPosition = moveToPosition(getPosition() - 1);
            return moveToPosition;
        }

        private DownloadCursorImpl(android.database.Cursor cursor) {
            this.cursor = cursor;
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public androidx.media3.exoplayer.offline.Download getDownload() {
            return androidx.media3.exoplayer.offline.DefaultDownloadIndex.getDownloadForCurrentRow(this.cursor);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public int getCount() {
            return this.cursor.getCount();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public int getPosition() {
            return this.cursor.getPosition();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToPosition(int i) {
            return this.cursor.moveToPosition(i);
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursor.close();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isClosed() {
            return this.cursor.isClosed();
        }
    }
}
