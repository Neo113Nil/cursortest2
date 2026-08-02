package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentMatchMessagingBinding implements ViewBinding {
    public final ImageView awayTeamIcon;
    public final TextView awayTeamName;
    public final ConstraintLayout container;
    public final TextView date;
    public final View dividerTop;
    public final ImageView homeTeamIcon;
    public final TextView homeTeamName;
    public final RecyclerView list;
    public final MessageTypeBoxBinding messageBox;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final AppCompatTextView score;
    public final SwipyRefreshLayout swipeRefreshLayout;

    private FragmentMatchMessagingBinding(ConstraintLayout rootView, ImageView awayTeamIcon, TextView awayTeamName, ConstraintLayout container, TextView date, View dividerTop, ImageView homeTeamIcon, TextView homeTeamName, RecyclerView list, MessageTypeBoxBinding messageBox, ProgressBar progress, AppCompatTextView score, SwipyRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.awayTeamIcon = awayTeamIcon;
        this.awayTeamName = awayTeamName;
        this.container = container;
        this.date = date;
        this.dividerTop = dividerTop;
        this.homeTeamIcon = homeTeamIcon;
        this.homeTeamName = homeTeamName;
        this.list = list;
        this.messageBox = messageBox;
        this.progress = progress;
        this.score = score;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchMessagingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMatchMessagingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_match_messaging, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchMessagingBinding bind(View rootView) {
        int i = R.id.awayTeamIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayTeamIcon);
        if (imageView != null) {
            i = R.id.awayTeamName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeamName);
            if (textView != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.date;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                    if (textView2 != null) {
                        i = R.id.dividerTop;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dividerTop);
                        if (findChildViewById != null) {
                            i = R.id.homeTeamIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeTeamIcon);
                            if (imageView2 != null) {
                                i = R.id.homeTeamName;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeamName);
                                if (textView3 != null) {
                                    i = R.id.list;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
                                    if (recyclerView != null) {
                                        i = R.id.message_box;
                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.message_box);
                                        if (findChildViewById2 != null) {
                                            MessageTypeBoxBinding bind = MessageTypeBoxBinding.bind(findChildViewById2);
                                            i = R.id.progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                            if (progressBar != null) {
                                                i = R.id.score;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.score);
                                                if (appCompatTextView != null) {
                                                    i = R.id.swipeRefreshLayout;
                                                    SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                                                    if (swipyRefreshLayout != null) {
                                                        return new FragmentMatchMessagingBinding((ConstraintLayout) rootView, imageView, textView, constraintLayout, textView2, findChildViewById, imageView2, textView3, recyclerView, bind, progressBar, appCompatTextView, swipyRefreshLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
