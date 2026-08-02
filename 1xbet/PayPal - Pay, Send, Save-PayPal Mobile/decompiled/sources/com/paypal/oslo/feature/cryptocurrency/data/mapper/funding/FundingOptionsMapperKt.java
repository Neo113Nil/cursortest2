package com.paypal.oslo.feature.cryptocurrency.data.mapper.funding;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyEligibleFundingOptionsMutation$Data;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyEligibleFundingOptionsMutation$Data;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x031a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x030d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Data data) {
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption fundingOption;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata4;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt4;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata5;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt5;
        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.TotalAmount totalAmount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.FundingOption> fundingOptions = data.getEvaluateCryptocurrencyEligibleFundingOptions().getFundingOptions();
        java.util.ArrayList arrayList3 = null;
        if (fundingOptions != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.FundingOption fundingOption2 : fundingOptions) {
                java.lang.String id = fundingOption2.getId();
                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.AmountBreakdown amountBreakdown = fundingOption2.getAmountBreakdown();
                java.lang.String value = (amountBreakdown == null || (totalAmount = amountBreakdown.getTotalAmount()) == null) ? null : totalAmount.getValue();
                if (id == null || value == null) {
                    fundingOption = null;
                } else {
                    java.lang.String obj2 = fundingOption2.getAmountBreakdown().getTotalAmount().getCurrencyCode().toString();
                    java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.FundingSource> fundingSources = fundingOption2.getFundingSources();
                    if (fundingSources != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        for (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.FundingSource fundingSource : fundingSources) {
                            java.lang.String id2 = fundingSource.getId();
                            if (id2 == null) {
                                obj = null;
                            } else if (fundingSource.getOnCryptocurrencyEligibleBalanceFundingSource() != null) {
                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.OnCryptocurrencyEligibleBalanceFundingSource onCryptocurrencyEligibleBalanceFundingSource = fundingSource.getOnCryptocurrencyEligibleBalanceFundingSource();
                                java.lang.String id3 = onCryptocurrencyEligibleBalanceFundingSource.getId();
                                if (id3 != null) {
                                    id2 = id3;
                                }
                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata1 instrumentMetadata6 = onCryptocurrencyEligibleBalanceFundingSource.getInstrumentMetadata();
                                if (instrumentMetadata6 == null) {
                                    instrumentMetadata5 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(null, null, null);
                                } else {
                                    java.lang.String displayType = instrumentMetadata6.getDisplayType();
                                    java.lang.String displayBrand = instrumentMetadata6.getDisplayBrand();
                                    com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentArt instrumentArt6 = instrumentMetadata6.getInstrumentArt();
                                    if (instrumentArt6 != null) {
                                        java.lang.Object smallImageUrl = instrumentArt6.getSmallImageUrl();
                                        java.lang.String obj3 = smallImageUrl != null ? smallImageUrl.toString() : null;
                                        java.lang.Object largeImageUrl = instrumentArt6.getLargeImageUrl();
                                        instrumentArt5 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(obj3, largeImageUrl != null ? largeImageUrl.toString() : null);
                                    } else {
                                        instrumentArt5 = null;
                                    }
                                    instrumentMetadata5 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType, displayBrand, instrumentArt5);
                                }
                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Amount amount = onCryptocurrencyEligibleBalanceFundingSource.getAmount();
                                obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance(id2, id, instrumentMetadata5, amount != null ? new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(amount.getValue(), amount.getCurrencyCode().toString()) : null);
                            } else if (fundingSource.getOnCryptocurrencyEligibleBankFundingSource() != null) {
                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.OnCryptocurrencyEligibleBankFundingSource onCryptocurrencyEligibleBankFundingSource = fundingSource.getOnCryptocurrencyEligibleBankFundingSource();
                                java.lang.String id4 = onCryptocurrencyEligibleBankFundingSource.getId();
                                if (id4 != null) {
                                    id2 = id4;
                                }
                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata2 instrumentMetadata7 = onCryptocurrencyEligibleBankFundingSource.getInstrumentMetadata();
                                if (instrumentMetadata7 == null) {
                                    instrumentMetadata4 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(null, null, null);
                                } else {
                                    java.lang.String displayType2 = instrumentMetadata7.getDisplayType();
                                    java.lang.String displayBrand2 = instrumentMetadata7.getDisplayBrand();
                                    com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentArt1 instrumentArt7 = instrumentMetadata7.getInstrumentArt();
                                    if (instrumentArt7 != null) {
                                        java.lang.Object smallImageUrl2 = instrumentArt7.getSmallImageUrl();
                                        java.lang.String obj4 = smallImageUrl2 != null ? smallImageUrl2.toString() : null;
                                        java.lang.Object largeImageUrl2 = instrumentArt7.getLargeImageUrl();
                                        instrumentArt4 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(obj4, largeImageUrl2 != null ? largeImageUrl2.toString() : null);
                                    } else {
                                        instrumentArt4 = null;
                                    }
                                    instrumentMetadata4 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType2, displayBrand2, instrumentArt4);
                                }
                                java.lang.String lastDigits = onCryptocurrencyEligibleBankFundingSource.getLastDigits();
                                if (lastDigits == null) {
                                    lastDigits = "";
                                }
                                obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank(id2, id, instrumentMetadata4, lastDigits);
                            } else {
                                if (fundingSource.getOnCryptocurrencyEligibleCardFundingSource() != null) {
                                    com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.OnCryptocurrencyEligibleCardFundingSource onCryptocurrencyEligibleCardFundingSource = fundingSource.getOnCryptocurrencyEligibleCardFundingSource();
                                    java.lang.String id5 = onCryptocurrencyEligibleCardFundingSource.getId();
                                    if (id5 != null) {
                                        id2 = id5;
                                    }
                                    com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata3 instrumentMetadata8 = onCryptocurrencyEligibleCardFundingSource.getInstrumentMetadata();
                                    if (instrumentMetadata8 == null) {
                                        instrumentMetadata3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(null, null, null);
                                    } else {
                                        java.lang.String displayType3 = instrumentMetadata8.getDisplayType();
                                        java.lang.String displayBrand3 = instrumentMetadata8.getDisplayBrand();
                                        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentArt2 instrumentArt8 = instrumentMetadata8.getInstrumentArt();
                                        if (instrumentArt8 != null) {
                                            java.lang.Object smallImageUrl3 = instrumentArt8.getSmallImageUrl();
                                            java.lang.String obj5 = smallImageUrl3 != null ? smallImageUrl3.toString() : null;
                                            java.lang.Object largeImageUrl3 = instrumentArt8.getLargeImageUrl();
                                            instrumentArt3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(obj5, largeImageUrl3 != null ? largeImageUrl3.toString() : null);
                                        } else {
                                            instrumentArt3 = null;
                                        }
                                        instrumentMetadata3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType3, displayBrand3, instrumentArt3);
                                    }
                                    com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata9 = instrumentMetadata3;
                                    java.lang.String lastNChars = onCryptocurrencyEligibleCardFundingSource.getLastNChars();
                                    java.lang.String str7 = lastNChars == null ? "" : lastNChars;
                                    java.lang.String type = onCryptocurrencyEligibleCardFundingSource.getType();
                                    java.lang.String str8 = type == null ? "" : type;
                                    com.paypal.oslo.api.graphql.schema.type.CardBrand brand = onCryptocurrencyEligibleCardFundingSource.getBrand();
                                    java.lang.String rawValue = brand != null ? brand.getRawValue() : null;
                                    java.lang.String str9 = rawValue == null ? "" : rawValue;
                                    java.lang.Object currencyCode = onCryptocurrencyEligibleCardFundingSource.getCurrencyCode();
                                    java.lang.String obj6 = currencyCode != null ? currencyCode.toString() : null;
                                    arrayList2 = arrayList5;
                                    str4 = obj2;
                                    str5 = value;
                                    obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card(id2, id, instrumentMetadata9, str7, str8, str9, obj6 != null ? obj6 : "", null, null, 384, null);
                                    str6 = id;
                                } else {
                                    arrayList2 = arrayList5;
                                    str4 = obj2;
                                    str5 = value;
                                    java.lang.String str10 = id;
                                    if (fundingSource.getOnCryptocurrencyEligiblePaymentTokenFundingSource() != null) {
                                        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.OnCryptocurrencyEligiblePaymentTokenFundingSource onCryptocurrencyEligiblePaymentTokenFundingSource = fundingSource.getOnCryptocurrencyEligiblePaymentTokenFundingSource();
                                        java.lang.String id6 = onCryptocurrencyEligiblePaymentTokenFundingSource.getId();
                                        if (id6 != null) {
                                            id2 = id6;
                                        }
                                        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata4 instrumentMetadata10 = onCryptocurrencyEligiblePaymentTokenFundingSource.getInstrumentMetadata();
                                        if (instrumentMetadata10 == null) {
                                            instrumentMetadata2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(null, null, null);
                                        } else {
                                            java.lang.String displayType4 = instrumentMetadata10.getDisplayType();
                                            java.lang.String displayBrand4 = instrumentMetadata10.getDisplayBrand();
                                            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentArt3 instrumentArt9 = instrumentMetadata10.getInstrumentArt();
                                            if (instrumentArt9 != null) {
                                                java.lang.Object smallImageUrl4 = instrumentArt9.getSmallImageUrl();
                                                java.lang.String obj7 = smallImageUrl4 != null ? smallImageUrl4.toString() : null;
                                                java.lang.Object largeImageUrl4 = instrumentArt9.getLargeImageUrl();
                                                instrumentArt2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(obj7, largeImageUrl4 != null ? largeImageUrl4.toString() : null);
                                            } else {
                                                instrumentArt2 = null;
                                            }
                                            instrumentMetadata2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType4, displayBrand4, instrumentArt2);
                                        }
                                        str6 = str10;
                                        obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken(id2, str6, instrumentMetadata2);
                                    } else {
                                        str6 = str10;
                                        if (fundingSource.getOnCryptocurrencyFundingSource() != null) {
                                            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.OnCryptocurrencyFundingSource onCryptocurrencyFundingSource = fundingSource.getOnCryptocurrencyFundingSource();
                                            java.lang.String id7 = onCryptocurrencyFundingSource.getId();
                                            if (id7 != null) {
                                                id2 = id7;
                                            }
                                            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata5 instrumentMetadata11 = onCryptocurrencyFundingSource.getInstrumentMetadata();
                                            if (instrumentMetadata11 == null) {
                                                instrumentMetadata = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(null, null, null);
                                            } else {
                                                java.lang.String displayType5 = instrumentMetadata11.getDisplayType();
                                                java.lang.String displayBrand5 = instrumentMetadata11.getDisplayBrand();
                                                com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentArt4 instrumentArt10 = instrumentMetadata11.getInstrumentArt();
                                                if (instrumentArt10 != null) {
                                                    java.lang.Object smallImageUrl5 = instrumentArt10.getSmallImageUrl();
                                                    java.lang.String obj8 = smallImageUrl5 != null ? smallImageUrl5.toString() : null;
                                                    java.lang.Object largeImageUrl5 = instrumentArt10.getLargeImageUrl();
                                                    instrumentArt = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(obj8, largeImageUrl5 != null ? largeImageUrl5.toString() : null);
                                                } else {
                                                    instrumentArt = null;
                                                }
                                                instrumentMetadata = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType5, displayBrand5, instrumentArt);
                                            }
                                            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata12 = instrumentMetadata;
                                            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.Amount1 amount2 = onCryptocurrencyFundingSource.getAmount();
                                            obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto(id2, str6, instrumentMetadata12, amount2 != null ? new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(amount2.getValue(), amount2.getCurrencyCode().toString()) : null, onCryptocurrencyFundingSource.getAssetSymbol().getRawValue(), onCryptocurrencyFundingSource.getQuantity());
                                        } else {
                                            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyEligibleFundingOptionsMutation.InstrumentMetadata instrumentMetadata13 = fundingSource.getInstrumentMetadata();
                                            obj = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) (instrumentMetadata13 != null ? new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken(id2, str6, new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(instrumentMetadata13.getDisplayType(), instrumentMetadata13.getDisplayBrand(), null)) : null);
                                        }
                                    }
                                }
                                if (obj == null) {
                                    java.util.ArrayList arrayList6 = arrayList2;
                                    arrayList6.add(obj);
                                    id = str6;
                                    obj2 = str4;
                                    value = str5;
                                    arrayList5 = arrayList6;
                                } else {
                                    id = str6;
                                    arrayList5 = arrayList2;
                                    obj2 = str4;
                                    value = str5;
                                }
                            }
                            arrayList2 = arrayList5;
                            str4 = obj2;
                            str5 = value;
                            str6 = id;
                            if (obj == null) {
                            }
                        }
                        java.util.ArrayList arrayList7 = arrayList5;
                        str = obj2;
                        str2 = value;
                        str3 = id;
                        arrayList = arrayList7;
                    } else {
                        str = obj2;
                        str2 = value;
                        str3 = id;
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    fundingOption = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption(str3, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(str2, str), arrayList);
                }
                if (fundingOption != null) {
                    arrayList4.add(fundingOption);
                }
            }
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3;
    }
}
