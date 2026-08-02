package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b72 extends AbstractC0823w0 {
    public static final Parcelable.Creator<b72> CREATOR = new jm1(28);

    /* JADX INFO: renamed from: j */
    public final int f748j;

    /* JADX INFO: renamed from: k */
    public final String f749k;

    /* JADX INFO: renamed from: l */
    public final long f750l;

    /* JADX INFO: renamed from: m */
    public final Long f751m;

    /* JADX INFO: renamed from: n */
    public final String f752n;

    /* JADX INFO: renamed from: o */
    public final String f753o;

    /* JADX INFO: renamed from: p */
    public final Double f754p;

    public b72(long j, Object obj, String str, String str2) {
        p80.m3860e(str);
        this.f748j = 2;
        this.f749k = str;
        this.f750l = j;
        this.f753o = str2;
        if (obj == null) {
            this.f751m = null;
            this.f754p = null;
            this.f752n = null;
            return;
        }
        if (obj instanceof Long) {
            this.f751m = (Long) obj;
            this.f754p = null;
            this.f752n = null;
        } else if (obj instanceof String) {
            this.f751m = null;
            this.f754p = null;
            this.f752n = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                C0270h1.m2190f("User attribute given of un-supported type");
                throw null;
            }
            this.f751m = null;
            this.f754p = (Double) obj;
            this.f752n = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m600b() {
        Long l = this.f751m;
        if (l != null) {
            return l;
        }
        Double d = this.f754p;
        if (d != null) {
            return d;
        }
        String str = this.f752n;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jm1.m2937c(this, parcel);
    }

    public b72(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f748j = i;
        this.f749k = str;
        this.f750l = j;
        this.f751m = l;
        this.f754p = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f752n = str2;
        this.f753o = str3;
    }

    public b72(d72 d72Var) {
        this(d72Var.f1574d, d72Var.f1575e, d72Var.f1573c, d72Var.f1572b);
    }
}
