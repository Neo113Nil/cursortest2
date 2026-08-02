package androidx.appcompat.app;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5053c extends ArrayAdapter<CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertController.RecycleListView f37110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AlertController.b f37111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5053c(AlertController.b bVar, ContextThemeWrapper contextThemeWrapper, int i11, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(contextThemeWrapper, i11, R.id.text1, charSequenceArr);
        this.f37111b = bVar;
        this.f37110a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i11, view, viewGroup);
        boolean[] zArr = this.f37111b.f37045u;
        if (zArr != null && zArr[i11]) {
            this.f37110a.setItemChecked(i11, true);
        }
        return view2;
    }
}
