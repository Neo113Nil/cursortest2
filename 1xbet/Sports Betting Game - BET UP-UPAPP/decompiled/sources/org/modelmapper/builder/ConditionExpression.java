package org.modelmapper.builder;

import org.modelmapper.Condition;

/* loaded from: classes4.dex */
public interface ConditionExpression<S, D> extends ProviderExpression<S, D> {
    ConditionExpression<S, D> when(Condition<?, ?> condition);
}
