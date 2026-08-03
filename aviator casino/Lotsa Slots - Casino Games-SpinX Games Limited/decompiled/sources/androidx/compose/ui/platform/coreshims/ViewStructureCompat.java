package androidx.compose.ui.platform.coreshims;

/* loaded from: classes.dex */
public class ViewStructureCompat {
    private final java.lang.Object mWrappedObj;

    public static androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructureCompat(android.view.ViewStructure viewStructure) {
        return new androidx.compose.ui.platform.coreshims.ViewStructureCompat(viewStructure);
    }

    public android.view.ViewStructure toViewStructure() {
        return (android.view.ViewStructure) this.mWrappedObj;
    }

    private ViewStructureCompat(android.view.ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    public void setText(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.setText((android.view.ViewStructure) this.mWrappedObj, charSequence);
        }
    }

    public void setClassName(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.setClassName((android.view.ViewStructure) this.mWrappedObj, str);
        }
    }

    public void setTextStyle(float f, int i, int i2, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.setTextStyle((android.view.ViewStructure) this.mWrappedObj, f, i, i2, i3);
        }
    }

    public void setContentDescription(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.setContentDescription((android.view.ViewStructure) this.mWrappedObj, charSequence);
        }
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.setDimens((android.view.ViewStructure) this.mWrappedObj, i, i2, i3, i4, i5, i6);
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static void setDimens(android.view.ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void setText(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void setClassName(android.view.ViewStructure viewStructure, java.lang.String str) {
            viewStructure.setClassName(str);
        }

        static void setContentDescription(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void setTextStyle(android.view.ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }
    }
}
