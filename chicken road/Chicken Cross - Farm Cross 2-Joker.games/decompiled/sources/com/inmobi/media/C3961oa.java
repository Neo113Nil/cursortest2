package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3961oa extends Tp {
    public final Up d;
    public final T7 e;
    public final Y9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3961oa(Ej container, Up mViewableAd, T7 htmlAdTracker, Y9 y9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = mViewableAd;
        this.e = htmlAdTracker;
        this.f = y9;
        this.g = "oa";
    }

    @Override // com.inmobi.media.Tp
    public final void a(Map map) {
        Y9 y9 = this.f;
        if (y9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View view = this.d.b();
        if (view != null) {
            Y9 y92 = this.f;
            if (y92 != null) {
                String TAG2 = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).a(TAG2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.c.getViewability();
            Ej ej = this.f6879a;
            Intrinsics.checkNotNull(ej, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            ej.setFriendlyViews(map);
            T7 t7 = this.e;
            t7.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view, "token");
            Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
            Y9 y93 = t7.f;
            if (y93 != null) {
                ((Z9) y93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (t7.f6866a == 0) {
                Y9 y94 = t7.f;
                if (y94 != null) {
                    ((Z9) y94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (Intrinsics.areEqual(t7.b, "video") || Intrinsics.areEqual(t7.b, "audio")) {
                Y9 y95 = t7.f;
                if (y95 != null) {
                    ((Z9) y95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                C4044r9 a2 = t7.a(t7.f6866a, viewabilityConfig);
                Y9 y96 = t7.f;
                if (y96 != null) {
                    ((Z9) y96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i = t7.d;
                int i2 = t7.c;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view, "token");
                C3988p9 c3988p9 = (C3988p9) a2.f7346a.get(view);
                if (!Intrinsics.areEqual(c3988p9 != null ? c3988p9.f7301a : null, view)) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    a2.f7346a.remove(view);
                    a2.b.remove(view);
                    a2.c.a(view);
                    a2.f7346a.put(view, new C3988p9(view, i, i2));
                    C4209x8 c4209x8 = a2.c;
                    c4209x8.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    c4209x8.a(view, view, view, i);
                }
            }
            this.e.a(view, view, ej.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.Tp
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Tp
    public final View c() {
        return this.d.c();
    }

    @Override // com.inmobi.media.Tp
    public final boolean d() {
        this.d.getClass();
        return false;
    }

    @Override // com.inmobi.media.Tp
    public final void e() {
        Y9 y9 = this.f;
        if (y9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "stopTrackingForImpression");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        if (childView instanceof Mj) {
            Y9 y9 = this.f;
            if (y9 != null) {
                String TAG = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        Y9 y92 = this.f;
        if (y92 != null) {
            String TAG2 = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "Adding friendly view: " + childView.getClass().getSimpleName() + " with obstruction code: " + obstructionCode);
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        if (childView instanceof Mj) {
            return;
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.Tp
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        Y9 y9 = this.f;
        if (y9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
            } else if (b == 1) {
                T7 t7 = this.e;
                Y9 y92 = t7.f;
                if (y92 != null) {
                    ((Z9) y92).c("HtmlAdTracker", "onActivityStopped");
                }
                C4044r9 c4044r9 = t7.g;
                if (c4044r9 != null) {
                    Intrinsics.checkNotNullExpressionValue(c4044r9.d, "TAG");
                    c4044r9.c.a();
                    c4044r9.e.removeCallbacksAndMessages(null);
                    c4044r9.b.clear();
                }
                C4209x8 c4209x8 = t7.h;
                if (c4209x8 != null) {
                    c4209x8.e();
                }
            } else if (b == 2) {
                T7 t72 = this.e;
                Y9 y93 = t72.f;
                if (y93 != null) {
                    ((Z9) y93).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                Intrinsics.checkNotNullExpressionValue(this.g, "TAG");
                String str = "UnHandled sate ( " + ((int) b) + " ) received in onActivityStateChanged()";
            }
        } catch (Exception e) {
            Y9 y94 = this.f;
            if (y94 != null) {
                String TAG2 = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y94).b(TAG2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
        } finally {
            this.d.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a() {
        Y9 y9 = this.f;
        if (y9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "destroy");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.e.b(b);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.d.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
