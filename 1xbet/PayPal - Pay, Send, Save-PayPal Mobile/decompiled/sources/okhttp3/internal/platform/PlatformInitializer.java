package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Landroidx/startup/Initializer;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lokhttp3/internal/platform/Platform;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlatformInitializer implements androidx.startup.Initializer<okhttp3.internal.platform.Platform> {
    @Override // androidx.startup.Initializer
    public final okhttp3.internal.platform.Platform create(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        okhttp3.internal.platform.PlatformRegistry.INSTANCE.setApplicationContext(context);
        return okhttp3.internal.platform.Platform.INSTANCE.get();
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
