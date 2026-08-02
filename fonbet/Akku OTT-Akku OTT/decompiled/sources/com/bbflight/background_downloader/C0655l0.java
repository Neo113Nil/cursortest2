package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bbflight.background_downloader.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0655l0 {
    public final TaskWorker a;
    public final EnumC0668s0 b;
    public final NotificationCompat.Builder c;

    public C0655l0(TaskWorker taskWorker, EnumC0668s0 enumC0668s0, NotificationCompat.Builder builder) {
        Intrinsics.checkNotNullParameter(taskWorker, "taskWorker");
        this.a = taskWorker;
        this.b = enumC0668s0;
        this.c = builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0655l0)) {
            return false;
        }
        C0655l0 c0655l0 = (C0655l0) obj;
        return Intrinsics.areEqual(this.a, c0655l0.a) && this.b == c0655l0.b && Intrinsics.areEqual(this.c, c0655l0.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        EnumC0668s0 enumC0668s0 = this.b;
        int hashCode2 = (hashCode + (enumC0668s0 == null ? 0 : enumC0668s0.hashCode())) * 31;
        NotificationCompat.Builder builder = this.c;
        return hashCode2 + (builder != null ? builder.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationData(taskWorker=" + this.a + ", notificationType=" + this.b + ", builder=" + this.c + ")";
    }
}
