package Q2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class a1 extends AbstractC2187a {
    public static final Parcelable.Creator<a1> CREATOR = new C0354d0(9);

    /* renamed from: k, reason: collision with root package name */
    public final String f4974k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4975l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4976m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4977n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4978o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4979p;

    /* renamed from: q, reason: collision with root package name */
    public final a1[] f4980q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4981r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4982s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4983t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4984u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4985v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4986w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4987x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f4988y;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1(Context context, J2.i[] iVarArr) {
        int i;
        int i5;
        String str;
        int i6;
        double d5;
        J2.i iVar = iVarArr[0];
        this.f4977n = false;
        int i7 = iVar.f2714a;
        int i8 = iVar.f2715b;
        boolean z3 = i7 == -3 && i8 == -4;
        this.f4982s = z3;
        this.f4986w = iVar.f2717d;
        boolean z5 = iVar.f2718e;
        this.f4987x = z5;
        boolean z6 = iVar.f2719g;
        this.f4988y = z6;
        if (z3) {
            J2.i iVar2 = J2.i.i;
            this.f4978o = iVar2.f2714a;
            i8 = iVar2.f2715b;
            this.f4975l = i8;
        } else if (z5) {
            this.f4978o = i7;
            i8 = iVar.f;
            this.f4975l = i8;
        } else if (z6) {
            this.f4978o = i7;
            i8 = iVar.f2720h;
            this.f4975l = i8;
        } else {
            this.f4978o = i7;
            this.f4975l = i8;
        }
        boolean z7 = this.f4978o == -1;
        boolean z8 = i8 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z7) {
            U2.e eVar = C0379q.f.f5048a;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i9 = displayMetrics2.heightPixels;
                        int i10 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i11 = displayMetrics2.heightPixels;
                        int i12 = displayMetrics2.widthPixels;
                        if (i11 == i9 && i12 == i10) {
                            int i13 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i6 = i13 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f4979p = i6;
                            d5 = i6 / displayMetrics.density;
                            i = (int) d5;
                            if (d5 - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i6 = displayMetrics.widthPixels;
            this.f4979p = i6;
            d5 = i6 / displayMetrics.density;
            i = (int) d5;
            if (d5 - i >= 0.01d) {
            }
        } else {
            i = this.f4978o;
            U2.e eVar2 = C0379q.f.f5048a;
            this.f4979p = U2.e.i(displayMetrics, i);
        }
        if (z8) {
            int i14 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i5 = i14 <= 400 ? 32 : i14 <= 720 ? 50 : 90;
        } else {
            i5 = this.f4975l;
        }
        U2.e eVar3 = C0379q.f.f5048a;
        this.f4976m = U2.e.i(displayMetrics, i5);
        if (z7 || z8) {
            this.f4974k = i + "x" + i5 + "_as";
        } else {
            if (z5 || z6) {
                str = this.f4978o + "x" + this.f4975l + "_as";
            } else if (z3) {
                str = "320x50_mb";
            } else {
                this.f4974k = iVar.f2716c;
            }
            this.f4974k = str;
        }
        int length = iVarArr.length;
        if (length > 1) {
            this.f4980q = new a1[length];
            for (int i15 = 0; i15 < iVarArr.length; i15++) {
                this.f4980q[i15] = new a1(context, iVarArr[i15]);
            }
        } else {
            this.f4980q = null;
        }
        this.f4981r = false;
        this.f4983t = false;
    }

    public static a1 a() {
        return new a1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static a1 b() {
        return new a1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f4974k);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f4975l);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f4976m);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f4977n ? 1 : 0);
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeInt(this.f4978o);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f4979p);
        AbstractC2036a.i0(parcel, 8, this.f4980q, i);
        AbstractC2036a.n0(parcel, 9, 4);
        parcel.writeInt(this.f4981r ? 1 : 0);
        AbstractC2036a.n0(parcel, 10, 4);
        parcel.writeInt(this.f4982s ? 1 : 0);
        boolean z3 = this.f4983t;
        AbstractC2036a.n0(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        AbstractC2036a.n0(parcel, 12, 4);
        parcel.writeInt(this.f4984u ? 1 : 0);
        AbstractC2036a.n0(parcel, 13, 4);
        parcel.writeInt(this.f4985v ? 1 : 0);
        AbstractC2036a.n0(parcel, 14, 4);
        parcel.writeInt(this.f4986w ? 1 : 0);
        AbstractC2036a.n0(parcel, 15, 4);
        parcel.writeInt(this.f4987x ? 1 : 0);
        AbstractC2036a.n0(parcel, 16, 4);
        parcel.writeInt(this.f4988y ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    public a1(String str, int i, int i5, boolean z3, int i6, int i7, a1[] a1VarArr, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f4974k = str;
        this.f4975l = i;
        this.f4976m = i5;
        this.f4977n = z3;
        this.f4978o = i6;
        this.f4979p = i7;
        this.f4980q = a1VarArr;
        this.f4981r = z5;
        this.f4982s = z6;
        this.f4983t = z7;
        this.f4984u = z8;
        this.f4985v = z9;
        this.f4986w = z10;
        this.f4987x = z11;
        this.f4988y = z12;
    }

    public a1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public a1(Context context, J2.i iVar) {
        this(context, new J2.i[]{iVar});
    }
}
