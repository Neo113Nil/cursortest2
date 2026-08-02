package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\t2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "", "Lkotlin/ExtensionFunctionType;", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "update", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.Composer getHighSpeedVideoFpsRangesFor;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> androidx.compose.runtime.Composer m5270constructorimpl(androidx.compose.runtime.Composer composer) {
        return composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    private /* synthetic */ SkippableUpdater(androidx.compose.runtime.Composer composer) {
        this.getHighSpeedVideoFpsRangesFor = composer;
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m5275updateimpl(androidx.compose.runtime.Composer composer, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.Composer getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m5274toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m5273hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m5271equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5274toStringimpl(androidx.compose.runtime.Composer composer) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SkippableUpdater(composer=");
        sb.append(composer);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5273hashCodeimpl(androidx.compose.runtime.Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5272equalsimpl0(androidx.compose.runtime.Composer composer, androidx.compose.runtime.Composer composer2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(composer, composer2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5271equalsimpl(androidx.compose.runtime.Composer composer, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.SkippableUpdater) && kotlin.jvm.internal.Intrinsics.areEqual(composer, ((androidx.compose.runtime.SkippableUpdater) obj).getGetHighSpeedVideoFpsRangesFor());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.SkippableUpdater m5269boximpl(androidx.compose.runtime.Composer composer) {
        return new androidx.compose.runtime.SkippableUpdater(composer);
    }
}
