package com.paypal.oslo.feature.wallet.fifo.transfer.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetWithdrawalOptionsError;", "toGetWithdrawalOptionsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetWithdrawalOptionsError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalOptionsInput;", "toWithdrawalOptionsInput", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;)Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalOptionsInput;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWithdrawalOptionsQuery$WithdrawalOption;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsResult;", "toGetWithdrawalOptionsResult", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWithdrawalOptionsQuery$WithdrawalOption;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsResult;", "", "p0", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "p1", "p2", "p3", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetWithdrawalOptionsMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError toGetWithdrawalOptionsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError.Network.NetworkFailure.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21255getIssueGZgkXh4(graphQL.m11659getErrors1X0FAY()));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput toWithdrawalOptionsInput(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput getWithdrawalOptionsInput) {
        com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput;
        com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWithdrawalOptionsInput, "");
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource source = getWithdrawalOptionsInput.getSource();
        if (source != null) {
            com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceType safeValueOf = com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceType.INSTANCE.safeValueOf(source.getType());
            java.lang.String balanceId = source.getBalanceId();
            java.util.Base64.Encoder withoutPadding = java.util.Base64.getEncoder().withoutPadding();
            byte[] bytes = "{\"alg\":\"none\",\"typ\":\"jwt\"}".getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.String encodeToString = withoutPadding.encodeToString(bytes);
            java.lang.String format = java.lang.String.format("{\"id\":\"%s\"}", java.util.Arrays.copyOf(new java.lang.Object[]{balanceId}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            byte[] bytes2 = format.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
            java.lang.String encodeToString2 = withoutPadding.encodeToString(bytes2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(encodeToString);
            sb.append(".");
            sb.append(encodeToString2);
            sb.append(".");
            withdrawalSourceInput = new com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput(safeValueOf, new com.apollographql.apollo.api.Optional.Present(sb.toString()));
        } else {
            withdrawalSourceInput = new com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput(com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceType.UNKNOWN__, null, 2, null);
        }
        com.paypal.oslo.api.graphql.schema.type.WithdrawalSourceInput withdrawalSourceInput2 = withdrawalSourceInput;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount amount = getWithdrawalOptionsInput.getAmount();
        if (amount != null) {
            currencyInput = new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(amount.getFiatCurrencyInput().getCurrencyCode(), amount.getFiatCurrencyInput().getValue())), null, null, 6, null);
        } else {
            currencyInput = new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(null, null, null, 7, null);
        }
        return new com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput(withdrawalSourceInput2, null, null, currencyInput, null, 22, null);
    }

    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult toGetWithdrawalOptionsResult(com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.WithdrawalOption withdrawalOption) {
        java.lang.String str;
        java.util.List emptyList;
        java.util.List emptyList2;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument destinationInstrument;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PrimaryImage1 primaryImage;
        java.lang.Object baseCdnLinkPath;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage1 bankAccountInstitutionImage1;
        java.lang.Object url;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.Iterator it2;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money;
        java.util.Iterator it3;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2;
        java.util.Iterator it4;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3;
        java.lang.String str2;
        java.util.Iterator it5;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money4;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee;
        java.util.List emptyList3;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money5;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money6;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money7;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CurrencyExchange currencyExchange;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown unknown;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Instrument1 instrument;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer2;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PrimaryImage primaryImage2;
        java.lang.Object baseCdnLinkPath2;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage bankAccountInstitutionImage;
        java.lang.Object url2;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money8;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money9;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money10;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money11;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money12;
        java.util.Iterator it6;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance availableBalance;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Available available;
        java.util.Iterator it7;
        java.util.Iterator it8;
        java.util.ArrayList arrayList5;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money13;
        java.util.ArrayList arrayList6;
        java.lang.String str3;
        java.util.ArrayList arrayList7;
        java.util.Iterator it9;
        java.lang.String str4;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money14;
        java.util.Iterator it10;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money15;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money16;
        java.util.Iterator it11;
        java.util.Iterator it12;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money17;
        java.lang.String rawValue;
        java.lang.String rawValue2;
        java.lang.Object currencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalOption, "");
        java.lang.String id = withdrawalOption.getId();
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Amount amount = withdrawalOption.getAmount();
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney onMoney = amount.getOnMoney();
        java.lang.String obj = (onMoney == null || (currencyCode = onMoney.getCurrencyCode()) == null) ? null : currencyCode.toString();
        if (obj == null) {
            obj = "";
        }
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney onMoney2 = amount.getOnMoney();
        if (onMoney2 == null || (str = onMoney2.getValue()) == null) {
            str = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money18 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(obj, str);
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Option> options = withdrawalOption.getOptions();
        int i = 10;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(options, 10));
        java.util.Iterator it13 = options.iterator();
        while (it13.hasNext()) {
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Option option = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Option) it13.next();
            java.lang.String id2 = option.getId();
            com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionStatus optionStatus = option.getOptionStatus();
            java.lang.String str5 = (optionStatus == null || (rawValue2 = optionStatus.getRawValue()) == null) ? "UNKNOWN" : rawValue2;
            com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod transferMethod = option.getTransferMethod();
            java.lang.String str6 = (transferMethod == null || (rawValue = transferMethod.getRawValue()) == null) ? "UNKNOWN" : rawValue;
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.DisplayFee displayFee2 = option.getDisplayFee();
            if (displayFee2 == null) {
                str2 = id;
                it5 = it13;
                money4 = money18;
                displayFee = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee(kotlin.collections.CollectionsKt.emptyList());
            } else {
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Fee> fees = displayFee2.getFees();
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fees, i));
                java.util.Iterator it14 = fees.iterator();
                while (it14.hasNext()) {
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Fee fee = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Fee) it14.next();
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FeeRate feeRate = fee.getFeeRate();
                    java.lang.String percentFee = feeRate.getPercentFee();
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FixedFee> fixedFees = feeRate.getFixedFees();
                    if (fixedFees != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.util.Iterator<T> it15 = fixedFees.iterator();
                        while (it15.hasNext()) {
                            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney1 onMoney3 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FixedFee) it15.next()).getOnMoney();
                            if (onMoney3 != null) {
                                java.lang.Object currencyCode2 = onMoney3.getCurrencyCode();
                                java.lang.String value = onMoney3.getValue();
                                it11 = it13;
                                java.lang.String obj2 = currencyCode2.toString();
                                it12 = it14;
                                money17 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(obj2, value);
                            } else {
                                it11 = it13;
                                it12 = it14;
                                money17 = null;
                            }
                            if (money17 != null) {
                                arrayList10.add(money17);
                            }
                            it13 = it11;
                            it14 = it12;
                        }
                        it7 = it13;
                        it8 = it14;
                        arrayList5 = arrayList10;
                    } else {
                        it7 = it13;
                        it8 = it14;
                        arrayList5 = null;
                    }
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MinimumFee> minimumFees = feeRate.getMinimumFees();
                    if (minimumFees != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        java.util.Iterator it16 = minimumFees.iterator();
                        while (it16.hasNext()) {
                            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney2 onMoney4 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MinimumFee) it16.next()).getOnMoney();
                            if (onMoney4 != null) {
                                java.lang.Object currencyCode3 = onMoney4.getCurrencyCode();
                                java.lang.String value2 = onMoney4.getValue();
                                it10 = it16;
                                java.lang.String obj3 = currencyCode3.toString();
                                money15 = money18;
                                money16 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(obj3, value2);
                            } else {
                                it10 = it16;
                                money15 = money18;
                                money16 = null;
                            }
                            if (money16 != null) {
                                arrayList11.add(money16);
                            }
                            money18 = money15;
                            it16 = it10;
                        }
                        money13 = money18;
                        arrayList6 = arrayList11;
                    } else {
                        money13 = money18;
                        arrayList6 = null;
                    }
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MaximumFee> maximumFees = feeRate.getMaximumFees();
                    if (maximumFees != null) {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        java.util.Iterator it17 = maximumFees.iterator();
                        while (it17.hasNext()) {
                            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney3 onMoney5 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MaximumFee) it17.next()).getOnMoney();
                            if (onMoney5 != null) {
                                it9 = it17;
                                str4 = id;
                                money14 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney5.getCurrencyCode().toString(), onMoney5.getValue());
                            } else {
                                it9 = it17;
                                str4 = id;
                                money14 = null;
                            }
                            if (money14 != null) {
                                arrayList12.add(money14);
                            }
                            it17 = it9;
                            id = str4;
                        }
                        str3 = id;
                        arrayList7 = arrayList12;
                    } else {
                        str3 = id;
                        arrayList7 = null;
                    }
                    arrayList9.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee(Camera2StreamConfigurationMap(percentFee, arrayList5, arrayList6, arrayList7), fee.getRateType()));
                    money18 = money13;
                    it13 = it7;
                    it14 = it8;
                    id = str3;
                }
                str2 = id;
                it5 = it13;
                money4 = money18;
                displayFee = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee(arrayList9);
            }
            java.util.List<java.lang.Object> supportedCurrencies = option.getSupportedCurrencies();
            if (supportedCurrencies == null) {
                emptyList3 = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List<java.lang.Object> list = supportedCurrencies;
                java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it18 = list.iterator();
                while (it18.hasNext()) {
                    arrayList13.add(it18.next().toString());
                }
                emptyList3 = arrayList13;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Plan plan = option.getPlan();
            java.lang.String id3 = plan.getId();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FundingSource> fundingSources = plan.getFundingSources();
            java.util.ArrayList arrayList14 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, 10));
            java.util.Iterator it19 = fundingSources.iterator();
            while (it19.hasNext()) {
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FundingSource fundingSource = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FundingSource) it19.next();
                java.lang.String rawValue3 = fundingSource.getType().getRawValue();
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Amount1 amount2 = fundingSource.getAmount();
                if (amount2 == null) {
                    money12 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                } else {
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney7 onMoney6 = amount2.getOnMoney();
                    if (onMoney6 == null) {
                        money12 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                    } else {
                        money12 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney6.getCurrencyCode().toString(), onMoney6.getValue());
                    }
                }
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Instrument instrument2 = fundingSource.getInstrument();
                java.lang.String id4 = instrument2.getId();
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnBalance onBalance = instrument2.getOnBalance();
                if (onBalance == null || (available = onBalance.getAvailable()) == null) {
                    it6 = it19;
                    availableBalance = null;
                } else {
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Amount2 amount3 = available.getAmount();
                    it6 = it19;
                    availableBalance = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance(new com.paypal.oslo.feature.wallet.common.domain.model.Money(amount3.getCurrencyCode().toString(), amount3.getValue()));
                }
                arrayList14.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource(rawValue3, money12, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument(id4, availableBalance)));
                it19 = it6;
            }
            java.util.ArrayList arrayList15 = arrayList14;
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PaymentDelivery paymentDelivery = plan.getPaymentDelivery();
            int i2 = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.GetWithdrawalOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[paymentDelivery.getSpeed().ordinal()];
            if (i2 == 1) {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT;
            } else if (i2 == 2) {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            } else {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            }
            java.lang.Object minimumDuration = paymentDelivery.getMinimumDuration();
            java.lang.String obj4 = minimumDuration != null ? minimumDuration.toString() : null;
            if (obj4 == null) {
                obj4 = "";
            }
            java.lang.Object maximumDuration = paymentDelivery.getMaximumDuration();
            java.lang.String obj5 = maximumDuration != null ? maximumDuration.toString() : null;
            if (obj5 == null) {
                obj5 = "";
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PaymentDelivery paymentDelivery2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PaymentDelivery(transferSpeed, obj4, obj5);
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.AmountsBreakdown amountsBreakdown = plan.getAmountsBreakdown();
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney8 onMoney7 = amountsBreakdown.getTotalAmount().getOnMoney();
            if (onMoney7 == null) {
                money5 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
            } else {
                money5 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney7.getCurrencyCode().toString(), onMoney7.getValue());
            }
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney9 onMoney8 = amountsBreakdown.getNetAmount().getOnMoney();
            if (onMoney8 == null) {
                money6 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
            } else {
                money6 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney8.getCurrencyCode().toString(), onMoney8.getValue());
            }
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney10 onMoney9 = amountsBreakdown.getTotalFee().getOnMoney();
            if (onMoney9 == null) {
                money7 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
            } else {
                money7 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney9.getCurrencyCode().toString(), onMoney9.getValue());
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown amountsBreakdown2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown(money5, money6, money7);
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.CurrencyExchange currencyExchange2 = plan.getCurrencyExchange();
            if (currencyExchange2 != null) {
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney11 onMoney10 = currencyExchange2.getAmountFrom().getOnMoney();
                if (onMoney10 == null) {
                    money8 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                } else {
                    money8 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney10.getCurrencyCode().toString(), onMoney10.getValue());
                }
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney12 onMoney11 = currencyExchange2.getAmountTo().getOnMoney();
                if (onMoney11 == null) {
                    money9 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                } else {
                    money9 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney11.getCurrencyCode().toString(), onMoney11.getValue());
                }
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.ExchangeRate exchangeRate = currencyExchange2.getExchangeRate();
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney13 onMoney12 = exchangeRate.getFromCurrency().getOnMoney();
                if (onMoney12 == null) {
                    arrayList4 = arrayList8;
                    money10 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                } else {
                    arrayList4 = arrayList8;
                    money10 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney12.getCurrencyCode().toString(), onMoney12.getValue());
                }
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney14 onMoney13 = exchangeRate.getToCurrency().getOnMoney();
                if (onMoney13 == null) {
                    money11 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("", androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                } else {
                    money11 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney13.getCurrencyCode().toString(), onMoney13.getValue());
                }
                currencyExchange = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CurrencyExchange(money8, money9, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.ExchangeRate(money10, money11));
            } else {
                arrayList4 = arrayList8;
                currencyExchange = null;
            }
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Destination destination = plan.getDestination();
            if (destination != null && (instrument = destination.getInstrument()) != null) {
                if (instrument.getOnBankAccount() != null) {
                    java.lang.String id5 = instrument.getOnBankAccount().getId();
                    java.lang.String lastNChars = instrument.getOnBankAccount().getLastNChars();
                    java.lang.Object currencyCode4 = instrument.getOnBankAccount().getCurrencyCode();
                    java.lang.String obj6 = currencyCode4 != null ? currencyCode4.toString() : null;
                    java.lang.String str7 = obj6 == null ? "" : obj6;
                    java.lang.String rawValue4 = instrument.getOnBankAccount().getType().getRawValue();
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankName bankName = instrument.getOnBankAccount().getBankName();
                    com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName2 = bankName != null ? new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName(bankName.getBusinessName()) : null;
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages = instrument.getOnBankAccount().getBankAccountInstitutionImages();
                    unknown = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount(id5, lastNChars, str7, rawValue4, bankName2, (bankAccountInstitutionImages == null || (bankAccountInstitutionImage = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountInstitutionImages)) == null || (url2 = bankAccountInstitutionImage.getUrl()) == null) ? null : url2.toString());
                } else if (instrument.getOnCard() != null) {
                    java.lang.String id6 = instrument.getOnCard().getId();
                    java.lang.String lastNChars2 = instrument.getOnCard().getLastNChars();
                    java.lang.Object currencyCode5 = instrument.getOnCard().getCurrencyCode();
                    java.lang.String obj7 = currencyCode5 != null ? currencyCode5.toString() : null;
                    java.lang.String str8 = obj7 == null ? "" : obj7;
                    java.lang.Object expirationDate = instrument.getOnCard().getExpirationDate();
                    java.lang.String obj8 = expirationDate != null ? expirationDate.toString() : null;
                    java.lang.String rawValue5 = instrument.getOnCard().getBrand().getRawValue();
                    com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = instrument.getOnCard().getProductClass();
                    java.lang.String rawValue6 = productClass != null ? productClass.getRawValue() : null;
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Issuer issuer = instrument.getOnCard().getIssuer();
                    if (issuer != null) {
                        java.lang.String name2 = issuer.getName();
                        if (name2 == null) {
                            name2 = "";
                        }
                        java.lang.Object countryCode = issuer.getCountryCode();
                        java.lang.String obj9 = countryCode != null ? countryCode.toString() : null;
                        if (obj9 == null) {
                            obj9 = "";
                        }
                        java.lang.String issuerProductDescription = issuer.getIssuerProductDescription();
                        if (issuerProductDescription == null) {
                            issuerProductDescription = "";
                        }
                        cardIssuer2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer(name2, obj9, issuerProductDescription);
                    } else {
                        cardIssuer2 = null;
                    }
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.CardArt cardArt = instrument.getOnCard().getCardArt();
                    unknown = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card(id6, lastNChars2, str8, obj8, rawValue5, rawValue6, cardIssuer2, (cardArt == null || (primaryImage2 = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath2 = primaryImage2.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath2.toString());
                } else {
                    unknown = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown.INSTANCE;
                }
                if (unknown != null) {
                    arrayList8 = arrayList4;
                    arrayList8.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption(id2, str5, str6, displayFee, emptyList3, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan(id3, arrayList15, paymentDelivery2, amountsBreakdown2, currencyExchange, unknown)));
                    money18 = money4;
                    it13 = it5;
                    id = str2;
                    i = 10;
                }
            }
            unknown = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown.INSTANCE;
            arrayList8 = arrayList4;
            arrayList8.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption(id2, str5, str6, displayFee, emptyList3, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan(id3, arrayList15, paymentDelivery2, amountsBreakdown2, currencyExchange, unknown)));
            money18 = money4;
            it13 = it5;
            id = str2;
            i = 10;
        }
        java.lang.String str9 = id;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money19 = money18;
        java.util.ArrayList arrayList16 = arrayList8;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Preference> preferences = withdrawalOption.getPreferences();
        if (preferences == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Preference> list2 = preferences;
            java.util.ArrayList arrayList17 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Preference preference : list2) {
                java.lang.String rawValue7 = preference.getName().getRawValue();
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.TransferPreference transferPreference = preference.getTransferPreference();
                arrayList17.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference(rawValue7, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.TransferPreference(transferPreference.getId(), transferPreference.getTransferMode().getRawValue())));
            }
            emptyList = arrayList17;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PotentialInstrument> potentialInstruments = withdrawalOption.getPotentialInstruments();
        java.util.ArrayList arrayList18 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(potentialInstruments, 10));
        java.util.Iterator it20 = potentialInstruments.iterator();
        while (it20.hasNext()) {
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PotentialInstrument potentialInstrument = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.PotentialInstrument) it20.next();
            java.lang.String rawValue8 = potentialInstrument.getType().getRawValue();
            java.lang.String cardType = potentialInstrument.getCardType();
            java.lang.String cardBrand = potentialInstrument.getCardBrand();
            java.lang.Object currencyCode6 = potentialInstrument.getCurrencyCode();
            java.lang.String obj10 = currencyCode6 != null ? currencyCode6.toString() : null;
            java.lang.String str10 = obj10 == null ? "" : obj10;
            java.lang.Object countryCode2 = potentialInstrument.getCountryCode();
            java.lang.String obj11 = countryCode2 != null ? countryCode2.toString() : null;
            java.lang.String str11 = obj11 == null ? "" : obj11;
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.EstimatedWithdrawalTime estimatedWithdrawalTime = potentialInstrument.getEstimatedWithdrawalTime();
            java.lang.Object minDuration = estimatedWithdrawalTime.getMinDuration();
            java.lang.String obj12 = minDuration != null ? minDuration.toString() : null;
            if (obj12 == null) {
                obj12 = "";
            }
            java.lang.Object maxDuration = estimatedWithdrawalTime.getMaxDuration();
            java.lang.String obj13 = maxDuration != null ? maxDuration.toString() : null;
            if (obj13 == null) {
                obj13 = "";
            }
            java.lang.Object maxFundsTransferTime = estimatedWithdrawalTime.getMaxFundsTransferTime();
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime estimatedWithdrawalTime2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime(obj12, obj13, maxFundsTransferTime != null ? maxFundsTransferTime.toString() : null);
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Fee2> fees2 = potentialInstrument.getDisplayFee().getFees();
            java.util.ArrayList arrayList19 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fees2, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Fee2 fee2 : fees2) {
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FeeRate2 feeRate2 = fee2.getFeeRate();
                java.lang.String percentFee2 = feeRate2.getPercentFee();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FixedFee2> fixedFees2 = feeRate2.getFixedFees();
                if (fixedFees2 != null) {
                    java.util.ArrayList arrayList20 = new java.util.ArrayList();
                    java.util.Iterator<T> it21 = fixedFees2.iterator();
                    while (it21.hasNext()) {
                        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney15 onMoney14 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.FixedFee2) it21.next()).getOnMoney();
                        if (onMoney14 != null) {
                            it4 = it20;
                            money3 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney14.getCurrencyCode().toString(), onMoney14.getValue());
                        } else {
                            it4 = it20;
                            money3 = null;
                        }
                        if (money3 != null) {
                            arrayList20.add(money3);
                        }
                        it20 = it4;
                    }
                    it = it20;
                    arrayList = arrayList20;
                } else {
                    it = it20;
                    arrayList = null;
                }
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MinimumFee2> minimumFees2 = feeRate2.getMinimumFees();
                if (minimumFees2 != null) {
                    java.util.ArrayList arrayList21 = new java.util.ArrayList();
                    java.util.Iterator it22 = minimumFees2.iterator();
                    while (it22.hasNext()) {
                        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney16 onMoney15 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MinimumFee2) it22.next()).getOnMoney();
                        if (onMoney15 != null) {
                            it3 = it22;
                            money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney15.getCurrencyCode().toString(), onMoney15.getValue());
                        } else {
                            it3 = it22;
                            money2 = null;
                        }
                        if (money2 != null) {
                            arrayList21.add(money2);
                        }
                        it22 = it3;
                    }
                    arrayList2 = arrayList21;
                } else {
                    arrayList2 = null;
                }
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MaximumFee2> maximumFees2 = feeRate2.getMaximumFees();
                if (maximumFees2 != null) {
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.util.Iterator it23 = maximumFees2.iterator();
                    while (it23.hasNext()) {
                        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney17 onMoney16 = ((com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.MaximumFee2) it23.next()).getOnMoney();
                        if (onMoney16 != null) {
                            it2 = it23;
                            money = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney16.getCurrencyCode().toString(), onMoney16.getValue());
                        } else {
                            it2 = it23;
                            money = null;
                        }
                        if (money != null) {
                            arrayList22.add(money);
                        }
                        it23 = it2;
                    }
                    arrayList3 = arrayList22;
                } else {
                    arrayList3 = null;
                }
                arrayList19.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee(Camera2StreamConfigurationMap(percentFee2, arrayList, arrayList2, arrayList3), fee2.getRateType()));
                it20 = it;
            }
            java.util.Iterator it24 = it20;
            com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee3 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee(arrayList19);
            java.lang.String rawValue9 = potentialInstrument.getTransferMethod().getRawValue();
            java.lang.String rawValue10 = potentialInstrument.getTransferMode().getRawValue();
            java.util.List<java.lang.Object> supportedCurrencies2 = potentialInstrument.getSupportedCurrencies();
            java.util.ArrayList arrayList23 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedCurrencies2, 10));
            java.util.Iterator<T> it25 = supportedCurrencies2.iterator();
            while (it25.hasNext()) {
                arrayList23.add(it25.next().toString());
            }
            java.util.ArrayList arrayList24 = arrayList23;
            com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.OnMoney21 onMoney17 = potentialInstrument.getEstimatedAmountBreakdown().getTotalFee().getOnMoney();
            arrayList18.add(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument(rawValue8, cardType, cardBrand, str10, str11, estimatedWithdrawalTime2, displayFee3, rawValue9, rawValue10, arrayList24, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown(onMoney17 != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney17.getCurrencyCode().toString(), onMoney17.getValue()) : null)));
            it20 = it24;
        }
        java.util.ArrayList arrayList25 = arrayList18;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.IneligibleInstrument> ineligibleInstruments = withdrawalOption.getIneligibleInstruments();
        if (ineligibleInstruments == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.IneligibleInstrument> list3 = ineligibleInstruments;
            java.util.ArrayList arrayList26 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.IneligibleInstrument ineligibleInstrument : list3) {
                if (ineligibleInstrument.getOnBankAccount() != null) {
                    java.lang.String id7 = ineligibleInstrument.getOnBankAccount().getId();
                    java.lang.String lastNChars3 = ineligibleInstrument.getOnBankAccount().getLastNChars();
                    java.lang.String rawValue11 = ineligibleInstrument.getOnBankAccount().getType().getRawValue();
                    com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName bankName3 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.BankName(ineligibleInstrument.getOnBankAccount().getBankAccountIssuer().getName());
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage1> bankAccountInstitutionImages2 = ineligibleInstrument.getOnBankAccount().getBankAccountInstitutionImages();
                    destinationInstrument = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.BankAccount(id7, lastNChars3, "", rawValue11, bankName3, (bankAccountInstitutionImages2 == null || (bankAccountInstitutionImage1 = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.BankAccountInstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountInstitutionImages2)) == null || (url = bankAccountInstitutionImage1.getUrl()) == null) ? null : url.toString());
                } else if (ineligibleInstrument.getOnCard() != null) {
                    java.lang.String id8 = ineligibleInstrument.getOnCard().getId();
                    java.lang.String lastNChars4 = ineligibleInstrument.getOnCard().getLastNChars();
                    java.lang.String rawValue12 = ineligibleInstrument.getOnCard().getBrand().getRawValue();
                    com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass2 = ineligibleInstrument.getOnCard().getProductClass();
                    java.lang.String rawValue13 = productClass2 != null ? productClass2.getRawValue() : null;
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.CardIssuer cardIssuer3 = ineligibleInstrument.getOnCard().getCardIssuer();
                    if (cardIssuer3 != null) {
                        java.lang.String name3 = cardIssuer3.getName();
                        if (name3 == null) {
                            name3 = "";
                        }
                        java.lang.String issuerProductDescription2 = cardIssuer3.getIssuerProductDescription();
                        if (issuerProductDescription2 == null) {
                            issuerProductDescription2 = "";
                        }
                        cardIssuer = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer(name3, "", issuerProductDescription2);
                    } else {
                        cardIssuer = null;
                    }
                    com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.CardArt1 cardArt2 = ineligibleInstrument.getOnCard().getCardArt();
                    destinationInstrument = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Card(id8, lastNChars4, "", null, rawValue12, rawValue13, cardIssuer, (cardArt2 == null || (primaryImage = cardArt2.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString(), 8, null);
                } else {
                    destinationInstrument = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument.Unknown.INSTANCE;
                }
                arrayList26.add(destinationInstrument);
            }
            emptyList2 = arrayList26;
        }
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult(str9, money19, arrayList16, emptyList, arrayList25, emptyList2);
    }

    private static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate Camera2StreamConfigurationMap(java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list2, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list3) {
        if (str == null) {
            str = "";
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if (list2 == null) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        if (list3 == null) {
            list3 = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate(str, list, list2, list3);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
