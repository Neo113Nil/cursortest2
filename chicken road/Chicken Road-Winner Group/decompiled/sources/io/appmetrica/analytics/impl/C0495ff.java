package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0883uf f7291a;

    public C0495ff() {
        this(new C0883uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0805rf fromModel(C0547hf c0547hf) {
        C0805rf c0805rf = new C0805rf();
        if (!TextUtils.isEmpty(c0547hf.f7417a)) {
            c0805rf.f8226a = c0547hf.f7417a;
        }
        c0805rf.f8227b = c0547hf.f7418b.toString();
        c0805rf.f8228c = this.f7291a.fromModel(c0547hf.f7419c).intValue();
        return c0805rf;
    }

    public C0495ff(C0883uf c0883uf) {
        this.f7291a = c0883uf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0547hf toModel(C0805rf c0805rf) {
        JSONObject jSONObject;
        String str = c0805rf.f8226a;
        String str2 = c0805rf.f8227b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0547hf(str, jSONObject, this.f7291a.toModel(Integer.valueOf(c0805rf.f8228c)));
        }
        jSONObject = new JSONObject();
        return new C0547hf(str, jSONObject, this.f7291a.toModel(Integer.valueOf(c0805rf.f8228c)));
    }
}
