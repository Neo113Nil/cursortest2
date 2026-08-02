package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f44202a;

    /* renamed from: b, reason: collision with root package name */
    private final CheckedTextView f44203b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f44204c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44205d;

    private class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView.a(TrackSelectionView.this, view);
            throw null;
        }
    }

    private static final class b {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        a aVar = new a();
        new ru.ozon.android.messenger.framework.analytics.c(getResources());
        new ArrayList();
        this.f44204c = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f44202a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(ru.ozon.app.android.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(ru.ozon.app.android.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f44203b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(ru.ozon.app.android.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    static void a(TrackSelectionView trackSelectionView, View view) {
        HashMap hashMap = trackSelectionView.f44204c;
        CheckedTextView checkedTextView = trackSelectionView.f44203b;
        CheckedTextView checkedTextView2 = trackSelectionView.f44202a;
        if (view == checkedTextView2) {
            trackSelectionView.f44205d = true;
            hashMap.clear();
        } else {
            if (view != checkedTextView) {
                trackSelectionView.f44205d = false;
                Object tag = view.getTag();
                tag.getClass();
                throw null;
            }
            trackSelectionView.f44205d = false;
            hashMap.clear();
        }
        checkedTextView2.setChecked(trackSelectionView.f44205d);
        checkedTextView.setChecked(!trackSelectionView.f44205d && hashMap.isEmpty());
        throw null;
    }
}
