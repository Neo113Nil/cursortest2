package com.google.android.gms.common.server.response;

import Y4.D;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import p074k3.b;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final b CREATOR = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public zan f11376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final StringToIntConverter f11377B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11383f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Class f11385y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11386z;

    public FastJsonResponse$Field(int i7, int i8, boolean z4, int i9, boolean z7, String str, int i10, String str2, zaa zaaVar) {
        this.f11378a = i7;
        this.f11379b = i8;
        this.f11380c = z4;
        this.f11381d = i9;
        this.f11382e = z7;
        this.f11383f = str;
        this.f11384x = i10;
        if (str2 == null) {
            this.f11385y = null;
            this.f11386z = null;
        } else {
            this.f11385y = SafeParcelResponse.class;
            this.f11386z = str2;
        }
        if (zaaVar == null) {
            this.f11377B = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaaVar.f11372b;
        if (stringToIntConverter == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f11377B = stringToIntConverter;
    }

    public static FastJsonResponse$Field j(int i7, String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i7, null);
    }

    public final String toString() {
        V0 v6 = new V0(this);
        v6.j(Integer.valueOf(this.f11378a), "versionCode");
        v6.j(Integer.valueOf(this.f11379b), "typeIn");
        v6.j(Boolean.valueOf(this.f11380c), "typeInArray");
        v6.j(Integer.valueOf(this.f11381d), "typeOut");
        v6.j(Boolean.valueOf(this.f11382e), "typeOutArray");
        v6.j(this.f11383f, "outputFieldName");
        v6.j(Integer.valueOf(this.f11384x), "safeParcelFieldId");
        String str = this.f11386z;
        if (str == null) {
            str = null;
        }
        v6.j(str, "concreteTypeName");
        Class cls = this.f11385y;
        if (cls != null) {
            v6.j(cls.getCanonicalName(), "concreteType.class");
        }
        StringToIntConverter stringToIntConverter = this.f11377B;
        if (stringToIntConverter != null) {
            v6.j(stringToIntConverter.getClass().getCanonicalName(), "converterName");
        }
        return v6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11378a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11379b);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11380c ? 1 : 0);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11381d);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11382e ? 1 : 0);
        D.s0(parcel, 6, this.f11383f, false);
        D.B0(parcel, 7, 4);
        parcel.writeInt(this.f11384x);
        zaa zaaVar = null;
        String str = this.f11386z;
        if (str == null) {
            str = null;
        }
        D.s0(parcel, 8, str, false);
        StringToIntConverter stringToIntConverter = this.f11377B;
        if (stringToIntConverter != null) {
            if (!(stringToIntConverter instanceof StringToIntConverter)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            zaaVar = new zaa(stringToIntConverter);
        }
        D.r0(parcel, 9, zaaVar, i7, false);
        D.z0(iX0, parcel);
    }

    public FastJsonResponse$Field(int i7, boolean z4, int i8, boolean z7, String str, int i9, Class cls) {
        this.f11378a = 1;
        this.f11379b = i7;
        this.f11380c = z4;
        this.f11381d = i8;
        this.f11382e = z7;
        this.f11383f = str;
        this.f11384x = i9;
        this.f11385y = cls;
        if (cls == null) {
            this.f11386z = null;
        } else {
            this.f11386z = cls.getCanonicalName();
        }
        this.f11377B = null;
    }
}
