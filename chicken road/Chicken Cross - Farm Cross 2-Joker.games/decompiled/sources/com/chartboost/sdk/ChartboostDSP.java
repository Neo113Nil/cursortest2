package com.chartboost.sdk;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/chartboost/sdk/ChartboostDSP;", "", "<init>", "()V", "", "dspCode", "", "creativeTypes", "", "setDSPHeader", "(Ljava/lang/String;[I)Z", "a", "Z", "isDSP", "()Z", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartboostDSP {
    public static final ChartboostDSP INSTANCE = new ChartboostDSP();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final boolean isDSP = false;

    @JvmStatic
    public static final boolean setDSPHeader(String dspCode, int[] creativeTypes) {
        return false;
    }

    public final boolean isDSP() {
        return isDSP;
    }
}
