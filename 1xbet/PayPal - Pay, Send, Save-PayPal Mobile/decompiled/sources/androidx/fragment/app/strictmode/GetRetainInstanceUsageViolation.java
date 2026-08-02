package androidx.fragment.app.strictmode;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/GetRetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRetainInstanceUsageViolation extends androidx.fragment.app.strictmode.RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(androidx.fragment.app.Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment ".concat(java.lang.String.valueOf(fragment)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
    }
}
