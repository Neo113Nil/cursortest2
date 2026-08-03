package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0845ya implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0871za f7139a;

    public CallableC0845ya(io.appmetrica.analytics.impl.C0871za c0871za) {
        this.f7139a = c0871za;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        android.net.Uri parse = android.net.Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        android.content.ContentResolver contentResolver = this.f7139a.f7182a.getContentResolver();
        io.appmetrica.analytics.impl.C0871za c0871za = this.f7139a;
        c0871za.f7183b = contentResolver.query(parse, null, null, new java.lang.String[]{c0871za.f7182a.getPackageName()}, null);
        android.database.Cursor cursor = this.f7139a.f7183b;
        if (cursor != null && cursor.moveToFirst()) {
            java.lang.String string = this.f7139a.f7183b.getString(0);
            if (!android.text.TextUtils.isEmpty(string)) {
                return new io.appmetrica.analytics.impl.C0566ng(string, this.f7139a.f7183b.getLong(1), this.f7139a.f7183b.getLong(2), io.appmetrica.analytics.impl.EnumC0540mg.f6430d);
            }
        }
        return null;
    }
}
