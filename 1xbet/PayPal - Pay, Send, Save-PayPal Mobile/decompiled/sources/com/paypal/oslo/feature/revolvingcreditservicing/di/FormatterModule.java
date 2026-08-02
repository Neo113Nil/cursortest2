package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/FormatterModule;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/date/DateFormatterFacadeImpl;", "implementation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "bindDateFormatterFacade", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/date/DateFormatterFacadeImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/currency/CurrencyFormatterFacadeImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "bindDateCurrencyFacade", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/currency/CurrencyFormatterFacadeImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/phone/PhoneNumberFormatterFacadeImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "bindPhoneNumberFormatterFacade", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/phone/PhoneNumberFormatterFacadeImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface FormatterModule {
    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade bindDateCurrencyFacade(com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl implementation);

    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade bindDateFormatterFacade(com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl implementation);

    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade bindPhoneNumberFormatterFacade(com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone.PhoneNumberFormatterFacadeImpl implementation);
}
