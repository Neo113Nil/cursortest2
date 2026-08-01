package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* renamed from: com.inmobi.media.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3671e5 {

    /* renamed from: a, reason: collision with root package name */
    public final ContextData f7080a;
    public final long b;
    public final String c = "e5";
    public final C3899m5 d = new C3899m5();
    public long e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public C3671e5(ContextData contextData, long j) {
        this.f7080a = contextData;
        this.b = j;
    }

    public final void a() {
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "initialize " + this;
        ContextData contextData = this.f7080a;
        if (contextData != null) {
            C3869l5.f7216a.a(contextData.getEnabled());
        }
        C3869l5 c3869l5 = C3869l5.f7216a;
        if (C3869l5.e() && !this.f.getAndSet(true)) {
            this.e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.e / 1000);
        }
    }

    public final void b() {
        C3869l5 c3869l5 = C3869l5.f7216a;
        if (!C3869l5.e()) {
            String TAG = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "onDestroy Contextual Data is not enabled " + this;
            return;
        }
        if (!this.f.get()) {
            String TAG2 = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            String str2 = "onDestroy Error, Contextual Data not initialised " + this;
            return;
        }
        a((int) (System.currentTimeMillis() - this.e));
        if (this.g.getAndSet(true)) {
            String TAG3 = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            String str3 = "onDestroy Finalized Already " + this;
        } else {
            String TAG4 = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            String str4 = "onDestroy " + this;
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.e5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3671e5.a(C3671e5.this);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC3914mk.h.submit(runnable);
        }
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.g.get() || (contextData = this.f7080a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        C3899m5 c3899m5 = this.d;
        c3899m5.getClass();
        Intrinsics.checkNotNullParameter(advertisedContent, "<set-?>");
        c3899m5.f7239a = advertisedContent;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "advertisedContent " + this;
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.g.get() || (contextData = this.f7080a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.d.b = bidderId.longValue();
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setBidderId " + this;
    }

    public final void e() {
        ContextData contextData;
        if (this.g.get() || (contextData = this.f7080a) == null) {
            return;
        }
        this.d.f = contextData.getCasAdTypeId();
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setCASAdTypeId " + this;
    }

    public final void f() {
        if (this.g.get()) {
            return;
        }
        this.d.g = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setHasClicked " + this;
    }

    public final void g() {
        if (this.g.get()) {
            return;
        }
        this.d.i = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setHasCompletedVideo " + this;
    }

    public final void h() {
        if (this.g.get()) {
            return;
        }
        this.d.h = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setHasSkippedVideo " + this;
    }

    public final void i() {
        if (this.g.get()) {
            return;
        }
        this.d.e = this.b;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setPlacementId " + this;
    }

    public final void a(long j) {
        if (this.g.get()) {
            return;
        }
        this.d.c = j;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setImpressionTimeStamp " + this;
    }

    public final void a(int i) {
        if (this.g.get()) {
            return;
        }
        this.d.d = i;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setViewTimeInMillis " + this;
    }

    public static final void a(C3671e5 c3671e5) {
        C3869l5 c3869l5 = C3869l5.f7216a;
        C3899m5 contextualDataModel = c3671e5.d;
        Intrinsics.checkNotNullParameter(contextualDataModel, "contextualDataModel");
        synchronized (c3869l5) {
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            long currentTimeMillis = System.currentTimeMillis();
            long expiryTime = currentTimeMillis - (C3869l5.c().getContextualData().getExpiryTime() * 1000);
            C3869l5.a(expiryTime, C3869l5.c().getContextualData().getMaxAdRecords() - 1);
            String jSONArray = AbstractC3927n5.a(contextualDataModel, C3869l5.c().getContextualData().getSkipFields()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            C4207x6 c4207x6 = new C4207x6(AbstractC4234y6.b(jSONArray, C3869l5.e), currentTimeMillis);
            C3869l5.c.add(c4207x6);
            Object clone = C3869l5.c.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            C3869l5.d = (LinkedList) clone;
            BuildersKt__BuildersKt.runBlocking$default(null, new C3812j5(c4207x6, expiryTime, null), 1, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
