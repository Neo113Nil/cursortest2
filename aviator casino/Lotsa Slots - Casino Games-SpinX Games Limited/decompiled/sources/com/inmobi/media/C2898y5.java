package com.inmobi.media;

/* renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2898y5 implements com.inmobi.media.InterfaceC2847w5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.inmobi.media.core.config.models.CrashConfig f5563a;
    public final com.inmobi.media.Fc b;
    public final java.util.List c;

    public C2898y5(android.content.Context context, com.inmobi.media.core.config.models.CrashConfig crashConfig, com.inmobi.media.Fc eventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.f5563a = crashConfig;
        this.b = eventBus;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.c = synchronizedList;
        if (this.f5563a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new com.inmobi.media.W4(java.lang.Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f5563a.getAnr().getAppExitReason().getEnabled()) {
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.t()) {
                synchronizedList.add(new com.inmobi.media.C2894y1(context, this, this.f5563a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.f5563a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            }
        }
        if (this.f5563a.getAnr().getWatchdog().getEnabled()) {
            synchronizedList.add(new com.inmobi.media.C2312c(this.f5563a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(com.inmobi.media.X9 incidentEvent) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof com.inmobi.media.C2919z1) && this.f5563a.getAnr().getAppExitReason().getEnabled()) {
            i = com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        } else if ((incidentEvent instanceof com.inmobi.media.X4) && this.f5563a.getCrashConfig().getEnabled()) {
            i = androidx.compose.material.TextFieldImplKt.AnimationDuration;
        } else if (!(incidentEvent instanceof com.inmobi.media.C2654oo) || !this.f5563a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i = 151;
        }
        this.b.b(new com.inmobi.media.J2(i, incidentEvent.f5268a, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("data", incidentEvent))));
    }
}
