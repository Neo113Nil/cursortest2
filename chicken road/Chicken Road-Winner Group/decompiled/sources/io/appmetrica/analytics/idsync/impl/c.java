package io.appmetrica.analytics.idsync.impl;

import e2.AbstractC0292g;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final e f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5571b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f5572c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f5573d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f5574e = "requests";
    public final String f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final String f5575g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f5576h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f5577i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final String f5578j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f5579k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f5580l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f5581m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final String f5582n = "cell";

    public c(e eVar) {
        this.f5570a = eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        k[] kVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i3;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f5572c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f5613a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f5571b, oVar.f5613a);
        n nVar = new n();
        nVar.f5608a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f5573d, nVar.f5608a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f5574e);
        int i4 = 0;
        if (optJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = optJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i5 = 0;
            while (i5 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i5);
                m mVar = new m();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i3 = i4;
                } else {
                    String optString = optJSONObject2.optString(this.f);
                    Charset charset = v2.a.f10417a;
                    mVar.f5601a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f5580l);
                    l lVar = new l();
                    if (optJSONObject3 != null && kotlin.jvm.internal.j.a(optJSONObject3.optString(this.f5581m), this.f5582n)) {
                        lVar.f5599a = 1;
                    }
                    mVar.f5602b = lVar;
                    mVar.f5603c = optJSONObject2.optString(this.f5575g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f5576h);
                    if (optJSONObject4 == null) {
                        kVarArr = new k[i4];
                        jSONArray = optJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            k kVar = new k();
                            kVar.f5596a = next.getBytes(v2.a.f10417a);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i4][];
                                jSONArray2 = optJSONArray;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i6 = 0;
                                while (i6 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i7 = i6;
                                    bArr3[i7] = optJSONArray2.optString(i6).getBytes(v2.a.f10417a);
                                    i6 = i7 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            kVar.f5597b = bArr;
                            arrayList.add(kVar);
                            optJSONArray = jSONArray2;
                            i4 = 0;
                        }
                        jSONArray = optJSONArray;
                        Object[] array = arrayList.toArray(new k[i4]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f5604d = kVarArr;
                    mVar.f5605e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f5577i, mVar.f5605e);
                    mVar.f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f5578j, mVar.f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f5579k);
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
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 : iArr) {
                        if (i9 != 0) {
                            arrayList2.add(Integer.valueOf(i9));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = AbstractC0292g.e0(arrayList2);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        iArr2 = new int[]{200};
                    }
                    mVar.f5606g = iArr2;
                }
                mVarArr2[i5] = mVar;
                i5++;
                i4 = i3;
                optJSONArray = jSONArray;
            }
            mVarArr = mVarArr2;
        }
        nVar.f5609b = mVarArr;
        oVar.f5614b = nVar;
        return this.f5570a.toModel(oVar);
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
