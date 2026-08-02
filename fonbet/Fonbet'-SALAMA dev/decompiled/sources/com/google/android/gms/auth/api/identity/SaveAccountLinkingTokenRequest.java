package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new Z2.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f10983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10985c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10986d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10987e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10988f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i7) {
        this.f10983a = pendingIntent;
        this.f10984b = str;
        this.f10985c = str2;
        this.f10986d = arrayList;
        this.f10987e = str3;
        this.f10988f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f10986d;
        return arrayList.size() == saveAccountLinkingTokenRequest.f10986d.size() && arrayList.containsAll(saveAccountLinkingTokenRequest.f10986d) && D.m(this.f10983a, saveAccountLinkingTokenRequest.f10983a) && D.m(this.f10984b, saveAccountLinkingTokenRequest.f10984b) && D.m(this.f10985c, saveAccountLinkingTokenRequest.f10985c) && D.m(this.f10987e, saveAccountLinkingTokenRequest.f10987e) && this.f10988f == saveAccountLinkingTokenRequest.f10988f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10983a, this.f10984b, this.f10985c, this.f10986d, this.f10987e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10983a, i7, false);
        Y4.D.s0(parcel, 2, this.f10984b, false);
        Y4.D.s0(parcel, 3, this.f10985c, false);
        Y4.D.u0(parcel, 4, this.f10986d);
        Y4.D.s0(parcel, 5, this.f10987e, false);
        Y4.D.B0(parcel, 6, 4);
        parcel.writeInt(this.f10988f);
        Y4.D.z0(x02, parcel);
    }
}
