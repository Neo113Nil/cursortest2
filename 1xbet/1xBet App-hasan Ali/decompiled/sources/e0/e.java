package e0;

import e2.C1930k;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import w0.AbstractC2540a;
import z0.z0;

/* loaded from: classes.dex */
public final class e extends m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16896l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f16897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1930k c1930k, f fVar, s sVar) {
        super(1);
        this.f16897m = sVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f16896l) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.f7175x) {
                    break;
                } else {
                    if (fVar.f16900z != null) {
                        AbstractC2540a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    fVar.f16900z = null;
                    s sVar = this.f16897m;
                    sVar.f17620k = sVar.f17620k;
                    break;
                }
            default:
                if (!((t0.m) obj).f19494z) {
                    break;
                } else {
                    this.f16897m.f17620k = false;
                    break;
                }
        }
        return z0.f21876k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar) {
        super(1);
        this.f16897m = sVar;
    }
}
