package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi35;", "Landroidx/activity/EdgeToEdgeApi30;", "<init>", "()V", "Landroidx/activity/SystemBarStyle;", "p0", "p1", "Landroid/view/Window;", "p2", "Landroid/view/View;", "p3", "", "p4", "p5", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EdgeToEdgeApi35 extends androidx.view.EdgeToEdgeApi30 {
    @Override // androidx.view.EdgeToEdgeApi29, androidx.view.EdgeToEdgeApi26, androidx.view.EdgeToEdgeImpl
    public final void getHighSpeedVideoFpsRangesFor(androidx.view.SystemBarStyle p0, androidx.view.SystemBarStyle p1, android.view.Window p2, android.view.View p3, boolean p4, boolean p5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(p2, false);
        p2.setStatusBarColor(0);
        p2.setNavigationBarColor(0);
        int scrimWithEnforcedContrast$activity = p0.getScrimWithEnforcedContrast$activity(p4);
        int scrimWithEnforcedContrast$activity2 = p1.getScrimWithEnforcedContrast$activity(p5);
        android.view.ViewGroup viewGroup = p3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p3 : null;
        if (viewGroup != null) {
            java.util.Iterator<android.view.View> it = androidx.core.view.ViewGroupKt.getChildren(viewGroup).iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object tag = it.next().getTag();
                    if (tag instanceof java.util.List) {
                        java.util.List list = (java.util.List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof androidx.core.view.insets.ColorProtection)) {
                            for (java.lang.Object obj : (java.lang.Iterable) tag) {
                                if ((obj instanceof androidx.core.view.insets.ColorProtection ? (androidx.core.view.insets.ColorProtection) obj : null) != null) {
                                    androidx.core.view.insets.ColorProtection colorProtection = (androidx.core.view.insets.ColorProtection) obj;
                                    int side = colorProtection.getSide();
                                    if (side == 1) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    } else if (side == 2) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity);
                                    } else if (side == 4) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    } else if (side == 8) {
                                        colorProtection.setColor(scrimWithEnforcedContrast$activity2);
                                    }
                                }
                            }
                        }
                    }
                } else if (scrimWithEnforcedContrast$activity != 0 || scrimWithEnforcedContrast$activity2 != 0) {
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.core.view.insets.ColorProtection[]{new androidx.core.view.insets.ColorProtection(2, scrimWithEnforcedContrast$activity), new androidx.core.view.insets.ColorProtection(1, scrimWithEnforcedContrast$activity2), new androidx.core.view.insets.ColorProtection(4, scrimWithEnforcedContrast$activity2), new androidx.core.view.insets.ColorProtection(8, scrimWithEnforcedContrast$activity2)});
                    androidx.core.view.insets.ProtectionLayout protectionLayout = new androidx.core.view.insets.ProtectionLayout(((android.view.ViewGroup) p3).getContext(), (java.util.List<androidx.core.view.insets.Protection>) listOf);
                    protectionLayout.setTag(listOf);
                    viewGroup.addView(protectionLayout);
                }
            }
        }
        p2.setNavigationBarContrastEnforced(p1.getNightMode() == 0);
        androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat = new androidx.core.view.WindowInsetsControllerCompat(p2, p3);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!p4);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!p5);
    }
}
