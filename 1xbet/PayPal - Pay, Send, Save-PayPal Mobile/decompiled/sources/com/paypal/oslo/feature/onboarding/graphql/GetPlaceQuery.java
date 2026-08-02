package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004()*'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\bJ\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Data;", "", "placeId", "<init>", "(Ljava/lang/String;)V", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlaceId", "Companion", "Data", "Place", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPlaceQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "749dbc76d1a57d2c618cbfb01896460edb319faf79e99499b78f2504689f7196";
    public static final java.lang.String OPERATION_NAME = "GetPlace";
    private final java.lang.String placeId;

    public GetPlaceQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.placeId = str;
    }

    public final java.lang.String getPlaceId() {
        return this.placeId;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.onboarding.graphql.adapter.GetPlaceQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.GetPlaceQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.GetPlaceQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "place", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "getPlace"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place;

        public Data(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
            this.place = place;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place getPlace() {
            return this.place;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place = this.place;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(place=");
            sb.append(place);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.place.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.place, ((com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data) other).place);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data copy(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data(place);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place getPlace() {
            return this.place;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data data, com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                place = data.place;
            }
            return data.copy(place);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "", "", "id", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;", "address", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Place {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address;
        private final java.lang.String id;

        public Place(java.lang.String str, com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.id = str;
            this.address = address;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Place(id=");
            sb.append(str);
            sb.append(", address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, place.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, place.address);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place copy(java.lang.String id, com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place(id, address);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place, java.lang.String str, com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = place.id;
            }
            if ((i & 2) != 0) {
                address = place.address;
            }
            return place.copy(str, address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.postalCode = str8;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.String str8 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", postalCode=");
            sb.append(str8);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, address.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, address.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address.countryCode);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPlace($placeId: ID!) { place(id: $placeId) { id address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.placeId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPlaceQuery(placeId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.placeId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeId, ((com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery) other).placeId);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery copy(java.lang.String placeId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeId, "");
        return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery(placeId);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlaceId() {
        return this.placeId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery getPlaceQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getPlaceQuery.placeId;
        }
        return getPlaceQuery.copy(str);
    }
}
