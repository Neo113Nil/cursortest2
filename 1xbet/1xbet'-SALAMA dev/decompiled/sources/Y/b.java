package Y;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.U0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7637b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f7636a = i7;
        this.f7637b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f7636a) {
            case 0:
                U0 u4 = (U0) this.f7637b;
                u4.f7638a = true;
                u4.notifyDataSetChanged();
                break;
            default:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.f7637b;
                if (listPopupWindow.f8397P.isShowing()) {
                    listPopupWindow.show();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f7636a) {
            case 0:
                U0 u4 = (U0) this.f7637b;
                u4.f7638a = false;
                u4.notifyDataSetInvalidated();
                break;
            default:
                ((ListPopupWindow) this.f7637b).dismiss();
                break;
        }
    }
}
