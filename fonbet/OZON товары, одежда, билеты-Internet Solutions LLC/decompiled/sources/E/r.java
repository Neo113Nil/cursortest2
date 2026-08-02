package E;

import C.f0;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;
import rm0.C9318c;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity;

/* loaded from: classes8.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6917b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f6916a = i11;
        this.f6917b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6916a) {
            case 0:
                androidx.camera.core.u uVar = (androidx.camera.core.u) this.f6917b;
                if (uVar != null) {
                    uVar.j();
                    break;
                }
                break;
            case 1:
                ((f0) this.f6917b).close();
                break;
            case 2:
                ((Function0) this.f6917b).invoke();
                break;
            case 3:
                androidx.work.impl.background.systemalarm.e.b((androidx.work.impl.background.systemalarm.e) this.f6917b);
                break;
            case 4:
                PlayStoriesActivity.onConfigurationChanged$lambda$6$lambda$5((ViewPager2) this.f6917b);
                break;
            default:
                C9318c.a((C9318c) this.f6917b);
                break;
        }
    }
}
