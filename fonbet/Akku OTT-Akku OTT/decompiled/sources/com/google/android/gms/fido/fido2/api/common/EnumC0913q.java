package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* renamed from: com.google.android.gms.fido.fido2.api.common.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC0913q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<EnumC0913q> CREATOR = new K0();
    public final int a;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.q$a */
    public static class a extends Exception {
    }

    EnumC0913q(int i) {
        this.a = i;
    }

    @NonNull
    public static EnumC0913q h(int i) throws a {
        for (EnumC0913q enumC0913q : values()) {
            if (i == enumC0913q.a) {
                return enumC0913q;
            }
        }
        Locale locale = Locale.US;
        throw new a(androidx.compose.runtime.u.a(i, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
