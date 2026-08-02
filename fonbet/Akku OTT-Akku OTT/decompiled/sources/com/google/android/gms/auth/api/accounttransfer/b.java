package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public static final HashMap f;
    public final HashSet a;
    public final int b;
    public ArrayList c;
    public final int d;
    public e e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new a.C0113a(11, true, 11, true, "authenticatorData", 2, g.class));
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, new a.C0113a(11, false, 11, false, NotificationCompat.CATEGORY_PROGRESS, 4, e.class));
    }

    public b() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeArrayInternal(a.C0113a c0113a, String str, ArrayList arrayList) {
        int i = c0113a.i;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0113a c0113a, String str, com.google.android.gms.common.server.response.a aVar) {
        int i = c0113a.i;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), aVar.getClass().getCanonicalName()));
        }
        this.e = (e) aVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0113a c0113a) {
        int i = c0113a.i;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(android.support.v4.media.a.a(c0113a.i, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0113a c0113a) {
        return this.a.contains(Integer.valueOf(c0113a.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.p(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.e, i, true);
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public b(HashSet hashSet, int i, ArrayList arrayList, int i2, e eVar) {
        this.a = hashSet;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = eVar;
    }
}
