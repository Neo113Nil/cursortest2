package Zc0;

import Sc.InterfaceC4008j;
import Yc0.a;
import Zc0.a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.selection.CheckboxTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolderKt;
import ru.ozon.uni.core.UniTextStyles;
import td0.C9861a;
import wd0.C10540a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc0/n;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f35849a;

    /* renamed from: b, reason: collision with root package name */
    private Jb0.p f35850b;

    public static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f35852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(0);
            this.f35852c = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new m(n.this, this.f35852c);
        }
    }

    public n() {
        super(R.layout.fragment_ozon_id_page_agreement_with_conditions);
        a aVar = new a(this);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f35849a = b0.b(this, N.b(q.class), new Bc0.m(a11), new Bc0.n(a11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q A() {
        return (q) this.f35849a.getValue();
    }

    public static void t(n nVar, PageAgreementWithConditionsDTO pageAgreementWithConditionsDTO) {
        nVar.A().z0(pageAgreementWithConditionsDTO.getHintButton().getDeeplink());
    }

    public static void u(n nVar) {
        nVar.A().x0();
    }

    public static final void v(n nVar, Jb0.p pVar, PageAgreementWithConditionsDTO pageAgreementWithConditionsDTO) {
        TextAtomV2View titleTextAtomView = pVar.f14530g;
        titleTextAtomView.setText(pageAgreementWithConditionsDTO.getAgreementBlock().getTitle());
        Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
        Context requireContext = nVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        TextViewExtKt.applyStyle(titleTextAtomView, requireContext, UniTextStyles.HEADLINE_700_X_LARGE.getResId());
        pVar.f14527d.setTitleText(pageAgreementWithConditionsDTO.getAgreementBlock().getCompleteButton().getTitle());
        CheckboxTitleSubtitleCellView termsOfUseCheckbox = pVar.f14529f;
        Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
        nVar.z(termsOfUseCheckbox, "termsOfUseCheckbox", pageAgreementWithConditionsDTO.getAgreementBlock().getTermsOfUse());
        CheckboxTitleSubtitleCellView adsCheckbox = pVar.f14525b;
        Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
        nVar.z(adsCheckbox, "adsCheckbox", pageAgreementWithConditionsDTO.getAgreementBlock().isAdsAllowed());
        UncontainedButtonView returnToMainScreenButton = pVar.f14528e;
        Intrinsics.checkNotNullExpressionValue(returnToMainScreenButton, "returnToMainScreenButton");
        UncontainedButtonHolderKt.bind$default(returnToMainScreenButton, new UncontainedButtonDTO(UncontainedButtonDTO.Preset.SIZE_500, Style.ACTION_SECONDARY, null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(pageAgreementWithConditionsDTO.getHintButton().getTitle()), null, null, null, null, null, null, false, null, 510, null), null, null, 4, null), null, 2, null);
        returnToMainScreenButton.setOnClickListener(new NV.a(1, nVar, pageAgreementWithConditionsDTO));
    }

    public static final void x(n nVar, Zc0.a aVar) {
        if (!(aVar instanceof a.C0677a)) {
            throw new Sc.o();
        }
        Jb0.p pVar = nVar.f35850b;
        if (pVar != null) {
            NotificationDTO a11 = ((a.C0677a) aVar).a();
            NotificationBar.Companion companion = NotificationBar.INSTANCE;
            ConstraintLayout b11 = pVar.b();
            Intrinsics.checkNotNullExpressionValue(b11, "getRoot(...)");
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null);
            if (asNotificationLayoutManager$default != null) {
                J viewLifecycleOwner = nVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, a11, viewLifecycleOwner, null, 8, null).show();
            }
        }
        Jb0.p pVar2 = nVar.f35850b;
        if (pVar2 != null) {
            pVar2.f14529f.setCheckboxError();
            Unit unit = Unit.f71690a;
        }
    }

    public static final void y(n nVar, Yc0.a aVar) {
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            ((C10540a) Oc0.b.a(nVar, bVar.b(), new k(1, nVar.A(), q.class, "onUrlLinkClicked", "onUrlLinkClicked$ozon_id_sdk_release(Ljava/lang/String;)V", 0), new l(nVar, bVar))).b();
        }
    }

    private final void z(CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, String str, OtpDTO.Agreement agreement) {
        int i11;
        if (agreement == null) {
            i11 = 8;
        } else {
            OzonSpannableString configUrlSpans$default = OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, agreement.getText(), null, Integer.valueOf(requireContext().getColor(R.color.text_action)), null, new Pair(checkboxTitleSubtitleCellView.getMainView(), new b(1, A(), q.class, "onUrlLinkClicked", "onUrlLinkClicked$ozon_id_sdk_release(Ljava/lang/String;)V", 0)), 5, null);
            CheckboxTitleSubtitleCellHolderKt.bind$default(checkboxTitleSubtitleCellView, new CheckboxTitleSubtitleCellDTO(null, null, new CommonAtomLabelDTO(configUrlSpans$default, null, null, null, null, null, null, OzonSpannableStringKt.hasClickableSpan(configUrlSpans$default), null, 382, null), null, new CheckBoxDTO(null, null, null, null, null, null, null, null, null, null, 1023, null)), null, 2, null);
            i11 = 0;
        }
        checkboxTitleSubtitleCellView.setVisibility(i11);
        C9861a.c(checkboxTitleSubtitleCellView, str);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Jb0.p a11 = Jb0.p.a(view);
        CheckboxTitleSubtitleCellView termsOfUseCheckbox = a11.f14529f;
        Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
        c cVar = new c(1, A(), q.class, "onTermsOfUseAcceptanceChange", "onTermsOfUseAcceptanceChange$ozon_id_sdk_release(Z)V", 0);
        termsOfUseCheckbox.setSaveEnabled(false);
        termsOfUseCheckbox.setFocusable(false);
        termsOfUseCheckbox.setFocusableInTouchMode(false);
        termsOfUseCheckbox.setCheckboxError();
        termsOfUseCheckbox.setOnStateChangeListener(new e(cVar));
        CheckboxTitleSubtitleCellView adsCheckbox = a11.f14525b;
        Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
        d dVar = new d(1, A(), q.class, "onAdsAcceptanceChange", "onAdsAcceptanceChange$ozon_id_sdk_release(Z)V", 0);
        adsCheckbox.setSaveEnabled(false);
        adsCheckbox.setFocusable(false);
        adsCheckbox.setFocusableInTouchMode(false);
        adsCheckbox.setCheckboxError();
        adsCheckbox.setOnStateChangeListener(new e(dVar));
        ButtonView completeButton = a11.f14527d;
        Intrinsics.checkNotNullExpressionValue(completeButton, "completeButton");
        completeButton.setOnClickListener(new DQ.b(this, 7));
        q A11 = A();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new f(viewLifecycleOwner, null, A11, this, a11), 3);
        this.f35850b = a11;
    }
}
