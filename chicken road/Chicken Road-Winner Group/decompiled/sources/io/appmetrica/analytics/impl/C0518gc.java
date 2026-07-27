package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518gc implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7369b;

    /* renamed from: c, reason: collision with root package name */
    public final C0658ln f7370c;

    /* renamed from: d, reason: collision with root package name */
    public final C0490fa f7371d;

    /* renamed from: e, reason: collision with root package name */
    public C0487f7 f7372e;

    public C0518gc(Context context, String str, C0658ln c0658ln) {
        this(context, str, new C0490fa(str), c0658ln);
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized SQLiteDatabase a() {
        C0487f7 c0487f7;
        try {
            this.f7371d.a();
            c0487f7 = new C0487f7(this.f7368a, this.f7369b, this.f7370c, PublicLogger.getAnonymousInstance());
            this.f7372e = c0487f7;
        } catch (Throwable unused) {
            return null;
        }
        return c0487f7.getWritableDatabase();
    }

    public C0518gc(Context context, String str, C0490fa c0490fa, C0658ln c0658ln) {
        this.f7368a = context;
        this.f7369b = str;
        this.f7371d = c0490fa;
        this.f7370c = c0658ln;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0711no.a((Closeable) this.f7372e);
        this.f7371d.b();
        this.f7372e = null;
    }
}
