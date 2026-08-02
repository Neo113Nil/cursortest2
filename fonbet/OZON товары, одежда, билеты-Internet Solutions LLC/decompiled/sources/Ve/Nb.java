package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Nb implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4668u8 f29548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f29549b;

    public Nb(C4668u8 c4668u8, Context context) {
        this.f29548a = c4668u8;
        this.f29549b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4505oi c4505oi = (C4505oi) obj;
        C4668u8 c4668u8 = this.f29548a;
        c4668u8.f32196f.setText(E.f(c4505oi.f31730a, this.f29549b));
        ShapeableImageView observeViewModel$lambda$7$lambda$5$lambda$2 = c4668u8.f32195e;
        Intrinsics.checkNotNullExpressionValue(observeViewModel$lambda$7$lambda$5$lambda$2, "observeViewModel$lambda$7$lambda$5$lambda$2");
        Intrinsics.checkNotNullParameter(observeViewModel$lambda$7$lambda$5$lambda$2, "<this>");
        observeViewModel$lambda$7$lambda$5$lambda$2.setImageDrawable(androidx.core.content.res.g.d(observeViewModel$lambda$7$lambda$5$lambda$2.getResources(), c4505oi.f31731b, null));
        observeViewModel$lambda$7$lambda$5$lambda$2.invalidate();
        String str = c4505oi.f31732c;
        if (str != null) {
            c4668u8.f32197g.setText(str);
            SPayTextView spaySlupTvUserPhone = c4668u8.f32197g;
            Intrinsics.checkNotNullExpressionValue(spaySlupTvUserPhone, "spaySlupTvUserPhone");
            spaySlupTvUserPhone.setVisibility(!kotlin.text.h.K(str) ? 0 : 8);
        }
        return Unit.f71690a;
    }
}
