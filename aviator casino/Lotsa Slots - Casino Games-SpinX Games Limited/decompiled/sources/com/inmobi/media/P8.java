package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P8 implements com.inmobi.media.W5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R8 f4891a;

    public P8(com.inmobi.media.R8 r8) {
        this.f4891a = r8;
    }

    public final void a(java.lang.String expandInput, com.inmobi.media.V5 inputType, float f, boolean z, long j, com.inmobi.media.C2431gb c2431gb) {
        java.lang.String str;
        java.lang.String creativeId;
        java.lang.String impressionId;
        com.inmobi.media.U5 u5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputType, "inputType");
        com.inmobi.media.R8 r8 = this.f4891a;
        android.app.Activity activity = (android.app.Activity) r8.f4934a.get();
        if (activity == null) {
            return;
        }
        if (r8.e == null) {
            com.inmobi.media.U5 u52 = new com.inmobi.media.U5(activity);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = r8.h;
            if (interfaceC2772t9 != null) {
                u52.setLogger(interfaceC2772t9);
            }
            u52.setId(65518);
            u52.setEmbeddedBrowserUpdateListener(r8.i);
            r8.e = u52;
        }
        com.inmobi.media.C c = r8.b;
        if ((c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) && (u5 = r8.e) != null) {
            u5.setUserLeftApplicationListener(((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getListener());
        }
        com.inmobi.media.U5 u53 = r8.e;
        if (u53 != null) {
            com.inmobi.media.C c2 = r8.b;
            if (c2 == null || (str = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c2).getAdType()) == null) {
                str = "banner";
            }
            java.lang.String str2 = str;
            com.inmobi.media.C c3 = r8.b;
            java.lang.String str3 = (c3 == null || (impressionId = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c3).getImpressionId()) == null) ? "" : impressionId;
            com.inmobi.media.C c4 = r8.b;
            u53.a(expandInput, inputType, z, j, str2, str3, (c4 == null || (creativeId = ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c4).getCreativeId()) == null) ? "" : creativeId, c2431gb);
        }
        float f2 = 1 - f;
        r8.g = f2;
        com.inmobi.media.C2823v7 c2823v7 = r8.c;
        if (c2823v7 != null) {
            c2823v7.c = f2;
            c2823v7.c();
        }
        r8.b();
    }
}
