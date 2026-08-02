package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class E extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<E> CREATOR = new C0903j0();

    @NonNull
    public final a a;

    @Nullable
    public final String b;

    public enum a implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<a> CREATOR = new C0901i0();

        @NonNull
        public final String a;

        a(@NonNull String str) {
            this.a = str;
        }

        @NonNull
        public static a h(@NonNull String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.a)) {
                    return aVar;
                }
            }
            throw new b(android.support.v4.media.b.b("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public final String toString() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeString(this.a);
        }
    }

    public static class b extends Exception {
    }

    static {
        new E("supported", null);
        new E("not-supported", null);
    }

    public E(@NonNull String str, @Nullable String str2) {
        C0875q.g(str);
        try {
            this.a = a.h(str);
            this.b = str2;
        } catch (b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        return zzbk.zza(this.a, e.a) && zzbk.zza(this.b, e.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.a.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
