package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B5 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Network f6469a = null;
    public static volatile boolean b = true;
    public static long c;
    public static long d;
    public static final AtomicBoolean e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getCustomNwValidation();
    }
}
