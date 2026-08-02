package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.s;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class B<S> extends Fragment {
    public final LinkedHashSet<A<S>> a = new LinkedHashSet<>();

    public void e(s.c cVar) {
        this.a.add(cVar);
    }
}
