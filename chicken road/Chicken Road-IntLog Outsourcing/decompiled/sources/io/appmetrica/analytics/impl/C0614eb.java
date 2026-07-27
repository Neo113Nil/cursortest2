package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614eb implements Parcelable {
    public static final Parcelable.Creator<C0614eb> CREATOR = new C0589db();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f8126a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8127b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8128c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8129d;

    public C0614eb(I6 i6, List list, Map map, boolean z) {
        this.f8127b = list;
        this.f8126a = i6;
        this.f8128c = map == null ? new HashMap() : new HashMap(map);
        this.f8129d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f8126a);
        if (this.f8127b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f8127b));
        }
        HashMap hashMap = this.f8128c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Jm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f8129d);
        parcel.writeBundle(bundle);
    }

    public C0614eb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle != null) {
            this.f8126a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f8127b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f8128c = Jm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f8129d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f8128c = new HashMap();
    }
}
