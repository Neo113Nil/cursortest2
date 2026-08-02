package Ve;

import Ae.C2406m0;
import Ax.ViewOnClickListenerC2451a;
import B1.C2548q;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.PhoneNumberCompositeView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/zg;", "LVe/Bc;", "LVe/mk;", "LVe/Z4;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.zg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4817zg extends Bc<C4449mk, Z4> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_phone_number, (ViewGroup) null, false);
        int i11 = R.id.spay_slpn_acb_backward;
        AppCompatButton appCompatButton = (AppCompatButton) C2548q.d(i11, inflate);
        if (appCompatButton != null) {
            i11 = R.id.spay_slpn_acet_phone_number;
            PhoneNumberCompositeView phoneNumberCompositeView = (PhoneNumberCompositeView) C2548q.d(i11, inflate);
            if (phoneNumberCompositeView != null) {
                i11 = R.id.spay_slpn_actv_exception;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView != null) {
                    i11 = R.id.spay_slpn_actv_title;
                    if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                        i11 = R.id.spay_slpn_mb_continue;
                        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton != null) {
                            i11 = R.id.spay_slpn_stv_terms_of_service;
                            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                            if (sPayTextView2 != null) {
                                Z4 z42 = new Z4((ConstraintLayout) inflate, appCompatButton, phoneNumberCompositeView, sPayTextView, sPayMaterialButton, sPayTextView2);
                                Intrinsics.checkNotNullExpressionValue(z42, "inflate(layoutInflater)");
                                return z42;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.Bc
    /* renamed from: v */
    public final Class getF29732e() {
        return C4449mk.class;
    }

    @Override // Ve.Bc
    public final void x() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f28694c = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
        }
    }

    @Override // Ve.Bc
    public final void y() {
        C2406m0 c2406m0 = new C2406m0((Ae.M0) ((C4449mk) u()).f31602h.getValue());
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4783ya(this, AbstractC5434v.b.CREATED, c2406m0, null, this), 3);
        Ae.x0 x0Var = ((C4449mk) u()).f31600f;
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4326ic(this, bVar, x0Var, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Td(this, bVar, (Ae.M0) ((C4449mk) u()).f31601g.getValue(), null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Af(this, bVar, new C2406m0(((C4449mk) u()).f31603i), null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        int i11;
        Bundle arguments = getArguments();
        EnumC4801z0 reason = null;
        if (arguments != null) {
            int i12 = arguments.getInt("ARG_REASON", -1);
            Integer valueOf = Integer.valueOf(i12);
            if (i12 == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                EnumC4801z0[] values = EnumC4801z0.values();
                int length = values.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    EnumC4801z0 enumC4801z0 = values[i13];
                    if (enumC4801z0.ordinal() == intValue) {
                        reason = enumC4801z0;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (reason != null) {
            C4449mk c4449mk = (C4449mk) u();
            Intrinsics.checkNotNullParameter(reason, "reason");
            c4449mk.f31599e = reason;
        }
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        Z4 z42 = (Z4) aVar;
        z42.f30564e.setOnClickListener(new IK.a(1, this, z42));
        AppCompatButton appCompatButton = z42.f30561b;
        if (reason != null) {
            int ordinal = reason.ordinal();
            if (ordinal == 0) {
                i11 = R.string.spay_label_close;
            } else {
                if (ordinal != 1) {
                    throw new Sc.o();
                }
                i11 = R.string.spay_btn_label_back;
            }
            appCompatButton.setText(getString(i11));
        }
        appCompatButton.setOnClickListener(new ViewOnClickListenerC2451a(this, 8));
    }
}
