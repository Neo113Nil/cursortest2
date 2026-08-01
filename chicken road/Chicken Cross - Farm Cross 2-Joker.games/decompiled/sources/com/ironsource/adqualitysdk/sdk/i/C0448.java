package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0448 {

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final List f752;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final List f753;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final List f754;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final List f755;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean f756;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean f757;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f758;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f759;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean f760;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean f761;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f762;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f763;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f764;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f765;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f766;

    public C0448() {
        this.f755 = new ArrayList();
        this.f754 = new ArrayList();
        this.f753 = new ArrayList();
        this.f752 = new ArrayList();
    }

    public C0448(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f755 = new ArrayList();
        this.f754 = new ArrayList();
        this.f753 = new ArrayList();
        this.f752 = new ArrayList();
        this.f766 = jSONObject.optString(StringFog.decrypt("yrxmG7lCdiPKq0M8vVhQ\n", "q9gwctw1NU8=\n"));
        this.f765 = jSONObject.optString(StringFog.decrypt("5W0sUHUL7bvnYhtedQ==\n", "hAl6ORB8vdo=\n"));
        this.f764 = jSONObject.optString(StringFog.decrypt("R18plVweqmdOWA==\n", "LSx9+hVwwAI=\n"));
        this.f763 = jSONObject.optBoolean(StringFog.decrypt("9suI4OexuLzmz67b67aAoQ==\n", "g7jtt4LT7tU=\n"));
        jSONObject.optBoolean(StringFog.decrypt("D5Brh25BOSsIjGO1SE8TJhSX\n", "euMO0AsjekM=\n"));
        this.f762 = jSONObject.optString(StringFog.decrypt("WPRVNuwD50NV\n", "LYY5Zp5mgSo=\n"));
        this.f761 = jSONObject.optBoolean(StringFog.decrypt("P2Cq4zlLYuMXdw==\n", "VhPkgk0iFIY=\n"));
        this.f760 = jSONObject.optBoolean(StringFog.decrypt("KFpQcd68ACsqdE5+/pkAKzpG\n", "TjUiErvvZUU=\n"));
        this.f759 = jSONObject.optBoolean(StringFog.decrypt("lGG1HSlNkyyD\n", "5gTWaFs++lo=\n"));
        this.f758 = jSONObject.optBoolean(StringFog.decrypt("ulfedh0AZ7KsVtJMCA==\n", "zyS7PHx2BsE=\n"), true);
        this.f757 = jSONObject.optBoolean(StringFog.decrypt("h7iZhQhpPLm4uA==\n", "8sv8wHAdTtg=\n"));
        this.f756 = jSONObject.optBoolean(StringFog.decrypt("bajDRmZI6DZ0v9tWTFXWAXS0+E1xXvoE\n", "HdqsJQM7m2A=\n"), true);
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("tgQWBO/dWw==\n", "wG1zc6a5KP0=\n"));
        ArrayList arrayList4 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f755 = arrayList;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("iLgGYQk5EwOMqCZnNjcJBZu+\n", "6dtyCH9QZ2o=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                Object opt2 = optJSONArray2.opt(i2);
                if (opt2 != null) {
                    arrayList2.add(opt2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.f754 = arrayList2;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray(StringFog.decrypt("f2n0vNjH2spubv65zg==\n", "CQCRy6uTtYM=\n"));
        if (optJSONArray3 != null) {
            arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                Object opt3 = optJSONArray3.opt(i3);
                if (opt3 != null) {
                    arrayList3.add(opt3);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            this.f753 = arrayList3;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray(StringFog.decrypt("F9ix6FY/x7kb/7X+VQ==\n", "dLTQmyVatO0=\n"));
        if (optJSONArray4 != null) {
            arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                Object opt4 = optJSONArray4.opt(i4);
                if (opt4 != null) {
                    arrayList4.add(opt4);
                }
            }
        }
        if (arrayList4 != null) {
            this.f752 = arrayList4;
        }
    }
}
