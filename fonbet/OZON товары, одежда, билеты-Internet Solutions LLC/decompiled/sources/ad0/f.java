package ad0;

import Ae.C2406m0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import bd0.C5654a;
import h3.C6788a;
import id0.C7050a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.a;
import ru.ozon.id.nativeauth.pageNotification.data.PageNotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import td0.n;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import zc0.C11090e;

/* loaded from: classes3.dex */
public final class f extends w0 {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f36595k = {w.c(f.class, "uiState", "getUiState()Lru/ozon/id/nativeauth/pageNotification/presentation/vo/PageNotificationVO;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f36597b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C11090e f36598c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f36599d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f36600e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final td0.m f36601f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2406m0 f36602g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2862e f36603h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f36604i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f36605j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationViewModel$load$1", f = "PageNotificationViewModel.kt", l = {60}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36606d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f36608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f36608f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(this.f36608f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36606d;
            f fVar = f.this;
            if (i11 == 0) {
                s.b(obj);
                C10702a c10702a = (C10702a) fVar.f36599d.getValue();
                this.f36606d = 1;
                obj = c10702a.s(this.f36608f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            PageNotificationDTO dto = (PageNotificationDTO) obj;
            fVar.f36598c.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            f.i0(fVar, new C5654a(OzonSpannableStringKt.toOzonSpannableString(dto.getTitle()), dto.getSubtitle(), dto.getLogoUrl(), dto.getButton()));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationViewModel$onBackClick$1", f = "PageNotificationViewModel.kt", l = {91}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EntryDTO.EntryButtonDTO f36610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f36611f;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36612a;

            static {
                int[] iArr = new int[a.EnumC2132a.values().length];
                try {
                    iArr[a.EnumC2132a.RELOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC2132a.DEEPLINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.EnumC2132a.ACTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f36612a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EntryDTO.EntryButtonDTO entryButtonDTO, f fVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f36610e = entryButtonDTO;
            this.f36611f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f36610e, this.f36611f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36609d;
            if (i11 == 0) {
                s.b(obj);
                EntryDTO.EntryButtonDTO entryButtonDTO = this.f36610e;
                String trackClick = entryButtonDTO.getTrackClick();
                f fVar = this.f36611f;
                if (trackClick != null) {
                    f.g0(fVar).b(trackClick);
                }
                int i12 = a.f36612a[entryButtonDTO.getType().ordinal()];
                if (i12 == 1) {
                    Pc0.c cVar = (Pc0.c) fVar.f36597b.getValue();
                    String deeplink = entryButtonDTO.getDeeplink();
                    if (deeplink == null) {
                        throw new IllegalStateException("Deeplink is null");
                    }
                    cVar.C(deeplink);
                    Unit unit = Unit.f71690a;
                } else if (i12 == 2) {
                    Pc0.c cVar2 = (Pc0.c) fVar.f36597b.getValue();
                    String deeplink2 = entryButtonDTO.getDeeplink();
                    if (deeplink2 == null) {
                        throw new IllegalStateException("Deeplink is null");
                    }
                    cVar2.v(deeplink2);
                    Unit unit2 = Unit.f71690a;
                } else {
                    if (i12 != 3) {
                        throw new o();
                    }
                    InterfaceC10500a interfaceC10500a = (InterfaceC10500a) fVar.f36599d.getValue();
                    String action = entryButtonDTO.getAction();
                    if (action == null) {
                        throw new IllegalStateException("Action is null");
                    }
                    this.f36609d = 1;
                    if (InterfaceC10500a.C2252a.a(interfaceC10500a, action, null, this, 14) == aVar) {
                        return aVar;
                    }
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationViewModel$onSubtitleClick$1", f = "PageNotificationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f36614e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f36614e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new c(this.f36614e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((Pc0.c) f.this.f36597b.getValue()).v(this.f36614e);
            return Unit.f71690a;
        }
    }

    public f(@NotNull String screenId, @NotNull InterfaceC4008j authRouter, @NotNull C11090e mapper, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j mainScreenContainer, @NotNull InterfaceC4008j trackingRepository, @NotNull a.n fullScreenExceptionHandler, @NotNull C5418g0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(fullScreenExceptionHandler, "fullScreenExceptionHandler");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f36596a = screenId;
        this.f36597b = authRouter;
        this.f36598c = mapper;
        this.f36599d = authRepository;
        this.f36600e = mainScreenContainer;
        this.f36601f = n.a(savedStateHandle, "account_merge_vo_saved_state_key");
        this.f36602g = new C2406m0(savedStateHandle.d("account_merge_vo_saved_state_key"));
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f36603h = N.g(N.g(a11, He.b.f10879b), fullScreenExceptionHandler);
        this.f36604i = trackingRepository;
        g gVar = new g(this);
        this.f36605j = gVar;
        ((Nc0.f) mainScreenContainer.getValue()).b(gVar);
        k0();
    }

    public static final C7050a g0(f fVar) {
        return (C7050a) fVar.f36604i.getValue();
    }

    public static final void i0(f fVar, C5654a c5654a) {
        fVar.f36601f.setValue(fVar, f36595k[0], c5654a);
        fVar.f36600e.getValue().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        InterfaceC4008j<Pc0.c> interfaceC4008j = this.f36597b;
        String b11 = interfaceC4008j.getValue().o(this.f36596a).b();
        if (b11.length() == 0) {
            interfaceC4008j.getValue().q();
        } else {
            C10727i.c(this.f36603h, null, null, new a(b11, null), 3);
        }
    }

    @NotNull
    public final C2406m0 j0() {
        return this.f36602g;
    }

    public final void l0(@NotNull EntryDTO.EntryButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        C10727i.c(this.f36603h, null, null, new b(button, this, null), 3);
    }

    public final void m0(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C10727i.c(this.f36603h, null, null, new c(link, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f36600e.getValue().d(this.f36605j);
    }
}
