package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Kh extends P3 {

    /* renamed from: c, reason: collision with root package name */
    protected I8 f7037c;

    /* renamed from: d, reason: collision with root package name */
    protected C1160zf f7038d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7039e;

    /* renamed from: f, reason: collision with root package name */
    public String f7040f;

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8) {
        this(gf, counterConfiguration, i8, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f7239b.toBundle(bundle);
        Gf gf = this.f7238a;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        return bundle;
    }

    public final synchronized String d() {
        I8 i8;
        i8 = this.f7037c;
        return i8.f6939a.isEmpty() ? null : new JSONObject(i8.f6939a).toString();
    }

    public final synchronized String e() {
        return this.f7040f;
    }

    public boolean f() {
        return this.f7039e;
    }

    public Kh(Gf gf, CounterConfiguration counterConfiguration, I8 i8, String str) {
        super(gf, counterConfiguration);
        this.f7039e = true;
        this.f7040f = str;
        this.f7037c = i8;
    }
}
