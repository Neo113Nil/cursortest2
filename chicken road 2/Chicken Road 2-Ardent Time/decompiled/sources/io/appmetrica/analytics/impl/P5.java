package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class P5 implements io.appmetrica.analytics.coreapi.internal.event.CounterReportApi, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<io.appmetrica.analytics.impl.P5> CREATOR = new io.appmetrica.analytics.impl.O5();

    /* renamed from: a, reason: collision with root package name */
    protected java.lang.String f4813a;

    /* renamed from: b, reason: collision with root package name */
    protected java.lang.String f4814b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f4815c;

    /* renamed from: d, reason: collision with root package name */
    public int f4816d;

    /* renamed from: e, reason: collision with root package name */
    public int f4817e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Pair f4818f;

    /* renamed from: g, reason: collision with root package name */
    public int f4819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f4820h;

    /* renamed from: i, reason: collision with root package name */
    public long f4821i;

    /* renamed from: j, reason: collision with root package name */
    public long f4822j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.impl.EnumC0302da f4823k;

    /* renamed from: l, reason: collision with root package name */
    public io.appmetrica.analytics.impl.EnumC0533m9 f4824l;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f4825m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f4826n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f4827o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f4828p;

    public P5() {
        this("", 0);
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        if (this.f4818f == null) {
            this.f4818f = new android.util.Pair(str, str2);
        }
    }

    public final android.util.Pair<java.lang.String, java.lang.String> b() {
        return this.f4818f;
    }

    public final void c(android.os.Bundle bundle) {
        this.f4825m = bundle;
    }

    public final long d() {
        return this.f4821i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f4822j;
    }

    public final java.lang.String f() {
        return this.f4815c;
    }

    public final io.appmetrica.analytics.impl.EnumC0302da g() {
        return this.f4823k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f4819g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f4817e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final java.util.Map<java.lang.String, byte[]> getExtras() {
        return this.f4828p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final java.lang.String getName() {
        return this.f4813a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f4816d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final java.lang.String getValue() {
        return this.f4814b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        java.lang.String str = this.f4814b;
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    public final java.lang.Integer h() {
        return this.f4827o;
    }

    public final android.os.Bundle i() {
        return this.f4825m;
    }

    public final java.lang.String j() {
        return this.f4820h;
    }

    public final io.appmetrica.analytics.impl.EnumC0533m9 k() {
        return this.f4824l;
    }

    public final boolean l() {
        return this.f4813a == null;
    }

    public final boolean m() {
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f4816d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i2) {
        this.f4819g = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i2) {
        this.f4817e = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(java.util.Map<java.lang.String, byte[]> map) {
        this.f4828p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(java.lang.String str) {
        this.f4813a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i2) {
        this.f4816d = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(java.lang.String str) {
        this.f4814b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f4814b = bArr == null ? null : new java.lang.String(android.util.Base64.encode(bArr, 0));
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String str = this.f4813a;
        java.lang.String str2 = io.appmetrica.analytics.impl.EnumC0251bb.a(this.f4816d).f5574b;
        java.lang.String str3 = this.f4814b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return B1.a.j(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("CounterReport.Event", this.f4813a);
        bundle.putString("CounterReport.Value", this.f4814b);
        bundle.putInt("CounterReport.Type", this.f4816d);
        bundle.putInt("CounterReport.CustomType", this.f4817e);
        bundle.putInt("CounterReport.TRUNCATED", this.f4819g);
        bundle.putString("CounterReport.ProfileID", this.f4820h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f4823k.f5724a);
        android.os.Bundle bundle2 = this.f4825m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        java.lang.String str = this.f4815c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        android.util.Pair pair = this.f4818f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (java.lang.String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (java.lang.String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f4821i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f4822j);
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9 = this.f4824l;
        if (enumC0533m9 != null) {
            bundle.putInt("CounterReport.Source", enumC0533m9.f6419a);
        }
        java.lang.Boolean bool = this.f4826n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        java.lang.Integer num = this.f4827o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.mapToBundle(this.f4828p));
        parcel.writeBundle(bundle);
    }

    public P5(java.lang.String str, int i2) {
        this("", str, i2);
    }

    public static io.appmetrica.analytics.impl.P5 e(io.appmetrica.analytics.impl.P5 p5) {
        return a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(java.lang.String str) {
        this.f4815c = str;
    }

    public void c(java.lang.String str) {
        this.f4820h = str;
    }

    public final android.os.Bundle d(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public P5(java.lang.String str, java.lang.String str2, int i2) {
        this(str, str2, i2, new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public final void a(long j2) {
        this.f4821i = j2;
    }

    public final void b(long j2) {
        this.f4822j = j2;
    }

    public final java.lang.Boolean c() {
        return this.f4826n;
    }

    public P5(java.lang.String str, java.lang.String str2, int i2, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f4823k = io.appmetrica.analytics.impl.EnumC0302da.UNKNOWN;
        this.f4828p = new java.util.HashMap();
        this.f4813a = str2;
        this.f4816d = i2;
        this.f4814b = str;
        this.f4821i = systemTimeProvider.elapsedRealtime();
        this.f4822j = systemTimeProvider.currentTimeMillis();
    }

    public static io.appmetrica.analytics.impl.P5 b(android.os.Bundle bundle) {
        if (bundle != null) {
            try {
                io.appmetrica.analytics.impl.P5 p5 = (io.appmetrica.analytics.impl.P5) bundle.getParcelable("CounterReport.Object");
                if (p5 != null) {
                    return p5;
                }
            } catch (java.lang.Throwable unused) {
                return new io.appmetrica.analytics.impl.P5("", 0);
            }
        }
        return new io.appmetrica.analytics.impl.P5("", 0);
    }

    public static io.appmetrica.analytics.impl.P5 c(io.appmetrica.analytics.impl.P5 p5) {
        return a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_INIT);
    }

    public static io.appmetrica.analytics.impl.P5 d(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.P5 p52 = new io.appmetrica.analytics.impl.P5("", 0);
        p52.f4822j = p5.f4822j;
        p52.f4821i = p5.f4821i;
        p52.f4818f = p5.f4818f;
        p52.f4815c = p5.f4815c;
        p52.f4825m = p5.f4825m;
        p52.f4828p = p5.f4828p;
        p52.f4820h = p5.f4820h;
        return p52;
    }

    public final void a(io.appmetrica.analytics.impl.EnumC0302da enumC0302da) {
        this.f4823k = enumC0302da;
    }

    public final void a(io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9) {
        this.f4824l = enumC0533m9;
    }

    public final void a(java.lang.Boolean bool) {
        this.f4826n = bool;
    }

    public final void a(java.lang.Integer num) {
        this.f4827o = num;
    }

    public static android.util.Pair a(android.os.Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new android.util.Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static io.appmetrica.analytics.impl.P5 b(io.appmetrica.analytics.impl.P5 p5) {
        return a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb) {
        io.appmetrica.analytics.impl.P5 d2 = d(p5);
        d2.f4816d = enumC0251bb.f5573a;
        return d2;
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5) {
        return a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ALIVE);
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.M9 m9) {
        io.appmetrica.analytics.impl.P5 a2 = a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_START);
        a2.setValueBytes(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(new io.appmetrica.analytics.impl.C0611p9().fromModel(new io.appmetrica.analytics.impl.C0585o9((java.lang.String) m9.f4654b.a()))));
        a2.f4822j = p5.f4822j;
        a2.f4821i = p5.f4821i;
        return a2;
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5, java.util.Collection<io.appmetrica.analytics.coreapi.internal.permission.PermissionState> collection, io.appmetrica.analytics.impl.C0811x2 c0811x2, io.appmetrica.analytics.impl.C0268c2 c0268c2, java.util.List<java.lang.String> list) {
        java.lang.String str;
        java.lang.String str2;
        io.appmetrica.analytics.impl.P5 d2 = d(p5);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (io.appmetrica.analytics.coreapi.internal.permission.PermissionState permissionState : collection) {
                jSONArray.put(new org.json.JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (c0811x2 != null) {
                jSONObject.put("background_restricted", c0811x2.f7074b);
                io.appmetrica.analytics.impl.EnumC0785w2 enumC0785w2 = c0811x2.f7073a;
                c0268c2.getClass();
                if (enumC0785w2 != null) {
                    int ordinal = enumC0785w2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new org.json.JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new org.json.JSONArray((java.util.Collection) list)).toString();
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        d2.f4816d = 12288;
        d2.setValue(str);
        return d2;
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5, java.lang.String str) {
        io.appmetrica.analytics.impl.P5 d2 = d(p5);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        d2.f4816d = 12289;
        d2.setValue(str);
        return d2;
    }

    public static io.appmetrica.analytics.impl.P5 a() {
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 16384;
        return p5;
    }

    public static io.appmetrica.analytics.impl.P5 a(java.lang.String str) {
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 12320;
        p5.f4814b = str;
        p5.f4824l = io.appmetrica.analytics.impl.EnumC0533m9.JS;
        return p5;
    }
}
