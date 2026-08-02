package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InvalidVideoProfilesQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.Companion(null);
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro"});
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cph2417", "cph2451"});
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cph2437", "cph2525", "pht110"});

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (kotlin.text.StringsKt.startsWith(r0, "TD1A", true) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        
            if (kotlin.text.StringsKt.startsWith(r0, "TP1A", true) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        
            if (kotlin.text.StringsKt.startsWith(r0, "TP1A", true) != false) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean isEnabled() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                java.lang.String str = android.os.Build.ID;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            java.util.List list = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (list.contains(lowerCase)) {
                java.lang.String str3 = android.os.Build.ID;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                if (!kotlin.text.StringsKt.startsWith(str3, "TP1A", true)) {
                    java.lang.String str4 = android.os.Build.ID;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                }
                return true;
            }
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isRedmiDevice() | androidx.camera.camera2.compat.quirk.Device.INSTANCE.isXiaomiDevice()) {
                java.lang.String str5 = android.os.Build.ID;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                if (!kotlin.text.StringsKt.startsWith(str5, "TKQ1", true)) {
                    java.lang.String str6 = android.os.Build.ID;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                }
                return true;
            }
            java.util.List list2 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str7 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
            java.lang.String lowerCase2 = str7.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!list2.contains(lowerCase2) || android.os.Build.VERSION.SDK_INT != 33) {
                java.util.List list3 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.getHighSpeedVideoFpsRangesFor;
                java.lang.String str8 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "");
                java.lang.String lowerCase3 = str8.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (!list3.contains(lowerCase3) || android.os.Build.VERSION.SDK_INT != 33) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
