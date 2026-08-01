package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class V5 implements T5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f6907a;
    public final C4214xd b;
    public final List c;

    public V5(Context context, CrashConfig crashConfig, C4214xd eventBus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.f6907a = crashConfig;
        this.b = eventBus;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.c = synchronizedList;
        if (this.f6907a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new C4096t5(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f6907a.getAnr().getAppExitReason().getEnabled()) {
            Y5.f6965a.getClass();
            if (Y5.t()) {
                synchronizedList.add(new S1(context, this, this.f6907a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.f6907a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            }
        }
        if (this.f6907a.getAnr().getWatchdog().getEnabled()) {
            synchronizedList.add(new C3610c(this.f6907a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(Ca incidentEvent) {
        int i;
        Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof T1) && this.f6907a.getAnr().getAppExitReason().getEnabled()) {
            i = 152;
        } else if ((incidentEvent instanceof C4124u5) && this.f6907a.getCrashConfig().getEnabled()) {
            i = TextFieldImplKt.AnimationDuration;
        } else if (!(incidentEvent instanceof C3892lq) || !this.f6907a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i = 151;
        }
        this.b.b(new C3698f3(i, incidentEvent.f6546a, MapsKt.mapOf(TuplesKt.to("data", incidentEvent))));
    }
}
