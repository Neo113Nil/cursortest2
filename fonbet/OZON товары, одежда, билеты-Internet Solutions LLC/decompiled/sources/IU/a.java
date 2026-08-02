package IU;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f12104b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f12103a = i11;
        this.f12104b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12103a) {
            case 0:
                this.f12104b.invoke();
                break;
            default:
                this.f12104b.invoke();
                break;
        }
    }
}
