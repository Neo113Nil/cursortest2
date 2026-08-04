package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import p074k3.c;
import p140t3.b;

/* JADX INFO: loaded from: classes.dex */
public enum Attachment implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11407a;

    Attachment(String str) {
        this.f11407a = str;
    }

    public static Attachment a(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.f11407a)) {
                return attachment;
            }
        }
        throw new b(AbstractC0486a1.h("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11407a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11407a);
    }
}
