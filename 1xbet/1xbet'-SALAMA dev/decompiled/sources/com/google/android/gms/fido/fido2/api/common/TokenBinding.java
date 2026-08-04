package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;
import p074k3.c;
import p140t3.j;

/* JADX INFO: loaded from: classes.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new c(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TokenBindingStatus f11496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11497b;

    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11499a;

        TokenBindingStatus(String str) {
            this.f11499a = str;
        }

        public static TokenBindingStatus a(String str) throws j {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f11499a)) {
                    return tokenBindingStatus;
                }
            }
            throw new j(AbstractC0486a1.h("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f11499a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f11499a);
        }
    }

    static {
        new TokenBinding("supported", null);
        new TokenBinding("not-supported", null);
    }

    public TokenBinding(String str, String str2) {
        D.i(str);
        try {
            this.f11496a = TokenBindingStatus.a(str);
            this.f11497b = str2;
        } catch (j e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzao.zza(this.f11496a, tokenBinding.f11496a) && zzao.zza(this.f11497b, tokenBinding.f11497b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11496a, this.f11497b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 2, this.f11496a.f11499a, false);
        Y4.D.s0(parcel, 3, this.f11497b, false);
        Y4.D.z0(iX0, parcel);
    }
}
