package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4100t9 implements InterfaceC4097t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4156v9 f7389a;

    public C4100t9(C4156v9 c4156v9) {
        this.f7389a = c4156v9;
    }

    public final void a(String expandInput, EnumC4069s6 inputType, float f, boolean z, long j, Yb yb) {
        String str;
        String creativeId;
        String impressionId;
        C4041r6 c4041r6;
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        C4156v9 c4156v9 = this.f7389a;
        Activity activity = (Activity) c4156v9.f7432a.get();
        if (activity == null) {
            return;
        }
        if (c4156v9.e == null) {
            C4041r6 c4041r62 = new C4041r6(activity);
            Y9 y9 = c4156v9.h;
            if (y9 != null) {
                c4041r62.setLogger(y9);
            }
            c4041r62.setId(65518);
            c4041r62.setEmbeddedBrowserUpdateListener(c4156v9.i);
            c4156v9.e = c4041r62;
        }
        D d = c4156v9.b;
        if ((d instanceof Ej) && (c4041r6 = c4156v9.e) != null) {
            c4041r6.setUserLeftApplicationListener(((Ej) d).getListener());
        }
        C4041r6 c4041r63 = c4156v9.e;
        if (c4041r63 != null) {
            D d2 = c4156v9.b;
            if (d2 == null || (str = ((Ej) d2).getAdType()) == null) {
                str = "banner";
            }
            String str2 = str;
            D d3 = c4156v9.b;
            String str3 = (d3 == null || (impressionId = ((Ej) d3).getImpressionId()) == null) ? "" : impressionId;
            D d4 = c4156v9.b;
            c4041r63.a(expandInput, inputType, z, j, str2, str3, (d4 == null || (creativeId = ((Ej) d4).getCreativeId()) == null) ? "" : creativeId, yb);
        }
        float f2 = 1 - f;
        c4156v9.g = f2;
        U7 u7 = c4156v9.c;
        if (u7 != null) {
            u7.c = f2;
            u7.c();
        }
        c4156v9.b();
    }
}
