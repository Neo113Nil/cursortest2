package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new Z2.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SignInPassword f10990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10992c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i7) {
        D.i(signInPassword);
        this.f10990a = signInPassword;
        this.f10991b = str;
        this.f10992c = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return D.m(this.f10990a, savePasswordRequest.f10990a) && D.m(this.f10991b, savePasswordRequest.f10991b) && this.f10992c == savePasswordRequest.f10992c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10990a, this.f10991b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10990a, i7, false);
        Y4.D.s0(parcel, 2, this.f10991b, false);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10992c);
        Y4.D.z0(iX0, parcel);
    }
}
