package androidx.fragment.app.strictmode;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "", "message", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RetainInstanceUsageViolation extends androidx.fragment.app.strictmode.Violation {
    public /* synthetic */ RetainInstanceUsageViolation(androidx.fragment.app.Fragment fragment, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        super(fragment, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
    }
}
