package Ve;

import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import o7.C8656b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import spay.sdk.R;
import spay.sdk.domain.model.BiometricSuggestionModel;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10727i;

/* renamed from: Ve.t2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4633t2 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4633t2(Object obj, int i11) {
        super(1);
        this.f32079b = i11;
        this.f32080c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v49, types: [Ve.Jq] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32079b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Context context = ((K4) this.f32080c).requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                    Intrinsics.checkNotNullParameter(context, "context");
                    MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
                }
                break;
            case 1:
                ((C4531pf) this.f32080c).f31786h = ((Number) obj).longValue();
                break;
            default:
                Wj wj2 = ((C4349j7) obj).f31346a;
                boolean z11 = wj2 instanceof D9;
                final Mq mq = (Mq) this.f32080c;
                if (z11) {
                    mq.getClass();
                    mq.z(new C4612sa(), "NoInternetFragment");
                } else if (wj2 instanceof Qb) {
                    Qb qb2 = (Qb) wj2;
                    mq.getClass();
                    if (qb2.f29766b) {
                        mq.z(new K4(), "NoCardFragment");
                    } else {
                        InterfaceC4733wg interfaceC4733wg = qb2.f29765a;
                        if (interfaceC4733wg instanceof C4788yf) {
                            mq.z(new C1(), "BnplOrderFragment");
                        } else if (interfaceC4733wg instanceof Xe) {
                            mq.z(new S7(), "BnplAgreementFragment");
                        } else {
                            mq.z(new C4699va(), "OrderFragment");
                        }
                    }
                } else if (wj2 instanceof C4469nb) {
                    mq.getClass();
                    mq.z(new C4192dm(), "BnplPartsOrderFragment");
                } else if (wj2 instanceof Xc) {
                    M1.b bVar = ((Xc) wj2).f30351a;
                    mq.getClass();
                    if (bVar instanceof Sd) {
                        ErrorEntity errorEntity = ((Sd) bVar).f29970a;
                        if (errorEntity instanceof ErrorEntity.NoBnplResponse) {
                            int i11 = R.string.spay_bnpl_disabled_for_user_exception_title;
                            int i12 = R.string.spay_bnpl_disabled_for_user_exception_subtitle;
                            Ub ub2 = new Ub();
                            Bundle bundle = new Bundle();
                            bundle.putInt(SelectionItemFormDTO.TITLE_FIELD_NAME, i11);
                            bundle.putInt("subTitle", i12);
                            ub2.setArguments(bundle);
                            mq.z(ub2, "FailurePaymentFragment");
                        } else if (errorEntity instanceof ErrorEntity.PayBnplPartsFail) {
                            int i13 = R.string.spay_bnpl_disabled_for_user_exception_title;
                            int i14 = R.string.spay_bnpl_disabled_for_user_exception_subtitle;
                            Ub ub3 = new Ub();
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt(SelectionItemFormDTO.TITLE_FIELD_NAME, i13);
                            bundle2.putInt("subTitle", i14);
                            ub3.setArguments(bundle2);
                            mq.z(ub3, "FailurePaymentFragment");
                        } else if ((errorEntity instanceof ErrorEntity.NotEnoughMoneyForBnplFirstPayment) && (((C4654tn) ((C4577r4) mq.u()).f30498b).j() instanceof PayStrategy.PayWithPartsOnly)) {
                            int i15 = R.string.spay_not_enough_money_for_bnpl_first_payment_title;
                            int i16 = R.string.spay_not_enough_money_for_bnpl_first_payment_subtitle;
                            Ub ub4 = new Ub();
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(SelectionItemFormDTO.TITLE_FIELD_NAME, i15);
                            bundle3.putInt("subTitle", i16);
                            ub4.setArguments(bundle3);
                            mq.z(ub4, "FailurePaymentFragment");
                        } else {
                            int i17 = R.string.spay_default_client_exception_message_error_title_text;
                            int i18 = R.string.spay_default_client_exception_message_error_subtitle_text;
                            Ub ub5 = new Ub();
                            Bundle bundle4 = new Bundle();
                            bundle4.putInt(SelectionItemFormDTO.TITLE_FIELD_NAME, i17);
                            bundle4.putInt("subTitle", i18);
                            ub5.setArguments(bundle4);
                            mq.z(ub5, "FailurePaymentFragment");
                        }
                    } else if (bVar instanceof C4731we) {
                        mq.z(new C4625sn(), "ProcessingPaymentFragment");
                    } else if (bVar instanceof Ze) {
                        mq.z(new C4407l7(), "SuccessPaymentFragment");
                    }
                } else if (wj2 instanceof Rh) {
                    mq.getClass();
                    mq.z(new Cr(), "LoadingFragment");
                } else if (wj2 instanceof C4591ri) {
                    mq.getClass();
                    mq.z(new V9(), "RetryWithoutBnplFragment");
                } else if (wj2 instanceof C4672uc) {
                    mq.getClass();
                    mq.z(new C4344j2(), "CardSelectionFragment");
                } else if (wj2 instanceof C4552q7) {
                    mq.getClass();
                    mq.z(new Uh(), "FakeBankFragment");
                } else if (wj2 instanceof Lg) {
                    BiometricSuggestionModel biometricSuggestionModel = ((Lg) wj2).f29424a;
                    C8656b v11 = new C8656b(mq.requireActivity(), R.style.Spay_ThemeOverlay_MaterialAlertDialog).v(biometricSuggestionModel.getTitle());
                    v11.r(biometricSuggestionModel.getMessage());
                    v11.s(biometricSuggestionModel.getNegativeButtonText(), new Iq(mq, 0));
                    v11.u(biometricSuggestionModel.getPositiveButtonText(), new Ti.d(mq, 1));
                    v11.t(new DialogInterface.OnCancelListener() { // from class: Ve.Jq
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Mq this$0 = Mq.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            C4577r4 c4577r4 = (C4577r4) this$0.u();
                            ((C4238fb) c4577r4.f31932f).b(C4128bg.f30735a);
                        }
                    });
                    v11.q();
                } else if (wj2 instanceof C4562qh) {
                    ArrayList arrayList = ((C4562qh) wj2).f31875a;
                    mq.getClass();
                    xe.B0 c11 = C10727i.c(androidx.lifecycle.K.a(mq), null, null, new I3(mq, arrayList, null), 3);
                    xe.B0 b02 = mq.f29503l;
                    if (b02 != null) {
                        ((xe.H0) b02).j(null);
                    }
                    mq.f29503l = c11;
                } else if (wj2 instanceof C4295ha) {
                    mq.getClass();
                    mq.z(new Pm(), "OneTimePasswordFragment");
                } else if (wj2 instanceof Ka) {
                    mq.getClass();
                    mq.z(new Zp(), "OTPErrorFragment");
                } else if (wj2 instanceof C4736wj) {
                    mq.getClass();
                    mq.z(new C4357jf(), "UserProfileFragment");
                } else if (wj2 instanceof Lf) {
                    mq.getClass();
                    mq.z(new Yd(), "SdkVersionDeprecatedFragment");
                } else if (wj2 instanceof U7) {
                    mq.getClass();
                    mq.z(new Lo(), "FraudMonReviewFragment");
                } else if (wj2 instanceof C4753x8) {
                    AbstractC4323i9 abstractC4323i9 = ((C4753x8) wj2).f32471a;
                    mq.getClass();
                    if (Intrinsics.d(abstractC4323i9, V6.f30178a)) {
                        mq.z(new Hk(), "NoMatchingCardsFragment");
                    } else if (abstractC4323i9 instanceof C4752x7) {
                        mq.z(new Hk(), "NoMatchingCardsFragment");
                    } else if (Intrinsics.d(abstractC4323i9, C4149c8.f30785a)) {
                        mq.z(new K4(), "NoCardFragment");
                    } else if (abstractC4323i9 instanceof F8) {
                        mq.z(new J4(), "HelpersFragment");
                    }
                } else if (wj2 instanceof C4270ge) {
                    mq.getClass();
                    mq.z(new Za(), "PayBonusesErrorFragment");
                } else if (wj2 instanceof Ad) {
                    String subtitle = ((Ad) wj2).f28600a;
                    mq.getClass();
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    C4283gr c4283gr = new C4283gr();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("subTitle", subtitle);
                    c4283gr.setArguments(bundle5);
                    mq.z(c4283gr, "PayBindingErrorFragment");
                } else if (wj2 instanceof N6) {
                    String str = ((N6) wj2).f29530a;
                    mq.getClass();
                    int i19 = R.string.spay_no_payment_accounts_exception_title;
                    Ub ub6 = new Ub();
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt(SelectionItemFormDTO.TITLE_FIELD_NAME, i19);
                    bundle6.putString("subTitleMsg", str);
                    ub6.setArguments(bundle6);
                    mq.z(ub6, "FailurePaymentFragment");
                } else if (wj2 instanceof Ie) {
                    EnumC4801z0 reason = ((Ie) wj2).f29227a;
                    mq.getClass();
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    C4817zg c4817zg = new C4817zg();
                    c4817zg.setArguments(androidx.core.os.d.b(new Pair("ARG_REASON", Integer.valueOf(reason.ordinal()))));
                    mq.z(c4817zg, "PhoneNumberFragment");
                } else if (wj2 instanceof C4415lf) {
                    mq.getClass();
                    mq.z(new H3(), "PhoneNumberAuthViaWebViewFragment");
                } else if (wj2 instanceof Ri) {
                    mq.getClass();
                    mq.z(new C4592rj(), "TDsBindingWebViewFragment");
                }
                break;
        }
        return Unit.f71690a;
    }
}
