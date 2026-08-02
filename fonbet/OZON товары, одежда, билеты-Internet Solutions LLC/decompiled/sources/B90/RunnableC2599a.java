package B90;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1mSDK;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.web.webview.client.chrome.OzonWebChromeClient;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v3.C10201C;

/* renamed from: B90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2599a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3132b;

    public /* synthetic */ RunnableC2599a(Object obj, int i11) {
        this.f3131a = i11;
        this.f3132b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3131a) {
            case 0:
                FintechPreferencesFragment.i0((FintechPreferencesFragment) this.f3132b);
                break;
            case 1:
                v0.j0((v0) this.f3132b);
                break;
            case 2:
                ViewExtKt.gone((View) this.f3132b);
                break;
            case 3:
                OzonWebChromeClient.onFocusChangedListener$lambda$2$lambda$1((OzonWebChromeClient) this.f3132b);
                break;
            case 4:
                Q1.N.i((Q1.N) this.f3132b);
                break;
            case 5:
                AFb1tSDK.valueOf((AFd1mSDK) this.f3132b);
                break;
            case 6:
                ((Function0) this.f3132b).invoke();
                break;
            case 7:
                ((AppCompatEditText) this.f3132b).clearFocus();
                break;
            default:
                C10201C.a((C10201C) this.f3132b);
                break;
        }
    }
}
