package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.nq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4484nq implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4794yl f31690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31691b;

    public C4484nq(C4794yl c4794yl, Context context) {
        this.f31690a = c4794yl;
        this.f31691b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        String str;
        C4616se c4616se = (C4616se) obj;
        C4794yl c4794yl = this.f31690a;
        c4794yl.f32597b.setText(E.f(c4616se.f32047a, this.f31691b));
        SPayTextView spaySlcsActvOrderSumOld = c4794yl.f32598c;
        Intrinsics.checkNotNullExpressionValue(spaySlcsActvOrderSumOld, "spaySlcsActvOrderSumOld");
        Intrinsics.checkNotNullParameter(spaySlcsActvOrderSumOld, "<this>");
        Pq pq = c4616se.f32048b;
        if (pq != null) {
            Context context = spaySlcsActvOrderSumOld.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            str = E.f(pq, context);
        } else {
            str = null;
        }
        spaySlcsActvOrderSumOld.setVisibility(str != null ? 0 : 8);
        spaySlcsActvOrderSumOld.setText(str);
        spaySlcsActvOrderSumOld.setPaintFlags(16);
        return Unit.f71690a;
    }
}
