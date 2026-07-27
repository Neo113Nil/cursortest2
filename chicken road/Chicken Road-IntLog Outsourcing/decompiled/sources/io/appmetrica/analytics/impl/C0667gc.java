package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667gc implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8269b;

    /* renamed from: c, reason: collision with root package name */
    public final C0807ln f8270c;

    /* renamed from: d, reason: collision with root package name */
    public final C0639fa f8271d;

    /* renamed from: e, reason: collision with root package name */
    public C0636f7 f8272e;

    public C0667gc(Context context, String str, C0807ln c0807ln) {
        this(context, str, new C0639fa(str), c0807ln);
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized SQLiteDatabase a() {
        C0636f7 c0636f7;
        try {
            this.f8271d.a();
            c0636f7 = new C0636f7(this.f8268a, this.f8269b, this.f8270c, PublicLogger.getAnonymousInstance());
            this.f8272e = c0636f7;
        } catch (Throwable unused) {
            return null;
        }
        return c0636f7.getWritableDatabase();
    }

    public C0667gc(Context context, String str, C0639fa c0639fa, C0807ln c0807ln) {
        this.f8268a = context;
        this.f8269b = str;
        this.f8271d = c0639fa;
        this.f8270c = c0807ln;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0860no.a((Closeable) this.f8272e);
        this.f8271d.b();
        this.f8272e = null;
    }
}
