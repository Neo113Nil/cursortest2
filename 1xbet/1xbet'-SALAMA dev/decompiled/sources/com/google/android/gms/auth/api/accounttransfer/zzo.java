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

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new a(18);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f10882f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzs f10887e;

    static {
        HashMap map = new HashMap();
        f10882f = map;
        map.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo(HashSet hashSet, int i7, ArrayList arrayList, int i8, zzs zzsVar) {
        this.f10883a = hashSet;
        this.f10884b = i7;
        this.f10885c = arrayList;
        this.f10886d = i8;
        this.f10887e = zzsVar;
    }

    @Override // p074k3.a
    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i7), arrayList.getClass().getCanonicalName()));
        }
        this.f10885c = arrayList;
        this.f10883a.add(Integer.valueOf(i7));
    }

    @Override // p074k3.a
    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, p074k3.a aVar) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), aVar.getClass().getCanonicalName()));
        }
        this.f10887e = (zzs) aVar;
        this.f10883a.add(Integer.valueOf(i7));
    }

    @Override // p074k3.a
    public final /* synthetic */ Map getFieldMappings() {
        return f10882f;
    }

    @Override // p074k3.a
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

    @Override // p074k3.a
    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10883a.contains(Integer.valueOf(fastJsonResponse$Field.f11384x));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
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
        D.z0(iX0, parcel);
    }
}
