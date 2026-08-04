package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class X extends W {
    @Override // androidx.appcompat.widget.W, androidx.appcompat.widget.Y
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.Y
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
