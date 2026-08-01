package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class z implements y {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i f10864a;

    public z(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f10864a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.y
    public boolean a(String url, long j, t tVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f;
        Intrinsics.checkNotNullParameter(url, "url");
        if (tVar != null) {
            try {
                f = tVar.f();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            f = null;
        }
        Uri build = Uri.parse(a(url, j, f)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.f10864a;
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        iVar.a(uri);
        return true;
    }

    public final String a(String str, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String a2;
        if (cVar != null && (a2 = com.moloco.sdk.internal.utils.b.a(str, cVar.a())) != null) {
            str = a2;
        }
        return com.moloco.sdk.internal.utils.b.a(str, j);
    }
}
