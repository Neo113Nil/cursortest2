package com.moloco.sdk.acm.db;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.acm.db.d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.RoomDatabase f6880a;
    public final androidx.room.EntityInsertionAdapter<com.moloco.sdk.acm.db.b> b;
    public final com.moloco.sdk.acm.db.a c = new com.moloco.sdk.acm.db.a();
    public final androidx.room.EntityInsertionAdapter<com.moloco.sdk.acm.db.b> d;
    public final androidx.room.SharedSQLiteStatement e;
    public final androidx.room.SharedSQLiteStatement f;

    public class a extends androidx.room.EntityInsertionAdapter<com.moloco.sdk.acm.db.b> {
        public a(androidx.room.RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.moloco.sdk.acm.db.b value) {
            stmt.bindLong(1, value.i());
            if (value.j() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.j());
            }
            stmt.bindLong(3, value.l());
            java.lang.String a2 = com.moloco.sdk.acm.db.e.this.c.a(value.h());
            if (a2 == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, a2);
            }
            if (value.g() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindLong(5, value.g().longValue());
            }
            java.lang.String a3 = com.moloco.sdk.acm.db.e.this.c.a(value.k());
            if (a3 == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, a3);
            }
        }
    }

    public class b extends androidx.room.EntityInsertionAdapter<com.moloco.sdk.acm.db.b> {
        public b(androidx.room.RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, com.moloco.sdk.acm.db.b value) {
            stmt.bindLong(1, value.i());
            if (value.j() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.j());
            }
            stmt.bindLong(3, value.l());
            java.lang.String a2 = com.moloco.sdk.acm.db.e.this.c.a(value.h());
            if (a2 == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, a2);
            }
            if (value.g() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindLong(5, value.g().longValue());
            }
            java.lang.String a3 = com.moloco.sdk.acm.db.e.this.c.a(value.k());
            if (a3 == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, a3);
            }
        }
    }

    public class c extends androidx.room.SharedSQLiteStatement {
        public c(androidx.room.RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public java.lang.String createQuery() {
            return "DELETE FROM events";
        }
    }

    public class d extends androidx.room.SharedSQLiteStatement {
        public d(androidx.room.RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public java.lang.String createQuery() {
            return "DELETE FROM sqlite_sequence WHERE name='events'";
        }
    }

    /* renamed from: com.moloco.sdk.acm.db.e$e, reason: collision with other inner class name */
    public class CallableC0172e implements java.util.concurrent.Callable<kotlin.Unit> {
        public CallableC0172e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.Unit call() throws java.lang.Exception {
            androidx.sqlite.db.SupportSQLiteStatement acquire = com.moloco.sdk.acm.db.e.this.e.acquire();
            com.moloco.sdk.acm.db.e.this.f6880a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                com.moloco.sdk.acm.db.e.this.f6880a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                com.moloco.sdk.acm.db.e.this.f6880a.endTransaction();
                com.moloco.sdk.acm.db.e.this.e.release(acquire);
            }
        }
    }

    public class f implements java.util.concurrent.Callable<kotlin.Unit> {
        public f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.Unit call() throws java.lang.Exception {
            androidx.sqlite.db.SupportSQLiteStatement acquire = com.moloco.sdk.acm.db.e.this.f.acquire();
            com.moloco.sdk.acm.db.e.this.f6880a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                com.moloco.sdk.acm.db.e.this.f6880a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                com.moloco.sdk.acm.db.e.this.f6880a.endTransaction();
                com.moloco.sdk.acm.db.e.this.f.release(acquire);
            }
        }
    }

    public class g implements java.util.concurrent.Callable<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.List f6887a;

        public g(final java.util.List val$ids) {
            this.f6887a = val$ids;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.Unit call() throws java.lang.Exception {
            java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
            newStringBuilder.append("DELETE FROM events WHERE id IN (");
            androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, this.f6887a.size());
            newStringBuilder.append(")");
            androidx.sqlite.db.SupportSQLiteStatement compileStatement = com.moloco.sdk.acm.db.e.this.f6880a.compileStatement(newStringBuilder.toString());
            java.util.Iterator it = this.f6887a.iterator();
            int i = 1;
            while (it.hasNext()) {
                compileStatement.bindLong(i, ((java.lang.Long) it.next()).longValue());
                i++;
            }
            com.moloco.sdk.acm.db.e.this.f6880a.beginTransaction();
            try {
                compileStatement.executeUpdateDelete();
                com.moloco.sdk.acm.db.e.this.f6880a.setTransactionSuccessful();
                return kotlin.Unit.INSTANCE;
            } finally {
                com.moloco.sdk.acm.db.e.this.f6880a.endTransaction();
            }
        }
    }

    public e(androidx.room.RoomDatabase __db) {
        this.f6880a = __db;
        this.b = new com.moloco.sdk.acm.db.e.a(__db);
        this.d = new com.moloco.sdk.acm.db.e.b(__db);
        this.e = new com.moloco.sdk.acm.db.e.c(__db);
        this.f = new com.moloco.sdk.acm.db.e.d(__db);
    }

    public final /* synthetic */ java.lang.Object e(kotlin.coroutines.Continuation continuation) {
        return com.moloco.sdk.acm.db.d.a.a(this, continuation);
    }

    public final /* synthetic */ java.lang.Object f(kotlin.coroutines.Continuation continuation) {
        return com.moloco.sdk.acm.db.d.a.b(this, continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public long a(final com.moloco.sdk.acm.db.b event) {
        this.f6880a.assertNotSuspendingTransaction();
        this.f6880a.beginTransaction();
        try {
            long insertAndReturnId = this.b.insertAndReturnId(event);
            this.f6880a.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.f6880a.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.util.List<java.lang.Long> b(final java.util.List<com.moloco.sdk.acm.db.b> events) {
        this.f6880a.assertNotSuspendingTransaction();
        this.f6880a.beginTransaction();
        try {
            java.util.List<java.lang.Long> insertAndReturnIdsList = this.d.insertAndReturnIdsList(events);
            this.f6880a.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.f6880a.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.lang.Object c(final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.RoomDatabaseKt.withTransaction(this.f6880a, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.acm.db.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.acm.db.e.this.f((kotlin.coroutines.Continuation) obj);
            }
        }, continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.lang.Object d(final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f6880a, true, new com.moloco.sdk.acm.db.e.f(), continuation);
    }

    public static java.util.List<java.lang.Class<?>> c() {
        return java.util.Collections.emptyList();
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.util.List<java.lang.Long> a(final java.util.List<com.moloco.sdk.acm.db.b> events) {
        this.f6880a.assertNotSuspendingTransaction();
        this.f6880a.beginTransaction();
        try {
            java.util.List<java.lang.Long> insertAndReturnIdsList = this.b.insertAndReturnIdsList(events);
            this.f6880a.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.f6880a.endTransaction();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.lang.Object b(final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f6880a, true, new com.moloco.sdk.acm.db.e.CallableC0172e(), continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.util.List<com.moloco.sdk.acm.db.b> b() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM events LIMIT 900", 0);
        this.f6880a.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.f6880a, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.ironsource.C4.a.d);
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "eventType");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "data");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "tags");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), this.c.a(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)), query.isNull(columnIndexOrThrow5) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow5)), this.c.b(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.lang.Object a(final kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.acm.db.b>> continuation) {
        return androidx.room.RoomDatabaseKt.withTransaction(this.f6880a, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.acm.db.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.acm.db.e.this.e((kotlin.coroutines.Continuation) obj);
            }
        }, continuation);
    }

    @Override // com.moloco.sdk.acm.db.d
    public com.moloco.sdk.acm.db.b a(long j) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM events WHERE id = ?", 1);
        acquire.bindLong(1, j);
        this.f6880a.assertNotSuspendingTransaction();
        com.moloco.sdk.acm.db.b bVar = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.f6880a, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.ironsource.C4.a.d);
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "eventType");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "data");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "tags");
            if (query.moveToFirst()) {
                long j2 = query.getLong(columnIndexOrThrow);
                java.lang.String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                long j3 = query.getLong(columnIndexOrThrow3);
                com.moloco.sdk.acm.db.c a2 = this.c.a(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                java.lang.Long valueOf = query.isNull(columnIndexOrThrow5) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow5));
                if (!query.isNull(columnIndexOrThrow6)) {
                    string = query.getString(columnIndexOrThrow6);
                }
                bVar = new com.moloco.sdk.acm.db.b(j2, string2, j3, a2, valueOf, this.c.b(string));
            }
            return bVar;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.util.List<com.moloco.sdk.acm.db.b> a() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM events", 0);
        this.f6880a.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.f6880a, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.ironsource.C4.a.d);
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "eventType");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "data");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "tags");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new com.moloco.sdk.acm.db.b(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), this.c.a(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)), query.isNull(columnIndexOrThrow5) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow5)), this.c.b(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.moloco.sdk.acm.db.d
    public java.lang.Object a(final java.util.List<java.lang.Long> ids, final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f6880a, true, new com.moloco.sdk.acm.db.e.g(ids), continuation);
    }
}
