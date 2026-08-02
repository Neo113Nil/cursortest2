package Ae;

import Be.AbstractC2635g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* renamed from: Ae.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2383b<T> extends C2389e<T> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.jvm.internal.j f948e;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    /* renamed from: Ae.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        ze.u f949d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f950e;

        /* renamed from: g, reason: collision with root package name */
        int f952g;

        a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f950e = obj;
            this.f952g |= LinearLayoutManager.INVALID_OFFSET;
            return C2383b.this.d(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2383b(@NotNull Function2<? super ze.u<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(function2, coroutineContext, i11, enumC11113a);
        this.f948e = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Ae.C2389e, Be.AbstractC2635g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f952g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f952g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f950e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f952g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f949d = uVar;
                    aVar.f952g = 1;
                    if (super.d(uVar, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = aVar.f949d;
                    Sc.s.b(obj);
                }
                if (uVar.g()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.f71690a;
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = aVar.f950e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f952g;
        if (i11 != 0) {
        }
        if (uVar.g()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.C2389e, Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new C2383b(this.f948e, coroutineContext, i11, enumC11113a);
    }
}
