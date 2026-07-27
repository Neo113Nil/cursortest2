package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class Ff {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6558a;
    public final Ip b;
    public final Cf c;
    public final AtomicBoolean d;
    public final ArrayList e;

    public Ff(CoroutineScope coroutineScope, Ip viewabilityModel) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        this.f6558a = coroutineScope;
        this.b = viewabilityModel;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Gf gf = new Gf(new Kp(viewabilityModel.f6636a, viewabilityModel.c), new Kp(viewabilityModel.b, viewabilityModel.d));
        ViewGroup parentView = viewabilityModel.e.f7250a.getParentView();
        ImageView iconView = viewabilityModel.e.f7250a.getIconView();
        C3912mi c3912mi = viewabilityModel.e;
        MediaView mediaView = c3912mi.b;
        Intrinsics.checkNotNullParameter(c3912mi, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = c3912mi.b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = c3912mi.c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView = c3912mi.f7250a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        ImageView iconView2 = c3912mi.f7250a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        View titleView = c3912mi.f7250a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        View descriptionView = c3912mi.f7250a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        View ratingView = c3912mi.f7250a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        View advertiserView = c3912mi.f7250a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(c3912mi.f7250a.getExtraViews$media_release());
        this.c = new Cf(parentView, iconView, mediaView, CollectionsKt.toList(linkedHashSet), gf);
    }

    public static final Unit b(Ff ff, boolean z) {
        ff.c.e.b.b = z;
        return Unit.INSTANCE;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView = this.b.e.f7250a.getParentView();
        a(this.b.e.f7250a.getIconView(), parentView, this.b.f6636a, new Function1() { // from class: com.inmobi.media.Ff$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ff.a(Ff.this, ((Boolean) obj).booleanValue());
            }
        });
        Ip ip = this.b;
        a(ip.e.b, parentView, ip.b, new Function1() { // from class: com.inmobi.media.Ff$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ff.b(Ff.this, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            ArrayList arrayList = this.e;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3787i7.a((Job) it.next());
            }
            arrayList.clear();
            this.e.clear();
        }
    }

    public static final Unit a(Ff ff, boolean z) {
        ff.c.e.f6584a.b = z;
        return Unit.INSTANCE;
    }

    public final void a(View view, ViewGroup parentView, boolean z, Function1 function1) {
        Job launch$default;
        if (view == null || !z) {
            return;
        }
        CoroutineScope coroutineScope = this.f6558a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f6558a, null, null, new Ef(FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Hp(view, parentView, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.INSTANCE.getLazily(), Boolean.valueOf(Jp.b(view, parentView))), null, function1), 3, null);
        this.e.add(launch$default);
    }
}
