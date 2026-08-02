package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends AbstractC0823w0 implements Iterable {
    public static final Parcelable.Creator<eu1> CREATOR = new jm1(7);

    /* JADX INFO: renamed from: j */
    public final Bundle f2185j;

    public eu1(Bundle bundle) {
        this.f2185j = bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1504b(String str) {
        return this.f2185j.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final Double m1505c() {
        return Double.valueOf(this.f2185j.getDouble("value"));
    }

    /* JADX INFO: renamed from: d */
    public final String m1506d() {
        return this.f2185j.getString("currency");
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m1507e() {
        return new Bundle(this.f2185j);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new uf1(this);
    }

    public final String toString() {
        return this.f2185j.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4652f(parcel, 2, m1507e());
        t22.m4665s(parcel, iM4663q);
    }
}
