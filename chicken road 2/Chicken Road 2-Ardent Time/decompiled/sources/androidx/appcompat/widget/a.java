package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f2162a;

    public a(androidx.appcompat.widget.SearchView searchView) {
        this.f2162a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.appcompat.widget.SearchView searchView = this.f2162a;
        android.widget.ImageView imageView = searchView.t;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f2071p;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            android.view.View.OnClickListener onClickListener = searchView.f2055L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f2076v) {
            searchView.k();
            return;
        }
        if (view == searchView.f2075u) {
            searchView.o();
            return;
        }
        if (view != searchView.f2077w) {
            if (view == searchAutoComplete) {
                searchView.j();
                return;
            }
            return;
        }
        android.app.SearchableInfo searchableInfo = searchView.f0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f2052I, searchableInfo));
                }
            } else {
                android.content.Intent intent = new android.content.Intent(searchView.f2051H);
                android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
