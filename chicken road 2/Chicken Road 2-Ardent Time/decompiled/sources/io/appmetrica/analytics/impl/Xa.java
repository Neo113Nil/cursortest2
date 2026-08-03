package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xa implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<io.appmetrica.analytics.impl.Xa> CREATOR = new io.appmetrica.analytics.impl.Wa();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.ResultReceiver f5295a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f5296b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f5297c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5298d;

    public Xa(io.appmetrica.analytics.impl.B6 b6, java.util.List list, java.util.Map map, boolean z2) {
        this.f5296b = list;
        this.f5295a = b6;
        this.f5297c = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        this.f5298d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f5295a);
        if (this.f5296b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new java.util.ArrayList<>(this.f5296b));
        }
        java.util.HashMap hashMap = this.f5297c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", io.appmetrica.analytics.impl.Fm.a((java.util.Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f5298d);
        parcel.writeBundle(bundle);
    }

    public Xa(android.os.Parcel parcel) {
        android.os.Bundle readBundle = parcel.readBundle(io.appmetrica.analytics.impl.B6.class.getClassLoader());
        if (readBundle != null) {
            this.f5295a = (android.os.ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f5296b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f5297c = io.appmetrica.analytics.impl.Fm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f5298d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f5297c = new java.util.HashMap();
    }
}
