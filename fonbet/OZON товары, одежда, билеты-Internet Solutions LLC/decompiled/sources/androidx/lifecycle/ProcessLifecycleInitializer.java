package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LR4/a;", "Landroidx/lifecycle/J;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements R4.a<J> {
    @Override // R4.a
    @NotNull
    public final List<Class<? extends R4.a<?>>> a() {
        return kotlin.collections.K.f71697a;
    }

    @Override // R4.a
    public final J create(Context context) {
        ProcessLifecycleOwner processLifecycleOwner;
        ProcessLifecycleOwner processLifecycleOwner2;
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a c11 = androidx.startup.a.c(context);
        Intrinsics.checkNotNullExpressionValue(c11, "getInstance(context)");
        if (!c11.e()) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        F.a(context);
        int i11 = ProcessLifecycleOwner.f43231j;
        Intrinsics.checkNotNullParameter(context, "context");
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.h(context);
        processLifecycleOwner2 = ProcessLifecycleOwner.f43230i;
        return processLifecycleOwner2;
    }
}
