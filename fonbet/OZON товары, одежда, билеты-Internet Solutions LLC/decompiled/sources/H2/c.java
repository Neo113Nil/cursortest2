package H2;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CRepository;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements OnSuccessListener, g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10522b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f10521a = i11;
        this.f10522b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f10521a) {
            case 1:
                this.f10522b.invoke(obj);
                break;
            case 2:
                this.f10522b.invoke(obj);
                break;
            case 3:
                this.f10522b.invoke(obj);
                break;
            case 4:
                this.f10522b.invoke(obj);
                break;
            case 5:
                this.f10522b.invoke(obj);
                break;
            case 6:
                this.f10522b.invoke(obj);
                break;
            case 7:
            default:
                this.f10522b.invoke(obj);
                break;
            case 8:
                this.f10522b.invoke(obj);
                break;
            case 9:
                this.f10522b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        UpdateOrderDO updateOrder$lambda$1$lambda$0;
        updateOrder$lambda$1$lambda$0 = UpdateOrderC2CRepository.updateOrder$lambda$1$lambda$0(this.f10522b, obj);
        return updateOrder$lambda$1$lambda$0;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i11 = HiddenActivity.f42443c;
        Function1 tmp0 = this.f10522b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
