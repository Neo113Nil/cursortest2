package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.channels.k;

@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n562#2,2:91\n529#2,2:93\n529#2,2:95\n562#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
/* loaded from: classes5.dex */
public final class q<E> extends b<E> {
    public final a m;

    public q(int i, a aVar) {
        super(i);
        this.m = aVar;
        if (aVar != a.a) {
            if (i < 1) {
                throw new IllegalArgumentException(androidx.compose.runtime.u.a(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(b.class).getSimpleName() + " instead").toString());
        }
    }

    public final Object K(E e, boolean z) {
        l lVar;
        q<E> qVar;
        E e2;
        if (this.m == a.c) {
            Object c = super.c(e);
            if (!(c instanceof k.c) || (c instanceof k.a)) {
                return c;
            }
            k.b bVar = k.Companion;
            Unit unit = Unit.INSTANCE;
            bVar.getClass();
            return unit;
        }
        Object obj = f.d;
        l lVar2 = (l) b.f.get(this);
        while (true) {
            long andIncrement = b.b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i = f.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (lVar2.c != j3) {
                l b = b.b(this, j3, lVar2);
                if (b != null) {
                    lVar = b;
                    e2 = e;
                    qVar = this;
                } else if (w) {
                    k.b bVar2 = k.Companion;
                    Throwable t = t();
                    bVar2.getClass();
                    return new k.a(t);
                }
            } else {
                lVar = lVar2;
                qVar = this;
                e2 = e;
            }
            int k = b.k(qVar, lVar, i2, e2, j, obj, w);
            lVar2 = lVar;
            if (k == 0) {
                lVar2.a();
                k.b bVar3 = k.Companion;
                Unit unit2 = Unit.INSTANCE;
                bVar3.getClass();
                return unit2;
            }
            if (k == 1) {
                k.b bVar4 = k.Companion;
                Unit unit3 = Unit.INSTANCE;
                bVar4.getClass();
                return unit3;
            }
            if (k == 2) {
                if (w) {
                    lVar2.i();
                    k.b bVar5 = k.Companion;
                    Throwable t2 = t();
                    bVar5.getClass();
                    return new k.a(t2);
                }
                b1 b1Var = obj instanceof b1 ? (b1) obj : null;
                if (b1Var != null) {
                    b1Var.a(lVar2, i2 + i);
                }
                o((lVar2.c * j2) + i2);
                k.b bVar6 = k.Companion;
                Unit unit4 = Unit.INSTANCE;
                bVar6.getClass();
                return unit4;
            }
            if (k == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (k == 4) {
                if (j < b.c.get(this)) {
                    lVar2.a();
                }
                k.b bVar7 = k.Companion;
                Throwable t3 = t();
                bVar7.getClass();
                return new k.a(t3);
            }
            if (k == 5) {
                lVar2.a();
            }
            e = e2;
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.w
    public final Object c(E e) {
        return K(e, false);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.w
    public final Object i(E e, Continuation<? super Unit> continuation) {
        if (K(e, true) instanceof k.a) {
            throw t();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.b
    public final boolean y() {
        return this.m == a.b;
    }
}
