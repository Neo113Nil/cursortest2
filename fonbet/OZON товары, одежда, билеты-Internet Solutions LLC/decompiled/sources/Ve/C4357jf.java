package Ve;

import Ae.C2406m0;
import B1.C2548q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/jf;", "LVe/Bc;", "LVe/vk;", "LVe/u8;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.jf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4357jf extends Bc<C4709vk, C4668u8> {
    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((C4709vk) u()).e0(Ig.f29233a);
    }

    @Override // Ve.Bc, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        ((C4709vk) u()).e0(C4446mh.f31591a);
        super.onStop();
    }

    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_user_profile, (ViewGroup) null, false);
        int i11 = R.id.spay_slup_aciv_info;
        if (((AppCompatImageView) C2548q.d(i11, inflate)) != null) {
            i11 = R.id.spay_slup_actv_info;
            SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView != null) {
                i11 = R.id.spay_slup_cv_info;
                if (((MaterialCardView) C2548q.d(i11, inflate)) != null) {
                    i11 = R.id.spay_slup_mb_btn_pay;
                    SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                    if (sPayMaterialButton != null) {
                        i11 = R.id.spay_slup_mb_btn_quit;
                        SPayMaterialButton sPayMaterialButton2 = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton2 != null) {
                            i11 = R.id.spay_slup_siv_user_icon;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, inflate);
                            if (shapeableImageView != null) {
                                i11 = R.id.spay_slup_tv_user_mail;
                                if (((SPayTextView) C2548q.d(i11, inflate)) != null) {
                                    i11 = R.id.spay_slup_tv_user_name;
                                    SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
                                    if (sPayTextView2 != null) {
                                        i11 = R.id.spay_slup_tv_user_phone;
                                        SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                                        if (sPayTextView3 != null) {
                                            C4668u8 c4668u8 = new C4668u8((ConstraintLayout) inflate, sPayTextView, sPayMaterialButton, sPayMaterialButton2, shapeableImageView, sPayTextView2, sPayTextView3);
                                            Intrinsics.checkNotNullExpressionValue(c4668u8, "inflate(layoutInflater)");
                                            return c4668u8;
                                        }
                                    }
                                }
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
        return C4709vk.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        SPayMaterialButton sPayMaterialButton = ((C4668u8) aVar).f32194d;
        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton, "binding.spaySlupMbBtnQuit");
        sPayMaterialButton.setOnClickListener(new Ia(new kotlin.jvm.internal.L(), this));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        SPayMaterialButton sPayMaterialButton2 = ((C4668u8) aVar2).f32193c;
        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton2, "binding.spaySlupMbBtnPay");
        sPayMaterialButton2.setOnClickListener(new ViewOnClickListenerC4382kb(new kotlin.jvm.internal.L(), this));
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
        C4668u8 c4668u8 = (C4668u8) aVar;
        C2406m0 c2406m0 = new C2406m0(((C4709vk) u()).f32301g);
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Uc(this, bVar, c2406m0, null, c4668u8, requireContext), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Fe(this, bVar, new C2406m0(((C4709vk) u()).f32302h), null, c4668u8), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        w();
    }
}
