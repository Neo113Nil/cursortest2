package androidx.core.backported.fixes;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/core/backported/fixes/BackportedFixManager;", "", "Landroidx/core/backported/fixes/StatusResolver;", "resolver", "<init>", "(Landroidx/core/backported/fixes/StatusResolver;)V", "()V", "Landroidx/core/backported/fixes/KnownIssue;", "ki", "", "isFixed", "(Landroidx/core/backported/fixes/KnownIssue;)Z", "Landroidx/core/backported/fixes/Status;", "getStatus", "(Landroidx/core/backported/fixes/KnownIssue;)Landroidx/core/backported/fixes/Status;", "getHighSpeedVideoSizes", "Landroidx/core/backported/fixes/StatusResolver;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackportedFixManager {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.core.backported.fixes.StatusResolver Camera2StreamConfigurationMap;

    public BackportedFixManager(androidx.core.backported.fixes.StatusResolver statusResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusResolver, "");
        this.Camera2StreamConfigurationMap = statusResolver;
    }

    public BackportedFixManager() {
        this(new androidx.core.backported.fixes.SystemPropertyResolver());
    }

    public final boolean isFixed(androidx.core.backported.fixes.KnownIssue ki) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ki, "");
        int i = androidx.core.backported.fixes.BackportedFixManager.WhenMappings.$EnumSwitchMapping$0[getStatus(ki).ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final androidx.core.backported.fixes.Status getStatus(androidx.core.backported.fixes.KnownIssue ki) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ki, "");
        if (ki.getPrecondition$core_backported_fixes().invoke().booleanValue()) {
            if (ki.getManuallyTestedFingerprints$core_backported_fixes().contains(android.os.Build.FINGERPRINT)) {
                return androidx.core.backported.fixes.Status.Fixed;
            }
            return this.Camera2StreamConfigurationMap.getStatus(ki);
        }
        return androidx.core.backported.fixes.Status.NotApplicable;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.core.backported.fixes.Status.values().length];
            try {
                iArr[androidx.core.backported.fixes.Status.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.core.backported.fixes.Status.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.core.backported.fixes.Status.NotApplicable.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.core.backported.fixes.Status.NotFixed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
