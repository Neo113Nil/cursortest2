package com.amplitude.core.platform;

import com.amplitude.core.utilities.y;
import java.io.FileNotFoundException;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.W;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.channels.v;

@DebugMetadata(c = "com.amplitude.core.platform.EventPipeline$upload$1", f = "EventPipeline.kt", i = {0, 1, 1, 2, 3, 3, 4}, l = {219, 118, 133, 141, 151}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv", "signal", "$this$consume$iv$iv", "$this$consume$iv$iv", "eventFile", "$this$consume$iv$iv"}, s = {"L$1", "L$1", "L$3", "L$1", "L$1", "L$4", "L$1"})
@SourceDebugExtension({"SMAP\nEventPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPipeline.kt\ncom/amplitude/core/platform/EventPipeline$upload$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,211:1\n81#2:212\n58#2,6:213\n82#2,2:219\n68#2:221\n64#2,3:222\n*S KotlinDebug\n*F\n+ 1 EventPipeline.kt\ncom/amplitude/core/platform/EventPipeline$upload$1\n*L\n117#1:212\n117#1:213,6\n117#1:219,2\n117#1:221\n117#1:222,3\n*E\n"})
/* loaded from: classes3.dex */
public final class f extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public com.amplitude.core.platform.b a;
    public v b;
    public kotlinx.coroutines.channels.i c;
    public Object d;
    public Object e;
    public int f;
    public final /* synthetic */ com.amplitude.core.platform.b i;

    @DebugMetadata(c = "com.amplitude.core.platform.EventPipeline$upload$1$1$1", f = "EventPipeline.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.amplitude.core.platform.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amplitude.core.platform.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            com.amplitude.core.platform.b bVar = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.amplitude.core.k kVar = bVar.e;
                    this.a = 1;
                    if (kVar.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            } catch (FileNotFoundException e) {
                String message = e.getMessage();
                if (message == null) {
                    return null;
                }
                bVar.a.i().d("Event storage file not found: ".concat(message));
                return Unit.INSTANCE;
            }
        }
    }

    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ com.amplitude.core.platform.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amplitude.core.platform.b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            this.a.h.c(bool.booleanValue() ? "#!upload" : "#!maxRetryAttemptReached");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amplitude.core.platform.b bVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((f) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x016f, code lost:
    
        if (r7 != r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b6, code lost:
    
        if (r0.a(r7, r18) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01c8: IGET (r7 I:com.amplitude.core.b) = (r13 I:com.amplitude.core.platform.b) A[Catch: all -> 0x002d, TRY_ENTER] (LINE:457) com.amplitude.core.platform.b.a com.amplitude.core.b, block:B:78:0x0153 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0159 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:67:0x0026, B:33:0x0093, B:36:0x00a7, B:38:0x00af, B:42:0x00d6, B:44:0x00de, B:10:0x012f, B:11:0x0146, B:13:0x0153, B:15:0x0159, B:17:0x015d, B:24:0x0172, B:27:0x017b, B:29:0x019f, B:53:0x01c0, B:61:0x01c8, B:56:0x01d5, B:58:0x01db, B:49:0x01fc, B:72:0x004f, B:8:0x005e, B:80:0x006f, B:82:0x0079, B:85:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x002d, TryCatch #4 {all -> 0x002d, blocks: (B:67:0x0026, B:33:0x0093, B:36:0x00a7, B:38:0x00af, B:42:0x00d6, B:44:0x00de, B:10:0x012f, B:11:0x0146, B:13:0x0153, B:15:0x0159, B:17:0x015d, B:24:0x0172, B:27:0x017b, B:29:0x019f, B:53:0x01c0, B:61:0x01c8, B:56:0x01d5, B:58:0x01db, B:49:0x01fc, B:72:0x004f, B:8:0x005e, B:80:0x006f, B:82:0x0079, B:85:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[Catch: all -> 0x002d, TryCatch #4 {all -> 0x002d, blocks: (B:67:0x0026, B:33:0x0093, B:36:0x00a7, B:38:0x00af, B:42:0x00d6, B:44:0x00de, B:10:0x012f, B:11:0x0146, B:13:0x0153, B:15:0x0159, B:17:0x015d, B:24:0x0172, B:27:0x017b, B:29:0x019f, B:53:0x01c0, B:61:0x01c8, B:56:0x01d5, B:58:0x01db, B:49:0x01fc, B:72:0x004f, B:8:0x005e, B:80:0x006f, B:82:0x0079, B:85:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fc A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:67:0x0026, B:33:0x0093, B:36:0x00a7, B:38:0x00af, B:42:0x00d6, B:44:0x00de, B:10:0x012f, B:11:0x0146, B:13:0x0153, B:15:0x0159, B:17:0x015d, B:24:0x0172, B:27:0x017b, B:29:0x019f, B:53:0x01c0, B:61:0x01c8, B:56:0x01d5, B:58:0x01db, B:49:0x01fc, B:72:0x004f, B:8:0x005e, B:80:0x006f, B:82:0x0079, B:85:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x002d, TryCatch #4 {all -> 0x002d, blocks: (B:67:0x0026, B:33:0x0093, B:36:0x00a7, B:38:0x00af, B:42:0x00d6, B:44:0x00de, B:10:0x012f, B:11:0x0146, B:13:0x0153, B:15:0x0159, B:17:0x015d, B:24:0x0172, B:27:0x017b, B:29:0x019f, B:53:0x01c0, B:61:0x01c8, B:56:0x01d5, B:58:0x01db, B:49:0x01fc, B:72:0x004f, B:8:0x005e, B:80:0x006f, B:82:0x0079, B:85:0x0086), top: B:2:0x000f }] */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r12v12, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r12v13, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r12v14, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r12v8, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.amplitude.core.platform.b] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.amplitude.core.platform.b] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.amplitude.core.platform.b] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.amplitude.core.platform.b] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.amplitude.core.platform.b] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x017a -> B:12:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01c0 -> B:12:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01d9 -> B:12:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01db -> B:12:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x012d -> B:10:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0144 -> B:11:0x0146). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.amplitude.core.platform.b bVar;
        kotlinx.coroutines.channels.i aVar;
        ?? r16;
        FileNotFoundException e;
        String message;
        kotlinx.coroutines.channels.b bVar2;
        com.amplitude.core.platform.b bVar3;
        kotlinx.coroutines.channels.i iVar;
        String str;
        int i;
        kotlinx.coroutines.channels.i iVar2;
        com.amplitude.core.platform.b bVar4;
        kotlinx.coroutines.channels.b bVar5;
        Object obj2;
        kotlinx.coroutines.channels.b bVar6;
        ?? r13;
        ?? r12;
        kotlinx.coroutines.channels.i iVar3;
        Iterator<Object> it;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f;
        int i3 = 2;
        int i4 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                com.amplitude.core.platform.b bVar7 = this.i;
                kotlinx.coroutines.channels.b bVar8 = bVar7.h;
                bVar8.getClass();
                bVar = bVar7;
                aVar = new b.a();
                bVar6 = bVar8;
                this.a = bVar;
                this.b = bVar6;
                this.c = aVar;
                this.d = null;
                this.e = null;
                this.f = i4;
                obj2 = aVar.b(this);
                bVar5 = bVar6;
                if (obj2 == coroutine_suspended) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            } else if (i2 == 1) {
                aVar = this.c;
                ?? r122 = this.b;
                bVar = this.a;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                bVar5 = r122;
                if (((Boolean) obj2).booleanValue()) {
                }
            } else if (i2 == 2) {
                str = (String) this.d;
                iVar = this.c;
                ?? r123 = this.b;
                bVar3 = this.a;
                ResultKt.throwOnFailure(obj);
                bVar2 = r123;
                if (Intrinsics.areEqual(str, "#!maxRetryAttemptReached")) {
                }
            } else if (i2 != 3) {
                try {
                } catch (FileNotFoundException e2) {
                    e = e2;
                    r16 = 1;
                    message = e.getMessage();
                    r12 = r12;
                    if (message != null) {
                    }
                    while (it.hasNext()) {
                    }
                    aVar = iVar3;
                    bVar = r13;
                    i4 = r16;
                    i3 = 2;
                    bVar6 = r12;
                    this.a = bVar;
                    this.b = bVar6;
                    this.c = aVar;
                    this.d = null;
                    this.e = null;
                    this.f = i4;
                    obj2 = aVar.b(this);
                    bVar5 = bVar6;
                    if (obj2 == coroutine_suspended) {
                    }
                    if (((Boolean) obj2).booleanValue()) {
                    }
                } catch (Exception e3) {
                    r16 = 1;
                    y.d(e3, r13.a.i(), "Error when uploading event");
                }
                if (i2 == 4) {
                    obj4 = this.e;
                    it = (Iterator) this.d;
                    iVar3 = this.c;
                    r12 = this.b;
                    r13 = this.a;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    r16 = 1;
                    String str2 = (String) obj3;
                    if (str2.length() == 0) {
                        r12 = r12;
                    } else {
                        if (Intrinsics.areEqual(((com.amplitude.core.utilities.http.h) r13.l.getValue()).d(r13.c.a(str2, r13.a.n.b()), obj4, str2), Boxing.boxBoolean(r16))) {
                            com.amplitude.core.utilities.o oVar = r13.d;
                            b bVar9 = new b(r13);
                            this.a = r13;
                            this.b = r12;
                            this.c = iVar3;
                            this.d = it;
                            this.e = null;
                            this.f = 5;
                        } else {
                            r13.d.d.set(0);
                            r12 = r12;
                        }
                    }
                    while (it.hasNext()) {
                    }
                    aVar = iVar3;
                    bVar = r13;
                    i4 = r16;
                    i3 = 2;
                    bVar6 = r12;
                    this.a = bVar;
                    this.b = bVar6;
                    this.c = aVar;
                    this.d = null;
                    this.e = null;
                    this.f = i4;
                    obj2 = aVar.b(this);
                    bVar5 = bVar6;
                    if (obj2 == coroutine_suspended) {
                    }
                    if (((Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar3 = this.c;
                    r12 = this.b;
                    r13 = this.a;
                    ResultKt.throwOnFailure(obj);
                    r16 = 1;
                    aVar = iVar3;
                    bVar = r13;
                    i4 = r16;
                    i3 = 2;
                    bVar6 = r12;
                    this.a = bVar;
                    this.b = bVar6;
                    this.c = aVar;
                    this.d = null;
                    this.e = null;
                    this.f = i4;
                    obj2 = aVar.b(this);
                    bVar5 = bVar6;
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        String str3 = (String) aVar.next();
                        C1101n0 c1101n0 = bVar.a.f;
                        a aVar2 = new a(bVar, null);
                        this.a = bVar;
                        this.b = bVar5;
                        this.c = aVar;
                        this.d = str3;
                        this.f = i3;
                        if (C1082i.f(aVar2, c1101n0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.amplitude.core.platform.b bVar10 = bVar;
                        iVar = aVar;
                        str = str3;
                        bVar3 = bVar10;
                        bVar2 = bVar5;
                        if (Intrinsics.areEqual(str, "#!maxRetryAttemptReached")) {
                            r16 = i4;
                            obj5 = bVar2;
                            Iterator<Object> it2 = bVar3.e.a().iterator();
                            r13 = bVar3;
                            iVar3 = iVar;
                            it = it2;
                            r12 = obj5;
                            while (it.hasNext()) {
                            }
                            aVar = iVar3;
                            bVar = r13;
                            i4 = r16;
                            i3 = 2;
                            bVar6 = r12;
                            this.a = bVar;
                            this.b = bVar6;
                            this.c = aVar;
                            this.d = null;
                            this.e = null;
                            this.f = i4;
                            obj2 = aVar.b(this);
                            bVar5 = bVar6;
                            if (obj2 == coroutine_suspended) {
                            }
                            if (((Boolean) obj2).booleanValue()) {
                            }
                        } else {
                            bVar3.a.i().c("Max retries " + bVar3.d.a + " reached, temporarily stop consuming upload signals.");
                            com.amplitude.core.utilities.o oVar2 = bVar3.d;
                            i = i4;
                            long coerceAtMost = (long) RangesKt.coerceAtMost(60000, oVar2.b * ((int) Math.pow(oVar2.c, (double) (oVar2.a + i4))));
                            this.a = bVar3;
                            this.b = bVar2;
                            this.c = iVar;
                            this.d = null;
                            this.f = 3;
                            if (W.b(coerceAtMost, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iVar2 = iVar;
                            bVar4 = bVar3;
                            obj6 = bVar2;
                            bVar4.d.d.set(0);
                            bVar4.a.i().c("Enable consuming of upload signals again.");
                            bVar3 = bVar4;
                            iVar = iVar2;
                            obj5 = obj6;
                            r16 = i;
                            Iterator<Object> it22 = bVar3.e.a().iterator();
                            r13 = bVar3;
                            iVar3 = iVar;
                            it = it22;
                            r12 = obj5;
                            while (it.hasNext()) {
                                obj4 = it.next();
                                try {
                                } catch (FileNotFoundException e4) {
                                    e = e4;
                                    r16 = r16;
                                    message = e.getMessage();
                                    r12 = r12;
                                    if (message != null) {
                                        r13.a.i().d("Event storage file not found: " + message);
                                        r12 = r12;
                                    }
                                    while (it.hasNext()) {
                                    }
                                    aVar = iVar3;
                                    bVar = r13;
                                    i4 = r16;
                                    i3 = 2;
                                    bVar6 = r12;
                                    this.a = bVar;
                                    this.b = bVar6;
                                    this.c = aVar;
                                    this.d = null;
                                    this.e = null;
                                    this.f = i4;
                                    obj2 = aVar.b(this);
                                    bVar5 = bVar6;
                                    if (obj2 == coroutine_suspended) {
                                    }
                                    if (((Boolean) obj2).booleanValue()) {
                                    }
                                } catch (Exception e5) {
                                    y.d(e5, r13.a.i(), "Error when uploading event");
                                }
                                com.amplitude.core.k kVar = r13.e;
                                this.a = r13;
                                this.b = r12;
                                this.c = iVar3;
                                this.d = it;
                                this.e = obj4;
                                this.f = 4;
                                obj3 = kVar.b(obj4, this);
                            }
                            aVar = iVar3;
                            bVar = r13;
                            i4 = r16;
                            i3 = 2;
                            bVar6 = r12;
                            this.a = bVar;
                            this.b = bVar6;
                            this.c = aVar;
                            this.d = null;
                            this.e = null;
                            this.f = i4;
                            obj2 = aVar.b(this);
                            bVar5 = bVar6;
                            if (obj2 == coroutine_suspended) {
                            }
                            if (((Boolean) obj2).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                bVar5.cancel(null);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            } else {
                iVar2 = this.c;
                Object obj7 = this.b;
                bVar4 = this.a;
                ResultKt.throwOnFailure(obj);
                i = 1;
                obj6 = obj7;
                bVar4.d.d.set(0);
                bVar4.a.i().c("Enable consuming of upload signals again.");
                bVar3 = bVar4;
                iVar = iVar2;
                obj5 = obj6;
                r16 = i;
                Iterator<Object> it222 = bVar3.e.a().iterator();
                r13 = bVar3;
                iVar3 = iVar;
                it = it222;
                r12 = obj5;
                while (it.hasNext()) {
                }
                aVar = iVar3;
                bVar = r13;
                i4 = r16;
                i3 = 2;
                bVar6 = r12;
                this.a = bVar;
                this.b = bVar6;
                this.c = aVar;
                this.d = null;
                this.e = null;
                this.f = i4;
                obj2 = aVar.b(this);
                bVar5 = bVar6;
                if (obj2 == coroutine_suspended) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            }
        } finally {
        }
    }
}
