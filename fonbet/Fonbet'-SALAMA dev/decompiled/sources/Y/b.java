package Y;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.U0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7637b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f7636a = i7;
        this.f7637b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f7636a) {
            case 0:
                U0 u02 = (U0) this.f7637b;
                u02.f7638a = true;
                u02.notifyDataSetChanged();
                break;
            default:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.f7637b;
                if (listPopupWindow.f8397P.isShowing()) {
                    listPopupWindow.show();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f7636a) {
            case 0:
                U0 u02 = (U0) this.f7637b;
                u02.f7638a = false;
                u02.notifyDataSetInvalidated();
                break;
            default:
                ((ListPopupWindow) this.f7637b).dismiss();
                break;
        }
    }
}
