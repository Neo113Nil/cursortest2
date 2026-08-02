package androidx.transition;

/* loaded from: classes3.dex */
public class TransitionValues {
    public android.view.View view;
    public final java.util.Map<java.lang.String, java.lang.Object> values = new java.util.HashMap();
    final java.util.ArrayList<androidx.transition.Transition> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

    @java.lang.Deprecated
    public TransitionValues() {
    }

    public TransitionValues(android.view.View view) {
        this.view = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.transition.TransitionValues)) {
            return false;
        }
        androidx.transition.TransitionValues transitionValues = (androidx.transition.TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionValues@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(":\n");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.view);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        java.lang.String obj3 = sb3.toString();
        for (java.lang.String str : this.values.keySet()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(str);
            sb4.append(": ");
            sb4.append(this.values.get(str));
            sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            obj3 = sb4.toString();
        }
        return obj3;
    }
}
