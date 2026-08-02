package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/AMSFieldMappings;", "", "<init>", "()V", "", "backendField", "toFrontendKey", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "", "Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "details", "", "fieldLabels", "buildFieldErrorMap", "(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputFormats", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AMSFieldMappings {
    public static final com.paypal.oslo.feature.userprofile.ui.utils.AMSFieldMappings INSTANCE = new com.paypal.oslo.feature.userprofile.ui.utils.AMSFieldMappings();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADDRESS_LINE_1", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleAddressLine1, com.google.android.libraries.places.api.model.PlaceTypes.STREET_NUMBER, "street_name", "street_type", "delivery_service"});

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADDRESS_LINE_2", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleAddressLine2, "building_name", "sub_building"});

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADDRESS_LINE_3", "address_line_3"});

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADMIN_AREA_1", "admin_area_1"});

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADMIN_AREA_2", "admin_area_2"});
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADMIN_AREA_3", "admin_area_3"});

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getOutputMinFrameDuration = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ADMIN_AREA_4", "admin_area_4"});

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getInputFormats = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, "postal_code"});
    public static final int $stable = 8;

    private AMSFieldMappings() {
    }

    public final java.lang.String toFrontendKey(java.lang.String backendField) {
        if (kotlin.collections.CollectionsKt.contains(Camera2StreamConfigurationMap, backendField)) {
            return "AddressLine1";
        }
        if (kotlin.collections.CollectionsKt.contains(getHighSpeedVideoFpsRanges, backendField)) {
            return "AddressLine2";
        }
        if (kotlin.collections.CollectionsKt.contains(getHighSpeedVideoSizes, backendField)) {
            return "AddressLine3";
        }
        if (kotlin.collections.CollectionsKt.contains(getHighSpeedVideoFpsRangesFor, backendField)) {
            return "AdminArea1";
        }
        if (kotlin.collections.CollectionsKt.contains(getHighResolutionOutputSizeshNQ4ISI, backendField)) {
            return "AdminArea2";
        }
        if (kotlin.collections.CollectionsKt.contains(getHighSpeedVideoSizesFor, backendField)) {
            return "AdminArea3";
        }
        if (kotlin.collections.CollectionsKt.contains(getOutputMinFrameDuration, backendField)) {
            return "AdminArea4";
        }
        if (kotlin.collections.CollectionsKt.contains(getInputFormats, backendField)) {
            return "PostalCode";
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.String> buildFieldErrorMap(android.content.Context context, java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> details, java.util.Map<java.lang.String, java.lang.String> fieldLabels) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldLabels, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = details.iterator();
        while (it.hasNext()) {
            java.lang.String frontendKey = INSTANCE.toFrontendKey(((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it.next()).getField());
            if (frontendKey != null) {
                java.lang.String str = fieldLabels.get(frontendKey);
                if (str == null) {
                    str = frontendKey.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                }
                java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_field_error, str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                pair = kotlin.TuplesKt.to(frontendKey, string);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }
}
