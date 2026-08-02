package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0017\u001aD\u0010\u0018\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a\u001c\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002\u001a\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0002\u001a\u001a\u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002\"\u000e\u0010!\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"ReviewHeader", "", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "uiAmount", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "selectedContact", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "intent", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "modifier", "Landroidx/compose/ui/Modifier;", "noteText", "", "showNote", "", "isPaymentLinkSelected", "receiveCurrencyCode", "isPAR", "onAmountClick", "Lkotlin/Function0;", "onDestinationClick", "onNoteClick", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "createHeaderData", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderData;", "resolveAmount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "resolveDestination", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination;", "resolveContactDestination", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/Destination$Contact;", "contact", "PaymentLinkDisplayName", "PayPalLogoUrl", "createHeaderConfig", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewHeaderKt {
    public static final java.lang.String PaymentLinkDisplayName = "PayPal Link";

    /* JADX WARN: Removed duplicated region for block: B:150:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewHeader(final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final androidx.compose.ui.Modifier modifier2;
        java.lang.String str3;
        final boolean z4;
        final boolean z5;
        final java.lang.String str4;
        final boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat;
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination destination;
        java.lang.String lastName;
        java.lang.String displayName;
        java.lang.String str5;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat2;
        boolean z7;
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(150062933);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(commonComponents) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(uiAmount) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(p2PContactItem) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(paymentTransferIntent.ordinal()) ? 2048 : 1024;
        }
        int i15 = i3 & 16;
        if (i15 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(str) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(str2) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i13 = i11;
            i14 = i3 & 4096;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i2 & 384) == 0) {
                i13 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    str3 = str;
                    z4 = z;
                    z5 = z2;
                    str4 = str2;
                    z6 = z3;
                    function04 = function0;
                    function05 = function02;
                    function06 = function03;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    str3 = i5 != 0 ? null : str;
                    boolean z8 = i6 != 0 ? false : z;
                    boolean z9 = i7 != 0 ? false : z2;
                    java.lang.String str6 = i8 != 0 ? null : str2;
                    boolean z10 = i9 != 0 ? false : z3;
                    if (i10 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function07 = function0;
                    }
                    if (i12 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function08 = function02;
                    }
                    if (i14 != 0) {
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        function09 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    } else {
                        function09 = function03;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(150062933, i4, i13, "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeader (ReviewHeader.kt:74)");
                    }
                    boolean z11 = (i4 & 112) == 32;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function012 = function07;
                    boolean z12 = (i4 & 896) == 256;
                    int i16 = i4 & 7168;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function013 = function08;
                    boolean z13 = i16 == 2048;
                    androidx.compose.ui.Modifier modifier3 = companion;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function014 = function09;
                    boolean z14 = (i4 & 234881024) == 67108864;
                    boolean z15 = z10;
                    boolean z16 = (29360128 & i4) == 8388608;
                    int i17 = i13;
                    boolean z17 = (458752 & i4) == 131072;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z16 | z12 | z11 | z13 | z14 | z17) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        int i18 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt.WhenMappings.$EnumSwitchMapping$0[paymentTransferIntent.ordinal()];
                        if (i18 != 1) {
                            if (i18 == 2) {
                                intent = com.paypal.oslo.feature.moneymovement.api.domain.Intent.REQUEST;
                                com.paypal.oslo.feature.moneymovement.api.domain.Intent intent2 = intent;
                                if (str6 == null && uiAmount != null) {
                                    com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
                                    com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money = uiAmount.getMoney();
                                    if (money == null || (fiat2 = money.getFiat()) == null || (str5 = fiat2.getQuantity()) == null) {
                                        str5 = "0";
                                    }
                                    fiat = companion2.fiat(str6, str5);
                                } else if (uiAmount != null || (fiat = uiAmount.getMoney()) == null) {
                                    fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "0");
                                }
                                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = fiat;
                                if (!z9) {
                                    destination = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Link(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.LOGO_URL_PAYPAL, "", PaymentLinkDisplayName);
                                } else if (p2PContactItem != null) {
                                    java.lang.String firstName = p2PContactItem.getFirstName();
                                    boolean z18 = (firstName == null || kotlin.text.StringsKt.isBlank(firstName)) && ((lastName = p2PContactItem.getLastName()) == null || kotlin.text.StringsKt.isBlank(lastName));
                                    if (!z18 || p2PContactItem.getPhoneNumber() == null) {
                                        displayName = (!z18 || p2PContactItem.getEmail() == null) ? com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ContactDisplayHelpersKt.getDisplayName(p2PContactItem.getFirstName(), p2PContactItem.getLastName()) : p2PContactItem.getEmail();
                                    } else {
                                        displayName = p2PContactItem.getPhoneNumber();
                                    }
                                    destination = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(z18 ? null : p2PContactItem.getAvatarUrl(), displayName != null ? displayName : "", z18 ? null : com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ContactDisplayHelpersKt.getInitials(p2PContactItem.getFirstName(), p2PContactItem.getLastName()));
                                } else {
                                    destination = null;
                                }
                                rememberedValue4 = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(intent2, moneyAmount, destination, str3 == null ? new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Note(null, str3) : null, null, null, null, 112, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else if (i18 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                        intent = com.paypal.oslo.feature.moneymovement.api.domain.Intent.SEND;
                        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent22 = intent;
                        if (str6 == null) {
                        }
                        if (uiAmount != null) {
                        }
                        fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "0");
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = fiat;
                        if (!z9) {
                        }
                        rememberedValue4 = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(intent22, moneyAmount2, destination, str3 == null ? new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Note(null, str3) : null, null, null, null, 112, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData) rememberedValue4;
                    boolean z19 = i16 == 2048;
                    boolean z20 = (3670016 & i4) == 1048576;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((z20 || z19) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        int i19 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt.WhenMappings.$EnumSwitchMapping$0[paymentTransferIntent.ordinal()];
                        z7 = true;
                        if (i19 != 1) {
                            if (i19 == 2) {
                                headerTrailing = com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FROM;
                                rememberedValue5 = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, true, z8, headerTrailing, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FOR, null, false, false, 225, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            } else if (i19 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                        headerTrailing = com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO;
                        rememberedValue5 = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, true, z8, headerTrailing, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FOR, null, false, false, 225, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        z7 = true;
                    }
                    com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig) rememberedValue5;
                    boolean z21 = (i17 & 14) == 4 ? z7 : false;
                    boolean z22 = (i17 & 112) == 32 ? z7 : false;
                    boolean z23 = (i17 & 896) == 256 ? z7 : false;
                    boolean z24 = (1879048192 & i4) == 536870912 ? z7 : false;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (((z21 | z22 | z23) || z24) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion companion3 = com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.INSTANCE;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function015 = z15 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        } : function012;
                        if (z15) {
                            function011 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            function010 = function014;
                        } else {
                            function010 = function014;
                            function011 = function013;
                        }
                        rememberedValue6 = companion3.invoke(function015, function011, function010);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    } else {
                        function010 = function014;
                    }
                    com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents.ComposeDefaultImpls.Header$default(headerConfig, headerData, (com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks) rememberedValue6, modifier3, commonComponents, startRestartGroup, ((i4 << 12) & 57344) | ((i4 >> 3) & 7168), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str4 = str6;
                    function06 = function010;
                    z5 = z9;
                    z4 = z8;
                    function04 = function012;
                    function05 = function013;
                    modifier2 = modifier3;
                    z6 = z15;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str7 = str3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt.$r8$lambda$7VROlkmQ0SZHErlSqeqCfrQjeeQ(com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents.this, uiAmount, p2PContactItem, paymentTransferIntent, modifier2, str7, z4, z5, str4, z6, function04, function05, function06, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i13 = i11;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7VROlkmQ0SZHErlSqeqCfrQjeeQ(com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        ReviewHeader(commonComponents, uiAmount, p2PContactItem, paymentTransferIntent, modifier, str, z, z2, str2, z3, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
