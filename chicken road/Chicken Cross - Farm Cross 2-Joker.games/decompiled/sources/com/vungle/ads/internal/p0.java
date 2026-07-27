package com.vungle.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class p0 {
    public static final String d = Pattern.quote("{{{req_width}}}");
    public static final String e = Pattern.quote("{{{req_height}}}");
    public static final String f = Pattern.quote("{{{width}}}");
    public static final String g = Pattern.quote("{{{height}}}");
    public static final String h = Pattern.quote("{{{down_x}}}");
    public static final String i = Pattern.quote("{{{down_y}}}");
    public static final String j = Pattern.quote("{{{up_x}}}");
    public static final String k = Pattern.quote("{{{up_y}}}");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12072a;
    public final com.vungle.ads.internal.model.i0 b;
    public final l0 c;

    public p0(Context context, com.vungle.ads.internal.model.i0 advertisement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.f12072a = context;
        this.b = advertisement;
        this.c = new l0(new m0(Integer.MIN_VALUE, Integer.MIN_VALUE), new m0(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.b.z()) {
            int action = event.getAction();
            if (action == 0) {
                this.c.a(new m0((int) event.getX(), (int) event.getY()));
                return;
            }
            if (action != 1) {
                return;
            }
            this.c.b(new m0((int) event.getX(), (int) event.getY()));
            if (this.c.c()) {
                List<String> a2 = com.vungle.ads.internal.model.i0.a(this.b, "video.clickCoordinates", (String) null, 6);
                if (a2 == null || a2.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.b.q()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                int d2 = this.b.d();
                int a3 = d2 == 0 ? new n0(this.f12072a).b.widthPixels : com.vungle.ads.internal.util.a0.a(this.f12072a, d2);
                int a4 = this.b.a();
                int a5 = a4 == 0 ? new n0(this.f12072a).b.heightPixels : com.vungle.ads.internal.util.a0.a(this.f12072a, a4);
                int d3 = this.b.d();
                int a6 = d3 == 0 ? new n0(this.f12072a).b.widthPixels : com.vungle.ads.internal.util.a0.a(this.f12072a, d3);
                int a7 = this.b.a();
                int a8 = a7 == 0 ? new n0(this.f12072a).b.heightPixels : com.vungle.ads.internal.util.a0.a(this.f12072a, a7);
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new o0(this.f12072a));
                for (String str : a2) {
                    String MACRO_REQ_WIDTH = d;
                    Intrinsics.checkNotNullExpressionValue(MACRO_REQ_WIDTH, "MACRO_REQ_WIDTH");
                    String replace = new Regex(MACRO_REQ_WIDTH).replace(str, String.valueOf(a3));
                    String MACRO_REQ_HEIGHT = e;
                    Intrinsics.checkNotNullExpressionValue(MACRO_REQ_HEIGHT, "MACRO_REQ_HEIGHT");
                    String replace2 = new Regex(MACRO_REQ_HEIGHT).replace(replace, String.valueOf(a5));
                    String MACRO_WIDTH = f;
                    Intrinsics.checkNotNullExpressionValue(MACRO_WIDTH, "MACRO_WIDTH");
                    String replace3 = new Regex(MACRO_WIDTH).replace(replace2, String.valueOf(a6));
                    String MACRO_HEIGHT = g;
                    Intrinsics.checkNotNullExpressionValue(MACRO_HEIGHT, "MACRO_HEIGHT");
                    String replace4 = new Regex(MACRO_HEIGHT).replace(replace3, String.valueOf(a8));
                    String MACRO_DOWN_X = h;
                    Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_X, "MACRO_DOWN_X");
                    String replace5 = new Regex(MACRO_DOWN_X).replace(replace4, String.valueOf(this.c.a().a()));
                    String MACRO_DOWN_Y = i;
                    Intrinsics.checkNotNullExpressionValue(MACRO_DOWN_Y, "MACRO_DOWN_Y");
                    String replace6 = new Regex(MACRO_DOWN_Y).replace(replace5, String.valueOf(this.c.a().b()));
                    String MACRO_UP_X = j;
                    Intrinsics.checkNotNullExpressionValue(MACRO_UP_X, "MACRO_UP_X");
                    String replace7 = new Regex(MACRO_UP_X).replace(replace6, String.valueOf(this.c.b().a()));
                    String MACRO_UP_Y = k;
                    Intrinsics.checkNotNullExpressionValue(MACRO_UP_Y, "MACRO_UP_Y");
                    ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p(new Regex(MACRO_UP_Y).replace(replace7, String.valueOf(this.c.b().b()))).b("coordinate").a(), false);
                }
            }
        }
    }
}
