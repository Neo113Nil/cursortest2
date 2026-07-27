package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0966xk implements Pc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        IBinaryDataHelper f;
        C0940wk c0940wk = new C0940wk();
        C0914vk c0914vk = new C0914vk();
        C0658ln c0658ln = new C0658ln(c0914vk, c0914vk, new C0930wa(false), new A0.r(15));
        C0513g7 a3 = C0513g7.a(context);
        a3.getClass();
        Context context2 = a3.f7341e;
        C0565i7 c0565i7 = a3.f7351p;
        byte[] bArr = new C0354a3(new C0889ul(new C0487f7(context2, new C0539h7(c0565i7.f7485a, c0565i7.f7486b, false).a(context2, c0940wk), c0658ln, PublicLogger.getAnonymousInstance())), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr == null) {
            int i3 = C0888uk.f8463a;
            return;
        }
        C0513g7 a4 = C0513g7.a(context);
        synchronized (a4) {
            f = a4.f();
        }
        ((C0354a3) f).insert("auto_inapp_collecting_info_data", bArr);
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0709nm.class);
        ProtobufStateStorage<Object> a3 = vm.a(context, vm.b(context));
        C0709nm c0709nm = (C0709nm) a3.read();
        C0683mm a4 = c0709nm.a(c0709nm.f7955m);
        a4.f7887o = 0L;
        a3.save(new C0709nm(a4));
        b(context);
    }
}
