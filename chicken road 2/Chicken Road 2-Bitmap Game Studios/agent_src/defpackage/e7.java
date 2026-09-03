package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import okhttp3.EventListener;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements TextInclusionStrategy, PoolingContainerListener, VisualTransformation, EventListener.Factory {
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ e7(int i) {
        this.yzPsTade5rL7D3 = i;
    }

    public static /* synthetic */ void oyjLVtGms9eZwJ0(String str, int i) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void ra306ClFT3HT(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText hRNgd2zGCE5kj(AnnotatedString annotatedString) {
        return new TransformedText(annotatedString, OffsetMapping.Companion.yzPsTade5rL7D3);
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean yzPsTade5rL7D3(Rect rect, Rect rect2) {
        switch (this.yzPsTade5rL7D3) {
            case 2:
                return rect.Uo5pffGf8LUU(rect2);
            default:
                return rect2.yzPsTade5rL7D3(rect.ra306ClFT3HT());
        }
    }
}
