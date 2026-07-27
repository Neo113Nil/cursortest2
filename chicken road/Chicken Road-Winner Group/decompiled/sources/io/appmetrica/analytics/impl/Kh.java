package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Kh extends P3 {

    /* renamed from: c, reason: collision with root package name */
    protected I8 f6184c;

    /* renamed from: d, reason: collision with root package name */
    protected C1011zf f6185d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6186e;
    public String f;

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8) {
        this(gf, counterConfiguration, i8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f6383b.toBundle(bundle);
        Gf gf = this.f6382a;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        return bundle;
    }

    public final synchronized String d() {
        I8 i8;
        i8 = this.f6184c;
        return i8.f6090a.isEmpty() ? null : new JSONObject(i8.f6090a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.f6186e;
    }

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8, String str) {
        super(gf, counterConfiguration);
        this.f6186e = true;
        this.f = str;
        this.f6184c = i8;
    }
}
