package Eq;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f8145b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f8144a = i11;
        this.f8145b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8144a) {
            case 0:
                this.f8145b.invoke();
                break;
            default:
                this.f8145b.invoke();
                break;
        }
    }
}
