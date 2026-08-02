package Wc0;

import Cz.ViewOnClickListenerC2788a;
import Jb0.B;
import Jb0.C;
import Jb0.y;
import Rc0.c;
import Sc.InterfaceC4008j;
import Xc0.a;
import Xc0.c;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import ic0.C7046b;
import ic0.C7047c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.OtpVO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9861a;
import td0.C9863c;
import wd0.C10540a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWc0/b;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.o f33456a;

    /* renamed from: b, reason: collision with root package name */
    private B f33457b;

    /* renamed from: c, reason: collision with root package name */
    private C f33458c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f33459d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f33460e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33461a;

        static {
            int[] iArr = new int[OtpDTO.b.values().length];
            try {
                iArr[OtpDTO.b.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpDTO.b.ErrorDefault.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtpDTO.b.ErrorTimeout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33461a = iArr;
        }
    }

    /* renamed from: Wc0.b$b, reason: collision with other inner class name */
    static final class C0596b extends AbstractC7737t implements Function0<cc0.d> {
        C0596b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cc0.d invoke() {
            return new cc0.d(new Wc0.f(1, b.this.I(), Xc0.d.class, "onOtpCodeChange", "onOtpCodeChange(Ljava/lang/CharSequence;)V", 0));
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((Xc0.d) this.receiver).d1(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((Xc0.d) this.receiver).W0(p02);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<C7047c, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7047c c7047c) {
            C7047c it = c7047c;
            Intrinsics.checkNotNullParameter(it, "it");
            b.this.I().S0(it.a(), it.b(), it.c());
            return Unit.f71690a;
        }
    }

    public static final class f extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f33465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar) {
            super(0);
            this.f33465c = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new s(b.this, this.f33465c);
        }
    }

    public b() {
        super(R.layout.fragment_ozon_id_otp);
        f fVar = new f(this);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f33459d = b0.b(this, N.b(Xc0.d.class), new Bc0.m(a11), new Bc0.n(a11), fVar);
        this.f33460e = Sc.k.b(new C0596b());
    }

    public static final void D(b bVar, boolean z11) {
        B b11 = bVar.f33457b;
        if (b11 != null) {
            C9863c.a(b11.f14350c, z11);
        }
    }

    public static final void E(b bVar, Xc0.a aVar) {
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.c) {
                a.c cVar = (a.c) aVar;
                ((C10540a) Oc0.b.a(bVar, cVar.b(), new q(1, bVar.I(), Xc0.d.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0), new r(bVar, cVar))).b();
                return;
            }
            return;
        }
        a.b bVar2 = (a.b) aVar;
        if (bVar.getChildFragmentManager().g0("AgreementsSheet") != null) {
            return;
        }
        G childFragmentManager = bVar.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Q p11 = childFragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        int i11 = Rc0.c.f24976c;
        p11.d(c.a.a(bVar2.a(), Rc0.a.Otp), "AgreementsSheet");
        p11.i();
    }

    public static final void F(b bVar, Xc0.c cVar) {
        B b11 = bVar.f33457b;
        if (b11 == null) {
            return;
        }
        boolean z11 = cVar instanceof c.a;
        TextFieldCellView textFieldCellView = b11.f14360m;
        if (!z11) {
            if (!Intrinsics.d(cVar, c.b.f34290a)) {
                throw new Sc.o();
            }
            textFieldCellView.setLabelText(null);
            textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
            return;
        }
        String a11 = ((c.a) cVar).a();
        if (a11 == null) {
            a11 = bVar.getString(R.string.ozonid_error_technical_error_title);
            Intrinsics.checkNotNullExpressionValue(a11, "getString(...)");
        }
        textFieldCellView.setLabelText(a11);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
    }

    public static final void G(b bVar, Jb0.o oVar, OtpVO otpVO) {
        char c11;
        int i11;
        int i12 = a.f33461a[otpVO.getPageType().ordinal()];
        if (i12 == 1) {
            B b11 = bVar.f33457b;
            if (b11 != null) {
                C c12 = bVar.f33458c;
                if (c12 != null) {
                    ViewExtKt.gone(c12.f14365c);
                }
                Group defaultPageTypeGroup = b11.f14351d;
                Intrinsics.checkNotNullExpressionValue(defaultPageTypeGroup, "defaultPageTypeGroup");
                ViewExtKt.show(defaultPageTypeGroup);
                Context context = bVar.getContext();
                TextAtomV2View titleTextAtomV2 = b11.f14362o;
                if (context != null) {
                    Intrinsics.checkNotNullExpressionValue(titleTextAtomV2, "titleTextAtomV2");
                    TextViewExtKt.applyStyle(titleTextAtomV2, context, UniTextStyles.HEADLINE_700_X_LARGE.getResId());
                }
                titleTextAtomV2.setText(OzonSpannableStringKt.toOzonSpannableString(otpVO.getTitle()));
                TextAtomV2View subtitleTextAtomV2 = b11.f14361n;
                Intrinsics.checkNotNullExpressionValue(subtitleTextAtomV2, "subtitleTextAtomV2");
                OzonSpannableString subtitle = otpVO.getSubtitle();
                if (subtitle == null) {
                    subtitleTextAtomV2.setVisibility(8);
                    c11 = 1;
                    i11 = 8;
                } else {
                    c11 = 1;
                    i11 = 8;
                    OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, subtitle, null, Integer.valueOf(subtitleTextAtomV2.getContext().getColor(R.color.text_action)), null, new Pair(subtitleTextAtomV2, new Wc0.e(1, bVar.I(), Xc0.d.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null);
                    TextDTO textDTO = new TextDTO(subtitle, TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, true, null, null, null, null, null, 515260, null);
                    subtitleTextAtomV2.setVisibility(0);
                    TextHolderKt.bind$default(subtitleTextAtomV2, textDTO, null, 2, null);
                }
                CellView messengerOtpCell = b11.f14359l;
                Intrinsics.checkNotNullExpressionValue(messengerOtpCell, "messengerOtpCell");
                OtpDTO.MessengerOtpCell messengerOtpCell2 = otpVO.getMessengerOtpCell();
                if (messengerOtpCell2 == null) {
                    ViewExtKt.gone(messengerOtpCell);
                } else {
                    CellDTO.LeftBlock leftBlock = new CellDTO.LeftBlock(null, CellDTO.BlockAlignment.ALIGNMENT_TOP, null, CommonCellSettings.LayoutPadding.PADDING_300, null, new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO(messengerOtpCell2.getIcon(), messengerOtpCell2.getIconTintColor()), null, null, null, null, null, null, null, null, null, null, null, 65450, null), null, null, 213, null);
                    CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(new CellDTO.CellText(OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, messengerOtpCell2.getTitle(), null, Integer.valueOf(messengerOtpCell.getContext().getColor(R.color.text_action)), null, new Pair(messengerOtpCell, new Wc0.c(1, bVar.I(), Xc0.d.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0)), 5, null), null, null, true, null, null, 54, null), null, null, null, null, null, 62, null);
                    CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_350;
                    CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_400;
                    CellHolderKt.bind$default(messengerOtpCell, new CellDTO(centerBlock, new CellDTO.Settings(layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, Boolean.TRUE, null, "bgPrimary", CornerRadius.RADIUS_500, null, null, null, 1824, null), leftBlock, null, null, 24, null), null, 2, null);
                }
                CellView callInCell = b11.f14349b;
                Intrinsics.checkNotNullExpressionValue(callInCell, "callInCell");
                OtpDTO.CallInCell callInCell2 = otpVO.getCallInCell();
                if (callInCell2 == null) {
                    ViewExtKt.gone(callInCell);
                } else {
                    ViewExtKt.show(callInCell);
                    CommonAtomIconDTO commonAtomIconDTO = new CommonAtomIconDTO(callInCell2.getStatusIcon(), callInCell2.getStatusIconTintColor());
                    IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
                    IconDTO iconDTO = new IconDTO(iconSize, null, IconDTO.IconShape.SHAPE_NONE, null, commonAtomIconDTO, null, null, null, null, null, null, null, null, null, null, null, 65450, null);
                    OtpDTO.CallInCell.CallInCellButton button = callInCell2.getButton();
                    IconDTO iconDTO2 = button != null ? new IconDTO(iconSize, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO(button.getIcon(), button.getIconTintColor()), null, UniColors.BG_ACTION_SECONDARY.getToken(), null, null, null, null, null, null, null, null, null, 65450, null) : null;
                    CellDTO.BlockAlignment blockAlignment = CellDTO.BlockAlignment.ALIGNMENT_TOP;
                    CommonCellSettings.LayoutPadding layoutPadding3 = CommonCellSettings.LayoutPadding.PADDING_300;
                    CellDTO.LeftBlock leftBlock2 = new CellDTO.LeftBlock(null, blockAlignment, null, layoutPadding3, null, iconDTO, null, null, 213, null);
                    CellDTO.CenterBlock centerBlock2 = new CellDTO.CenterBlock(new CellDTO.CellText(new OzonSpannableString(callInCell2.getTitle()), callInCell2.getTitleColor(), UniTextStyles.COMPACT_CONTROL_500_MEDIUM.getToken(), false, 2, null, 40, null), new CellDTO.CellText(new OzonSpannableString(callInCell2.getSubtitle()), callInCell2.getSubtitleColor(), UniTextStyles.BODY_400_SMALL.getToken(), false, 2, null, 40, null), CommonCellSettings.LayoutPadding.PADDING_100, null, null, null, 56, null);
                    CellDTO.RightBlock rightBlock = new CellDTO.RightBlock(null, CellDTO.BlockAlignment.ALIGNMENT_CENTER, null, layoutPadding3, null, null, null, iconDTO2, null, null, null, null, 3957, null);
                    CommonCellSettings.LayoutPadding layoutPadding4 = CommonCellSettings.LayoutPadding.PADDING_350;
                    CellHolderKt.bind$default(callInCell, new CellDTO(centerBlock2, new CellDTO.Settings(layoutPadding4, layoutPadding4, layoutPadding4, CommonCellSettings.LayoutPadding.PADDING_400, Boolean.TRUE, null, UniColors.BG_PRIMARY.getToken(), CornerRadius.RADIUS_500, null, null, null, 1824, null), leftBlock2, rightBlock, null, 16, null), null, 2, null);
                    CellView.LeftBlock leftBlock3 = callInCell.getLeftBlock();
                    CellView.CenterBlock centerBlock3 = callInCell.getCenterBlock();
                    CellView.RightBlock rightBlock2 = callInCell.getRightBlock();
                    View[] viewArr = new View[3];
                    viewArr[0] = leftBlock3;
                    viewArr[c11] = centerBlock3;
                    viewArr[2] = rightBlock2;
                    Iterator it = C7714v.b0(viewArr).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setOnClickListener(new GS.a(bVar, 5));
                    }
                }
                OtpDTO.PhoneExample phoneExample = otpVO.getPhoneExample();
                Group flashCallGroup = b11.f14354g;
                if (phoneExample == null) {
                    Intrinsics.checkNotNullExpressionValue(flashCallGroup, "flashCallGroup");
                    flashCallGroup.setVisibility(i11);
                } else {
                    Intrinsics.checkNotNullExpressionValue(flashCallGroup, "flashCallGroup");
                    flashCallGroup.setVisibility(0);
                    int resId = UniTextStyles.BODY_500_MEDIUM.getResId();
                    TextAtomV2View textAtomV2View = b11.f14355h;
                    textAtomV2View.setTextAppearance(resId);
                    textAtomV2View.setText(phoneExample.getText());
                    int resId2 = UniTextStyles.HEADLINE_400_SMALL.getResId();
                    TextAtomV2View textAtomV2View2 = b11.f14353f;
                    textAtomV2View2.setTextAppearance(resId2);
                    textAtomV2View2.setText(phoneExample.getAccent());
                }
                TextFieldCellView otpTextField = b11.f14360m;
                Intrinsics.checkNotNullExpressionValue(otpTextField, "otpTextField");
                OtpDTO.Input input = otpVO.getInput();
                if (input == null || otpVO.getOtpLength() == null) {
                    ViewExtKt.gone(otpTextField);
                    ViewExtKt.gone(otpTextField.getMainView());
                    ViewExtKt.gone(otpTextField.getMainView().getInputViewGroup());
                    ViewExtKt.gone(otpTextField.getMainView().getInputViewGroup().getInputView());
                    td0.p.a(otpTextField);
                } else {
                    otpTextField.getMainView().getInputViewGroup().getInputView().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(otpVO.getOtpLength().intValue())});
                    td0.p.b(otpTextField, input.getFocusTrackAction(), new Wc0.d(1, bVar.I(), Xc0.d.class, "onInputFocused", "onInputFocused(Ljava/lang/String;)V", 0));
                    ViewExtKt.show(otpTextField);
                }
                ButtonView getNewCodeButton = b11.f14356i;
                Intrinsics.checkNotNullExpressionValue(getNewCodeButton, "getNewCodeButton");
                H(getNewCodeButton, otpVO);
                LinearLayout hintButtonsLinearLayout = b11.f14358k;
                Intrinsics.checkNotNullExpressionValue(hintButtonsLinearLayout, "hintButtonsLinearLayout");
                cc0.c.a(hintButtonsLinearLayout, otpVO.getHintButtons(), null, new o(bVar), 2);
                y yVar = b11.f14352e;
                ru.ozon.id.common.disclaimer.a.a(yVar, otpVO.getDisclaimer(), new p(1, bVar.I(), Xc0.d.class, "onDisclaimerButtonClicked", "onDisclaimerButtonClicked(Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerButtonDTO;)V", 0));
                int id2 = getNewCodeButton.getId();
                UncontainedButtonView uncontainedButtonView = yVar.f14573c;
                uncontainedButtonView.setNextFocusUpId(id2);
                uncontainedButtonView.setNextFocusDownId(b11.f14357j.getId());
                ButtonView continueButton = b11.f14350c;
                Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
                OtpDTO.ContinueButton continueButton2 = otpVO.getContinueButton();
                if (continueButton2 == null) {
                    ViewExtKt.gone(continueButton);
                } else {
                    continueButton.setTitleText(continueButton2.getTitle());
                    ViewExtKt.show(continueButton);
                }
            }
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new Sc.o();
            }
            C c13 = bVar.f33458c;
            if (c13 != null) {
                B b12 = bVar.f33457b;
                if (b12 != null) {
                    ViewExtKt.gone(b12.f14351d);
                }
                Group errorPageTypeGroup = c13.f14365c;
                Intrinsics.checkNotNullExpressionValue(errorPageTypeGroup, "errorPageTypeGroup");
                ViewExtKt.show(errorPageTypeGroup);
                Context context2 = bVar.getContext();
                TextAtomV2View errorTitleTextAtomView = c13.f14368f;
                if (context2 != null) {
                    Intrinsics.checkNotNullExpressionValue(errorTitleTextAtomView, "errorTitleTextAtomView");
                    TextViewExtKt.applyStyle(errorTitleTextAtomView, context2, UniTextStyles.HEADLINE_700_X_LARGE.getResId());
                }
                Context context3 = bVar.getContext();
                TextAtomV2View errorSubtitleTextAtomView = c13.f14367e;
                if (context3 != null) {
                    Intrinsics.checkNotNullExpressionValue(errorSubtitleTextAtomView, "errorSubtitleTextAtomView");
                    TextViewExtKt.applyStyle(errorSubtitleTextAtomView, context3, UniTextStyles.BODY_500_MEDIUM.getResId());
                }
                errorTitleTextAtomView.setText(OzonSpannableStringKt.toOzonSpannableString(otpVO.getTitle()));
                OzonSpannableString subtitle2 = otpVO.getSubtitle();
                errorSubtitleTextAtomView.setText(subtitle2 != null ? OzonSpannableStringKt.toOzonSpannableString(subtitle2) : null);
                Image errorImageView = c13.f14364b;
                Intrinsics.checkNotNullExpressionValue(errorImageView, "errorImageView");
                String errorLogoUrl = otpVO.getErrorLogoUrl();
                ImageHolderKt.bindOrGone$default(errorImageView, errorLogoUrl != null ? new ImageDTO(errorLogoUrl, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null) : null, null, 2, null);
                ButtonView errorRetryButton = c13.f14366d;
                Intrinsics.checkNotNullExpressionValue(errorRetryButton, "errorRetryButton");
                H(errorRetryButton, otpVO);
            }
        }
        ConstraintLayout contentContainer = oVar.f14523b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        contentContainer.setVisibility(0);
    }

    private static void H(ButtonView buttonView, OtpVO otpVO) {
        OtpDTO.RetryButton retryButton = otpVO.getRetryButton();
        if (retryButton == null) {
            ViewExtKt.gone(buttonView);
            return;
        }
        buttonView.getMainView().setTitleText(OzonSpannableStringKt.toOzonSpannableString(retryButton.getTitle()));
        TitleSubtitleCellView mainView = buttonView.getMainView();
        String subtitle = retryButton.getSubtitle();
        mainView.setSubtitleText(subtitle != null ? OzonSpannableStringKt.toOzonSpannableString(subtitle) : null);
        ViewExtKt.show(buttonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Xc0.d I() {
        return (Xc0.d) this.f33459d.getValue();
    }

    public static void t(Jb0.o oVar, b bVar, B b11, C c11) {
        ConstraintLayout contentContainer = oVar.f14523b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        contentContainer.setVisibility(8);
        TextFieldCellView otpTextField = b11.f14360m;
        Intrinsics.checkNotNullExpressionValue(otpTextField, "otpTextField");
        otpTextField.setSaveEnabled(false);
        otpTextField.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        otpTextField.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.NONE);
        otpTextField.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.NUMBER);
        otpTextField.inputCanReset(true);
        otpTextField.getMainView().setTextWatcher((cc0.d) bVar.f33460e.getValue());
        OzonTextInput inputView = otpTextField.getMainView().getInputViewGroup().getInputView();
        inputView.setTextAppearance(UniTextStyles.HEADLINE_500_MEDIUM.getResId());
        inputView.setImportantForAutofill(2);
        TextFieldCellApi.DefaultImpls.setLabelColor$default(otpTextField, otpTextField.getContext().getColor(R.color.graphic_negative_primary), 0.0f, 2, null);
        C9861a.d(otpTextField, "otpTextField");
        Jm0.a aVar = new Jm0.a(bVar, 3);
        ButtonView buttonView = b11.f14356i;
        buttonView.setOnClickListener(aVar);
        C9861a.e(buttonView, "getNewCodeButton");
        FX.a aVar2 = new FX.a(bVar, 5);
        ButtonView buttonView2 = b11.f14350c;
        buttonView2.setOnClickListener(aVar2);
        C9861a.e(buttonView2, "continueButton");
        ButtonView buttonView3 = c11.f14366d;
        buttonView3.setOnClickListener(new ViewOnClickListenerC2788a(bVar, 4));
        C9861a.e(buttonView3, "errorRetryButton");
        Xc0.d I11 = bVar.I();
        J viewLifecycleOwner = bVar.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new g(viewLifecycleOwner, null, I11, bVar), 3);
    }

    public static void u(b bVar) {
        bVar.I().X0();
    }

    public static void v(b bVar) {
        bVar.I().T0();
    }

    public static void w(b bVar) {
        bVar.I().U0();
    }

    public static void x(b bVar) {
        bVar.I().X0();
    }

    public static final void y(b bVar, B b11, CharSequence charSequence) {
        TextFieldCellView otpTextField = b11.f14360m;
        Intrinsics.checkNotNullExpressionValue(otpTextField, "otpTextField");
        cc0.c.c(otpTextField, charSequence, (cc0.d) bVar.f33460e.getValue());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c onSmsRetrieved = new c(1, I(), Xc0.d.class, "onSmsRetrieved", "onSmsRetrieved(Ljava/lang/String;)V", 0);
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(onSmsRetrieved, "onSmsRetrieved");
        getLifecycle().a(new Uc0.c(onSmsRetrieved));
        d onFlashCall = new d(1, I(), Xc0.d.class, "onFlashCallReceived", "onFlashCallReceived(Ljava/lang/String;)V", 0);
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(onFlashCall, "onFlashCall");
        getLifecycle().a(new Tc0.b(onFlashCall));
        C7046b.a.a(this, "OTP", new e());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        B b11 = this.f33457b;
        if (b11 != null) {
            b11.f14360m.getMainView().setTextWatcher(null);
        }
        this.f33457b = null;
        this.f33458c = null;
        this.f33456a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final Jb0.o a11 = Jb0.o.a(view);
        this.f33456a = a11;
        Intrinsics.checkNotNullExpressionValue(a11, "also(...)");
        final B a12 = B.a(view);
        this.f33457b = a12;
        Intrinsics.checkNotNullExpressionValue(a12, "also(...)");
        final C a13 = C.a(view);
        this.f33458c = a13;
        Intrinsics.checkNotNullExpressionValue(a13, "also(...)");
        a11.f14523b.post(new Runnable() { // from class: Wc0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.t(Jb0.o.this, this, a12, a13);
            }
        });
        I().e1();
    }
}
