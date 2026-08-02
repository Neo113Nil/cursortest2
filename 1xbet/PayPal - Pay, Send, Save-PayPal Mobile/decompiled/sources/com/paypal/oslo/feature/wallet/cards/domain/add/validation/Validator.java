package com.paypal.oslo.feature.wallet.cards.domain.add.validation;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J=\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/Validator;", "T", "", "input", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule;", "rules", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/rule/Rule$ValidationResult;", "validate", "(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Validator<T> {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<T>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator<T> validator, T t, java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<T>> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            return com.paypal.oslo.feature.wallet.cards.domain.add.validation.Validator.super.validate(t, set);
        }
    }

    default java.util.Map<com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<T>, com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule.ValidationResult> validate(T input, java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<T>> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        java.util.Set<? extends com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule<T>> set = rules;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (T t : set) {
            linkedHashMap.put(t, ((com.paypal.oslo.feature.wallet.cards.domain.add.validation.rule.Rule) t).validate(input));
        }
        return linkedHashMap;
    }
}
