package B1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import o1.u;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class j extends AbstractC1380a {

    /* renamed from: a, reason: collision with root package name */
    public final LocationRequest f221a;

    /* renamed from: b, reason: collision with root package name */
    public final List f222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f223c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f224d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f225e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f226f;

    /* renamed from: g, reason: collision with root package name */
    public final String f227g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f228h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f229i;

    /* renamed from: j, reason: collision with root package name */
    public final String f230j;

    /* renamed from: k, reason: collision with root package name */
    public final long f231k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f220l = Collections.emptyList();
    public static final Parcelable.Creator<j> CREATOR = new c(1);

    public j(LocationRequest locationRequest, List list, String str, boolean z, boolean z5, boolean z6, String str2, boolean z7, boolean z8, String str3, long j2) {
        this.f221a = locationRequest;
        this.f222b = list;
        this.f223c = str;
        this.f224d = z;
        this.f225e = z5;
        this.f226f = z6;
        this.f227g = str2;
        this.f228h = z7;
        this.f229i = z8;
        this.f230j = str3;
        this.f231k = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (u.j(this.f221a, jVar.f221a) && u.j(this.f222b, jVar.f222b) && u.j(this.f223c, jVar.f223c) && this.f224d == jVar.f224d && this.f225e == jVar.f225e && this.f226f == jVar.f226f && u.j(this.f227g, jVar.f227g) && this.f228h == jVar.f228h && this.f229i == jVar.f229i && u.j(this.f230j, jVar.f230j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f221a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f221a);
        String str = this.f223c;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        String str2 = this.f227g;
        if (str2 != null) {
            sb.append(" moduleId=");
            sb.append(str2);
        }
        String str3 = this.f230j;
        if (str3 != null) {
            sb.append(" contextAttributionTag=");
            sb.append(str3);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f224d);
        sb.append(" clients=");
        sb.append(this.f222b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f225e);
        if (this.f226f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f228h) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f229i) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.N(parcel, 1, this.f221a, i2);
        AbstractC0169a.Q(parcel, 5, this.f222b);
        AbstractC0169a.O(parcel, 6, this.f223c);
        AbstractC0169a.T(parcel, 7, 4);
        parcel.writeInt(this.f224d ? 1 : 0);
        AbstractC0169a.T(parcel, 8, 4);
        parcel.writeInt(this.f225e ? 1 : 0);
        AbstractC0169a.T(parcel, 9, 4);
        parcel.writeInt(this.f226f ? 1 : 0);
        AbstractC0169a.O(parcel, 10, this.f227g);
        AbstractC0169a.T(parcel, 11, 4);
        parcel.writeInt(this.f228h ? 1 : 0);
        AbstractC0169a.T(parcel, 12, 4);
        parcel.writeInt(this.f229i ? 1 : 0);
        AbstractC0169a.O(parcel, 13, this.f230j);
        AbstractC0169a.T(parcel, 14, 8);
        parcel.writeLong(this.f231k);
        AbstractC0169a.S(parcel, R5);
    }
}
