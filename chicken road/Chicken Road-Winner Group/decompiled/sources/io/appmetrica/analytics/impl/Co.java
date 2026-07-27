package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Co {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5816a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5817b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final yo f5818c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f5819d;

    public Co(Context context) {
        this.f5816a = context;
        C0568ia c0568ia = new C0568ia(context, "appmetrica_vital.dat");
        this.f5818c = new yo(C0878ua.k().z(), c0568ia);
        this.f5819d = new yo(new C0469ef(C0513g7.a(context).d()), c0568ia);
    }

    public final yo a() {
        return this.f5818c;
    }

    public final yo b() {
        return this.f5819d;
    }
}
