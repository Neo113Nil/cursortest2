package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import com.inmobi.media.core.config.models.AdConfig;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* renamed from: com.inmobi.media.ih, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3796ih {

    /* renamed from: a, reason: collision with root package name */
    public final Gh f7163a;
    public final InterfaceC3571ah b;
    public final C3852kg c;
    public volatile EnumC3599bh d;

    public AbstractC3796ih(Gh dao, InterfaceC3571ah interfaceC3571ah, C3852kg networkHandler) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f7163a = dao;
        this.b = interfaceC3571ah;
        this.c = networkHandler;
        this.d = EnumC3599bh.f7030a;
    }

    public static C3628ch a(Vg vg, Of of) {
        String str = "Ping executed: " + vg.f6913a + ", Status Code: " + of.c() + ", Error: " + of.e() + ", Retry Count: " + vg.g;
        return new C3628ch(vg, of.c(), of.e());
    }

    public abstract Object b(ContinuationImpl continuationImpl);

    public final boolean b() {
        return this.d == EnumC3599bh.b;
    }

    public abstract Object c(ContinuationImpl continuationImpl);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Vg vg, ContinuationImpl continuationImpl) {
        C3683eh c3683eh;
        int i;
        if (continuationImpl instanceof C3683eh) {
            c3683eh = (C3683eh) continuationImpl;
            int i2 = c3683eh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3683eh.d = i2 - Integer.MIN_VALUE;
                Object obj = c3683eh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3683eh.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!b()) {
                        A6[] a6Arr = A6.f6449a;
                        return new C3628ch(vg, -100, "Ping V2 is disabled from SDK config");
                    }
                    C3852kg c3852kg = this.c;
                    c3683eh.f7087a = vg;
                    c3683eh.d = 1;
                    obj = c3852kg.a(vg, c3683eh);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vg = c3683eh.f7087a;
                    ResultKt.throwOnFailure(obj);
                }
                return a(vg, (Of) obj);
            }
        }
        c3683eh = new C3683eh(this, continuationImpl);
        Object obj2 = c3683eh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3683eh.d;
        if (i != 0) {
        }
        return a(vg, (Of) obj2);
    }

    public static AdConfig.PingsV2Config a() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (kotlin.Unit.INSTANCE != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r1 != r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CoroutineScope coroutineScope, int i, Function1 function1, ContinuationImpl continuationImpl) {
        C3712fh c3712fh;
        int i2;
        Semaphore Semaphore$default;
        ArrayDeque arrayDeque;
        CoroutineScope coroutineScope2;
        C3712fh c3712fh2;
        Function1 function12;
        CoroutineScope coroutineScope3;
        Function1 function13;
        Semaphore semaphore;
        ArrayDeque arrayDeque2;
        Vg vg;
        Object a2;
        Semaphore semaphore2;
        ArrayDeque arrayDeque3;
        Vg vg2;
        if (continuationImpl instanceof C3712fh) {
            c3712fh = (C3712fh) continuationImpl;
            int i3 = c3712fh.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3712fh.h = i3 - Integer.MIN_VALUE;
                Object obj = c3712fh.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3712fh.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Semaphore$default = SemaphoreKt.Semaphore$default(i, 0, 2, null);
                    arrayDeque = new ArrayDeque();
                    coroutineScope2 = coroutineScope;
                    c3712fh2 = c3712fh;
                    function12 = function1;
                    if (!b()) {
                    }
                } else if (i2 == 1) {
                    arrayDeque3 = c3712fh.d;
                    semaphore2 = c3712fh.c;
                    Function1 function14 = c3712fh.b;
                    CoroutineScope coroutineScope4 = c3712fh.f7107a;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope3 = coroutineScope4;
                    function13 = function14;
                    vg2 = (Vg) obj;
                    if (vg2 != null) {
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vg = c3712fh.e;
                        arrayDeque2 = c3712fh.d;
                        semaphore = c3712fh.c;
                        function13 = c3712fh.b;
                        coroutineScope3 = c3712fh.f7107a;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope3;
                        ArrayDeque arrayDeque4 = arrayDeque2;
                        C3712fh c3712fh3 = c3712fh;
                        function12 = function13;
                        Semaphore semaphore3 = semaphore;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C3740gh(this, vg, semaphore3, null), 3, null);
                        c3712fh2 = c3712fh3;
                        arrayDeque = arrayDeque4;
                        Semaphore$default = semaphore3;
                        if (!b()) {
                            c3712fh2.f7107a = coroutineScope2;
                            c3712fh2.b = function12;
                            c3712fh2.c = Semaphore$default;
                            c3712fh2.d = arrayDeque;
                            c3712fh2.e = null;
                            c3712fh2.h = 1;
                            Object a3 = a(arrayDeque, function12, c3712fh2);
                            if (a3 != coroutine_suspended) {
                                coroutineScope3 = coroutineScope2;
                                obj = a3;
                                function13 = function12;
                                c3712fh = c3712fh2;
                                arrayDeque3 = arrayDeque;
                                semaphore2 = Semaphore$default;
                                vg2 = (Vg) obj;
                                if (vg2 != null) {
                                    return Unit.INSTANCE;
                                }
                                c3712fh.f7107a = coroutineScope3;
                                c3712fh.b = function13;
                                c3712fh.c = semaphore2;
                                c3712fh.d = arrayDeque3;
                                c3712fh.e = vg2;
                                c3712fh.h = 2;
                                if (semaphore2.acquire(c3712fh) != coroutine_suspended) {
                                    semaphore = semaphore2;
                                    arrayDeque2 = arrayDeque3;
                                    vg = vg2;
                                    Gh gh = this.f7163a;
                                    vg.getClass();
                                    Intrinsics.checkNotNullParameter("in_progress", "<set-?>");
                                    vg.l = "in_progress";
                                    c3712fh.f7107a = coroutineScope3;
                                    c3712fh.b = function13;
                                    c3712fh.c = semaphore;
                                    c3712fh.d = arrayDeque2;
                                    c3712fh.e = vg;
                                    c3712fh.h = 3;
                                    a2 = S9.a(gh.f6585a, "pings", Hh.a(vg), "id=?", new String[]{vg.b}, c3712fh, 16);
                                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    vg = c3712fh.e;
                    arrayDeque2 = c3712fh.d;
                    semaphore = c3712fh.c;
                    function13 = c3712fh.b;
                    coroutineScope3 = c3712fh.f7107a;
                    ResultKt.throwOnFailure(obj);
                    Gh gh2 = this.f7163a;
                    vg.getClass();
                    Intrinsics.checkNotNullParameter("in_progress", "<set-?>");
                    vg.l = "in_progress";
                    c3712fh.f7107a = coroutineScope3;
                    c3712fh.b = function13;
                    c3712fh.c = semaphore;
                    c3712fh.d = arrayDeque2;
                    c3712fh.e = vg;
                    c3712fh.h = 3;
                    a2 = S9.a(gh2.f6585a, "pings", Hh.a(vg), "id=?", new String[]{vg.b}, c3712fh, 16);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                }
            }
        }
        c3712fh = new C3712fh(this, continuationImpl);
        Object obj2 = c3712fh.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3712fh.h;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ArrayDeque arrayDeque, Function1 function1, ContinuationImpl continuationImpl) {
        C3769hh c3769hh;
        int i;
        List list;
        if (continuationImpl instanceof C3769hh) {
            c3769hh = (C3769hh) continuationImpl;
            int i2 = c3769hh.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3769hh.c = i2 - Integer.MIN_VALUE;
                Object obj = c3769hh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3769hh.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!arrayDeque.isEmpty()) {
                        return arrayDeque.removeFirst();
                    }
                    c3769hh.f7145a = arrayDeque;
                    c3769hh.c = 1;
                    obj = function1.invoke(c3769hh);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayDeque = c3769hh.f7145a;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return null;
                }
                arrayDeque.addAll(list);
                return arrayDeque.removeFirst();
            }
        }
        c3769hh = new C3769hh(continuationImpl);
        Object obj2 = c3769hh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3769hh.c;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Vg vg, ContinuationImpl continuationImpl) {
        C3656dh c3656dh;
        int i;
        try {
            if (continuationImpl instanceof C3656dh) {
                c3656dh = (C3656dh) continuationImpl;
                int i2 = c3656dh.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3656dh.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3656dh.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3656dh.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        c3656dh.f7070a = vg;
                        c3656dh.d = 1;
                        obj = b(vg, c3656dh);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vg = c3656dh.f7070a;
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C3628ch) obj;
                }
            }
            if (i != 0) {
            }
            return (C3628ch) obj;
        } catch (Throwable th) {
            String str = "Ping execution threw for " + vg.b + ": " + th.getMessage();
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(th));
            A6[] a6Arr = A6.f6449a;
            String message = th.getMessage();
            if (message == null) {
                message = "Ping exception occurred";
            }
            return new C3628ch(vg, PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, message);
        }
        c3656dh = new C3656dh(this, continuationImpl);
        Object obj2 = c3656dh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3656dh.d;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        EnumC3599bh enumC3599bh = this.d;
        boolean b = b();
        EnumC3599bh enumC3599bh2 = this.d;
        EnumC3599bh enumC3599bh3 = EnumC3599bh.f7030a;
        String str = "Received a new ping, checking state - " + enumC3599bh + ServerSentEventKt.SPACE + b + ServerSentEventKt.SPACE + (enumC3599bh2 == enumC3599bh3);
        if (!a().getEnabled()) {
            return Unit.INSTANCE;
        }
        if (this.d == enumC3599bh3) {
            this.d = EnumC3599bh.b;
            Object c = c(continuationImpl);
            return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
        }
        Object b2 = b(continuationImpl);
        return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Unit.INSTANCE;
    }
}
