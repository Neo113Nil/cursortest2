package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class Cx implements Ar {

    /* renamed from: m, reason: collision with root package name */
    public static final Cx f8114m;

    /* renamed from: n, reason: collision with root package name */
    public static final Cx f8115n;

    /* renamed from: o, reason: collision with root package name */
    public static final Cx f8116o;

    /* renamed from: p, reason: collision with root package name */
    public static final Cx f8117p;

    /* renamed from: q, reason: collision with root package name */
    public static final Cx f8118q;

    /* renamed from: r, reason: collision with root package name */
    public static final Cx f8119r;

    /* renamed from: s, reason: collision with root package name */
    public static final Cx f8120s;

    /* renamed from: t, reason: collision with root package name */
    public static final Cx f8121t;

    /* renamed from: u, reason: collision with root package name */
    public static final Cx f8122u;

    /* renamed from: v, reason: collision with root package name */
    public static final Cx f8123v;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8124k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8125l;

    static {
        int i = 0;
        f8114m = new Cx("SHA1", i);
        f8115n = new Cx("SHA224", i);
        f8116o = new Cx("SHA256", i);
        f8117p = new Cx("SHA384", i);
        f8118q = new Cx("SHA512", i);
        int i5 = 1;
        f8119r = new Cx("TINK", i5);
        f8120s = new Cx("CRUNCHY", i5);
        f8121t = new Cx("NO_PREFIX", i5);
        int i6 = 2;
        f8122u = new Cx("TINK", i6);
        f8123v = new Cx("NO_PREFIX", i6);
    }

    public /* synthetic */ Cx(String str, int i) {
        this.f8124k = i;
        this.f8125l = str;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f8125l, Integer.toString(0)});
        return null;
    }

    public String toString() {
        switch (this.f8124k) {
            case 0:
                return this.f8125l;
            case 1:
                return this.f8125l;
            case 2:
                return this.f8125l;
            default:
                return super.toString();
        }
    }
}
