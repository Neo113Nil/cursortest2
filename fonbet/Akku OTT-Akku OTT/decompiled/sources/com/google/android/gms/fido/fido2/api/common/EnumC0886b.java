package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.fido.fido2.api.common.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC0886b implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<EnumC0886b> CREATOR = new J();

    @NonNull
    public final String a;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.b$a */
    public static class a extends Exception {
    }

    EnumC0886b(String str) {
        this.a = str;
    }

    @NonNull
    public static EnumC0886b h(@NonNull String str) throws a {
        for (EnumC0886b enumC0886b : values()) {
            if (str.equals(enumC0886b.a)) {
                return enumC0886b;
            }
        }
        throw new a(android.support.v4.media.b.b("Attachment ", str, " not supported"));
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
