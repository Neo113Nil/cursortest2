package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailHelpSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "p0", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailHelpSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHelpSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHelpSectionMapper();

    private TransactionDetailHelpSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return !input.getResult().getHelpCenterOptions().isEmpty() || getHighSpeedVideoSizes(input) || getHighSpeedVideoFpsRanges(input);
    }

    private static boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data p0) {
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions = p0.getResult().getActions();
        if (actions == null) {
            return false;
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list = actions;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action) it.next()).getActivityActionsFragment().getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_REPORT) {
                return p0.getResult().getCounterparty().getActivityCounterpartyDetailFragment().getAccountId() != null;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data p0) {
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions = p0.getResult().getActions();
        if (actions == null) {
            return false;
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list = actions;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action) it.next()).getActivityActionsFragment().getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK) {
                return p0.getResult().getCounterparty().getActivityCounterpartyDetailFragment().getAccountId() != null;
            }
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.lang.Object obj;
        com.paypal.pds.core.Icon.AiMark aiMark;
        com.paypal.oslo.feature.activity.domain.detail.models.ContactModel contactModel;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment.Contact contact;
        int i;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (getHighSpeedVideoSizes(input)) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment = input.getResult().getCounterparty().getActivityCounterpartyDetailFragment();
            java.lang.String displayName = activityCounterpartyDetailFragment.getDisplayName();
            java.lang.String accountId = activityCounterpartyDetailFragment.getAccountId();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship2 = input.getRelationship();
            boolean isBlocked = (relationship2 == null || (relationship = relationship2.getRelationship()) == null) ? false : relationship.isBlocked();
            if (isBlocked) {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_unblock_cta;
            } else {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_block_cta;
            }
            arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.HelpSection(null, java.lang.Integer.valueOf(i), kotlin.collections.CollectionsKt.listOfNotNull(displayName), com.paypal.pds.core.Icon.NoSign.INSTANCE, null, null, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK.getRawValue(), null, accountId, isBlocked, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, null));
        }
        if (getHighSpeedVideoFpsRanges(input)) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment2 = input.getResult().getCounterparty().getActivityCounterpartyDetailFragment();
            arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.HelpSection(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_help_section_report_cta), kotlin.collections.CollectionsKt.listOfNotNull(activityCounterpartyDetailFragment2.getDisplayName()), com.paypal.pds.core.Icon.Alert.INSTANCE, null, null, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_REPORT.getRawValue(), null, activityCounterpartyDetailFragment2.getAccountId(), false, 689, null));
        }
        java.util.Iterator<T> it = input.getResult().getHelpCenterOptions().iterator();
        while (true) {
            com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = null;
            descriptionAndLinkModel = null;
            if (it.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption helpCenterOption = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption) it.next();
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment = helpCenterOption.getActivityHelpCenterFragment();
                if (helpCenterOption.getActivityHelpCenterFragment().getOption() != com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.BUYER_PROTECTION) {
                    java.lang.String title = activityHelpCenterFragment.getTitle();
                    switch (com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHelpSectionMapper.WhenMappings.$EnumSwitchMapping$0[activityHelpCenterFragment.getOption().ordinal()]) {
                        case 1:
                            aiMark = com.paypal.pds.core.Icon.AiMark.INSTANCE;
                            break;
                        case 2:
                            aiMark = com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE;
                            break;
                        case 3:
                            aiMark = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                            break;
                        case 4:
                            aiMark = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
                            break;
                        case 5:
                            aiMark = com.paypal.pds.core.Icon.Alert.INSTANCE;
                            break;
                        case 6:
                            aiMark = com.paypal.pds.core.Icon.Mobile.INSTANCE;
                            break;
                        case 7:
                            aiMark = com.paypal.pds.core.Icon.Mobile.INSTANCE;
                            break;
                        case 8:
                            aiMark = com.paypal.pds.core.Icon.NoSign.INSTANCE;
                            break;
                        default:
                            aiMark = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                            break;
                    }
                    com.paypal.pds.core.Icon icon = aiMark;
                    java.lang.String description = activityHelpCenterFragment.getDescription();
                    java.lang.String description2 = (description == null || description.length() == 0) ? null : activityHelpCenterFragment.getDescription();
                    java.lang.Object url = activityHelpCenterFragment.getUrl();
                    java.lang.String obj2 = url != null ? url.toString() : null;
                    java.lang.String obj3 = activityHelpCenterFragment.getOption().toString();
                    if (activityHelpCenterFragment == null || (contact = activityHelpCenterFragment.getContact()) == null) {
                        contactModel = null;
                    } else {
                        com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment.Phone phone = contact.getPhone();
                        com.paypal.oslo.feature.activity.domain.detail.models.Phone phone2 = phone != null ? new com.paypal.oslo.feature.activity.domain.detail.models.Phone(phone.getCountryCode(), phone.getExtensionNumber(), phone.getNationalNumber()) : null;
                        java.lang.Object email = contact.getEmail();
                        java.lang.String obj4 = email != null ? email.toString() : null;
                        java.lang.Object url2 = contact.getUrl();
                        contactModel = new com.paypal.oslo.feature.activity.domain.detail.models.ContactModel(obj4, url2 != null ? url2.toString() : null, phone2);
                    }
                    arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.HelpSection(title, null, null, icon, description2, obj2, obj3, contactModel, null, false, 774, null));
                }
            } else {
                java.util.ArrayList arrayList2 = arrayList;
                int i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_how_can_we_help_title;
                java.util.Iterator<T> it2 = input.getResult().getHelpCenterOptions().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption) obj).getActivityHelpCenterFragment().getOption() == com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.BUYER_PROTECTION) {
                        }
                    } else {
                        obj = null;
                    }
                }
                com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption helpCenterOption2 = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption) obj;
                if (helpCenterOption2 != null) {
                    com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment2 = helpCenterOption2.getActivityHelpCenterFragment();
                    java.lang.String description3 = activityHelpCenterFragment2.getDescription();
                    if (description3 == null) {
                        description3 = "";
                    }
                    if (!kotlin.text.StringsKt.isBlank(description3)) {
                        java.lang.String title2 = activityHelpCenterFragment2.getTitle();
                        java.lang.Object url3 = activityHelpCenterFragment2.getUrl();
                        java.lang.String obj5 = url3 != null ? url3.toString() : null;
                        descriptionAndLinkModel = new com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel(description3, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(title2, obj5 != null ? obj5 : "")));
                    }
                }
                return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel(arrayList2, descriptionAndLinkModel, java.lang.Integer.valueOf(i2), true));
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CHAT_ASSISTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.REQUEST_REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.LEARN_MORE_ABOUT_REFUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.GET_ANSWERS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.REPORT_PROBLEM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CONTACT_SELLER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CONTACT_SYNCHRONY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CANCEL_PAYMENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
