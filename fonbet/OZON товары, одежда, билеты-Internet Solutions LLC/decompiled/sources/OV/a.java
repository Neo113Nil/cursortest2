package OV;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomAction f20152c;

    public /* synthetic */ a(Function1 function1, AtomAction atomAction, int i11) {
        this.f20150a = i11;
        this.f20151b = function1;
        this.f20152c = atomAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20150a) {
            case 0:
                this.f20151b.invoke(this.f20152c);
                break;
            default:
                this.f20151b.invoke(this.f20152c);
                break;
        }
    }
}
