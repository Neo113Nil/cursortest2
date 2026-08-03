package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public class IdentifiersResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<io.appmetrica.analytics.internal.IdentifiersResult> CREATOR = new io.appmetrica.analytics.impl.Ya();
    public final java.lang.String errorExplanation;
    public final java.lang.String id;
    public final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus status;

    public IdentifiersResult(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus, java.lang.String str2) {
        this.id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) obj;
        java.lang.String str = this.id;
        if (str == null ? identifiersResult.id != null : !str.equals(identifiersResult.id)) {
            return false;
        }
        if (this.status != identifiersResult.status) {
            return false;
        }
        java.lang.String str2 = this.errorExplanation;
        return str2 != null ? str2.equals(identifiersResult.errorExplanation) : identifiersResult.errorExplanation == null;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        java.lang.String str2 = this.errorExplanation;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdentifiersResult{id='");
        sb.append(this.id);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", errorExplanation='");
        return B1.a.j(sb, this.errorExplanation, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i2) {
        parcel.writeString(this.id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
