package P1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
/* renamed from: P1.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3803j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21564d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3804k f21565e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3808o f21566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3803j(C3804k c3804k, InterfaceC3808o interfaceC3808o, kotlin.coroutines.d<? super C3803j> dVar) {
        super(2, dVar);
        this.f21565e = c3804k;
        this.f21566f = interfaceC3808o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3803j(this.f21565e, this.f21566f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Object> dVar) {
        return ((C3803j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C3796c c3796c;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21564d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        c3796c = this.f21565e.f21571e;
        this.f21564d = 1;
        Object a11 = c3796c.a(this.f21566f, this);
        return a11 == aVar ? aVar : a11;
    }
}
