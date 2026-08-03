package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V9 implements android.os.Parcelable {
    public static final io.appmetrica.analytics.impl.U9 CREATOR = new io.appmetrica.analytics.impl.U9();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f5134a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus f5135b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5136c;

    public V9(java.lang.Boolean bool, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus, java.lang.String str) {
        this.f5134a = bool;
        this.f5135b = identifierStatus;
        this.f5136c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.V9)) {
            return false;
        }
        io.appmetrica.analytics.impl.V9 v9 = (io.appmetrica.analytics.impl.V9) obj;
        return kotlin.jvm.internal.i.a(this.f5134a, v9.f5134a) && this.f5135b == v9.f5135b && kotlin.jvm.internal.i.a(this.f5136c, v9.f5136c);
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.f5134a;
        int hashCode = (this.f5135b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        java.lang.String str = this.f5136c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "FeaturesInternal(sslPinning=" + this.f5134a + ", status=" + this.f5135b + ", errorExplanation=" + this.f5136c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeValue(this.f5134a);
        parcel.writeString(this.f5135b.getValue());
        parcel.writeString(this.f5136c);
    }

    public V9() {
        this(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, null);
    }
}
