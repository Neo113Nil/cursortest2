package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.AbstractC0823w0;
import p000.jm1;
import p000.p80;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC0823w0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new jm1(9);

    /* JADX INFO: renamed from: j */
    public final int f1339j;

    /* JADX INFO: renamed from: k */
    public final String f1340k;

    public Scope(String str, int i) {
        p80.m3861f(str, "scopeUri must not be null or empty");
        this.f1339j = i;
        this.f1340k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1340k.equals(((Scope) obj).f1340k);
    }

    public final int hashCode() {
        return this.f1340k.hashCode();
    }

    public final String toString() {
        return this.f1340k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f1339j);
        t22.m4658l(parcel, 2, this.f1340k);
        t22.m4665s(parcel, iM4663q);
    }
}
