package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.ui.e;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class a implements NativeAd.Assets {
    public static final C1487a m = new C1487a(null);
    public static final int n = 8;
    public static final String o = "NativeAdAssetsProvider";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10633a;
    public final Q b;
    public final C c;
    public final z d;
    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> e;
    public final MetricsRecorder f;
    public Function0<Unit> g;
    public boolean h;
    public com.moloco.sdk.internal.publisher.nativead.model.d i;
    public final Uri j;
    public ViewGroup k;
    public FrameLayout l;

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C1487a {
        public /* synthetic */ C1487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1487a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, Q viewVisibilityTracker, C viewLifecycleOwner, z watermark, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> vastAdPlaylistController, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10633a = context;
        this.b = viewVisibilityTracker;
        this.c = viewLifecycleOwner;
        this.d = watermark;
        this.e = vastAdPlaylistController;
        this.f = metricsRecorder;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        this.j = dVar != null ? dVar.b(1) : null;
    }

    public static /* synthetic */ void f() {
    }

    public final void a(Function0<Unit> function0) {
        this.g = function0;
    }

    public final boolean b() {
        return this.h;
    }

    public final Function0<Unit> c() {
        return this.g;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.d d() {
        return this.i;
    }

    public final FrameLayout e() {
        return this.l;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getMainImageUri() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public View getMediaView() {
        Uri b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d;
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Using cached video view", null, false, 12, null);
            a((ViewGroup) frameLayout);
            return frameLayout;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null && (d = dVar.d(2)) != null) {
            try {
                FrameLayout a2 = a(d);
                this.l = a2;
                return a2;
            } catch (NoClassDefFoundError e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "Compose dependency not available for native video rendering, falling back to image", e, false, 8, null);
                this.f.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e0.c()));
            }
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Using cached image view", null, false, 12, null);
            a(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.i;
        if (dVar2 == null || (b = dVar2.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup a3 = a(b);
        this.k = a3;
        return a3;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Float getRating() {
        String a2;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar == null || (a2 = dVar.a(6)) == null) {
            return null;
        }
        return StringsKt.toFloatOrNull(a2);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.c(3);
        }
        return null;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.i = dVar;
    }

    public final void a(FrameLayout frameLayout) {
        this.l = frameLayout;
    }

    public final FrameLayout a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke = this.e.invoke(aVar);
        invoke.d();
        if (this.h) {
            return new e(this.f10633a, invoke, this.b, this.d, this.g);
        }
        return new com.moloco.sdk.internal.publisher.nativead.ui.d(this.f10633a, invoke, this.b, this.c, this.d, this.g);
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.c(this.f10633a, uri, this.d, this.g, null, null, 48, null);
    }

    public final void a() {
        ViewParent viewParent = this.l;
        l lVar = viewParent instanceof l ? (l) viewParent : null;
        if (lVar != null) {
            lVar.destroy();
        }
        this.l = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }
}
