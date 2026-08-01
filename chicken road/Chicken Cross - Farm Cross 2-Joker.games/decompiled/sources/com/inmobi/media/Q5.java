package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q5 extends AbstractC4080sh {
    public static final /* synthetic */ int e = 0;
    public final C3682eg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Gh dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new C3682eg(dao, new O5(this), this.c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:37|38|(2:40|36))|20|(1:(1:(2:24|25)(2:26|27))(4:28|(1:30)(1:33)|31|32))(1:34)))|53|6|7|(0)(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r0.a(r4) == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
        r0 = "Error while adding ping to database: " + r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
        r0 = "Error while adding ping to database: " + r0.getMessage();
        r2 = (java.lang.ref.WeakReference) r20.b.get(r2.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        r7 = (com.inmobi.media.InterfaceC3968oh) r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r9 = r7;
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        r0 = "Unknown error";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        com.inmobi.media.AbstractC4080sh.a(0, r0, 2244, r2, java.lang.System.currentTimeMillis(), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[Catch: Error -> 0x004c, Exception -> 0x004f, TRY_LEAVE, TryCatch #2 {Error -> 0x004c, Exception -> 0x004f, blocks: (B:12:0x0039, B:19:0x0048, B:20:0x0078, B:24:0x0084, B:26:0x0087, B:27:0x008c, B:28:0x008d, B:30:0x0099, B:31:0x00a4, B:34:0x00b5, B:38:0x0056), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Vg vg, ContinuationImpl continuationImpl) {
        P5 p5;
        int i;
        int ordinal;
        Vg vg2 = vg;
        if (continuationImpl instanceof P5) {
            p5 = (P5) continuationImpl;
            int i2 = p5.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p5.d = i2 - Integer.MIN_VALUE;
                Object obj = p5.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = p5.d;
                InterfaceC3968oh interfaceC3968oh = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                    String str = "DeferredResolutionStrategy: Adding ping with ID " + vg2.b + " to the database";
                    p5.f6776a = vg2;
                    p5.d = 1;
                    obj = a(vg2, p5);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Vg vg3 = p5.f6776a;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    vg2 = p5.f6776a;
                    ResultKt.throwOnFailure(obj);
                }
                ordinal = ((EnumC3996ph) obj).ordinal();
                if (ordinal == 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return Unit.INSTANCE;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    WeakReference weakReference = (WeakReference) this.b.get(vg2.h);
                    AbstractC4080sh.a(0, "Database capacity exceeded for pings", (short) 2248, vg2, System.currentTimeMillis(), weakReference != null ? (InterfaceC3968oh) weakReference.get() : null);
                    return Unit.INSTANCE;
                }
                C3682eg c3682eg = this.d;
                p5.f6776a = vg2;
                p5.d = 2;
            }
        }
        p5 = new P5(this, continuationImpl);
        Object obj2 = p5.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = p5.d;
        InterfaceC3968oh interfaceC3968oh2 = null;
        if (i != 0) {
        }
        ordinal = ((EnumC3996ph) obj2).ordinal();
        if (ordinal == 0) {
        }
    }
}
