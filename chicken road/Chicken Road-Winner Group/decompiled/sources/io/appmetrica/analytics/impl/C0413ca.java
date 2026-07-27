package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413ca implements Parcelable {
    public static final C0387ba CREATOR = new C0387ba();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f7100a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f7101b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7102c;

    public C0413ca(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f7100a = bool;
        this.f7101b = identifierStatus;
        this.f7102c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0413ca)) {
            return false;
        }
        C0413ca c0413ca = (C0413ca) obj;
        return kotlin.jvm.internal.j.a(this.f7100a, c0413ca.f7100a) && this.f7101b == c0413ca.f7101b && kotlin.jvm.internal.j.a(this.f7102c, c0413ca.f7102c);
    }

    public final int hashCode() {
        Boolean bool = this.f7100a;
        int hashCode = (this.f7101b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f7102c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f7100a + ", status=" + this.f7101b + ", errorExplanation=" + this.f7102c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeValue(this.f7100a);
        parcel.writeString(this.f7101b.getValue());
        parcel.writeString(this.f7102c);
    }

    public C0413ca() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
