package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder d = androidx.browser.browseractions.a.d("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        d.append(this.view);
        d.append("\n");
        String b = androidx.compose.runtime.changelist.d.b(d.toString(), "    values:");
        for (String str : this.values.keySet()) {
            b = b + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return b;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
