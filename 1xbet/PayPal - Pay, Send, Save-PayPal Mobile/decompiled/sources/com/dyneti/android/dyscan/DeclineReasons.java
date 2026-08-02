package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class DeclineReasons implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.dyneti.android.dyscan.DeclineReasons> CREATOR = new com.dyneti.android.dyscan.q0();

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.m0 f3280a = com.dyneti.android.dyscan.m0.f3323a;
    public final java.lang.String b;
    public final java.lang.String c;
    public java.lang.String d;
    public final java.lang.String e;
    public java.lang.String f;

    public DeclineReasons(android.os.Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isFormatMismatch() {
        return a(this.b, "formatMismatch");
    }

    public boolean isGeneratedImage() {
        return a(this.d, "generatedImage");
    }

    public boolean isNumberMismatch() {
        return a(this.c, "numberMismatch");
    }

    public boolean isRateLimited() {
        return a(this.e, "rateLimited");
    }

    public boolean isTamperedFeatures() {
        return a(this.f, "tamperedFeatures");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return false;
        }
        try {
            com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.getString("key").equals(str2)) {
                return jSONObject.getBoolean(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            }
            this.f = a("tamperedFeatures", true);
            return false;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    public final java.lang.String a(java.lang.String str, boolean z) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("timestamp", java.lang.System.currentTimeMillis());
            jSONObject.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, z);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
            return jSONObject2;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
