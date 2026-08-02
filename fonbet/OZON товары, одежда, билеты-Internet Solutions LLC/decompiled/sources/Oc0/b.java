package Oc0;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import vd0.InterfaceC10308a;

/* loaded from: classes3.dex */
public final class b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final r f20189a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain f20190b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private AbstractC7737t f20191c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private AbstractC7737t f20192d;

        /* renamed from: Oc0.b$a$a, reason: collision with other inner class name */
        static final class C0404a extends AbstractC7737t implements Function1<String, Unit> {
            C0404a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                String it = str;
                Intrinsics.checkNotNullParameter(it, "it");
                a.this.c().invoke(it);
                return Unit.f71690a;
            }
        }

        /* renamed from: Oc0.b$a$b, reason: collision with other inner class name */
        static final class C0405b extends AbstractC7737t implements Function1<InterfaceC10308a, Unit> {
            C0405b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(InterfaceC10308a interfaceC10308a) {
                InterfaceC10308a it = interfaceC10308a;
                Intrinsics.checkNotNullParameter(it, "it");
                a aVar = a.this;
                aVar.b().invoke();
                aVar.d(Oc0.c.f20204b);
                it.dismiss();
                return Unit.f71690a;
            }
        }

        static final class c extends AbstractC7737t implements Function0<Unit> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                a.this.b().invoke();
                return Unit.f71690a;
            }
        }

        static final class d extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f20196b = new d(0);

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.f71690a;
            }
        }

        static final class e extends AbstractC7737t implements Function1<String, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final e f20197b = new e(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                String it = str;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f71690a;
            }
        }

        public a(@NotNull r activity, @NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain dto) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.f20189a = activity;
            this.f20190b = dto;
            this.f20191c = e.f20197b;
            this.f20192d = d.f20196b;
        }

        @NotNull
        public final InterfaceC10308a a() {
            wd0.c cVar = new wd0.c(this.f20189a);
            FastEntryActionDTO.FastEntryDataDTO.AuthCurtain authCurtain = this.f20190b;
            cVar.r(authCurtain.getImage());
            cVar.x(TextDTO.TextAlignment.CENTER);
            cVar.w(authCurtain.getTitle());
            cVar.v(authCurtain.getSubtitle());
            cVar.t(new C0404a());
            cVar.u(authCurtain.getButton().getTitle(), new C0405b());
            cVar.s(new c());
            cVar.a();
            return cVar.z();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function0<Unit> b() {
            return this.f20192d;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function1<String, Unit> c() {
            return this.f20191c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f20192d = (AbstractC7737t) function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(@NotNull Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f20191c = (AbstractC7737t) function1;
        }
    }

    /* renamed from: Oc0.b$b, reason: collision with other inner class name */
    static final class C0406b extends AbstractC7737t implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f20198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f20199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7735q f20200d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f20201e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC10308a f20202f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0406b(ComponentCallbacksC5392m componentCallbacksC5392m, c cVar, Function1<? super String, Unit> function1, a aVar, InterfaceC10308a interfaceC10308a) {
            super(1);
            this.f20198b = componentCallbacksC5392m;
            this.f20199c = cVar;
            this.f20200d = (C7735q) function1;
            this.f20201e = aVar;
            this.f20202f = interfaceC10308a;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            Intrinsics.checkNotNullParameter(url, "url");
            this.f20198b.getLifecycle().a(this.f20199c);
            this.f20200d.invoke(url);
            this.f20201e.d(d.f20205b);
            this.f20202f.dismiss();
            return Unit.f71690a;
        }
    }

    public static final class c implements G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f20203a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<Unit> function0) {
            this.f20203a = (AbstractC7737t) function0;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // androidx.lifecycle.G
        public final void onStateChanged(J source, AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC5434v.a.ON_START && source.getLifecycle().b() == AbstractC5434v.b.STARTED) {
                this.f20203a.invoke();
                source.getLifecycle().e(this);
            }
        }
    }

    @NotNull
    public static InterfaceC10308a a(@NotNull ComponentCallbacksC5392m fragment, @NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain dto, @NotNull Function1 onUrlClicked, @NotNull Function0 onDismiss) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onUrlClicked, "onUrlClicked");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a aVar = new a(requireActivity, dto);
        InterfaceC10308a a11 = aVar.a();
        c cVar = new c(onDismiss);
        aVar.d(onDismiss);
        aVar.e(new C0406b(fragment, cVar, onUrlClicked, aVar, a11));
        return a11;
    }
}
