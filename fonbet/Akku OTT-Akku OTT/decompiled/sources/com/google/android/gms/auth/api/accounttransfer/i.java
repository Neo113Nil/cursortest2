package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import androidx.compose.runtime.u;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();
    public static final HashMap j;
    public final Set a;
    public final int b;
    public String c;
    public int d;
    public byte[] e;
    public final PendingIntent f;
    public final a i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("accountType", new a.C0113a(7, false, 7, false, "accountType", 2, null));
        hashMap.put(NotificationCompat.CATEGORY_STATUS, new a.C0113a(0, false, 0, false, NotificationCompat.CATEGORY_STATUS, 3, null));
        hashMap.put("transferBytes", new a.C0113a(8, false, 8, false, "transferBytes", 4, null));
    }

    public i() {
        this.a = new ArraySet(3);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return j;
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
        if (i == 3) {
            return Integer.valueOf(this.d);
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

    @Override // com.google.android.gms.common.server.response.a
    public final void setDecodedBytesInternal(a.C0113a c0113a, String str, byte[] bArr) {
        int i = c0113a.i;
        if (i != 4) {
            throw new IllegalArgumentException(u.a(i, "Field with id=", " is not known to be a byte array."));
        }
        this.e = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setIntegerInternal(a.C0113a c0113a, String str, int i) {
        int i2 = c0113a.i;
        if (i2 != 3) {
            throw new IllegalArgumentException(u.a(i2, "Field with id=", " is not known to be an int."));
        }
        this.d = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringInternal(a.C0113a c0113a, String str, String str2) {
        int i = c0113a.i;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.c = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        Set set = this.a;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            int i2 = this.d;
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
            parcel.writeInt(i2);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.i, i, true);
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public i(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.i = aVar;
    }
}
