package p000;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w92 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8470a;

    public /* synthetic */ w92(int i) {
        this.f8470a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f8470a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                p61 p61Var = x92.f8873p;
                throw null;
            default:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
