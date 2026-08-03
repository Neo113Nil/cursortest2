package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208c implements io.appmetrica.analytics.coreapi.internal.data.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.C0210e f3903a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3904b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3905c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3906d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f3907e = "requests";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f3908f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f3909g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f3910h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f3911i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f3912j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f3913k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f3914l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f3915m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f3916n = "cell";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f3917o = "report_event_enabled";

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f3918p = "report_url";

    public C0208c(io.appmetrica.analytics.idsync.impl.C0210e c0210e) {
        this.f3903a = c0210e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.internal.model.IdSyncConfig parse(org.json.JSONObject jSONObject) {
        io.appmetrica.analytics.idsync.impl.k[] kVarArr;
        org.json.JSONArray jSONArray;
        int i2;
        io.appmetrica.analytics.idsync.impl.i[] iVarArr;
        org.json.JSONArray jSONArray2;
        int i3;
        org.json.JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i4;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(this.f3905c);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        io.appmetrica.analytics.idsync.impl.m mVar = new io.appmetrica.analytics.idsync.impl.m();
        mVar.f3951a = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractFeature(jSONObject, this.f3904b, mVar.f3951a);
        io.appmetrica.analytics.idsync.impl.l lVar = new io.appmetrica.analytics.idsync.impl.l();
        lVar.f3946a = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f3906d, lVar.f3946a);
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray(this.f3907e);
        int i5 = 0;
        if (optJSONArray == null) {
            kVarArr = new io.appmetrica.analytics.idsync.impl.k[0];
        } else {
            int length = optJSONArray.length();
            io.appmetrica.analytics.idsync.impl.k[] kVarArr2 = new io.appmetrica.analytics.idsync.impl.k[length];
            int i6 = 0;
            while (i6 < length) {
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i6);
                io.appmetrica.analytics.idsync.impl.k kVar = new io.appmetrica.analytics.idsync.impl.k();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i2 = length;
                    i4 = i5;
                } else {
                    java.lang.String optString = optJSONObject2.optString(this.f3908f);
                    java.nio.charset.Charset charset = y1.a.f8486a;
                    kVar.f3936a = optString.getBytes(charset);
                    org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f3914l);
                    io.appmetrica.analytics.idsync.impl.j jVar = new io.appmetrica.analytics.idsync.impl.j();
                    if (optJSONObject3 != null && kotlin.jvm.internal.i.a(optJSONObject3.optString(this.f3915m), this.f3916n)) {
                        jVar.f3934a = 1;
                    }
                    kVar.f3937b = jVar;
                    kVar.f3938c = optJSONObject2.optString(this.f3909g).getBytes(charset);
                    org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f3910h);
                    if (optJSONObject4 == null) {
                        iVarArr = new io.appmetrica.analytics.idsync.impl.i[i5];
                        jSONArray = optJSONArray;
                        i2 = length;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<java.lang.String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            io.appmetrica.analytics.idsync.impl.i iVar = new io.appmetrica.analytics.idsync.impl.i();
                            iVar.f3931a = next.getBytes(y1.a.f8486a);
                            org.json.JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i5][];
                                jSONArray2 = optJSONArray;
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i7 = 0;
                                while (i7 < length2) {
                                    bArr2[i7] = optJSONArray2.optString(i7).getBytes(y1.a.f8486a);
                                    i7++;
                                    length = length;
                                    optJSONObject4 = optJSONObject4;
                                }
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                                bArr = bArr2;
                            }
                            iVar.f3932b = bArr;
                            arrayList.add(iVar);
                            optJSONArray = jSONArray2;
                            length = i3;
                            optJSONObject4 = jSONObject2;
                            i5 = 0;
                        }
                        jSONArray = optJSONArray;
                        i2 = length;
                        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.idsync.impl.i[i5]);
                        if (array == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (io.appmetrica.analytics.idsync.impl.i[]) array;
                    }
                    kVar.f3939d = iVarArr;
                    kVar.f3940e = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f3911i, kVar.f3940e);
                    kVar.f3941f = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f3912j, kVar.f3941f);
                    org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f3913k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i8 = 0; i8 < length3; i8++) {
                            iArr3[i8] = optJSONArray3.optInt(i8);
                        }
                        iArr = iArr3;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i9 : iArr) {
                        if (i9 != 0) {
                            arrayList2.add(java.lang.Integer.valueOf(i9));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = i1.AbstractC0190i.W(arrayList2);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        iArr2 = new int[]{200};
                    }
                    kVar.f3942g = iArr2;
                    kVar.f3943h = optJSONObject2.optBoolean(this.f3917o, kVar.f3943h);
                    kVar.f3944i = optJSONObject2.optString(this.f3918p);
                }
                kVarArr2[i6] = kVar;
                i6++;
                i5 = i4;
                optJSONArray = jSONArray;
                length = i2;
            }
            kVarArr = kVarArr2;
        }
        lVar.f3947b = kVarArr;
        mVar.f3952b = lVar;
        return this.f3903a.toModel(mVar);
    }

    public final io.appmetrica.analytics.idsync.internal.model.IdSyncConfig b(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.idsync.internal.model.IdSyncConfig) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parseOrNull(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.idsync.internal.model.IdSyncConfig) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
