package E;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chickyneer.roadway.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f562d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f563a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f564b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f565c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f563a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a6 = a(viewGroup.getChildAt(childCount));
                    if (a6 != null) {
                        return a6;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
