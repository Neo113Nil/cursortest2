package okio.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import okio.AbstractC1197l;
import okio.C;

@JvmName(name = "-FileSystem")
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n58#2,4:156\n58#2,22:160\n66#2,10:182\n62#2,3:192\n77#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
/* loaded from: classes5.dex */
public final class g {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0177, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0175, code lost:
    
        if (r11.yield(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ef, code lost:
    
        if (r0 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
    
        if (r14 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0090, code lost:
    
        if (r24.yield(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(SequenceScope sequenceScope, AbstractC1197l abstractC1197l, ArrayDeque arrayDeque, C c, boolean z, boolean z2, BaseContinuationImpl baseContinuationImpl) {
        d dVar;
        int i;
        AbstractC1197l abstractC1197l2;
        ArrayDeque arrayDeque2;
        boolean z3;
        SequenceScope sequenceScope2;
        boolean z4;
        AbstractC1197l abstractC1197l3;
        List<C> listOrNull;
        C b;
        ArrayDeque arrayDeque3;
        C next;
        boolean z5;
        boolean z6;
        d dVar2;
        AbstractC1197l abstractC1197l4;
        SequenceScope sequenceScope3;
        C c2 = c;
        boolean z7 = z2;
        if (baseContinuationImpl instanceof d) {
            dVar = (d) baseContinuationImpl;
            int i2 = dVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.k = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.k;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z7) {
                        abstractC1197l2 = abstractC1197l;
                        arrayDeque2 = arrayDeque;
                        z3 = z;
                    } else {
                        dVar.a = sequenceScope;
                        abstractC1197l2 = abstractC1197l;
                        dVar.b = abstractC1197l2;
                        arrayDeque2 = arrayDeque;
                        dVar.c = arrayDeque2;
                        dVar.d = c2;
                        z3 = z;
                        dVar.f = z3;
                        dVar.i = z7;
                        dVar.k = 1;
                    }
                    boolean z8 = z3;
                    sequenceScope2 = sequenceScope;
                    z4 = z8;
                    abstractC1197l3 = abstractC1197l2;
                } else if (i == 1) {
                    boolean z9 = dVar.i;
                    boolean z10 = dVar.f;
                    C c3 = dVar.d;
                    arrayDeque2 = dVar.c;
                    abstractC1197l3 = dVar.b;
                    sequenceScope2 = dVar.a;
                    ResultKt.throwOnFailure(obj);
                    z7 = z9;
                    z4 = z10;
                    c2 = c3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    boolean z11 = dVar.i;
                    boolean z12 = dVar.f;
                    Iterator<C> it = dVar.e;
                    C c4 = dVar.d;
                    ArrayDeque arrayDeque4 = dVar.c;
                    AbstractC1197l abstractC1197l5 = dVar.b;
                    SequenceScope sequenceScope4 = dVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        boolean z13 = z11;
                        z4 = z12;
                        C c5 = c4;
                        arrayDeque2 = arrayDeque4;
                        abstractC1197l3 = abstractC1197l5;
                        sequenceScope2 = sequenceScope4;
                        while (it.hasNext()) {
                            try {
                                next = it.next();
                                dVar.a = sequenceScope2;
                                dVar.b = abstractC1197l3;
                                dVar.c = arrayDeque2;
                                dVar.d = c5;
                                dVar.e = it;
                                dVar.f = z4;
                                dVar.i = z13;
                                dVar.k = 2;
                                z5 = z4;
                                z6 = z13;
                                dVar2 = dVar;
                                arrayDeque3 = arrayDeque2;
                                abstractC1197l4 = abstractC1197l3;
                                sequenceScope3 = sequenceScope2;
                            } catch (Throwable th) {
                                th = th;
                                arrayDeque3 = arrayDeque2;
                            }
                            try {
                                if (a(sequenceScope3, abstractC1197l4, arrayDeque3, next, z5, z6, dVar2) == coroutine_suspended) {
                                    break;
                                }
                                sequenceScope2 = sequenceScope3;
                                abstractC1197l3 = abstractC1197l4;
                                arrayDeque2 = arrayDeque3;
                                z4 = z5;
                                z13 = z6;
                                dVar = dVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                arrayDeque4 = arrayDeque3;
                                arrayDeque4.removeLast();
                                throw th;
                            }
                        }
                        boolean z14 = z13;
                        arrayDeque2.removeLast();
                        c2 = c5;
                        z7 = z14;
                        if (!z7) {
                            return Unit.INSTANCE;
                        }
                        dVar.a = null;
                        dVar.b = null;
                        dVar.c = null;
                        dVar.d = null;
                        dVar.e = null;
                        dVar.k = 3;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayDeque4.removeLast();
                        throw th;
                    }
                }
                listOrNull = abstractC1197l3.listOrNull(c2);
                if (listOrNull == null) {
                    listOrNull = CollectionsKt.emptyList();
                }
                if (!listOrNull.isEmpty()) {
                    C path = c2;
                    int i3 = 0;
                    while (true) {
                        if (z4 && arrayDeque2.contains(path)) {
                            throw new IOException(com.google.gson.internal.c.a(c2, "symlink cycle at "));
                        }
                        Intrinsics.checkNotNullParameter(abstractC1197l3, "<this>");
                        Intrinsics.checkNotNullParameter(path, "path");
                        C child = abstractC1197l3.metadata(path).c;
                        if (child == null) {
                            b = null;
                        } else {
                            C c6 = path.c();
                            Intrinsics.checkNotNull(c6);
                            c6.getClass();
                            Intrinsics.checkNotNullParameter(child, "child");
                            b = h.b(c6, child, false);
                        }
                        if (b == null) {
                            break;
                        }
                        i3++;
                        path = b;
                    }
                }
                if (!z7) {
                }
            }
        }
        dVar = new d(baseContinuationImpl);
        Object obj2 = dVar.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.k;
        if (i != 0) {
        }
        listOrNull = abstractC1197l3.listOrNull(c2);
        if (listOrNull == null) {
        }
        if (!listOrNull.isEmpty()) {
        }
        if (!z7) {
        }
    }
}
