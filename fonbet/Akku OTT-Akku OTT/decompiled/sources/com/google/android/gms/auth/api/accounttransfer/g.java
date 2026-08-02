package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();
    public static final HashMap i;
    public final HashSet a;
    public final int b;
    public i c;
    public String d;
    public String e;
    public final String f;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("authenticatorInfo", new a.C0113a(11, false, 11, false, "authenticatorInfo", 2, i.class));
        hashMap.put("signature", new a.C0113a(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new a.C0113a(7, false, 7, false, "package", 4, null));
    }

    public g() {
        this.a = new HashSet(3);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0113a c0113a, String str, com.google.android.gms.common.server.response.a aVar) {
        int i2 = c0113a.i;
        if (i2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i2), aVar.getClass().getCanonicalName()));
        }
        this.c = (i) aVar;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return i;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0113a c0113a) {
        int i2 = c0113a.i;
        if (i2 == 1) {
            return Integer.valueOf(this.b);
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 == 4) {
            return this.e;
        }
        throw new IllegalStateException(android.support.v4.media.a.a(c0113a.i, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0113a c0113a) {
        return this.a.contains(Integer.valueOf(c0113a.i));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringInternal(a.C0113a c0113a, String str, String str2) {
        int i2 = c0113a.i;
        if (i2 == 3) {
            this.d = str2;
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.c, i2, true);
        }
        if (hashSet.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.f, true);
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public g(HashSet hashSet, int i2, i iVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i2;
        this.c = iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }
}
