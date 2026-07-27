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
public final class C0985sk implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f9262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9263b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f9264c;

    public C0985sk(yo yoVar) {
        this.f9262a = yoVar;
        C0499a c0499a = new C0499a(C1027ua.k().g());
        this.f9264c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0499a.b(), c0499a.a());
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0662g7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Hb a6 = a(readableDatabase);
                C0832mm c0832mm = new C0832mm(new C0969s4(new C0918q4()));
                if (a6 != null) {
                    a(this.f9262a, c0832mm, a6);
                    c0832mm.f8816p = a6.f6871c;
                    c0832mm.f8818r = a6.f6870b;
                }
                C0858nm c0858nm = new C0858nm(c0832mm);
                Vm vm = (Vm) Tm.a(C0858nm.class);
                vm.a(context, vm.b(context)).save(c0858nm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(yo yoVar, C0832mm c0832mm, Hb hb) {
        String optStringOrNull;
        synchronized (yoVar) {
            optStringOrNull = JsonUtils.optStringOrNull(yoVar.f9611a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(hb.f6872d)) {
                yoVar.a(hb.f6872d);
            }
            if (!TextUtils.isEmpty(hb.f6873e)) {
                yoVar.b(hb.f6873e);
            }
            if (TextUtils.isEmpty(hb.f6869a)) {
                return;
            }
            c0832mm.f8801a = hb.f6869a;
        }
    }

    public final Hb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f9263b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Hb hb = (Hb) MessageNano.mergeFrom(new Hb(), this.f9264c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
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
