package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.dF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886dF extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f13105a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f13106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802bc f13107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886dF(C0802bc c0802bc, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13107c = c0802bc;
        this.f13105a = contentResolver;
        this.f13106b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        C0802bc c0802bc = this.f13107c;
        c0802bc.i(C0797bF.b((Context) c0802bc.f12821k, (Mm) c0802bc.f12829s, (Dp) c0802bc.f12828r));
    }
}
