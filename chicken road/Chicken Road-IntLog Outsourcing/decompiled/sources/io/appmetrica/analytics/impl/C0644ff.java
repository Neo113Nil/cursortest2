package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1032uf f8186a;

    public C0644ff() {
        this(new C1032uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0954rf fromModel(C0696hf c0696hf) {
        C0954rf c0954rf = new C0954rf();
        if (!TextUtils.isEmpty(c0696hf.f8320a)) {
            c0954rf.f9170a = c0696hf.f8320a;
        }
        c0954rf.f9171b = c0696hf.f8321b.toString();
        c0954rf.f9172c = this.f8186a.fromModel(c0696hf.f8322c).intValue();
        return c0954rf;
    }

    public C0644ff(C1032uf c1032uf) {
        this.f8186a = c1032uf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0696hf toModel(C0954rf c0954rf) {
        JSONObject jSONObject;
        String str = c0954rf.f9170a;
        String str2 = c0954rf.f9171b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0696hf(str, jSONObject, this.f8186a.toModel(Integer.valueOf(c0954rf.f9172c)));
        }
        jSONObject = new JSONObject();
        return new C0696hf(str, jSONObject, this.f8186a.toModel(Integer.valueOf(c0954rf.f9172c)));
    }
}
