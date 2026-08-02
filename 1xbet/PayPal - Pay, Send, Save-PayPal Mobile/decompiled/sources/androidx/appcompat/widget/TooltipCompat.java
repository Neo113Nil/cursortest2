package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class TooltipCompat {
    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.TooltipCompat.Api26Impl.getHighSpeedVideoSizes(view, charSequence);
    }

    private TooltipCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void getHighSpeedVideoSizes(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }
}
