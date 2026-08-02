package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();
    public static final ArrayMap i;
    public final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        ArrayMap arrayMap = new ArrayMap();
        i = arrayMap;
        arrayMap.put("registered", a.C0113a.l(2, "registered"));
        arrayMap.put("in_progress", a.C0113a.l(3, "in_progress"));
        arrayMap.put(FirebaseAnalytics.Param.SUCCESS, a.C0113a.l(4, FirebaseAnalytics.Param.SUCCESS));
        arrayMap.put("failed", a.C0113a.l(5, "failed"));
        arrayMap.put("escrowed", a.C0113a.l(6, "escrowed"));
    }

    public e() {
        this.a = 1;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map getFieldMappings() {
        return i;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Object getFieldValue(a.C0113a c0113a) {
        switch (c0113a.i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException(android.support.v4.media.a.a(c0113a.i, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    public final boolean isFieldSet(a.C0113a c0113a) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringsInternal(a.C0113a c0113a, String str, ArrayList arrayList) {
        int i2 = c0113a.i;
        if (i2 == 2) {
            this.b = arrayList;
            return;
        }
        if (i2 == 3) {
            this.c = arrayList;
            return;
        }
        if (i2 == 4) {
            this.d = arrayList;
        } else if (i2 == 5) {
            this.e = arrayList;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i2)));
            }
            this.f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 4, this.d);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 6, this.f);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public e(int i2, @Nullable ArrayList arrayList, @Nullable ArrayList arrayList2, @Nullable ArrayList arrayList3, @Nullable ArrayList arrayList4, @Nullable ArrayList arrayList5) {
        this.a = i2;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }
}
