package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`\u00170\u0015*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u0013\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u0013\u0010\u001c\u001a\u0013\u0010\n\u001a\u00020\u001d*\u00020\u001aH\u0002¢\u0006\u0004\b\n\u0010\u001e\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020 0\f*\u00020\u001fH\u0002¢\u0006\u0004\b\u0013\u0010!\"\u0014\u0010\n\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateInvoiceInput;", "toCreateInvoiceInput", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/paypal/oslo/api/graphql/schema/type/CreateInvoiceInput;", "", "invoiceId", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateInvoiceInput;", "toUpdateInvoiceInput", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateInvoiceInput;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDetailInput;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDetailInput;", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePrimaryRecipientInput;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemInput;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemInput;", "Lcom/apollographql/apollo/api/Optional$Present;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConfigurationInput;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/type/InvoiceConfigurationInput;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/apollographql/apollo/api/Optional$Present;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/ItemType;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/ItemType;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/ItemType;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountInput;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Discount;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceAmountBreakdownInput;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceAmountBreakdownInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceInputMappersKt {
    private static final com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput(new com.paypal.oslo.api.graphql.schema.type.MoneyInput("USD", "10.00"), null, null, null, null, null, null, null, null, null, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, null);

    public static final com.paypal.oslo.api.graphql.schema.type.CreateInvoiceInput toCreateInvoiceInput(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        com.paypal.oslo.api.graphql.schema.type.InvoiceDetailInput highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(invoice);
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput>> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(invoice);
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items = invoice.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.CreateInvoiceInput(null, highSpeedVideoFpsRangesFor, null, highResolutionOutputSizeshNQ4ISI, null, arrayList, getHighSpeedVideoFpsRanges(invoice), getHighResolutionOutputSizeshNQ4ISI, 21, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateInvoiceInput toUpdateInvoiceInput(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.api.graphql.schema.type.InvoiceDetailInput highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(invoice);
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput>> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(invoice);
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items = invoice.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateInvoiceInput(str, null, highSpeedVideoFpsRangesFor, null, highResolutionOutputSizeshNQ4ISI, null, arrayList, getHighSpeedVideoFpsRanges(invoice), getHighResolutionOutputSizeshNQ4ISI, 42, null);
    }

    private static final com.paypal.oslo.api.graphql.schema.type.InvoiceDetailInput getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        java.lang.String currency = invoice.getCurrency();
        java.lang.String note = invoice.getNote();
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceDetailInput(null, null, null, currency, note == null ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : com.apollographql.apollo.api.Optional.INSTANCE.present(note), null, null, null, null, null, null, 2023, null);
    }

    private static final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        if (invoice.getCustomer() == null) {
            return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.apollographql.apollo.api.Optional.Present(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput(new com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput(null, null, null, new com.apollographql.apollo.api.Optional.Present(invoice.getCustomer().getEmail()), null, null, null, null, null, null, 1015, null), null, 2, null)));
    }

    private static final com.paypal.oslo.api.graphql.schema.type.InvoiceItemInput Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount;
        java.lang.String name2 = lineItem.getName();
        com.paypal.oslo.api.graphql.schema.type.MerchantItemType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(lineItem.getType());
        java.lang.String description = lineItem.getDescription();
        com.apollographql.apollo.api.Optional absent2 = description == null ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : com.apollographql.apollo.api.Optional.INSTANCE.present(description);
        com.apollographql.apollo.api.Optional.Present present = new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(lineItem.getUnitPrice().getCurrencyCode(), lineItem.getUnitPrice().formatAsNumberUnsigned()));
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = lineItem.getTax();
        if (tax != null) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            java.lang.String id = tax.getId();
            java.lang.String plainString = tax.getValue().toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
            com.apollographql.apollo.api.Optional.Present present2 = companion.present(new com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput(id, plainString, null, 4, null));
            if (present2 != null) {
                absent = present2;
                com.apollographql.apollo.api.Optional optional = absent;
                discount = lineItem.getDiscount();
                if (discount != null || (r1 = Camera2StreamConfigurationMap(discount)) == null) {
                    com.apollographql.apollo.api.Optional.Absent absent3 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                }
                return new com.paypal.oslo.api.graphql.schema.type.InvoiceItemInput(new com.paypal.oslo.api.graphql.schema.type.InvoiceItemDetailsInput(null, name2, absent2, Camera2StreamConfigurationMap, null, present, null, absent3, optional, null, null, 1617, null), com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRangesFor(lineItem.getType())), null, com.apollographql.apollo.api.Optional.INSTANCE.present(lineItem.getQuantity().toString()), 4, null);
            }
        }
        absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        com.apollographql.apollo.api.Optional optional2 = absent;
        discount = lineItem.getDiscount();
        if (discount != null) {
        }
        com.apollographql.apollo.api.Optional.Absent absent32 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceItemInput(new com.paypal.oslo.api.graphql.schema.type.InvoiceItemDetailsInput(null, name2, absent2, Camera2StreamConfigurationMap, null, present, null, absent32, optional2, null, null, 1617, null), com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRangesFor(lineItem.getType())), null, com.apollographql.apollo.api.Optional.INSTANCE.present(lineItem.getQuantity().toString()), 4, null);
    }

    private static final com.apollographql.apollo.api.Optional.Present<com.paypal.oslo.api.graphql.schema.type.InvoiceConfigurationInput> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(invoice.getConfiguration().getAllowTips()));
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(invoice.getConfiguration().getAllowPartialPayment()));
        if (invoice.getConfiguration().getMinimumDue() != null && (!kotlin.text.StringsKt.isBlank(r3))) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(invoice.getCurrency(), invoice.getConfiguration().getMinimumDue()));
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        return companion.present(new com.paypal.oslo.api.graphql.schema.type.InvoiceConfigurationInput(present2, absent, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(invoice.getConfiguration().getTaxCalculatedAfterDiscount())), present, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(invoice.getConfiguration().getTaxInclusive())), null, 176, null));
    }

    private static final com.paypal.oslo.api.graphql.schema.type.MerchantItemType Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType) {
        int i = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceInputMappersKt.WhenMappings.$EnumSwitchMapping$0[itemType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.MerchantItemType.PRODUCT;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.MerchantItemType.SERVICE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.MerchantItemType.PRODUCT;
    }

    private static final com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType) {
        int i = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceInputMappersKt.WhenMappings.$EnumSwitchMapping$0[itemType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.QUANTITY;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.HOURS;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.AMOUNT;
    }

    private static final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput> Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount) {
        com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput invoiceDiscountInput;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        if (discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount amount = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) discount;
            invoiceDiscountInput = new com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(amount.getAmount().getCurrencyCode(), amount.getAmount().formatAsNumberUnsigned())), 1, null);
        } else {
            if (!(discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            invoiceDiscountInput = new com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput(com.apollographql.apollo.api.Optional.INSTANCE.present(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) discount).getPercentage().toPlainString()), null, 2, null);
        }
        return companion.present(invoiceDiscountInput);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.CUSTOM_AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
