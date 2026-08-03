package androidx.core.hardware.display;

/* loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context context) {
        this.mContext = context;
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context context) {
        return new androidx.core.hardware.display.DisplayManagerCompat(context);
    }

    public android.view.Display getDisplay(int i) {
        return ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplay(i);
    }

    public android.view.Display[] getDisplays() {
        return ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }

    public android.view.Display[] getDisplays(java.lang.String str) {
        return ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }
}
