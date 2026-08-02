package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/GetInvoiceUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "invoiceRepository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;)V", "", "invoiceId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetInvoiceUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetInvoiceUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = invoiceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase$invoke$1 getInvoiceUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft draft;
        java.util.List emptyList;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem;
        java.math.BigDecimal bigDecimal;
        java.lang.String emailAddress;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase$invoke$1) {
            getInvoiceUseCase$invoke$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase$invoke$1) continuation;
            if ((getInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository invoiceRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = invoiceRepository.getInvoiceDetails(str, getInvoiceUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice) ((arrow.core.Either.Right) either).getValue();
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients = invoice.getPrimaryRecipients();
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo = (primaryRecipients == null || (recipient = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) primaryRecipients)) == null) ? null : recipient.getBillingInfo();
                    if (billingInfo == null || (emailAddress = billingInfo.getEmailAddress()) == null) {
                        customer = null;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName name2 = billingInfo.getName();
                        customer = new com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer((java.lang.String) null, name2 != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.NameFormattingKt.formatFullName(name2.getGivenName(), name2.getSurname()) : null, emailAddress, (java.lang.String) null, (java.lang.String) null, 25, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    java.lang.String id = invoice.getId();
                    java.lang.String currencyCode = invoice.getDetail().getCurrencyCode();
                    switch (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase.WhenMappings.$EnumSwitchMapping$0[invoice.getStatus().ordinal()]) {
                        case 1:
                        case 2:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.INSTANCE;
                            break;
                        case 3:
                        case 4:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.INSTANCE;
                            break;
                        case 5:
                        case 6:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.INSTANCE;
                            break;
                        case 7:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.INSTANCE;
                            break;
                        case 8:
                        case 9:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.INSTANCE;
                            break;
                        default:
                            draft = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.INSTANCE;
                            break;
                    }
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus = draft;
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item> items = invoice.getItems();
                    if (items == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item : items) {
                            java.lang.String name3 = item.getName();
                            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount = item.getUnitAmount();
                            if (name3 == null || unitAmount == null) {
                                lineItem = null;
                            } else {
                                java.lang.String quantity = item.getQuantity();
                                if (quantity == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(quantity)) == null) {
                                    bigDecimal = java.math.BigDecimal.ONE;
                                }
                                java.math.BigDecimal bigDecimal2 = bigDecimal;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal2);
                                lineItem = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem((java.lang.String) null, name3, unitAmount, bigDecimal2, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.PRODUCT, (java.lang.String) null, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount) null, (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax) null, 225, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            }
                            if (lineItem != null) {
                                arrayList.add(lineItem);
                            }
                        }
                        emptyList = arrayList;
                    }
                    java.lang.String note = invoice.getDetail().getNote();
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration configuration = invoice.getConfiguration();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice(id, currencyCode, customer, invoiceStatus, emptyList, note, new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration((java.lang.String) null, configuration != null ? configuration.getAllowTip() : false, false, (java.lang.String) null, false, false, 61, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 128, null));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getInvoiceUseCase$invoke$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getInvoiceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getInvoiceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.DRAFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.INITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SCHEDULED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_PAID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNPAID.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.CANCELLED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.AUTOCANCELLED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
