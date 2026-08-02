package V4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
class B extends z {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f27983g = true;

    @Override // V4.z
    @SuppressLint({"NewApi"})
    public void d(int i11, @NonNull View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(i11, view);
        } else if (f27983g) {
            try {
                view.setTransitionVisibility(i11);
            } catch (NoSuchMethodError unused) {
                f27983g = false;
            }
        }
    }
}
