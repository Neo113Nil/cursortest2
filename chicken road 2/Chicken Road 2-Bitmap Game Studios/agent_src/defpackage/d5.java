package defpackage;

import android.text.PrecomputedText;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d5 {
    public static /* bridge */ /* synthetic */ boolean GiTAvmtrM6Bh8SJ(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* synthetic */ void UEutaskTsxaI() {
    }

    public static /* synthetic */ TextSelection.Request.Builder i7xAcZoXXiIt(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ TextClassificationContext.Builder oyjLVtGms9eZwJ0(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }
}
