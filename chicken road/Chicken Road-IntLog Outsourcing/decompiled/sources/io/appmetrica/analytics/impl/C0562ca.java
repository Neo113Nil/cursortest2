package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562ca implements Parcelable {
    public static final C0536ba CREATOR = new C0536ba();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f7988a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f7989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7990c;

    public C0562ca(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f7988a = bool;
        this.f7989b = identifierStatus;
        this.f7990c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0562ca)) {
            return false;
        }
        C0562ca c0562ca = (C0562ca) obj;
        return kotlin.jvm.internal.i.a(this.f7988a, c0562ca.f7988a) && this.f7989b == c0562ca.f7989b && kotlin.jvm.internal.i.a(this.f7990c, c0562ca.f7990c);
    }

    public final int hashCode() {
        Boolean bool = this.f7988a;
        int hashCode = (this.f7989b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f7990c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.f7988a);
        sb.append(", status=");
        sb.append(this.f7989b);
        sb.append(", errorExplanation=");
        return B0.o.l(sb, this.f7990c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.f7988a);
        parcel.writeString(this.f7989b.getValue());
        parcel.writeString(this.f7990c);
    }

    public C0562ca() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
