package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.sdk.controller.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3962ob extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4130ub f7284a;
    public final /* synthetic */ HtmlVideoPlayerRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3962ob(C4130ub c4130ub, HtmlVideoPlayerRequest htmlVideoPlayerRequest, Continuation continuation) {
        super(2, continuation);
        this.f7284a = c4130ub;
        this.b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3962ob(this.f7284a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3962ob(this.f7284a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Ej ej = this.f7284a.f7412a;
        HtmlVideoPlayerRequest obj2 = this.b;
        ej.getClass();
        Intrinsics.checkNotNullParameter(obj2, "requestConfig");
        Y9 y9 = ej.i;
        if (y9 != null) {
            ((Z9) y9).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (ej.getAdConfig().getHybridNative().getIsEnabled()) {
            String maxSupportedPlayerVersion = ej.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            Oj oj = ej.f0;
            try {
                AbstractC3748gp.a(maxSupportedPlayerVersion);
                boolean z = true;
                ej.b1 = true;
                if (ej.a1 == null) {
                    AdConfig.HybridNativeConfig hybridNative = ej.getAdConfig().getHybridNative();
                    Cj cj = ej.c1;
                    Oj oj2 = ej.f0;
                    Y9 y92 = ej.i;
                    C3591b9 c3591b9 = new C3591b9(ej, hybridNative, obj2, cj, oj2, y92);
                    ej.a1 = c3591b9;
                    C4193wj videoLoadListener = new C4193wj(ej);
                    Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
                    Intrinsics.checkNotNullParameter(obj2, "obj");
                    String valueOf = String.valueOf(AbstractC3875lb.a(obj2, HtmlVideoPlayerRequest.class));
                    Y8[] y8Arr = {Y8.f6968a};
                    G8[] g8Arr = G8.f6577a;
                    if (c3591b9.a(y8Arr, "createVideoPlayer", valueOf, Y8.b)) {
                        if (y92 != null) {
                            ((Z9) y92).b("HybridVideoPlayerHandler", "load called with video files");
                        }
                        c3591b9.l = videoLoadListener;
                        if (c3591b9.f == null) {
                            c3591b9.f = FlowKt.launchIn(FlowKt.onEach(c3591b9.j.C, new Z8(c3591b9, null)), c3591b9.e);
                        }
                        C4043r8 c4043r8 = c3591b9.j;
                        if (!c4043r8.h.get()) {
                            c4043r8.a(new J8(c4043r8.f7345a));
                            if (c4043r8.c() == Kh.f6674a) {
                                c4043r8.j.set(Kh.b);
                                c4043r8.q.clear();
                                c4043r8.q.addAll(c4043r8.f7345a.getVideoFiles());
                                List list = c4043r8.q;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                }
                                if (arrayList.isEmpty()) {
                                    c4043r8.a(new I8(Oo.e));
                                } else {
                                    launch$default = BuildersKt__Builders_commonKt.launch$default(c4043r8.c, null, null, new C3731g8(c4043r8, arrayList, null), 3, null);
                                    c4043r8.t = launch$default;
                                }
                            } else {
                                c4043r8.a(new I8(Oo.f));
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (Intrinsics.areEqual(Boolean.valueOf(z), Boolean.TRUE)) {
                        V8 v8 = V8.i;
                        Intrinsics.checkNotNullParameter(obj2, "obj");
                        ej.a(v8, AbstractC3875lb.a(obj2, HtmlVideoPlayerRequest.class));
                    }
                    ej.getViewableAd();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorMsg", "Hybrid video player is already created.");
                    G8[] g8Arr2 = G8.f6577a;
                    jSONObject.put(f.b.g, "createVideoPlayer");
                    V8 v82 = V8.b;
                    ej.a("VideoCommandError", jSONObject);
                }
            } catch (Jh e) {
                if (oj != null) {
                    oj.a(e.f6653a);
                }
            }
            return Unit.INSTANCE;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", "Hybrid video is not supported on this device.");
        G8[] g8Arr3 = G8.f6577a;
        jSONObject2.put(f.b.g, "createVideoPlayer");
        V8 v83 = V8.b;
        ej.a("VideoCommandError", jSONObject2);
        Y9 y93 = ej.i;
        if (y93 != null) {
            ((Z9) y93).b("HtmlVideoPlayer", "Cannot play hybrid video");
        }
        return Unit.INSTANCE;
    }
}
