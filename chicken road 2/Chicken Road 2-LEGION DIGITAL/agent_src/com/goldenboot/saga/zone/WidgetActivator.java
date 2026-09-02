package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/WidgetActivator;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WidgetActivator {
    private static final /* synthetic */ ItemProcessor attachConfig;
    private static final /* synthetic */ WidgetActivator[] connectPatch;
    public static final WidgetActivator reduceScope = new WidgetActivator("Min", 0);
    public static final WidgetActivator notifyMessage = new WidgetActivator("Max", 1);

    static {
        WidgetActivator[] evictLayout = evictLayout();
        connectPatch = evictLayout;
        attachConfig = TranslateConductor.evictLayout(evictLayout);
    }

    private WidgetActivator(String str, int i) {
    }

    private static final /* synthetic */ WidgetActivator[] evictLayout() {
        return new WidgetActivator[]{reduceScope, notifyMessage};
    }

    public static ItemProcessor releaseHeader() {
        return attachConfig;
    }

    public static WidgetActivator valueOf(String str) {
        return (WidgetActivator) Enum.valueOf(WidgetActivator.class, str);
    }

    public static WidgetActivator[] values() {
        return (WidgetActivator[]) connectPatch.clone();
    }
}
