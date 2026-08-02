package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<xv1> CREATOR = new jm1(11);

    /* JADX INFO: renamed from: j */
    public final int f9090j;

    /* JADX INFO: renamed from: k */
    public final String f9091k;

    /* JADX INFO: renamed from: l */
    public final Intent f9092l;

    public xv1(int i, String str, Intent intent) {
        this.f9090j = i;
        this.f9091k = str;
        this.f9092l = intent;
    }

    /* JADX INFO: renamed from: b */
    public static xv1 m5690b(Activity activity) {
        return new xv1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv1)) {
            return false;
        }
        xv1 xv1Var = (xv1) obj;
        return this.f9090j == xv1Var.f9090j && Objects.equals(this.f9091k, xv1Var.f9091k) && Objects.equals(this.f9092l, xv1Var.f9092l);
    }

    public final int hashCode() {
        return this.f9090j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f9090j);
        t22.m4658l(parcel, 2, this.f9091k);
        t22.m4657k(parcel, 3, this.f9092l, i);
        t22.m4665s(parcel, iM4663q);
    }
}
