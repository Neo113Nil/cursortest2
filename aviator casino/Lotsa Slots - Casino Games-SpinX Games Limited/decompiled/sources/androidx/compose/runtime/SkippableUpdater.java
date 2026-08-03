package androidx.compose.runtime;

/* compiled from: Composer.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u00172\u001d\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001bH\u0086\b¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "toString", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "update", "", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final androidx.compose.runtime.Composer composer;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.SkippableUpdater m1632boximpl(androidx.compose.runtime.Composer composer) {
        return new androidx.compose.runtime.SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> androidx.compose.runtime.Composer m1633constructorimpl(androidx.compose.runtime.Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1634equalsimpl(androidx.compose.runtime.Composer composer, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.SkippableUpdater) && kotlin.jvm.internal.Intrinsics.areEqual(composer, ((androidx.compose.runtime.SkippableUpdater) obj).getComposer());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1635equalsimpl0(androidx.compose.runtime.Composer composer, androidx.compose.runtime.Composer composer2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1636hashCodeimpl(androidx.compose.runtime.Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1637toStringimpl(androidx.compose.runtime.Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m1634equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1636hashCodeimpl(this.composer);
    }

    public java.lang.String toString() {
        return m1637toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.Composer getComposer() {
        return this.composer;
    }

    private /* synthetic */ SkippableUpdater(androidx.compose.runtime.Composer composer) {
        this.composer = composer;
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m1638updateimpl(androidx.compose.runtime.Composer composer, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        composer.endReplaceableGroup();
    }
}
