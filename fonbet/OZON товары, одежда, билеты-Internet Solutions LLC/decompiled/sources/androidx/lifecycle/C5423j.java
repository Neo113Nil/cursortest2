package androidx.lifecycle;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.InterfaceC10756x;
import xe.X0;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5423j<T> extends T<T> {

    /* renamed from: b, reason: collision with root package name */
    private C5411d<T> f43328b;

    public C5423j(@NotNull CoroutineContext context, @NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        InterfaceC10756x a11 = X0.a((xe.B0) context.get(xe.B0.f105374o0));
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f43328b = new C5411d<>(this, block, xe.N.a(De.s.f6650a.x().plus(context).plus(a11)), new C5419h(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5421i c5421i;
        int i11;
        C5423j<T> c5423j;
        if (cVar instanceof C5421i) {
            c5421i = (C5421i) cVar;
            int i12 = c5421i.f43324f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5421i.f43324f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5421i.f43322d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5421i.f43324f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c5423j = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    c5423j = null;
                }
                c5423j.getClass();
                return Unit.f71690a;
            }
        }
        c5421i = new C5421i(this, cVar);
        Object obj2 = c5421i.f43322d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5421i.f43324f;
        if (i11 != 0) {
        }
        c5423j.getClass();
        return Unit.f71690a;
    }

    @Override // androidx.lifecycle.T, androidx.lifecycle.P
    protected final void onActive() {
        super.onActive();
        C5411d<T> c5411d = this.f43328b;
        if (c5411d != null) {
            c5411d.g();
        }
    }

    @Override // androidx.lifecycle.T, androidx.lifecycle.P
    protected final void onInactive() {
        super.onInactive();
        C5411d<T> c5411d = this.f43328b;
        if (c5411d != null) {
            c5411d.f();
        }
    }
}
