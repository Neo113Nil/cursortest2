package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "ActivityAvatarDetailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityAvatarDetailFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragmentImpl_ResponseAdapter$ActivityAvatarDetailFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityAvatarDetailFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter.ActivityAvatarDetailFragment INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragmentImpl_ResponseAdapter.ActivityAvatarDetailFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ActivityAvatarDetailFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment genericActivityAvatarFragment;
            com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragment iconActivityAvatarFragment;
            com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment imageActivityAvatarFragment;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragment initialsActivityAvatarFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("GenericActivityAvatar"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                genericActivityAvatarFragment = com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragmentImpl_ResponseAdapter.GenericActivityAvatarFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                genericActivityAvatarFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("IconActivityAvatar"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                iconActivityAvatarFragment = com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragmentImpl_ResponseAdapter.IconActivityAvatarFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                iconActivityAvatarFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ImageActivityAvatar"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                imageActivityAvatarFragment = com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragmentImpl_ResponseAdapter.ImageActivityAvatarFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                imageActivityAvatarFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("InitialsActivityAvatar"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                initialsActivityAvatarFragment = com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragmentImpl_ResponseAdapter.InitialsActivityAvatarFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment(str, genericActivityAvatarFragment, iconActivityAvatarFragment, imageActivityAvatarFragment, initialsActivityAvatarFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getGenericActivityAvatarFragment() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragmentImpl_ResponseAdapter.GenericActivityAvatarFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getGenericActivityAvatarFragment());
            }
            if (value.getIconActivityAvatarFragment() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.IconActivityAvatarFragmentImpl_ResponseAdapter.IconActivityAvatarFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getIconActivityAvatarFragment());
            }
            if (value.getImageActivityAvatarFragment() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragmentImpl_ResponseAdapter.ImageActivityAvatarFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getImageActivityAvatarFragment());
            }
            if (value.getInitialsActivityAvatarFragment() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.InitialsActivityAvatarFragmentImpl_ResponseAdapter.InitialsActivityAvatarFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getInitialsActivityAvatarFragment());
            }
        }
    }

    private ActivityAvatarDetailFragmentImpl_ResponseAdapter() {
    }
}
