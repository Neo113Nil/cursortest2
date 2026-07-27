package com.vungle.ads.internal;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.NativeAd$adPlayCallback$1;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class o1 extends s implements com.vungle.ads.internal.presenter.x {
    public final View.OnTouchListener A;
    public final Lazy q;
    public final AtomicBoolean r;
    public final Lazy s;
    public com.vungle.ads.internal.presenter.w t;
    public LinkedHashMap u;
    public final Lazy v;
    public final Lazy w;
    public float x;
    public final Lazy y;
    public com.vungle.ads.internal.ui.a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.q = LazyKt.lazy(new i1(context));
        this.r = new AtomicBoolean(false);
        this.s = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new l1(context));
        this.v = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new m1(context));
        this.w = LazyKt.lazy(new h1(this));
        this.y = LazyKt.lazy(n1.f12036a);
        this.A = new View.OnTouchListener() { // from class: com.vungle.ads.internal.o1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return o1.a(o1.this, view, motionEvent);
            }
        };
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public final void b(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new g1(imageView));
    }

    public final void c(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_ICON_URL")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new g1(imageView));
    }

    @Override // com.vungle.ads.internal.s
    public final InvalidAdStateError j() {
        if (this.b == h.c || i()) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.b + " can not play native ad.");
    }

    public final Double m() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_RATING_VALUE")) == null) {
            return null;
        }
        return StringsKt.toDoubleOrNull(str);
    }

    public final c1 n() {
        return (c1) this.q.getValue();
    }

    public final String o() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final String p() {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("ORIGINAL_VIDEO_URL")) == null) ? "" : str;
    }

    public final String q() {
        j3 j3Var = this.d;
        if (j3Var != null) {
            return j3Var.f11983a;
        }
        return null;
    }

    public final NativeVideoOptions r() {
        return (NativeVideoOptions) this.y.getValue();
    }

    public final boolean s() {
        return o().length() > 0;
    }

    public final boolean t() {
        return s();
    }

    public final boolean u() {
        boolean booleanValue;
        String str;
        Boolean booleanStrictOrNull;
        if (((com.vungle.ads.internal.platform.c) ((com.vungle.ads.internal.platform.f) this.s.getValue())).n()) {
            return true;
        }
        Boolean startMuted = r().getStartMuted();
        if (startMuted != null) {
            booleanValue = startMuted.booleanValue();
        } else {
            LinkedHashMap linkedHashMap = this.u;
            booleanValue = (linkedHashMap == null || (str = (String) linkedHashMap.get(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f11570a)) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str)) == null) ? true : booleanStrictOrNull.booleanValue();
        }
        return booleanValue;
    }

    public final void v() {
        String str;
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_URL")) == null) {
                str = "";
            }
            wVar.a("openPrivacy", (String) null, str);
        }
    }

    public final void w() {
        String str;
        a(8, (Map) null);
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter("video.length", NotificationCompat.CATEGORY_EVENT);
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            wVar.a("tpat", "video.length", str);
        }
    }

    @Override // com.vungle.ads.internal.s
    public final void b(com.vungle.ads.internal.model.i0 advertisement) {
        String str;
        Object m8079constructorimpl;
        Throwable m8082exceptionOrNullimpl;
        Object m8079constructorimpl2;
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.u = advertisement.s();
        com.vungle.ads.internal.util.s e = e();
        Long a2 = e != null ? e.a() : null;
        if ((a2 != null && a2.longValue() == 3) || (a2 != null && a2.longValue() == 4)) {
            l();
        }
        if (s()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                Context d = d();
                Uri parse = Uri.parse(o());
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                mediaMetadataRetriever.setDataSource(d, parse);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                int i = 0;
                int intValue = (extractMetadata == null || (intOrNull2 = StringsKt.toIntOrNull(extractMetadata)) == null) ? 0 : intOrNull2.intValue();
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null && (intOrNull = StringsKt.toIntOrNull(extractMetadata2)) != null) {
                    i = intOrNull.intValue();
                }
                if (intValue > 0 && i > 0) {
                    this.x = intValue / i;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    mediaMetadataRetriever.release();
                    m8079constructorimpl2 = Result.m8079constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                }
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
                if (m8082exceptionOrNullimpl == null) {
                    return;
                }
            } catch (Throwable th2) {
                try {
                    boolean z = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.b("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        mediaMetadataRetriever.release();
                        m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th3));
                    }
                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                    if (m8082exceptionOrNullimpl == null) {
                        return;
                    }
                } finally {
                }
            }
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("NativeAdInternal", "Failed to release metadata retriever", m8082exceptionOrNullimpl);
            return;
        }
        com.vungle.ads.internal.util.p pVar = (com.vungle.ads.internal.util.p) this.w.getValue();
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        k1 k1Var = new k1(this);
        pVar.getClass();
        com.vungle.ads.internal.util.p.a(str, k1Var);
    }

    public static final com.vungle.ads.internal.executor.a a(o1 o1Var) {
        return (com.vungle.ads.internal.executor.a) o1Var.v.getValue();
    }

    public static final boolean a(o1 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.w wVar = this$0.t;
        if (wVar == null) {
            return false;
        }
        wVar.a(motionEvent);
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(j3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.i();
    }

    public final void a(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.w.getValue()).a(str, new g1(imageView));
    }

    public final void a(int i, Map map) {
        com.vungle.ads.internal.presenter.w wVar = this.t;
        if (wVar != null) {
            wVar.a(i, map);
        }
    }

    public static void a(o1 o1Var, String event) {
        o1Var.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        com.vungle.ads.internal.presenter.w wVar = o1Var.t;
        if (wVar != null) {
            wVar.a("tpat", event, (String) null);
        }
    }

    public final void a(ViewGroup rootView, String str) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (str == null) {
            return;
        }
        if (this.z == null) {
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "rootView.context");
            this.z = new com.vungle.ads.internal.ui.a0(context, str);
        }
        com.vungle.ads.internal.ui.a0 a0Var = this.z;
        if (a0Var == null || Intrinsics.areEqual(a0Var.getParent(), rootView)) {
            return;
        }
        ViewParent parent = a0Var.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(a0Var);
        }
        rootView.addView(a0Var);
        a0Var.bringToFront();
    }

    public final void a(View rootView, NativeAd$adPlayCallback$1 nativeAd$adPlayCallback$1) {
        String str;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        com.vungle.ads.internal.model.i0 c = c();
        if (c == null) {
            VungleError logError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release();
            if (nativeAd$adPlayCallback$1 != null) {
                nativeAd$adPlayCallback$1.onFailure(logError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.t == null) {
            com.vungle.ads.internal.presenter.w wVar = new com.vungle.ads.internal.presenter.w(d(), this, c, (com.vungle.ads.internal.platform.f) this.s.getValue());
            this.t = wVar;
            wVar.a(new com.vungle.ads.internal.presenter.a(nativeAd$adPlayCallback$1, f()));
        }
        com.vungle.ads.internal.presenter.w wVar2 = this.t;
        if (wVar2 != null) {
            LinkedHashMap linkedHashMap = this.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("OM_SDK_DATA")) == null) {
                str = "";
            }
            wVar2.a(rootView, str);
        }
        n().a(rootView, new j1(this));
        com.vungle.ads.internal.presenter.w wVar3 = this.t;
        if (wVar3 != null) {
            wVar3.c();
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.vungle.ads.internal.model.i0 c = c();
        if (c == null || !c.z()) {
            return;
        }
        view.setOnTouchListener(this.A);
    }
}
