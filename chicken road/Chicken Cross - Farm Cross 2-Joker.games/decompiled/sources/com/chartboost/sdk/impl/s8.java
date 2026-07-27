package com.chartboost.sdk.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s8 {
    public static final a g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final URL f5007a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s8 a(JSONObject jsonObject) {
            URL url;
            JSONArray optJSONArray;
            int i;
            int i2;
            JSONArray optJSONArray2;
            int i3;
            int i4;
            String optString;
            String optString2;
            String optString3;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                optString3 = jsonObject.optString("base_url");
                Intrinsics.checkNotNull(optString3);
                if (StringsKt.isBlank(optString3)) {
                    optString3 = null;
                }
            } catch (MalformedURLException e) {
                mb.a("Unable to create baseUrl.", e);
            }
            if (optString3 != null) {
                url = new URL(optString3);
                optJSONArray = jsonObject.optJSONArray("scripts");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray == null) {
                    i = optJSONArray.length();
                    i2 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                }
                while (i2 < i) {
                    if (optJSONArray != null && (optString2 = optJSONArray.optString(i2)) != null) {
                        arrayList.add(optString2);
                    }
                    i2++;
                }
                optJSONArray2 = jsonObject.optJSONArray("scripts_before_load");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 == null) {
                    i3 = optJSONArray2.length();
                    i4 = 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                while (i4 < i3) {
                    if (optJSONArray2 != null && (optString = optJSONArray2.optString(i4)) != null) {
                        arrayList2.add(optString);
                    }
                    i4++;
                }
                boolean optBoolean = jsonObject.optBoolean("strict_mraid_open", false);
                boolean optBoolean2 = jsonObject.optBoolean("attach_temp_container_to_activity", true);
                String optString4 = jsonObject.optString("mraid_version", "2.0");
                Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
                return new s8(url, arrayList, arrayList2, optBoolean, optBoolean2, optString4);
            }
            url = null;
            optJSONArray = jsonObject.optJSONArray("scripts");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray == null) {
            }
            while (i2 < i) {
            }
            optJSONArray2 = jsonObject.optJSONArray("scripts_before_load");
            ArrayList arrayList22 = new ArrayList();
            if (optJSONArray2 == null) {
            }
            while (i4 < i3) {
            }
            boolean optBoolean3 = jsonObject.optBoolean("strict_mraid_open", false);
            boolean optBoolean22 = jsonObject.optBoolean("attach_temp_container_to_activity", true);
            String optString42 = jsonObject.optString("mraid_version", "2.0");
            Intrinsics.checkNotNullExpressionValue(optString42, "optString(...)");
            return new s8(url, arrayList3, arrayList22, optBoolean3, optBoolean22, optString42);
        }

        public a() {
        }
    }

    public s8(URL url, List scripts, List scriptsBeforeLoad, boolean z, boolean z2, String mraidVersion) {
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(scriptsBeforeLoad, "scriptsBeforeLoad");
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.f5007a = url;
        this.b = scripts;
        this.c = scriptsBeforeLoad;
        this.d = z;
        this.e = z2;
        this.f = mraidVersion;
    }

    public final boolean a() {
        return this.e;
    }

    public final URL b() {
        return this.f5007a;
    }

    public final String c() {
        return this.f;
    }

    public final List d() {
        return this.b;
    }

    public final List e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return Intrinsics.areEqual(this.f5007a, s8Var.f5007a) && Intrinsics.areEqual(this.b, s8Var.b) && Intrinsics.areEqual(this.c, s8Var.c) && this.d == s8Var.d && this.e == s8Var.e && Intrinsics.areEqual(this.f, s8Var.f);
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        URL url = this.f5007a;
        return ((((((((((url == null ? 0 : url.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "HTMLConfig(baseUrl=" + this.f5007a + ", scripts=" + this.b + ", scriptsBeforeLoad=" + this.c + ", strictMraidOpen=" + this.d + ", attachTempContainerToActivity=" + this.e + ", mraidVersion=" + this.f + ")";
    }
}
