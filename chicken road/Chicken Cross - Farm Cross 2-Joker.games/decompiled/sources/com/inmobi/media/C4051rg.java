package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.rg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4051rg {

    /* renamed from: a, reason: collision with root package name */
    public static final C4051rg f7353a = new C4051rg();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static C4136ug c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3938ng c3938ng;
        Object obj;
        int i;
        Context context;
        AdConfig.OmidConfig omidConfig;
        if (continuationImpl instanceof C3938ng) {
            c3938ng = (C3938ng) continuationImpl;
            int i2 = c3938ng.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3938ng.e = i2 - Integer.MIN_VALUE;
                obj = c3938ng.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3938ng.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    J4 j4 = AbstractC4260z4.f7518a;
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    AdConfig.OmidConfig omidConfig2 = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getViewability().getOmidConfig();
                    Context context2 = AbstractC3914mk.f7252a;
                    if (context2 == null) {
                        return Unit.INSTANCE;
                    }
                    c3938ng.f7266a = omidConfig2;
                    c3938ng.b = context2;
                    c3938ng.e = 1;
                    Object a2 = a(context2, omidConfig2, c3938ng);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context = context2;
                    omidConfig = omidConfig2;
                    obj = a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = c3938ng.b;
                    omidConfig = c3938ng.f7266a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                b.set(2);
                BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3967og(omidConfig, context, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        c3938ng = new C3938ng(this, continuationImpl);
        obj = c3938ng.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3938ng.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, ContinuationImpl continuationImpl) {
        C4023qg c4023qg;
        Object obj;
        int i;
        if (continuationImpl instanceof C4023qg) {
            c4023qg = (C4023qg) continuationImpl;
            int i2 = c4023qg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4023qg.c = i2 - Integer.MIN_VALUE;
                obj = c4023qg.f7328a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4023qg.c;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AtomicInteger atomicInteger = b;
                    if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                        C4136ug c4136ug = c;
                        if (c4136ug == null) {
                            c4136ug = new C4136ug(context);
                            c = c4136ug;
                        }
                        c4023qg.c = 1;
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new C4079sg(c4136ug, omidConfig, null), c4023qg);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        }
        c4023qg = new C4023qg(this, continuationImpl);
        obj = c4023qg.f7328a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4023qg.c;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boxing.boxBoolean(z2);
    }
}
