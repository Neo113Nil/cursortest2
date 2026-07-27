package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Fa implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ga f5939a;

    public Fa(Ga ga) {
        this.f5939a = ga;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f5939a.f5985a.getContentResolver();
        Ga ga = this.f5939a;
        ga.f5986b = contentResolver.query(parse, null, null, new String[]{ga.f5985a.getPackageName()}, null);
        Cursor cursor = this.f5939a.f5986b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f5939a.f5986b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C0832sg(string, this.f5939a.f5986b.getLong(1), this.f5939a.f5986b.getLong(2), EnumC0806rg.f8231d);
    }
}
