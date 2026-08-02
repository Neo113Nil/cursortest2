package J0;

import S0.InterfaceC3967k;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class K2 {
    @NotNull
    public static final String a(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.m(AndroidCompositionLocals_androidKt.c());
        Resources resources = ((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getResources();
        return i11 == 0 ? resources.getString(R.string.navigation_menu) : i11 == 1 ? resources.getString(R.string.close_drawer) : i11 == 2 ? resources.getString(R.string.close_sheet) : i11 == 3 ? resources.getString(R.string.default_error_message) : i11 == 4 ? resources.getString(R.string.dropdown_menu) : i11 == 5 ? resources.getString(R.string.range_start) : i11 == 6 ? resources.getString(R.string.range_end) : "";
    }
}
