package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/data/DocUploadViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadViewComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment.class);

    @javax.inject.Inject
    public DocUploadViewComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment component) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
                if (m16675toContextualInfoJkG0rbE != null) {
                    arrayList2.add(m16675toContextualInfoJkG0rbE);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data.DocUploadViewComponentParser.WhenMappings.$EnumSwitchMapping$0[component.getDocumentCategory().ordinal()];
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory = i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.UNKNOWN__ : com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_ADDRESS : com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.POA : com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_SSN : com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_NAME_AND_DATE_OF_BIRTH;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType> allowedDocumentTypes = component.getAllowedDocumentTypes();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedDocumentTypes, 10));
        java.util.Iterator<T> it2 = allowedDocumentTypes.iterator();
        while (it2.hasNext()) {
            switch (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data.DocUploadViewComponentParser.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType) it2.next()).ordinal()]) {
                case 1:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.SSN;
                    break;
                case 2:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PASSPORT;
                    break;
                case 3:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.DRIVERS_LICENSE;
                    break;
                case 4:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_NAME;
                    break;
                case 5:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ID;
                    break;
                case 6:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ADDRESS;
                    break;
                case 7:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UTILITIES_BILL;
                    break;
                case 8:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PHONE_BILL;
                    break;
                case 9:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.STATE_ID_CARD;
                    break;
                default:
                    docUploadDocumentType = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UNKNOWN__;
                    break;
            }
            arrayList3.add(docUploadDocumentType);
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig(m16608constructorimpl, docUploadCategory, arrayList3, defaultConstructorMarker), arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_NAME_AND_DATE_OF_BIRTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_SSN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.POA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PASSPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_ID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_ADDRESS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.UTILITIES_BILL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PHONE_BILL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.STATE_ID_CARD.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
