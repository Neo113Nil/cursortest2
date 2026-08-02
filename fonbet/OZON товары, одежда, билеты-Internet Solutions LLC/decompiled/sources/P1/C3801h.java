package P1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* renamed from: P1.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3801h extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21557d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3804k f21558e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3808o f21559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3801h(C3804k c3804k, InterfaceC3808o interfaceC3808o, kotlin.coroutines.d<? super C3801h> dVar) {
        super(1, dVar);
        this.f21558e = c3804k;
        this.f21559f = interfaceC3808o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C3801h(this.f21558e, this.f21559f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Object> dVar) {
        return ((C3801h) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21557d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        this.f21557d = 1;
        Object o11 = this.f21558e.o(this.f21559f, this);
        return o11 == aVar ? aVar : o11;
    }
}
