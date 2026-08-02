package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;
import xe.N;
import xe.O;
import ze.EnumC11113a;

/* renamed from: Be.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2635g<T> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f3579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3580b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final EnumC11113a f3581c;

    public AbstractC2635g(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        this.f3579a = coroutineContext;
        this.f3580b = i11;
        this.f3581c = enumC11113a;
    }

    @Override // Be.w
    @NotNull
    public final InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        CoroutineContext coroutineContext2 = this.f3579a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        EnumC11113a enumC11113a2 = EnumC11113a.SUSPEND;
        EnumC11113a enumC11113a3 = this.f3581c;
        int i12 = this.f3580b;
        if (enumC11113a == enumC11113a2) {
            if (i12 != -3) {
                if (i11 != -3) {
                    if (i12 != -2) {
                        if (i11 != -2) {
                            i11 += i12;
                            if (i11 < 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            enumC11113a = enumC11113a3;
        }
        return (Intrinsics.d(plus, coroutineContext2) && i11 == i12 && enumC11113a == enumC11113a3) ? this : e(plus, i11, enumC11113a);
    }

    protected String c() {
        return null;
    }

    @Override // Ae.InterfaceC2395h
    public Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = N.d(new C2633e(interfaceC2397i, this, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    protected abstract Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    protected abstract AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a);

    public InterfaceC2395h<T> f() {
        return null;
    }

    @NotNull
    public ze.w<T> g(@NotNull M m11) {
        int i11 = this.f3580b;
        if (i11 == -3) {
            i11 = -2;
        }
        O o11 = O.ATOMIC;
        C2634f c2634f = new C2634f(this, null);
        return ze.s.c(m11, this.f3579a, i11, this.f3581c, o11, c2634f);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c11 = c();
        if (c11 != null) {
            arrayList.add(c11);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        CoroutineContext coroutineContext = this.f3579a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i11 = this.f3580b;
        if (i11 != -3) {
            arrayList.add("capacity=" + i11);
        }
        EnumC11113a enumC11113a = EnumC11113a.SUSPEND;
        EnumC11113a enumC11113a2 = this.f3581c;
        if (enumC11113a2 != enumC11113a) {
            arrayList.add("onBufferOverflow=" + enumC11113a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return B3.D.c(sb2, C7714v.V(arrayList, ", ", null, null, null, 62), ']');
    }
}
