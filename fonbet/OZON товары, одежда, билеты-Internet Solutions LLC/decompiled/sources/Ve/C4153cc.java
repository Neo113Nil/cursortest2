package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.cc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4153cc implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f30793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f30794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f30795c;

    public C4153cc(C4400l0 c4400l0, Pm pm, Context context) {
        this.f30793a = c4400l0;
        this.f30794b = pm;
        this.f30795c = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        String string;
        Long l11;
        C4481nn c4481nn = (C4481nn) obj;
        SPayTextView observeViewModel$lambda$17$lambda$12$lambda$11 = this.f30793a.f31489g;
        observeViewModel$lambda$17$lambda$12$lambda$11.setClickable(c4481nn.f31682e);
        observeViewModel$lambda$17$lambda$12$lambda$11.setFocusable(c4481nn.f31682e);
        Intrinsics.checkNotNullExpressionValue(observeViewModel$lambda$17$lambda$12$lambda$11, "observeViewModel$lambda$17$lambda$12$lambda$11");
        Pm pm = this.f30794b;
        pm.getClass();
        int i11 = c4481nn.f31678a;
        Integer num = c4481nn.f31679b;
        if (num == null || (l11 = c4481nn.f31681d) == null) {
            string = pm.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "{\n            getString(…nState.textRes)\n        }");
        } else {
            int longValue = (int) (l11.longValue() / 1000);
            Resources resources = observeViewModel$lambda$17$lambda$12$lambda$11.getResources();
            Intrinsics.f(num);
            String quantityString = resources.getQuantityString(num.intValue(), longValue, Integer.valueOf(longValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…sRes!!, seconds, seconds)");
            string = pm.getString(i11, quantityString);
            Intrinsics.checkNotNullExpressionValue(string, "{\n            val second…xtRes, plurals)\n        }");
        }
        observeViewModel$lambda$17$lambda$12$lambda$11.setText(string);
        observeViewModel$lambda$17$lambda$12$lambda$11.setTextColor(androidx.core.content.a.getColor(this.f30795c, c4481nn.f31680c));
        return Unit.f71690a;
    }
}
