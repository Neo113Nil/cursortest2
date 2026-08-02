package androidx.core.view;

/* loaded from: classes7.dex */
public class ViewStructureCompat {
    private final android.view.ViewStructure Camera2StreamConfigurationMap;

    public static androidx.core.view.ViewStructureCompat toViewStructureCompat(android.view.ViewStructure viewStructure) {
        return new androidx.core.view.ViewStructureCompat(viewStructure);
    }

    public android.view.ViewStructure toViewStructure() {
        return this.Camera2StreamConfigurationMap;
    }

    private ViewStructureCompat(android.view.ViewStructure viewStructure) {
        this.Camera2StreamConfigurationMap = viewStructure;
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap.setText(charSequence);
    }

    public void setClassName(java.lang.String str) {
        this.Camera2StreamConfigurationMap.setClassName(str);
    }

    public void setContentDescription(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap.setContentDescription(charSequence);
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        this.Camera2StreamConfigurationMap.setDimens(i, i2, i3, i4, i5, i6);
    }
}
