package Aa;

import P70.h;
import androidx.constraintlayout.widget.d;
import com.vk.id.onetap.compose.progress.CircleProgressKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import m0.O;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2State;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2View;

/* renamed from: Aa.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2375b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f683b;

    public /* synthetic */ C2375b(Object obj, int i11) {
        this.f682a = i11;
        this.f683b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CircleProgress$lambda$4$lambda$3;
        Unit bindState$lambda$1$lambda$0;
        switch (this.f682a) {
            case 0:
                CircleProgress$lambda$4$lambda$3 = CircleProgressKt.CircleProgress$lambda$4$lambda$3((O.a) this.f683b, (InterfaceC7825i0) obj);
                return CircleProgress$lambda$4$lambda$3;
            case 1:
                return h.e0((h) this.f683b, (ActionResult2) obj);
            default:
                bindState$lambda$1$lambda$0 = ActionTextItemV2View.bindState$lambda$1$lambda$0((ActionTextItemV2State) this.f683b, (d) obj);
                return bindState$lambda$1$lambda$0;
        }
    }
}
