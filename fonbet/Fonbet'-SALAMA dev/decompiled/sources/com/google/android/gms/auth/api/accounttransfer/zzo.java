package com.google.android.gms.auth.api.accounttransfer;

import V2.a;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import k3.AbstractC1336a;

/* loaded from: classes.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new a(18);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10882f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f10883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10884b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10885c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10886d;

    /* renamed from: e, reason: collision with root package name */
    public zzs f10887e;

    static {
        HashMap hashMap = new HashMap();
        f10882f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo(HashSet hashSet, int i7, ArrayList arrayList, int i8, zzs zzsVar) {
        this.f10883a = hashSet;
        this.f10884b = i7;
        this.f10885c = arrayList;
        this.f10886d = i8;
        this.f10887e = zzsVar;
    }

    @Override // k3.AbstractC1336a
    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i7), arrayList.getClass().getCanonicalName()));
        }
        this.f10885c = arrayList;
        this.f10883a.add(Integer.valueOf(i7));
    }

    @Override // k3.AbstractC1336a
    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, AbstractC1336a abstractC1336a) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), abstractC1336a.getClass().getCanonicalName()));
        }
        this.f10887e = (zzs) abstractC1336a;
        this.f10883a.add(Integer.valueOf(i7));
    }

    @Override // k3.AbstractC1336a
    public final /* synthetic */ Map getFieldMappings() {
        return f10882f;
    }

    @Override // k3.AbstractC1336a
    public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 == 1) {
            return Integer.valueOf(this.f10884b);
        }
        if (i7 == 2) {
            return this.f10885c;
        }
        if (i7 == 4) {
            return this.f10887e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f11384x);
    }

    @Override // k3.AbstractC1336a
    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10883a.contains(Integer.valueOf(fastJsonResponse$Field.f11384x));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        HashSet hashSet = this.f10883a;
        if (hashSet.contains(1)) {
            D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10884b);
        }
        if (hashSet.contains(2)) {
            D.w0(parcel, 2, this.f10885c, true);
        }
        if (hashSet.contains(3)) {
            D.B0(parcel, 3, 4);
            parcel.writeInt(this.f10886d);
        }
        if (hashSet.contains(4)) {
            D.r0(parcel, 4, this.f10887e, i7, true);
        }
        D.z0(x02, parcel);
    }
}
