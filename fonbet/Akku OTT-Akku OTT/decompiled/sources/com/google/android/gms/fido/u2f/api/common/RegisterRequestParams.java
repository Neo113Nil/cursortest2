package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new k();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final a f;
    public final String i;

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, a aVar, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        C0875q.b((arrayList == null || arrayList.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.d = arrayList;
        this.e = arrayList2;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            C0875q.b((uri == null && dVar.d == null) ? false : true, "register request has null appId and no request appId is provided");
            String str2 = dVar.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            C0875q.b((uri == null && eVar.b == null) ? false : true, "registered key has null appId and no request appId is provided");
            String str3 = eVar.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        C0875q.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.i = str;
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        Integer num = registerRequestParams.a;
        List list2 = registerRequestParams.e;
        return C0874p.a(this.a, num) && C0874p.a(this.b, registerRequestParams.b) && C0874p.a(this.c, registerRequestParams.c) && C0874p.a(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && C0874p.a(this.f, registerRequestParams.f) && C0874p.a(this.i, registerRequestParams.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.i(parcel, 2, this.a);
        com.google.android.gms.common.internal.safeparcel.c.d(parcel, 3, this.b);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 6, this.e, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
