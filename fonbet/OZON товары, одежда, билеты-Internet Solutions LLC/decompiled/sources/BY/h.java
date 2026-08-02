package BY;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements qc.g, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3316b;

    public /* synthetic */ h(Function1 function1, int i11) {
        this.f3315a = i11;
        this.f3316b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3315a) {
            case 0:
                this.f3316b.invoke(obj);
                break;
            case 1:
                this.f3316b.invoke(obj);
                break;
            case 2:
            default:
                this.f3316b.invoke(obj);
                break;
            case 3:
                this.f3316b.invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i11 = HiddenActivity.f42443c;
        Function1 tmp0 = this.f3316b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
