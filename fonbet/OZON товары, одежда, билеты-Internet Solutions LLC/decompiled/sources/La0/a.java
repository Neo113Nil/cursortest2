package La0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Ka0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f16669a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16669a = context;
    }

    @Override // Ka0.a
    public final void invoke() {
        ComponentName component;
        Context context = this.f16669a;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null) {
            return;
        }
        Intent makeRestartActivityTask = Intent.makeRestartActivityTask(component);
        makeRestartActivityTask.setPackage(context.getPackageName());
        context.startActivity(makeRestartActivityTask);
        Runtime.getRuntime().exit(0);
    }
}
