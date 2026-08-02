package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTutorialThirdPageBinding implements ViewBinding {
    public final ImageView cancel;
    public final FloatingActionButton fab;
    public final TextView favCount;
    public final TextView footer;
    public final ListView leaguesListView;
    public final ProgressBar progress;
    private final RelativeLayout rootView;
    public final TextView save;
    public final EditText search;
    public final Spinner spinnerSecondPage;

    private FragmentTutorialThirdPageBinding(RelativeLayout rootView, ImageView cancel, FloatingActionButton fab, TextView favCount, TextView footer, ListView leaguesListView, ProgressBar progress, TextView save, EditText search, Spinner spinnerSecondPage) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.fab = fab;
        this.favCount = favCount;
        this.footer = footer;
        this.leaguesListView = leaguesListView;
        this.progress = progress;
        this.save = save;
        this.search = search;
        this.spinnerSecondPage = spinnerSecondPage;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTutorialThirdPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTutorialThirdPageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tutorial_third_page, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTutorialThirdPageBinding bind(View rootView) {
        int i = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (imageView != null) {
            i = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.fab);
            if (floatingActionButton != null) {
                i = R.id.favCount;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.favCount);
                if (textView != null) {
                    i = R.id.footer;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.footer);
                    if (textView2 != null) {
                        i = R.id.leaguesListView;
                        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.leaguesListView);
                        if (listView != null) {
                            i = R.id.progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                            if (progressBar != null) {
                                i = R.id.save;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.save);
                                if (textView3 != null) {
                                    i = R.id.search;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search);
                                    if (editText != null) {
                                        i = R.id.spinnerSecondPage;
                                        Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, R.id.spinnerSecondPage);
                                        if (spinner != null) {
                                            return new FragmentTutorialThirdPageBinding((RelativeLayout) rootView, imageView, floatingActionButton, textView, textView2, listView, progressBar, textView3, editText, spinner);
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
