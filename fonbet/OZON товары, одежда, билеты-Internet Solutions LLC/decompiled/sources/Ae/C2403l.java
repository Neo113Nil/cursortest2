package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ae.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2403l implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object[] f1024a;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {110}, m = "collect")
    /* renamed from: Ae.l$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1025d;

        /* renamed from: e, reason: collision with root package name */
        int f1026e;

        /* renamed from: g, reason: collision with root package name */
        C2403l f1028g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f1029h;

        /* renamed from: i, reason: collision with root package name */
        int f1030i;

        /* renamed from: j, reason: collision with root package name */
        int f1031j;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1025d = obj;
            this.f1026e |= LinearLayoutManager.INVALID_OFFSET;
            return C2403l.this.collect(null, this);
        }
    }

    public C2403l(Object[] objArr) {
        this.f1024a = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:10:0x005a). Please report as a decompilation issue!!! */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        int i12;
        InterfaceC2397i interfaceC2397i2;
        int length;
        C2403l c2403l;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i13 = aVar.f1026e;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f1026e = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f1025d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f1026e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    i12 = 0;
                    interfaceC2397i2 = interfaceC2397i;
                    length = this.f1024a.length;
                    c2403l = this;
                    if (i12 < length) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = aVar.f1031j;
                    i12 = aVar.f1030i;
                    InterfaceC2397i interfaceC2397i3 = aVar.f1029h;
                    c2403l = aVar.f1028g;
                    Sc.s.b(obj);
                    interfaceC2397i2 = interfaceC2397i3;
                    i12++;
                    if (i12 < length) {
                        Object obj2 = c2403l.f1024a[i12];
                        aVar.f1028g = c2403l;
                        aVar.f1029h = interfaceC2397i2;
                        aVar.f1030i = i12;
                        aVar.f1031j = length;
                        aVar.f1026e = 1;
                        if (interfaceC2397i2.emit(obj2, aVar) == aVar2) {
                            return aVar2;
                        }
                        i12++;
                        if (i12 < length) {
                            return Unit.f71690a;
                        }
                    }
                }
            }
        }
        aVar = new a(dVar);
        Object obj3 = aVar.f1025d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1026e;
        if (i11 != 0) {
        }
    }
}
