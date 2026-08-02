package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.fido.fido2.api.common.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC0921z implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0921z EF2;
    public static final /* synthetic */ EnumC0921z[] a = {new EnumC0921z()};

    @NonNull
    public static final Parcelable.Creator<EnumC0921z> CREATOR = new C0891d0();

    /* renamed from: com.google.android.gms.fido.fido2.api.common.z$a */
    public static class a extends Exception {
    }

    @NonNull
    public static EnumC0921z h(@NonNull String str) throws a {
        for (EnumC0921z enumC0921z : values()) {
            enumC0921z.getClass();
            if (str.equals("public-key")) {
                return enumC0921z;
            }
        }
        throw new a(android.support.v4.media.b.b("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static EnumC0921z valueOf(@NonNull String str) {
        return (EnumC0921z) Enum.valueOf(EnumC0921z.class, str);
    }

    @NonNull
    public static EnumC0921z[] values() {
        return (EnumC0921z[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
