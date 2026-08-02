package androidx.fragment.app;

import B0.A0;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ComponentCallbacksC5392m> f42959a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, O> f42960b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f42961c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private J f42962d;

    P() {
    }

    final void A(@NonNull J j11) {
        this.f42962d = j11;
    }

    final Bundle B(Bundle bundle, @NonNull String str) {
        HashMap<String, Bundle> hashMap = this.f42961c;
        return bundle != null ? hashMap.put(str, bundle) : hashMap.remove(str);
    }

    final void a(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (this.f42959a.contains(componentCallbacksC5392m)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC5392m);
        }
        synchronized (this.f42959a) {
            this.f42959a.add(componentCallbacksC5392m);
        }
        componentCallbacksC5392m.mAdded = true;
    }

    final void b() {
        this.f42960b.values().removeAll(Collections.singleton(null));
    }

    final boolean c(@NonNull String str) {
        return this.f42960b.get(str) != null;
    }

    final void d(int i11) {
        for (O o11 : this.f42960b.values()) {
            if (o11 != null) {
                o11.r(i11);
            }
        }
    }

    final void e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String e11 = U7.d.e(str, "    ");
        HashMap<String, O> hashMap = this.f42960b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o11 : hashMap.values()) {
                printWriter.print(str);
                if (o11 != null) {
                    ComponentCallbacksC5392m k11 = o11.k();
                    printWriter.println(k11);
                    k11.dump(e11, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<ComponentCallbacksC5392m> arrayList = this.f42959a;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size; i11++) {
                ComponentCallbacksC5392m componentCallbacksC5392m = arrayList.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC5392m.toString());
            }
        }
    }

    final ComponentCallbacksC5392m f(@NonNull String str) {
        O o11 = this.f42960b.get(str);
        if (o11 != null) {
            return o11.k();
        }
        return null;
    }

    final ComponentCallbacksC5392m g(int i11) {
        ArrayList<ComponentCallbacksC5392m> arrayList = this.f42959a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ComponentCallbacksC5392m componentCallbacksC5392m = arrayList.get(size);
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.mFragmentId == i11) {
                return componentCallbacksC5392m;
            }
        }
        for (O o11 : this.f42960b.values()) {
            if (o11 != null) {
                ComponentCallbacksC5392m k11 = o11.k();
                if (k11.mFragmentId == i11) {
                    return k11;
                }
            }
        }
        return null;
    }

    final ComponentCallbacksC5392m h(String str) {
        if (str != null) {
            ArrayList<ComponentCallbacksC5392m> arrayList = this.f42959a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ComponentCallbacksC5392m componentCallbacksC5392m = arrayList.get(size);
                if (componentCallbacksC5392m != null && str.equals(componentCallbacksC5392m.mTag)) {
                    return componentCallbacksC5392m;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (O o11 : this.f42960b.values()) {
            if (o11 != null) {
                ComponentCallbacksC5392m k11 = o11.k();
                if (str.equals(k11.mTag)) {
                    return k11;
                }
            }
        }
        return null;
    }

    final ComponentCallbacksC5392m i(@NonNull String str) {
        ComponentCallbacksC5392m findFragmentByWho;
        for (O o11 : this.f42960b.values()) {
            if (o11 != null && (findFragmentByWho = o11.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    final int j(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC5392m.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList<ComponentCallbacksC5392m> arrayList = this.f42959a;
        int indexOf = arrayList.indexOf(componentCallbacksC5392m);
        for (int i11 = indexOf - 1; i11 >= 0; i11--) {
            ComponentCallbacksC5392m componentCallbacksC5392m2 = arrayList.get(i11);
            if (componentCallbacksC5392m2.mContainer == viewGroup && (view2 = componentCallbacksC5392m2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC5392m componentCallbacksC5392m3 = arrayList.get(indexOf);
            if (componentCallbacksC5392m3.mContainer == viewGroup && (view = componentCallbacksC5392m3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (O o11 : this.f42960b.values()) {
            if (o11 != null) {
                arrayList.add(o11);
            }
        }
        return arrayList;
    }

    @NonNull
    final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (O o11 : this.f42960b.values()) {
            if (o11 != null) {
                arrayList.add(o11.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    final HashMap<String, Bundle> m() {
        return this.f42961c;
    }

    final O n(@NonNull String str) {
        return this.f42960b.get(str);
    }

    @NonNull
    final List<ComponentCallbacksC5392m> o() {
        ArrayList arrayList;
        if (this.f42959a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f42959a) {
            arrayList = new ArrayList(this.f42959a);
        }
        return arrayList;
    }

    final J p() {
        return this.f42962d;
    }

    final Bundle q(@NonNull String str) {
        return this.f42961c.get(str);
    }

    final void r(@NonNull O o11) {
        ComponentCallbacksC5392m k11 = o11.k();
        if (c(k11.mWho)) {
            return;
        }
        this.f42960b.put(k11.mWho, o11);
        if (k11.mRetainInstanceChangedWhileDetached) {
            if (k11.mRetainInstance) {
                this.f42962d.d0(k11);
            } else {
                this.f42962d.n0(k11);
            }
            k11.mRetainInstanceChangedWhileDetached = false;
        }
        if (G.D0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k11);
        }
    }

    final void s(@NonNull O o11) {
        ComponentCallbacksC5392m k11 = o11.k();
        if (k11.mRetainInstance) {
            this.f42962d.n0(k11);
        }
        HashMap<String, O> hashMap = this.f42960b;
        if (hashMap.get(k11.mWho) == o11 && hashMap.put(k11.mWho, null) != null && G.D0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k11);
        }
    }

    final void t() {
        HashMap<String, O> hashMap;
        Iterator<ComponentCallbacksC5392m> it = this.f42959a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f42960b;
            if (!hasNext) {
                break;
            }
            O o11 = hashMap.get(it.next().mWho);
            if (o11 != null) {
                o11.l();
            }
        }
        for (O o12 : hashMap.values()) {
            if (o12 != null) {
                o12.l();
                ComponentCallbacksC5392m k11 = o12.k();
                if (k11.mRemoving && !k11.isInBackStack()) {
                    if (k11.mBeingSaved && !this.f42961c.containsKey(k11.mWho)) {
                        B(o12.p(), k11.mWho);
                    }
                    s(o12);
                }
            }
        }
    }

    final void u(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        synchronized (this.f42959a) {
            this.f42959a.remove(componentCallbacksC5392m);
        }
        componentCallbacksC5392m.mAdded = false;
    }

    final void v() {
        this.f42960b.clear();
    }

    final void w(ArrayList arrayList) {
        this.f42959a.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC5392m f7 = f(str);
                if (f7 == null) {
                    throw new IllegalStateException(A0.b("No instantiated fragment for (", str, ")"));
                }
                if (G.D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f7);
                }
                a(f7);
            }
        }
    }

    final void x(@NonNull HashMap<String, Bundle> hashMap) {
        HashMap<String, Bundle> hashMap2 = this.f42961c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
    }

    @NonNull
    final ArrayList<String> y() {
        HashMap<String, O> hashMap = this.f42960b;
        ArrayList<String> arrayList = new ArrayList<>(hashMap.size());
        for (O o11 : hashMap.values()) {
            if (o11 != null) {
                ComponentCallbacksC5392m k11 = o11.k();
                B(o11.p(), k11.mWho);
                arrayList.add(k11.mWho);
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k11 + ": " + k11.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    final ArrayList<String> z() {
        synchronized (this.f42959a) {
            try {
                if (this.f42959a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f42959a.size());
                Iterator<ComponentCallbacksC5392m> it = this.f42959a.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC5392m next = it.next();
                    arrayList.add(next.mWho);
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
