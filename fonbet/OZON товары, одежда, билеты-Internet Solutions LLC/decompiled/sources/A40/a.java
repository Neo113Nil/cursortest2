package A40;

import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;

/* loaded from: classes3.dex */
public interface a extends Parcelable {
    @NotNull
    String getId();

    @NotNull
    CbottomType getType();

    Integer getVersion();
}
