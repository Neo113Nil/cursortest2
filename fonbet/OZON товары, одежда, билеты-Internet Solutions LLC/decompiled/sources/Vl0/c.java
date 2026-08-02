package Vl0;

import Za.d;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f32826a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f32827b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f32828c;

    public c(@NotNull Context context, @NotNull String projectId, @NotNull d logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f32826a = context;
        this.f32827b = projectId;
        this.f32828c = logger;
    }
}
