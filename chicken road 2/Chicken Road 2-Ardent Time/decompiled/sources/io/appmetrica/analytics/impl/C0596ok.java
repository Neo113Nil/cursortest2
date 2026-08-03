package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596ok implements io.appmetrica.analytics.impl.Ic {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0807wo f6599a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6600b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter f6601c;

    public C0596ok(io.appmetrica.analytics.impl.C0807wo c0807wo) {
        this.f6599a = c0807wo;
        io.appmetrica.analytics.impl.C0213a c0213a = new io.appmetrica.analytics.impl.C0213a(io.appmetrica.analytics.impl.C0560na.k().g());
        this.f6601c = new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM, c0213a.b(), c0213a.a());
    }

    public static void a(io.appmetrica.analytics.impl.C0807wo c0807wo, io.appmetrica.analytics.impl.C0442im c0442im, io.appmetrica.analytics.impl.Ab ab) {
        java.lang.String optStringOrNull;
        synchronized (c0807wo) {
            optStringOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(c0807wo.f7070a.a(), "device_id");
        }
        if (android.text.TextUtils.isEmpty(optStringOrNull)) {
            if (!android.text.TextUtils.isEmpty(ab.f4049d)) {
                c0807wo.a(ab.f4049d);
            }
            if (!android.text.TextUtils.isEmpty(ab.f4050e)) {
                c0807wo.b(ab.f4050e);
            }
            if (android.text.TextUtils.isEmpty(ab.f4046a)) {
                return;
            }
            c0442im.f6112a = ab.f4046a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(android.content.Context context) {
        android.database.sqlite.SQLiteDatabase readableDatabase = io.appmetrica.analytics.impl.C0560na.f6484I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                io.appmetrica.analytics.impl.Ab a2 = a(readableDatabase);
                io.appmetrica.analytics.impl.C0442im c0442im = new io.appmetrica.analytics.impl.C0442im(new io.appmetrica.analytics.impl.C0502l4(new io.appmetrica.analytics.impl.C0450j4()));
                if (a2 != null) {
                    a(this.f6599a, c0442im, a2);
                    c0442im.f6127p = a2.f4048c;
                    c0442im.f6129r = a2.f4047b;
                }
                io.appmetrica.analytics.impl.C0468jm c0468jm = new io.appmetrica.analytics.impl.C0468jm(c0442im);
                io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0468jm.class);
                rm.a(context, rm.b(context)).save(c0468jm);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final io.appmetrica.analytics.impl.Ab a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new java.lang.String[]{"value"}, "data_key = ?", new java.lang.String[]{this.f6600b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        io.appmetrica.analytics.impl.Ab ab = (io.appmetrica.analytics.impl.Ab) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Ab(), this.f6601c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(cursor);
                        return ab;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
        }
        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
