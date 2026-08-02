package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Landroidx/compose/ui/layout/InnermostInsetsRulers;", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;[Landroidx/compose/ui/layout/WindowInsetsRulers;)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "getAnimation", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/WindowInsetsAnimation;", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "[Landroidx/compose/ui/layout/WindowInsetsRulers;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/RectRulers;", "Landroidx/compose/ui/layout/RectRulers;", "getCurrent", "()Landroidx/compose/ui/layout/RectRulers;", "Camera2StreamConfigurationMap", "getMaximum"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InnermostInsetsRulers implements androidx.compose.ui.layout.WindowInsetsRulers {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.RectRulers getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.WindowInsetsRulers[] getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.RectRulers Camera2StreamConfigurationMap;

    public InnermostInsetsRulers(java.lang.String str, androidx.compose.ui.layout.WindowInsetsRulers[] windowInsetsRulersArr) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = windowInsetsRulersArr;
        androidx.compose.ui.layout.RectRulers.Companion companion = androidx.compose.ui.layout.RectRulers.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList(windowInsetsRulersArr.length);
        for (androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers : windowInsetsRulersArr) {
            arrayList.add(windowInsetsRulers.getGetHighSpeedVideoSizes());
        }
        androidx.compose.ui.layout.RectRulers[] rectRulersArr = (androidx.compose.ui.layout.RectRulers[]) arrayList.toArray(new androidx.compose.ui.layout.RectRulers[0]);
        this.Camera2StreamConfigurationMap = androidx.compose.ui.layout.RectRulersKt.innermostOf(companion, (androidx.compose.ui.layout.RectRulers[]) java.util.Arrays.copyOf(rectRulersArr, rectRulersArr.length));
        androidx.compose.ui.layout.RectRulers.Companion companion2 = androidx.compose.ui.layout.RectRulers.INSTANCE;
        androidx.compose.ui.layout.WindowInsetsRulers[] windowInsetsRulersArr2 = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(windowInsetsRulersArr2.length);
        for (androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers2 : windowInsetsRulersArr2) {
            arrayList2.add(windowInsetsRulers2.getCamera2StreamConfigurationMap());
        }
        androidx.compose.ui.layout.RectRulers[] rectRulersArr2 = (androidx.compose.ui.layout.RectRulers[]) arrayList2.toArray(new androidx.compose.ui.layout.RectRulers[0]);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.layout.RectRulersKt.innermostOf(companion2, (androidx.compose.ui.layout.RectRulers[]) java.util.Arrays.copyOf(rectRulersArr2, rectRulersArr2.length));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    /* renamed from: getCurrent, reason: from getter */
    public final androidx.compose.ui.layout.RectRulers getGetHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    /* renamed from: getMaximum, reason: from getter */
    public final androidx.compose.ui.layout.RectRulers getCamera2StreamConfigurationMap() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final androidx.compose.ui.layout.WindowInsetsAnimation getAnimation(androidx.compose.ui.layout.Placeable.PlacementScope p0) {
        return new androidx.compose.ui.layout.InnermostAnimationProperties(p0, this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        return str == null ? kotlin.collections.ArraysKt.joinToString$default(this.getHighSpeedVideoSizes, (java.lang.CharSequence) null, "innermostOf(", ")", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 57, (java.lang.Object) null) : str;
    }
}
