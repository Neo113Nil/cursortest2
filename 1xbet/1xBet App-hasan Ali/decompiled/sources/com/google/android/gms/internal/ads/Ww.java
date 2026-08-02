package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ww {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12125a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12126b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12127c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12128d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12129e;

    static {
        AbstractC0830c4.a("media3.datasource");
    }

    public Ww(Uri uri, long j5, long j6) {
        this(uri, Collections.EMPTY_MAP, j5, j6, 0);
    }

    public final String toString() {
        StringBuilder w5 = AbstractC0467k.w("DataSpec[GET ", this.f12125a.toString(), ", ");
        w5.append(this.f12127c);
        w5.append(", ");
        w5.append(this.f12128d);
        w5.append(", null, ");
        return L1.a.o(w5, this.f12129e, "]");
    }

    public Ww(Uri uri, Map map, long j5, long j6, int i) {
        boolean z3 = false;
        boolean z5 = j5 >= 0;
        AbstractC1668us.S(z5);
        AbstractC1668us.S(z5);
        if (j6 <= 0) {
            j6 = j6 == -1 ? -1L : j6;
            AbstractC1668us.S(z3);
            uri.getClass();
            this.f12125a = uri;
            this.f12126b = Collections.unmodifiableMap(new HashMap(map));
            this.f12127c = j5;
            this.f12128d = j6;
            this.f12129e = i;
        }
        z3 = true;
        AbstractC1668us.S(z3);
        uri.getClass();
        this.f12125a = uri;
        this.f12126b = Collections.unmodifiableMap(new HashMap(map));
        this.f12127c = j5;
        this.f12128d = j6;
        this.f12129e = i;
    }
}
