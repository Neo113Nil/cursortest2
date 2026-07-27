package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3989pa extends Tp {
    public final Mj d;
    public final T7 e;
    public final Z9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3989pa(Mj container, Mj renderView, T7 htmlAdTracker, Z9 z9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = renderView;
        this.e = htmlAdTracker;
        this.f = z9;
        this.g = "pa";
    }

    @Override // com.inmobi.media.Tp
    public final void a(Map map) {
        View b;
        Z9 z9 = this.f;
        if (z9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            z9.a(tag, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.d.setFriendlyViews(map);
        Z9 z92 = this.f;
        if (z92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            z92.a(tag2, "startTrackingVisibility");
        }
        Ej ej = this.f6879a;
        Mj mj = ej instanceof Mj ? (Mj) ej : null;
        if (mj == null) {
            return;
        }
        T7 t7 = this.e;
        View b2 = b();
        if (b2 == null || (b = b()) == null) {
            return;
        }
        t7.a(b2, b, mj.getVISIBILITY_CHANGE_LISTENER(), this.c.getViewability(), true);
    }

    @Override // com.inmobi.media.Tp
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.Tp
    public final void e() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            z9.a(tag, "stopTrackingForImpression");
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            z92.a(tag2, "stopTrackingForVisibility");
        }
        T7 t7 = this.e;
        View b = b();
        if (b == null) {
            return;
        }
        t7.b(b);
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        Z9 z9 = this.f;
        if (z9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            z9.a(tag, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        V exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        V exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        Z9 z9 = this.f;
        if (z9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            z9.a(tag, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
                return;
            }
            if (b == 1) {
                T7 t7 = this.e;
                Y9 y9 = t7.f;
                if (y9 != null) {
                    ((Z9) y9).c("HtmlAdTracker", "onActivityStopped");
                }
                C4044r9 c4044r9 = t7.g;
                if (c4044r9 != null) {
                    String TAG = c4044r9.d;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    c4044r9.c.a();
                    c4044r9.e.removeCallbacksAndMessages(null);
                    c4044r9.b.clear();
                }
                C4209x8 c4209x8 = t7.h;
                if (c4209x8 != null) {
                    c4209x8.e();
                    return;
                }
                return;
            }
            if (b == 2) {
                T7 t72 = this.e;
                Y9 y92 = t72.f;
                if (y92 != null) {
                    ((Z9) y92).c("HtmlAdTracker", "onActivityDestroyed");
                }
                C4044r9 c4044r92 = t72.g;
                if (c4044r92 != null) {
                    c4044r92.f7346a.clear();
                    c4044r92.b.clear();
                    c4044r92.c.a();
                    c4044r92.e.removeMessages(0);
                    c4044r92.c.b();
                }
                t72.g = null;
                C4209x8 c4209x82 = t72.h;
                if (c4209x82 != null) {
                    c4209x82.b();
                }
                t72.h = null;
                return;
            }
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            String str = "UnHandled sate ( " + ((int) b) + " ) received in onActivityStateChanged()";
        } catch (Exception e) {
            Z9 z92 = this.f;
            if (z92 != null) {
                String tag2 = this.g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                z92.b(tag2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            z9.a(tag, "destroy");
        }
        if (b() != null) {
            Z9 z92 = this.f;
            if (z92 != null) {
                String tag2 = this.g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                z92.a(tag2, "stopTrackingForVisibility");
            }
            T7 t7 = this.e;
            View b = b();
            if (b != null) {
                t7.b(b);
            }
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
