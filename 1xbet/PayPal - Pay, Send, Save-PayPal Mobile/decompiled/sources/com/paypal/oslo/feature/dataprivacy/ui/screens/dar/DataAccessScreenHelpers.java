package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/screens/dar/DataAccessScreenHelpers;", "", "<init>", "()V", "", "source", "", "getSourceTitleRes", "(Ljava/lang/String;)I", "getSourceDescriptionRes", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "error", "getErrorMessage", "(Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/dataprivacy/ui/screens/dar/DataAccessScreenHelpers$DataSection;", "getSectionsForSource", "(Ljava/lang/String;)Ljava/util/List;", "getAvailableSourceDescriptionRes", "getModalTitleRes", "DataSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataAccessScreenHelpers {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers();

    private DataAccessScreenHelpers() {
    }

    public final int getSourceTitleRes(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        switch (source.hashCode()) {
            case -1911368973:
                if (source.equals("PayPal")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_paypal_title;
                }
                break;
            case -1621497404:
                if (source.equals("Zettle")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_zettle_title;
                }
                break;
            case 2731829:
                if (source.equals("Xoom")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_xoom_title;
                }
                break;
            case 69909275:
                if (source.equals("Honey")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_honey_title;
                }
                break;
        }
        return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_paypal_title;
    }

    public final int getSourceDescriptionRes(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        switch (source.hashCode()) {
            case -1911368973:
                if (source.equals("PayPal")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_paypal_desc;
                }
                break;
            case -1621497404:
                if (source.equals("Zettle")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_zettle_desc;
                }
                break;
            case 2731829:
                if (source.equals("Xoom")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_xoom_desc;
                }
                break;
            case 69909275:
                if (source.equals("Honey")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_honey_desc;
                }
                break;
        }
        return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_file_format_selection_paypal_desc;
    }

    public final java.lang.String getErrorMessage(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NetworkFailure) {
            return "Network error. Please check your connection and try again.";
        }
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound) {
            return "Data not found. Please try again.";
        }
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.ApiError) {
            return ((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.ApiError) error).getMessage();
        }
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError) {
            return "Unable to identify your account. Please try again later.";
        }
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoEmailError) {
            return "Email address not found. Please try again later.";
        }
        if (error instanceof com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.InvalidInput) {
            return ((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.InvalidInput) error).getMessage();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/screens/dar/DataAccessScreenHelpers$DataSection;", "", "", "titleRes", "", "itemsRes", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/dataprivacy/ui/screens/dar/DataAccessScreenHelpers$DataSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/util/List;", "getItemsRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataSection {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Integer> itemsRes;
        private final int titleRes;

        public DataSection(int i, java.util.List<java.lang.Integer> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.titleRes = i;
            this.itemsRes = list;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.util.List<java.lang.Integer> getItemsRes() {
            return this.itemsRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.util.List<java.lang.Integer> list = this.itemsRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSection(titleRes=");
            sb.append(i);
            sb.append(", itemsRes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.titleRes) * 31) + this.itemsRes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection)) {
                return false;
            }
            com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection = (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection) other;
            return this.titleRes == dataSection.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.itemsRes, dataSection.itemsRes);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection copy(int titleRes, java.util.List<java.lang.Integer> itemsRes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemsRes, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(titleRes, itemsRes);
        }

        public final java.util.List<java.lang.Integer> component2() {
            return this.itemsRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection copy$default(com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection dataSection, int i, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dataSection.titleRes;
            }
            if ((i2 & 2) != 0) {
                list = dataSection.itemsRes;
            }
            return dataSection.copy(i, list);
        }
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection> getSectionsForSource(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        switch (source.hashCode()) {
            case -1911368973:
                if (source.equals("PayPal")) {
                    return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection[]{new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_personal_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_name), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_address), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_addresses_on_record), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_phone_number), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_email_address), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_date_of_birth), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_copies_of_ids), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_nationality), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_language)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_financial_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_paypal_account_details), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_bank_details), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_credit_info)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_usage_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_device_details), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_location_info)}))});
                }
                break;
            case -1621497404:
                if (source.equals("Zettle")) {
                    return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection[]{new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_mailing_list, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_name), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_phone_numbers), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_merchant_name), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_date_of_joining)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_account_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_date_and_time), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_transaction_id), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_debit_and_credit_amount), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_currency)}))});
                }
                break;
            case 2731829:
                if (source.equals("Xoom")) {
                    return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection[]{new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_personal_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_name), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_address), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_phone_number), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_date_of_birth), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_nationality), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_language), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_email_address), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_copies_of_ids)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_financial_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_card_details), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_bank_details)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_account_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_account_status), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_account_number), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_type), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_date_created)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_technical_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_device_info), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_cellular_network), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_geolocation_information)}))});
                }
                break;
            case 69909275:
                if (source.equals("Honey")) {
                    return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection[]{new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_personal_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_name), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_nationality), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_email_address)})), new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessScreenHelpers.DataSection(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_category_account_info, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_user_ids), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_gold_points_available), java.lang.Integer.valueOf(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_data_item_gold_points_redeemed)}))});
                }
                break;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final int getAvailableSourceDescriptionRes(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        switch (source.hashCode()) {
            case -1911368973:
                if (source.equals("PayPal")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_paypal_desc;
                }
                break;
            case -1621497404:
                if (source.equals("Zettle")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_zettle_desc;
                }
                break;
            case 2731829:
                if (source.equals("Xoom")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_description;
                }
                break;
            case 69909275:
                if (source.equals("Honey")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_honey_desc;
                }
                break;
        }
        return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_linked_accounts_paypal_desc;
    }

    public final int getModalTitleRes(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        switch (source.hashCode()) {
            case -1911368973:
                if (source.equals("PayPal")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_paypal_data_title;
                }
                break;
            case -1621497404:
                if (source.equals("Zettle")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_zettle_data_title;
                }
                break;
            case 2731829:
                if (source.equals("Xoom")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_xoom_data_title;
                }
                break;
            case 69909275:
                if (source.equals("Honey")) {
                    return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_honey_data_title;
                }
                break;
        }
        return com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_dar_paypal_data_title;
    }
}
