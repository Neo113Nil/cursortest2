package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class G implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8350b;

    public /* synthetic */ G(Object obj, int i7) {
        this.f8349a = i7;
        this.f8350b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        switch (this.f8349a) {
            case 0:
                I i8 = (I) this.f8350b;
                i8.f8360W.setSelection(i7);
                AppCompatSpinner appCompatSpinner = i8.f8360W;
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i7, i8.f8357T.getItemId(i7));
                }
                i8.dismiss();
                break;
            default:
                ((SearchView) this.f8350b).o(i7);
                break;
        }
    }
}
