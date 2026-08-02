package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0914s extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0914s> CREATOR = new P();
    public final boolean a;

    public C0914s(boolean z) {
        this.a = z;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0914s) && this.a == ((C0914s) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
