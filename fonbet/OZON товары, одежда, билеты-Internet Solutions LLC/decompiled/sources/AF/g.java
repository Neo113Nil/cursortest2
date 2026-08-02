package AF;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.q;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModelImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class g implements qc.g, OnSuccessListener, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f620b;

    public /* synthetic */ g(Function1 function1, int i11) {
        this.f619a = i11;
        this.f620b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f619a) {
            case 0:
                this.f620b.invoke(obj);
                break;
            case 1:
            default:
                this.f620b.invoke(obj);
                break;
            case 2:
                this.f620b.invoke(obj);
                break;
            case 3:
                this.f620b.invoke(obj);
                break;
            case 4:
                this.f620b.invoke(obj);
                break;
            case 5:
                this.f620b.invoke(obj);
                break;
            case 6:
                this.f620b.invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i11 = HiddenActivity.f42443c;
        Function1 tmp0 = this.f620b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean bindInitial$lambda$0;
        bindInitial$lambda$0 = SearchSheetViewModelImpl.bindInitial$lambda$0(this.f620b, obj);
        return bindInitial$lambda$0;
    }
}
