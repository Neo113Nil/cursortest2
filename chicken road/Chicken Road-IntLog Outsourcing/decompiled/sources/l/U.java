package l;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10818a;

    public U(SearchView searchView) {
        this.f10818a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f10818a.o();
        return true;
    }
}
