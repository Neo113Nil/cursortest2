package org.modelmapper;

import org.modelmapper.internal.util.Assert;

/* loaded from: classes4.dex */
public abstract class AbstractCondition<S, D> implements Condition<S, D> {
    public Condition<S, D> and(Condition<S, D> condition) {
        Assert.notNull(condition, "condition");
        return Conditions.and(this, condition);
    }

    public Condition<S, D> or(Condition<S, D> condition) {
        Assert.notNull(condition, "condition");
        return Conditions.or(this, condition);
    }
}
