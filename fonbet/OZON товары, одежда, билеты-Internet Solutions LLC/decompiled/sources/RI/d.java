package RI;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3Holder;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24869b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f24868a = i11;
        this.f24869b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24868a) {
            case 0:
                ((Function0) this.f24869b).invoke();
                break;
            default:
                ButtonV3Holder._init_$lambda$1((ButtonV3Holder) this.f24869b, view);
                break;
        }
    }
}
