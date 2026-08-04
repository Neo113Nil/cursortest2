package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8362a;

    public J0(SearchView searchView) {
        this.f8362a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f8362a;
        ImageView imageView = searchView.f8420K;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f8416G;
        if (view == imageView) {
            searchView.x(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f8437f0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f8422M) {
            searchView.n();
            return;
        }
        if (view == searchView.f8421L) {
            searchView.r();
            return;
        }
        if (view != searchView.f8423N) {
            if (view == searchAutoComplete) {
                searchView.m();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f8450s0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.l(searchView.c0, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f8434b0);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
