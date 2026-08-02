package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0081\b\u0018\u0000 s2\u00020\u0001:\u0002tsBÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"Bï\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010.J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u0010.J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u0010.J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u0010.J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u0010.J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u0010.J\u0012\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b:\u00104J\u0012\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b;\u00104J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u008a\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bK\u0010*J\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010(J'\u0010S\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0001¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bX\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010Y\u001a\u0004\bZ\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b\u000b\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\b^\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010[\u001a\u0004\b_\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010`\u001a\u0004\ba\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010`\u001a\u0004\bb\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\bc\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010[\u001a\u0004\bd\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\be\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\bf\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\bg\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bh\u00104R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010i\u001a\u0004\bj\u0010=R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010?R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010k\u001a\u0004\bm\u0010?R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010BR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010n\u001a\u0004\bp\u0010BR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010q\u001a\u0004\br\u0010E"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "", "", "id", "", "rank", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;", "status", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "payPalBalanceFundingSource", "", "isPPBalanceOptOutDefaultPlan", "fundingInstruments", "chargeableFundingSourceInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "currencyConversionInOptOut", "currencyConversionOverrideInOptOut", "currencyOverridePayPalBalanceFundingSource", "currencyOverrideFundingInstrument", "currencyOverrideDisallowedFundingSource", "currencyOverrideChargeableFundingInstrument", "currencyConversion", "currencyConversionOverride", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "currencyConverterOptions", "currencyConversionProvider", "currencyConversionProviderInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "contingency", "contingencyInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "feeAmount", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;ZLcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Ljava/util/List;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;ZLcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Ljava/util/List;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;", "component4", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "component5", "()Z", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/util/List;", "component17", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "component18", "component19", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "component20", "component21", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "copy", "(Ljava/lang/String;ILcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;ZLcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Ljava/util/List;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;)Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", com.visa.cbp.getEncExpo.warmup, "getRank", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;", "getStatus", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "getPayPalBalanceFundingSource", "Z", "getFundingInstruments", "getChargeableFundingSourceInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "getCurrencyConversionInOptOut", "getCurrencyConversionOverrideInOptOut", "getCurrencyOverridePayPalBalanceFundingSource", "getCurrencyOverrideFundingInstrument", "getCurrencyOverrideDisallowedFundingSource", "getCurrencyOverrideChargeableFundingInstrument", "getCurrencyConversion", "getCurrencyConversionOverride", "Ljava/util/List;", "getCurrencyConverterOptions", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "getCurrencyConversionProvider", "getCurrencyConversionProviderInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "getContingency", "getContingencyInOptOut", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "getFeeAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingPlan {
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource chargeableFundingSourceInOptOut;
    private final com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency;
    private final com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingencyInOptOut;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionInOptOut;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverride;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverrideInOptOut;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProvider;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProviderInOptOut;
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> currencyConverterOptions;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideChargeableFundingInstrument;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideDisallowedFundingSource;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideFundingInstrument;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverridePayPalBalanceFundingSource;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingInstruments;
    private final java.lang.String id;
    private final boolean isPPBalanceOptOutDefaultPlan;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource payPalBalanceFundingSource;
    private final int rank;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.$r8$lambda$7_rLpZ0OS5XV7Uvhq6qgno8yHUc();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingPlan(int i, java.lang.String str, int i2, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource, boolean z, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4, java.util.List list, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1048575 != (i & 1048575)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1048575, com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.rank = i2;
        this.status = fundingOptionStatus;
        this.payPalBalanceFundingSource = fundingSource;
        this.isPPBalanceOptOutDefaultPlan = z;
        this.fundingInstruments = fundingSource2;
        this.chargeableFundingSourceInOptOut = fundingSource3;
        this.currencyConversionInOptOut = currencyConversion;
        this.currencyConversionOverrideInOptOut = currencyConversion2;
        this.currencyOverridePayPalBalanceFundingSource = fundingSource4;
        this.currencyOverrideFundingInstrument = fundingSource5;
        this.currencyOverrideDisallowedFundingSource = fundingSource6;
        this.currencyOverrideChargeableFundingInstrument = fundingSource7;
        this.currencyConversion = currencyConversion3;
        this.currencyConversionOverride = currencyConversion4;
        this.currencyConverterOptions = list;
        this.currencyConversionProvider = currencyConverter;
        this.currencyConversionProviderInOptOut = currencyConverter2;
        this.contingency = contingency;
        this.contingencyInOptOut = contingency2;
        this.feeAmount = (i & 1048576) == 0 ? null : qrcMoney;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FundingPlan(java.lang.String str, int i, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource, boolean z, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionStatus, "");
        this.id = str;
        this.rank = i;
        this.status = fundingOptionStatus;
        this.payPalBalanceFundingSource = fundingSource;
        this.isPPBalanceOptOutDefaultPlan = z;
        this.fundingInstruments = fundingSource2;
        this.chargeableFundingSourceInOptOut = fundingSource3;
        this.currencyConversionInOptOut = currencyConversion;
        this.currencyConversionOverrideInOptOut = currencyConversion2;
        this.currencyOverridePayPalBalanceFundingSource = fundingSource4;
        this.currencyOverrideFundingInstrument = fundingSource5;
        this.currencyOverrideDisallowedFundingSource = fundingSource6;
        this.currencyOverrideChargeableFundingInstrument = fundingSource7;
        this.currencyConversion = currencyConversion3;
        this.currencyConversionOverride = currencyConversion4;
        this.currencyConverterOptions = list;
        this.currencyConversionProvider = currencyConverter;
        this.currencyConversionProviderInOptOut = currencyConverter2;
        this.contingency = contingency;
        this.contingencyInOptOut = contingency2;
        this.feeAmount = qrcMoney;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.rank);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.payPalBalanceFundingSource);
        output.encodeBooleanElement(serialDesc, 4, self.isPPBalanceOptOutDefaultPlan);
        output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.fundingInstruments);
        output.encodeNullableSerializableElement(serialDesc, 6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.chargeableFundingSourceInOptOut);
        output.encodeNullableSerializableElement(serialDesc, 7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, self.currencyConversionInOptOut);
        output.encodeNullableSerializableElement(serialDesc, 8, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, self.currencyConversionOverrideInOptOut);
        output.encodeNullableSerializableElement(serialDesc, 9, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.currencyOverridePayPalBalanceFundingSource);
        output.encodeNullableSerializableElement(serialDesc, 10, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.currencyOverrideFundingInstrument);
        output.encodeNullableSerializableElement(serialDesc, 11, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.currencyOverrideDisallowedFundingSource);
        output.encodeNullableSerializableElement(serialDesc, 12, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, self.currencyOverrideChargeableFundingInstrument);
        output.encodeNullableSerializableElement(serialDesc, 13, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, self.currencyConversion);
        output.encodeNullableSerializableElement(serialDesc, 14, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, self.currencyConversionOverride);
        output.encodeNullableSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.currencyConverterOptions);
        output.encodeNullableSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.currencyConversionProvider);
        output.encodeNullableSerializableElement(serialDesc, 17, lazyArr[17].getValue(), self.currencyConversionProviderInOptOut);
        output.encodeNullableSerializableElement(serialDesc, 18, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, self.contingency);
        output.encodeNullableSerializableElement(serialDesc, 19, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, self.contingencyInOptOut);
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.feeAmount != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, self.feeAmount);
        }
    }

    public /* synthetic */ FundingPlan(java.lang.String str, int i, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource, boolean z, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4, java.util.List list, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, fundingOptionStatus, fundingSource, z, fundingSource2, fundingSource3, currencyConversion, currencyConversion2, fundingSource4, fundingSource5, fundingSource6, fundingSource7, currencyConversion3, currencyConversion4, list, currencyConverter, currencyConverter2, contingency, contingency2, (i2 & 1048576) != 0 ? null : qrcMoney);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final int getRank() {
        return this.rank;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getPayPalBalanceFundingSource() {
        return this.payPalBalanceFundingSource;
    }

    public final boolean isPPBalanceOptOutDefaultPlan() {
        return this.isPPBalanceOptOutDefaultPlan;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getChargeableFundingSourceInOptOut() {
        return this.chargeableFundingSourceInOptOut;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionInOptOut() {
        return this.currencyConversionInOptOut;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionOverrideInOptOut() {
        return this.currencyConversionOverrideInOptOut;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverridePayPalBalanceFundingSource() {
        return this.currencyOverridePayPalBalanceFundingSource;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideFundingInstrument() {
        return this.currencyOverrideFundingInstrument;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideDisallowedFundingSource() {
        return this.currencyOverrideDisallowedFundingSource;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideChargeableFundingInstrument() {
        return this.currencyOverrideChargeableFundingInstrument;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversion() {
        return this.currencyConversion;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionOverride() {
        return this.currencyConversionOverride;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> getCurrencyConverterOptions() {
        return this.currencyConverterOptions;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getCurrencyConversionProviderInOptOut() {
        return this.currencyConversionProviderInOptOut;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.Contingency getContingency() {
        return this.contingency;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.Contingency getContingencyInOptOut() {
        return this.contingencyInOptOut;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getFeeAmount() {
        return this.feeAmount;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$7_rLpZ0OS5XV7Uvhq6qgno8yHUc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.INSTANCE.serializer());
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        int i = this.rank;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus = this.status;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource = this.payPalBalanceFundingSource;
        boolean z = this.isPPBalanceOptOutDefaultPlan;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2 = this.fundingInstruments;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3 = this.chargeableFundingSourceInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion = this.currencyConversionInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2 = this.currencyConversionOverrideInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4 = this.currencyOverridePayPalBalanceFundingSource;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5 = this.currencyOverrideFundingInstrument;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6 = this.currencyOverrideDisallowedFundingSource;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7 = this.currencyOverrideChargeableFundingInstrument;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3 = this.currencyConversion;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4 = this.currencyConversionOverride;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list = this.currencyConverterOptions;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = this.currencyConversionProvider;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2 = this.currencyConversionProviderInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency = this.contingency;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2 = this.contingencyInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.feeAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingPlan(id=");
        sb.append(str);
        sb.append(", rank=");
        sb.append(i);
        sb.append(", status=");
        sb.append(fundingOptionStatus);
        sb.append(", payPalBalanceFundingSource=");
        sb.append(fundingSource);
        sb.append(", isPPBalanceOptOutDefaultPlan=");
        sb.append(z);
        sb.append(", fundingInstruments=");
        sb.append(fundingSource2);
        sb.append(", chargeableFundingSourceInOptOut=");
        sb.append(fundingSource3);
        sb.append(", currencyConversionInOptOut=");
        sb.append(currencyConversion);
        sb.append(", currencyConversionOverrideInOptOut=");
        sb.append(currencyConversion2);
        sb.append(", currencyOverridePayPalBalanceFundingSource=");
        sb.append(fundingSource4);
        sb.append(", currencyOverrideFundingInstrument=");
        sb.append(fundingSource5);
        sb.append(", currencyOverrideDisallowedFundingSource=");
        sb.append(fundingSource6);
        sb.append(", currencyOverrideChargeableFundingInstrument=");
        sb.append(fundingSource7);
        sb.append(", currencyConversion=");
        sb.append(currencyConversion3);
        sb.append(", currencyConversionOverride=");
        sb.append(currencyConversion4);
        sb.append(", currencyConverterOptions=");
        sb.append(list);
        sb.append(", currencyConversionProvider=");
        sb.append(currencyConverter);
        sb.append(", currencyConversionProviderInOptOut=");
        sb.append(currencyConverter2);
        sb.append(", contingency=");
        sb.append(contingency);
        sb.append(", contingencyInOptOut=");
        sb.append(contingency2);
        sb.append(", feeAmount=");
        sb.append(qrcMoney);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.rank);
        int hashCode3 = this.status.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource = this.payPalBalanceFundingSource;
        int hashCode4 = fundingSource == null ? 0 : fundingSource.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isPPBalanceOptOutDefaultPlan);
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2 = this.fundingInstruments;
        int hashCode6 = fundingSource2 == null ? 0 : fundingSource2.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3 = this.chargeableFundingSourceInOptOut;
        int hashCode7 = fundingSource3 == null ? 0 : fundingSource3.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion = this.currencyConversionInOptOut;
        int hashCode8 = currencyConversion == null ? 0 : currencyConversion.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2 = this.currencyConversionOverrideInOptOut;
        int hashCode9 = currencyConversion2 == null ? 0 : currencyConversion2.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4 = this.currencyOverridePayPalBalanceFundingSource;
        int hashCode10 = fundingSource4 == null ? 0 : fundingSource4.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5 = this.currencyOverrideFundingInstrument;
        int hashCode11 = fundingSource5 == null ? 0 : fundingSource5.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6 = this.currencyOverrideDisallowedFundingSource;
        int hashCode12 = fundingSource6 == null ? 0 : fundingSource6.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7 = this.currencyOverrideChargeableFundingInstrument;
        int hashCode13 = fundingSource7 == null ? 0 : fundingSource7.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3 = this.currencyConversion;
        int hashCode14 = currencyConversion3 == null ? 0 : currencyConversion3.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4 = this.currencyConversionOverride;
        int hashCode15 = currencyConversion4 == null ? 0 : currencyConversion4.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list = this.currencyConverterOptions;
        int hashCode16 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = this.currencyConversionProvider;
        int hashCode17 = currencyConverter == null ? 0 : currencyConverter.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2 = this.currencyConversionProviderInOptOut;
        int hashCode18 = currencyConverter2 == null ? 0 : currencyConverter2.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency = this.contingency;
        int hashCode19 = contingency == null ? 0 : contingency.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2 = this.contingencyInOptOut;
        int hashCode20 = contingency2 == null ? 0 : contingency2.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.feeAmount;
        return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (qrcMoney != null ? qrcMoney.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingPlan.id) && this.rank == fundingPlan.rank && this.status == fundingPlan.status && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalBalanceFundingSource, fundingPlan.payPalBalanceFundingSource) && this.isPPBalanceOptOutDefaultPlan == fundingPlan.isPPBalanceOptOutDefaultPlan && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, fundingPlan.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.chargeableFundingSourceInOptOut, fundingPlan.chargeableFundingSourceInOptOut) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConversionInOptOut, fundingPlan.currencyConversionInOptOut) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConversionOverrideInOptOut, fundingPlan.currencyConversionOverrideInOptOut) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyOverridePayPalBalanceFundingSource, fundingPlan.currencyOverridePayPalBalanceFundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyOverrideFundingInstrument, fundingPlan.currencyOverrideFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyOverrideDisallowedFundingSource, fundingPlan.currencyOverrideDisallowedFundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyOverrideChargeableFundingInstrument, fundingPlan.currencyOverrideChargeableFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConversion, fundingPlan.currencyConversion) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConversionOverride, fundingPlan.currencyConversionOverride) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConverterOptions, fundingPlan.currencyConverterOptions) && this.currencyConversionProvider == fundingPlan.currencyConversionProvider && this.currencyConversionProviderInOptOut == fundingPlan.currencyConversionProviderInOptOut && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, fundingPlan.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyInOptOut, fundingPlan.contingencyInOptOut) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeAmount, fundingPlan.feeAmount);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan copy(java.lang.String id, int rank, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus status, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource payPalBalanceFundingSource, boolean isPPBalanceOptOutDefaultPlan, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingInstruments, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource chargeableFundingSourceInOptOut, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionInOptOut, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverrideInOptOut, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverridePayPalBalanceFundingSource, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideFundingInstrument, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideDisallowedFundingSource, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource currencyOverrideChargeableFundingInstrument, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverride, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> currencyConverterOptions, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProvider, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProviderInOptOut, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency, com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingencyInOptOut, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, status, payPalBalanceFundingSource, isPPBalanceOptOutDefaultPlan, fundingInstruments, chargeableFundingSourceInOptOut, currencyConversionInOptOut, currencyConversionOverrideInOptOut, currencyOverridePayPalBalanceFundingSource, currencyOverrideFundingInstrument, currencyOverrideDisallowedFundingSource, currencyOverrideChargeableFundingInstrument, currencyConversion, currencyConversionOverride, currencyConverterOptions, currencyConversionProvider, currencyConversionProviderInOptOut, contingency, contingencyInOptOut, feeAmount);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionOverrideInOptOut() {
        return this.currencyConversionOverrideInOptOut;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionInOptOut() {
        return this.currencyConversionInOptOut;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getChargeableFundingSourceInOptOut() {
        return this.chargeableFundingSourceInOptOut;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getFundingInstruments() {
        return this.fundingInstruments;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPPBalanceOptOutDefaultPlan() {
        return this.isPPBalanceOptOutDefaultPlan;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getPayPalBalanceFundingSource() {
        return this.payPalBalanceFundingSource;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component21, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getFeeAmount() {
        return this.feeAmount;
    }

    /* renamed from: component20, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.Contingency getContingencyInOptOut() {
        return this.contingencyInOptOut;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component19, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.Contingency getContingency() {
        return this.contingency;
    }

    /* renamed from: component18, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getCurrencyConversionProviderInOptOut() {
        return this.currencyConversionProviderInOptOut;
    }

    /* renamed from: component17, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> component16() {
        return this.currencyConverterOptions;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversionOverride() {
        return this.currencyConversionOverride;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getCurrencyConversion() {
        return this.currencyConversion;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideChargeableFundingInstrument() {
        return this.currencyOverrideChargeableFundingInstrument;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideDisallowedFundingSource() {
        return this.currencyOverrideDisallowedFundingSource;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverrideFundingInstrument() {
        return this.currencyOverrideFundingInstrument;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource getCurrencyOverridePayPalBalanceFundingSource() {
        return this.currencyOverridePayPalBalanceFundingSource;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
