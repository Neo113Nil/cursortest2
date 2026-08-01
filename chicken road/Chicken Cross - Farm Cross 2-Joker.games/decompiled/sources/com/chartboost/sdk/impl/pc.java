package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class pc extends nc implements zk {
    public final MediaEvents k;
    public final Integer l;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ rj c;
        public final /* synthetic */ pc d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rj rjVar, pc pcVar, Continuation continuation) {
            super(2, continuation);
            this.c = rjVar;
            this.d = pcVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String a2 = this.c.a();
                switch (a2.hashCode()) {
                    case -1638835128:
                        if (!a2.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.midpoint();
                            break;
                        }
                    case -1337830390:
                        if (!a2.equals("thirdQuartile")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.thirdQuartile();
                            break;
                        }
                    case -1036064766:
                        if (!a2.equals("bufferStart")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.bufferStart();
                            break;
                        }
                    case -934426579:
                        if (!a2.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.resume();
                            break;
                        }
                    case -599445191:
                        if (!a2.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.complete();
                            break;
                        }
                    case 3532159:
                        if (!a2.equals("skip")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.skipped();
                            break;
                        }
                    case 94750088:
                        if (!a2.equals("click")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.adUserInteraction(InteractionType.CLICK);
                            break;
                        }
                    case 106440182:
                        if (a2.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                            this.d.k.pause();
                            break;
                        }
                        mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                        break;
                    case 120623625:
                        if (!a2.equals("impression")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.a();
                            break;
                        }
                    case 560220243:
                        if (!a2.equals("firstQuartile")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.firstQuartile();
                            break;
                        }
                    case 1859771635:
                        if (!a2.equals("bufferFinish")) {
                            mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                            break;
                        } else {
                            this.d.k.bufferFinish();
                            break;
                        }
                    default:
                        mb.a("No viewability action taken on video " + this.c.a(), (Throwable) null, 2, (Object) null);
                        break;
                }
            } catch (Exception e) {
                mb.b("Viewability update for " + this.c.a() + " failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, Continuation continuation) {
            super(2, continuation);
            this.d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return pc.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                pc.this.k.volumeChange(this.d);
            } catch (Exception e) {
                mb.b("Viewability video player volume failed to update to " + this.d + ".", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.d = f;
            this.e = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return pc.this.new c(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                pc.this.k.start(this.d, this.e);
            } catch (Exception e) {
                mb.b("Start viewability media event failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(sk manager, AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents, View videoView, Integer num) {
        super(manager, adSession, adEvents, videoView, null, 16, null);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.k = mediaEvents;
        this.l = num;
    }

    @Override // com.chartboost.sdk.impl.nc, com.chartboost.sdk.impl.wk
    public void c() {
        a(yk.d, this.l);
    }

    @Override // com.chartboost.sdk.impl.zk
    public void a(float f, float f2) {
        if (f()) {
            BuildersKt__Builders_commonKt.launch$default(d(), null, null, new c(Math.max(f, 0.0f), Math.min(Math.max(f2, 0.0f), 1.0f), null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.wk
    public void a(float f) {
        BuildersKt__Builders_commonKt.launch$default(d(), null, null, new b(f, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.zk
    public void a(rj videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (f()) {
            BuildersKt__Builders_commonKt.launch$default(d(), null, null, new a(videoEvent, this, null), 3, null);
        }
    }
}
