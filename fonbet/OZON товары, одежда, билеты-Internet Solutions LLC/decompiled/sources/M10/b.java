package M10;

import android.content.Context;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.r;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f17244a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f17245b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f17246c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f17247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, g gVar, boolean z11, int i11, Context context) {
        super(context);
        this.f17244a = cVar;
        this.f17245b = gVar;
        this.f17246c = z11;
        this.f17247d = i11;
    }

    @Override // androidx.recyclerview.widget.r
    public final int calculateDtToFit(int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17 = i13 - i11;
        this.f17244a.getClass();
        if (this.f17246c) {
            Context context = this.f17245b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "<this>");
            i16 = context.getResources().getDimensionPixelSize(R.dimen.composerToolbarHeightDefault);
        } else {
            i16 = 0;
        }
        return i17 + i16 + this.f17247d;
    }

    @Override // androidx.recyclerview.widget.r
    protected final int getVerticalSnapPreference() {
        return -1;
    }
}
