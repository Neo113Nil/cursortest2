package com.ironsource;

@java.lang.Deprecated
/* renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2980c1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.ironsource.C2980c1> CREATOR = new com.ironsource.C2980c1.a();

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6166a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;
    private int e;
    private java.util.ArrayList<java.lang.String> f;
    private java.util.ArrayList<java.lang.String> g;
    private java.util.ArrayList<java.lang.String> h;
    private java.util.ArrayList<java.lang.String> i;
    private java.lang.String j;
    private java.lang.String k;
    private java.util.Map<java.lang.String, java.lang.String> l;

    /* renamed from: com.ironsource.c1$a */
    class a implements android.os.Parcelable.Creator<com.ironsource.C2980c1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.ironsource.C2980c1 createFromParcel(android.os.Parcel parcel) {
            return new com.ironsource.C2980c1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.ironsource.C2980c1[] newArray(int i) {
            return new com.ironsource.C2980c1[i];
        }
    }

    public C2980c1() {
        i();
    }

    private void i() {
        this.d = false;
        this.e = -1;
        this.f = new java.util.ArrayList<>();
        this.g = new java.util.ArrayList<>();
        this.h = new java.util.ArrayList<>();
        this.i = new java.util.ArrayList<>();
        this.k = "";
        this.j = "";
        this.l = new java.util.HashMap();
    }

    public void a(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.g.remove(str);
        } else if (this.g.indexOf(str) == -1) {
            this.g.add(str);
        }
    }

    public boolean b(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public boolean c(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public java.lang.String d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.Map<java.lang.String, java.lang.String> e() {
        return this.l;
    }

    public java.lang.String f() {
        return this.k;
    }

    public void g(java.lang.String str) {
        this.j = str;
    }

    public void h(java.lang.String str) {
        this.k = str;
    }

    public boolean j() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.l);
            sb.append(", ");
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.f6166a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new org.json.JSONObject(this.l).toString());
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
        }
    }

    public boolean d(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    public boolean e(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && this.h.indexOf(str) > -1;
    }

    public void f(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String g() {
        return this.f6166a;
    }

    public java.lang.String h() {
        return this.b;
    }

    public void j(java.lang.String str) {
        this.b = str;
    }

    private C2980c1(android.os.Parcel parcel) {
        i();
        try {
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.f6166a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            i();
        }
    }

    public java.lang.String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public void b(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.i.indexOf(str) == -1) {
                this.i.add(str);
                return;
            }
            return;
        }
        this.i.remove(str);
    }

    public void c(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f.indexOf(str) == -1) {
                this.f.add(str);
                return;
            }
            return;
        }
        this.f.remove(str);
    }

    public void d(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.h.indexOf(str) == -1) {
                this.h.add(str);
                return;
            }
            return;
        }
        this.h.remove(str);
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a() {
        this.e = -1;
    }

    private java.util.Map<java.lang.String, java.lang.String> a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
        return hashMap;
    }

    public void i(java.lang.String str) {
        this.f6166a = str;
    }
}
