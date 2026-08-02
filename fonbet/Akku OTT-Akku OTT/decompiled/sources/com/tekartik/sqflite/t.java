package com.tekartik.sqflite;

import android.database.sqlite.SQLiteDatabase;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class t implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MethodChannel.Result c;
    public final /* synthetic */ u d;

    public t(u uVar, d dVar, String str, MethodChannel.Result result) {
        this.d = uVar;
        this.a = dVar;
        this.b = str;
        this.c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (u.f) {
            d dVar = this.a;
            if (dVar != null) {
                u.a(this.d, dVar);
            }
            try {
                HashMap hashMap = u.c;
                SQLiteDatabase.deleteDatabase(new File(this.b));
            } catch (Exception e) {
                e.toString();
                HashMap hashMap2 = u.c;
            }
        }
        this.c.success(null);
    }
}
