package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/FakeAccountSnapshotProvider;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "p0", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "p1", "", "Render", "(Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FakeAccountSnapshotProvider implements com.paypal.oslo.feature.home.api.AccountSnapshotProvider {
    public static final com.paypal.oslo.feature.businesshome.ui.home.FakeAccountSnapshotProvider INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.FakeAccountSnapshotProvider();

    private FakeAccountSnapshotProvider() {
    }

    @Override // com.paypal.oslo.feature.home.api.AccountSnapshotProvider
    public final void Render(androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1478374044);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1478374044, i, -1, "com.paypal.oslo.feature.businesshome.ui.home.FakeAccountSnapshotProvider.Render (BusinessHomeScreen.kt:450)");
        }
        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(modifier, androidx.compose.ui.unit.Dp.m8601constructorimpl(104.0f)), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
