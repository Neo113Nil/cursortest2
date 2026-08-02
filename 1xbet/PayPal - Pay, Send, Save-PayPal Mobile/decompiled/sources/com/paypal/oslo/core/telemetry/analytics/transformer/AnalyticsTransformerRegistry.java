package com.paypal.oslo.core.telemetry.analytics.transformer;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "", "T", "", "contexts", "transform", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AnalyticsTransformerRegistry {
    <T> T transform(java.util.List<? extends java.lang.Object> contexts);
}
