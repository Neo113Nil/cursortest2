package Re0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.Projection;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.u;

/* loaded from: classes3.dex */
public final class a extends ru.ozon.mapsdk.libre.placemark.view.b<c> {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private C0499a f25040j;

    /* renamed from: Re0.a$a, reason: collision with other inner class name */
    private final class C0499a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC10542A.a f25041a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final G6.a f25042b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f25043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f25044d;

        /* renamed from: Re0.a$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0500a extends C7735q implements Function0<Unit> {
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C0499a.a((C0499a) this.receiver);
            }
        }

        /* renamed from: Re0.a$a$b */
        /* synthetic */ class b extends C7735q implements Function0<Unit> {
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C0499a.b((C0499a) this.receiver);
            }
        }

        public C0499a(@NotNull a aVar, InterfaceC10542A.a animationContent) {
            Intrinsics.checkNotNullParameter(animationContent, "animationContent");
            this.f25044d = aVar;
            this.f25041a = animationContent;
            Context context = aVar.j().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            G6.a apngDrawable = new G6.a(new Re0.b(context).c(animationContent.a()));
            apngDrawable.e();
            this.f25042b = apngDrawable;
            H6.b d11 = apngDrawable.d();
            Bitmap r11 = d11 != null ? d11.r() : null;
            this.f25043c = r11;
            InterfaceC10545a a11 = animationContent.a();
            a11.a(new C0500a(0, this, C0499a.class, "play", "play()V", 0));
            a11.b(new b(0, this, C0499a.class, "stop", "stop()V", 0));
            c j11 = aVar.j();
            Intrinsics.checkNotNullParameter(apngDrawable, "apngDrawable");
            j11.setLayoutParams(new ViewGroup.LayoutParams(C6915b.c(apngDrawable.getIntrinsicWidth() * 1.0f), C6915b.c(apngDrawable.getIntrinsicHeight() * 1.0f)));
            j11.measure(0, 0);
            if (animationContent.a().c()) {
                aVar.j().setImageDrawable(apngDrawable);
            } else {
                aVar.j().setImageBitmap(r11);
            }
        }

        public static final void a(C0499a c0499a) {
            G6.a aVar = c0499a.f25042b;
            if (aVar.isRunning()) {
                return;
            }
            c j11 = c0499a.f25044d.j();
            aVar.start();
            j11.setImageDrawable(aVar);
        }

        public static final void b(C0499a c0499a) {
            H6.b d11 = c0499a.f25042b.d();
            if (d11 != null) {
                d11.K();
            }
            c0499a.f25044d.j().setImageBitmap(c0499a.f25043c);
        }

        @NotNull
        public final InterfaceC10542A.a c() {
            return this.f25041a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull u placemark, @NotNull Projection projection, @NotNull InterfaceC10542A.a animatedContent, @NotNull Function1<? super u, Unit> placemarkClickListener) {
        super(new c(context), placemark, projection, placemarkClickListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(animatedContent, "animatedContent");
        Intrinsics.checkNotNullParameter(placemarkClickListener, "placemarkClickListener");
        this.f25040j = new C0499a(this, animatedContent);
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.b
    protected final void r() {
        super.r();
        InterfaceC10542A d11 = i().d().d();
        InterfaceC10542A.a aVar = d11 instanceof InterfaceC10542A.a ? (InterfaceC10542A.a) d11 : null;
        if (aVar == null || aVar.equals(this.f25040j.c())) {
            return;
        }
        this.f25040j = new C0499a(this, aVar);
    }
}
