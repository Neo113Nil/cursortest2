package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084wf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1032uf f9526a = new C1032uf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0929qf fromModel(C1058vf c1058vf) {
        C0929qf c0929qf = new C0929qf();
        if (!TextUtils.isEmpty(c1058vf.f9469a)) {
            c0929qf.f9098a = c1058vf.f9469a;
        }
        c0929qf.f9099b = c1058vf.f9470b.toString();
        c0929qf.f9100c = c1058vf.f9471c;
        c0929qf.f9101d = c1058vf.f9472d;
        c0929qf.f9102e = this.f9526a.fromModel(c1058vf.f9473e).intValue();
        return c0929qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1058vf toModel(C0929qf c0929qf) {
        JSONObject jSONObject;
        String str = c0929qf.f9098a;
        String str2 = c0929qf.f9099b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C1058vf(str, jSONObject, c0929qf.f9100c, c0929qf.f9101d, this.f9526a.toModel(Integer.valueOf(c0929qf.f9102e)));
        }
        jSONObject = new JSONObject();
        return new C1058vf(str, jSONObject, c0929qf.f9100c, c0929qf.f9101d, this.f9526a.toModel(Integer.valueOf(c0929qf.f9102e)));
    }
}
