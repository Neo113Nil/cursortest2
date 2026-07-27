package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3662dn extends AbstractC3790ia {
    public final Nm b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3662dn(String url, Nm uidMap, String str, int i, int i2, int i3) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        this.b = uidMap;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final Mf a() {
        String str;
        InMobiUserDataTypes obj;
        InMobiUserDataTypes obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = "prepare " + D7.f6507a;
        String str3 = (String) AbstractC3940ni.a().get("u-age");
        if (str3 != null) {
        }
        String jSONArray = AbstractC3606bn.b().toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        linkedHashMap.put("ufids", jSONArray);
        C4229y1 c4229y1 = Mm.f6724a;
        Boolean bool = c4229y1 != null ? c4229y1.c : null;
        if (bool == null || (str = bool.toString()) == null) {
            str = "true";
        }
        linkedHashMap.put(com.ironsource.L6.s, str);
        linkedHashMap.put("mk-version", AbstractC3942nk.a());
        String str4 = U1.f6882a;
        if (str4 != null) {
        }
        linkedHashMap.put(com.ironsource.L6.d0, AbstractC3914mk.b());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str5 = this.c;
        if (str5 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = D7.b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel2 = D7.b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            Intrinsics.checkNotNullParameter(obj2, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel3 = D7.b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        Nm nm = this.b;
        nm.getClass();
        HashMap hashMap = new HashMap();
        String jSONObject = new JSONObject(nm.a()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        hashMap.put("u-id-map", jSONObject);
        linkedHashMap.putAll(hashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(U1.d);
        linkedHashMap.putAll(Y5.f6965a.a(false));
        linkedHashMap.putAll(AbstractC3704f9.a());
        Li.a((HashMap) linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC4263z7.b();
        if (b != null) {
            String jSONObject2 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject2);
        }
        String str6 = this.f7160a;
        B7 b7 = new B7(linkedHashMap);
        int i = this.d;
        int i2 = this.e;
        IntRange intRange = Tf.f6872a;
        C3631ck c3631ck = new C3631ck(i, i2 * 1000, 0);
        long j = this.f * 1000;
        return new Mf(str6, null, new Cm(j, j, j), b7, c3631ck, 32);
    }
}
