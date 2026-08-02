package androidx.fragment.app.strictmode;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "expectedParentFragment", "", "containerId", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", com.visa.cbp.getEncExpo.warmup, "getContainerId", "()I", "Landroidx/fragment/app/Fragment;", "getExpectedParentFragment", "()Landroidx/fragment/app/Fragment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrongNestedHierarchyViolation extends androidx.fragment.app.strictmode.Violation {
    private final int containerId;
    private final androidx.fragment.app.Fragment expectedParentFragment;

    public final androidx.fragment.app.Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WrongNestedHierarchyViolation(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, int i) {
        super(fragment, r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to nest fragment ");
        sb.append(fragment);
        sb.append(" within the view of parent fragment ");
        sb.append(fragment2);
        sb.append(" via container with ID ");
        sb.append(i);
        sb.append(" without using parent's childFragmentManager");
        this.expectedParentFragment = fragment2;
        this.containerId = i;
    }
}
