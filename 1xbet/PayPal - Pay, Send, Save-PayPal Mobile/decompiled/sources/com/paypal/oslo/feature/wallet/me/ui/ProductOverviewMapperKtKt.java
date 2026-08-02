package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\f\u0010\u000f\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\f\u0010\u0011\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\f\u0010\u0013\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0014H\u0000¢\u0006\u0004\b\f\u0010\u0015\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0017\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0018H\u0000¢\u0006\u0004\b\f\u0010\u0019\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u001b\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u001cH\u0000¢\u0006\u0004\b\u0004\u0010\u001d\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview;", "asProductOverview", "(Lcom/paypal/oslo/feature/wallet/me/domain/Product;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProduct;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "asProductOverviewDetailsItem", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;", "(Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;)Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "(Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;)Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsProduct;)Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;", "(Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductOverviewMapperKtKt {
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.Product<?> product, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) product, formatCurrencyUseCase, continuation);
        }
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) product, formatCurrencyUseCase, continuation);
        }
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct) product, formatCurrencyUseCase, continuation);
        }
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) product, formatCurrencyUseCase, continuation);
        }
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsProduct) product);
        }
        if (product instanceof com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) {
            return asProductOverview((com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) product, formatCurrencyUseCase, continuation);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.paypal.oslo.feature.wallet.me.ui.ProductOverview$Action[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.paypal.oslo.feature.wallet.me.ui.ProductOverview$Action] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct balanceProduct, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$2 productOverviewMapperKtKt$asProductOverview$2;
        int i;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview;
        boolean z;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action action;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action action2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$2) {
            productOverviewMapperKtKt$asProductOverview$2 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$2) continuation;
            if ((productOverviewMapperKtKt$asProductOverview$2.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverview$2.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverview$2.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverview$2.getOutputMinFrameDuration;
                java.util.List list = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview data = balanceProduct.getData();
                    if (data == null) {
                        return null;
                    }
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type2 = com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_balance_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, null, com.paypal.pds.core.Color.Unspecified.INSTANCE, data.getCardImageUrl(), 4, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_paypal_balance, new java.lang.Object[0]);
                    com.paypal.oslo.feature.wallet.common.domain.model.Money balance = data.getBalance();
                    productOverviewMapperKtKt$asProductOverview$2.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceProduct);
                    productOverviewMapperKtKt$asProductOverview$2.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    productOverviewMapperKtKt$asProductOverview$2.getHighResolutionOutputSizeshNQ4ISI = data;
                    productOverviewMapperKtKt$asProductOverview$2.getHighSpeedVideoFpsRanges = stringResourceRef;
                    productOverviewMapperKtKt$asProductOverview$2.getInputFormats = icon2;
                    productOverviewMapperKtKt$asProductOverview$2.getOutputFormats = type2;
                    productOverviewMapperKtKt$asProductOverview$2.Camera2StreamConfigurationMap = 0;
                    productOverviewMapperKtKt$asProductOverview$2.getOutputMinFrameDuration = 1;
                    java.lang.Object asFormatted = balance.asFormatted(formatCurrencyUseCase, productOverviewMapperKtKt$asProductOverview$2);
                    if (asFormatted == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    icon = icon2;
                    refText = stringResourceRef;
                    type = type2;
                    obj = asFormatted;
                    balanceOverview = data;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = productOverviewMapperKtKt$asProductOverview$2.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type3 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$2.getOutputFormats;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$2.getInputFormats;
                    com.paypal.oslo.core.commonui.utils.RefText refText2 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$2.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview2 = (com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview) productOverviewMapperKtKt$asProductOverview$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    icon = icon3;
                    refText = refText2;
                    balanceOverview = balanceOverview2;
                    type = type3;
                }
                com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[0]), null, null, null, 28, null);
                z = !balanceOverview.getSupportsAccountInfo() || balanceOverview.getSupportsAddMoney() || balanceOverview.getSupportsTransfers();
                if (!z) {
                    ?? r2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action[3];
                    boolean supportsAddMoney = balanceOverview.getSupportsAddMoney();
                    if (supportsAddMoney) {
                        action = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.BALANCE_ADD_MONEY, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_balance_add_money, new java.lang.Object[0]), com.paypal.pds.core.Icon.MoneyBill.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_balance_add_money, new java.lang.Object[0]));
                    } else {
                        if (supportsAddMoney) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        action = null;
                    }
                    r2[0] = action;
                    boolean supportsTransfers = balanceOverview.getSupportsTransfers();
                    if (supportsTransfers) {
                        action2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.BALANCE_TRANSFER, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_transfer, new java.lang.Object[0]), com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_transfer, new java.lang.Object[0]));
                    } else {
                        if (supportsTransfers) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        action2 = null;
                    }
                    r2[1] = action2;
                    boolean supportsAccountInfo = balanceOverview.getSupportsAccountInfo();
                    if (supportsAccountInfo) {
                        list = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.BALANCE_ACCOUNT_INFO, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_account_info, new java.lang.Object[0]), com.paypal.pds.core.Icon.Info.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_account_info, new java.lang.Object[0]));
                    } else if (supportsAccountInfo) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    r2[2] = list;
                    list = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) r2);
                } else if (z) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type, icon, refText, null, balance2, null, null, list, false, 360, null);
            }
        }
        productOverviewMapperKtKt$asProductOverview$2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$2(continuation);
        java.lang.Object obj2 = productOverviewMapperKtKt$asProductOverview$2.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverview$2.getOutputMinFrameDuration;
        java.util.List list2 = null;
        if (i != 0) {
        }
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance22 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj2), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[0]), null, null, null, 28, null);
        if (balanceOverview.getSupportsAccountInfo()) {
        }
        if (!z) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type, icon, refText, null, balance22, null, null, list2, false, 360, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x046e -> B:14:0x0481). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4 productOverviewMapperKtKt$asProductOverview$4;
        int i;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        int i2;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct2;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        int i3;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus status;
        kotlin.time.Duration duration;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        java.lang.Object[] objArr;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase2;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        int i4;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        java.lang.Object[] objArr2;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type2;
        int i5;
        com.paypal.oslo.core.commonui.utils.RefText refText3;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct3;
        com.paypal.oslo.core.commonui.utils.RefText refText4;
        com.paypal.oslo.core.commonui.utils.RefText refText5;
        com.paypal.oslo.core.commonui.utils.RefText refText6;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct4;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview2;
        int i6;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2;
        com.paypal.oslo.core.commonui.utils.RefText refText7;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type3;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct5;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview3;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase3;
        int i7;
        com.paypal.oslo.core.commonui.utils.RefText refText8;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3;
        com.paypal.oslo.core.commonui.utils.RefText refText9;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type4;
        int i8;
        java.lang.Object[] objArr5;
        java.lang.Object[] objArr6;
        int i9;
        int i10;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef3;
        com.paypal.oslo.core.commonui.utils.RefText refText10;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type5;
        com.paypal.oslo.core.commonui.utils.RefText refText11;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct6;
        com.paypal.oslo.core.commonui.utils.RefText refText12;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus status2;
        com.paypal.pds.core.Color.ContentRoleBaseWarning contentRoleBaseWarning;
        boolean isEmpty;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type6;
        com.paypal.oslo.core.commonui.utils.RefText refText13;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon4;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview4;
        int i11;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type7;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4 productOverviewMapperKtKt$asProductOverview$42;
        int i12;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase4;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct7;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon5;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance2;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef4;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase5 = formatCurrencyUseCase;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4) {
            productOverviewMapperKtKt$asProductOverview$4 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4) continuation;
            if ((productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI -= 2147483648;
                java.lang.Object obj3 = productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview data = bnplProduct.getData();
                    if (data == null) {
                        return null;
                    }
                    type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.BUY_NOW_PAY_LATER;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon6 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.Calendar.INSTANCE, com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, null, 16, null);
                    i2 = 0;
                    stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later, new java.lang.Object[0]);
                    com.paypal.oslo.feature.wallet.common.domain.model.Money totalRemainingBalance = data.getTotalRemainingBalance();
                    productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplProduct);
                    productOverviewMapperKtKt$asProductOverview$4.getInputFormats = formatCurrencyUseCase5;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputSizes = data;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM = stringResourceRef;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM = icon6;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration = type;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges = 0;
                    productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI = 1;
                    java.lang.Object asFormatted = totalRemainingBalance.asFormatted(formatCurrencyUseCase5, productOverviewMapperKtKt$asProductOverview$4);
                    if (asFormatted != coroutine_suspended) {
                        bnplProduct2 = bnplProduct;
                        bnplOverview = data;
                        obj3 = asFormatted;
                        icon = icon6;
                        i3 = 0;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    int i13 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges;
                    type = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon7 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM;
                    stringResourceRef = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview5 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) productOverviewMapperKtKt$asProductOverview$4.getOutputSizes;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase6 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$4.getInputFormats;
                    bnplProduct2 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    bnplOverview = bnplOverview5;
                    i2 = 0;
                    i3 = i13;
                    formatCurrencyUseCase5 = formatCurrencyUseCase6;
                    icon = icon7;
                } else if (i == 2) {
                    i9 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor;
                    i10 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes;
                    i3 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges;
                    refText8 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.unwrapAs;
                    objArr5 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.toString;
                    refText = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI;
                    type4 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI;
                    icon3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration;
                    refText9 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM;
                    objArr6 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM;
                    bnplOverview3 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) productOverviewMapperKtKt$asProductOverview$4.getOutputSizes;
                    formatCurrencyUseCase3 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$4.getInputFormats;
                    bnplProduct5 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    objArr5[i10] = obj3;
                    stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i9, objArr6);
                    refText10 = stringResourceRef3;
                    type5 = type4;
                    refText11 = refText9;
                    formatCurrencyUseCase5 = formatCurrencyUseCase3;
                    bnplProduct6 = bnplProduct5;
                    icon = icon3;
                    bnplOverview = bnplOverview3;
                    refText12 = refText8;
                    refText4 = refText10;
                    type3 = type5;
                    refText5 = refText11;
                    refText6 = refText12;
                    bnplProduct4 = bnplProduct6;
                    bnplOverview2 = bnplOverview;
                    i6 = i3;
                    refText7 = refText;
                    icon2 = icon;
                    status2 = bnplOverview2.getStatus();
                    if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                    }
                    contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance3 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                    isEmpty = bnplOverview2.getPlans().isEmpty();
                    if (!(!isEmpty)) {
                    }
                } else if (i == 3) {
                    i7 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor;
                    i8 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes;
                    i3 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges;
                    refText8 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.unwrapAs;
                    objArr3 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.toString;
                    refText = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI;
                    type4 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI;
                    icon3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration;
                    refText9 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM;
                    objArr4 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM;
                    bnplOverview3 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) productOverviewMapperKtKt$asProductOverview$4.getOutputSizes;
                    formatCurrencyUseCase3 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$4.getInputFormats;
                    bnplProduct5 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    objArr3[i8] = obj3;
                    stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i7, objArr4);
                    refText10 = stringResourceRef3;
                    type5 = type4;
                    refText11 = refText9;
                    formatCurrencyUseCase5 = formatCurrencyUseCase3;
                    bnplProduct6 = bnplProduct5;
                    icon = icon3;
                    bnplOverview = bnplOverview3;
                    refText12 = refText8;
                    refText4 = refText10;
                    type3 = type5;
                    refText5 = refText11;
                    refText6 = refText12;
                    bnplProduct4 = bnplProduct6;
                    bnplOverview2 = bnplOverview;
                    i6 = i3;
                    refText7 = refText;
                    icon2 = icon;
                    status2 = bnplOverview2.getStatus();
                    if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                    }
                    contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance32 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                    isEmpty = bnplOverview2.getPlans().isEmpty();
                    if (!(!isEmpty)) {
                    }
                } else if (i == 4) {
                    i4 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor;
                    i5 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes;
                    i3 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges;
                    refText2 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.unwrapAs;
                    objArr2 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.toString;
                    refText = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI;
                    type2 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI;
                    icon = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration;
                    refText3 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM;
                    objArr = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM;
                    bnplOverview = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) productOverviewMapperKtKt$asProductOverview$4.getOutputSizes;
                    formatCurrencyUseCase2 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$4.getInputFormats;
                    bnplProduct3 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    objArr2[i5] = obj3;
                    refText10 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i4, objArr);
                    type5 = type2;
                    formatCurrencyUseCase5 = formatCurrencyUseCase2;
                    refText12 = refText2;
                    com.paypal.oslo.core.commonui.utils.RefText refText14 = refText3;
                    bnplProduct6 = bnplProduct3;
                    refText11 = refText14;
                    refText4 = refText10;
                    type3 = type5;
                    refText5 = refText11;
                    refText6 = refText12;
                    bnplProduct4 = bnplProduct6;
                    bnplOverview2 = bnplOverview;
                    i6 = i3;
                    refText7 = refText;
                    icon2 = icon;
                    status2 = bnplOverview2.getStatus();
                    if (!(status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) || (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday) || (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard)) {
                        contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                    } else if ((status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending) || (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified)) {
                        contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
                    } else {
                        if (!(status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate) && status2 != null) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        contentRoleBaseWarning = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    }
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance322 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                    isEmpty = bnplOverview2.getPlans().isEmpty();
                    if (!(!isEmpty)) {
                        if (!isEmpty) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        type6 = type3;
                        refText13 = refText5;
                        icon4 = icon2;
                        balance = balance322;
                        details = null;
                        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type6, icon4, refText13, null, balance, null, details, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
                    }
                    java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> plans = bnplOverview2.getPlans();
                    obj = plans;
                    obj2 = obj;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plans, 10));
                    it = plans.iterator();
                    bnplOverview4 = bnplOverview2;
                    i11 = 0;
                    type7 = type3;
                    productOverviewMapperKtKt$asProductOverview$42 = productOverviewMapperKtKt$asProductOverview$4;
                    i12 = 0;
                    formatCurrencyUseCase4 = formatCurrencyUseCase5;
                    bnplProduct7 = bnplProduct4;
                    icon5 = icon2;
                    balance2 = balance322;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = productOverviewMapperKtKt$asProductOverview$4.getHighResolutionOutputSizeshNQ4ISI;
                    int i15 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor;
                    int i16 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes;
                    int i17 = productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges;
                    ?? r7 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$4.getInputSizeshNQ4ISI;
                    java.lang.Object obj4 = productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDuration;
                    java.util.Iterator it2 = (java.util.Iterator) productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizesFor;
                    ?? r9 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$4.unwrapAs;
                    java.lang.Object obj5 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$4.toString;
                    com.paypal.oslo.core.commonui.utils.RefText refText15 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance4 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance) productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon8 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type8 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM;
                    java.lang.Object obj6 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview6 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) productOverviewMapperKtKt$asProductOverview$4.getOutputSizes;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase7 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$4.getInputFormats;
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct8 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance5 = balance4;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon9 = icon8;
                    int i18 = i17;
                    com.paypal.oslo.core.commonui.utils.RefText refText16 = refText15;
                    int i19 = i16;
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview7 = bnplOverview6;
                    int i20 = i15;
                    java.lang.Object obj7 = obj6;
                    java.util.Iterator it3 = it2;
                    java.util.ArrayList arrayList2 = r7;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type9 = type8;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4 productOverviewMapperKtKt$asProductOverview$43 = productOverviewMapperKtKt$asProductOverview$4;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase8 = formatCurrencyUseCase7;
                    com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct9 = bnplProduct8;
                    java.lang.Object obj8 = coroutine_suspended;
                    java.lang.Object asProductOverviewDetailsItem = obj3;
                    java.util.ArrayList arrayList3 = r9;
                    arrayList2.add((com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item) asProductOverviewDetailsItem);
                    coroutine_suspended = obj8;
                    bnplProduct7 = bnplProduct9;
                    formatCurrencyUseCase4 = formatCurrencyUseCase8;
                    i12 = i20;
                    productOverviewMapperKtKt$asProductOverview$42 = productOverviewMapperKtKt$asProductOverview$43;
                    i11 = i19;
                    type7 = type9;
                    arrayList = arrayList3;
                    it = it3;
                    obj2 = obj7;
                    obj = obj5;
                    bnplOverview4 = bnplOverview7;
                    i6 = i18;
                    refText5 = refText16;
                    balance2 = balance5;
                    icon5 = icon9;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        java.lang.Object obj9 = coroutine_suspended;
                        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan bnplPlan = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan) next;
                        int i21 = i12;
                        productOverviewMapperKtKt$asProductOverview$42.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplProduct7);
                        productOverviewMapperKtKt$asProductOverview$42.getInputFormats = formatCurrencyUseCase4;
                        productOverviewMapperKtKt$asProductOverview$42.getOutputSizes = bnplOverview4;
                        productOverviewMapperKtKt$asProductOverview$42.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        productOverviewMapperKtKt$asProductOverview$42.getOutputStallDurationlomOqCM = type7;
                        productOverviewMapperKtKt$asProductOverview$42.getOutputStallDuration = icon5;
                        productOverviewMapperKtKt$asProductOverview$42.getOutputSizeshNQ4ISI = balance2;
                        productOverviewMapperKtKt$asProductOverview$42.isOutputSupportedForhNQ4ISI = refText5;
                        productOverviewMapperKtKt$asProductOverview$42.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        productOverviewMapperKtKt$asProductOverview$42.unwrapAs = arrayList;
                        productOverviewMapperKtKt$asProductOverview$42.getHighSpeedVideoSizesFor = it;
                        productOverviewMapperKtKt$asProductOverview$42.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        productOverviewMapperKtKt$asProductOverview$42.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplPlan);
                        productOverviewMapperKtKt$asProductOverview$42.getInputSizeshNQ4ISI = arrayList;
                        productOverviewMapperKtKt$asProductOverview$42.getHighSpeedVideoFpsRanges = i6;
                        productOverviewMapperKtKt$asProductOverview$42.getHighSpeedVideoSizes = i11;
                        productOverviewMapperKtKt$asProductOverview$42.getHighSpeedVideoFpsRangesFor = i21;
                        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct10 = bnplProduct7;
                        productOverviewMapperKtKt$asProductOverview$42.getHighResolutionOutputSizeshNQ4ISI = 0;
                        productOverviewMapperKtKt$asProductOverview$42.getValidOutputFormatsForInputhNQ4ISI = 5;
                        asProductOverviewDetailsItem = asProductOverviewDetailsItem(bnplPlan, formatCurrencyUseCase4, productOverviewMapperKtKt$asProductOverview$42);
                        obj8 = obj9;
                        if (asProductOverviewDetailsItem == obj8) {
                            return obj8;
                        }
                        balance5 = balance2;
                        icon9 = icon5;
                        i18 = i6;
                        refText16 = refText5;
                        obj5 = obj;
                        bnplOverview7 = bnplOverview4;
                        java.util.ArrayList arrayList4 = arrayList;
                        obj7 = obj2;
                        it3 = it;
                        arrayList2 = arrayList4;
                        type9 = type7;
                        i19 = i11;
                        productOverviewMapperKtKt$asProductOverview$43 = productOverviewMapperKtKt$asProductOverview$42;
                        i20 = i21;
                        formatCurrencyUseCase8 = formatCurrencyUseCase4;
                        bnplProduct9 = bnplProduct10;
                        arrayList3 = arrayList4;
                        arrayList2.add((com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item) asProductOverviewDetailsItem);
                        coroutine_suspended = obj8;
                        bnplProduct7 = bnplProduct9;
                        formatCurrencyUseCase4 = formatCurrencyUseCase8;
                        i12 = i20;
                        productOverviewMapperKtKt$asProductOverview$42 = productOverviewMapperKtKt$asProductOverview$43;
                        i11 = i19;
                        type7 = type9;
                        arrayList = arrayList3;
                        it = it3;
                        obj2 = obj7;
                        obj = obj5;
                        bnplOverview4 = bnplOverview7;
                        i6 = i18;
                        refText5 = refText16;
                        balance2 = balance5;
                        icon5 = icon9;
                        if (it.hasNext()) {
                            java.util.ArrayList arrayList5 = arrayList;
                            boolean z = bnplOverview4.getPlans().size() == 1;
                            if (z) {
                                stringResourceRef4 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_1_plan, kotlin.coroutines.jvm.internal.Boxing.boxInt(bnplOverview4.getPlans().size()));
                            } else {
                                if (z) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                stringResourceRef4 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_n_plans, kotlin.coroutines.jvm.internal.Boxing.boxInt(bnplOverview4.getPlans().size()));
                            }
                            type6 = type7;
                            details = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details(stringResourceRef4, null, arrayList5, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_see_all_plans, new java.lang.Object[0]), false, false, 50, null);
                            refText13 = refText5;
                            balance = balance2;
                            icon4 = icon5;
                            return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type6, icon4, refText13, null, balance, null, details, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
                        }
                    }
                }
                com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj3);
                com.paypal.oslo.core.commonui.utils.RefText stringResourceRef5 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[i2]);
                status = bnplOverview.getStatus();
                if (!(status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek)) {
                    int i22 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_due_this_week;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue = ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) bnplOverview.getStatus()).getAmountDue();
                    productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplProduct2);
                    productOverviewMapperKtKt$asProductOverview$4.getInputFormats = formatCurrencyUseCase5;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputSizes = bnplOverview;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM = objArr7;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM = stringResourceRef;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration = icon;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI = type;
                    productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI = stringRef;
                    productOverviewMapperKtKt$asProductOverview$4.toString = objArr7;
                    productOverviewMapperKtKt$asProductOverview$4.unwrapAs = stringResourceRef5;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges = i3;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes = 0;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor = i22;
                    productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI = 2;
                    java.lang.Object asFormatted2 = amountDue.asFormatted(formatCurrencyUseCase5, productOverviewMapperKtKt$asProductOverview$4);
                    if (asFormatted2 != coroutine_suspended) {
                        refText = stringRef;
                        obj3 = asFormatted2;
                        bnplProduct5 = bnplProduct2;
                        objArr5 = objArr7;
                        objArr6 = objArr5;
                        bnplOverview3 = bnplOverview;
                        formatCurrencyUseCase3 = formatCurrencyUseCase5;
                        i9 = i22;
                        refText8 = stringResourceRef5;
                        icon3 = icon;
                        refText9 = stringResourceRef;
                        type4 = type;
                        i10 = 0;
                        objArr5[i10] = obj3;
                        stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i9, objArr6);
                        refText10 = stringResourceRef3;
                        type5 = type4;
                        refText11 = refText9;
                        formatCurrencyUseCase5 = formatCurrencyUseCase3;
                        bnplProduct6 = bnplProduct5;
                        icon = icon3;
                        bnplOverview = bnplOverview3;
                        refText12 = refText8;
                        refText4 = refText10;
                        type3 = type5;
                        refText5 = refText11;
                        refText6 = refText12;
                        bnplProduct4 = bnplProduct6;
                        bnplOverview2 = bnplOverview;
                        i6 = i3;
                        refText7 = refText;
                        icon2 = icon;
                        status2 = bnplOverview2.getStatus();
                        if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                        }
                        contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance3222 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                        isEmpty = bnplOverview2.getPlans().isEmpty();
                        if (!(!isEmpty)) {
                        }
                    }
                } else if (status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday) {
                    int i23 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_due_today;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue2 = ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday) bnplOverview.getStatus()).getAmountDue();
                    productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplProduct2);
                    productOverviewMapperKtKt$asProductOverview$4.getInputFormats = formatCurrencyUseCase5;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputSizes = bnplOverview;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM = objArr8;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM = stringResourceRef;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration = icon;
                    productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI = type;
                    productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI = stringRef;
                    productOverviewMapperKtKt$asProductOverview$4.toString = objArr8;
                    productOverviewMapperKtKt$asProductOverview$4.unwrapAs = stringResourceRef5;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges = i3;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes = 0;
                    productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor = i23;
                    productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI = 3;
                    java.lang.Object asFormatted3 = amountDue2.asFormatted(formatCurrencyUseCase5, productOverviewMapperKtKt$asProductOverview$4);
                    if (asFormatted3 != coroutine_suspended) {
                        refText = stringRef;
                        obj3 = asFormatted3;
                        bnplProduct5 = bnplProduct2;
                        objArr3 = objArr8;
                        objArr4 = objArr3;
                        bnplOverview3 = bnplOverview;
                        formatCurrencyUseCase3 = formatCurrencyUseCase5;
                        i7 = i23;
                        refText8 = stringResourceRef5;
                        icon3 = icon;
                        refText9 = stringResourceRef;
                        type4 = type;
                        i8 = 0;
                        objArr3[i8] = obj3;
                        stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i7, objArr4);
                        refText10 = stringResourceRef3;
                        type5 = type4;
                        refText11 = refText9;
                        formatCurrencyUseCase5 = formatCurrencyUseCase3;
                        bnplProduct6 = bnplProduct5;
                        icon = icon3;
                        bnplOverview = bnplOverview3;
                        refText12 = refText8;
                        refText4 = refText10;
                        type3 = type5;
                        refText5 = refText11;
                        refText6 = refText12;
                        bnplProduct4 = bnplProduct6;
                        bnplOverview2 = bnplOverview;
                        i6 = i3;
                        refText7 = refText;
                        icon2 = icon;
                        status2 = bnplOverview2.getStatus();
                        if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                        }
                        contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance32222 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                        isEmpty = bnplOverview2.getPlans().isEmpty();
                        if (!(!isEmpty)) {
                        }
                    }
                } else {
                    if (status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending) {
                        boolean hasMultiplePendingPlans = ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending) bnplOverview.getStatus()).getHasMultiplePendingPlans();
                        if (hasMultiplePendingPlans) {
                            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_plans_have_not_started, new java.lang.Object[0]);
                        } else {
                            if (hasMultiplePendingPlans) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_bnpl_plan_has_not_started, new java.lang.Object[0]);
                        }
                    } else if (status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified) {
                        int i24 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later_spending_power;
                        objArr = new java.lang.Object[1];
                        com.paypal.oslo.feature.wallet.common.domain.model.Money spendingPower = ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified) bnplOverview.getStatus()).getSpendingPower();
                        productOverviewMapperKtKt$asProductOverview$4.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplProduct2);
                        productOverviewMapperKtKt$asProductOverview$4.getInputFormats = formatCurrencyUseCase5;
                        productOverviewMapperKtKt$asProductOverview$4.getOutputSizes = bnplOverview;
                        productOverviewMapperKtKt$asProductOverview$4.getOutputMinFrameDurationlomOqCM = objArr;
                        productOverviewMapperKtKt$asProductOverview$4.getOutputStallDurationlomOqCM = stringResourceRef;
                        productOverviewMapperKtKt$asProductOverview$4.getOutputStallDuration = icon;
                        productOverviewMapperKtKt$asProductOverview$4.getOutputSizeshNQ4ISI = type;
                        productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedForhNQ4ISI = stringRef;
                        productOverviewMapperKtKt$asProductOverview$4.toString = objArr;
                        productOverviewMapperKtKt$asProductOverview$4.unwrapAs = stringResourceRef5;
                        productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRanges = i3;
                        productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoSizes = 0;
                        productOverviewMapperKtKt$asProductOverview$4.getHighSpeedVideoFpsRangesFor = i24;
                        productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI = 4;
                        java.lang.Object asFormatted4 = spendingPower.asFormatted(formatCurrencyUseCase5, productOverviewMapperKtKt$asProductOverview$4);
                        if (asFormatted4 != coroutine_suspended) {
                            formatCurrencyUseCase2 = formatCurrencyUseCase5;
                            refText = stringRef;
                            obj3 = asFormatted4;
                            i4 = i24;
                            refText2 = stringResourceRef5;
                            objArr2 = objArr;
                            type2 = type;
                            i5 = 0;
                            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct bnplProduct11 = bnplProduct2;
                            refText3 = stringResourceRef;
                            bnplProduct3 = bnplProduct11;
                            objArr2[i5] = obj3;
                            refText10 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i4, objArr);
                            type5 = type2;
                            formatCurrencyUseCase5 = formatCurrencyUseCase2;
                            refText12 = refText2;
                            com.paypal.oslo.core.commonui.utils.RefText refText142 = refText3;
                            bnplProduct6 = bnplProduct3;
                            refText11 = refText142;
                            refText4 = refText10;
                            type3 = type5;
                            refText5 = refText11;
                            refText6 = refText12;
                            bnplProduct4 = bnplProduct6;
                            bnplOverview2 = bnplOverview;
                            i6 = i3;
                            refText7 = refText;
                            icon2 = icon;
                            status2 = bnplOverview2.getStatus();
                            if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                            }
                            contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                            com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance322222 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                            isEmpty = bnplOverview2.getPlans().isEmpty();
                            if (!(!isEmpty)) {
                            }
                        }
                    } else {
                        if (status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard) {
                            try {
                                duration = kotlin.time.Duration.m23940boximpl(kotlin.time.Duration.INSTANCE.m24012parseUwyO8pc(((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard) bnplOverview.getStatus()).getValidityDuration()));
                            } catch (java.lang.Exception unused) {
                                duration = null;
                            }
                            if (duration != null) {
                                if (kotlin.time.Duration.m23951getInWholeHoursimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) > 0) {
                                    stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(kotlin.time.Duration.m23951getInWholeHoursimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) == 1 ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_duration_n_hour : com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_duration_n_hours, java.lang.String.valueOf(kotlin.time.Duration.m23951getInWholeHoursimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI())));
                                } else if (kotlin.time.Duration.m23954getInWholeMinutesimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) > 0) {
                                    stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(kotlin.time.Duration.m23954getInWholeMinutesimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) == 1 ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_duration_n_minute : com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_duration_n_minutes, java.lang.String.valueOf(kotlin.time.Duration.m23954getInWholeMinutesimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI())));
                                }
                            }
                        } else if (!(status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate) && status != null) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        stringResourceRef2 = null;
                    }
                    refText4 = stringResourceRef2;
                    refText5 = stringResourceRef;
                    refText6 = stringResourceRef5;
                    bnplProduct4 = bnplProduct2;
                    bnplOverview2 = bnplOverview;
                    i6 = i3;
                    icon2 = icon;
                    refText7 = stringRef;
                    type3 = type;
                    status2 = bnplOverview2.getStatus();
                    if (status2 instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) {
                    }
                    contentRoleBaseWarning = com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance3222222 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText7, refText6, refText4, contentRoleBaseWarning, null, 16, null);
                    isEmpty = bnplOverview2.getPlans().isEmpty();
                    if (!(!isEmpty)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        productOverviewMapperKtKt$asProductOverview$4 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4(continuation);
        java.lang.Object obj32 = productOverviewMapperKtKt$asProductOverview$4.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverview$4.getValidOutputFormatsForInputhNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj32);
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef52 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[i2]);
        status = bnplOverview.getStatus();
        if (!(status instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek)) {
        }
        return coroutine_suspended2;
    }

    public static final java.lang.Object asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan bnplPlan, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item> continuation) {
        if (bnplPlan instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete) {
            return asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete) bnplPlan, formatCurrencyUseCase, continuation);
        }
        if (bnplPlan instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack) {
            return asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack) bnplPlan, formatCurrencyUseCase, continuation);
        }
        if (bnplPlan instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue) {
            return asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue) bnplPlan, formatCurrencyUseCase, continuation);
        }
        if (bnplPlan instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending) {
            return asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending) bnplPlan);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete almostComplete, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$2 productOverviewMapperKtKt$asProductOverviewDetailsItem$2;
        int i;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        java.lang.String str;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$2) {
            productOverviewMapperKtKt$asProductOverviewDetailsItem$2 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$2) continuation;
            if ((productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String accountId = almostComplete.getAccountId();
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.BNPL_PLAN;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.pds.core.Icon.Store.INSTANCE, null, null, null, 28, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(almostComplete.getMerchantName());
                    com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(almostComplete.getProduct());
                    com.paypal.oslo.feature.wallet.common.domain.model.Money currentBalance = almostComplete.getCurrentBalance();
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(almostComplete);
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighResolutionOutputSizeshNQ4ISI = accountId;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.Camera2StreamConfigurationMap = type2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizes = icon2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getInputFormats = stringRef;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getOutputMinFrameDuration = stringRef2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object asFormatted = currentBalance.asFormatted(formatCurrencyUseCase, productOverviewMapperKtKt$asProductOverviewDetailsItem$2);
                    if (asFormatted == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    icon = icon2;
                    obj = asFormatted;
                    str = accountId;
                    refText = stringRef2;
                    refText2 = stringRef;
                    type = type2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText3 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getOutputMinFrameDuration;
                    com.paypal.oslo.core.commonui.utils.RefText refText4 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getInputFormats;
                    icon = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type) productOverviewMapperKtKt$asProductOverviewDetailsItem$2.Camera2StreamConfigurationMap;
                    java.lang.String str2 = (java.lang.String) productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refText = refText3;
                    str = str2;
                    refText2 = refText4;
                    type = type3;
                }
                return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText2, refText, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj), null, null, null, null, false, 4000, null);
            }
        }
        productOverviewMapperKtKt$asProductOverviewDetailsItem$2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$2(continuation);
        java.lang.Object obj2 = productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverviewDetailsItem$2.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText2, refText, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj2), null, null, null, null, false, 4000, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack onTrack, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3 productOverviewMapperKtKt$asProductOverviewDetailsItem$3;
        int i;
        com.paypal.oslo.core.commonui.utils.RefText stringRef;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack onTrack2;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3) {
            productOverviewMapperKtKt$asProductOverviewDetailsItem$3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3) continuation;
            if ((productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String accountId = onTrack.getAccountId();
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.BNPL_PLAN;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.pds.core.Icon.Store.INSTANCE, null, null, null, 28, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(onTrack.getMerchantName());
                    stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(onTrack.getProduct());
                    com.paypal.oslo.feature.wallet.common.domain.model.Money nextPaymentDue = onTrack.getNextPaymentDue();
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighSpeedVideoFpsRanges = onTrack;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.Camera2StreamConfigurationMap = accountId;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighResolutionOutputSizeshNQ4ISI = type2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighSpeedVideoSizes = icon2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getInputFormats = stringRef2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputFormats = stringRef;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputMinFrameDuration = 1;
                    java.lang.Object asFormatted = nextPaymentDue.asFormatted(formatCurrencyUseCase, productOverviewMapperKtKt$asProductOverviewDetailsItem$3);
                    if (asFormatted == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    type = type2;
                    icon = icon2;
                    obj = asFormatted;
                    onTrack2 = onTrack;
                    refText = stringRef2;
                    str = accountId;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText2 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputFormats;
                    com.paypal.oslo.core.commonui.utils.RefText refText3 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getInputFormats;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = (java.lang.String) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.Camera2StreamConfigurationMap;
                    onTrack2 = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack) productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    stringRef = refText2;
                    refText = refText3;
                    str = str2;
                    icon = icon3;
                    type = type3;
                }
                return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText, stringRef, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(onTrack2.getNextPaymentDueDate()), com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, null, null, false, 3616, null);
            }
        }
        productOverviewMapperKtKt$asProductOverviewDetailsItem$3 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3(continuation);
        java.lang.Object obj2 = productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverviewDetailsItem$3.getOutputMinFrameDuration;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText, stringRef, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj2), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(onTrack2.getNextPaymentDueDate()), com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, null, null, false, 3616, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue pastDue, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$4 productOverviewMapperKtKt$asProductOverviewDetailsItem$4;
        int i;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        java.lang.String str;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$4) {
            productOverviewMapperKtKt$asProductOverviewDetailsItem$4 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$4) continuation;
            if ((productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String accountId = pastDue.getAccountId();
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.BNPL_PLAN;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.pds.core.Icon.Store.INSTANCE, null, null, null, 28, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(pastDue.getMerchantName());
                    com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(pastDue.getProduct());
                    com.paypal.oslo.feature.wallet.common.domain.model.Money overdueAmount = pastDue.getOverdueAmount();
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pastDue);
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighSpeedVideoFpsRangesFor = accountId;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighSpeedVideoSizes = type2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.Camera2StreamConfigurationMap = icon2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getInputFormats = stringRef;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputFormats = stringRef2;
                    productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputMinFrameDuration = 1;
                    java.lang.Object asFormatted = overdueAmount.asFormatted(formatCurrencyUseCase, productOverviewMapperKtKt$asProductOverviewDetailsItem$4);
                    if (asFormatted == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    icon = icon2;
                    obj = asFormatted;
                    str = accountId;
                    refText = stringRef2;
                    refText2 = stringRef;
                    type = type2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText3 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputFormats;
                    com.paypal.oslo.core.commonui.utils.RefText refText4 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getInputFormats;
                    icon = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverviewDetailsItem$4.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type) productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighSpeedVideoSizes;
                    java.lang.String str2 = (java.lang.String) productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refText = refText3;
                    str = str2;
                    refText2 = refText4;
                    type = type3;
                }
                return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText2, refText, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later_past_due, new java.lang.Object[0]), com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null, null, false, 3616, null);
            }
        }
        productOverviewMapperKtKt$asProductOverviewDetailsItem$4 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$4(continuation);
        java.lang.Object obj2 = productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverviewDetailsItem$4.getOutputMinFrameDuration;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str, type, icon, refText2, refText, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj2), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later_past_due, new java.lang.Object[0]), com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null, null, false, 3616, null);
    }

    public static final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending pending) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pending, "");
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(pending.getAccountId(), com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.BNPL_PLAN, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.pds.core.Icon.Store.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(pending.getMerchantName()), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(pending.getProduct()), null, null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_pending, new java.lang.Object[0]), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, false, 3680, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct cryptoProduct, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$6 productOverviewMapperKtKt$asProductOverview$6;
        int i;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview;
        int i2;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        int i3;
        com.paypal.pds.core.Color.ContentRoleBasePositive contentRoleBasePositive;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> holdings;
        com.paypal.oslo.core.commonui.utils.RefText stringRef;
        com.paypal.oslo.core.commonui.utils.RefText stringRef2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$6) {
            productOverviewMapperKtKt$asProductOverview$6 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$6) continuation;
            if ((productOverviewMapperKtKt$asProductOverview$6.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverview$6.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverview$6.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverview$6.getOutputMinFrameDuration;
                com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview data = cryptoProduct.getData();
                    if (data == null) {
                        return null;
                    }
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type2 = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CRYPTO;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.CurrencyCrypto.INSTANCE, null, null, null, 28, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto, new java.lang.Object[0]);
                    com.paypal.oslo.feature.wallet.common.domain.model.Money portfolioValue = data.getPortfolioValue();
                    productOverviewMapperKtKt$asProductOverview$6.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cryptoProduct);
                    productOverviewMapperKtKt$asProductOverview$6.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase);
                    productOverviewMapperKtKt$asProductOverview$6.getHighSpeedVideoSizes = data;
                    productOverviewMapperKtKt$asProductOverview$6.getHighSpeedVideoFpsRangesFor = stringResourceRef2;
                    productOverviewMapperKtKt$asProductOverview$6.getOutputFormats = icon2;
                    productOverviewMapperKtKt$asProductOverview$6.getInputSizeshNQ4ISI = type2;
                    productOverviewMapperKtKt$asProductOverview$6.getHighResolutionOutputSizeshNQ4ISI = 0;
                    productOverviewMapperKtKt$asProductOverview$6.getOutputMinFrameDuration = 1;
                    java.lang.Object asFormatted = portfolioValue.asFormatted(formatCurrencyUseCase, productOverviewMapperKtKt$asProductOverview$6);
                    if (asFormatted == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    icon = icon2;
                    refText = stringResourceRef2;
                    type = type2;
                    obj = asFormatted;
                    cryptoOverview = data;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = productOverviewMapperKtKt$asProductOverview$6.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type3 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$6.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$6.getOutputFormats;
                    com.paypal.oslo.core.commonui.utils.RefText refText2 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$6.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview2 = (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview) productOverviewMapperKtKt$asProductOverview$6.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    icon = icon3;
                    refText = refText2;
                    cryptoOverview = cryptoOverview2;
                    type = type3;
                }
                com.paypal.oslo.core.commonui.utils.RefText stringRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj);
                com.paypal.oslo.core.commonui.utils.RefText stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_value, new java.lang.Object[0]);
                com.paypal.oslo.core.commonui.utils.RefText stringResourceRef4 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_total_return, cryptoOverview.getPortfolioGainOrLossPercent());
                i2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoOverview.getPortfolioGainOrLoss().ordinal()];
                if (i2 != 1) {
                    stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_total_return_increased_accessibility_voiceover, cryptoOverview.getPortfolioGainOrLossPercent());
                } else if (i2 == 2) {
                    stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_total_return_decreased_accessibility_voiceover, cryptoOverview.getPortfolioGainOrLossPercent());
                } else {
                    if (i2 != 3 && i2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_total_return, cryptoOverview.getPortfolioGainOrLossPercent());
                }
                com.paypal.oslo.core.commonui.utils.RefText refText3 = stringResourceRef;
                i3 = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoOverview.getPortfolioGainOrLoss().ordinal()];
                if (i3 != 1) {
                    contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
                } else if (i3 == 2) {
                    contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE;
                }
                com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(stringRef3, stringResourceRef3, stringResourceRef4, contentRoleBasePositive, refText3);
                holdings = cryptoOverview.getHoldings();
                if (holdings != null) {
                    if (holdings.size() <= 3) {
                        stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(kotlin.collections.CollectionsKt.joinToString$default(holdings, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.$r8$lambda$UqoW4lyK6aWCAqzyIjB8NQHAl_k((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) obj2);
                            }
                        }, 30, null));
                    } else {
                        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.take(holdings, 3), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.$r8$lambda$1aXcf_RPRZ0j3kSg9Xn98Xu3vos((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) obj2);
                            }
                        }, 30, null);
                        int size = holdings.size();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(joinToString$default);
                        sb.append(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverviewKt.CryptoAdditionalItemSeparator);
                        sb.append(size - 3);
                        stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(sb.toString());
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText4 = stringRef;
                    if (holdings.size() <= 3) {
                        stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(kotlin.collections.CollectionsKt.joinToString$default(holdings, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.$r8$lambda$0scEOgFLp6KCiksxYqA5hXyB7VU((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) obj2);
                            }
                        }, 30, null));
                    } else {
                        java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.take(holdings, 3), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.$r8$lambda$4uHnbx2ol3NILB0C0BQQFsy5kNc((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) obj2);
                            }
                        }, 30, null);
                        int size2 = holdings.size();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(joinToString$default2);
                        sb2.append(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverviewKt.CryptoAdditionalItemSeparator);
                        sb2.append(size2 - 3);
                        stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(sb2.toString());
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText5 = stringRef2;
                    java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> list = holdings;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) it.next()));
                    }
                    details = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details(refText4, refText5, arrayList, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_see_all_crypto, new java.lang.Object[0]), false, false, 48, null);
                }
                return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type, icon, refText, null, balance, null, details, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
            }
        }
        productOverviewMapperKtKt$asProductOverview$6 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$6(continuation);
        java.lang.Object obj2 = productOverviewMapperKtKt$asProductOverview$6.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverview$6.getOutputMinFrameDuration;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details2 = null;
        if (i != 0) {
        }
        com.paypal.oslo.core.commonui.utils.RefText stringRef32 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj2);
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef32 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_value, new java.lang.Object[0]);
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef42 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_total_return, cryptoOverview.getPortfolioGainOrLossPercent());
        i2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoOverview.getPortfolioGainOrLoss().ordinal()];
        if (i2 != 1) {
        }
        com.paypal.oslo.core.commonui.utils.RefText refText32 = stringResourceRef;
        i3 = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoOverview.getPortfolioGainOrLoss().ordinal()];
        if (i3 != 1) {
        }
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance2 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(stringRef32, stringResourceRef32, stringResourceRef42, contentRoleBasePositive, refText32);
        holdings = cryptoOverview.getHoldings();
        if (holdings != null) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type, icon, refText, null, balance2, null, details2, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
    }

    public static final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item asProductOverviewDetailsItem(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding) {
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.pds.core.Color.ContentRoleBasePositive contentRoleBasePositive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHolding, "");
        java.lang.String assetName = cryptoHolding.getAssetName();
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.CRYPTO_HOLDING;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.pds.core.Icon.CurrencyCrypto.INSTANCE, null, null, null, 28, null);
        java.lang.String logoUrl = cryptoHolding.getLogoUrl();
        com.paypal.oslo.core.commonui.utils.RefText stringRef = logoUrl != null ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(logoUrl) : null;
        com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(cryptoHolding.getAssetName());
        com.paypal.oslo.core.commonui.utils.RefText stringRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(cryptoHolding.getAssetSymbol());
        com.paypal.oslo.core.commonui.utils.RefText stringRef4 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(cryptoHolding.getFiatValue().getValue());
        com.paypal.oslo.core.commonui.utils.RefText stringRef5 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(cryptoHolding.getDailyGainOrLossPercent());
        int i = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoHolding.getDailyGainOrLoss().ordinal()];
        if (i == 1) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_return_increased_accessibility_voiceover, cryptoHolding.getAssetName(), cryptoHolding.getDailyGainOrLossPercent());
        } else if (i == 2) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto_return_decreased_accessibility_voiceover, cryptoHolding.getAssetName(), cryptoHolding.getDailyGainOrLossPercent());
        } else {
            if (i != 3 && i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(cryptoHolding.getDailyGainOrLossPercent());
        }
        com.paypal.oslo.core.commonui.utils.RefText refText = stringResourceRef;
        int i2 = com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptoHolding.getDailyGainOrLoss().ordinal()];
        if (i2 == 1) {
            contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
        } else if (i2 == 2) {
            contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE;
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(assetName, type, icon, stringRef2, stringRef3, stringRef, stringRef4, stringRef5, contentRoleBasePositive, refText, null, false, 3072, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$8 productOverviewMapperKtKt$asProductOverview$8;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct2;
        int i2;
        int i3;
        int i4;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        java.lang.Object asFormatted;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.core.commonui.utils.RefText refText3;
        int i5;
        com.paypal.oslo.core.commonui.utils.RefText refText4;
        java.lang.Object[] objArr;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type2;
        int i6;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2;
        java.lang.Object[] objArr2;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase2;
        int i7;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct3;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction nextBestAction;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type3;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3;
        com.paypal.oslo.core.commonui.utils.RefText refText5;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction nextBestAction2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction nextBestAction3;
        java.lang.Object[] objArr3;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type type4;
        int i8;
        java.lang.Object[] objArr4;
        java.lang.String str;
        int i9;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase3 = formatCurrencyUseCase;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$8) {
            productOverviewMapperKtKt$asProductOverview$8 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$8) continuation;
            if ((productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI -= 2147483648;
                java.lang.Object obj = productOverviewMapperKtKt$asProductOverview$8.isOutputSupportedForhNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview data = revolvingCreditProduct.getData();
                    if (data == null) {
                        return null;
                    }
                    type = revolvingCreditProduct.getType();
                    icon = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_credit_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.Card.INSTANCE, null, null, null, 28, null);
                    com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(data.getCardDisplayName());
                    com.paypal.oslo.feature.wallet.common.domain.model.Money currentBalance = data.getCurrentBalance();
                    revolvingCreditProduct2 = revolvingCreditProduct;
                    productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes = revolvingCreditProduct2;
                    productOverviewMapperKtKt$asProductOverview$8.getInputFormats = formatCurrencyUseCase3;
                    productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI = data;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputFormats = stringRef;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputSizes = icon;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM = type;
                    i2 = 0;
                    productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap = 0;
                    i3 = 1;
                    productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI = 1;
                    java.lang.Object asFormatted2 = currentBalance.asFormatted(formatCurrencyUseCase3, productOverviewMapperKtKt$asProductOverview$8);
                    if (asFormatted2 != coroutine_suspended) {
                        i4 = 0;
                        revolvingCreditOverview = data;
                        obj = asFormatted2;
                        refText = stringRef;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8 = productOverviewMapperKtKt$asProductOverview$8.getHighResolutionOutputSizeshNQ4ISI;
                        i9 = productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRanges;
                        int i10 = productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRangesFor;
                        int i11 = productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap;
                        objArr3 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDuration;
                        objArr4 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type type5 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type) productOverviewMapperKtKt$asProductOverview$8.unwrapAs;
                        java.lang.String str2 = (java.lang.String) productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDurationlomOqCM;
                        nextBestAction = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction) productOverviewMapperKtKt$asProductOverview$8.getOutputSizeshNQ4ISI;
                        type2 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$8.getOutputStallDuration;
                        icon2 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM;
                        refText3 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$8.getOutputSizes;
                        balance = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance) productOverviewMapperKtKt$asProductOverview$8.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        type4 = type5;
                        str = str2;
                        objArr3[i9] = obj;
                        objArr4[1] = ((com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.MinimumPaymentDue) nextBestAction).getDueDate();
                        nextBestAction3 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction(type4, str, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i8, objArr4), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_make_a_payment, new java.lang.Object[0]), new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Style.Custom(null, com.paypal.pds.core.Icon.ClockClockwise.INSTANCE, 1, null));
                        nextBestAction2 = nextBestAction3;
                        type3 = type2;
                        icon3 = icon2;
                        refText5 = refText3;
                        balance2 = balance;
                        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type3, icon3, refText5, null, balance2, nextBestAction2, null, null, false, 456, null);
                    }
                    i7 = productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRanges;
                    i6 = productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRangesFor;
                    i5 = productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.commonui.utils.RefText refText6 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$8.unwrapAs;
                    objArr = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.core.commonui.utils.RefText refText7 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$8.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type6 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$8.getOutputStallDuration;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon4 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.core.commonui.utils.RefText refText8 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$8.getOutputSizes;
                    objArr2 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$8.getOutputFormats;
                    revolvingCreditOverview = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview) productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI;
                    formatCurrencyUseCase2 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$8.getInputFormats;
                    revolvingCreditProduct3 = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refText2 = refText6;
                    refText4 = refText7;
                    type2 = type6;
                    icon2 = icon4;
                    refText3 = refText8;
                    objArr[i6] = obj;
                    balance = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText4, refText2, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i7, objArr2), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, 16, null);
                    nextBestAction = revolvingCreditOverview.getNextBestAction();
                    if (nextBestAction != null) {
                        type3 = type2;
                        icon3 = icon2;
                        refText5 = refText3;
                        balance2 = balance;
                        nextBestAction2 = null;
                        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type3, icon3, refText5, null, balance2, nextBestAction2, null, null, false, 456, null);
                    }
                    if (!(nextBestAction instanceof com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.MinimumPaymentDue)) {
                        if (!(nextBestAction instanceof com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.PastDue)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        nextBestAction3 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type.CREDIT_PAST_DUE, revolvingCreditProduct3.getType().asCreditProductId().toString(), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_payment_past_due, new java.lang.Object[0]), null, com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Style.Alert.INSTANCE, 8, null);
                        nextBestAction2 = nextBestAction3;
                        type3 = type2;
                        icon3 = icon2;
                        refText5 = refText3;
                        balance2 = balance;
                        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type3, icon3, refText5, null, balance2, nextBestAction2, null, null, false, 456, null);
                    }
                    java.lang.String obj2 = revolvingCreditProduct3.getType().asCreditProductId().toString();
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type type7 = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Type.CREDIT_MINIMUM_PAYMENT_DUE;
                    int i12 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_min_payment_due;
                    objArr3 = new java.lang.Object[2];
                    com.paypal.oslo.feature.wallet.common.domain.model.Money amount = ((com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.MinimumPaymentDue) nextBestAction).getAmount();
                    productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(revolvingCreditProduct3);
                    productOverviewMapperKtKt$asProductOverview$8.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatCurrencyUseCase2);
                    productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(revolvingCreditOverview);
                    productOverviewMapperKtKt$asProductOverview$8.getOutputFormats = balance;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputSizes = refText3;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM = icon2;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputStallDuration = type2;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputSizeshNQ4ISI = nextBestAction;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDurationlomOqCM = obj2;
                    productOverviewMapperKtKt$asProductOverview$8.unwrapAs = type7;
                    productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizesFor = objArr3;
                    productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDuration = objArr3;
                    productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap = i5;
                    productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRangesFor = 0;
                    productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRanges = 0;
                    productOverviewMapperKtKt$asProductOverview$8.getHighResolutionOutputSizeshNQ4ISI = i12;
                    productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI = 3;
                    java.lang.Object asFormatted3 = amount.asFormatted(formatCurrencyUseCase2, productOverviewMapperKtKt$asProductOverview$8);
                    if (asFormatted3 != coroutine_suspended) {
                        type4 = type7;
                        i8 = i12;
                        obj = asFormatted3;
                        objArr4 = objArr3;
                        str = obj2;
                        i9 = 0;
                        objArr3[i9] = obj;
                        objArr4[1] = ((com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditNextBestAction.MinimumPaymentDue) nextBestAction).getDueDate();
                        nextBestAction3 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction(type4, str, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i8, objArr4), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_make_a_payment, new java.lang.Object[0]), new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.NextBestAction.Style.Custom(null, com.paypal.pds.core.Icon.ClockClockwise.INSTANCE, 1, null));
                        nextBestAction2 = nextBestAction3;
                        type3 = type2;
                        icon3 = icon2;
                        refText5 = refText3;
                        balance2 = balance;
                        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type3, icon3, refText5, null, balance2, nextBestAction2, null, null, false, 456, null);
                    }
                    return coroutine_suspended;
                }
                int i13 = productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap;
                type = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM;
                icon = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$8.getOutputSizes;
                com.paypal.oslo.core.commonui.utils.RefText refText9 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$8.getOutputFormats;
                com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview2 = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview) productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI;
                com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase4 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$8.getInputFormats;
                com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct4 = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                i4 = i13;
                formatCurrencyUseCase3 = formatCurrencyUseCase4;
                revolvingCreditProduct2 = revolvingCreditProduct4;
                i2 = 0;
                i3 = 1;
                refText = refText9;
                revolvingCreditOverview = revolvingCreditOverview2;
                com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj);
                com.paypal.oslo.core.commonui.utils.RefText stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_current_balance, new java.lang.Object[i2]);
                int i14 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_credit_available_credit;
                java.lang.Object[] objArr5 = new java.lang.Object[i3];
                com.paypal.oslo.feature.wallet.common.domain.model.Money openToBuy = revolvingCreditOverview.getOpenToBuy();
                productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes = revolvingCreditProduct2;
                productOverviewMapperKtKt$asProductOverview$8.getInputFormats = formatCurrencyUseCase3;
                productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI = revolvingCreditOverview;
                productOverviewMapperKtKt$asProductOverview$8.getOutputFormats = objArr5;
                productOverviewMapperKtKt$asProductOverview$8.getOutputSizes = refText;
                productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM = icon;
                productOverviewMapperKtKt$asProductOverview$8.getOutputStallDuration = type;
                productOverviewMapperKtKt$asProductOverview$8.getOutputSizeshNQ4ISI = stringRef2;
                productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDurationlomOqCM = objArr5;
                productOverviewMapperKtKt$asProductOverview$8.unwrapAs = stringResourceRef;
                productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap = i4;
                productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRangesFor = 0;
                productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRanges = i14;
                productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI = 2;
                asFormatted = openToBuy.asFormatted(formatCurrencyUseCase3, productOverviewMapperKtKt$asProductOverview$8);
                if (asFormatted != coroutine_suspended) {
                    refText2 = stringResourceRef;
                    refText3 = refText;
                    obj = asFormatted;
                    i5 = i4;
                    refText4 = stringRef2;
                    objArr = objArr5;
                    type2 = type;
                    i6 = 0;
                    icon2 = icon;
                    objArr2 = objArr;
                    com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct5 = revolvingCreditProduct2;
                    formatCurrencyUseCase2 = formatCurrencyUseCase3;
                    i7 = i14;
                    revolvingCreditProduct3 = revolvingCreditProduct5;
                    objArr[i6] = obj;
                    balance = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(refText4, refText2, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i7, objArr2), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, 16, null);
                    nextBestAction = revolvingCreditOverview.getNextBestAction();
                    if (nextBestAction != null) {
                    }
                }
                return coroutine_suspended;
            }
        }
        productOverviewMapperKtKt$asProductOverview$8 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$8(continuation);
        java.lang.Object obj3 = productOverviewMapperKtKt$asProductOverview$8.isOutputSupportedForhNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.core.commonui.utils.RefText stringRef22 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj3);
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_current_balance, new java.lang.Object[i2]);
        int i142 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_credit_available_credit;
        java.lang.Object[] objArr52 = new java.lang.Object[i3];
        com.paypal.oslo.feature.wallet.common.domain.model.Money openToBuy2 = revolvingCreditOverview.getOpenToBuy();
        productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoSizes = revolvingCreditProduct2;
        productOverviewMapperKtKt$asProductOverview$8.getInputFormats = formatCurrencyUseCase3;
        productOverviewMapperKtKt$asProductOverview$8.getInputSizeshNQ4ISI = revolvingCreditOverview;
        productOverviewMapperKtKt$asProductOverview$8.getOutputFormats = objArr52;
        productOverviewMapperKtKt$asProductOverview$8.getOutputSizes = refText;
        productOverviewMapperKtKt$asProductOverview$8.getOutputStallDurationlomOqCM = icon;
        productOverviewMapperKtKt$asProductOverview$8.getOutputStallDuration = type;
        productOverviewMapperKtKt$asProductOverview$8.getOutputSizeshNQ4ISI = stringRef22;
        productOverviewMapperKtKt$asProductOverview$8.getOutputMinFrameDurationlomOqCM = objArr52;
        productOverviewMapperKtKt$asProductOverview$8.unwrapAs = stringResourceRef2;
        productOverviewMapperKtKt$asProductOverview$8.Camera2StreamConfigurationMap = i4;
        productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRangesFor = 0;
        productOverviewMapperKtKt$asProductOverview$8.getHighSpeedVideoFpsRanges = i142;
        productOverviewMapperKtKt$asProductOverview$8.getValidOutputFormatsForInputhNQ4ISI = 2;
        asFormatted = openToBuy2.asFormatted(formatCurrencyUseCase3, productOverviewMapperKtKt$asProductOverview$8);
        if (asFormatted != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static final com.paypal.oslo.feature.wallet.me.ui.ProductOverview asProductOverview(com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsProduct rewardsProduct) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsProduct, "");
        com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview data = rewardsProduct.getData();
        if (data == null) {
            return null;
        }
        return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(com.paypal.oslo.feature.wallet.me.domain.Product.Type.REWARDS, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_rewards_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.Trophy.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_rewards, new java.lang.Object[0]), null, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(data.getRewardsPoints()), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_points, new java.lang.Object[0]), null, null, null, 28, null), null, null, null, false, 488, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x03e9 -> B:12:0x0406). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object asProductOverview(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview> continuation) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11 productOverviewMapperKtKt$asProductOverview$11;
        int i;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon;
        int i2;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct2;
        int i3;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance;
        boolean isEmpty;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance2;
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon2;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> goals;
        java.util.Iterator it;
        int i4;
        int i5;
        java.util.ArrayList arrayList;
        int i6;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct3;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview2;
        com.paypal.oslo.core.commonui.utils.RefText refText3;
        java.lang.Object obj;
        int i7;
        java.lang.String str;
        int i8;
        int i9;
        int i10;
        java.lang.Object obj2;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal savingsGoal;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon3;
        java.lang.Object obj3;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type3;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.core.commonui.utils.RefText refText4;
        java.lang.Object obj4;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11 productOverviewMapperKtKt$asProductOverview$112;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance3;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase2;
        com.paypal.oslo.core.commonui.utils.RefText refText5;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct4;
        int i11;
        int i12;
        java.lang.Object asFormatted;
        java.lang.Object obj5;
        int i13;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon4;
        com.paypal.oslo.core.commonui.utils.RefText refText6;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase3 = formatCurrencyUseCase;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11) {
            productOverviewMapperKtKt$asProductOverview$11 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11) continuation;
            if ((productOverviewMapperKtKt$asProductOverview$11.f5728a & Integer.MIN_VALUE) != 0) {
                productOverviewMapperKtKt$asProductOverview$11.f5728a -= 2147483648;
                java.lang.Object obj6 = productOverviewMapperKtKt$asProductOverview$11.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productOverviewMapperKtKt$asProductOverview$11.f5728a;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview data = savingsProduct.getData();
                    if (data == null) {
                        return null;
                    }
                    type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.SAVINGS;
                    icon = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.Safe.INSTANCE, com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE, null, 16, null);
                    i2 = 0;
                    com.paypal.oslo.core.commonui.utils.RefText stringResourceRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_paypal_savings, new java.lang.Object[0]);
                    com.paypal.oslo.feature.wallet.common.domain.model.Money balance4 = data.getAccount().getBalance();
                    productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsProduct);
                    productOverviewMapperKtKt$asProductOverview$11.getInputSizeshNQ4ISI = formatCurrencyUseCase3;
                    productOverviewMapperKtKt$asProductOverview$11.getValidOutputFormatsForInputhNQ4ISI = data;
                    productOverviewMapperKtKt$asProductOverview$11.coroutineBoundary = stringResourceRef3;
                    productOverviewMapperKtKt$asProductOverview$11.ArtificialStackFrames = icon;
                    productOverviewMapperKtKt$asProductOverview$11.CoroutineDebuggingKt = type;
                    productOverviewMapperKtKt$asProductOverview$11.getHighResolutionOutputSizeshNQ4ISI = 0;
                    productOverviewMapperKtKt$asProductOverview$11.f5728a = 1;
                    java.lang.Object asFormatted2 = balance4.asFormatted(formatCurrencyUseCase3, productOverviewMapperKtKt$asProductOverview$11);
                    if (asFormatted2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    savingsProduct2 = savingsProduct;
                    i3 = 0;
                    refText = stringResourceRef3;
                    obj6 = asFormatted2;
                    savingsOverview = data;
                } else if (i == 1) {
                    int i14 = productOverviewMapperKtKt$asProductOverview$11.getHighResolutionOutputSizeshNQ4ISI;
                    type = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$11.CoroutineDebuggingKt;
                    icon = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$11.ArtificialStackFrames;
                    com.paypal.oslo.core.commonui.utils.RefText refText7 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.coroutineBoundary;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview3 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview) productOverviewMapperKtKt$asProductOverview$11.getValidOutputFormatsForInputhNQ4ISI;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase4 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$11.getInputSizeshNQ4ISI;
                    savingsProduct2 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    i3 = i14;
                    formatCurrencyUseCase3 = formatCurrencyUseCase4;
                    savingsOverview = savingsOverview3;
                    refText = refText7;
                    i2 = 0;
                } else if (i == 2) {
                    int i15 = productOverviewMapperKtKt$asProductOverview$11.Camera2StreamConfigurationMap;
                    int i16 = productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizes;
                    int i17 = productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoFpsRangesFor;
                    int i18 = productOverviewMapperKtKt$asProductOverview$11.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = (java.lang.String) productOverviewMapperKtKt$asProductOverview$11.isOutputSupportedFor;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type4 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type) productOverviewMapperKtKt$asProductOverview$11.toString;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon5 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$11.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.core.commonui.utils.RefText refText8 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.getOutputSizes;
                    com.paypal.oslo.core.commonui.utils.RefText refText9 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal savingsGoal2 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal) productOverviewMapperKtKt$asProductOverview$11.getOutputSizeshNQ4ISI;
                    java.lang.Object obj7 = productOverviewMapperKtKt$asProductOverview$11.getOutputStallDuration;
                    java.util.Iterator it2 = (java.util.Iterator) productOverviewMapperKtKt$asProductOverview$11.getInputFormats;
                    ?? r15 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDuration;
                    java.lang.Object obj8 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$11._BOUNDARY;
                    ?? r0 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$11._CREATION;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type5 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$11.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon6 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$11.coroutineCreation;
                    com.paypal.oslo.core.commonui.utils.RefText refText10 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.CoroutineDebuggingKt;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance5 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance) productOverviewMapperKtKt$asProductOverview$11.ArtificialStackFrames;
                    ?? r02 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$11.coroutineBoundary;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview4 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview) productOverviewMapperKtKt$asProductOverview$11.getValidOutputFormatsForInputhNQ4ISI;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase5 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$11.getInputSizeshNQ4ISI;
                    savingsProduct4 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    i10 = i16;
                    i9 = i17;
                    i8 = i18;
                    str = str2;
                    i7 = i15;
                    type = type5;
                    icon = icon6;
                    goals = r02;
                    obj = obj8;
                    obj3 = coroutine_suspended;
                    type3 = type4;
                    icon3 = icon5;
                    refText3 = refText10;
                    balance3 = balance5;
                    savingsOverview2 = savingsOverview4;
                    savingsGoal = savingsGoal2;
                    obj2 = obj7;
                    it = it2;
                    arrayList = r0;
                    refText4 = refText8;
                    productOverviewMapperKtKt$asProductOverview$112 = productOverviewMapperKtKt$asProductOverview$11;
                    formatCurrencyUseCase2 = formatCurrencyUseCase5;
                    obj4 = obj6;
                    refText5 = refText9;
                    arrayList2 = r15;
                    com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj4);
                    int i19 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_goal_target_amount;
                    com.paypal.oslo.core.commonui.utils.RefText refText11 = refText4;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    com.paypal.oslo.feature.wallet.common.domain.model.Money targetAmount = savingsGoal.getTargetAmount();
                    productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsProduct4);
                    productOverviewMapperKtKt$asProductOverview$112.getInputSizeshNQ4ISI = formatCurrencyUseCase2;
                    productOverviewMapperKtKt$asProductOverview$112.getValidOutputFormatsForInputhNQ4ISI = savingsOverview2;
                    productOverviewMapperKtKt$asProductOverview$112.coroutineBoundary = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(goals);
                    productOverviewMapperKtKt$asProductOverview$112.ArtificialStackFrames = balance3;
                    productOverviewMapperKtKt$asProductOverview$112.CoroutineDebuggingKt = refText3;
                    productOverviewMapperKtKt$asProductOverview$112.coroutineCreation = icon;
                    productOverviewMapperKtKt$asProductOverview$112.getARTIFICIAL_FRAME_PACKAGE_NAME = type;
                    productOverviewMapperKtKt$asProductOverview$112._CREATION = arrayList;
                    productOverviewMapperKtKt$asProductOverview$112._BOUNDARY = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                    productOverviewMapperKtKt$asProductOverview$112.getOutputMinFrameDuration = arrayList2;
                    productOverviewMapperKtKt$asProductOverview$112.getInputFormats = it;
                    productOverviewMapperKtKt$asProductOverview$112.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    productOverviewMapperKtKt$asProductOverview$112.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsGoal);
                    productOverviewMapperKtKt$asProductOverview$112.getOutputMinFrameDurationlomOqCM = objArr;
                    productOverviewMapperKtKt$asProductOverview$112.getOutputSizes = refText5;
                    productOverviewMapperKtKt$asProductOverview$112.getOutputStallDurationlomOqCM = refText11;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct5 = savingsProduct4;
                    productOverviewMapperKtKt$asProductOverview$112.toString = icon3;
                    productOverviewMapperKtKt$asProductOverview$112.isOutputSupportedFor = type3;
                    java.lang.String str3 = str;
                    productOverviewMapperKtKt$asProductOverview$112.isOutputSupportedForhNQ4ISI = str3;
                    productOverviewMapperKtKt$asProductOverview$112.unwrapAs = stringRef;
                    productOverviewMapperKtKt$asProductOverview$112.accessartificialFrame = objArr;
                    int i20 = i8;
                    productOverviewMapperKtKt$asProductOverview$112.getHighResolutionOutputSizeshNQ4ISI = i20;
                    i11 = i20;
                    int i21 = i9;
                    productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoFpsRangesFor = i21;
                    i12 = i21;
                    int i22 = i10;
                    productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoSizes = i22;
                    productOverviewMapperKtKt$asProductOverview$112.Camera2StreamConfigurationMap = i7;
                    productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoFpsRanges = 0;
                    productOverviewMapperKtKt$asProductOverview$112.getOutputFormats = i19;
                    productOverviewMapperKtKt$asProductOverview$112.f5728a = 3;
                    asFormatted = targetAmount.asFormatted(formatCurrencyUseCase2, productOverviewMapperKtKt$asProductOverview$112);
                    com.paypal.oslo.core.commonui.utils.RefText refText12 = refText5;
                    obj5 = obj3;
                    if (asFormatted != obj5) {
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i23 = productOverviewMapperKtKt$asProductOverview$11.getOutputFormats;
                    int i24 = productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoFpsRanges;
                    int i25 = productOverviewMapperKtKt$asProductOverview$11.Camera2StreamConfigurationMap;
                    int i26 = productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizes;
                    int i27 = productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoFpsRangesFor;
                    int i28 = productOverviewMapperKtKt$asProductOverview$11.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object[] objArr2 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$11.accessartificialFrame;
                    com.paypal.oslo.core.commonui.utils.RefText refText13 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.unwrapAs;
                    java.lang.String str4 = (java.lang.String) productOverviewMapperKtKt$asProductOverview$11.isOutputSupportedForhNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type6 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type) productOverviewMapperKtKt$asProductOverview$11.isOutputSupportedFor;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon7 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$11.toString;
                    com.paypal.oslo.core.commonui.utils.RefText refText14 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.core.commonui.utils.RefText refText15 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.getOutputSizes;
                    java.lang.Object[] objArr3 = (java.lang.Object[]) productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj9 = productOverviewMapperKtKt$asProductOverview$11.getOutputStallDuration;
                    java.util.Iterator it3 = (java.util.Iterator) productOverviewMapperKtKt$asProductOverview$11.getInputFormats;
                    ?? r03 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDuration;
                    java.lang.Object obj10 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$11._BOUNDARY;
                    ?? r04 = (java.util.Collection) productOverviewMapperKtKt$asProductOverview$11._CREATION;
                    com.paypal.oslo.feature.wallet.me.domain.Product.Type type7 = (com.paypal.oslo.feature.wallet.me.domain.Product.Type) productOverviewMapperKtKt$asProductOverview$11.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon8 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon) productOverviewMapperKtKt$asProductOverview$11.coroutineCreation;
                    com.paypal.oslo.core.commonui.utils.RefText refText16 = (com.paypal.oslo.core.commonui.utils.RefText) productOverviewMapperKtKt$asProductOverview$11.CoroutineDebuggingKt;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance6 = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance) productOverviewMapperKtKt$asProductOverview$11.ArtificialStackFrames;
                    ?? r05 = (java.lang.Iterable) productOverviewMapperKtKt$asProductOverview$11.coroutineBoundary;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview5 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview) productOverviewMapperKtKt$asProductOverview$11.getValidOutputFormatsForInputhNQ4ISI;
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase6 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) productOverviewMapperKtKt$asProductOverview$11.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct6 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type8 = type6;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon9 = icon7;
                    com.paypal.oslo.core.commonui.utils.RefText refText17 = refText14;
                    com.paypal.oslo.core.commonui.utils.RefText refText18 = refText15;
                    com.paypal.oslo.core.commonui.utils.RefText refText19 = refText13;
                    java.lang.String str5 = str4;
                    java.util.ArrayList arrayList3 = r03;
                    obj = obj10;
                    icon = icon8;
                    refText3 = refText16;
                    goals = r05;
                    java.util.Iterator it4 = it3;
                    int i29 = i26;
                    i12 = i27;
                    i11 = i28;
                    arrayList = r04;
                    com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct7 = savingsProduct6;
                    productOverviewMapperKtKt$asProductOverview$112 = productOverviewMapperKtKt$asProductOverview$11;
                    int i30 = i23;
                    java.lang.Object obj11 = obj6;
                    obj5 = coroutine_suspended;
                    balance3 = balance6;
                    objArr2[i24] = obj11;
                    arrayList.add(new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str5, type8, icon9, refText17, refText18, null, refText19, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i30, objArr3), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, false, 3616, null));
                    productOverviewMapperKtKt$asProductOverview$11 = productOverviewMapperKtKt$asProductOverview$112;
                    savingsProduct3 = savingsProduct7;
                    it = it4;
                    arrayList = arrayList3;
                    i5 = i29;
                    type = type7;
                    i6 = i11;
                    i4 = i12;
                    savingsOverview2 = savingsOverview5;
                    formatCurrencyUseCase3 = formatCurrencyUseCase6;
                    com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance7 = balance3;
                    coroutine_suspended = obj5;
                    balance = balance7;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        java.lang.Object obj12 = coroutine_suspended;
                        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal savingsGoal3 = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal) next;
                        int i31 = i5;
                        java.lang.String id = savingsGoal3.getId();
                        int i32 = i4;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type type9 = com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.SAVINGS_GOAL;
                        int i33 = i6;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon icon10 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_icon_content_description, new java.lang.Object[0]), com.paypal.pds.core.Icon.Target.INSTANCE, null, null, null, 28, null);
                        com.paypal.oslo.core.commonui.utils.RefText stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(savingsGoal3.getName());
                        if (savingsGoal3.isAutoSaveEnabled()) {
                            icon4 = icon10;
                            refText6 = stringRef2;
                            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_goal_auto_save_on, new java.lang.Object[0]);
                        } else {
                            icon4 = icon10;
                            refText6 = stringRef2;
                            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_goal_auto_save_off, new java.lang.Object[0]);
                        }
                        com.paypal.oslo.feature.wallet.common.domain.model.Money currentBalance = savingsGoal3.getCurrentBalance();
                        productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsProduct3);
                        productOverviewMapperKtKt$asProductOverview$11.getInputSizeshNQ4ISI = formatCurrencyUseCase3;
                        productOverviewMapperKtKt$asProductOverview$11.getValidOutputFormatsForInputhNQ4ISI = savingsOverview2;
                        productOverviewMapperKtKt$asProductOverview$11.coroutineBoundary = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(goals);
                        productOverviewMapperKtKt$asProductOverview$11.ArtificialStackFrames = balance;
                        productOverviewMapperKtKt$asProductOverview$11.CoroutineDebuggingKt = refText3;
                        productOverviewMapperKtKt$asProductOverview$11.coroutineCreation = icon;
                        productOverviewMapperKtKt$asProductOverview$11.getARTIFICIAL_FRAME_PACKAGE_NAME = type;
                        productOverviewMapperKtKt$asProductOverview$11._CREATION = arrayList;
                        productOverviewMapperKtKt$asProductOverview$11._BOUNDARY = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDuration = arrayList;
                        productOverviewMapperKtKt$asProductOverview$11.getInputFormats = it;
                        productOverviewMapperKtKt$asProductOverview$11.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        productOverviewMapperKtKt$asProductOverview$11.getOutputSizeshNQ4ISI = savingsGoal3;
                        productOverviewMapperKtKt$asProductOverview$11.getOutputMinFrameDurationlomOqCM = stringResourceRef2;
                        com.paypal.oslo.core.commonui.utils.RefText refText20 = refText6;
                        productOverviewMapperKtKt$asProductOverview$11.getOutputSizes = refText20;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance8 = balance;
                        productOverviewMapperKtKt$asProductOverview$11.getOutputStallDurationlomOqCM = icon4;
                        productOverviewMapperKtKt$asProductOverview$11.toString = type9;
                        productOverviewMapperKtKt$asProductOverview$11.isOutputSupportedFor = id;
                        productOverviewMapperKtKt$asProductOverview$11.isOutputSupportedForhNQ4ISI = null;
                        productOverviewMapperKtKt$asProductOverview$11.unwrapAs = null;
                        productOverviewMapperKtKt$asProductOverview$11.accessartificialFrame = null;
                        productOverviewMapperKtKt$asProductOverview$11.getHighResolutionOutputSizeshNQ4ISI = i33;
                        productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoFpsRangesFor = i32;
                        productOverviewMapperKtKt$asProductOverview$11.getHighSpeedVideoSizes = i31;
                        productOverviewMapperKtKt$asProductOverview$11.Camera2StreamConfigurationMap = 0;
                        productOverviewMapperKtKt$asProductOverview$11.f5728a = 2;
                        obj4 = currentBalance.asFormatted(formatCurrencyUseCase3, productOverviewMapperKtKt$asProductOverview$11);
                        if (obj4 == obj12) {
                            return obj12;
                        }
                        str = id;
                        obj3 = obj12;
                        refText5 = stringResourceRef2;
                        refText4 = refText20;
                        i10 = i31;
                        i9 = i32;
                        icon3 = icon4;
                        i8 = i33;
                        i7 = 0;
                        savingsGoal = savingsGoal3;
                        arrayList2 = arrayList;
                        obj2 = next;
                        balance3 = balance8;
                        type3 = type9;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11 productOverviewMapperKtKt$asProductOverview$113 = productOverviewMapperKtKt$asProductOverview$11;
                        formatCurrencyUseCase2 = formatCurrencyUseCase3;
                        savingsProduct4 = savingsProduct3;
                        productOverviewMapperKtKt$asProductOverview$112 = productOverviewMapperKtKt$asProductOverview$113;
                        com.paypal.oslo.core.commonui.utils.RefText stringRef3 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj4);
                        int i192 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_goal_target_amount;
                        com.paypal.oslo.core.commonui.utils.RefText refText112 = refText4;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        com.paypal.oslo.feature.wallet.common.domain.model.Money targetAmount2 = savingsGoal.getTargetAmount();
                        productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsProduct4);
                        productOverviewMapperKtKt$asProductOverview$112.getInputSizeshNQ4ISI = formatCurrencyUseCase2;
                        productOverviewMapperKtKt$asProductOverview$112.getValidOutputFormatsForInputhNQ4ISI = savingsOverview2;
                        productOverviewMapperKtKt$asProductOverview$112.coroutineBoundary = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(goals);
                        productOverviewMapperKtKt$asProductOverview$112.ArtificialStackFrames = balance3;
                        productOverviewMapperKtKt$asProductOverview$112.CoroutineDebuggingKt = refText3;
                        productOverviewMapperKtKt$asProductOverview$112.coroutineCreation = icon;
                        productOverviewMapperKtKt$asProductOverview$112.getARTIFICIAL_FRAME_PACKAGE_NAME = type;
                        productOverviewMapperKtKt$asProductOverview$112._CREATION = arrayList;
                        productOverviewMapperKtKt$asProductOverview$112._BOUNDARY = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        productOverviewMapperKtKt$asProductOverview$112.getOutputMinFrameDuration = arrayList2;
                        productOverviewMapperKtKt$asProductOverview$112.getInputFormats = it;
                        productOverviewMapperKtKt$asProductOverview$112.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        productOverviewMapperKtKt$asProductOverview$112.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsGoal);
                        productOverviewMapperKtKt$asProductOverview$112.getOutputMinFrameDurationlomOqCM = objArr4;
                        productOverviewMapperKtKt$asProductOverview$112.getOutputSizes = refText5;
                        productOverviewMapperKtKt$asProductOverview$112.getOutputStallDurationlomOqCM = refText112;
                        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct52 = savingsProduct4;
                        productOverviewMapperKtKt$asProductOverview$112.toString = icon3;
                        productOverviewMapperKtKt$asProductOverview$112.isOutputSupportedFor = type3;
                        java.lang.String str32 = str;
                        productOverviewMapperKtKt$asProductOverview$112.isOutputSupportedForhNQ4ISI = str32;
                        productOverviewMapperKtKt$asProductOverview$112.unwrapAs = stringRef3;
                        productOverviewMapperKtKt$asProductOverview$112.accessartificialFrame = objArr4;
                        int i202 = i8;
                        productOverviewMapperKtKt$asProductOverview$112.getHighResolutionOutputSizeshNQ4ISI = i202;
                        i11 = i202;
                        int i212 = i9;
                        productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoFpsRangesFor = i212;
                        i12 = i212;
                        int i222 = i10;
                        productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoSizes = i222;
                        productOverviewMapperKtKt$asProductOverview$112.Camera2StreamConfigurationMap = i7;
                        productOverviewMapperKtKt$asProductOverview$112.getHighSpeedVideoFpsRanges = 0;
                        productOverviewMapperKtKt$asProductOverview$112.getOutputFormats = i192;
                        productOverviewMapperKtKt$asProductOverview$112.f5728a = 3;
                        asFormatted = targetAmount2.asFormatted(formatCurrencyUseCase2, productOverviewMapperKtKt$asProductOverview$112);
                        com.paypal.oslo.core.commonui.utils.RefText refText122 = refText5;
                        obj5 = obj3;
                        if (asFormatted != obj5) {
                            return obj5;
                        }
                        refText19 = stringRef3;
                        formatCurrencyUseCase6 = formatCurrencyUseCase2;
                        refText17 = refText112;
                        type8 = type3;
                        icon9 = icon3;
                        savingsProduct7 = savingsProduct52;
                        str5 = str32;
                        refText18 = refText122;
                        i29 = i222;
                        obj11 = asFormatted;
                        type7 = type;
                        savingsOverview5 = savingsOverview2;
                        objArr3 = objArr4;
                        i24 = 0;
                        i30 = i192;
                        it4 = it;
                        objArr2 = objArr3;
                        arrayList3 = arrayList2;
                        objArr2[i24] = obj11;
                        arrayList.add(new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item(str5, type8, icon9, refText17, refText18, null, refText19, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i30, objArr3), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, false, 3616, null));
                        productOverviewMapperKtKt$asProductOverview$11 = productOverviewMapperKtKt$asProductOverview$112;
                        savingsProduct3 = savingsProduct7;
                        it = it4;
                        arrayList = arrayList3;
                        i5 = i29;
                        type = type7;
                        i6 = i11;
                        i4 = i12;
                        savingsOverview2 = savingsOverview5;
                        formatCurrencyUseCase3 = formatCurrencyUseCase6;
                        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance72 = balance3;
                        coroutine_suspended = obj5;
                        balance = balance72;
                        if (it.hasNext()) {
                            com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance9 = balance;
                            java.util.ArrayList arrayList4 = arrayList;
                            if (savingsOverview2.getGoals().size() > 1) {
                                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_n_goals, kotlin.coroutines.jvm.internal.Boxing.boxInt(savingsOverview2.getGoals().size()));
                                i13 = 0;
                            } else {
                                i13 = 0;
                                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_1_goal, new java.lang.Object[0]);
                            }
                            type2 = type;
                            icon2 = icon;
                            details = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details(stringResourceRef, null, arrayList4, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_see_all_goals, new java.lang.Object[i13]), false, false, 50, null);
                            refText2 = refText3;
                            balance2 = balance9;
                            return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type2, icon2, refText2, null, balance2, null, details, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
                        }
                    }
                }
                balance = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj6), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[i2]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_apy, savingsOverview.getFeatures().getAnnualPercentageYield()), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, 16, null);
                isEmpty = savingsOverview.getGoals().isEmpty();
                if (!isEmpty) {
                    if (!isEmpty) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    balance2 = balance;
                    type2 = type;
                    icon2 = icon;
                    refText2 = refText;
                    details = null;
                    return new com.paypal.oslo.feature.wallet.me.ui.ProductOverview(type2, icon2, refText2, null, balance2, null, details, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
                }
                goals = savingsOverview.getGoals();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(goals, 10));
                it = goals.iterator();
                i4 = 0;
                i5 = 0;
                arrayList = arrayList5;
                i6 = i3;
                savingsProduct3 = savingsProduct2;
                savingsOverview2 = savingsOverview;
                refText3 = refText;
                obj = goals;
                if (it.hasNext()) {
                }
            }
        }
        productOverviewMapperKtKt$asProductOverview$11 = new com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$11(continuation);
        java.lang.Object obj62 = productOverviewMapperKtKt$asProductOverview$11.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productOverviewMapperKtKt$asProductOverview$11.f5728a;
        if (i != 0) {
        }
        balance = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef((java.lang.String) obj62), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_available_balance, new java.lang.Object[i2]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_savings_apy, savingsOverview.getFeatures().getAnnualPercentageYield()), com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null, 16, null);
        isEmpty = savingsOverview.getGoals().isEmpty();
        if (!isEmpty) {
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$0scEOgFLp6KCiksxYqA5hXyB7VU(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHolding, "");
        return cryptoHolding.getAssetName();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$1aXcf_RPRZ0j3kSg9Xn98Xu3vos(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHolding, "");
        return cryptoHolding.getAssetSymbol();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$4uHnbx2ol3NILB0C0BQQFsy5kNc(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHolding, "");
        return cryptoHolding.getAssetName();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$UqoW4lyK6aWCAqzyIjB8NQHAl_k(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHolding, "");
        return cryptoHolding.getAssetSymbol();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.GAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.LOSS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.NEITHER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
