package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C4352c8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.BidRequest;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Fk {

    /* renamed from: a, reason: collision with root package name */
    public final yq f6562a;
    public final Y9 b;

    public Fk(yq wvFactory, Y9 y9) {
        Intrinsics.checkNotNullParameter(wvFactory, "wvFactory");
        this.f6562a = wvFactory;
        this.b = y9;
    }

    public final Ej a() {
        Ej a2 = a(BuildConfig.FLAVOR);
        if (a2 != null) {
            return a2;
        }
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).b("Fk", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) {
        Object obj;
        Integer a2;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).a("Fk", "showWebView " + this);
        }
        Ej a3 = a(sourceId);
        if (a3 == null) {
            return;
        }
        Ej a4 = a(targetId);
        if (a4 == null) {
            Lazy lazy = Vj.f6915a;
            JSONObject a5 = Ek.a(targetId, "targetViewId", "id", targetId);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a3.b("showWebView", a5);
            return;
        }
        if (Intrinsics.areEqual(targetId, BuildConfig.FLAVOR)) {
            a(a3, targetId, "showWebView");
            return;
        }
        if (!(a4 instanceof Mj)) {
            Lazy lazy2 = Vj.f6915a;
            JSONObject a6 = Ek.a(targetId, "targetViewId", "id", targetId);
            a6.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a3.b("showWebView", a6);
            return;
        }
        Ej a7 = a();
        if (a7 != null && !a7.isAttachedToWindow()) {
            Lazy lazy3 = Vj.f6915a;
            JSONObject a8 = Ek.a(targetId, "targetViewId", "id", targetId);
            a8.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a3.b("showWebView", a8);
            return;
        }
        Integer a9 = a4.getWvStateMachine().a(5);
        if (a9 != null) {
            int intValue = a9.intValue();
            Lazy lazy4 = Vj.f6915a;
            JSONObject a10 = Ek.a(targetId, "targetViewId", "id", targetId);
            a10.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a3.b("showWebView", a10);
            return;
        }
        Iterator it = MapsKt.toMap(this.f6562a.b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Ej ej = (Ej) obj;
            if (ej.getWvStateMachine().b == 105 && !Intrinsics.areEqual(ej, a4) && !Intrinsics.areEqual(ej.getRoute().b, BuildConfig.FLAVOR)) {
                break;
            }
        }
        Ej ej2 = (Ej) obj;
        if (ej2 != null && (a2 = ej2.getWvStateMachine().a(7)) != null) {
            int intValue2 = a2.intValue();
            Lazy lazy5 = Vj.f6915a;
            JSONObject a11 = Ek.a(targetId, "targetViewId", "id", targetId);
            a11.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue2);
            a3.b("showWebView", a11);
        }
        Mj mj = (Mj) a4;
        if (mj.isAttachedToWindow()) {
            a(a4, a3, targetId);
            return;
        }
        a(a3, mj);
        a(a4);
        Tp viewableAd = mj.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = a4.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final Ej a(String id) {
        yq yqVar = this.f6562a;
        yqVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Ej ej = (Ej) yqVar.b.get(id);
        if (ej != null) {
            return ej;
        }
        Y9 y9 = this.b;
        if (y9 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
        ((Z9) y9).b("Fk", "View with ID: " + id + " not found.");
        return null;
    }

    public final void a(Ej ej, Mj mj) {
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).a("Fk", "setUpLayoutForAd " + this);
        }
        Ej a2 = a();
        Context containerContext = a2 != null ? a2.getContainerContext() : null;
        if (containerContext == null) {
            Y9 y92 = this.b;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y92).b("Fk", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            Y9 y93 = this.b;
            if (y93 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y93).b("Fk", "Context is not an instance of InMobiAdActivity.");
            }
            a(ej, mj.getRoute().b, "loadWebView");
            return;
        }
        mj.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Y9 y94 = this.b;
        if (y94 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y94).a("Fk", "target View's Viewable ad - " + mj.getViewableAd());
        }
        View c = mj.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((c != null ? c.getParent() : null) != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c);
            }
        }
        relativeLayout.addView(c, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        mj.a(relativeLayout);
        Y9 y95 = this.b;
        if (y95 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y95).a("Fk", "Target View added - the inflatedView is - " + c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup] */
    public final void a(Ej ej) {
        Tp viewableAd;
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).a("Fk", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = ej.getParent();
        Ej ej2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (ej2 != null) {
            ej = ej2;
        }
        Ej a2 = a();
        if (a2 == null || (viewableAd = a2.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(ej, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String sourceId, String targetId, String html) {
        Context context;
        Ej a2;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(html, "html");
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).a("Fk", "loadWebView " + this);
        }
        Ej a3 = a();
        Context containerContext = a3 != null ? a3.getContainerContext() : null;
        if (containerContext == null) {
            Y9 y92 = this.b;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y92).b("Fk", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (a2 = a(sourceId)) == null) {
            return;
        }
        if (Intrinsics.areEqual(targetId, BuildConfig.FLAVOR)) {
            a(a2, targetId, "loadWebView");
            return;
        }
        Ej a4 = a();
        if (a4 == null) {
            a2.b("loadWebView", Vj.a(targetId, Sdk.SDKError.Reason.AD_EXPIRED_VALUE));
            return;
        }
        Ej a5 = a(targetId);
        if (a5 != null) {
            int i = a5.getWvStateMachine().b;
            Lazy lazy = Vj.f6915a;
            JSONObject a6 = Ek.a(targetId, "targetViewId", "id", targetId);
            a6.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            a2.b("loadWebView", a6);
            return;
        }
        Mj a7 = a(a4, targetId, this, a2, context, SystemClock.elapsedRealtime());
        if (a7 != null) {
            a7.i(html);
        }
    }

    public static final Mj a(Ej ej, String str, Fk fk, Ej ej2, Context context, long j) {
        C3979p0 c3979p0;
        C3979p0 c3979p02;
        Ij ij;
        C3979p0 adMetaData = ej.getAdMetaData();
        if (adMetaData != null) {
            Ij ij2 = ej.getAdMetaData().s;
            if (ij2 != null) {
                C4201x0 placement = ij2.f6630a;
                String markupType = ij2.b;
                String impressionId = ij2.c;
                String telemetryMetadataBlob = ij2.d;
                int i = ij2.e;
                String creativeType = ij2.f;
                String creativeId = ij2.g;
                boolean z = ij2.h;
                int i2 = ij2.i;
                C4064s1 c4064s1 = ij2.j;
                Nj nj = ij2.k;
                InlineParams inlineParams = ij2.m;
                Intrinsics.checkNotNullParameter(placement, "placement");
                Intrinsics.checkNotNullParameter(markupType, "markupType");
                Intrinsics.checkNotNullParameter(impressionId, "impressionId");
                Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
                Intrinsics.checkNotNullParameter(creativeType, "creativeType");
                Intrinsics.checkNotNullParameter(creativeId, "creativeId");
                c3979p02 = adMetaData;
                ij = new Ij(placement, markupType, impressionId, telemetryMetadataBlob, i, creativeType, creativeId, z, i2, c4064s1, nj, str, inlineParams);
            } else {
                c3979p02 = adMetaData;
                ij = null;
            }
            c3979p0 = C3979p0.a(c3979p02, ij, 3665663);
        } else {
            c3979p0 = null;
        }
        if (c3979p0 == null) {
            Y9 y9 = fk.b;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y9).b("Fk", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        Ej a2 = fk.f6562a.a(new C3715fk(ej2.getRoute().b, str), context, (short) 1, c3979p0, ej.getAdConfig());
        Mj mj = a2 instanceof Mj ? (Mj) a2 : null;
        if (mj == null) {
            Y9 y92 = fk.b;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y92).b("Fk", "Failed to create Sibling WebView with ID: " + str);
            }
            ej2.b("loadWebView", Vj.a(str, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        Integer a3 = mj.getWvStateMachine().a(1);
        if (a3 != null) {
            ej2.b("loadWebView", Vj.a(str, a3.intValue()));
        }
        mj.b0();
        Oj renderViewTelemetry = mj.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.b = j;
        }
        return mj;
    }

    public final void a(String sourceId, String targetId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Ej a2 = a(sourceId);
        if (a2 == null) {
            return;
        }
        Ej a3 = a(targetId);
        if (a3 == null) {
            Lazy lazy = Vj.f6915a;
            JSONObject a4 = Ek.a(targetId, "targetViewId", "id", targetId);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a2.b("destroyWebView", a4);
            return;
        }
        if (Intrinsics.areEqual(targetId, BuildConfig.FLAVOR)) {
            a(a2, targetId, "destroyWebView");
            return;
        }
        Integer a5 = a3.getWvStateMachine().a(8);
        if (a5 != null) {
            int intValue = a5.intValue();
            Lazy lazy2 = Vj.f6915a;
            JSONObject a6 = Ek.a(targetId, "targetViewId", "id", targetId);
            a6.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a2.b("destroyWebView", a6);
            return;
        }
        a3.b();
        a2.a(a2, targetId);
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).a("Fk", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(Ej ej, String str, String str2) {
        Y9 y9 = this.b;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y9).b("Fk", "Cannot perform operations on default WebView with ID: " + str);
        }
        ej.b(str2, Vj.a(str, 303));
    }

    public final void a(Ej ej, Ej ej2, String str) {
        ViewParent parent = ej.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = ej;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            ej2.b("showWebView", Vj.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            Y9 y9 = this.b;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y9).a("Fk", "Sibling view brought to front: " + ej);
            }
        } else {
            Y9 y92 = this.b;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y92).b("Fk", "Sibling view not found in parent: " + ej);
            }
        }
        ej2.c(ej2, str);
    }

    public final void b(String sourceId, String targetId, String message) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(message, "message");
        Ej a2 = a(sourceId);
        if (a2 == null) {
            return;
        }
        Ej a3 = a(targetId);
        if (a3 == null) {
            Lazy lazy = Vj.f6915a;
            JSONObject a4 = Ek.a(targetId, "targetViewId", "id", targetId);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a2.b(C4352c8.j, a4);
            return;
        }
        int i = a3.getWvStateMachine().b;
        if (!Intrinsics.areEqual(a3.getRoute().b, BuildConfig.FLAVOR) && CollectionsKt.listOf((Object[]) new Integer[]{101, 104, Integer.valueOf(BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE)}).contains(Integer.valueOf(i))) {
            Y9 y9 = this.b;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
                ((Z9) y9).b("Fk", "WebView is not in state to receive messages: " + targetId);
            }
            int i2 = a3.getWvStateMachine().b;
            Lazy lazy2 = Vj.f6915a;
            JSONObject a5 = Ek.a(targetId, "targetViewId", "id", targetId);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            a2.b(C4352c8.j, a5);
            return;
        }
        Y9 y92 = this.b;
        if (y92 != null) {
            Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            ((Z9) y92).a("Fk", "Sending message to WebView ID: " + targetId);
        }
        a3.h(message);
    }
}
