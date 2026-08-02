package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/SecureWrapper;", "", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Landroid/content/Context;", "applicationContext", "", "key", "", "getInt$dd_sdk_android_rum_release", "(Lcom/datadog/android/api/InternalLogger;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureWrapper {
    public final java.lang.Integer getInt$dd_sdk_android_rum_release(com.datadog.android.api.InternalLogger internalLogger, android.content.Context applicationContext, final java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            return java.lang.Integer.valueOf(android.provider.Settings.Secure.getInt(applicationContext.getContentResolver(), key, -1));
        } catch (android.provider.Settings.SettingNotFoundException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.MAINTAINER), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.accessibility.SecureWrapper$getInt$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Setting cannot be found ".concat(java.lang.String.valueOf(key));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return -1;
        } catch (java.lang.SecurityException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.MAINTAINER), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.accessibility.SecureWrapper$getInt$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Security exception accessing ".concat(java.lang.String.valueOf(key));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return -1;
        }
    }
}
