package androidx.fragment.app.strictmode;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/ViewGroup;", "parentContainer", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentTagUsageViolation extends androidx.fragment.app.strictmode.Violation {
    private final android.view.ViewGroup parentContainer;

    public final android.view.ViewGroup getParentContainer() {
        return this.parentContainer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FragmentTagUsageViolation(androidx.fragment.app.Fragment fragment, android.view.ViewGroup viewGroup) {
        super(fragment, r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to use <fragment> tag to add fragment ");
        sb.append(fragment);
        sb.append(" to container ");
        sb.append(viewGroup);
        this.parentContainer = viewGroup;
    }
}
