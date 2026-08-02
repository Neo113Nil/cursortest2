package Au;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f1283b;

    public /* synthetic */ d(Function0 function0, int i11) {
        this.f1282a = i11;
        this.f1283b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1282a) {
            case 0:
                this.f1283b.invoke();
                break;
            default:
                this.f1283b.invoke();
                break;
        }
    }
}
