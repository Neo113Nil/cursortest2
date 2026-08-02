package Sw;

import android.view.View;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26354c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f26352a = i11;
        this.f26353b = obj;
        this.f26354c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26352a) {
            case 0:
                FreshNavigationHelper.handleArgs$lambda$0((FreshNavigationHelper) this.f26353b, (String) this.f26354c);
                break;
            default:
                CheckBoxView.increaseTouchArea$lambda$1$lambda$0((CheckBoxView) this.f26353b, (View) this.f26354c);
                break;
        }
    }
}
