package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "", "", "fieldId", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "canHandleField", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfigSectionFieldResolver {
    boolean canHandleField(java.lang.String fieldId);

    java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue);

    boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue);
}
