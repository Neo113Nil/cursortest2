package Lx;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f17182b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f17181a = i11;
        this.f17182b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17181a) {
            case 0:
                this.f17182b.invoke();
                break;
            default:
                this.f17182b.invoke();
                break;
        }
    }
}
