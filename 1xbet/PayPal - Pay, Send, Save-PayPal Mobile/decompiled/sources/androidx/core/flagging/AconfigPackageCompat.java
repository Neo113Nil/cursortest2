package androidx.core.flagging;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat;", "", "", "flagName", "", "defaultValue", "getBooleanFlagValue", "(Ljava/lang/String;Z)Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AconfigPackageCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.core.flagging.AconfigPackageCompat.Companion INSTANCE = androidx.core.flagging.AconfigPackageCompat.Companion.getHighSpeedVideoSizes;

    boolean getBooleanFlagValue(java.lang.String flagName, boolean defaultValue);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat$Companion;", "", "<init>", "()V", "", com.visa.cbp.ConsumerInfo.setSignature, "Landroidx/core/flagging/AconfigPackageCompat;", "load", "(Ljava/lang/String;)Landroidx/core/flagging/AconfigPackageCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.core.flagging.AconfigPackageCompat.Companion getHighSpeedVideoSizes = new androidx.core.flagging.AconfigPackageCompat.Companion();

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.core.flagging.AconfigPackageCompat load(java.lang.String packageName) throws android.os.flagging.AconfigStorageReadException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                try {
                    android.os.flagging.AconfigPackage load = android.os.flagging.AconfigPackage.load(packageName);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(load, "");
                    return new androidx.core.flagging.AconfigPackageCompatApi36Impl(load);
                } catch (android.os.flagging.AconfigStorageReadException e) {
                    if (e.getErrorCode() == 2) {
                        return new androidx.core.flagging.AconfigPackageCompatNoopImpl();
                    }
                    throw e;
                }
            }
            return new androidx.core.flagging.AconfigPackageCompatNoopImpl();
        }
    }

    @kotlin.jvm.JvmStatic
    static androidx.core.flagging.AconfigPackageCompat load(java.lang.String str) throws android.os.flagging.AconfigStorageReadException {
        return INSTANCE.load(str);
    }
}
