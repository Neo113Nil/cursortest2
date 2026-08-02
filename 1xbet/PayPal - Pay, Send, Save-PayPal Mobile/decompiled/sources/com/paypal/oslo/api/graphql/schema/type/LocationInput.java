package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJF\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/LocationInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "countryCode", "countryName", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/LocationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getCity", "getCountryCode", "getCountryName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocationInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> city;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> countryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> countryName;

    public LocationInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.city = optional;
        this.countryCode = optional2;
        this.countryName = optional3;
    }

    public /* synthetic */ LocationInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCity() {
        return this.city;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCountryCode() {
        return this.countryCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCountryName() {
        return this.countryName;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.city;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.countryCode;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.countryName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationInput(city=");
        sb.append(optional);
        sb.append(", countryCode=");
        sb.append(optional2);
        sb.append(", countryName=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.city.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.countryName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.LocationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.LocationInput locationInput = (com.paypal.oslo.api.graphql.schema.type.LocationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.city, locationInput.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, locationInput.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryName, locationInput.countryName);
    }

    public final com.paypal.oslo.api.graphql.schema.type.LocationInput copy(com.apollographql.apollo.api.Optional<java.lang.String> city, com.apollographql.apollo.api.Optional<? extends java.lang.Object> countryCode, com.apollographql.apollo.api.Optional<java.lang.String> countryName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
        return new com.paypal.oslo.api.graphql.schema.type.LocationInput(city, countryCode, countryName);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.countryName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.countryCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.city;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.LocationInput copy$default(com.paypal.oslo.api.graphql.schema.type.LocationInput locationInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = locationInput.city;
        }
        if ((i & 2) != 0) {
            optional2 = locationInput.countryCode;
        }
        if ((i & 4) != 0) {
            optional3 = locationInput.countryName;
        }
        return locationInput.copy(optional, optional2, optional3);
    }

    public LocationInput() {
        this(null, null, null, 7, null);
    }
}
