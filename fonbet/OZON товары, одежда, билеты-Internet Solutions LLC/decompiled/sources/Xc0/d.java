package Xc0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2417s0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Bc0.a;
import De.C2862e;
import I1.w;
import Rc0.b;
import Rc0.s;
import Rc0.t;
import Sc.InterfaceC4008j;
import Xc0.a;
import Xc0.b;
import Xc0.c;
import androidx.lifecycle.C5418g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import id0.C7050a;
import java.util.List;
import java.util.Map;
import jc0.C7340c;
import kc0.T;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.OtpVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import wc0.InterfaceC10500a;
import xc0.C10702a;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import zc0.C11089d;

/* loaded from: classes3.dex */
public final class d extends s {

    /* renamed from: K, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f34291K = {w.c(d.class, "agreementsViewState", "getAgreementsViewState()Lru/ozon/id/nativeauth/otp/agreements/AgreementsViewState;", 0), w.c(d.class, "focusedViewId", "getFocusedViewId()Ljava/lang/Integer;", 0)};

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final C2417s0 f34292A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final M0<t> f34293B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final td0.m f34294C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final C2406m0 f34295D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final C0 f34296E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final B0<Rc0.b> f34297F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final C0 f34298G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final Be.n f34299H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f34300I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final T f34301J;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34302a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f34303b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5418g0 f34304c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<M, C7340c> f34305d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C11089d f34306e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sc0.a> f34307f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f34308g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f34309h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f34310i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f34311j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Xc0.i f34312k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Xc0.j f34313l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C2862e f34314m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final x0<OtpVO> f34315n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C2406m0 f34316o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final x0<CharSequence> f34317p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<CharSequence> f34318q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<Xc0.c> f34319r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Xc0.c> f34320s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f34321t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final x0<Xc0.b> f34322u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C2406m0 f34323v;

    /* renamed from: w, reason: collision with root package name */
    private xe.B0 f34324w;

    /* renamed from: x, reason: collision with root package name */
    private xe.B0 f34325x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f34326y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f34327z;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34328a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34329b;

        static {
            int[] iArr = new int[OtpDTO.CallInCell.CallInCellButton.a.values().length];
            try {
                iArr[OtpDTO.CallInCell.CallInCellButton.a.Deeplink.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpDTO.CallInCell.CallInCellButton.a.Action.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34328a = iArr;
            int[] iArr2 = new int[FastEntryActionDTO.ErrorDTO.b.values().length];
            try {
                iArr2[FastEntryActionDTO.ErrorDTO.b.VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FastEntryActionDTO.ErrorDTO.b.RESTRICTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f34329b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onCallInCellClicked$1", f = "OtpViewModel.kt", l = {336}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34330d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OtpDTO.CallInCell.CallInCellButton f34332f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OtpDTO.CallInCell.CallInCellButton callInCellButton, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f34332f = callInCellButton;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f34332f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34330d;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C10702a c10702a = (C10702a) dVar.f34303b.getValue();
                String action = this.f34332f.getAction();
                if (action == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f34330d = 1;
                obj = c10702a.f(action, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            d.B0(dVar, (FastEntryActionDTO) obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onCloseButtonClicked$1", f = "OtpViewModel.kt", l = {218}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34333d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34333d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0 c02 = d.this.f34296E;
                b.a aVar2 = b.a.f24975a;
                this.f34333d = 1;
                if (c02.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onCompleteButtonClicked$1", f = "OtpViewModel.kt", l = {211, 212}, m = "invokeSuspend")
    /* renamed from: Xc0.d$d, reason: collision with other inner class name */
    static final class C0616d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        CharSequence f34335d;

        /* renamed from: e, reason: collision with root package name */
        int f34336e;

        C0616d(kotlin.coroutines.d<? super C0616d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new C0616d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0616d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (Xc0.d.F0(r4, r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r8.emit(r5, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34336e;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                charSequence = (CharSequence) dVar.f34317p.getValue();
                dVar.M0().p();
                C0 c02 = dVar.f34296E;
                b.a aVar2 = b.a.f24975a;
                this.f34335d = charSequence;
                this.f34336e = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                charSequence = this.f34335d;
                Sc.s.b(obj);
            }
            this.f34335d = null;
            this.f34336e = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onDisclaimerButtonClicked$1", f = "OtpViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DisclaimerDTO.DisclaimerButtonDTO f34338d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f34339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DisclaimerDTO.DisclaimerButtonDTO disclaimerButtonDTO, d dVar, kotlin.coroutines.d<? super e> dVar2) {
            super(2, dVar2);
            this.f34338d = disclaimerButtonDTO;
            this.f34339e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f34338d, this.f34339e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            AtomActionDTO action = this.f34338d.getAction();
            String link = action != null ? action.getLink() : null;
            if (link == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d dVar = this.f34339e;
            d.l0(dVar).v(link);
            d.z0(dVar);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onFlashCallReceived$1", f = "OtpViewModel.kt", l = {290}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34340d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f34342f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f34342f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new f(this.f34342f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34340d;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f34340d = 1;
                obj = d.H0(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            Integer num = (Integer) obj;
            if (num == null) {
                dVar.M0().v(new Throwable("otpLength is null"));
                return Unit.f71690a;
            }
            dVar.b1(kotlin.text.h.r0(num.intValue(), this.f34342f));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onGetNewCodeClicked$1", f = "OtpViewModel.kt", l = {241}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34343d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34343d;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                dVar.M0().p();
                d.z0(dVar);
                OtpVO R02 = dVar.R0();
                OtpDTO.RetryButton retryButton = R02 != null ? R02.getRetryButton() : null;
                String action = retryButton != null ? retryButton.getAction() : null;
                Map<String, Object> data = retryButton != null ? retryButton.getData() : null;
                String deeplink = retryButton != null ? retryButton.getDeeplink() : null;
                if (deeplink != null && deeplink.length() != 0) {
                    d.l0(dVar).v(deeplink);
                    return Unit.f71690a;
                }
                InterfaceC10500a interfaceC10500a = (InterfaceC10500a) dVar.f34303b.getValue();
                this.f34343d = 1;
                if (action == null) {
                    throw new IllegalArgumentException("`action` parameter should be not null");
                }
                obj = interfaceC10500a.a(action, data, false, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            d.B0(dVar, (FastEntryActionDTO) obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onHintButtonClicked$1", f = "OtpViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ OtpDTO.HintButton f34346e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(OtpDTO.HintButton hintButton, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f34346e = hintButton;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new h(this.f34346e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            d dVar = d.this;
            d.z0(dVar);
            OtpDTO.HintButton hintButton = this.f34346e;
            String trackClick = hintButton.getTrackClick();
            if (trackClick != null) {
                d.u0(dVar).b(trackClick);
            }
            d.l0(dVar).v(hintButton.getDeeplink());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onOtpCodeChange$1", f = "OtpViewModel.kt", l = {304, 313, 316}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34347d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CharSequence f34349f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ OtpVO f34350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(CharSequence charSequence, OtpVO otpVO, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f34349f = charSequence;
            this.f34350g = otpVO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new i(this.f34349f, this.f34350g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        
            if (Xc0.d.F0(r5, r1, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34347d;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                x0 x0Var = dVar.f34319r;
                c.b bVar = c.b.f34290a;
                this.f34347d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            x0 x0Var2 = dVar.f34317p;
            CharSequence charSequence = this.f34349f;
            d.G0(dVar, x0Var2, charSequence);
            OtpVO otpVO = this.f34350g;
            if (otpVO.getOtpLength() != null && charSequence.length() >= otpVO.getOtpLength().intValue()) {
                d.z0(dVar);
                OtpDTO.AgreementSheet agreementSheet = otpVO.getAgreementSheet();
                if (agreementSheet != null) {
                    a.b bVar2 = new a.b(agreementSheet);
                    C0 c02 = dVar.f34298G;
                    this.f34347d = 2;
                } else {
                    dVar.M0().p();
                    this.f34347d = 3;
                }
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onSmsRetrieved$1", f = "OtpViewModel.kt", l = {270}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34351d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f34353f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f34353f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new j(this.f34353f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String value;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34351d;
            d dVar = d.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f34351d = 1;
                obj = d.H0(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            Regex regex = new Regex("\\d{" + ((Integer) obj) + "}");
            StringBuilder sb2 = new StringBuilder();
            String str = this.f34353f;
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = str.charAt(i12);
                if (Character.isLetterOrDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            MatchResult b11 = regex.b(0, sb3);
            if (b11 == null || (value = b11.getValue()) == null) {
                return Unit.f71690a;
            }
            dVar.b1(value);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$onUrlLinkClicked$1", f = "OtpViewModel.kt", l = {199}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34354d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new k(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34354d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0 c02 = d.this.f34296E;
                b.a aVar2 = b.a.f24975a;
                this.f34354d = 1;
                if (c02.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public d(@NotNull String screenId, @NotNull InterfaceC4008j authRepository, @NotNull InterfaceC4008j authRouter, @NotNull InterfaceC4008j mainScreenContainer, @NotNull C5418g0 savedStateHandle, @NotNull InterfaceC4008j trackingRepository, @NotNull Function1 provideFastEntryActionHandler, @NotNull C11089d otpMapper, @NotNull InterfaceC4008j otpDataRequestDataSource, @NotNull a.n fullscreenExceptionHandler) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(provideFastEntryActionHandler, "provideFastEntryActionHandler");
        Intrinsics.checkNotNullParameter(otpMapper, "otpMapper");
        Intrinsics.checkNotNullParameter(otpDataRequestDataSource, "otpDataRequestDataSource");
        Intrinsics.checkNotNullParameter(fullscreenExceptionHandler, "fullscreenExceptionHandler");
        this.f34302a = screenId;
        this.f34303b = authRepository;
        this.f34304c = savedStateHandle;
        this.f34305d = provideFastEntryActionHandler;
        this.f34306e = otpMapper;
        this.f34307f = otpDataRequestDataSource;
        this.f34308g = trackingRepository;
        this.f34309h = authRouter;
        this.f34310i = mainScreenContainer;
        InterfaceC4008j b11 = Sc.k.b(new Xc0.f(this));
        this.f34311j = b11;
        J.a aVar = J.f105405n0;
        this.f34312k = new Xc0.i(aVar, this);
        this.f34313l = new Xc0.j(aVar, this);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e g10 = N.g(N.g(a11, He.b.f10879b), fullscreenExceptionHandler);
        this.f34314m = g10;
        x0<OtpVO> a12 = O0.a(null);
        this.f34315n = a12;
        C2406m0 c2406m0 = new C2406m0(a12);
        this.f34316o = c2406m0;
        x0<CharSequence> a13 = O0.a("");
        this.f34317p = a13;
        this.f34318q = C2399j.b(a13);
        x0<Xc0.c> a14 = O0.a(c.b.f34290a);
        this.f34319r = a14;
        this.f34320s = C2399j.b(a14);
        x0<Xc0.b> a15 = O0.a(b.C0615b.f34286a);
        this.f34322u = a15;
        this.f34323v = new C2406m0(a15);
        x0<Boolean> a16 = O0.a(Boolean.FALSE);
        this.f34326y = a16;
        this.f34327z = C2399j.b(a16);
        this.f34292A = new C2417s0(a13, c2406m0, new Xc0.e(3, null));
        M0<t> d11 = savedStateHandle.d("agreements_view_state");
        this.f34293B = d11;
        this.f34294C = td0.n.a(savedStateHandle, "agreements_view_state");
        this.f34295D = new C2406m0(d11);
        C0 b12 = E0.b(0, 0, null, 7);
        this.f34296E = b12;
        this.f34297F = C2399j.a(b12);
        C0 b13 = E0.b(0, 0, null, 7);
        this.f34298G = b13;
        this.f34299H = C2399j.F(b13, new Xc0.k(((C7340c) b11.getValue()).g()));
        Xc0.h hVar = new Xc0.h(this);
        this.f34300I = hVar;
        td0.n.a(savedStateHandle, "focused_view_id");
        this.f34301J = new T(androidx.lifecycle.x0.a(this), new l(c2406m0), trackingRepository);
        OtpVO otpVO = (OtpVO) savedStateHandle.c("view_state_saved_state_key");
        CharSequence charSequence = (CharSequence) savedStateHandle.c("otp_code_saved_state_key");
        t I02 = I0();
        ((Nc0.f) mainScreenContainer.getValue()).b(hVar);
        if (otpVO == null) {
            td0.f.b(g10, null, new Xc0.g(this, null));
        } else {
            c1(otpVO, charSequence, I02);
        }
    }

    public static final void A0(d dVar) {
        dVar.getClass();
        td0.f.b(dVar.f34314m, null, new Xc0.g(dVar, null));
    }

    public static final void B0(d dVar, FastEntryActionDTO fastEntryActionDTO) {
        dVar.getClass();
        if (fastEntryActionDTO.getError() == null) {
            dVar.f34321t = true;
            ((C7340c) dVar.f34311j.getValue()).h(fastEntryActionDTO);
        } else {
            dVar.M0().y(fastEntryActionDTO.getError().getMessage());
            dVar.f1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2 != r3.intValue()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void C0(d dVar, OtpVO otpVO) {
        String str;
        dVar.getClass();
        OtpDTO.Input input = otpVO.getInput();
        if (input != null && (str = input.getValue()) != null) {
            int length = str.length();
            Integer otpLength = otpVO.getOtpLength();
            if (otpLength != null) {
            }
        }
        str = null;
        OtpDTO.AgreementSheet agreementSheet = otpVO.getAgreementSheet();
        t b11 = agreementSheet != null ? Vc0.a.b(agreementSheet) : null;
        C5418g0 c5418g0 = dVar.f34304c;
        c5418g0.g(otpVO, "view_state_saved_state_key");
        c5418g0.e("otp_timer_start_saved_state_key");
        c5418g0.e("call_in_timer_start_saved_state_key");
        dVar.c1(otpVO, str, b11);
    }

    public static final void D0(d dVar) {
        dVar.f34315n.tryEmit(null);
        dVar.f34317p.tryEmit("");
        dVar.f34319r.tryEmit(c.b.f34290a);
        dVar.f34321t = false;
        dVar.f34294C.setValue(dVar, f34291K[0], null);
        dVar.f34322u.tryEmit(b.C0615b.f34286a);
        xe.B0 b02 = dVar.f34324w;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        dVar.f34324w = null;
        dVar.f34326y.tryEmit(Boolean.FALSE);
    }

    public static final void E0(d dVar) {
        dVar.M0().y(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F0(d dVar, CharSequence charSequence, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        Boolean c11;
        Boolean a11;
        String name;
        FastEntryActionDTO.ErrorDTO error;
        String message;
        FastEntryActionDTO.ErrorDTO.FieldDTO fieldDTO;
        dVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f34385g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f34385g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f34383e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f34385g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    OtpVO R02 = dVar.R0();
                    if (R02 == null) {
                        return Unit.f71690a;
                    }
                    Tc.d builder = new Tc.d();
                    Map<String, Object> data = R02.getData();
                    if (data != null) {
                        builder.putAll(data);
                    }
                    OtpDTO.Input input = R02.getInput();
                    if (input != null && (name = input.getName()) != null) {
                        builder.put(name, charSequence.toString());
                    }
                    t I02 = dVar.I0();
                    if (I02 != null && (a11 = I02.a()) != null) {
                        builder.put("isAdsAllowed", a11);
                    }
                    t I03 = dVar.I0();
                    if (I03 != null && (c11 = I03.c()) != null) {
                        builder.put("isTermsConfirmed", c11);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Tc.d u11 = builder.u();
                    if (R02.getAction() == null) {
                        dVar.M0().v(new Throwable("otp action is null"));
                        return Unit.f71690a;
                    }
                    dVar.f34307f.getValue().c(u11);
                    C10702a value = dVar.f34303b.getValue();
                    String action = R02.getAction();
                    nVar.f34382d = dVar;
                    nVar.f34385g = 1;
                    obj = InterfaceC10500a.C2252a.a(value, action, u11, nVar, 4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = nVar.f34382d;
                    Sc.s.b(obj);
                }
                FastEntryActionDTO fastEntryActionDTO = (FastEntryActionDTO) obj;
                dVar.getClass();
                error = fastEntryActionDTO.getError();
                if (error == null) {
                    int i13 = a.f34329b[error.getType().ordinal()];
                    if (i13 == 1) {
                        List<FastEntryActionDTO.ErrorDTO.FieldDTO> fields = error.getFields();
                        if (fields == null || (fieldDTO = (FastEntryActionDTO.ErrorDTO.FieldDTO) C7714v.M(fields)) == null || (message = fieldDTO.getMessage()) == null) {
                            message = error.getMessage();
                        }
                        dVar.f34319r.setValue(new c.a(message));
                    } else {
                        if (i13 != 2) {
                            throw new Sc.o();
                        }
                        dVar.M0().y(error.getMessage());
                    }
                    dVar.M0().hideLoader();
                    dVar.f1();
                } else {
                    dVar.f34321t = true;
                    ((C7340c) dVar.f34311j.getValue()).h(fastEntryActionDTO);
                }
                return Unit.f71690a;
            }
        }
        nVar = new n(dVar, cVar);
        Object obj2 = nVar.f34383e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f34385g;
        if (i11 != 0) {
        }
        FastEntryActionDTO fastEntryActionDTO2 = (FastEntryActionDTO) obj2;
        dVar.getClass();
        error = fastEntryActionDTO2.getError();
        if (error == null) {
        }
        return Unit.f71690a;
    }

    public static final void G0(d dVar, x0 x0Var, Object obj) {
        dVar.getClass();
        x0Var.tryEmit(obj);
        dVar.f34304c.g(obj, "otp_code_saved_state_key");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H0(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        OtpVO otpVO;
        dVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f34396f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f34396f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f34394d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f34396f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    rVar.f34396f = 1;
                    obj = C2399j.w(dVar.f34316o, rVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                otpVO = (OtpVO) obj;
                if (otpVO == null) {
                    return otpVO.getOtpLength();
                }
                return null;
            }
        }
        rVar = new r(dVar, cVar);
        Object obj2 = rVar.f34394d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f34396f;
        if (i11 != 0) {
        }
        otpVO = (OtpVO) obj2;
        if (otpVO == null) {
        }
    }

    private final t I0() {
        return (t) this.f34294C.getValue(this, f34291K[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Nc0.f M0() {
        return (Nc0.f) this.f34310i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OtpVO R0() {
        return this.f34315n.getValue();
    }

    private final void c1(OtpVO otpVO, CharSequence charSequence, t tVar) {
        String action;
        if (otpVO.getPageType() == OtpDTO.b.Default && ((action = otpVO.getAction()) == null || action.length() == 0)) {
            M0().v(new Throwable("otpLength is null"));
            return;
        }
        this.f34315n.tryEmit(otpVO);
        xe.B0 b02 = this.f34324w;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f34324w = null;
        OtpDTO.RetryButton retryButton = otpVO.getRetryButton();
        String subtitle = retryButton != null ? retryButton.getSubtitle() : null;
        Integer timerDuration = retryButton != null ? retryButton.getTimerDuration() : null;
        x0<Xc0.b> x0Var = this.f34322u;
        Xc0.i iVar = this.f34312k;
        C2862e c2862e = this.f34314m;
        if (subtitle == null) {
            x0Var.tryEmit(b.C0615b.f34286a);
        } else if (timerDuration == null) {
            x0Var.tryEmit(null);
        } else {
            this.f34324w = td0.f.b(N.g(c2862e, iVar), null, new m(this, "otp_timer_start_saved_state_key", timerDuration.intValue(), new q(this, subtitle, null), new p(this, null), null));
        }
        xe.B0 b03 = this.f34325x;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f34325x = null;
        OtpDTO.CallInCell callInCell = otpVO.getCallInCell();
        OtpDTO.CallInCell.CallInCellTimer timer = callInCell != null ? callInCell.getTimer() : null;
        if (timer != null && timer.getSeconds() > 0) {
            this.f34325x = td0.f.b(N.g(c2862e, iVar), null, new m(this, "call_in_timer_start_saved_state_key", timer.getSeconds(), null, new o(this, timer, null), null));
        }
        if (charSequence != null) {
            b1(charSequence);
        }
        if (tVar != null) {
            this.f34294C.setValue(this, f34291K[0], tVar);
        }
        M0().j();
        f1();
    }

    private final void f1() {
        OtpVO R02 = R0();
        boolean z11 = false;
        if (R02 != null && R02.getInput() != null && !this.f34321t && R02.getOtpLength() != null && this.f34317p.getValue().length() < R02.getOtpLength().intValue()) {
            z11 = true;
        }
        this.f34326y.tryEmit(Boolean.valueOf(z11));
    }

    public static final Pc0.c l0(d dVar) {
        return (Pc0.c) dVar.f34309h.getValue();
    }

    public static final C7050a u0(d dVar) {
        return (C7050a) dVar.f34308g.getValue();
    }

    public static final void z0(d dVar) {
        dVar.f34326y.tryEmit(Boolean.FALSE);
    }

    @NotNull
    public final C2417s0 J0() {
        return this.f34292A;
    }

    @NotNull
    public final Be.n K0() {
        return this.f34299H;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> L0() {
        return this.f34327z;
    }

    @NotNull
    public final InterfaceC2395h<CharSequence> N0() {
        return this.f34318q;
    }

    @NotNull
    public final C2406m0 O0() {
        return this.f34323v;
    }

    @NotNull
    public final InterfaceC2395h<Xc0.c> P0() {
        return this.f34320s;
    }

    @NotNull
    public final C2406m0 Q0() {
        return this.f34316o;
    }

    public final void S0(@NotNull String analyticTag, @NotNull FastEntryActionDTO authActionDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        ((C7340c) this.f34311j.getValue()).l(analyticTag, authActionDTO, z11);
    }

    public final void T0() {
        OtpDTO.CallInCell callInCell;
        OtpDTO.CallInCell.CallInCellButton button;
        OtpVO R02 = R0();
        if (R02 == null || (callInCell = R02.getCallInCell()) == null || (button = callInCell.getButton()) == null) {
            M0().y(null);
            return;
        }
        int i11 = a.f34328a[button.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new Sc.o();
            }
            C10727i.c(this.f34314m, null, null, new b(button, null), 3);
        } else {
            Pc0.c cVar = (Pc0.c) this.f34309h.getValue();
            String deeplink = button.getDeeplink();
            if (deeplink == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cVar.v(deeplink);
        }
    }

    public final void U0() {
        b1(this.f34317p.getValue());
    }

    public final void V0(@NotNull DisclaimerDTO.DisclaimerButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new e(button, this, null));
    }

    public final void W0(@NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new f(phoneNumber, null));
    }

    public final void X0() {
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new g(null));
    }

    public final void Y0(@NotNull OtpDTO.HintButton hintButton) {
        Intrinsics.checkNotNullParameter(hintButton, "hintButton");
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new h(hintButton, null));
    }

    public final void Z0(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f34301J.a(action);
    }

    public final void a1(@NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        ((C7340c) this.f34311j.getValue()).m(data, action);
    }

    public final void b1(@NotNull CharSequence newOtpCode) {
        Intrinsics.checkNotNullParameter(newOtpCode, "newOtpCode");
        OtpVO R02 = R0();
        if (this.f34321t) {
            return;
        }
        if ((R02 != null ? R02.getInput() : null) == null) {
            return;
        }
        td0.f.b(N.g(this.f34314m, this.f34313l), null, new i(newOtpCode, R02, null));
    }

    @Override // Rc0.s
    public final InterfaceC2395h d0() {
        return this.f34297F;
    }

    public final void d1(@NotNull String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new j(sms, null));
    }

    @Override // Rc0.s
    @NotNull
    public final C2406m0 e0() {
        return this.f34295D;
    }

    public final void e1() {
        f1();
    }

    @Override // Rc0.s
    public final void f0(boolean z11) {
        OtpVO R02;
        OtpDTO.AgreementSheet agreementSheet;
        t I02 = I0();
        if (I02 == null || (R02 = R0()) == null || (agreementSheet = R02.getAgreementSheet()) == null) {
            return;
        }
        this.f34294C.setValue(this, f34291K[0], Vc0.a.a(agreementSheet, I02.c(), Boolean.valueOf(z11)));
    }

    @Override // Rc0.s
    public final void g0() {
        td0.f.b(N.g(this.f34314m, this.f34312k), null, new c(null));
    }

    @Override // Rc0.s
    public final void h0() {
        t I02 = I0();
        if (I02 != null && I02.b()) {
            td0.f.b(N.g(this.f34314m, this.f34313l), null, new C0616d(null));
        }
    }

    @Override // Rc0.s
    public final void i0(boolean z11) {
        OtpVO R02;
        OtpDTO.AgreementSheet agreementSheet;
        t I02 = I0();
        if (I02 == null || (R02 = R0()) == null || (agreementSheet = R02.getAgreementSheet()) == null) {
            return;
        }
        this.f34294C.setValue(this, f34291K[0], Vc0.a.a(agreementSheet, Boolean.valueOf(z11), I02.a()));
    }

    @Override // Rc0.s
    public final void j0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        td0.f.b(this.f34314m, null, new k(null));
        ((Pc0.c) this.f34309h.getValue()).v(url);
        this.f34326y.tryEmit(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        xe.B0 b02 = this.f34324w;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f34324w = null;
        xe.B0 b03 = this.f34325x;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f34325x = null;
        M0().d(this.f34300I);
        super.onCleared();
    }
}
