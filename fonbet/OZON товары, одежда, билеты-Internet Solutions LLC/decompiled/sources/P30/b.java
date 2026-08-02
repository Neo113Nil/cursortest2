package P30;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b extends X30.a {
    @NotNull
    SharedPreferences A();

    @NotNull
    O30.b M0();

    @NotNull
    R30.a f();

    @NotNull
    S30.a getApplicationInfoDataSource();

    @NotNull
    SharedPreferences getSharedPreferences();

    @NotNull
    Context h();

    @NotNull
    T30.c j1();

    @NotNull
    Application m1();

    @NotNull
    U30.a r1();
}
