package androidx.compose.ui.platform;

import Sc.InterfaceC4008j;
import c1.C5710a;
import c1.C5721l;
import c1.InterfaceC5704H;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import ze.C11115c;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f40748a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f40749b = new AtomicBoolean(false);

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        ze.w f40750d;

        /* renamed from: e, reason: collision with root package name */
        ze.j f40751e;

        /* renamed from: f, reason: collision with root package name */
        int f40752f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C11115c f40753g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C11115c c11115c, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f40753g = c11115c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f40753g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x0032, B:9:0x003a, B:10:0x004c, B:17:0x0067, B:19:0x0025, B:23:0x006a, B:26:0x006e, B:27:0x006f, B:28:0x0070, B:34:0x0020, B:12:0x004d, B:14:0x005d), top: B:2:0x0005, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x0032, B:9:0x003a, B:10:0x004c, B:17:0x0067, B:19:0x0025, B:23:0x006a, B:26:0x006e, B:27:0x006f, B:28:0x0070, B:34:0x0020, B:12:0x004d, B:14:0x005d), top: B:2:0x0005, inners: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x002f -> B:7:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            ze.w wVar;
            ze.j it;
            AtomicReference atomicReference;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40752f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    wVar = this.f40753g;
                    it = wVar.iterator();
                    this.f40750d = wVar;
                    this.f40751e = it;
                    this.f40752f = 1;
                    obj = it.b(this);
                    if (obj == aVar) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f40751e;
                    wVar = this.f40750d;
                    Sc.s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        boolean z11 = false;
                        W0.f40749b.set(false);
                        synchronized (C5721l.D()) {
                            atomicReference = C5721l.f56259j;
                            androidx.collection.M<InterfaceC5704H> D11 = ((C5710a) atomicReference.get()).D();
                            if (D11 != null && D11.c()) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            C5721l.b();
                        }
                        this.f40750d = wVar;
                        this.f40751e = it;
                        this.f40752f = 1;
                        obj = it.b(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.f71690a;
                            wVar.j(null);
                            return Unit.f71690a;
                        }
                    }
                }
            } finally {
            }
        }
    }

    static final class b extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C11115c f40754b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C11115c c11115c) {
            super(1);
            this.f40754b = c11115c;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (W0.f40749b.compareAndSet(false, true)) {
                this.f40754b.b(Unit.f71690a);
            }
            return Unit.f71690a;
        }
    }

    public static void b() {
        InterfaceC4008j interfaceC4008j;
        List list;
        if (f40748a.compareAndSet(false, true)) {
            C11115c a11 = ze.k.a(1, 6, null);
            interfaceC4008j = C5274p0.f40970l;
            C10727i.c(xe.N.a((CoroutineContext) interfaceC4008j.getValue()), null, null, new a(a11, null), 3);
            b bVar = new b(a11);
            synchronized (C5721l.D()) {
                list = C5721l.f56258i;
                C5721l.f56258i = C7714v.q0(bVar, list);
                Unit unit = Unit.f71690a;
            }
            C5721l.b();
        }
    }
}
