package n1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: n1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2159B {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f18356d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f18357a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f18358b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f18359c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f18357a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a5 = a(viewGroup.getChildAt(childCount));
                if (a5 != null) {
                    return a5;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
