package P;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f5033d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f5034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f5035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f5036c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f5034a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount));
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                throw p031e1.k.c(arrayList, size);
            }
        }
        return null;
    }
}
