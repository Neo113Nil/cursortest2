package io.appmetrica.analytics.idsync.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import g4.AbstractC0465j;
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
    public final e f6392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6393b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f6394c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f6395d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f6396e = "requests";

    /* renamed from: f, reason: collision with root package name */
    public final String f6397f = WebViewManager.EVENT_TYPE_KEY;

    /* renamed from: g, reason: collision with root package name */
    public final String f6398g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f6399h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f6400i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final String f6401j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f6402k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f6403l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f6404m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final String f6405n = "cell";

    public c(e eVar) {
        this.f6392a = eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        int i2;
        k[] kVarArr;
        JSONArray jSONArray2;
        int i3;
        JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i6;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f6394c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f6438a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f6393b, oVar.f6438a);
        n nVar = new n();
        nVar.f6433a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f6395d, nVar.f6433a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f6396e);
        int i7 = 0;
        if (optJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = optJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i8 = 0;
            while (i8 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i8);
                m mVar = new m();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i2 = length;
                    i6 = i7;
                } else {
                    String optString = optJSONObject2.optString(this.f6397f);
                    Charset charset = B4.a.f287a;
                    mVar.f6425a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f6403l);
                    l lVar = new l();
                    if (optJSONObject3 != null && kotlin.jvm.internal.i.a(optJSONObject3.optString(this.f6404m), this.f6405n)) {
                        lVar.f6423a = 1;
                    }
                    mVar.f6426b = lVar;
                    mVar.f6427c = optJSONObject2.optString(this.f6398g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f6399h);
                    if (optJSONObject4 == null) {
                        kVarArr = new k[i7];
                        jSONArray = optJSONArray;
                        i2 = length;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            k kVar = new k();
                            kVar.f6420a = next.getBytes(B4.a.f287a);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i7][];
                                jSONArray2 = optJSONArray;
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i9 = 0;
                                while (i9 < length2) {
                                    bArr2[i9] = optJSONArray2.optString(i9).getBytes(B4.a.f287a);
                                    i9++;
                                    length = length;
                                    optJSONObject4 = optJSONObject4;
                                }
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                                bArr = bArr2;
                            }
                            kVar.f6421b = bArr;
                            arrayList.add(kVar);
                            optJSONArray = jSONArray2;
                            length = i3;
                            optJSONObject4 = jSONObject2;
                            i7 = 0;
                        }
                        jSONArray = optJSONArray;
                        i2 = length;
                        Object[] array = arrayList.toArray(new k[i7]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f6428d = kVarArr;
                    mVar.f6429e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f6400i, mVar.f6429e);
                    mVar.f6430f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f6401j, mVar.f6430f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f6402k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i10 = 0; i10 < length3; i10++) {
                            iArr3[i10] = optJSONArray3.optInt(i10);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 : iArr) {
                        if (i11 != 0) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = AbstractC0465j.R0(arrayList2);
                        i6 = 0;
                    } else {
                        i6 = 0;
                        iArr2 = new int[]{200};
                    }
                    mVar.f6431g = iArr2;
                }
                mVarArr2[i8] = mVar;
                i8++;
                i7 = i6;
                optJSONArray = jSONArray;
                length = i2;
            }
            mVarArr = mVarArr2;
        }
        nVar.f6434b = mVarArr;
        oVar.f6439b = nVar;
        return this.f6392a.toModel(oVar);
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
