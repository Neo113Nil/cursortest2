package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690sb implements io.appmetrica.analytics.impl.Ha, java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f6799a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f6800b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6801c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0664rb f6802d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6803e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0841y6 f6804f;

    public C0690sb(io.appmetrica.analytics.impl.InterfaceC0841y6 interfaceC0841y6) {
        this.f6804f = interfaceC0841y6;
        java.util.Locale locale = java.util.Locale.US;
        io.appmetrica.analytics.impl.C0664rb c0664rb = new io.appmetrica.analytics.impl.C0664rb(this, B1.a.f(io.appmetrica.analytics.impl.ThreadFactoryC0874zd.a(), "IAA-DW-"));
        this.f6802d = c0664rb;
        c0664rb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(io.appmetrica.analytics.impl.C0690sb c0690sb) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        java.lang.String str;
        c0690sb.getClass();
        android.database.Cursor cursor = null;
        try {
            sQLiteDatabase = c0690sb.f6804f.a();
            if (sQLiteDatabase != null) {
                try {
                    android.database.Cursor query = sQLiteDatabase.query(c0690sb.f6801c, new java.lang.String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            java.lang.String string = query.getString(query.getColumnIndexOrThrow("key"));
                            java.lang.String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i2 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!android.text.TextUtils.isEmpty(string)) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        str = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(string2);
                                    } else if (i2 != 3) {
                                        str = string2;
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                str = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c0690sb.f6799a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = java.lang.Boolean.TRUE;
                                    } else {
                                        if ("false".equals(string2)) {
                                            str = java.lang.Boolean.FALSE;
                                        }
                                        str = null;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    cursor = query;
                } catch (java.lang.Throwable unused2) {
                }
            }
        } catch (java.lang.Throwable unused3) {
            sQLiteDatabase = null;
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
        c0690sb.f6804f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        synchronized (this.f6802d) {
            this.f6802d.notifyAll();
        }
    }

    public final void c() {
        if (this.f6803e) {
            return;
        }
        try {
            this.f6799a.wait();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6802d.isRunning()) {
            this.f6802d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(java.lang.String str, boolean z2) {
        java.lang.Object b2 = b(str);
        return b2 instanceof java.lang.Boolean ? ((java.lang.Boolean) b2).booleanValue() : z2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(java.lang.String str, int i2) {
        java.lang.Object b2 = b(str);
        return b2 instanceof java.lang.Integer ? ((java.lang.Integer) b2).intValue() : i2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(java.lang.String str, long j2) {
        java.lang.Object b2 = b(str);
        return b2 instanceof java.lang.Long ? ((java.lang.Long) b2).longValue() : j2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.Object b2 = b(str);
        return b2 instanceof java.lang.String ? (java.lang.String) b2 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final io.appmetrica.analytics.impl.Ha remove(java.lang.String str) {
        synchronized (this.f6799a) {
            c();
            this.f6799a.remove(str);
        }
        synchronized (this.f6802d) {
            this.f6800b.put(str, this);
            this.f6802d.notifyAll();
        }
        return this;
    }

    public final java.lang.Object b(java.lang.String str) {
        java.lang.Object obj;
        synchronized (this.f6799a) {
            c();
            obj = this.f6799a.get(str);
        }
        return obj;
    }

    public static void a(io.appmetrica.analytics.impl.C0690sb c0690sb, java.util.HashMap hashMap) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        c0690sb.getClass();
        int size = hashMap.size();
        android.content.ContentValues[] contentValuesArr = new android.content.ContentValues[size];
        int i2 = 0;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c0690sb) {
                contentValues.putNull("value");
            } else if (value instanceof java.lang.String) {
                contentValues.put("value", (java.lang.String) value);
                contentValues.put("type", (java.lang.Integer) 4);
            } else if (value instanceof java.lang.Long) {
                contentValues.put("value", (java.lang.Long) value);
                contentValues.put("type", (java.lang.Integer) 3);
            } else if (value instanceof java.lang.Integer) {
                contentValues.put("value", (java.lang.Integer) value);
                contentValues.put("type", (java.lang.Integer) 2);
            } else if (value instanceof java.lang.Boolean) {
                contentValues.put("value", java.lang.String.valueOf(((java.lang.Boolean) value).booleanValue()));
                contentValues.put("type", (java.lang.Integer) 1);
            } else if (value instanceof java.lang.Float) {
                contentValues.put("value", (java.lang.Float) value);
                contentValues.put("type", (java.lang.Integer) 5);
            }
            contentValuesArr[i2] = contentValues;
            i2++;
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c0690sb.f6804f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i3 = 0; i3 < size; i3++) {
                        android.content.ContentValues contentValues2 = contentValuesArr[i3];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c0690sb.f6801c, "key = ?", new java.lang.String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c0690sb.f6801c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (java.lang.Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c0690sb.f6804f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (java.lang.Throwable unused3) {
                }
            }
        } catch (java.lang.Throwable unused4) {
        }
        c0690sb.f6804f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized io.appmetrica.analytics.impl.Ha a(java.lang.String str, java.lang.String str2) {
        a(str, (java.lang.Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final io.appmetrica.analytics.impl.Ha a(java.lang.String str, long j2) {
        a(str, java.lang.Long.valueOf(j2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized io.appmetrica.analytics.impl.Ha a(int i2, java.lang.String str) {
        a(str, java.lang.Integer.valueOf(i2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final io.appmetrica.analytics.impl.Ha a(java.lang.String str, boolean z2) {
        a(str, java.lang.Boolean.valueOf(z2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final io.appmetrica.analytics.impl.Ha a(java.lang.String str, float f2) {
        a(str, java.lang.Float.valueOf(f2));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(java.lang.String str) {
        boolean containsKey;
        synchronized (this.f6799a) {
            c();
            containsKey = this.f6799a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final java.util.Set a() {
        java.util.HashSet hashSet;
        synchronized (this.f6799a) {
            hashSet = new java.util.HashSet(this.f6799a.keySet());
        }
        return hashSet;
    }

    public final void a(java.lang.String str, java.lang.Object obj) {
        synchronized (this.f6799a) {
            c();
            this.f6799a.put(str, obj);
        }
        synchronized (this.f6802d) {
            this.f6800b.put(str, obj);
            this.f6802d.notifyAll();
        }
    }
}
