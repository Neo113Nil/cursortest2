package B90;

import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv.SelectorDataAllStepViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3160b;

    public /* synthetic */ i0(Object obj, int i11) {
        this.f3159a = i11;
        this.f3160b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3159a) {
            case 0:
                v0.h0((v0) this.f3160b);
                break;
            case 1:
                SelectorDataAllStepViewHolder.bindContent$lambda$1((SelectorDataAllStepViewHolder) this.f3160b);
                break;
            case 2:
                ViewExtKt.gone((TextAtomV2View) this.f3160b);
                break;
            default:
                io.sentry.android.replay.screenshot.c.d((io.sentry.android.replay.screenshot.c) this.f3160b);
                break;
        }
    }
}
