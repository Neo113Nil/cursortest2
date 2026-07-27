package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class W5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<W5> CREATOR = new V5();

    /* renamed from: a, reason: collision with root package name */
    protected String f6775a;

    /* renamed from: b, reason: collision with root package name */
    protected String f6776b;

    /* renamed from: c, reason: collision with root package name */
    public String f6777c;

    /* renamed from: d, reason: collision with root package name */
    public int f6778d;

    /* renamed from: e, reason: collision with root package name */
    public int f6779e;
    public Pair f;

    /* renamed from: g, reason: collision with root package name */
    public int f6780g;

    /* renamed from: h, reason: collision with root package name */
    public String f6781h;

    /* renamed from: i, reason: collision with root package name */
    public long f6782i;

    /* renamed from: j, reason: collision with root package name */
    public long f6783j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0619ka f6784k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0851t9 f6785l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f6786m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f6787n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f6788o;

    /* renamed from: p, reason: collision with root package name */
    public Map f6789p;

    public W5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(Bundle bundle) {
        this.f6786m = bundle;
    }

    public final long d() {
        return this.f6782i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f6783j;
    }

    public final String f() {
        return this.f6777c;
    }

    public final EnumC0619ka g() {
        return this.f6784k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f6780g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f6779e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f6789p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f6775a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f6778d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f6776b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f6776b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f6788o;
    }

    public final Bundle i() {
        return this.f6786m;
    }

    public final String j() {
        return this.f6781h;
    }

    public final EnumC0851t9 k() {
        return this.f6785l;
    }

    public final boolean l() {
        return this.f6775a == null;
    }

    public final boolean m() {
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        return -1 == this.f6778d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i3) {
        this.f6780g = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i3) {
        this.f6779e = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f6789p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f6775a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i3) {
        this.f6778d = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f6776b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f6776b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f6775a;
        String str2 = EnumC0569ib.a(this.f6778d).f7539b;
        String str3 = this.f6776b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        StringBuilder sb = new StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return B0.c.l(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f6775a);
        bundle.putString("CounterReport.Value", this.f6776b);
        bundle.putInt("CounterReport.Type", this.f6778d);
        bundle.putInt("CounterReport.CustomType", this.f6779e);
        bundle.putInt("CounterReport.TRUNCATED", this.f6780g);
        bundle.putString("CounterReport.ProfileID", this.f6781h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f6784k.f7699a);
        Bundle bundle2 = this.f6786m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f6777c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f6782i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f6783j);
        EnumC0851t9 enumC0851t9 = this.f6785l;
        if (enumC0851t9 != null) {
            bundle.putInt("CounterReport.Source", enumC0851t9.f8357a);
        }
        Boolean bool = this.f6787n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f6788o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f6789p));
        parcel.writeBundle(bundle);
    }

    public W5(String str, int i3) {
        this("", str, i3);
    }

    public static W5 e(W5 w5) {
        return a(w5, EnumC0569ib.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f6777c = str;
    }

    public void c(String str) {
        this.f6781h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public W5(String str, String str2, int i3) {
        this(str, str2, i3, new SystemTimeProvider());
    }

    public final void a(long j3) {
        this.f6782i = j3;
    }

    public final void b(long j3) {
        this.f6783j = j3;
    }

    public final Boolean c() {
        return this.f6787n;
    }

    public W5(String str, String str2, int i3, SystemTimeProvider systemTimeProvider) {
        this.f6784k = EnumC0619ka.UNKNOWN;
        this.f6789p = new HashMap();
        this.f6775a = str2;
        this.f6778d = i3;
        this.f6776b = str;
        this.f6782i = systemTimeProvider.elapsedRealtime();
        this.f6783j = systemTimeProvider.currentTimeMillis();
    }

    public static W5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                W5 w5 = (W5) bundle.getParcelable("CounterReport.Object");
                if (w5 != null) {
                    return w5;
                }
            } catch (Throwable unused) {
                return new W5("", 0);
            }
        }
        return new W5("", 0);
    }

    public static W5 c(W5 w5) {
        return a(w5, EnumC0569ib.EVENT_TYPE_INIT);
    }

    public static W5 d(W5 w5) {
        W5 w52 = new W5("", 0);
        w52.f6783j = w5.f6783j;
        w52.f6782i = w5.f6782i;
        w52.f = w5.f;
        w52.f6777c = w5.f6777c;
        w52.f6786m = w5.f6786m;
        w52.f6789p = w5.f6789p;
        w52.f6781h = w5.f6781h;
        return w52;
    }

    public final void a(EnumC0619ka enumC0619ka) {
        this.f6784k = enumC0619ka;
    }

    public final void a(EnumC0851t9 enumC0851t9) {
        this.f6785l = enumC0851t9;
    }

    public final void a(Boolean bool) {
        this.f6787n = bool;
    }

    public final void a(Integer num) {
        this.f6788o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static W5 b(W5 w5) {
        return a(w5, EnumC0569ib.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static W5 a(W5 w5, EnumC0569ib enumC0569ib) {
        W5 d3 = d(w5);
        d3.f6778d = enumC0569ib.f7538a;
        return d3;
    }

    public static W5 a(W5 w5) {
        return a(w5, EnumC0569ib.EVENT_TYPE_ALIVE);
    }

    public static W5 a(W5 w5, T9 t9) {
        W5 a3 = a(w5, EnumC0569ib.EVENT_TYPE_START);
        a3.setValueBytes(MessageNano.toByteArray(new C0929w9().fromModel(new C0903v9((String) t9.f6653b.a()))));
        a3.f6783j = w5.f6783j;
        a3.f6782i = w5.f6782i;
        return a3;
    }

    public static W5 a(W5 w5, Collection<PermissionState> collection, F2 f22, C0637l2 c0637l2, List<String> list) {
        String str;
        String str2;
        W5 d3 = d(w5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (f22 != null) {
                jSONObject.put("background_restricted", f22.f5928b);
                E2 e22 = f22.f5927a;
                c0637l2.getClass();
                if (e22 != null) {
                    switch (e22) {
                        case EXEMPTED:
                            str2 = "EXEMPTED";
                            break;
                        case ACTIVE:
                            str2 = "ACTIVE";
                            break;
                        case WORKING_SET:
                            str2 = "WORKING_SET";
                            break;
                        case FREQUENT:
                            str2 = "FREQUENT";
                            break;
                        case RARE:
                            str2 = "RARE";
                            break;
                        case RESTRICTED:
                            str2 = "RESTRICTED";
                            break;
                        case UNKNOWN:
                            str2 = "UNKNOWN";
                            break;
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        d3.f6778d = 12288;
        d3.setValue(str);
        return d3;
    }

    public static W5 a(W5 w5, String str) {
        W5 d3 = d(w5);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        d3.f6778d = 12289;
        d3.setValue(str);
        return d3;
    }

    public static W5 a() {
        W5 w5 = new W5("", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 16384;
        return w5;
    }

    public static W5 a(String str) {
        W5 w5 = new W5("", 0);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        w5.f6778d = 12320;
        w5.f6776b = str;
        w5.f6785l = EnumC0851t9.JS;
        return w5;
    }
}
