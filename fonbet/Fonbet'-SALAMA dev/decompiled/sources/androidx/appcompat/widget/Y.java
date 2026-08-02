package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class Y {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) Z.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
