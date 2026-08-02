package FN;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9197b;

    public /* synthetic */ g(Function1 function1, int i11) {
        this.f9196a = i11;
        this.f9197b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9196a) {
            case 0:
                this.f9197b.invoke(view);
                break;
            default:
                this.f9197b.invoke(view);
                break;
        }
    }
}
