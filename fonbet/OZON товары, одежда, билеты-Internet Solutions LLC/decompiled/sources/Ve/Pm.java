package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.utils.receiver.OtpReceiver;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.otpTextView.SpayOtpTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Pm;", "LVe/Bc;", "LVe/Z2;", "LVe/l0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Pm extends Bc<Z2, C4400l0> {

    /* renamed from: d, reason: collision with root package name */
    public OtpReceiver f29731d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f29732e = Z2.class;

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        super.onActivityResult(i11, i12, intent);
        if (i11 != 200 || i12 != -1 || intent == null || (stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)) == null) {
            return;
        }
        ((Z2) u()).e0(new C4260g4(stringExtra));
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((Z2) u()).e0(L4.f29387a);
        OtpReceiver otpReceiver = new OtpReceiver();
        this.f29731d = otpReceiver;
        Fj listener = new Fj(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        otpReceiver.f98857a = listener;
        androidx.core.content.a.registerReceiver(requireContext(), this.f29731d, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null, 4);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        ((Z2) u()).e0(Y2.f30428b);
        requireActivity().unregisterReceiver(this.f29731d);
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_one_time_password, (ViewGroup) null, false);
        int i11 = R.id.spay_slotp_mb_btn_cancel;
        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
        if (sPayMaterialButton != null) {
            i11 = R.id.spay_slotp_mb_btn_continue;
            SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
            if (sPayMaterialButton2 != null) {
                i11 = R.id.spay_slotp_socecv_code;
                SpayOtpTextView spayOtpTextView = (SpayOtpTextView) C2548q.d(i11, inflate);
                if (spayOtpTextView != null) {
                    i11 = R.id.spay_slotp_tv_error_message;
                    SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                    if (sPayTextView != null) {
                        i11 = R.id.spay_slotp_tv_message;
                        SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                        if (sPayTextView2 != null) {
                            i11 = R.id.spay_slotp_tv_retry_btn;
                            SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                            if (sPayTextView3 != null) {
                                C4400l0 c4400l0 = new C4400l0((ConstraintLayout) inflate, sPayMaterialButton, sPayMaterialButton2, spayOtpTextView, sPayTextView, sPayTextView2, sPayTextView3);
                                Intrinsics.checkNotNullExpressionValue(c4400l0, "inflate(layoutInflater)");
                                return c4400l0;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v, reason: from getter */
    public final Class getF29732e() {
        return this.f29732e;
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            Yj yj2 = c4792yj.f32584a;
            this.f28694c = (InterfaceC4436m7) yj2.f30484l.get();
            yj2.a();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4400l0 c4400l0 = (C4400l0) aVar;
        Ae.M0 m02 = ((Z2) u()).f30533A;
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4264g8(this, bVar, m02, null, c4400l0), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new O9(this, bVar, new C2406m0(((Z2) u()).f30551t), null, c4400l0, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4784yb(this, bVar, ((Z2) u()).f30553v, null, c4400l0, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4355jd(this, bVar, ((Z2) u()).f30534B, null, c4400l0, this, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Ue(this, bVar, ((Z2) u()).f30555x, null, c4400l0), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Wg(this, bVar, new C2406m0(((Z2) u()).f30557z), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4189dj(this, bVar, new C2406m0(((Z2) u()).f30546o), null, c4400l0), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4400l0 c4400l0 = (C4400l0) aVar;
        SPayMaterialButton spaySlotpMbBtnCancel = c4400l0.f31484b;
        Intrinsics.checkNotNullExpressionValue(spaySlotpMbBtnCancel, "spaySlotpMbBtnCancel");
        spaySlotpMbBtnCancel.setOnClickListener(new Ik(new kotlin.jvm.internal.L(), this));
        SPayMaterialButton spaySlotpMbBtnContinue = c4400l0.f31485c;
        Intrinsics.checkNotNullExpressionValue(spaySlotpMbBtnContinue, "spaySlotpMbBtnContinue");
        spaySlotpMbBtnContinue.setOnClickListener(new ViewOnClickListenerC4450ml(new kotlin.jvm.internal.L(), this));
        SPayTextView spaySlotpTvRetryBtn = c4400l0.f31489g;
        Intrinsics.checkNotNullExpressionValue(spaySlotpTvRetryBtn, "spaySlotpTvRetryBtn");
        spaySlotpTvRetryBtn.setOnClickListener(new Ol(new kotlin.jvm.internal.L(), c4400l0, this));
        c4400l0.f31486d.setSpayOtpListener(new C4276gk(this));
        SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(requireContext())");
        client.startSmsUserConsent(null).addOnSuccessListener(new B90.L(C4538pm.f31809b)).addOnFailureListener(new Om());
    }
}
