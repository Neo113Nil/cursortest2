package n;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2115I {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C2116J.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
