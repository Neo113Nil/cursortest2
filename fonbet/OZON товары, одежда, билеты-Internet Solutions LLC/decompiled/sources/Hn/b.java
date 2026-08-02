package Hn;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.cart.domain.network.CartSyncService;
import ru.ozon.uni.android.component.sheet.SheetDialog;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements o, D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11217a;

    public /* synthetic */ b(Object obj) {
        this.f11217a = obj;
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C executeCartUpdateRequests$lambda$7;
        executeCartUpdateRequests$lambda$7 = CartSyncService.executeCartUpdateRequests$lambda$7((Function1) this.f11217a, obj);
        return executeCartUpdateRequests$lambda$7;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onAttachedToWindow$lambda$4$lambda$3;
        onAttachedToWindow$lambda$4$lambda$3 = SheetDialog.onAttachedToWindow$lambda$4$lambda$3((SheetDialog) this.f11217a, view, c5353y0);
        return onAttachedToWindow$lambda$4$lambda$3;
    }
}
