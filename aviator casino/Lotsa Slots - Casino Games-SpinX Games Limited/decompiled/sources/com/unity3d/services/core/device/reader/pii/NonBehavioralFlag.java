package com.unity3d.services.core.device.reader.pii;

/* compiled from: NonBehavioralFlag.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "TRUE", "FALSE", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion INSTANCE = new com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion(null);

    /* compiled from: NonBehavioralFlag.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion;", "", "()V", "fromString", "Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "value", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.unity3d.services.core.device.reader.pii.NonBehavioralFlag fromString(java.lang.String value) {
            java.lang.Object m10798constructorimpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion companion2 = this;
                java.lang.String upperCase = value.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.unity3d.services.core.device.reader.pii.NonBehavioralFlag nonBehavioralFlag = com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.UNKNOWN;
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = nonBehavioralFlag;
            }
            return (com.unity3d.services.core.device.reader.pii.NonBehavioralFlag) m10798constructorimpl;
        }
    }
}
