package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/core/LicenseUtil;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LicenseUtil {
    private static final com.miteksystems.misnap.core.internal.LicensingNativeWrapper Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.LicenseUtil.Companion INSTANCE = new com.miteksystems.misnap.core.LicenseUtil.Companion(null);
    private static final boolean getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0013\u0010\u0003\u001a\u00020\u00048G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/miteksystems/misnap/core/LicenseUtil$Companion;", "", "()V", "libraryLoaded", "", "isLibraryLoaded", "()Z", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.WRAPPER, "Lcom/miteksystems/misnap/core/internal/LicensingNativeWrapper;", "decode", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "featureEnabled", "", "featureName", "isExpired", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isLibraryLoaded() {
            return com.miteksystems.misnap.core.LicenseUtil.getHighSpeedVideoFpsRanges;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isExpired(java.lang.String license) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
            if (isLibraryLoaded()) {
                return com.miteksystems.misnap.core.LicenseUtil.Camera2StreamConfigurationMap.a(decode(license));
            }
            throw new com.miteksystems.misnap.core.LicenseException("Unable to load the licensing library");
        }

        @kotlin.jvm.JvmStatic
        public final void featureEnabled(java.lang.String license, java.lang.String featureName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
            if (!isLibraryLoaded()) {
                throw new com.miteksystems.misnap.core.LicenseException("Unable to load the licensing library");
            }
            com.miteksystems.misnap.core.LicenseUtil.Camera2StreamConfigurationMap.a(decode(license), featureName);
        }

        public final java.lang.String decode(java.lang.String license) {
            java.lang.Object m23436constructorimpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                byte[] decode = android.util.Base64.decode(license, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.lang.String(decode, kotlin.text.Charsets.UTF_8));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                throw new com.miteksystems.misnap.core.LicenseException("License Signature Invalid");
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            java.lang.String str = (java.lang.String) m23436constructorimpl;
            if (str != null) {
                return str;
            }
            throw new com.miteksystems.misnap.core.LicenseException("License Signature Invalid");
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isExpired(java.lang.String str) {
        return INSTANCE.isExpired(str);
    }

    @kotlin.jvm.JvmStatic
    public static final void featureEnabled(java.lang.String str, java.lang.String str2) {
        INSTANCE.featureEnabled(str, str2);
    }

    private LicenseUtil() {
    }

    static {
        com.miteksystems.misnap.core.internal.LicensingNativeWrapper licensingNativeWrapper = new com.miteksystems.misnap.core.internal.LicensingNativeWrapper();
        getHighSpeedVideoFpsRanges = licensingNativeWrapper.a();
        Camera2StreamConfigurationMap = licensingNativeWrapper;
    }
}
