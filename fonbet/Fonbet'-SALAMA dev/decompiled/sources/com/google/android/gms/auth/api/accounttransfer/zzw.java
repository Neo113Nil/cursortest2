package com.google.android.gms.auth.api.accounttransfer;

import V2.a;
import W5.AbstractC0486a1;
import Y4.D;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new a(21);

    /* renamed from: y, reason: collision with root package name */
    public static final HashMap f10902y;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f10903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10904b;

    /* renamed from: c, reason: collision with root package name */
    public String f10905c;

    /* renamed from: d, reason: collision with root package name */
    public int f10906d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f10907e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f10908f;

    /* renamed from: x, reason: collision with root package name */
    public final DeviceMetaData f10909x;

    static {
        HashMap hashMap = new HashMap();
        f10902y = hashMap;
        hashMap.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i7, String str, int i8, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f10903a = hashSet;
        this.f10904b = i7;
        this.f10905c = str;
        this.f10906d = i8;
        this.f10907e = bArr;
        this.f10908f = pendingIntent;
        this.f10909x = deviceMetaData;
    }

    @Override // k3.AbstractC1336a
    public final /* synthetic */ Map getFieldMappings() {
        return f10902y;
    }

    @Override // k3.AbstractC1336a
    public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 == 1) {
            return Integer.valueOf(this.f10904b);
        }
        if (i7 == 2) {
            return this.f10905c;
        }
        if (i7 == 3) {
            return Integer.valueOf(this.f10906d);
        }
        if (i7 == 4) {
            return this.f10907e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f11384x);
    }

    @Override // k3.AbstractC1336a
    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10903a.contains(Integer.valueOf(fastJsonResponse$Field.f11384x));
    }

    @Override // k3.AbstractC1336a
    public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 4) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Field with id=", " is not known to be an byte array."));
        }
        this.f10907e = bArr;
        this.f10903a.add(Integer.valueOf(i7));
    }

    @Override // k3.AbstractC1336a
    public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, int i7) {
        int i8 = fastJsonResponse$Field.f11384x;
        if (i8 != 3) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i8, "Field with id=", " is not known to be an int."));
        }
        this.f10906d = i7;
        this.f10903a.add(Integer.valueOf(i8));
    }

    @Override // k3.AbstractC1336a
    public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
        }
        this.f10905c = str2;
        this.f10903a.add(Integer.valueOf(i7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        HashSet hashSet = this.f10903a;
        if (hashSet.contains(1)) {
            D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10904b);
        }
        if (hashSet.contains(2)) {
            D.s0(parcel, 2, this.f10905c, true);
        }
        if (hashSet.contains(3)) {
            int i8 = this.f10906d;
            D.B0(parcel, 3, 4);
            parcel.writeInt(i8);
        }
        if (hashSet.contains(4)) {
            D.l0(parcel, 4, this.f10907e, true);
        }
        if (hashSet.contains(5)) {
            D.r0(parcel, 5, this.f10908f, i7, true);
        }
        if (hashSet.contains(6)) {
            D.r0(parcel, 6, this.f10909x, i7, true);
        }
        D.z0(x02, parcel);
    }
}
