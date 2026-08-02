package com.paypal.oslo.feature.publicprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "PublicProfile", "OnPersonalPublicProfile", "Name", "Location", "Contact", "Name1", "PrimaryAddress", "Address", "Relationship"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPublicProfileQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"publicProfile", "contact"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile = null;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    publicProfile = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PublicProfile.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    contact = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Contact.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (publicProfile != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data(publicProfile, contact);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "publicProfile");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("publicProfile");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PublicProfile.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPublicProfile());
            writer.name("contact");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Contact.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getContact());
        }
    }

    private GetPublicProfileQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$PublicProfile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PublicProfile implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PublicProfile INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PublicProfile();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "handle", "joinedDate"});
        public static final int $stable = 8;

        private PublicProfile() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PersonalPublicProfile"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPersonalPublicProfile = com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.OnPersonalPublicProfile.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile(str, str2, obj, onPersonalPublicProfile);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "handle");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("handle");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getHandle());
            writer.name("joinedDate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getJoinedDate());
            if (value.getOnPersonalPublicProfile() != null) {
                com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.OnPersonalPublicProfile.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPersonalPublicProfile());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$OnPersonalPublicProfile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPersonalPublicProfile implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.OnPersonalPublicProfile INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.OnPersonalPublicProfile();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"profilePhotoUrl", "name", "location"});
        public static final int $stable = 8;

        private OnPersonalPublicProfile() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2 = null;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    name2 = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    location = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Location.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "profilePhotoUrl");
                throw new kotlin.KotlinNothingValueException();
            }
            if (name2 != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile(obj, name2, location);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("profilePhotoUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePhotoUrl());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name.INSTANCE, true).toJson(writer, customScalarAdapters, value.getName());
            writer.name("location");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Location.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getLocation());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Name;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Name() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields fromJson = com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFieldsImpl_ResponseAdapter.CustomerNameFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFieldsImpl_ResponseAdapter.CustomerNameFields.INSTANCE.toJson(writer, customScalarAdapters, value.getCustomerNameFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Location;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Location implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Location INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Location();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Location() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields fromJson = com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFieldsImpl_ResponseAdapter.AddressPortableFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFieldsImpl_ResponseAdapter.AddressPortableFields.INSTANCE.toJson(writer, customScalarAdapters, value.getAddressPortableFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Contact;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contact implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Contact INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Contact();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "profilePhotoUrl", "primaryAddress", "relationship"});
        public static final int $stable = 8;

        private Contact() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1 = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress = null;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    name1 = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    primaryAddress = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PrimaryAddress.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    relationship = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Relationship.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact(name1, obj, primaryAddress, relationship);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getName());
            writer.name("profilePhotoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePhotoUrl());
            writer.name("primaryAddress");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PrimaryAddress.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPrimaryAddress());
            writer.name("relationship");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Relationship.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRelationship());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Name1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name1 INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Name1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Name1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields fromJson = com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFieldsImpl_ResponseAdapter.CustomerNameFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFieldsImpl_ResponseAdapter.CustomerNameFields.INSTANCE.toJson(writer, customScalarAdapters, value.getCustomerNameFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$PrimaryAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrimaryAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PrimaryAddress INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.PrimaryAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("address");
        public static final int $stable = 8;

        private PrimaryAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                address = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Address.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (address != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress(address);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "address");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("address");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Address.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAddress());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Address;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Address implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Address INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Address();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Address() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields fromJson = com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFieldsImpl_ResponseAdapter.AddressPortableFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFieldsImpl_ResponseAdapter.AddressPortableFields.INSTANCE.toJson(writer, customScalarAdapters, value.getAddressPortableFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/adapter/GetPublicProfileQuery_ResponseAdapter$Relationship;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Relationship implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship> {
        public static final com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Relationship INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Relationship();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"mutualConnectionCount", "isExternalContact", "isFavorited", "isBlocked"});
        public static final int $stable = 8;

        private Relationship() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.Boolean bool3 = null;
            java.lang.Integer num = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    bool3 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (bool3 != null) {
                        return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship(num, booleanValue, booleanValue2, bool3.booleanValue());
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "isBlocked");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "isFavorited");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "isExternalContact");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("mutualConnectionCount");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getMutualConnectionCount());
            writer.name("isExternalContact");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isExternalContact()));
            writer.name("isFavorited");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isFavorited()));
            writer.name("isBlocked");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isBlocked()));
        }
    }
}
