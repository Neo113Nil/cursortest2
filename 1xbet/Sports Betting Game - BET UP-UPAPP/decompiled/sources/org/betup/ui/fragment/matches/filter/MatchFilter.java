package org.betup.ui.fragment.matches.filter;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import org.betup.R;
import org.betup.ui.FilterController;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes4.dex */
public class MatchFilter implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
    private Activity activity;
    private FilterController.MatchesFilter current;
    private OvalFloatingButton fab;
    private MatchFilterSelectedListener listener;

    public interface MatchFilterSelectedListener {
        void filterSelected(FilterController.MatchesFilter matchFilter);
    }

    public MatchFilter(Activity activity, RecyclerView recyclerView, OvalFloatingButton fab, MatchFilterSelectedListener listener, FilterController.MatchesFilter current) {
        this.activity = activity;
        this.fab = fab;
        this.listener = listener;
        this.current = current;
        fab.setTitle(activity.getString(current.getStrRes()));
        fab.setOnClickListener(this);
        fab.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(this.activity, this.fab);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.getMenuInflater().inflate(R.menu.menu_scheduled, popupMenu.getMenu());
        popupMenu.show();
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        FilterController.MatchesFilter matchesFilter = FilterController.MatchesFilter.ALL;
        switch (item.getItemId()) {
            case R.id.menu_12_hours /* 2131362903 */:
                matchesFilter = FilterController.MatchesFilter.TWELVE_HOURS;
                break;
            case R.id.menu_1_hour /* 2131362904 */:
                matchesFilter = FilterController.MatchesFilter.ONE_HOUR;
                break;
            case R.id.menu_24_hours /* 2131362905 */:
                matchesFilter = FilterController.MatchesFilter.ONE_DAY;
                break;
            case R.id.menu_3_hours /* 2131362906 */:
                matchesFilter = FilterController.MatchesFilter.THREE_HOURS;
                break;
            case R.id.menu_6_hours /* 2131362907 */:
                matchesFilter = FilterController.MatchesFilter.SIX_HOURS;
                break;
            case R.id.menu_live /* 2131362908 */:
                matchesFilter = FilterController.MatchesFilter.LIVE;
                break;
        }
        if (this.current != matchesFilter) {
            this.listener.filterSelected(matchesFilter);
        }
        this.current = matchesFilter;
        this.fab.setTitle(item.getTitle().toString());
        return false;
    }
}
