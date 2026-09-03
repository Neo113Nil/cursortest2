package defpackage;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class PyXrjLswZZoWpho {
    public static /* bridge */ /* synthetic */ Class BD2CRjLJ8EtOqGQ() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean FTJ2XS7ULgY8(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ SegmentFinder MRfxZSx8l5UG62U(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder UEutaskTsxaI(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ Class XrorSzThrtvJ4A() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class Yey4RyhSyBRHub() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean ZvpnNpCMEWSR3(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class jJwKDtysO3vm5E() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ InsertGesture kSPEzfraxudm4i(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class o4ticBN7g1K8jE() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class uY26rxeEAFnDq() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class uypNJrpDByoB() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void yRx9jbDCTnXb3() {
    }
}
