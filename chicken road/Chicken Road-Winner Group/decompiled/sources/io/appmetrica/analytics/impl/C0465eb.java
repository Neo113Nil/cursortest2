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
public final class C0465eb implements Parcelable {
    public static final Parcelable.Creator<C0465eb> CREATOR = new C0440db();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f7232a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7233b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7234c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7235d;

    public C0465eb(I6 i6, List list, Map map, boolean z3) {
        this.f7233b = list;
        this.f7232a = i6;
        this.f7234c = map == null ? new HashMap() : new HashMap(map);
        this.f7235d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f7232a);
        if (this.f7233b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f7233b));
        }
        HashMap hashMap = this.f7234c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Jm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f7235d);
        parcel.writeBundle(bundle);
    }

    public C0465eb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(I6.class.getClassLoader());
        if (readBundle != null) {
            this.f7232a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f7233b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f7234c = Jm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f7235d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f7234c = new HashMap();
    }
}
