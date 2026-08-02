package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/RumSessionType;", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "toAction", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "toError", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "toLongTask", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "toResource", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "toView", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSessionType;", "toVital", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSessionType;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "toVitalAppLaunch", "(Lcom/datadog/android/rum/RumSessionType;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumSessionTypeExtKt {
    public static final com.datadog.android.rum.model.ActionEvent.ActionEventSessionType toAction(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.ActionEvent.ActionEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.ActionEvent.ActionEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType toResource(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType toError(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType toView(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType toLongTask(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType toVital(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType toVitalAppLaunch(com.datadog.android.rum.RumSessionType rumSessionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionType, "");
        int i = com.datadog.android.rum.internal.RumSessionTypeExtKt.WhenMappings.$EnumSwitchMapping$0[rumSessionType.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.SYNTHETICS;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.USER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.rum.RumSessionType.values().length];
            try {
                iArr[com.datadog.android.rum.RumSessionType.SYNTHETICS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.rum.RumSessionType.USER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
