package K40;

import android.os.Parcelable;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;

/* loaded from: classes3.dex */
public interface a {
    @NotNull
    LinkedHashSet a();

    void c(@NotNull String str, @NotNull String str2, String str3);

    @NotNull
    b creator();

    void e(String str, @NotNull String str2, @NotNull String str3);

    void f(@NotNull String str);

    void g(Parcelable parcelable, @NotNull CbottomType cbottomType, @NotNull String str, String str2);

    @NotNull
    ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a h(String str);

    void i(@NotNull A40.a aVar, @NotNull String str, String str2);
}
