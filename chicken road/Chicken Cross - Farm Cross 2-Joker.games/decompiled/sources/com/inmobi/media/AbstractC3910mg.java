package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3910mg {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7248a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue("mg", "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th) {
            String str = "Did you add omsdk-android.aar? Failed to init openMeasurementSDK: " + th.getStackTrace();
            return false;
        }
    }
}
