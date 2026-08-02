package Rc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Aw.ViewOnClickListenerC2448a;
import Cw.ViewOnClickListenerC2787a;
import Jb0.w;
import Rc0.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import kc0.C7629C;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.component.sheet.SheetMode;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.selection.CheckboxTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9861a;
import td0.C9863c;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LRc0/c;", "Lru/ozon/uni/android/component/sheet/SheetView;", "<init>", "()V", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends SheetView {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24976c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24977a;

    /* renamed from: b, reason: collision with root package name */
    private w f24978b;

    public static final class a {
        @NotNull
        public static c a(@NotNull OtpDTO.AgreementSheet dto, @NotNull Rc0.a type) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(type, "type");
            c cVar = new c();
            cVar.setArguments(androidx.core.os.d.b(new Pair("dto", dto), new Pair("parentFragment", Integer.valueOf(type.ordinal()))));
            return cVar;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24979a;

        static {
            int[] iArr = new int[Rc0.a.values().length];
            try {
                iArr[Rc0.a.Entry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rc0.a.Otp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24979a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.agreements.AgreementsSheetView$onViewCreated$$inlined$repeatOnStarted$1", f = "AgreementsSheetView.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: Rc0.c$c, reason: collision with other inner class name */
    public static final class C0497c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ J f24981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f24982f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.agreements.AgreementsSheetView$onViewCreated$$inlined$repeatOnStarted$1$1", f = "AgreementsSheetView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Rc0.c$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f24983d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f24984e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, c cVar) {
                super(2, dVar);
                this.f24984e = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(dVar, this.f24984e);
                aVar.f24983d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                M m11 = (M) this.f24983d;
                c cVar = this.f24984e;
                C10727i.c(m11, null, null, new d(cVar.y().e0(), null, cVar), 3);
                C10727i.c(m11, null, null, new e(cVar.y().d0(), null, cVar), 3);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0497c(J j11, kotlin.coroutines.d dVar, c cVar) {
            super(2, dVar);
            this.f24981e = j11;
            this.f24982f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C0497c(this.f24981e, dVar, this.f24982f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0497c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24980d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(null, this.f24982f);
                this.f24980d = 1;
                if (C5412d0.b(this.f24981e, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.agreements.AgreementsSheetView$onViewCreated$lambda$2$$inlined$collectFlow$1", f = "AgreementsSheetView.kt", l = {80}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24985d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f24986e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f24987f;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f24988a;

            public a(c cVar) {
                this.f24988a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                t tVar = (t) t2;
                w wVar = this.f24988a.f24978b;
                if (wVar != null) {
                    CheckboxTitleSubtitleCellView termsOfUseCheckbox = wVar.f14566g;
                    Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
                    Boolean c11 = tVar.c();
                    if (c11 == null) {
                        ViewExtKt.gone(termsOfUseCheckbox);
                    } else {
                        termsOfUseCheckbox.getAddonView().setChecked(c11.booleanValue());
                        ViewExtKt.show(termsOfUseCheckbox);
                    }
                    CheckboxTitleSubtitleCellView adsCheckbox = wVar.f14561b;
                    Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
                    Boolean a11 = tVar.a();
                    if (a11 == null) {
                        ViewExtKt.gone(adsCheckbox);
                    } else {
                        adsCheckbox.getAddonView().setChecked(a11.booleanValue());
                        ViewExtKt.show(adsCheckbox);
                    }
                    ButtonView completeButton = wVar.f14564e;
                    Intrinsics.checkNotNullExpressionValue(completeButton, "completeButton");
                    C9863c.a(completeButton, tVar.b());
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, c cVar) {
            super(2, dVar);
            this.f24986e = interfaceC2395h;
            this.f24987f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f24986e, dVar, this.f24987f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24985d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f24987f);
                this.f24985d = 1;
                if (this.f24986e.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.agreements.AgreementsSheetView$onViewCreated$lambda$2$$inlined$collectFlow$2", f = "AgreementsSheetView.kt", l = {80}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24989d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f24990e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f24991f;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f24992a;

            public a(c cVar) {
                this.f24992a = cVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                int i11 = c.f24976c;
                c cVar = this.f24992a;
                if (!Intrinsics.d((Rc0.b) t2, b.a.f24975a)) {
                    throw new Sc.o();
                }
                cVar.dismissAllowingStateLoss();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, c cVar) {
            super(2, dVar);
            this.f24990e = interfaceC2395h;
            this.f24991f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f24990e, dVar, this.f24991f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24989d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f24991f);
                this.f24989d = 1;
                if (this.f24990e.collect(aVar2, this) == aVar) {
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

    static final class f extends AbstractC7737t implements Function0<s> {
        f() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final s invoke() {
            y0 b11;
            int i11 = c.f24976c;
            c cVar = c.this;
            Bundle arguments = cVar.getArguments();
            Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("parentFragment", Rc0.a.Entry.ordinal())) : null;
            if (valueOf == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int i12 = b.f24979a[((Rc0.a) Rc0.a.a().get(valueOf.intValue())).ordinal()];
            if (i12 == 1) {
                InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Rc0.f(new n(0, cVar, c.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0)));
                b11 = b0.b(cVar, N.b(C7629C.class), new g(a11), new h(a11), new i(cVar, a11));
            } else {
                if (i12 != 2) {
                    throw new Sc.o();
                }
                InterfaceC4008j a12 = Sc.k.a(Sc.n.NONE, new j(new o(0, cVar, c.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0)));
                b11 = b0.b(cVar, N.b(Xc0.d.class), new k(a12), new l(a12), new m(cVar, a12));
            }
            return (s) b11.getValue();
        }
    }

    public c() {
        super(null, null, SheetMode.HUG_CONTENT, false, 3, null);
        this.f24977a = Sc.k.b(new f());
    }

    public static void t(c cVar) {
        cVar.y().h0();
    }

    public static void u(c cVar) {
        cVar.y().g0();
    }

    private final void x(CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, String str, OtpDTO.Agreement agreement) {
        int i11;
        if (agreement == null) {
            i11 = 8;
        } else {
            OzonSpannableString configUrlSpans$default = OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, agreement.getText(), null, Integer.valueOf(requireContext().getColor(R.color.text_action)), null, new Pair(checkboxTitleSubtitleCellView.getMainView(), new Rc0.d(1, y(), s.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null);
            CheckboxTitleSubtitleCellHolderKt.bind$default(checkboxTitleSubtitleCellView, new CheckboxTitleSubtitleCellDTO(null, null, new CommonAtomLabelDTO(configUrlSpans$default, null, null, null, null, null, null, OzonSpannableStringKt.hasClickableSpan(configUrlSpans$default), null, 382, null), null, new CheckBoxDTO(null, null, null, null, null, null, null, null, null, null, 1023, null)), null, 2, null);
            i11 = 0;
        }
        checkboxTitleSubtitleCellView.setVisibility(i11);
        C9861a.c(checkboxTitleSubtitleCellView, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s y() {
        return (s) this.f24977a.getValue();
    }

    @Override // ru.ozon.uni.android.component.sheet.SheetView, androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        w a11 = w.a(inflater, (ViewGroup) onCreateView.findViewById(R.id.contentContainer));
        this.f24978b = a11;
        Intrinsics.checkNotNullExpressionValue(a11, "also(...)");
        IconButtonView closeButton = a11.f14563d;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        closeButton.setIcon(Integer.valueOf(R$drawable.ic_s_cross));
        closeButton.setPreset(IconButtonDTO.Preset.SIZE_HEADER_400);
        CheckboxTitleSubtitleCellView termsOfUseCheckbox = a11.f14566g;
        Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
        p pVar = new p(1, y(), s.class, "onTermsOfUseAcceptanceChange", "onTermsOfUseAcceptanceChange(Z)V", 0);
        termsOfUseCheckbox.setSaveEnabled(false);
        termsOfUseCheckbox.setFocusable(false);
        termsOfUseCheckbox.setFocusableInTouchMode(false);
        termsOfUseCheckbox.setOnStateChangeListener(new r(pVar));
        CheckboxTitleSubtitleCellView adsCheckbox = a11.f14561b;
        Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
        q qVar = new q(1, y(), s.class, "onAdsAcceptanceChange", "onAdsAcceptanceChange(Z)V", 0);
        adsCheckbox.setSaveEnabled(false);
        adsCheckbox.setFocusable(false);
        adsCheckbox.setFocusableInTouchMode(false);
        adsCheckbox.setOnStateChangeListener(new r(qVar));
        ButtonView completeButton = a11.f14564e;
        Intrinsics.checkNotNullExpressionValue(completeButton, "completeButton");
        completeButton.setOnClickListener(new ViewOnClickListenerC2787a(this, 3));
        C9861a.e(completeButton, "completeButton");
        Bundle arguments = getArguments();
        if (arguments != null) {
            OtpDTO.AgreementSheet agreementSheet = (OtpDTO.AgreementSheet) (Build.VERSION.SDK_INT >= 33 ? arguments.getParcelable("dto", OtpDTO.AgreementSheet.class) : arguments.getParcelable("dto"));
            if (agreementSheet != null) {
                String title = agreementSheet.getTitle();
                TextAtomV2View titleTextAtomView = a11.f14567h;
                titleTextAtomView.setText(title);
                Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                TextViewExtKt.applyStyle(titleTextAtomView, requireContext, UniTextStyles.COMPACT_CONTROL_500_MEDIUM.getResId());
                TextAtomV2View subtitleTextAtomView = a11.f14565f;
                Intrinsics.checkNotNullExpressionValue(subtitleTextAtomView, "subtitleTextAtomView");
                OzonSpannableString subtitle = agreementSheet.getSubtitle();
                if (subtitle == null) {
                    ViewExtKt.gone(subtitleTextAtomView);
                } else {
                    OzonSpannableString configUrlSpans$default = OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, subtitle, null, Integer.valueOf(subtitleTextAtomView.getContext().getColor(R.color.text_action)), null, new Pair(subtitleTextAtomView, new Rc0.e(1, y(), s.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null);
                    TextHolderKt.bind$default(subtitleTextAtomView, new TextDTO(configUrlSpans$default, TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, OzonSpannableStringKt.hasClickableSpan(configUrlSpans$default), null, null, null, null, null, 515260, null), null, 2, null);
                    ViewExtKt.show(subtitleTextAtomView);
                }
                Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
                x(termsOfUseCheckbox, "termsOfUseCheckbox", agreementSheet.getTermsOfUse());
                Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
                x(adsCheckbox, "adsCheckbox", agreementSheet.isAdsAllowed());
                completeButton.setTitleText(agreementSheet.getCompleteButton().getTitle());
            }
        }
        return onCreateView;
    }

    @Override // ru.ozon.uni.android.component.sheet.SheetView, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f24978b = null;
    }

    @Override // ru.ozon.uni.android.component.sheet.SheetView, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new C0497c(viewLifecycleOwner, null, this), 3);
        w wVar = this.f24978b;
        if (wVar != null) {
            wVar.f14563d.setOnClickListener(new ViewOnClickListenerC2448a(this, 4));
        }
    }
}
