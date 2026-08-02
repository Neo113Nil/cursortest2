package G;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.TopicsManager;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* synthetic */ void A() {
        new DeletionRequest.Builder();
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder j(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder k(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture l(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture m(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return TopicsManager.class;
    }
}
