package com.amplitude.android.storage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C1064i;
import kotlinx.coroutines.flow.InterfaceC1061f;
import kotlinx.coroutines.flow.V;

/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0030, B:14:0x0057, B:20:0x006c, B:22:0x0074, B:32:0x0048, B:35:0x0053), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC1061f interfaceC1061f, kotlinx.coroutines.channels.g gVar, boolean z, ContinuationImpl continuationImpl) {
        C1064i c1064i;
        int i;
        kotlinx.coroutines.channels.i it;
        kotlinx.coroutines.channels.g gVar2;
        kotlinx.coroutines.channels.i iVar;
        InterfaceC1061f interfaceC1061f2;
        Object b;
        try {
            if (continuationImpl instanceof C1064i) {
                c1064i = (C1064i) continuationImpl;
                int i2 = c1064i.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1064i.f = i2 - Integer.MIN_VALUE;
                    Object obj = c1064i.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c1064i.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (interfaceC1061f instanceof V) {
                            throw ((V) interfaceC1061f).a;
                        }
                        it = gVar.iterator();
                        gVar = gVar;
                        c1064i.a = interfaceC1061f;
                        c1064i.b = gVar;
                        c1064i.c = it;
                        c1064i.d = z;
                        c1064i.f = 1;
                        b = it.b(c1064i);
                        if (b != coroutine_suspended) {
                        }
                    } else if (i == 1) {
                        z = c1064i.d;
                        iVar = c1064i.c;
                        ?? r7 = c1064i.b;
                        interfaceC1061f2 = c1064i.a;
                        ResultKt.throwOnFailure(obj);
                        gVar2 = r7;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = c1064i.d;
                        iVar = c1064i.c;
                        ?? r72 = c1064i.b;
                        interfaceC1061f2 = c1064i.a;
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.g gVar3 = r72;
                        it = iVar;
                        interfaceC1061f = interfaceC1061f2;
                        gVar = gVar3;
                        c1064i.a = interfaceC1061f;
                        c1064i.b = gVar;
                        c1064i.c = it;
                        c1064i.d = z;
                        c1064i.f = 1;
                        b = it.b(c1064i);
                        if (b != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC1061f2 = interfaceC1061f;
                        iVar = it;
                        obj = b;
                        gVar2 = gVar;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                gVar2.cancel(null);
                            }
                            return Unit.INSTANCE;
                        }
                        Object next = iVar.next();
                        c1064i.a = interfaceC1061f2;
                        c1064i.b = gVar2;
                        c1064i.c = iVar;
                        c1064i.d = z;
                        c1064i.f = 2;
                        gVar3 = gVar2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        c1064i = new C1064i(continuationImpl);
        Object obj2 = c1064i.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1064i.f;
    }
}
