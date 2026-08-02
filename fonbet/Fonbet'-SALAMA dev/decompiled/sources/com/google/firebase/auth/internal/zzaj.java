package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zze;
import f4.C1092d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzaj extends MultiFactorResolver {
    public static final Parcelable.Creator<zzaj> CREATOR = new C1092d(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11919a;

    /* renamed from: b, reason: collision with root package name */
    public final zzao f11920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11921c;

    /* renamed from: d, reason: collision with root package name */
    public final zze f11922d;

    /* renamed from: e, reason: collision with root package name */
    public final zzad f11923e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11924f;

    public zzaj(ArrayList arrayList, zzao zzaoVar, String str, zze zzeVar, zzad zzadVar, ArrayList arrayList2) {
        D.i(arrayList);
        this.f11919a = arrayList;
        D.i(zzaoVar);
        this.f11920b = zzaoVar;
        D.e(str);
        this.f11921c = str;
        this.f11922d = zzeVar;
        this.f11923e = zzadVar;
        D.i(arrayList2);
        this.f11924f = arrayList2;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11919a.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        Iterator it2 = this.f11924f.iterator();
        while (it2.hasNext()) {
            arrayList.add((TotpMultiFactorInfo) it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.w0(parcel, 1, this.f11919a, false);
        Y4.D.r0(parcel, 2, this.f11920b, i7, false);
        Y4.D.s0(parcel, 3, this.f11921c, false);
        Y4.D.r0(parcel, 4, this.f11922d, i7, false);
        Y4.D.r0(parcel, 5, this.f11923e, i7, false);
        Y4.D.w0(parcel, 6, this.f11924f, false);
        Y4.D.z0(x02, parcel);
    }
}
