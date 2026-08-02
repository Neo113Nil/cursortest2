package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.fido.fido2.api.common.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC0888c implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<EnumC0888c> CREATOR = new C0905k0();

    @NonNull
    public final String a;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.c$a */
    public static class a extends Exception {
    }

    EnumC0888c(String str) {
        this.a = str;
    }

    @NonNull
    public static EnumC0888c h(@NonNull String str) throws a {
        for (EnumC0888c enumC0888c : values()) {
            if (str.equals(enumC0888c.a)) {
                return enumC0888c;
            }
        }
        throw new a(android.support.v4.media.b.b("Attestation conveyance preference ", str, " not supported"));
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
