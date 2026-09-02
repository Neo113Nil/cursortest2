package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/SnackbarAdministrator;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarAdministrator {
    private static final /* synthetic */ ItemProcessor attachConfig;
    private static final /* synthetic */ SnackbarAdministrator[] connectPatch;
    public static final SnackbarAdministrator reduceScope = new SnackbarAdministrator("VIEW_APPEAR", 0);
    public static final SnackbarAdministrator notifyMessage = new SnackbarAdministrator("VIEW_DISAPPEAR", 1);

    static {
        SnackbarAdministrator[] evictLayout = evictLayout();
        connectPatch = evictLayout;
        attachConfig = TranslateConductor.evictLayout(evictLayout);
    }

    private SnackbarAdministrator(String str, int i) {
    }

    private static final /* synthetic */ SnackbarAdministrator[] evictLayout() {
        return new SnackbarAdministrator[]{reduceScope, notifyMessage};
    }

    public static ItemProcessor releaseHeader() {
        return attachConfig;
    }

    public static SnackbarAdministrator valueOf(String str) {
        return (SnackbarAdministrator) Enum.valueOf(SnackbarAdministrator.class, str);
    }

    public static SnackbarAdministrator[] values() {
        return (SnackbarAdministrator[]) connectPatch.clone();
    }
}
