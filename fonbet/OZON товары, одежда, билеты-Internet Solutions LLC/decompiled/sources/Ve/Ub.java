package Ve;

import B1.C2548q;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import spay.sdk.R;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Ub;", "LVe/Ko;", "LVe/xc;", "LVe/ym;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Ub extends Ko<C4757xc, C4795ym> {
    @Override // Ve.Bc
    public final X4.a t() {
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_failure_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i11 = R.id.spay_slfp_actv_local_session_id;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slfp_actv_subtitle;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                i11 = R.id.spay_slfp_actv_title;
                SPayTextView sPayTextView3 = (SPayTextView) C2548q.d(i11, inflate);
                if (sPayTextView3 != null) {
                    i11 = R.id.spay_slfp_lottie_failure;
                    if (((LottieAnimationView) C2548q.d(i11, inflate)) != null) {
                        i11 = R.id.spay_slfp_mb_to_payment_methods;
                        SPayMaterialButton sPayMaterialButton = (SPayMaterialButton) C2548q.d(i11, inflate);
                        if (sPayMaterialButton != null) {
                            C4795ym c4795ym = new C4795ym(constraintLayout, sPayTextView, sPayTextView2, sPayTextView3, sPayMaterialButton);
                            Intrinsics.checkNotNullExpressionValue(c4795ym, "inflate(layoutInflater)");
                            return c4795ym;
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
        return C4757xc.class;
    }

    @Override // Ve.Bc
    public final void w() {
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4795ym) aVar).f32604e.setOnClickListener(new GW.a(this, 2));
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
        Ae.M0 m02 = ((C4757xc) u()).f31541e;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4556qb(this, AbstractC5434v.b.STARTED, m02, null, this), 3);
    }

    @Override // Ve.Bc
    public final void z() {
        String string;
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4795ym c4795ym = (C4795ym) aVar;
        Resources resources = getResources();
        Bundle arguments = getArguments();
        c4795ym.f32603d.setText(resources.getString(arguments != null ? arguments.getInt(SelectionItemFormDTO.TITLE_FIELD_NAME) : R.string.spay_default_client_exception_message_error_title_text));
        X4.a aVar2 = this.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        C4795ym c4795ym2 = (C4795ym) aVar2;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("subTitleMsg")) == null) {
            Resources resources2 = getResources();
            Bundle arguments3 = getArguments();
            string = resources2.getString(arguments3 != null ? arguments3.getInt("subTitle") : R.string.spay_default_client_exception_message_error_subtitle_text);
        }
        c4795ym2.f32602c.setText(string);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        Intrinsics.checkNotNullParameter(context, "context");
        MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
    }
}
