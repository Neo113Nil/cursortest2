package IR;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f12102b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f12101a = i11;
        this.f12102b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12101a) {
            case 0:
                this.f12102b.invoke();
                break;
            default:
                this.f12102b.invoke();
                break;
        }
    }
}
