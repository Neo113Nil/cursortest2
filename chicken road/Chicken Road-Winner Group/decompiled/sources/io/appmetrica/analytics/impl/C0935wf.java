package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935wf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0883uf f8568a = new C0883uf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0780qf fromModel(C0909vf c0909vf) {
        C0780qf c0780qf = new C0780qf();
        if (!TextUtils.isEmpty(c0909vf.f8514a)) {
            c0780qf.f8155a = c0909vf.f8514a;
        }
        c0780qf.f8156b = c0909vf.f8515b.toString();
        c0780qf.f8157c = c0909vf.f8516c;
        c0780qf.f8158d = c0909vf.f8517d;
        c0780qf.f8159e = this.f8568a.fromModel(c0909vf.f8518e).intValue();
        return c0780qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0909vf toModel(C0780qf c0780qf) {
        JSONObject jSONObject;
        String str = c0780qf.f8155a;
        String str2 = c0780qf.f8156b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0909vf(str, jSONObject, c0780qf.f8157c, c0780qf.f8158d, this.f8568a.toModel(Integer.valueOf(c0780qf.f8159e)));
        }
        jSONObject = new JSONObject();
        return new C0909vf(str, jSONObject, c0780qf.f8157c, c0780qf.f8158d, this.f8568a.toModel(Integer.valueOf(c0780qf.f8159e)));
    }
}
