package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.in, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3802in extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7167a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3802in(Context context, Continuation continuation) {
        super(1, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3802in(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3802in(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        ?? emptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7167a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = T9.f6868a;
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                String[] databaseList = context.databaseList();
                if (databaseList != null) {
                    emptyList = new ArrayList();
                    for (String str : databaseList) {
                        Intrinsics.checkNotNull(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !Intrinsics.areEqual(str, "com.im_11.4.0.db")) {
                            emptyList.add(str);
                        }
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                for (String str2 : emptyList) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            C3869l5 c3869l5 = C3869l5.f7216a;
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new C3728g5(null), 1, null);
            if (G0.b == null) {
                G0.b = new C0();
            }
            J4 j4 = AbstractC4260z4.f7518a;
            AbstractC4260z4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, G0.d);
            C0 c0 = G0.b;
            if (c0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                c0 = null;
            }
            if (!c0.f6484a.get()) {
                C0 c02 = G0.b;
                if (c02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    c02 = null;
                }
                if (!c02.f6484a.get()) {
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    if (((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        c02.a();
                    }
                }
            }
            AbstractC4045ra.b();
            AbstractC4045ra.a();
            C3900m6 c3900m6 = AbstractC3841k6.f7196a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            J4 j42 = AbstractC4260z4.f7518a;
            AdConfig adConfig = (AdConfig) j42.a(AdConfig.class);
            P0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean a2 = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            AbstractC3841k6.e = a2;
            if (!a2 && AbstractC3841k6.c == null) {
                Context context2 = AbstractC3914mk.f7252a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Db.b;
                    Db a3 = Cb.a(context2, "display_info_store");
                    Intrinsics.checkNotNullParameter("gesture_margin", "key");
                    string = a3.f6510a.getString("gesture_margin", null);
                }
                AbstractC3841k6.c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                AbstractC3841k6.j();
                AbstractC3841k6.i();
            }
            AbstractC3997pi.b();
            Ml ml = Ml.f6723a;
            Context appContext = this.b.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(appContext, "getApplicationContext(...)");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) j42.a(SignalsConfig.class);
            if (!signalsConfig.getSynapse().isEnabled()) {
                Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2501));
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("SynapseInit", hashMapOf, EnumC3944nm.f7271a);
            } else if (Ml.f.compareAndSet(false, true)) {
                HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0));
                C3829jm c3829jm2 = C3829jm.f7187a;
                C3829jm.b("SynapseInit", hashMapOf2, EnumC3944nm.f7271a);
                BuildersKt__Builders_commonKt.launch$default(Ml.c, null, null, new Ll(appContext, signalsConfig, null), 3, null);
            } else {
                Intrinsics.checkNotNullExpressionValue("Ml", "TAG");
                HashMap hashMapOf3 = MapsKt.hashMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2516));
                C3829jm c3829jm3 = C3829jm.f7187a;
                C3829jm.b("SynapseInit", hashMapOf3, EnumC3944nm.f7271a);
            }
            C3859kn c3859kn = C3859kn.f7207a;
            this.f7167a = 1;
            if (c3859kn.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context3 = this.b;
        Intrinsics.checkNotNullParameter(context3, "context");
        try {
            Reflection.getOrCreateKotlinClass(ActivityFilter.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(ActivityRule.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(RuleController.class).getSimpleName();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(SetsKt.setOf(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), (String) null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.b;
        Intrinsics.checkNotNullParameter(context4, "context");
        ConcurrentHashMap concurrentHashMap2 = Db.b;
        Cb.a(context4, "sdk_version_store").a("sdk_version", "11.4.0", false);
        C3859kn.b = true;
        return Unit.INSTANCE;
    }
}
