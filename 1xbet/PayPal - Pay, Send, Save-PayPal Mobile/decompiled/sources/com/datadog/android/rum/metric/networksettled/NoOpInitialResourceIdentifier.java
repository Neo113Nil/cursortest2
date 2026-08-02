package com.datadog.android.rum.metric.networksettled;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/metric/networksettled/NoOpInitialResourceIdentifier;", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "<init>", "()V", "Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;", "context", "", "validate", "(Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpInitialResourceIdentifier implements com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier {
    @Override // com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier
    public final boolean validate(com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return false;
    }
}
