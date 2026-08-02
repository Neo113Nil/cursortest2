package IC;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f12089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomAction f12090c;

    public /* synthetic */ a(Function1 function1, AtomAction atomAction, int i11) {
        this.f12088a = i11;
        this.f12089b = function1;
        this.f12090c = atomAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12088a) {
            case 0:
                this.f12089b.invoke(this.f12090c);
                break;
            default:
                this.f12089b.invoke(this.f12090c);
                break;
        }
    }
}
