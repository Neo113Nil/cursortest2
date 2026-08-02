package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 implements Parcelable {
    public static final Parcelable.Creator<y50> CREATOR = new C0936z2(6);

    /* JADX INFO: renamed from: j */
    public final String f9160j;

    /* JADX INFO: renamed from: k */
    public final String f9161k;

    /* JADX INFO: renamed from: l */
    public final boolean f9162l;

    /* JADX INFO: renamed from: m */
    public final boolean f9163m;

    /* JADX INFO: renamed from: n */
    public final int f9164n;

    /* JADX INFO: renamed from: o */
    public final int f9165o;

    /* JADX INFO: renamed from: p */
    public final String f9166p;

    /* JADX INFO: renamed from: q */
    public final boolean f9167q;

    /* JADX INFO: renamed from: r */
    public final boolean f9168r;

    /* JADX INFO: renamed from: s */
    public final boolean f9169s;

    /* JADX INFO: renamed from: t */
    public final boolean f9170t;

    /* JADX INFO: renamed from: u */
    public final int f9171u;

    /* JADX INFO: renamed from: v */
    public final String f9172v;

    /* JADX INFO: renamed from: w */
    public final int f9173w;

    /* JADX INFO: renamed from: x */
    public final boolean f9174x;

    public y50(Parcel parcel) {
        this.f9160j = parcel.readString();
        this.f9161k = parcel.readString();
        this.f9162l = parcel.readInt() != 0;
        this.f9163m = parcel.readInt() != 0;
        this.f9164n = parcel.readInt();
        this.f9165o = parcel.readInt();
        this.f9166p = parcel.readString();
        this.f9167q = parcel.readInt() != 0;
        this.f9168r = parcel.readInt() != 0;
        this.f9169s = parcel.readInt() != 0;
        this.f9170t = parcel.readInt() != 0;
        this.f9171u = parcel.readInt();
        this.f9172v = parcel.readString();
        this.f9173w = parcel.readInt();
        this.f9174x = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9160j);
        sb.append(" (");
        sb.append(this.f9161k);
        sb.append(")}:");
        if (this.f9162l) {
            sb.append(" fromLayout");
        }
        if (this.f9163m) {
            sb.append(" dynamicContainer");
        }
        int i = this.f9165o;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f9166p;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f9167q) {
            sb.append(" retainInstance");
        }
        if (this.f9168r) {
            sb.append(" removing");
        }
        if (this.f9169s) {
            sb.append(" detached");
        }
        if (this.f9170t) {
            sb.append(" hidden");
        }
        String str2 = this.f9172v;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f9173w);
        }
        if (this.f9174x) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9160j);
        parcel.writeString(this.f9161k);
        parcel.writeInt(this.f9162l ? 1 : 0);
        parcel.writeInt(this.f9163m ? 1 : 0);
        parcel.writeInt(this.f9164n);
        parcel.writeInt(this.f9165o);
        parcel.writeString(this.f9166p);
        parcel.writeInt(this.f9167q ? 1 : 0);
        parcel.writeInt(this.f9168r ? 1 : 0);
        parcel.writeInt(this.f9169s ? 1 : 0);
        parcel.writeInt(this.f9170t ? 1 : 0);
        parcel.writeInt(this.f9171u);
        parcel.writeString(this.f9172v);
        parcel.writeInt(this.f9173w);
        parcel.writeInt(this.f9174x ? 1 : 0);
    }

    public y50(c50 c50Var) {
        this.f9160j = c50Var.getClass().getName();
        this.f9161k = c50Var.f1131n;
        this.f9162l = c50Var.f1140w;
        this.f9163m = c50Var.f1142y;
        this.f9164n = c50Var.f1103G;
        this.f9165o = c50Var.f1104H;
        this.f9166p = c50Var.f1105I;
        this.f9167q = c50Var.f1108L;
        this.f9168r = c50Var.f1138u;
        this.f9169s = c50Var.f1107K;
        this.f9170t = c50Var.f1106J;
        this.f9171u = c50Var.f1119W.ordinal();
        this.f9172v = c50Var.f1134q;
        this.f9173w = c50Var.f1135r;
        this.f9174x = c50Var.f1114R;
    }
}
