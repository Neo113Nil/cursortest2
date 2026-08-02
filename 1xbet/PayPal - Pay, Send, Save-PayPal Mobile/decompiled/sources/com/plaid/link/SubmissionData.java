package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/plaid/link/SubmissionData;", "", "", "phoneNumber", "dateOfBirth", "", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/plaid/link/SubmissionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDateOfBirth", "Ljava/util/Map;", "getParams", "getPhoneNumber"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SubmissionData {
    private final java.lang.String dateOfBirth;
    private final java.util.Map<java.lang.String, java.lang.String> params;
    private final java.lang.String phoneNumber;

    public SubmissionData() {
        this(null, null, null, 7, null);
    }

    public final java.lang.String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return this.params;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SubmissionData(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        this.phoneNumber = str;
        this.dateOfBirth = str2;
        this.params = map;
    }

    public /* synthetic */ SubmissionData(java.lang.String str, java.lang.String str2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.phoneNumber;
        java.lang.String str2 = this.dateOfBirth;
        java.util.Map<java.lang.String, java.lang.String> map = this.params;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmissionData(phoneNumber=");
        sb.append(str);
        sb.append(", dateOfBirth=");
        sb.append(str2);
        sb.append(", params=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.phoneNumber;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.dateOfBirth;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.params;
        return (((hashCode * 31) + hashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.plaid.link.SubmissionData)) {
            return false;
        }
        com.plaid.link.SubmissionData submissionData = (com.plaid.link.SubmissionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, submissionData.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirth, submissionData.dateOfBirth) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, submissionData.params);
    }

    public final com.plaid.link.SubmissionData copy(java.lang.String phoneNumber, java.lang.String dateOfBirth, java.util.Map<java.lang.String, java.lang.String> params) {
        return new com.plaid.link.SubmissionData(phoneNumber, dateOfBirth, params);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.params;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.plaid.link.SubmissionData copy$default(com.plaid.link.SubmissionData submissionData, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = submissionData.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = submissionData.dateOfBirth;
        }
        if ((i & 4) != 0) {
            map = submissionData.params;
        }
        return submissionData.copy(str, str2, map);
    }
}
