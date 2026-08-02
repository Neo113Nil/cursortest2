package androidx.camera.core.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Landroidx/core/backported/fixes/KnownIssue;", "getKnownIssue", "()Landroidx/core/backported/fixes/KnownIssue;", "", "hasIssue", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BackportedFixQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.internal.compat.quirk.BackportedFixQuirk.Companion INSTANCE = new androidx.camera.core.internal.compat.quirk.BackportedFixQuirk.Companion(null);
    private static final kotlin.Lazy<androidx.core.backported.fixes.BackportedFixManager> backportedFixManager$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.core.internal.compat.quirk.BackportedFixQuirk$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.camera.core.internal.compat.quirk.BackportedFixQuirk.m1016$r8$lambda$2eNJcB0ZkXo6McceQrtwYP3Me0();
        }
    });

    public abstract androidx.core.backported.fixes.KnownIssue getKnownIssue();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk$Companion;", "", "<init>", "()V", "Landroidx/core/backported/fixes/BackportedFixManager;", "backportedFixManager$delegate", "Lkotlin/Lazy;", "getBackportedFixManager", "()Landroidx/core/backported/fixes/BackportedFixManager;", "backportedFixManager"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.core.backported.fixes.BackportedFixManager getBackportedFixManager() {
            return (androidx.core.backported.fixes.BackportedFixManager) androidx.camera.core.internal.compat.quirk.BackportedFixQuirk.backportedFixManager$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean hasIssue() {
        return !INSTANCE.getBackportedFixManager().isFixed(getKnownIssue());
    }

    /* renamed from: $r8$lambda$2eNJcB0ZkXo6McceQrtwYP3-Me0, reason: not valid java name */
    public static /* synthetic */ androidx.core.backported.fixes.BackportedFixManager m1016$r8$lambda$2eNJcB0ZkXo6McceQrtwYP3Me0() {
        return new androidx.core.backported.fixes.BackportedFixManager();
    }
}
