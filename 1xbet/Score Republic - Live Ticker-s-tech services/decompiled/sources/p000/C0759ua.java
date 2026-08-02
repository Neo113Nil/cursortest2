package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: ua */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0759ua implements Parcelable {
    public static final Parcelable.Creator<C0759ua> CREATOR = new C0936z2(2);

    /* JADX INFO: renamed from: j */
    public final int[] f7720j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f7721k;

    /* JADX INFO: renamed from: l */
    public final int[] f7722l;

    /* JADX INFO: renamed from: m */
    public final int[] f7723m;

    /* JADX INFO: renamed from: n */
    public final int f7724n;

    /* JADX INFO: renamed from: o */
    public final String f7725o;

    /* JADX INFO: renamed from: p */
    public final int f7726p;

    /* JADX INFO: renamed from: q */
    public final int f7727q;

    /* JADX INFO: renamed from: r */
    public final CharSequence f7728r;

    /* JADX INFO: renamed from: s */
    public final int f7729s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f7730t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f7731u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f7732v;

    /* JADX INFO: renamed from: w */
    public final boolean f7733w;

    public C0759ua(C0722ta c0722ta) {
        int size = c0722ta.f7374a.size();
        this.f7720j = new int[size * 6];
        if (!c0722ta.f7380g) {
            C0270h1.m2191g("Not on back stack");
            throw null;
        }
        this.f7721k = new ArrayList(size);
        this.f7722l = new int[size];
        this.f7723m = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b60 b60Var = (b60) c0722ta.f7374a.get(i2);
            int i3 = i + 1;
            this.f7720j[i] = b60Var.f733a;
            ArrayList arrayList = this.f7721k;
            c50 c50Var = b60Var.f734b;
            arrayList.add(c50Var != null ? c50Var.f1131n : null);
            int[] iArr = this.f7720j;
            iArr[i3] = b60Var.f735c ? 1 : 0;
            iArr[i + 2] = b60Var.f736d;
            iArr[i + 3] = b60Var.f737e;
            int i4 = i + 5;
            iArr[i + 4] = b60Var.f738f;
            i += 6;
            iArr[i4] = b60Var.f739g;
            this.f7722l[i2] = b60Var.f740h.ordinal();
            this.f7723m[i2] = b60Var.f741i.ordinal();
        }
        this.f7724n = c0722ta.f7379f;
        this.f7725o = c0722ta.f7381h;
        this.f7726p = c0722ta.f7392s;
        this.f7727q = c0722ta.f7382i;
        this.f7728r = c0722ta.f7383j;
        this.f7729s = c0722ta.f7384k;
        this.f7730t = c0722ta.f7385l;
        this.f7731u = c0722ta.f7386m;
        this.f7732v = c0722ta.f7387n;
        this.f7733w = c0722ta.f7388o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7720j);
        parcel.writeStringList(this.f7721k);
        parcel.writeIntArray(this.f7722l);
        parcel.writeIntArray(this.f7723m);
        parcel.writeInt(this.f7724n);
        parcel.writeString(this.f7725o);
        parcel.writeInt(this.f7726p);
        parcel.writeInt(this.f7727q);
        TextUtils.writeToParcel(this.f7728r, parcel, 0);
        parcel.writeInt(this.f7729s);
        TextUtils.writeToParcel(this.f7730t, parcel, 0);
        parcel.writeStringList(this.f7731u);
        parcel.writeStringList(this.f7732v);
        parcel.writeInt(this.f7733w ? 1 : 0);
    }

    public C0759ua(Parcel parcel) {
        this.f7720j = parcel.createIntArray();
        this.f7721k = parcel.createStringArrayList();
        this.f7722l = parcel.createIntArray();
        this.f7723m = parcel.createIntArray();
        this.f7724n = parcel.readInt();
        this.f7725o = parcel.readString();
        this.f7726p = parcel.readInt();
        this.f7727q = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7728r = (CharSequence) creator.createFromParcel(parcel);
        this.f7729s = parcel.readInt();
        this.f7730t = (CharSequence) creator.createFromParcel(parcel);
        this.f7731u = parcel.createStringArrayList();
        this.f7732v = parcel.createStringArrayList();
        this.f7733w = parcel.readInt() != 0;
    }
}
