package com.google.android.gms.ads.internal.client;

import B2.e;
import F2.C0252s;
import J2.d;
import Y4.D;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y2.j;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new e(13);

    /* renamed from: A, reason: collision with root package name */
    public boolean f10765A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10766B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f10767C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f10768D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f10769E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f10770F;

    /* renamed from: a, reason: collision with root package name */
    public final String f10771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10773c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10774d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10775e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10776f;

    /* renamed from: x, reason: collision with root package name */
    public final zzr[] f10777x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10778y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10779z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, j[] jVarArr) {
        int i7;
        int i8;
        String str;
        int i9;
        double d7;
        j jVar = jVarArr[0];
        this.f10774d = false;
        int i10 = jVar.f18164a;
        int i11 = jVar.f18165b;
        boolean z4 = i10 == -3 && i11 == -4;
        this.f10779z = z4;
        this.f10768D = jVar.f18167d;
        boolean z7 = jVar.f18168e;
        this.f10769E = z7;
        boolean z8 = jVar.f18170g;
        this.f10770F = z8;
        if (z4) {
            j jVar2 = j.f18155i;
            this.f10775e = jVar2.f18164a;
            i11 = jVar2.f18165b;
            this.f10772b = i11;
        } else if (z7) {
            this.f10775e = i10;
            i11 = jVar.f18169f;
            this.f10772b = i11;
        } else if (z8) {
            this.f10775e = i10;
            i11 = jVar.f18171h;
            this.f10772b = i11;
        } else {
            this.f10775e = i10;
            this.f10772b = i11;
        }
        boolean z9 = this.f10775e == -1;
        boolean z10 = i11 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z9) {
            d dVar = C0252s.f2717f.f2718a;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i12 = displayMetrics2.heightPixels;
                        int i13 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i14 = displayMetrics2.heightPixels;
                        int i15 = displayMetrics2.widthPixels;
                        if (i14 == i12 && i15 == i13) {
                            int i16 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i9 = i16 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f10776f = i9;
                            d7 = i9 / displayMetrics.density;
                            i7 = (int) d7;
                            if (d7 - i7 >= 0.01d) {
                                i7++;
                            }
                        }
                    }
                }
            }
            i9 = displayMetrics.widthPixels;
            this.f10776f = i9;
            d7 = i9 / displayMetrics.density;
            i7 = (int) d7;
            if (d7 - i7 >= 0.01d) {
            }
        } else {
            i7 = this.f10775e;
            d dVar2 = C0252s.f2717f.f2718a;
            this.f10776f = d.m(displayMetrics, i7);
        }
        if (z10) {
            int i17 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i8 = i17 <= 400 ? 32 : i17 <= 720 ? 50 : 90;
        } else {
            i8 = this.f10772b;
        }
        d dVar3 = C0252s.f2717f.f2718a;
        this.f10773c = d.m(displayMetrics, i8);
        if (z9 || z10) {
            this.f10771a = i7 + "x" + i8 + "_as";
        } else {
            if (z7 || z8) {
                str = this.f10775e + "x" + this.f10772b + "_as";
            } else if (z4) {
                str = "320x50_mb";
            } else {
                this.f10771a = jVar.f18166c;
            }
            this.f10771a = str;
        }
        int length = jVarArr.length;
        if (length > 1) {
            this.f10777x = new zzr[length];
            for (int i18 = 0; i18 < jVarArr.length; i18++) {
                this.f10777x[i18] = new zzr(context, jVarArr[i18]);
            }
        } else {
            this.f10777x = null;
        }
        this.f10778y = false;
        this.f10765A = false;
    }

    public static zzr j() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzr k() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 2, this.f10771a, false);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10772b);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10773c);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10774d ? 1 : 0);
        D.B0(parcel, 6, 4);
        parcel.writeInt(this.f10775e);
        D.B0(parcel, 7, 4);
        parcel.writeInt(this.f10776f);
        D.v0(parcel, 8, this.f10777x, i7);
        D.B0(parcel, 9, 4);
        parcel.writeInt(this.f10778y ? 1 : 0);
        D.B0(parcel, 10, 4);
        parcel.writeInt(this.f10779z ? 1 : 0);
        boolean z4 = this.f10765A;
        D.B0(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        D.B0(parcel, 12, 4);
        parcel.writeInt(this.f10766B ? 1 : 0);
        D.B0(parcel, 13, 4);
        parcel.writeInt(this.f10767C ? 1 : 0);
        D.B0(parcel, 14, 4);
        parcel.writeInt(this.f10768D ? 1 : 0);
        D.B0(parcel, 15, 4);
        parcel.writeInt(this.f10769E ? 1 : 0);
        D.B0(parcel, 16, 4);
        parcel.writeInt(this.f10770F ? 1 : 0);
        D.z0(x02, parcel);
    }

    public zzr(String str, int i7, int i8, boolean z4, int i9, int i10, zzr[] zzrVarArr, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f10771a = str;
        this.f10772b = i7;
        this.f10773c = i8;
        this.f10774d = z4;
        this.f10775e = i9;
        this.f10776f = i10;
        this.f10777x = zzrVarArr;
        this.f10778y = z7;
        this.f10779z = z8;
        this.f10765A = z9;
        this.f10766B = z10;
        this.f10767C = z11;
        this.f10768D = z12;
        this.f10769E = z13;
        this.f10770F = z14;
    }

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzr(Context context, j jVar) {
        this(context, new j[]{jVar});
    }
}
