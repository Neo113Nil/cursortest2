package Z0;

import A0.F;
import android.view.MotionEvent;
import kotlin.jvm.internal.z;
import z0.n0;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6267l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f6268m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, int i) {
        super(1);
        this.f6267l = i;
        this.f6268m = qVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.f6267l) {
            case 0:
                n0 n0Var = (n0) obj;
                F f = n0Var instanceof F ? (F) n0Var : null;
                q qVar = this.f6268m;
                if (f != null) {
                    f.getAndroidViewsHandler$ui_release().removeViewInLayout(qVar);
                    z.a(f.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(f.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(qVar));
                    qVar.setImportantForAccessibility(0);
                }
                qVar.removeAllViewsInLayout();
                return W3.o.f6046a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                q qVar2 = this.f6268m;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = qVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = qVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
