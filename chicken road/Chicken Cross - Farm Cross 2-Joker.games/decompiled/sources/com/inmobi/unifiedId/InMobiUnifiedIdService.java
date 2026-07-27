package com.inmobi.unifiedId;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.AbstractC3606bn;
import com.inmobi.media.AbstractC3727g4;
import com.inmobi.media.AbstractC3904ma;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3940ni;
import com.inmobi.media.AbstractC4045ra;
import com.inmobi.media.AbstractC4260z4;
import com.inmobi.media.C3829jm;
import com.inmobi.media.C4073sa;
import com.inmobi.media.C4101ta;
import com.inmobi.media.C4129ua;
import com.inmobi.media.C4157va;
import com.inmobi.media.C4184wa;
import com.inmobi.media.C4211xa;
import com.inmobi.media.Cb;
import com.inmobi.media.D7;
import com.inmobi.media.Db;
import com.inmobi.media.EnumC3944nm;
import com.inmobi.media.J4;
import com.inmobi.media.Kk;
import com.inmobi.media.Oi;
import com.inmobi.media.Vm;
import com.inmobi.media.Wm;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", Constants.PUSH, "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7534a = new AtomicBoolean();
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        JSONObject b2 = AbstractC4045ra.b();
        if (!AbstractC3606bn.b(b2) && b2 != null && AbstractC3606bn.c(b2)) {
            Wm wm = Wm.f6937a;
            Object a2 = Wm.a(inMobiUnifiedIdInterface, continuation);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!AbstractC3606bn.b(b2)) {
                AbstractC3606bn.a(inMobiUnifiedIdInterface, b2, null);
            } else {
                if (f7534a.get()) {
                    Wm wm2 = Wm.f6937a;
                    Object a3 = Wm.a(inMobiUnifiedIdInterface, continuation);
                    return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
                }
                AbstractC3606bn.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (com.inmobi.media.D7.a(null, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resetInternal(Continuation continuation) {
        C4211xa c4211xa;
        int i;
        Object a2;
        if (continuation instanceof C4211xa) {
            c4211xa = (C4211xa) continuation;
            int i2 = c4211xa.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4211xa.b = i2 - Integer.MIN_VALUE;
                Object obj = c4211xa.f7474a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4211xa.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    f7534a.set(false);
                    c4211xa.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        AbstractC4045ra.b(null);
                        AbstractC4045ra.a(null);
                        AbstractC4045ra.d = false;
                        AbstractC4045ra.c = false;
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Wm wm = Wm.f6937a;
                c4211xa.b = 2;
                a2 = AbstractC3727g4.a(Wm.b, new Vm(null), c4211xa);
                if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = Unit.INSTANCE;
                }
            }
        }
        c4211xa = new C4211xa(continuation);
        Object obj2 = c4211xa.f7474a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4211xa.b;
        if (i != 0) {
        }
        Wm wm2 = Wm.f6937a;
        c4211xa.b = 2;
        a2 = AbstractC3727g4.a(Wm.b, new Vm(null), c4211xa);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    @JvmStatic
    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (AbstractC3914mk.c()) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4073sa(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(6:(1:(1:11)(2:22|23))(1:24)|12|13|14|15|16)(1:25))(3:42|(1:44)|(2:46|47)(2:48|(2:50|51)(3:52|(1:54)(4:60|(1:62)|63|(1:65)(1:66))|(2:56|57)(1:58))))|26|27|(1:29)|(6:31|(3:33|34|35)|37|14|15|16)(1:38)|19|20|21))|67|6|(0)(0)|26|27|(0)|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if (a(r12, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        r11 = r13;
        r13 = r12;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if (r13.lock(null, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:27:0x0106, B:31:0x0115, B:38:0x0122), top: B:26:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122 A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #1 {all -> 0x0136, blocks: (B:27:0x0106, B:31:0x0115, B:38:0x0122), top: B:26:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fetchUnifiedIdsInternal$media_release(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation<? super Unit> continuation) {
        C4101ta c4101ta;
        int i;
        boolean booleanValue;
        Mutex mutex;
        Mutex mutex2;
        if (continuation instanceof C4101ta) {
            c4101ta = (C4101ta) continuation;
            int i2 = c4101ta.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4101ta.d = i2 - Integer.MIN_VALUE;
                Object obj = c4101ta.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4101ta.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    HashMap hashMap = new HashMap();
                    C3829jm c3829jm = C3829jm.f7187a;
                    C3829jm.b("FetchApiInvoked", hashMap, EnumC3944nm.f7271a);
                    Oi oi = Kk.f6677a;
                    J4 j4 = AbstractC4260z4.f7518a;
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    boolean enabled = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC3606bn.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
                        return Unit.INSTANCE;
                    }
                    if (AbstractC3606bn.c()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC3606bn.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
                        return Unit.INSTANCE;
                    }
                    Boolean bool = AbstractC3940ni.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC3914mk.f7252a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Db.b;
                            Db a2 = Cb.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC3940ni.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        AbstractC3606bn.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
                        return Unit.INSTANCE;
                    }
                    mutex = b;
                    c4101ta.f7390a = inMobiUnifiedIdInterface;
                    c4101ta.b = mutex;
                    c4101ta.d = 1;
                } else if (i != 1) {
                    if (i == 2) {
                        mutex2 = (Mutex) c4101ta.f7390a;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) c4101ta.f7390a;
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                } else {
                    Mutex mutex3 = c4101ta.b;
                    InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 = (InMobiUnifiedIdInterface) c4101ta.f7390a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    inMobiUnifiedIdInterface = inMobiUnifiedIdInterface2;
                }
                Wm wm = Wm.f6937a;
                if (!(Wm.b.b.get() != null)) {
                    c4101ta.f7390a = mutex;
                    c4101ta.b = null;
                    c4101ta.d = 2;
                    if (Wm.a(inMobiUnifiedIdInterface, c4101ta) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
                c4101ta.f7390a = mutex;
                c4101ta.b = null;
                c4101ta.d = 3;
                Throwable th22 = th;
                mutex2.unlock(null);
                throw th22;
            }
        }
        c4101ta = new C4101ta(continuation);
        Object obj2 = c4101ta.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4101ta.d;
        if (i != 0) {
        }
        Wm wm2 = Wm.f6937a;
        if (!(Wm.b.b.get() != null)) {
        }
        Throwable th222 = th;
        mutex2.unlock(null);
        throw th222;
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    @JvmStatic
    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        String str = "push " + inMobiUserDataModel;
        if (AbstractC3914mk.c()) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4129ua(inMobiUserDataModel, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @JvmStatic
    public static final void reset() {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (AbstractC3914mk.c()) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4184wa(null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public final AtomicBoolean isPushCalled() {
        return f7534a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fe, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (com.inmobi.media.D7.a(r9, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, Continuation continuation) {
        C4157va c4157va;
        int i;
        boolean booleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        if (continuation instanceof C4157va) {
            c4157va = (C4157va) continuation;
            int i2 = c4157va.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4157va.b = i2 - Integer.MIN_VALUE;
                Object obj = c4157va.f7433a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4157va.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    String str = "pushInternal " + inMobiUserDataModel;
                    Oi oi = Kk.f6677a;
                    J4 j4 = AbstractC4260z4.f7518a;
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    boolean enabled = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    if (AbstractC3606bn.c()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    Boolean bool = AbstractC3940ni.b;
                    boolean z = false;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Context context = AbstractC3914mk.f7252a;
                        if (context != null) {
                            ConcurrentHashMap concurrentHashMap = Db.b;
                            Db a2 = Cb.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = AbstractC3940ni.b;
                        booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    }
                    if (booleanValue) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    D7 d7 = D7.f6507a;
                    if (inMobiUserDataModel == null && D7.b == null) {
                        z = true;
                    } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = D7.b) != null) {
                        z = Intrinsics.areEqual(inMobiUserDataModel, inMobiUserDataModel2);
                    }
                    if (z && f7534a.get()) {
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return Unit.INSTANCE;
                    }
                    c4157va.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                f7534a.set(true);
                Wm wm = Wm.f6937a;
                c4157va.b = 2;
            }
        }
        c4157va = new C4157va(continuation);
        Object obj2 = c4157va.f7433a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4157va.b;
        if (i != 0) {
        }
        f7534a.set(true);
        Wm wm2 = Wm.f6937a;
        c4157va.b = 2;
    }
}
