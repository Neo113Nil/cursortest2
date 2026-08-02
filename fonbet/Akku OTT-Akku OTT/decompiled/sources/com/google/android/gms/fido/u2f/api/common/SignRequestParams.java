package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();
    public final Integer a;

    @Nullable
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final a f;
    public final String i;

    public SignRequestParams(Integer num, @Nullable Double d, Uri uri, byte[] bArr, ArrayList arrayList, a aVar, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = arrayList;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                C0875q.b((eVar.b == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                String str2 = eVar.b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        C0875q.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.i = str;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        Integer num = signRequestParams.a;
        List list = signRequestParams.e;
        if (C0874p.a(this.a, num) && C0874p.a(this.b, signRequestParams.b) && C0874p.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && C0874p.a(this.f, signRequestParams.f) && C0874p.a(this.i, signRequestParams.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.i, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.i(parcel, 2, this.a);
        com.google.android.gms.common.internal.safeparcel.c.d(parcel, 3, this.b);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 6, this.e, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
