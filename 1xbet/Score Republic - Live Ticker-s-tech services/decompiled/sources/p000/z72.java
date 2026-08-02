package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 extends AbstractC0823w0 {
    public static final Parcelable.Creator<z72> CREATOR = new k82(0);

    /* JADX INFO: renamed from: A */
    public final List f9640A;

    /* JADX INFO: renamed from: B */
    public final String f9641B;

    /* JADX INFO: renamed from: C */
    public final String f9642C;

    /* JADX INFO: renamed from: D */
    public final String f9643D;

    /* JADX INFO: renamed from: E */
    public final boolean f9644E;

    /* JADX INFO: renamed from: F */
    public final long f9645F;

    /* JADX INFO: renamed from: G */
    public final int f9646G;

    /* JADX INFO: renamed from: H */
    public final String f9647H;

    /* JADX INFO: renamed from: I */
    public final int f9648I;

    /* JADX INFO: renamed from: J */
    public final long f9649J;

    /* JADX INFO: renamed from: K */
    public final String f9650K;

    /* JADX INFO: renamed from: L */
    public final String f9651L;

    /* JADX INFO: renamed from: M */
    public final long f9652M;

    /* JADX INFO: renamed from: N */
    public final int f9653N;

    /* JADX INFO: renamed from: O */
    public final long f9654O;

    /* JADX INFO: renamed from: j */
    public final String f9655j;

    /* JADX INFO: renamed from: k */
    public final String f9656k;

    /* JADX INFO: renamed from: l */
    public final String f9657l;

    /* JADX INFO: renamed from: m */
    public final String f9658m;

    /* JADX INFO: renamed from: n */
    public final long f9659n;

    /* JADX INFO: renamed from: o */
    public final long f9660o;

    /* JADX INFO: renamed from: p */
    public final String f9661p;

    /* JADX INFO: renamed from: q */
    public final boolean f9662q;

    /* JADX INFO: renamed from: r */
    public final boolean f9663r;

    /* JADX INFO: renamed from: s */
    public final long f9664s;

    /* JADX INFO: renamed from: t */
    public final String f9665t;

    /* JADX INFO: renamed from: u */
    public final long f9666u;

    /* JADX INFO: renamed from: v */
    public final int f9667v;

    /* JADX INFO: renamed from: w */
    public final boolean f9668w;

    /* JADX INFO: renamed from: x */
    public final boolean f9669x;

    /* JADX INFO: renamed from: y */
    public final Boolean f9670y;

    /* JADX INFO: renamed from: z */
    public final long f9671z;

    public z72(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        p80.m3860e(str);
        this.f9655j = str;
        this.f9656k = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f9657l = str3;
        this.f9664s = j;
        this.f9658m = str4;
        this.f9659n = j2;
        this.f9660o = j3;
        this.f9661p = str5;
        this.f9662q = z;
        this.f9663r = z2;
        this.f9665t = str6;
        this.f9666u = j4;
        this.f9667v = i;
        this.f9668w = z3;
        this.f9669x = z4;
        this.f9670y = bool;
        this.f9671z = j5;
        this.f9640A = list;
        this.f9641B = str7;
        this.f9642C = str8;
        this.f9643D = str9;
        this.f9644E = z5;
        this.f9645F = j6;
        this.f9646G = i2;
        this.f9647H = str10;
        this.f9648I = i3;
        this.f9649J = j7;
        this.f9650K = str11;
        this.f9651L = str12;
        this.f9652M = j8;
        this.f9653N = i4;
        this.f9654O = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f9655j);
        t22.m4658l(parcel, 3, this.f9656k);
        t22.m4658l(parcel, 4, this.f9657l);
        t22.m4658l(parcel, 5, this.f9658m);
        t22.m4662p(parcel, 6, 8);
        parcel.writeLong(this.f9659n);
        t22.m4662p(parcel, 7, 8);
        parcel.writeLong(this.f9660o);
        t22.m4658l(parcel, 8, this.f9661p);
        t22.m4662p(parcel, 9, 4);
        parcel.writeInt(this.f9662q ? 1 : 0);
        t22.m4662p(parcel, 10, 4);
        parcel.writeInt(this.f9663r ? 1 : 0);
        t22.m4662p(parcel, 11, 8);
        parcel.writeLong(this.f9664s);
        t22.m4658l(parcel, 12, this.f9665t);
        t22.m4662p(parcel, 14, 8);
        parcel.writeLong(this.f9666u);
        t22.m4662p(parcel, 15, 4);
        parcel.writeInt(this.f9667v);
        t22.m4662p(parcel, 16, 4);
        parcel.writeInt(this.f9668w ? 1 : 0);
        t22.m4662p(parcel, 18, 4);
        parcel.writeInt(this.f9669x ? 1 : 0);
        Boolean bool = this.f9670y;
        if (bool != null) {
            t22.m4662p(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        t22.m4662p(parcel, 22, 8);
        parcel.writeLong(this.f9671z);
        List<String> list = this.f9640A;
        if (list != null) {
            int iM4663q2 = t22.m4663q(parcel, 23);
            parcel.writeStringList(list);
            t22.m4665s(parcel, iM4663q2);
        }
        t22.m4658l(parcel, 25, this.f9641B);
        t22.m4658l(parcel, 26, this.f9642C);
        t22.m4658l(parcel, 27, this.f9643D);
        t22.m4662p(parcel, 28, 4);
        parcel.writeInt(this.f9644E ? 1 : 0);
        t22.m4662p(parcel, 29, 8);
        parcel.writeLong(this.f9645F);
        t22.m4662p(parcel, 30, 4);
        parcel.writeInt(this.f9646G);
        t22.m4658l(parcel, 31, this.f9647H);
        t22.m4662p(parcel, 32, 4);
        parcel.writeInt(this.f9648I);
        t22.m4662p(parcel, 34, 8);
        parcel.writeLong(this.f9649J);
        t22.m4658l(parcel, 35, this.f9650K);
        t22.m4658l(parcel, 36, this.f9651L);
        t22.m4662p(parcel, 37, 8);
        parcel.writeLong(this.f9652M);
        t22.m4662p(parcel, 38, 4);
        parcel.writeInt(this.f9653N);
        t22.m4662p(parcel, 39, 8);
        parcel.writeLong(this.f9654O);
        t22.m4665s(parcel, iM4663q);
    }

    public z72(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.f9655j = str;
        this.f9656k = str2;
        this.f9657l = str3;
        this.f9664s = j3;
        this.f9658m = str4;
        this.f9659n = j;
        this.f9660o = j2;
        this.f9661p = str5;
        this.f9662q = z;
        this.f9663r = z2;
        this.f9665t = str6;
        this.f9666u = j4;
        this.f9667v = i;
        this.f9668w = z3;
        this.f9669x = z4;
        this.f9670y = bool;
        this.f9671z = j5;
        this.f9640A = arrayList;
        this.f9641B = str7;
        this.f9642C = str8;
        this.f9643D = str9;
        this.f9644E = z5;
        this.f9645F = j6;
        this.f9646G = i2;
        this.f9647H = str10;
        this.f9648I = i3;
        this.f9649J = j7;
        this.f9650K = str11;
        this.f9651L = str12;
        this.f9652M = j8;
        this.f9653N = i4;
        this.f9654O = j9;
    }
}
