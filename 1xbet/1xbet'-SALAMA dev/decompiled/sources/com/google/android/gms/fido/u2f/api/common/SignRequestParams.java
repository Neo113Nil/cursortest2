package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new l(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f11550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f11551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f11554f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11555x;

    public SignRequestParams(Integer num, Double d7, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.f11549a = num;
        this.f11550b = d7;
        this.f11551c = uri;
        this.f11552d = bArr;
        D.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f11553e = arrayList;
        this.f11554f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            D.a("registered key has null appId and no request appId is provided", (registeredKey.f11547b == null && uri == null) ? false : true);
            String str2 = registeredKey.f11547b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        D.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f11555x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (D.m(this.f11549a, signRequestParams.f11549a) && D.m(this.f11550b, signRequestParams.f11550b) && D.m(this.f11551c, signRequestParams.f11551c) && Arrays.equals(this.f11552d, signRequestParams.f11552d)) {
            ArrayList arrayList = this.f11553e;
            ArrayList arrayList2 = signRequestParams.f11553e;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && D.m(this.f11554f, signRequestParams.f11554f) && D.m(this.f11555x, signRequestParams.f11555x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.f11552d));
        return Arrays.hashCode(new Object[]{this.f11549a, this.f11551c, this.f11550b, this.f11553e, this.f11554f, this.f11555x, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.p0(parcel, 2, this.f11549a);
        Y4.D.m0(parcel, 3, this.f11550b);
        Y4.D.r0(parcel, 4, this.f11551c, i7, false);
        Y4.D.l0(parcel, 5, this.f11552d, false);
        Y4.D.w0(parcel, 6, this.f11553e, false);
        Y4.D.r0(parcel, 7, this.f11554f, i7, false);
        Y4.D.s0(parcel, 8, this.f11555x, false);
        Y4.D.z0(iX0, parcel);
    }
}
