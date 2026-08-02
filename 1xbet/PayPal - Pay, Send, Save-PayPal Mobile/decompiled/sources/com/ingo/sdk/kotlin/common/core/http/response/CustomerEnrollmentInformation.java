package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jx\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010 "}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentInformation;", "", "", "customerId", "firstName", "middleInitial", "lastName", "email", "ssn", "dob", "mobilePhoneNumber", "alternatePhoneNumber", "Lcom/ingo/sdk/kotlin/common/core/http/response/Address;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/core/http/response/Address;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/core/http/response/Address;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/ingo/sdk/kotlin/common/core/http/response/Address;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/core/http/response/Address;)Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentInformation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentInformation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCustomerId", "getFirstName", "getMiddleInitial", "getLastName", "getEmail", "getSsn", "getDob", "getMobilePhoneNumber", "getAlternatePhoneNumber", "Lcom/ingo/sdk/kotlin/common/core/http/response/Address;", "getAddress", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class CustomerEnrollmentInformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation.Companion(null);
    private final com.ingo.sdk.kotlin.common.core.http.response.Address address;
    private final java.lang.String alternatePhoneNumber;
    private final java.lang.String customerId;
    private final java.lang.String dob;
    private final java.lang.String email;
    private final java.lang.String firstName;
    private final java.lang.String lastName;
    private final java.lang.String middleInitial;
    private final java.lang.String mobilePhoneNumber;
    private final java.lang.String ssn;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentInformation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentInformation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation> serializer() {
            return com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomerEnrollmentInformation(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.ingo.sdk.kotlin.common.core.http.response.Address address, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1023, com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation$$serializer.INSTANCE.getDescriptor());
        }
        this.customerId = str;
        this.firstName = str2;
        this.middleInitial = str3;
        this.lastName = str4;
        this.email = str5;
        this.ssn = str6;
        this.dob = str7;
        this.mobilePhoneNumber = str8;
        this.alternatePhoneNumber = str9;
        this.address = address;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.customerId);
        output.encodeStringElement(serialDesc, 1, self.firstName);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.middleInitial);
        output.encodeStringElement(serialDesc, 3, self.lastName);
        output.encodeStringElement(serialDesc, 4, self.email);
        output.encodeStringElement(serialDesc, 5, self.ssn);
        output.encodeStringElement(serialDesc, 6, self.dob);
        output.encodeStringElement(serialDesc, 7, self.mobilePhoneNumber);
        output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.alternatePhoneNumber);
        output.encodeSerializableElement(serialDesc, 9, com.ingo.sdk.kotlin.common.core.http.response.Address$$serializer.INSTANCE, self.address);
    }

    public CustomerEnrollmentInformation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.ingo.sdk.kotlin.common.core.http.response.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.customerId = str;
        this.firstName = str2;
        this.middleInitial = str3;
        this.lastName = str4;
        this.email = str5;
        this.ssn = str6;
        this.dob = str7;
        this.mobilePhoneNumber = str8;
        this.alternatePhoneNumber = str9;
        this.address = address;
    }

    public final java.lang.String getCustomerId() {
        return this.customerId;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getMiddleInitial() {
        return this.middleInitial;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getSsn() {
        return this.ssn;
    }

    public final java.lang.String getDob() {
        return this.dob;
    }

    public final java.lang.String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    public final java.lang.String getAlternatePhoneNumber() {
        return this.alternatePhoneNumber;
    }

    public final com.ingo.sdk.kotlin.common.core.http.response.Address getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customerId;
        java.lang.String str2 = this.firstName;
        java.lang.String str3 = this.middleInitial;
        java.lang.String str4 = this.lastName;
        java.lang.String str5 = this.email;
        java.lang.String str6 = this.ssn;
        java.lang.String str7 = this.dob;
        java.lang.String str8 = this.mobilePhoneNumber;
        java.lang.String str9 = this.alternatePhoneNumber;
        com.ingo.sdk.kotlin.common.core.http.response.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerEnrollmentInformation(customerId=");
        sb.append(str);
        sb.append(", firstName=");
        sb.append(str2);
        sb.append(", middleInitial=");
        sb.append(str3);
        sb.append(", lastName=");
        sb.append(str4);
        sb.append(", email=");
        sb.append(str5);
        sb.append(", ssn=");
        sb.append(str6);
        sb.append(", dob=");
        sb.append(str7);
        sb.append(", mobilePhoneNumber=");
        sb.append(str8);
        sb.append(", alternatePhoneNumber=");
        sb.append(str9);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.customerId.hashCode();
        int hashCode2 = this.firstName.hashCode();
        java.lang.String str = this.middleInitial;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.lastName.hashCode();
        int hashCode5 = this.email.hashCode();
        int hashCode6 = this.ssn.hashCode();
        int hashCode7 = this.dob.hashCode();
        int hashCode8 = this.mobilePhoneNumber.hashCode();
        java.lang.String str2 = this.alternatePhoneNumber;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation customerEnrollmentInformation = (com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customerId, customerEnrollmentInformation.customerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, customerEnrollmentInformation.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleInitial, customerEnrollmentInformation.middleInitial) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, customerEnrollmentInformation.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, customerEnrollmentInformation.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssn, customerEnrollmentInformation.ssn) && kotlin.jvm.internal.Intrinsics.areEqual(this.dob, customerEnrollmentInformation.dob) && kotlin.jvm.internal.Intrinsics.areEqual(this.mobilePhoneNumber, customerEnrollmentInformation.mobilePhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.alternatePhoneNumber, customerEnrollmentInformation.alternatePhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, customerEnrollmentInformation.address);
    }

    public final com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation copy(java.lang.String customerId, java.lang.String firstName, java.lang.String middleInitial, java.lang.String lastName, java.lang.String email, java.lang.String ssn, java.lang.String dob, java.lang.String mobilePhoneNumber, java.lang.String alternatePhoneNumber, com.ingo.sdk.kotlin.common.core.http.response.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dob, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobilePhoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentInformation(customerId, firstName, middleInitial, lastName, email, ssn, dob, mobilePhoneNumber, alternatePhoneNumber, address);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAlternatePhoneNumber() {
        return this.alternatePhoneNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDob() {
        return this.dob;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSsn() {
        return this.ssn;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMiddleInitial() {
        return this.middleInitial;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component10, reason: from getter */
    public final com.ingo.sdk.kotlin.common.core.http.response.Address getAddress() {
        return this.address;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCustomerId() {
        return this.customerId;
    }
}
