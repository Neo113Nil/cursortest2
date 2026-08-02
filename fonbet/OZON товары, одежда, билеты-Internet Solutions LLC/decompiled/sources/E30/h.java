package E30;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public interface h {

    public static final class a {
        private static LinearLayout a(ViewGroup viewGroup, Window window, int i11, int i12) {
            Context context;
            if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                context = window != null ? window.getContext() : null;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutTransition(new LayoutTransition());
            linearLayout.setGravity(i12);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            linearLayout.setId(i11);
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            if (viewGroup != null) {
                if (!viewGroup.getFitsSystemWindows()) {
                    linearLayout.setPadding(0, L30.j.d(), 0, L30.j.c());
                } else if (viewGroup.getPaddingTop() == 0) {
                    linearLayout.setPadding(0, L30.j.d(), 0, 0);
                }
            }
            if (window != null) {
                linearLayout.setPadding(0, L30.j.d(), 0, L30.j.c());
            }
            if (viewGroup != null) {
                viewGroup.addView(linearLayout);
            }
            if (window != null) {
                window.addContentView(linearLayout, new ViewGroup.MarginLayoutParams(-1, -1));
            }
            return linearLayout;
        }

        public static LinearLayout b(ViewGroup viewGroup) {
            LinearLayout linearLayout = viewGroup != null ? (LinearLayout) viewGroup.findViewById(R.id.snacks_holder_fragment_bottom) : null;
            return (linearLayout != null || viewGroup == null) ? linearLayout : a(viewGroup, null, R.id.snacks_holder_fragment_bottom, 81);
        }

        public static LinearLayout c(Window window) {
            LinearLayout linearLayout = window != null ? (LinearLayout) window.findViewById(R.id.snacks_holder_window_bottom) : null;
            return (linearLayout != null || window == null) ? linearLayout : a(null, window, R.id.snacks_holder_window_bottom, 81);
        }

        public static LinearLayout d(ViewGroup viewGroup) {
            LinearLayout linearLayout = viewGroup != null ? (LinearLayout) viewGroup.findViewById(R.id.snacks_holder_fragment_top) : null;
            return (linearLayout != null || viewGroup == null) ? linearLayout : a(viewGroup, null, R.id.snacks_holder_fragment_top, 49);
        }

        public static LinearLayout e(Window window) {
            LinearLayout linearLayout = window != null ? (LinearLayout) window.findViewById(R.id.snacks_holder_window_top) : null;
            return (linearLayout != null || window == null) ? linearLayout : a(null, window, R.id.snacks_holder_window_top, 49);
        }
    }

    LinearLayout provideFragmentBottom();

    LinearLayout provideFragmentTop();

    LinearLayout provideWindowBottom();

    LinearLayout provideWindowTop();
}
