package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/BaseDateOfBirthParser;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "id", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthVariantAdapter;", "dateOfBirthVariant", "", "editable", "birthDate", "allowDatePicker", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "parseCommon-mn192JU", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthVariantAdapter;ZLjava/lang/Object;Z)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "parseCommon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public class BaseDateOfBirthParser {
    public static final int $stable = 0;

    /* renamed from: parseCommon-mn192JU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig m16989parseCommonmn192JU$default(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.BaseDateOfBirthParser baseDateOfBirthParser, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantAdapter dateOfBirthVariantAdapter, boolean z, java.lang.Object obj, boolean z2, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseCommon-mn192JU");
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return baseDateOfBirthParser.m16990parseCommonmn192JU(str, dateOfBirthVariantAdapter, z, obj, z2);
    }

    /* renamed from: parseCommon-mn192JU, reason: not valid java name */
    protected final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig m16990parseCommonmn192JU(java.lang.String id, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantAdapter dateOfBirthVariant, boolean editable, java.lang.Object birthDate, boolean allowDatePicker) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthVariant, "");
        if (dateOfBirthVariant instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantWrapper) {
            if (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.BaseDateOfBirthParser.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantWrapper) dateOfBirthVariant).getVariant().ordinal()] == 1) {
                dateOfBirthVariant2 = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant.PRIMARY_USER;
            } else {
                dateOfBirthVariant2 = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant.UNKNOWN__;
            }
        } else {
            if (!(dateOfBirthVariant instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.BaseDateOfBirthParser.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper) dateOfBirthVariant).getVariant().ordinal()] == 1) {
                dateOfBirthVariant2 = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant.PRIMARY_USER;
            } else {
                dateOfBirthVariant2 = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant.UNKNOWN__;
            }
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant3 = dateOfBirthVariant2;
        java.lang.String str = birthDate instanceof java.lang.String ? (java.lang.String) birthDate : null;
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig(id, dateOfBirthVariant3, editable, str != null ? com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate.m16992constructorimpl(str) : null, allowDatePicker, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
