package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836sk implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f8314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8315b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f8316c;

    public C0836sk(yo yoVar) {
        this.f8314a = yoVar;
        C0350a c0350a = new C0350a(C0878ua.k().g());
        this.f8316c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0350a.b(), c0350a.a());
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0513g7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Hb a3 = a(readableDatabase);
                C0683mm c0683mm = new C0683mm(new C0820s4(new C0769q4()));
                if (a3 != null) {
                    a(this.f8314a, c0683mm, a3);
                    c0683mm.f7888p = a3.f6024c;
                    c0683mm.f7890r = a3.f6023b;
                }
                C0709nm c0709nm = new C0709nm(c0683mm);
                Vm vm = (Vm) Tm.a(C0709nm.class);
                vm.a(context, vm.b(context)).save(c0709nm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(yo yoVar, C0683mm c0683mm, Hb hb) {
        String optStringOrNull;
        synchronized (yoVar) {
            optStringOrNull = JsonUtils.optStringOrNull(yoVar.f8651a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(hb.f6025d)) {
                yoVar.a(hb.f6025d);
            }
            if (!TextUtils.isEmpty(hb.f6026e)) {
                yoVar.b(hb.f6026e);
            }
            if (TextUtils.isEmpty(hb.f6022a)) {
                return;
            }
            c0683mm.f7874a = hb.f6022a;
        }
    }

    public final Hb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f8315b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Hb hb = (Hb) MessageNano.mergeFrom(new Hb(), this.f8316c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return hb;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
