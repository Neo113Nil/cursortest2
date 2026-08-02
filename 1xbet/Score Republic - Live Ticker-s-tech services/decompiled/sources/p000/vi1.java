package p000;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi1 extends g70 implements h60 {

    /* JADX INFO: renamed from: q */
    public static final vi1 f8197q = new vi1(1, zi1.class, "bind", "bind(Landroid/view/View;)Llive/football/scorerepublic/databinding/WebviewFragmentBinding;", 0);

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        View viewFindViewById;
        View viewFindViewById2;
        View view = (View) obj;
        view.getClass();
        boolean z = view instanceof ViewGroup;
        int i = 0;
        int i2 = R.id.loadingProgress;
        if (!z) {
            viewFindViewById = null;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                viewFindViewById = null;
                break;
            }
            viewFindViewById = viewGroup.getChildAt(i3).findViewById(R.id.loadingProgress);
            if (viewFindViewById != null) {
                break;
            }
            i3++;
        }
        ProgressBar progressBar = (ProgressBar) viewFindViewById;
        if (progressBar != null) {
            i2 = R.id.webView;
            if (!z) {
                viewFindViewById2 = null;
                break;
            }
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            while (true) {
                if (i >= childCount2) {
                    viewFindViewById2 = null;
                    break;
                }
                viewFindViewById2 = viewGroup2.getChildAt(i).findViewById(R.id.webView);
                if (viewFindViewById2 != null) {
                    break;
                }
                i++;
            }
            WebView webView = (WebView) viewFindViewById2;
            if (webView != null) {
                return new zi1((FrameLayout) view, progressBar, webView);
            }
        }
        C0270h1.m2192h("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
        return null;
    }
}
