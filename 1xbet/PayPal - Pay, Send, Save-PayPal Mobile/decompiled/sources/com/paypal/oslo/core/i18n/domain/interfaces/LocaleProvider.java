package com.paypal.oslo.core.i18n.domain.interfaces;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use app-identity module's LocaleInformation interface instead.", replaceWith = @kotlin.ReplaceWith(expression = "LocaleInformation", imports = {"com.paypal.oslo.core.appidentity.domain.LocaleInformation"}))
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LocaleProvider {
    java.util.Locale getUserLocale();
}
