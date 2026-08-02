package Z4;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface c {
    void restoreState(@NonNull Parcelable parcelable);

    @NonNull
    Parcelable saveState();
}
