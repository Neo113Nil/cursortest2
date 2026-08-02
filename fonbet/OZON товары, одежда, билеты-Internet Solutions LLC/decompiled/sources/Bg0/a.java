package Bg0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.o;
import Sc.s;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

/* loaded from: classes7.dex */
public final class a implements InterfaceC2395h<PikazonImagePainter.State> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f3775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PikazonImagePainter f3776b;

    /* renamed from: Bg0.a$a, reason: collision with other inner class name */
    public static final class C0099a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f3777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PikazonImagePainter f3778b;

        @e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter$load$$inlined$map$1$2", f = "PikazonImagePainter.kt", l = {223}, m = "emit")
        /* renamed from: Bg0.a$a$a, reason: collision with other inner class name */
        public static final class C0100a extends c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f3779d;

            /* renamed from: e, reason: collision with root package name */
            int f3780e;

            public C0100a(d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f3779d = obj;
                this.f3780e |= LinearLayoutManager.INVALID_OFFSET;
                return C0099a.this.emit(null, this);
            }
        }

        public C0099a(InterfaceC2397i interfaceC2397i, PikazonImagePainter pikazonImagePainter) {
            this.f3777a = interfaceC2397i;
            this.f3778b = pikazonImagePainter;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull d dVar) {
            C0100a c0100a;
            int i11;
            PikazonImagePainter.State fail;
            if (dVar instanceof C0100a) {
                c0100a = (C0100a) dVar;
                int i12 = c0100a.f3780e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0100a.f3780e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0100a.f3779d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0100a.f3780e;
                    if (i11 != 0) {
                        s.b(obj2);
                        CustomTarget.Result result = (CustomTarget.Result) obj;
                        boolean z11 = result instanceof CustomTarget.Result.Placeholder;
                        PikazonImagePainter pikazonImagePainter = this.f3778b;
                        if (z11) {
                            CustomTarget.Result.Placeholder placeholder = (CustomTarget.Result.Placeholder) result;
                            int i13 = PikazonImagePainter.a.f97653a[placeholder.getType().ordinal()];
                            if (i13 == 1) {
                                Drawable resource = placeholder.getResource();
                                fail = new PikazonImagePainter.State.Loading(resource != null ? PikazonImagePainter.f(pikazonImagePainter, resource) : null);
                            } else if (i13 == 2) {
                                Drawable resource2 = placeholder.getResource();
                                fail = new PikazonImagePainter.State.Error(resource2 != null ? PikazonImagePainter.f(pikazonImagePainter, resource2) : null);
                            } else {
                                if (i13 != 3) {
                                    throw new o();
                                }
                                Drawable resource3 = placeholder.getResource();
                                fail = new PikazonImagePainter.State.Cleared(resource3 != null ? PikazonImagePainter.f(pikazonImagePainter, resource3) : null);
                            }
                        } else if (result instanceof CustomTarget.Result.Success) {
                            Intrinsics.g(result, "null cannot be cast to non-null type ru.ozon.app.android.pikazon.request.target.CustomTarget.Result.Success<android.graphics.drawable.Drawable>");
                            CustomTarget.Result.Success success = (CustomTarget.Result.Success) result;
                            fail = new PikazonImagePainter.State.Success(PikazonImagePainter.f(pikazonImagePainter, (Drawable) success.getResource()), success);
                        } else {
                            if (!(result instanceof CustomTarget.Result.Fail)) {
                                throw new o();
                            }
                            fail = new PikazonImagePainter.State.Fail((CustomTarget.Result.Fail) result);
                        }
                        c0100a.f3780e = 1;
                        if (this.f3777a.emit(fail, c0100a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0100a = new C0100a(dVar);
            Object obj22 = c0100a.f3779d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0100a.f3780e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public a(InterfaceC2395h interfaceC2395h, PikazonImagePainter pikazonImagePainter) {
        this.f3775a = interfaceC2395h;
        this.f3776b = pikazonImagePainter;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super PikazonImagePainter.State> interfaceC2397i, @NotNull d dVar) {
        Object collect = ((AbstractC2635g) this.f3775a).collect(new C0099a(interfaceC2397i, this.f3776b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
