package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t3.l;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new l(17);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11539a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f11540b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f11541c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11542d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11543e;

    /* renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f11544f;

    /* renamed from: x, reason: collision with root package name */
    public final String f11545x;

    public RegisterRequestParams(Integer num, Double d7, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.f11539a = num;
        this.f11540b = d7;
        this.f11541c = uri;
        D.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f11542d = arrayList;
        this.f11543e = arrayList2;
        this.f11544f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            D.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.f11538d == null) ? false : true);
            String str2 = registerRequest.f11538d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            D.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.f11547b == null) ? false : true);
            String str3 = registeredKey.f11547b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        D.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f11545x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (D.m(this.f11539a, registerRequestParams.f11539a) && D.m(this.f11540b, registerRequestParams.f11540b) && D.m(this.f11541c, registerRequestParams.f11541c) && D.m(this.f11542d, registerRequestParams.f11542d)) {
            ArrayList arrayList = this.f11543e;
            ArrayList arrayList2 = registerRequestParams.f11543e;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && D.m(this.f11544f, registerRequestParams.f11544f) && D.m(this.f11545x, registerRequestParams.f11545x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11539a, this.f11541c, this.f11540b, this.f11542d, this.f11543e, this.f11544f, this.f11545x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.p0(parcel, 2, this.f11539a);
        Y4.D.m0(parcel, 3, this.f11540b);
        Y4.D.r0(parcel, 4, this.f11541c, i7, false);
        Y4.D.w0(parcel, 5, this.f11542d, false);
        Y4.D.w0(parcel, 6, this.f11543e, false);
        Y4.D.r0(parcel, 7, this.f11544f, i7, false);
        Y4.D.s0(parcel, 8, this.f11545x, false);
        Y4.D.z0(x02, parcel);
    }
}
