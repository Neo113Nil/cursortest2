package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ClientMigration {
    static /* synthetic */ long drawField(ClientMigration clientMigration, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i5 & 16) != 0) {
            z = false;
        }
        return clientMigration.applyTask(i, i2, i3, i4, z);
    }

    long applyTask(int i, int i2, int i3, int i4, boolean z);

    void clipOrigin(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.PanelUtil panelUtil);

    int connectJob(androidx.compose.ui.layout.GradientActivator gradientActivator);

    int reduceScope(androidx.compose.ui.layout.GradientActivator gradientActivator);

    ContentConfigurator updateTimer(androidx.compose.ui.layout.GradientActivator[] gradientActivatorArr, androidx.compose.ui.layout.PanelUtil panelUtil, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6);
}
