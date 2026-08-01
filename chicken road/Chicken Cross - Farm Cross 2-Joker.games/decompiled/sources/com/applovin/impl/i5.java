package com.applovin.impl;

import com.applovin.impl.g5;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class i5 extends o3 {
    private final e3 k;

    public i5(e3 e3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(e3Var.e(), jSONObject, jSONObject2, lVar);
        this.k = e3Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public g5.b t() {
        return g5.b.values()[a("signal_cache_level", ((Integer) this.f4356a.a(v3.c8)).intValue())];
    }

    @Override // com.applovin.impl.o3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + AbstractJsonLexerKt.END_OBJ;
    }

    public e3 u() {
        return this.k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f4356a.a(v3.b8)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f4356a.a(v3.J8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
