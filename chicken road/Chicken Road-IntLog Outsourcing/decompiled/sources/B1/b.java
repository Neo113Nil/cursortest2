package B1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class b extends AbstractC1380a implements m1.l {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Status f212a;

    public b(Status status) {
        this.f212a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.N(parcel, 1, this.f212a, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
