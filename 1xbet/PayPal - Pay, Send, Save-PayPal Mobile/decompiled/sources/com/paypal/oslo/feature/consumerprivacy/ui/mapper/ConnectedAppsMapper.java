package com.paypal.oslo.feature.consumerprivacy.ui.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/mapper/ConnectedAppsMapper;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "permissionResolver", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;)V", "()V", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "consents", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "mapToUiState", "(Ljava/util/List;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState$Content;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentPermission;", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectedAppsMapper {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ConnectedAppsMapper(com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver permissionStringResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStringResolver, "");
        this.Camera2StreamConfigurationMap = permissionStringResolver;
    }

    public ConnectedAppsMapper() {
        this(com.paypal.oslo.feature.consumerprivacy.domain.FallbackPermissionStringResolver.INSTANCE);
    }

    public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content mapToUiState(java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> consents) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consents, "");
        java.util.ArrayList<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent : consents) {
            if (connectedAppsConsent.getProviderName() != null) {
                arrayList3.add(connectedAppsConsent);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getConsentType(), "OPEN_BANKING")) {
                arrayList2.add(connectedAppsConsent);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getConsentType(), "APP")) {
                arrayList.add(connectedAppsConsent);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent2 : arrayList) {
            java.lang.String grantId = connectedAppsConsent2.getGrantId();
            if (grantId == null || grantId.length() == 0 || (!kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent2.getStatus(), "EXPIRED") && !kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent2.getStatus(), "REVOKED"))) {
                if (!linkedHashMap.containsKey(connectedAppsConsent2.getClientId())) {
                    arrayList4.add(connectedAppsConsent2);
                    linkedHashMap.put(connectedAppsConsent2.getClientId(), new java.util.ArrayList());
                }
                java.lang.Object obj = linkedHashMap.get(connectedAppsConsent2.getClientId());
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                ((java.util.List) obj).add(connectedAppsConsent2);
            }
        }
        kotlin.Pair pair = kotlin.TuplesKt.to(arrayList4, linkedHashMap);
        java.util.List list = (java.util.List) pair.component1();
        java.util.Map map = (java.util.Map) pair.component2();
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list2 = list;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent3 : list2) {
            java.util.List list3 = (java.util.List) map.get(connectedAppsConsent3.getClientId());
            if (list3 == null) {
                list3 = kotlin.collections.CollectionsKt.emptyList();
            }
            boolean z = connectedAppsConsent3.getCdrArrangementId() != null;
            java.util.List<java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(connectedAppsConsent3.getPermissions(), connectedAppsConsent3.getClientName());
            int size = highSpeedVideoFpsRanges.size();
            int size2 = list3.size();
            if (z) {
                connectedAppActionType = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.DETAILS_ONLY;
            } else {
                connectedAppActionType = connectedAppsConsent3.getUalClient() ? com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.MANAGE : com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.REMOVE;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType2 = connectedAppActionType;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent4 = (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2;
                if (connectedAppsConsent4.getGrantId() != null && kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent4.getStatus(), com.payair.model.TokenStatusKt.TOKEN_ACTIVE)) {
                    arrayList6.add(obj2);
                }
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                java.lang.String grantId2 = ((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) it.next()).getGrantId();
                if (grantId2 != null) {
                    arrayList7.add(grantId2);
                }
            }
            arrayList5.add(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem(connectedAppsConsent3.getId(), connectedAppsConsent3.getClientName(), size, highSpeedVideoFpsRanges, connectedAppActionType2, z, connectedAppsConsent3.getClientId(), connectedAppsConsent3.getGrantId(), size2, arrayList7));
        }
        java.util.ArrayList arrayList8 = arrayList5;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.ArrayList<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> arrayList9 = arrayList2;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
        for (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent5 : arrayList9) {
            java.util.List<java.lang.String> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(connectedAppsConsent5.getPermissions(), connectedAppsConsent5.getClientName());
            arrayList10.add(new com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem(connectedAppsConsent5.getId(), connectedAppsConsent5.getClientName(), highSpeedVideoFpsRanges2.size(), com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType.REMOVE, highSpeedVideoFpsRanges2, null, null, null, connectedAppsConsent5.getId(), connectedAppsConsent5.getConsentType(), 224, null));
        }
        createListBuilder.addAll(arrayList10);
        java.util.ArrayList<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> arrayList11 = arrayList3;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
        for (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent6 : arrayList11) {
            java.lang.String clientName = connectedAppsConsent6.getClientName();
            java.lang.String partnerIdentifier = connectedAppsConsent6.getPartnerIdentifier();
            arrayList12.add(new com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem(connectedAppsConsent6.getId(), clientName, 1, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType.UNLINK_EMAIL, null, partnerIdentifier == null ? "" : partnerIdentifier, clientName, connectedAppsConsent6.getProviderName(), connectedAppsConsent6.getId(), null, 528, null));
        }
        createListBuilder.addAll(arrayList12);
        return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(arrayList8, kotlin.collections.CollectionsKt.build(createListBuilder), false, null, 12, null);
    }

    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission> p0, java.lang.String p1) {
        if (p0 == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            java.lang.String resolveTitle = this.Camera2StreamConfigurationMap.resolveTitle(((com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission) it.next()).getPermissionKey(), p1);
            if (resolveTitle != null) {
                arrayList.add(resolveTitle);
            }
        }
        return arrayList;
    }
}
