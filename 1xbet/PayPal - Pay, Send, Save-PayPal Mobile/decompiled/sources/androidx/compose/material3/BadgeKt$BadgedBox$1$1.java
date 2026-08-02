package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BadgeKt$BadgedBox$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material3.BadgeKt$BadgedBox$1$1 Camera2StreamConfigurationMap = new androidx.compose.material3.BadgeKt$BadgedBox$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "badge")) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), io.ktor.http.LinkHeader.Parameters.Anchor)) {
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(j);
                        return measureScope.layout(mo7353measureBRTryo02.getWidth(), mo7353measureBRTryo02.getHeight(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(mo7353measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(mo7353measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline())))), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.BadgeKt$BadgedBox$1$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, measureScope, mo7353measureBRTryo02, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                            }
                        });
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        boolean z = placeable.getWidth() > measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.tokens.BadgeTokens.INSTANCE.m4431getSizeD9Ej5fM());
        float badgeWithContentHorizontalOffset = z ? androidx.compose.material3.BadgeKt.getBadgeWithContentHorizontalOffset() : androidx.compose.material3.BadgeKt.getBadgeOffset();
        float badgeWithContentVerticalOffset = z ? androidx.compose.material3.BadgeKt.getBadgeWithContentVerticalOffset() : androidx.compose.material3.BadgeKt.getBadgeOffset();
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, java.lang.Math.min(placeable2.getWidth() - measureScope.mo1412roundToPx0680j_4(badgeWithContentHorizontalOffset), ((int) placementScope.current(androidx.compose.material3.BadgeKt.getBadgeEndRuler(), Float.POSITIVE_INFINITY)) - placeable.getWidth()), java.lang.Math.max((-placeable.getHeight()) + measureScope.mo1412roundToPx0680j_4(badgeWithContentVerticalOffset), (int) placementScope.current(androidx.compose.material3.BadgeKt.getBadgeTopRuler(), Float.NEGATIVE_INFINITY)), 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    BadgeKt$BadgedBox$1$1() {
    }
}
