package Ve;

import Ae.InterfaceC2397i;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.y5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4778y5 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32536b;

    public /* synthetic */ C4778y5(Object obj, int i11) {
        this.f32535a = i11;
        this.f32536b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32535a) {
            case 0:
                ((L5) obj).a(new S4((RedirectActivity) this.f32536b));
                return Unit.f71690a;
            default:
                Eg eg2 = (Eg) obj;
                X4.a aVar = ((Mq) this.f32536b).f31717d;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                AppCompatImageView appCompatImageView = ((Zd) aVar).f30585b;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.sbssAcivBackground");
                int i11 = eg2.f28932a;
                Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
                appCompatImageView.setImageDrawable(androidx.core.content.res.g.d(appCompatImageView.getResources(), i11, null));
                return Unit.f71690a;
        }
    }
}
