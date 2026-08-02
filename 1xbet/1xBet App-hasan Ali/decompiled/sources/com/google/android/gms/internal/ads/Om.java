package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class Om implements Jw {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10989k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Ar f10990l;

    public /* synthetic */ Om(Ar ar, int i) {
        this.f10989k = i;
        this.f10990l = ar;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo14o(Object obj) {
        switch (this.f10989k) {
            case 0:
                try {
                    this.f10990l.k((SQLiteDatabase) obj);
                    break;
                } catch (Exception e3) {
                    U2.j.f("Error executing function on offline signal database: ".concat(String.valueOf(e3.getMessage())));
                    return;
                }
            default:
                try {
                    this.f10990l.k((SQLiteDatabase) obj);
                    break;
                } catch (Exception e5) {
                    U2.j.f("Error executing function on offline buffered ping database: ".concat(String.valueOf(e5.getMessage())));
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public final void u(Throwable th) {
        switch (this.f10989k) {
            case 0:
                U2.j.f("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                break;
            default:
                U2.j.f("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }
}
