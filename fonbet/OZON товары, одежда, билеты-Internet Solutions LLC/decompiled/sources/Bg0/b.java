package Bg0;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import k1.C7464j;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

/* loaded from: classes7.dex */
public final class b implements InterfaceC2395h<ImageSize> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0 f3782a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f3783a;

        @e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter$resolveImageSize$$inlined$mapNotNull$1$2", f = "PikazonImagePainter.kt", l = {236}, m = "emit")
        /* renamed from: Bg0.b$a$a, reason: collision with other inner class name */
        public static final class C0101a extends c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f3784d;

            /* renamed from: e, reason: collision with root package name */
            int f3785e;

            public C0101a(d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f3784d = obj;
                this.f3785e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f3783a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull d dVar) {
            C0101a c0101a;
            int i11;
            ImageSize imageSize;
            boolean z11 = dVar instanceof C0101a;
            int i12 = LinearLayoutManager.INVALID_OFFSET;
            if (z11) {
                c0101a = (C0101a) dVar;
                int i13 = c0101a.f3785e;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0101a.f3785e = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0101a.f3784d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0101a.f3785e;
                    if (i11 != 0) {
                        s.b(obj2);
                        long i14 = ((C7464j) obj).i();
                        if (i14 == 9205357640488583168L) {
                            imageSize = new ImageSize(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
                        } else if (C7464j.f(i14) < 0.5d || C7464j.d(i14) < 0.5d) {
                            imageSize = null;
                        } else {
                            float f7 = C7464j.f(i14);
                            int c11 = (Float.isInfinite(f7) || Float.isNaN(f7)) ? Integer.MIN_VALUE : C6915b.c(C7464j.f(i14));
                            float d11 = C7464j.d(i14);
                            if (!Float.isInfinite(d11) && !Float.isNaN(d11)) {
                                i12 = C6915b.c(C7464j.d(i14));
                            }
                            imageSize = new ImageSize(c11, i12);
                        }
                        if (imageSize != null) {
                            c0101a.f3785e = 1;
                            if (this.f3783a.emit(imageSize, c0101a) == aVar) {
                                return aVar;
                            }
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
            c0101a = new C0101a(dVar);
            Object obj22 = c0101a.f3784d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0101a.f3785e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public b(C0 c02) {
        this.f3782a = c02;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ImageSize> interfaceC2397i, @NotNull d dVar) {
        Object collect = this.f3782a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
