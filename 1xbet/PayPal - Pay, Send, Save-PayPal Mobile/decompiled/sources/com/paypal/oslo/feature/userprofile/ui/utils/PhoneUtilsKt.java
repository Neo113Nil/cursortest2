package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "phone", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "allPhones", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/BottomSheetOption;", "preparePhoneOptions", "(Landroid/content/Context;Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "", "toToastMessage", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;Landroid/content/Context;)Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/PhoneType;", "phoneType", "mapPhoneTypeToCategory", "(Lcom/paypal/oslo/core/userstore/model/PhoneType;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneUtilsKt {
    public static final java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> preparePhoneOptions(android.content.Context context, final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (!profilePhone.getConfirmed() && profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.MOBILE) {
            com.paypal.pds.core.Icon.Check check = com.paypal.pds.core.Icon.Check.INSTANCE;
            java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_confirm_button);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(check, string, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.m20584$r8$lambda$WDAMEa5iDqprtVOLmezwLQib2g(com.paypal.oslo.core.userstore.model.ProfilePhone.this, appNavigator);
                }
            }));
        }
        com.paypal.pds.core.Icon.Pencil pencil = com.paypal.pds.core.Icon.Pencil.INSTANCE;
        java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_edit);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(pencil, string2, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.$r8$lambda$sNcMB40vhWlFS6QdlqPtPpUZ8Hs(com.paypal.oslo.core.userstore.model.ProfilePhone.this, appNavigator);
            }
        }));
        if (!profilePhone.getPrimary()) {
            java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) it.next();
                    if (profilePhone2.getPrimary() && profilePhone2.getType() == profilePhone.getType()) {
                        if (profilePhone.getType() != com.paypal.oslo.core.userstore.model.PhoneType.MOBILE || profilePhone.getConfirmed()) {
                            com.paypal.pds.core.Icon.Star star = com.paypal.pds.core.Icon.Star.INSTANCE;
                            java.lang.String string3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_make_primary);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(star, string3, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.m20583$r8$lambda$0q3OChsSUNNrWfwnwEdXOY8zBg(com.paypal.oslo.core.userstore.model.ProfilePhone.this, appNavigator);
                                }
                            }));
                        }
                    }
                }
            }
        }
        if (!profilePhone.getPrimary()) {
            com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
            java.lang.String string4 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_remove);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(trash, string4, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.m20585$r8$lambda$i19jc50zWzSXY4rEhShcMg3E5o(com.paypal.oslo.core.userstore.model.ProfilePhone.this, appNavigator);
                }
            }));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static final java.lang.String toToastMessage(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int i = com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.WhenMappings.$EnumSwitchMapping$0[phoneAction.ordinal()];
        if (i == 1) {
            java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_phone_success_toast);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (i == 2) {
            java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_edit_phone_success);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (i == 3) {
            java.lang.String string3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_delete_phone_success);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (i == 4) {
            java.lang.String string4 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_make_primary_phone_success);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String string5 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_you_confirmed_your_phone);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
        return string5;
    }

    public static final java.lang.String mapPhoneTypeToCategory(com.paypal.oslo.core.userstore.model.PhoneType phoneType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneType, "");
        int i = com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.WhenMappings.$EnumSwitchMapping$1[phoneType.ordinal()];
        if (i == 1) {
            return "Mobile";
        }
        if (i != 2) {
            return i != 3 ? "Mobile" : com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.WORK;
        }
        return com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME;
    }

    /* renamed from: $r8$lambda$-XWGQoNlNgNQ54QE6QuBaSPjhIE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20582$r8$lambda$XWGQoNlNgNQ54QE6QuBaSPjhIE(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination(profilePhone.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0q3OChsSUNNrWfwn-wEdXOY8zBg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20583$r8$lambda$0q3OChsSUNNrWfwnwEdXOY8zBg(final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Set as Primary clicked:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", profilePhone.getId())), null, 4, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.m20582$r8$lambda$XWGQoNlNgNQ54QE6QuBaSPjhIE(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NcaahWS_GOUmxUypurZZn1lxkpg(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination(profilePhone.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WDAMEa5iDqprtVOLmezwLQi-b2g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20584$r8$lambda$WDAMEa5iDqprtVOLmezwLQib2g(final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Confirm clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", profilePhone.getId())), null, 4, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.$r8$lambda$mMBemNIBxXMPSNKPFcgqPpsqepM(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WK8wt36U3q_Yue1LDgBnrVqnKW4(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination(profilePhone.getId()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i19jc50-zWzSXY4rEhShcMg3E5o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20585$r8$lambda$i19jc50zWzSXY4rEhShcMg3E5o(final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Delete phone clicked:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", profilePhone.getId())), null, 4, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.$r8$lambda$WK8wt36U3q_Yue1LDgBnrVqnKW4(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mMBemNIBxXMPSNKPFcgqPpsqepM(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination(profilePhone.getId(), profilePhone.getMaskedPhoneNumber()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sNcMB40vhWlFS6QdlqPtPpUZ8Hs(final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        if (profilePhone.getPrimary()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Edit primary phone clicked:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", profilePhone.getId())), null, 4, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.$r8$lambda$NcaahWS_GOUmxUypurZZn1lxkpg(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Edit non-primary phone clicked: ".concat(java.lang.String.valueOf(profilePhone.getId())), null, null, 6, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.$r8$lambda$yOWFUlbiit9zTiNIhl6hKNW4EBU(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yOWFUlbiit9zTiNIhl6hKNW4EBU(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination(profilePhone.getId()));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.EDIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.DELETE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.MAKE_PRIMARY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.RESEND_CONFIRMATION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.core.userstore.model.PhoneType.values().length];
            try {
                iArr2[com.paypal.oslo.core.userstore.model.PhoneType.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.core.userstore.model.PhoneType.HOME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.core.userstore.model.PhoneType.WORK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
