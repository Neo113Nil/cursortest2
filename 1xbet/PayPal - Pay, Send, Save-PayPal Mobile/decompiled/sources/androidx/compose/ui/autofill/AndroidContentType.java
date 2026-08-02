package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentType;", "Landroidx/compose/ui/autofill/ContentType;", "", "", "p0", "<init>", "(Ljava/util/Set;)V", "plus", "(Landroidx/compose/ui/autofill/ContentType;)Landroidx/compose/ui/autofill/ContentType;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "()Ljava/util/Set;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidContentType implements androidx.compose.ui.autofill.ContentType {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    public AndroidContentType(java.util.Set<java.lang.String> set) {
        this.getHighSpeedVideoSizes = set;
    }

    public final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    public final androidx.compose.ui.autofill.ContentType plus(androidx.compose.ui.autofill.ContentType p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
        return new androidx.compose.ui.autofill.AndroidContentType(kotlin.collections.SetsKt.plus((java.util.Set) this.getHighSpeedVideoSizes, (java.lang.Iterable) ((androidx.compose.ui.autofill.AndroidContentType) p0).getHighSpeedVideoSizes));
    }
}
