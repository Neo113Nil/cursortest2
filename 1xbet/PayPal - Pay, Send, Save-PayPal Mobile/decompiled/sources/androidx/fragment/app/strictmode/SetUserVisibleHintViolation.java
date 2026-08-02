package androidx.fragment.app.strictmode;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "", "isVisibleToUser", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "Z", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetUserVisibleHintViolation extends androidx.fragment.app.strictmode.Violation {
    private final boolean isVisibleToUser;

    /* renamed from: isVisibleToUser, reason: from getter */
    public final boolean getIsVisibleToUser() {
        return this.isVisibleToUser;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SetUserVisibleHintViolation(androidx.fragment.app.Fragment fragment, boolean z) {
        super(fragment, r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to set user visible hint to ");
        sb.append(z);
        sb.append(" for fragment ");
        sb.append(fragment);
        this.isVisibleToUser = z;
    }
}
