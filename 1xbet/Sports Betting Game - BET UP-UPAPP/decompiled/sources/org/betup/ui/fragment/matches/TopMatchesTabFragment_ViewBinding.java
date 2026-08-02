package org.betup.ui.fragment.matches;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes4.dex */
public final class TopMatchesTabFragment_ViewBinding implements Unbinder {
    private TopMatchesTabFragment target;

    public TopMatchesTabFragment_ViewBinding(TopMatchesTabFragment target, View source) {
        this.target = target;
        target.swipeRefreshLayout = (SwipyRefreshLayout) Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipyRefreshLayout.class);
        target.listView = (RecyclerView) Utils.findRequiredViewAsType(source, R.id.listView, "field 'listView'", RecyclerView.class);
        target.empty = (TextView) Utils.findRequiredViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
        target.progressBar = Utils.findRequiredView(source, R.id.progressBar, "field 'progressBar'");
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TopMatchesTabFragment topMatchesTabFragment = this.target;
        if (topMatchesTabFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        topMatchesTabFragment.swipeRefreshLayout = null;
        topMatchesTabFragment.listView = null;
        topMatchesTabFragment.empty = null;
        topMatchesTabFragment.progressBar = null;
    }
}
