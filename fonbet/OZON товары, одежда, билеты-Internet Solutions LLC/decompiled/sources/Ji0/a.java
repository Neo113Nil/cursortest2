package Ji0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.p;
import Sc.s;
import fd.InterfaceC6511n;
import fj0.C6575b;
import java.util.ArrayList;
import kj0.C7688a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements InterfaceC2395h<C7688a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h[] f14806a;

    /* renamed from: Ji0.a$a, reason: collision with other inner class name */
    static final class C0281a extends AbstractC7737t implements Function0<C6575b[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h[] f14807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0281a(InterfaceC2395h[] interfaceC2395hArr) {
            super(0);
            this.f14807b = interfaceC2395hArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6575b[] invoke() {
            return new C6575b[this.f14807b.length];
        }
    }

    @e(c = "ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.loader.CommonConfigurationsLoader$load$$inlined$combine$1$3", f = "CommonConfigurationsLoader.kt", l = {238}, m = "invokeSuspend")
    public static final class b extends j implements InterfaceC6511n<InterfaceC2397i<? super C7688a>, C6575b[], kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f14808d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f14809e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object[] f14810f;

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super C7688a> interfaceC2397i, C6575b[] c6575bArr, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(3, dVar);
            bVar.f14809e = interfaceC2397i;
            bVar.f14810f = c6575bArr;
            return bVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f14808d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = this.f14809e;
                C6575b[] c6575bArr = (C6575b[]) this.f14810f;
                int length = c6575bArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        z11 = false;
                        break;
                    }
                    if (c6575bArr[i12].b()) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                ArrayList arrayList = new ArrayList(c6575bArr.length);
                for (C6575b c6575b : c6575bArr) {
                    arrayList.add(c6575b.a());
                }
                C7688a c7688a = new C7688a(arrayList, z11);
                this.f14808d = 1;
                if (interfaceC2397i.emit(c7688a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public a(InterfaceC2395h[] interfaceC2395hArr) {
        this.f14806a = interfaceC2395hArr;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super C7688a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        InterfaceC2395h[] interfaceC2395hArr = this.f14806a;
        Object a11 = p.a(interfaceC2397i, new b(3, null), dVar, new C0281a(interfaceC2395hArr), interfaceC2395hArr);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
