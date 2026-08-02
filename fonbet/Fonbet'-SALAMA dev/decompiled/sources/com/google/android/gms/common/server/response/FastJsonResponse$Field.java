package com.google.android.gms.common.server.response;

import Y4.D;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import k3.C1337b;
import w1.V0;

@VisibleForTesting
/* loaded from: classes.dex */
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final C1337b CREATOR = new C1337b();

    /* renamed from: A, reason: collision with root package name */
    public zan f11376A;

    /* renamed from: B, reason: collision with root package name */
    public final StringToIntConverter f11377B;

    /* renamed from: a, reason: collision with root package name */
    public final int f11378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11379b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11380c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11381d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11382e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11383f;

    /* renamed from: x, reason: collision with root package name */
    public final int f11384x;

    /* renamed from: y, reason: collision with root package name */
    public final Class f11385y;

    /* renamed from: z, reason: collision with root package name */
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
        V0 v02 = new V0(this);
        v02.j(Integer.valueOf(this.f11378a), "versionCode");
        v02.j(Integer.valueOf(this.f11379b), "typeIn");
        v02.j(Boolean.valueOf(this.f11380c), "typeInArray");
        v02.j(Integer.valueOf(this.f11381d), "typeOut");
        v02.j(Boolean.valueOf(this.f11382e), "typeOutArray");
        v02.j(this.f11383f, "outputFieldName");
        v02.j(Integer.valueOf(this.f11384x), "safeParcelFieldId");
        String str = this.f11386z;
        if (str == null) {
            str = null;
        }
        v02.j(str, "concreteTypeName");
        Class cls = this.f11385y;
        if (cls != null) {
            v02.j(cls.getCanonicalName(), "concreteType.class");
        }
        StringToIntConverter stringToIntConverter = this.f11377B;
        if (stringToIntConverter != null) {
            v02.j(stringToIntConverter.getClass().getCanonicalName(), "converterName");
        }
        return v02.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
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
        D.z0(x02, parcel);
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
