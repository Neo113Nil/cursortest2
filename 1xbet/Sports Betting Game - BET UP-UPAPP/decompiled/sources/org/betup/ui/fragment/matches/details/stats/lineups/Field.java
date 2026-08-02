package org.betup.ui.fragment.matches.details.stats.lineups;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.matches.stats.lineups.LineupState;
import org.betup.model.remote.entity.matches.stats.lineups.LineupsResponsePlayerModel;

/* loaded from: classes4.dex */
public class Field {
    private Context context;
    private LinearLayout field;
    private LayoutInflater inflater;
    private List<LineupsResponsePlayerModel> players;

    public Field(LinearLayout field, List<LineupsResponsePlayerModel> players) {
        this.field = field;
        Context context = field.getContext();
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.players = players;
    }

    public void clear() {
        this.field.removeAllViews();
    }

    private void prepareSorted() {
        ArrayList arrayList = new ArrayList();
        for (LineupsResponsePlayerModel lineupsResponsePlayerModel : this.players) {
            if (lineupsResponsePlayerModel.getLineupState() == LineupState.STARTING) {
                arrayList.add(lineupsResponsePlayerModel);
            }
        }
        this.players = arrayList;
        Collections.sort(arrayList, new Comparator<LineupsResponsePlayerModel>() { // from class: org.betup.ui.fragment.matches.details.stats.lineups.Field.1
            @Override // java.util.Comparator
            public int compare(LineupsResponsePlayerModel lineupsResponsePlayerModel2, LineupsResponsePlayerModel t1) {
                int compareTo = Integer.valueOf(lineupsResponsePlayerModel2.getLine()).compareTo(Integer.valueOf(t1.getLine()));
                return compareTo == 0 ? Integer.valueOf(lineupsResponsePlayerModel2.getPosition()).compareTo(Integer.valueOf(t1.getPosition())) : compareTo;
            }
        });
    }

    public void fill() {
        prepareSorted();
        LinearLayout createNewLine = createNewLine();
        this.field.addView(createNewLine);
        int i = 0;
        for (LineupsResponsePlayerModel lineupsResponsePlayerModel : this.players) {
            Log.d("LINEUPS", "ADDING PLAYER " + lineupsResponsePlayerModel.getShortName() + " AT " + lineupsResponsePlayerModel.getLine() + "x" + lineupsResponsePlayerModel.getPosition());
            if (lineupsResponsePlayerModel.getLine() > i) {
                Log.d("LINEUPS", "CREATING NEW LINE = " + lineupsResponsePlayerModel.getLine());
                createNewLine = createNewLine();
                this.field.addView(createNewLine, 0);
                i = lineupsResponsePlayerModel.getLine();
            }
            createNewLine.addView(createNewPlayer(createNewLine, lineupsResponsePlayerModel));
        }
    }

    private View createNewPlayer(ViewGroup parent, LineupsResponsePlayerModel player) {
        View inflate = this.inflater.inflate(R.layout.item_player_lineup, parent, false);
        ((TextView) inflate.findViewById(R.id.number)).setText(String.valueOf(player.getNumber()));
        ((TextView) inflate.findViewById(R.id.name)).setText(player.getShortName());
        return inflate;
    }

    private LinearLayout createNewLine() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }
}
