package T10;

import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26508b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f26507a = i11;
        this.f26508b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26507a) {
            case 0:
                c.b((c) this.f26508b);
                break;
            default:
                BottomNavigationController.showWithTranslationAnimation$lambda$8((BottomNavigationController) this.f26508b);
                break;
        }
    }
}
