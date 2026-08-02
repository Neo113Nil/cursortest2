package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FinalizeSessionOnCloseQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "getBehavior-Bm6Tfm4", "()I", "getBehavior"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public final boolean isEnabled() {
            return true;
        }

        private Companion() {
        }

        /* renamed from: getBehavior-Bm6Tfm4, reason: not valid java name */
        public final int m71getBehaviorBm6Tfm4() {
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.text.StringsKt.startsWith$default(lowerCase, "cph", false, 2, (java.lang.Object) null)) {
                return androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.INSTANCE.m370getIMMEDIATEBm6Tfm4();
            }
            return androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.INSTANCE.m371getOFFBm6Tfm4();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
