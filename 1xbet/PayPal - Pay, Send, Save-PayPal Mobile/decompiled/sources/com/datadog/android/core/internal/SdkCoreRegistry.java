package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\rR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/core/internal/SdkCoreRegistry;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "clear", "()V", "", "name", "Lcom/datadog/android/api/SdkCore;", "getInstance", "(Ljava/lang/String;)Lcom/datadog/android/api/SdkCore;", "sdkCore", "register", "(Ljava/lang/String;Lcom/datadog/android/api/SdkCore;)V", "unregister", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SdkCoreRegistry {
    public static final java.lang.String DEFAULT_INSTANCE_NAME = "_dd.sdk_core.default";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.datadog.android.api.SdkCore> getHighResolutionOutputSizeshNQ4ISI;

    public SdkCoreRegistry(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
    }

    public final void register(final java.lang.String name2, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        if (name2 == null) {
            name2 = DEFAULT_INSTANCE_NAME;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(name2)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.SdkCoreRegistry$register$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str = name2;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("An SdkCode with name ");
                    sb.append(str);
                    sb.append(" has already been registered.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.put(name2, sdkCore);
        }
    }

    public static /* synthetic */ com.datadog.android.api.SdkCore unregister$default(com.datadog.android.core.internal.SdkCoreRegistry sdkCoreRegistry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sdkCoreRegistry.unregister(str);
    }

    public final com.datadog.android.api.SdkCore unregister(java.lang.String name2) {
        if (name2 == null) {
            name2 = DEFAULT_INSTANCE_NAME;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.remove(name2);
    }

    public static /* synthetic */ com.datadog.android.api.SdkCore getInstance$default(com.datadog.android.core.internal.SdkCoreRegistry sdkCoreRegistry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sdkCoreRegistry.getInstance(str);
    }

    public final com.datadog.android.api.SdkCore getInstance(java.lang.String name2) {
        if (name2 == null) {
            name2 = DEFAULT_INSTANCE_NAME;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.get(name2);
    }

    public final void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }
}
