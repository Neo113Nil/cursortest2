package P60;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface g {
    @NotNull
    String a(@NotNull PackageInfo packageInfo);

    ArrayList b(@NotNull String str);

    boolean c(@NotNull PackageInfo packageInfo);

    Intent d(@NotNull String str);

    String e(@NotNull String str);

    ArrayList f(@NotNull String str);

    @NotNull
    List<PackageInfo> g();

    boolean h(@NotNull Intent intent);

    @NotNull
    List<String> i(@NotNull PackageInfo packageInfo);

    @NotNull
    List<String> j(@NotNull Uri uri);

    boolean k(@NotNull String str);

    @NotNull
    ArrayList l(@NotNull ArrayList arrayList);

    @NotNull
    String m(@NotNull PackageInfo packageInfo);
}
