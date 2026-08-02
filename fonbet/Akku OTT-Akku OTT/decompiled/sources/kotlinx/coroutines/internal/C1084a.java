package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1084a {
    public static final x a = new x("CLOSED");

    public static final <S extends u<S>> Object a(S s, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.c >= j && !s.d()) {
                return s;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1085b.a;
            Object obj = atomicReferenceFieldUpdater.get(s);
            x xVar = a;
            if (obj == xVar) {
                return xVar;
            }
            S s2 = (S) ((AbstractC1085b) obj);
            if (s2 == null) {
                s2 = function2.invoke(Long.valueOf(s.c + 1), s);
                while (!atomicReferenceFieldUpdater.compareAndSet(s, null, s2)) {
                    if (atomicReferenceFieldUpdater.get(s) != null) {
                        break;
                    }
                }
                if (s.d()) {
                    s.e();
                }
            }
            s = s2;
        }
    }
}
