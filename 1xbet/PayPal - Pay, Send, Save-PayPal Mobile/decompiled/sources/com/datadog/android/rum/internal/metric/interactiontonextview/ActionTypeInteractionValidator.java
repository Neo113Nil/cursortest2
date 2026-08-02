package com.datadog.android.rum.internal.metric.interactiontonextview;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/interactiontonextview/ActionTypeInteractionValidator;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;", "<init>", "()V", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "context", "", "validate", "(Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;)Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionTypeInteractionValidator implements com.datadog.android.rum.internal.metric.interactiontonextview.InteractionIngestionValidator {
    private static final java.util.Set<com.datadog.android.rum.model.ActionEvent.ActionEventActionType> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.rum.model.ActionEvent.ActionEventActionType[]{com.datadog.android.rum.model.ActionEvent.ActionEventActionType.TAP, com.datadog.android.rum.model.ActionEvent.ActionEventActionType.SWIPE, com.datadog.android.rum.model.ActionEvent.ActionEventActionType.CLICK, com.datadog.android.rum.model.ActionEvent.ActionEventActionType.BACK});

    @Override // com.datadog.android.rum.internal.metric.interactiontonextview.InteractionIngestionValidator
    public final boolean validate(com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return getHighSpeedVideoSizes.contains(context.getActionType$dd_sdk_android_rum_release());
    }
}
